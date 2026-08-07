"""Convert javap(-p -c -s -constants) text dumps into Kotlin skeleton sources.

Usage:
    python smali_to_kt.py <decoded_dir> <output_java_dir> [<decoded_dir2> ...]

For each .txt under <decoded_dir> (produced by decompile_jar.py), parse the
javap header, fields, and method descriptors, then emit a Kotlin file at
<output_java_dir>/<package_path>/<ClassName>.kt that mirrors the class
shape exactly:

  - package + class/interface + supertype + implements
  - fields with @JvmField for public static, internal/Public where needed
  - external fun for native methods (preserves the JVM descriptor)
  - for non-native methods, emit a stubbed body marked `TODO(\"body: <descriptor>\")`
    so the file compiles structurally even before bodies are filled in
  - inner classes named `Outer$Inner` are emitted as nested `class Inner`
    declared inside the Outer class file
  - synthetic access$ methods are skipped (Kotlin does not need them)

Empty bodies are intentional — see HOWTO_BUILD.md. The descriptor captured
in the TODO comment lets check_sig.py and your manual filling-in verify
the JVM ABI matches what the native libs in jniLibs/ resolve.
"""
import os
import sys
import re
import glob


# ----- JVM descriptor <-> Kotlin type mapping -----

_PRIM = {
    'I': 'Int', 'Z': 'Boolean', 'B': 'Byte', 'S': 'Short', 'J': 'Long',
    'F': 'Float', 'D': 'Double', 'C': 'Char', 'V': 'Unit',
}

def desc_to_kt(desc: str) -> str:
    """Convert a JVM type descriptor like 'Ljava/lang/String;', '[I', 'V' to Kotlin."""
    if not desc:
        return 'Any'
    if desc in _PRIM:
        return _PRIM[desc]
    if desc.startswith('['):
        return 'Array<' + desc_to_kt(desc[1:]) + '>'
    if desc.startswith('L') and desc.endswith(';'):
        cls = desc[1:-1].replace('/', '.')
        # Strip the java.lang.* prefix — Kotlin imports them by default.
        if cls.startswith('java.lang.') and '.' not in cls[len('java.lang.'):]:
            cls = cls[len('java.lang.'):]
        return cls
    # last resort
    return desc.replace('/', '.')


def parse_descriptor(desc: str):
    """Parse '(II)V' or '(Ljava/lang/String;[I)V' into ([arg_descs], ret_desc)."""
    assert desc.startswith('(') , desc
    close = desc.index(')')
    args = desc[1:close]
    ret = desc[close + 1:]
    # split args into list of descriptors: each is either a primitive (one char),
    # an array (starts with '['), or L...;
    out = []
    i = 0
    while i < len(args):
        c = args[i]
        if c == '[':
            j = i + 1
            while args[j] == '[':
                j += 1
            if args[j] == 'L':
                end = args.index(';', j)
                out.append(args[i:end + 1])
                i = end + 1
            else:
                out.append(args[i:j + 1])
                i = j + 1
        elif c == 'L':
            end = args.index(';', i)
            out.append(args[i:end + 1])
            i = end + 1
        else:
            out.append(c)
            i += 1
    return out, ret


def kotlin_param_list(arg_descs):
    out = []
    for idx, d in enumerate(arg_descs):
        out.append(f"p{idx}: {desc_to_kt(d)}")
    return ", ".join(out)


# ----- javap text parsing -----

_HEADER_RE = re.compile(
    r'^(?P<flags>(?:public |private |protected |static |final |abstract |synchronized |native |interface |enum )*)'
    r'(?P<kind>class|interface) (?P<name>[\w.$]+)'
    r'(?: extends (?P<super>[\w.$\[\]<>]+?))?'
    r'(?: implements (?P<ifaces>[\w.$\[\], <>]+?))?'
    r' *\{? *$'
)

_FIELD_RE = re.compile(
    r'^\s+(?P<flags>(?:public |private |protected |static |final |volatile |transient |synthetic |enum )*?)'
    r'(?P<type>[\w.$\[\]<>]+)\s+(?P<name>\w+)\s*;\s*$'
)

