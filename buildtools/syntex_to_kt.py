"""Convert real smali (.smali) decompiler output into Kotlin skeleton sources.

Usage:
    python syntex_to_kt.py <smali_dir> <output_kotlin_dir> [<smali_dir2> ...]

For every .smali file under each <smali_dir>, parse the smali grammar:

    .class [flags] Lpkg/Class;            # flags: public final abstract interface enum annotation
    .super Lpkg/Super;
    .implements Lpkg/Iface;
    .source "Foo.java"
    # fields, .method/.end method, .annotation blocks, .param, .locals, .throws

and emit a Kotlin file at <output_kotlin_dir>/<pkg_path>/<ClassName>.kt that
mirrors the *declared shape* of the class:

  - package + class/interface/enum/annotation-class + supertype + implements
  - fields (with @JvmField for public/protected static, val/var, primitive defaults)
  - external fun for native methods (preserves the JVM descriptor -> ABI)
  - @JvmStatic for static methods
  - abstract fun for abstract/interface methods (no body)
  - non-native, non-abstract methods get a `TODO("body")` stub so the file
    compiles structurally, AND the original smali instruction body is appended
    as a /* */ comment block so an operator/agent can fill the Kotlin body
    from the real bytecode later. Instruction-level smali->Kotlin control-flow
    lifting is intentionally NOT attempted here (it is a large separate
    problem); the goal is structurally-correct skeletons with real signatures
    plus the body reference.
  - inner classes (Outer$Inner) are emitted as standalone files prefixed with
    the sanitized outer name (Kotlin allows this) — same convention as the
    sibling smali_to_kt.py javap emitter.
  - synthetic access$NNN methods are skipped (Kotlin needs them not).
  - primitive arrays become IntArray/ShortArray/ByteArray etc. (NOT Array<Int>),
    matching the JNI ABI requirement documented for this project.

The descriptor captured in the TODO comment lets verification scripts and
manual filling confirm the JVM ABI matches what the native libs in jniLibs/
resolve.
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

_KT_PRIM_DEFAULT = {
    'Int': '0', 'Long': '0L', 'Short': '0', 'Byte': '0', 'Char': "'\\u0000'",
    'Float': '0.0f', 'Double': '0.0', 'Boolean': 'false',
}


def desc_to_kt(desc: str) -> str:
    """Convert a JVM type descriptor ('Ljava/lang/String;', '[I', 'V') to Kotlin."""
    if not desc:
        return 'Any'
    if desc in _PRIM:
        return _PRIM[desc]
    if desc.startswith('['):
        inner = desc[1:]
        if inner in _PRIM:
            return _PRIM[inner] + 'Array'
        return 'Array<' + desc_to_kt(inner) + '>'
    if desc.startswith('L') and desc.endswith(';'):
        cls = desc[1:-1].replace('/', '.').replace('$', '.')
        if cls.startswith('java.lang.') and '.' not in cls[len('java.lang.'):]:
            cls = cls[len('java.lang.'):]
        return cls
    return desc.replace('/', '.')


def parse_descriptor(desc: str):
    """Parse '(II)V' / '(Ljava/lang/String;[I)V' into (list_of_arg_descs, ret_desc)."""
    assert desc.startswith('('), desc
    close = desc.index(')')
    args = desc[1:close]
    ret = desc[close + 1:]
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


def kotlin_param_list(arg_descs, param_names=None):
    """Build 'p0: Int, p1: String' (or with real names if param_names given)."""
    out = []
    for idx, d in enumerate(arg_descs):
        nm = (param_names[idx] if param_names and idx < len(param_names) else f"p{idx}")
        out.append(f"{nm}: {desc_to_kt(d)}")
    return ", ".join(out)


# ----- smali lexing / parsing -----

_TYPE_RE = re.compile(r'^L[\w$/\.\-]+;|\['  # used only for sanity
                       )
_CLASS_RE = re.compile(
    r'^\.class\s+(?P<flags>(?:public |private |protected |static |final |abstract |interface |enum |annotation |synthetic )*)'
    r'(?P<type>L[\w$/\.\-]+;)\s*$'
)
_FIELD_RE = re.compile(
    r'^\.field\s+(?P<flags>(?:public |private |protected |static |final |volatile |transient |synthetic |enum )*)'
    r'(?P<name>[\w$]+)'
    r':(?P<type>L[\w$/\.\-;]+|\[?(?:I|Z|B|S|J|F|D|C)|\[[\w$/\.\-;]+)'
    r'\s*(?:=\s*(?P<value>.*))?\s*$'
)
_METHOD_RE = re.compile(
    r'^\.method\s+(?P<flags>(?:public |private |protected |static |final |synchronized |volatile |transient |native |abstract |synthetic |bridge |varargs |constructor )*)'
    r'(?P<name>[\w$<>]+)\((?P<params>[^)]*)\)(?P<ret>L[\w$/\.\-;]+|\[?(?:I|Z|B|S|J|F|D|C|V)|\[[\w$/\.\-;]+)\s*$'
)
_PARAM_RE = re.compile(r'^\.param\s+(?P<reg>\w+)\s*,\s*"(?P<name>[^"]*)"\s*')     # .param p1, "name" # Ty
_PARAM_RE_BARE = re.compile(r'^\.param\s+(?P<reg>\w+)')                            # .param p1      (no name — type on next lines)
_ANNO_SIG_RE = re.compile(r'Ldalvik/annotation/Signature;')
_THROWS_RE = re.compile(r'^\.throws\s+(?P<type>L[\w$/\.\-]+;)\s*$')


def _smali_type_to_desc(tok: str) -> str:
    """'Ljava/lang/String;' -> 'Ljava/lang/String;'; '[I' -> '[I'; 'I' -> 'I'."""
    return tok


def _parse_class_header(line):
    m = _CLASS_RE.match(line)
    if not m:
        return None
    flags = m.group('flags').split()
    type_desc = m.group('type')          # Lpkg/Class;
    fqn_slash = type_desc[1:-1]          # pkg/Class  (may contain $)
    return {'flags': flags, 'fqn_slash': fqn_slash, 'super': None,
            'ifaces': [], 'source': None, 'fields': [], 'methods': [],
            'inner_name': None, 'enclosing': None, 'member_classes': []}


def parse_smali_text(text: str):
    """Return a dict describing one class, or None if unparseable."""
    text_norm = text.replace('\r\n', '\n').replace('\r', '\n')
    lines = text_norm.splitlines()
    cls = None
    i = 0
    n = len(lines)
    # find header
    while i < n:
        line = lines[i]
        h = _parse_class_header(line)
        if h:
            cls = h
            i += 1
            break
        i += 1
    if cls is None:
        return None
    is_enum = 'enum' in cls['flags']
    is_interface = 'interface' in cls['flags']
    is_annotation = 'annotation' in cls['flags']
    # Walk the rest linearly. Several sections: .super, .implements, .source,
    # .annotation blocks (class level), # fields (with nested .annotation),
    # # direct methods / # virtual methods containing .method/.end method.
    while i < n:
        line = lines[i].rstrip()
        stripped = line.strip()
        if not stripped or stripped.startswith('#'):
            i += 1
            continue
        if stripped.startswith('.super '):
            mm = re.match(r'\.super\s+(L[\w$/\.\-]+;)\s*$', stripped)
            if mm:
                cls['super'] = mm.group(1)
            i += 1
            continue
        if stripped.startswith('.implements '):
            mm = re.match(r'\.implements\s+(L[\w$/\.\-]+;)\s*$', stripped)
            if mm:
                cls['ifaces'].append(mm.group(1))
            i += 1
            continue
        if stripped.startswith('.source '):
            mm = re.match(r'\.source\s+"(.*)"\s*$', stripped)
            if mm:
                cls['source'] = mm.group(1)
            i += 1
            continue
        if stripped.startswith('.field '):
            fm = _FIELD_RE.match(stripped)
            if fm:
                field = {
                    'flags': fm.group('flags').split(),
                    'name': fm.group('name'),
                    'type': _smali_type_to_desc(fm.group('type')),
                    'value': (fm.group('value') or '').strip() or None,
                    'signature': None,
                }
                i += 1
                # consume nested .annotation Signature (generics) for the field
                if i < n and lines[i].strip().startswith('.annotation'):
                    i, sig = _consume_annotation_block(lines, i)
                    if sig is not None:
                        field['signature'] = sig
                cls['fields'].append(field)
                continue
            i += 1
            continue
        if stripped.startswith('.method '):
            mm = _METHOD_RE.match(stripped)
            if mm:
                method, i = _parse_method(lines, i, mm)
                if method:
                    cls['methods'].append(method)
                continue
            i += 1
            continue
        if stripped.startswith('.annotation'):
            i, sig = _consume_annotation_block(lines, i)
            # signature on *class* -> generic class params; flattened (best-effort)
            if sig is not None:
                cls.setdefault('signature', sig)
            # MemberClasses / InnerClass / EnclosingMethod are read inside _consume_annotation_block via side info
            continue
        i += 1
    # Post-process: detect inner-name / enclosing from dalvik annotations (parsed as raw)
    _augment_inner_info(cls, lines)
    return cls


def _consume_annotation_block(lines, i):
    """Consume one .annotation ... .end annotation block starting at lines[i].
    Returns (new_i, signature_string_or_None). Also extracts InnerClass name /
    EnclosingMethod where present via global side effects passed back as a dict
    via a returned extras map — but to keep the API simple we just return the
    signature and let the caller re-scan for InnerClass/EnclosingMethod/MemberClasses.
    """
    n = len(lines)
    # first line: .annotation <visibility> <type>
    first = lines[i].strip()
    type_match = re.match(r'\.annotation\s+\S+\s+(L[\w$/\.\-;]+)\s*$', first)
    anno_type = type_match.group(1) if type_match else None
    i += 1
    is_signature = (anno_type == 'Ldalvik/annotation/Signature;')
    sig_lines = []
    depth = 1
    while i < n and depth > 0:
        s = lines[i].strip()
        if s.startswith('.annotation'):
            depth += 1
        elif s == '.end annotation':
            depth -= 1
            if depth == 0:
                i += 1
                break
        if is_signature and s not in ('.end annotation',):
            sig_lines.append(s)
        i += 1
    sig = None
    if is_signature and sig_lines:
        joined = ' '.join(sig_lines)
        tokens = re.findall(r'L[\w$/\.\-;]+|\[[\w$/\.\-;]+|[<>]|:', joined)
        sig = joined
    return i, sig


def _parse_method(lines, i, mm):
    """Parse one .method ... .end method. Returns (method_dict, next_i)."""
    n = len(lines)
    flags = mm.group('flags').split()
    name = mm.group('name')
    params_desc = mm.group('params')
    ret_desc = mm.group('ret')
    descriptor = f"({params_desc}){ret_desc}"
    method = {
        'flags': flags,
        'name': name,
        'descriptor': descriptor,
        'param_names': None,
        'throws': [],
        'body_lines': [],
        'is_native': 'native' in flags,
        'is_abstract': 'abstract' in flags,
    }
    i += 1
    # collect .param names (mapping reg -> name), .throws, until .end method
    reg_to_name = {}
    while i < n:
        s = lines[i].strip()
        if s == '.end method':
            i += 1
            break
        if s.startswith('.param '):
            pm = _PARAM_RE.match(s)
            if pm:
                reg_to_name[pm.group('reg')] = pm.group('name')
                i += 1
                # skip sub-annotation lines (e.g. .annotation system ...)
                while i < n and lines[i].strip().startswith('.annotation'):
                    i, _ = _consume_annotation_block(lines, i)
                continue
            pb = _PARAM_RE_BARE.match(s)
            if pb:
                # .param p1   then type lines + maybe .line "name"
                # smali sometimes puts the name in a subsequent .line; best-effort skip
                i += 1
                while i < n and lines[i].strip().startswith('.annotation'):
                    i, _ = _consume_annotation_block(lines, i)
                continue
        if s.startswith('.throws'):
            tm = _THROWS_RE.match(s)
            if tm:
                method['throws'].append(tm.group('type'))
            i += 1
            continue
        method['body_lines'].append(lines[i].rstrip())
        i += 1
    # map param names by ordinal of register appearance in descriptor order is not
    # possible from reg names alone (p0..pk for instance; v0.. for static). We use
    # pN ordering: parameter registers are the LAST ones; but smali uses p0=THIS
    # for instance methods and p0=arg0 for static. We approximate by sorting regs
    # and assigning in order — good enough for a skeleton comment.
    if reg_to_name:
        ordered = [reg_to_name[r] for r in sorted(reg_to_name,
                                                  key=lambda r: (len(r), r))]
        method['param_names'] = ordered
    return method, i


def _augment_inner_info(cls, lines):
    """Re-scan class-level annotations for InnerClass name, EnclosingMethod,
    and MemberClasses (to populate cls['inner_name']/['enclosing']/['member_classes'])."""
    pat_class = re.compile(r'\.annotation\s+(?:static\s+)?(?:system|runtime|build)\s+Ldalvik/annotation/(InnerClass|EnclosingMethod|MemberClasses);')
    text = "\n".join(lines)
    # InnerClass name
    m = re.search(r'Ldalvik/annotation/InnerClass;\s*\n\s*name\s*=\s*"([^"]*)"', text)
    if m:
        cls['inner_name'] = m.group(1)
    m = re.search(r'Ldalvik/annotation/EnclosingMethod;\s*\n\s*value\s*=\s*(L[\w$/\.\-]+;)->([\w$<>]+)\(', text)
    if m:
        cls['enclosing'] = m.group(1)[1:-1]   # pkg/Outer
    # MemberClasses list
    mm = re.search(r'Ldalvik/annotation/MemberClasses;\s*\n\s*value\s*=\s*\{([^}]*)\}', text)
    if mm:
        members = re.findall(r'L[\w$/\.\-]+;', mm.group(1))
        cls['member_classes'] = [m2[1:-1] for m2 in members]


# ----- Kotlin emission -----

def _outer_simple(fqn_slash):
    return fqn_slash.rsplit('/', 1)[-1]


def sanitize_simple_name(simple):
    s = simple.replace('$', '_')
    if s and s[0].isdigit():
        s = 'Anon' + s
    return s


def kt_visibility(flags):
    if 'private' in flags:
        return 'private '
    if 'protected' in flags:
        return 'protected '
    if 'public' in flags:
        return 'public '
    return ''


def default_init(kt_type):
    if kt_type in _KT_PRIM_DEFAULT:
        return ' = ' + _KT_PRIM_DEFAULT[kt_type]
    return ' = null!!'


def _smali_value_to_kt(raw, kt_type):
    """Best-effort: turn a smali `= value` literal into a Kotlin initializer."""
    if raw is None:
        return None
    v = raw.strip()
    if kt_type == 'Boolean':
        if v == '0x1' or v == '1' or v == 'true':
            return ' = true'
        if v == '0x0' or v == '0' or v == 'false':
            return ' = false'
    if v in ('0x1', '1') and kt_type == 'Boolean':
        return ' = true'
    # numeric hex or dec literal — pass through, mapping Kotlin suffixes
    if v.startswith('0x') or v.lstrip('+-').isdigit():
        if kt_type == 'Long' and not v.endswith('L'):
            return ' = ' + v + 'L'
        if kt_type == 'Float':
            return ' = ' + v + 'f'
        return ' = ' + v
    # string literal "..."
    if v.startswith('"') and v.endswith('"'):
        return ' = ' + v
    return None


def emit_field(f, in_companion):
    flags = f['flags']
    is_static = 'static' in flags
    is_final = 'final' in flags
    is_public = 'public' in flags
    is_protected = 'protected' in flags
    kt_type = desc_to_kt(f['type'])
    name = f['name']
    kw = 'val' if is_final else 'var'
    visibility = kt_visibility(flags)
    ann = ''
    if is_static and (is_public or is_protected):
        ann = '@JvmField '
    init = ''
    if is_static and is_final:
        lit = _smali_value_to_kt(f.get('value'), kt_type)
        if lit is not None:
            init = lit
        else:
            init = default_init(kt_type)
    return f"    {ann}{visibility}{kw} {name}: {kt_type}{init}"


def emit_method(m, in_companion):
    flags = m['flags']
    name = m['name']
    desc = m['descriptor']
    is_static = 'static' in flags
    is_native = m['is_native']
    is_abstract = m['is_abstract']
    visibility = kt_visibility(flags)
    static = '@JvmStatic ' if is_static else ''
    try:
        arg_descs, ret_desc = parse_descriptor(desc)
    except Exception:
        arg_descs, ret_desc = [], 'V'
    params = kotlin_param_list(arg_descs, m.get('param_names'))
    ret = desc_to_kt(ret_desc)
    ret_clause = '' if ret == 'Unit' else f": {ret}"
    # ctor: '<init>' maps to constructor()
    if name == '<init>':
        return f"    {visibility}constructor({params})"
    if name == '<clinit>':
        return None  # static initializer — fold into companion init? skip; bodies TODO'd separately
    # Kotlin identifier sanity: keep original name (smali names are JVM identifiers)
    kt_name = name
    if is_native:
        return f"    {visibility}external {static}fun {kt_name}({params}){ret_clause}"
    if is_abstract:
        return f"    {visibility}{static}fun {kt_name}({params}){ret_clause}"
    if ret == 'Unit':
        body = " { /* TODO(body): %s */ }" % desc
    else:
        body = " { return TODO(\"body: %s\") }" % desc
    line = f"    {visibility}{static}fun {kt_name}({params}){ret_clause}{body}"
    # attach body lines as a trailing comment block for reference
    body_lines = [b for b in m['body_lines']
                  if b.strip() and not b.strip().startswith('.prologue')
                  and not b.strip().startswith('.line ')]
    if body_lines:
        cmt = "\n".join("    //     " + b for b in body_lines)
        line = line + "\n" + "    /*\n" + cmt + "\n    */"
    return line


def emit_class_file(cls, override_simple_name=None):
    fqn_slash = cls['fqn_slash']
    pkg_segs = fqn_slash.split('/')
    pkg = '.'.join(pkg_segs[:-1]) if len(pkg_segs) > 1 else ''
    simple = override_simple_name or sanitize_simple_name(pkg_segs[-1])
    flags = cls['flags']
    is_interface = 'interface' in flags
    is_enum = 'enum' in flags
    is_annotation = 'annotation' in flags
    is_final = 'final' in flags
    # extends clause
    extends_clause = ''
    super_desc = cls['super']
    # java.lang.Object super is implicit in Kotlin; skip
    if super_desc and super_desc != 'Ljava/lang/Object;':
        super_name = desc_to_kt(super_desc)
        if is_enum:
            # Kotlin enums don't extend a class; the smali super is java.lang.Enum.
            if super_desc == 'Ljava/lang/Enum;':
                pass
            else:
                extends_clause = f": {super_name}()"
        elif is_interface:
            extends_clause = f": {super_name}" if super_desc != 'Ljava/lang/Enum;' else ''
        elif is_annotation:
            pass  # : Annotation handled below via implements
        else:
            extends_clause = f": {super_name}()"
    # implements -> for class/enum; for interface they're extends
    iface_list = [desc_to_kt(i) for i in cls['ifaces']
                  if not (is_annotation and i == 'Ljava/lang/annotation/Annotation;')]
    if is_annotation:
        # emit as a normal class implementing Annotation (best-effort skeleton)
        pass
    if iface_list:
        if extends_clause:
            extends_clause += ', ' + ', '.join(iface_list)
        else:
            extends_clause = ': ' + ', '.join(iface_list)

    inst_fields = [f for f in cls['fields'] if 'static' not in f['flags']]
    static_fields = [f for f in cls['fields'] if 'static' in f['flags']
                     and not f['name'].startswith('$VALUES')
                     and not f['name'].startswith('synthetic $')]
    inst_methods = [m for m in cls['methods'] if 'static' not in m['flags']
                    and not (m['name'].startswith('access$') and 'synthetic' in m['flags'])]
    static_methods = [m for m in cls['methods'] if 'static' in m['flags']
                      and m['name'] != '<clinit>'
                      and not (m['name'].startswith('access$') and 'synthetic' in m['flags'])]

    # enum entries: derive from public static final enum fields whose type == own class
    enum_entries = []
    if is_enum:
        own_fqn = 'L' + fqn_slash + ';'
        enum_static_fields = []
        for f in list(static_fields):
            if 'enum' in f['flags'] and f['type'] == own_fqn:
                enum_entries.append(f['name'])
                static_fields.remove(f)

    out = []
    if pkg:
        out.append(f"package {pkg}")
        out.append('')
    src = cls.get('source') or ''
    out.append(f"// Auto-emitted from smali{(' source: ' + src) if src else ''}.")
    out.append(f"// {len(cls['fields'])} fields, {len(cls['methods'])} methods.")
    out.append('')
    if is_enum:
        # Emit a Kotlin-valid enum skeleton. Kotlin enums require each entry to
        # supply constructor args. We don't decode per-entry args from <clinit>
        # (that requires interpreting the static initializer bytecode), so we
        # emit a no-arg enum and document the real Java constructor signature +
        # instance fields as a comment block. valueOf()/values() (synthetic)
        # are emitted in a companion object as reference stubs.
        real_ctor = None
        for m in list(inst_methods):
            if m['name'] == '<init>':
                real_ctor = m
                inst_methods.remove(m)
                break
        ctor_comment = ''
        if real_ctor is not None:
            try:
                arg_descs, ret_desc = parse_descriptor(real_ctor['descriptor'])
            except Exception:
                arg_descs = []
            real_args = arg_descs[2:] if len(arg_descs) >= 2 else arg_descs
            pn = real_ctor.get('param_names')
            if pn:
                pn = pn[2:] if len(pn) >= 2 else pn
            ctor_comment = "    // real Java ctor (after implicit name,ordinal): (" + \
                kotlin_param_list(real_args, pn) + ")"
        out.append(f"enum class {simple} {{")
        for e in enum_entries:
            out.append(f"    {e},")
        out.append("    ;")
        if ctor_comment:
            out.append(ctor_comment)
        if inst_fields:
            out.append("    // instance fields (declare as constructor params or properties):")
            for f in inst_fields:
                out.append("    //   " + emit_field(f, False).strip())
        if inst_methods:
            out.append('')
            for m in inst_methods:
                line = emit_method(m, False)
                if line:
                    out.append(line)
                    out.append('')
        if static_methods:
            out.append('    companion object {')
            for m in static_methods:
                line = emit_method(m, True)
                if line:
                    out.append(line)
                    out.append('')
            out.append('    }')
        out.append("}")
        out.append('')
        return '\n'.join(out)

    if is_annotation:
        out.append(f"annotation class {simple}{extends_clause} {{")
    elif is_interface:
        out.append(f"interface {simple}{extends_clause} {{")
    else:
        kw = 'open class' if (not is_final) else 'class'
        out.append(f"{kw} {simple}{extends_clause} {{")

    for f in inst_fields:
        out.append(emit_field(f, False))
    if inst_fields and inst_methods:
        out.append('')
    for m in inst_methods:
        line = emit_method(m, False)
        if line:
            out.append(line)
            out.append('')
    if static_fields or static_methods:
        out.append('    companion object {')
        for f in static_fields:
            out.append(emit_field(f, True))
        if static_fields and static_methods:
            out.append('')
        for m in static_methods:
            line = emit_method(m, True)
            if line:
                out.append(line)
                out.append('')
        out.append('    }')
    out.append("}")
    out.append('')
    return '\n'.join(out)


def main():
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    smali_dirs = sys.argv[1:-1]
    out_kt = sys.argv[-1]
    seen = {}  # fqn_slash -> cls dict
    for d in smali_dirs:
        for smali_path in glob.glob(os.path.join(d, '**', '*.smali'), recursive=True):
            rel = os.path.relpath(smali_path, d)
            fqn_slash = rel[:-len('.smali')].replace(os.sep, '/')
            try:
                with open(smali_path, encoding='utf-8', errors='replace') as f:
                    text = f.read()
            except Exception as e:
                print(f"  ! cannot read {smali_path}: {e}", file=sys.stderr)
                continue
            cls = parse_smali_text(text)
            if cls is None:
                continue
            seen[fqn_slash] = cls

    # Emit. Inner classes (containing '$') become standalone files prefixed
    # with the sanitized outer simple name, identical convention to the
    # sibling javap emitter.
    count = 0
    for fqn, cls in seen.items():
        pkg_segs = fqn.split('/')
        simple_raw = pkg_segs[-1]
        if '$' in simple_raw:
            outer_part, inner_part = simple_raw.rsplit('$', 1)
            outer_simple = sanitize_simple_name(outer_part)
            inner_simple = sanitize_simple_name(inner_part)
            unique_simple = outer_simple + '_' + inner_simple
            pkg_segs_out = pkg_segs[:-1] + [unique_simple]
        else:
            pkg_segs_out = pkg_segs
            unique_simple = sanitize_simple_name(simple_raw)
        out_text = emit_class_file(cls, override_simple_name=unique_simple)
        out_path = os.path.join(out_kt, *pkg_segs_out) + '.kt'
        os.makedirs(os.path.dirname(out_path), exist_ok=True)
        with open(out_path, 'w', encoding='utf-8') as f:
            f.write(out_text)
        count += 1
    print(f"Emitted {count} Kotlin files under {out_kt} (from {len(seen)} smali classes).")


if __name__ == '__main__':
    main()