# Method line: "  public static void foo(int, int); descriptor: (II)V"
_METHOD_RE = re.compile(
    r'^\s+(?P<flags>(?:public |private |protected |static |final |synchronized |volatile |transient |native |abstract |synthetic |bridge |varargs )*)'
    r'(?P<ret>[\w.$\[\]<>]+)\s+(?P<name>\w+)\((?P<params>[^)]*)\)(?P<throws>.*?);'
    r'(?:\s+descriptor:\s+(?P<desc>\S+))?'
)


def parse_javap_text(text: str):
    """Return dict describing one class."""
    # First non-empty line is "Compiled from ..."
    # Next is the header: "public class X extends Y implements Z {"
    cls = {
        'kind': 'class',
        'name': None,
        'flags': [],
        'super': None,
        'ifaces': [],
        'fields': [],
        'methods': [],
    }
    # normalize double-CR / CRLF shenanigans from javap on Windows
    text_norm = text.replace('\r\n', '\n').replace('\r', '\n')
    lines = text_norm.splitlines()
    header_found = False
    pending_field = None
    pending_method = None
    for line in lines:
        if not header_found:
            m = _HEADER_RE.match(line)
            if m:
                cls['kind'] = m.group('kind')
                cls['name'] = m.group('name')
                cls['flags'] = m.group('flags').split()
                cls['super'] = m.group('super')
                cls['ifaces'] = [s.strip() for s in (m.group('ifaces') or '').split(',') if s.strip()]
                header_found = True
            continue
        # descriptor line — attach to whichever pending item is open
        dm = re.match(r'^\s+descriptor:\s+(\S+)', line)
        if dm:
            if pending_method is not None and not pending_method['descriptor']:
                pending_method['descriptor'] = dm.group(1)
                continue
            if pending_field is not None and not pending_field['desc']:
                pending_field['desc'] = dm.group(1)
                continue
        # Field decl line: "  public static java.lang.String NAME;"
        mf = _FIELD_RE.match(line)
        if mf:
            pending_field = {
                'flags': mf.group('flags').split(),
                'name': mf.group('name'),
                'type': mf.group('type'),
                'desc': '',
            }
            pending_method = None
            cls['fields'].append(pending_field)
            continue
        # method lines: descriptor may be inline on the same line
        mm = _METHOD_RE.match(line)
        if mm:
            name = mm.group('name')
            if name in ('<init>', '<clinit>'):
                continue
            flags = mm.group('flags').split()
            if 'synthetic' in flags:
                continue
            pending_method = {
                'flags': flags,
                'name': name,
                'descriptor': mm.group('desc') or '',
            }
            pending_field = None
            cls['methods'].append(pending_method)
            continue
    return cls


def class_to_fqn_slash(cls):
    return cls['name'].replace('.', '/')


def is_inner_class(fqn_slash: str):
    """LoaderActivity$1 → (outer='LoaderActivity', inner_name='1')."""
    if '$' not in fqn_slash:
        return None
    outer, inner = fqn_slash.rsplit('$', 1)
    return outer, inner


# ----- Kotlin emission -----

def _kt_visibility(flags):
    if 'private' in flags:
        return 'private '
    if 'protected' in flags:
        return 'protected '
    if 'public' in flags:
        return 'public '
    return ''


def _default_init(kt_type: str) -> str:
    if kt_type in ('Int', 'Long', 'Short', 'Byte', 'Char'):
        return ' = 0'
    if kt_type in ('Float', 'Double'):
        return ' = 0.0'
    if kt_type == 'Boolean':
        return ' = false'
    return ' = null!!'


def emit_field(f):
    flags = f['flags']
    is_static = 'static' in flags
    is_final = 'final' in flags
    is_public = 'public' in flags
    is_protected = 'protected' in flags
    kt_type = desc_to_kt(f['desc'])
    name = f['name']
    kw = 'val' if is_final else 'var'
    visibility = _kt_visibility(flags)
    ann = ''
    if is_static and (is_public or is_protected):
        ann = '@JvmField '
    init = _default_init(kt_type) if is_static and is_final else ''
    return f"        {ann}{visibility}{kw} {name}: {kt_type}{init}"


def emit_method(m, indent='    '):
    flags = m['flags']
    name = m['name']
    desc = m['descriptor']
    is_static = 'static' in flags
    is_native = 'native' in flags
    is_abstract = 'abstract' in flags
    visibility = _kt_visibility(flags)
    static = '@JvmStatic ' if is_static else ''
    if is_native:
        try:
            arg_descs, ret_desc = parse_descriptor(desc)
        except Exception:
            arg_descs, ret_desc = [], 'V'
        params = kotlin_param_list(arg_descs)
        ret = desc_to_kt(ret_desc)
        ret_clause = '' if ret == 'Unit' else f": {ret}"
        return f"{indent}{visibility}external {static}fun {name}({params}){ret_clause}"
    try:
        arg_descs, ret_desc = parse_descriptor(desc) if desc else ([], 'V')
    except Exception:
        arg_descs, ret_desc = [], 'V'
    params = kotlin_param_list(arg_descs)
    ret = desc_to_kt(ret_desc)
    ret_clause = '' if ret == 'Unit' else f": {ret}"
    if is_abstract:
        return f"{indent}{visibility}{static}fun {name}({params}){ret_clause}"
    if ret == 'Unit':
        body = f" {{ /* TODO(body): {desc} */ }}"
    else:
        # `TODO(...)` returns Nothing, which is a subtype of everything —
        # so this is type-correct without a trailing return.
        body = f" {{ return TODO(\"body: {desc}\") }}"
    return f"{indent}{visibility}{static}fun {name}({params}){ret_clause}{body}"


def sanitize_simple_name(simple: str) -> str:
    """Replace `$` and leading digit so Kotlin accepts it as an identifier."""
    # $ not allowed in Kotlin identifiers; treat as `_`.
    s = simple.replace('$', '_')
    # Anonymous classes are named "1", "2", ... — prefix with Anon.
    if s and s[0].isdigit():
        s = 'Anon' + s
    return s


def emit_class_file(cls, override_simple_name=None):
    fqn_slash = class_to_fqn_slash(cls)
    pkg_segs = fqn_slash.split('/')
    pkg = '.'.join(pkg_segs[:-1])
    simple = override_simple_name or sanitize_simple_name(pkg_segs[-1])

    is_interface = (cls['kind'] == 'interface')
    extends_clause = ''
    if cls['super'] and cls['super'] not in ('java.lang.Object',):
        super_name = cls['super'].replace('$', '.')
        if is_interface:
            extends_clause = f": {super_name}"
        else:
            extends_clause = f": {super_name}()"
    if cls['ifaces']:
        iface_list = ', '.join(i.replace('$', '.') for i in cls['ifaces'])
        if extends_clause:
            extends_clause += ', ' + iface_list
        else:
            extends_clause = ': ' + iface_list

    inst_fields = [f for f in cls['fields'] if 'static' not in f['flags']]
    static_fields = [f for f in cls['fields'] if 'static' in f['flags']]
    inst_methods = [m for m in cls['methods'] if 'static' not in m['flags']]
    static_methods = [m for m in cls['methods'] if 'static' in m['flags']]

    out = []
    if pkg:
        out.append(f"package {pkg}")
        out.append('')
    out.append(f"// Auto-emitted from javap text dump. See HOWTO_BUILD.md.")
    out.append(f"// {len(cls['fields'])} fields, {len(cls['methods'])} methods.")
    out.append('')
    kind_kw = 'interface' if is_interface else 'open class'
    out.append(f"{kind_kw} {simple}{extends_clause} {{")
    for f in inst_fields:
        out.append(emit_field(f))
    if inst_fields and inst_methods:
        out.append('')
    for m in inst_methods:
        out.append(emit_method(m))
    if static_fields or static_methods:
        out.append('')
        out.append('    companion object {')
        for f in static_fields:
            out.append(emit_field(f))
        if static_fields and static_methods:
            out.append('')
        for m in static_methods:
            out.append(emit_method(m, indent='        '))
        out.append('    }')
    out.append("}")
    out.append('')
    return '\n'.join(out)


def main():
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    decoded_dirs = sys.argv[1:-1]
    out_java = sys.argv[-1]
    seen = {}  # fqn_slash -> cls dict (last writer wins, allows overlay)
    for d in decoded_dirs:
        for txt_path in glob.glob(os.path.join(d, '**', '*.txt'), recursive=True):
            rel = os.path.relpath(txt_path, d)
            fqn_slash = rel[:-len('.txt')].replace(os.sep, '/')
            with open(txt_path, encoding='utf-8', errors='replace') as f:
                text = f.read()
            cls = parse_javap_text(text)
            if not cls['name']:
                continue
            seen[fqn_slash] = cls
    # Emit grouped by outer class (inner classes nest inside their outer)
    # For simplicity, emit every class as its own file (incl. $Inner).
    # Kotlin accepts multiple top-level classes per file; put inner classes
    # in the outer's file when applicable, else standalone.
    paired_inners = {}  # outer_fqn -> list of (inner_name, cls)
    standalone = {}
    for fqn, cls in seen.items():
        outer_inner = is_inner_class(fqn)
        if outer_inner:
            outer, inner = outer_inner
            paired_inners.setdefault(outer, []).append(cls)
        else:
            standalone[fqn] = cls
    # Emit standalone files; fold paired inners into the outer's file
    count = 0
    for fqn, cls in standalone.items():
        if fqn in paired_inners and 'name' in cls:
            pass  # handled below
        out_text = emit_class_file(cls)
        # If outer has inners, append them as nested classes
        # For emission simplicity, write inners as their own files (Kotlin allows)
        pkg_segs = fqn.split('/')
        pkg = '.'.join(pkg_segs[:-1])
        simple = pkg_segs[-1]
        out_path = os.path.join(out_java, *fqn.split('/')) + '.kt'
        os.makedirs(os.path.dirname(out_path), exist_ok=True)
        with open(out_path, 'w', encoding='utf-8') as f:
            f.write(out_text)
        count += 1
    for outer, inners in paired_inners.items():
        # Always emit each inner class as its own top-level file with a unique
        # name prefixed by the outer's sanitized simple name. (Kotlin does not
        # allow two top-level classes of the same name in one file/package;
        # nesting them inside the outer's body would require a reformatting pass
        # that handles indentation and generics — keep it simple and prefix.)
        outer_simple = outer.rsplit('/', 1)[-1]
        outer_sanitized = sanitize_simple_name(outer_simple)
        used_names = set()
        for icls in inners:
            inner_simple_raw = icls['name'].rsplit('$', 1)[-1]
            inner_simple = sanitize_simple_name(inner_simple_raw)
            unique_simple = outer_sanitized + '_' + inner_simple
            # Avoid collisions when multiple anon classes share "Anon1" after sanitization.
            base = unique_simple
            n = 1
            while unique_simple in used_names:
                n += 1
                unique_simple = f"{base}_{n}"
            used_names.add(unique_simple)
            orphan_fqn = '/'.join(outer.split('/')[:-1] + [unique_simple])
            orphan_path = os.path.join(out_java, *orphan_fqn.split('/')) + '.kt'
            os.makedirs(os.path.dirname(orphan_path), exist_ok=True)
            body = emit_class_file(icls, override_simple_name=unique_simple)
            with open(orphan_path, 'w', encoding='utf-8') as f:
                f.write(body)
            count += 1
    print(f"Emitted {count} Kotlin files under {out_java}; "
          f"{len(standalone)} standalone, "
          f"{sum(len(v) for v in paired_inners.values())} nested inners.")


if __name__ == '__main__':
    main()
