"""Post-process auto-emitted GPS skeletons into compile-clean Kotlin (idempotent).

Run AFTER copying buildtools/gps_skeleton_out/*.kt into
app/src/main/java/com/ideaworks3d/marmalade/s3eGooglePlayServices/.

Goal: make the 22 skeleton files COMPILE so the native
libs3eGooglePlayServices.so gets non-NULL FindClass/GetMethodID at init
(ending the SIGABRT "jmethodID was NULL" crash). Bodies stay TODO stubs.

All transforms are idempotent: rerunning on already-processed text is a no-op.
"""
import os
import re
import glob

ROOT = "app/src/main/java/com/ideaworks3d/marmalade/s3eGooglePlayServices"

PRIM_DEFAULT = {
    "Int": "0", "Boolean": "false", "Long": "0L", "Short": "0",
    "Byte": "0", "Char": "'\\u0000'", "Float": "0.0f", "Double": "0.0",
}

GMS_PREFIX = "com.google.android.gms."

OVERRIDE_NAMES = {
    "onStart", "onStop", "onCreate", "onActivityResult", "run", "toString",
    "onClick",
    "onSignInFailed", "onSignInSucceeded", "onSignOut",
}

FLATTEN_REWRITES = [
    ("com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper.GameHelperListener",
     "com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_GameHelperListener"),
    ("com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper.SignInFailureReason",
     "com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_SignInFailureReason"),
]

# interface files -> methods that need default bodies so non-overriding
# implementers compile.
DEFAULT_BODY_INTERFACES = {
    "GameHelper_GameHelperListener": {
        "onSignInFailed": None,        # ()V
        "onSignInSucceeded": None,     # ()V
        "onSignOut": None,             # ()V
    },
    "s3eGooglePlayServicesInterface": {
        "onActivityResult": "Boolean", # (IILandroid/content/Intent;)Z
    },
}

# Types in skeleton override signatures that must be made nullable to match
# the LoaderActivitySlave open members they override.
NULLIFY_TYPES = {
    "android.os.Bundle": "android.os.Bundle?",
    "android.content.Intent": "android.content.Intent?",
}

# Kotlin primitive/known-return-type -> no-op default body expression (with
# `return` already implied; for Unit we emit nothing). Used so native callbacks
# into stub bodies don't throw NotImplementedError at runtime.
PRIM_NOOP_EXPR = {
    "Boolean": "return false",
    "Int": "return 0", "Short": "return 0", "Byte": "return 0",
    "Long": "return 0L",
    "Float": "return 0f",
    "Double": "return 0.0",
    "Char": "return '\\u0000'",
}
NOOP_KT_TYPES = set(PRIM_NOOP_EXPR.keys())


def line_is_real_code(line):
    s = line.strip()
    if not s:
        return False
    if s.startswith("//") or s.startswith("/*") or s.startswith("*"):
        return False
    return True


def fix_this_dollar(text):
    return re.sub(r'\bthis\$0\b', 'thisRef0', text)


def fix_flattened_refs(text):
    for old, new in FLATTEN_REWRITES:
        text = text.replace(old, new)
    return text


def fix_raw_generics(text):
    text = re.sub(r'\bjava\.util\.ArrayList\b(?!<)', 'java.util.ArrayList<Any?>', text)
    text = re.sub(r'\bjava\.util\.HashMap\b(?!<)', 'java.util.HashMap<Any?, Any?>', text)
    text = re.sub(r'\bjava\.util\.List\b(?!<)', 'java.util.List<Any?>', text)
    return text


def fix_todo_dollars(text):
    """Escape every unescaped `$` inside TODO("body: ...") strings so Kotlin
    doesn't treat `$ident` as a template. Idempotent: skips already-escaped `\\$`."""
    def repl(m):
        body = m.group(1)
        # turn any `$` not already preceded by `\` into `\$`
        body = re.sub(r'(?<!\\)\$', r'\\$', body)
        return 'TODO("body: ' + body + '")'
    return re.sub(r'TODO\("body: (.*?)"\)', repl, text)


def fix_noop_bodies(text):
    """Replace `return TODO("body: ...")` stub bodies with type-appropriate
    no-op defaults so native callbacks don't throw NotImplementedError at
    runtime. The declared Kotlin return type drives the default:
      Boolean -> false, primitives -> 0/0L/0f, references -> null (return type
      made nullable). Void/comment-only bodies are already no-ops.
    Idempotent.
    """
    # match: `: <RetType> { return TODO("body: ...") }` (single-line body)
    body_re = re.compile(
        r'(\):\s*)([^{}]+?)(\s*\{\s*return\s+TODO\("body:[^"]*"\)\s*\})')
    def repl(m):
        colon_ret, ret_ty, tail = m.groups()
        rt = ret_ty.strip()
        if rt in PRIM_NOOP_EXPR:
            expr = PRIM_NOOP_EXPR[rt]
            return f'{colon_ret}{ret_ty} {{ {expr} }}'
        # `override ... toString(): String` must return a non-null String
        # (cannot nullable-ify; Any.toString(): String). Emit empty string.
        if rt == "String":
            return f'{colon_ret}String {{ return "" }}'
        # reference (object/array) type -> nullable + null
        if rt.endswith("?"):
            nullable_ty = rt
        else:
            nullable_ty = rt + "?"
        # preserve original spacing of ret_ty block by replacing its trimmed form
        return f'{colon_ret}{nullable_ty} {{ return null }}'
    return body_re.sub(repl, text)


def _split_header_supertypes(sup_part):
    """Split a comma-separated supertype list, respecting parentheses
    (e.g. `Foo(), Bar(a, b)`)."""
    sups = []
    depth = 0
    cur = ""
    for ch in sup_part:
        if ch == '(':
            depth += 1
            cur += ch
        elif ch == ')':
            depth -= 1
            cur += ch
        elif ch == ',' and depth == 0:
            sups.append(cur.strip())
            cur = ""
        else:
            cur += ch
    if cur.strip():
        sups.append(cur.strip())
    return sups


def fix_class_headers(text):
    """For each class/interface header line that ends with `{`:
       - drop `com.google.android.gms.*` supertypes (empty stub interfaces;
         implementing them only forces override churn the .so never exercises),
       - if a kept supertype is the only kind requiring a primary ctor and the
         header has no `(`, inject an empty `()` primary ctor.
    Handles the header line possibly spanning a single line only (emitter emits
    single-line headers)."""
    lines = text.splitlines()
    out = []
    header_re = re.compile(
        r'^(\s*)((?:open\s+)?(?:final\s+)?(?:abstract\s+)?'
        r'(?:class|interface|enum class|annotation class)\s+\S+?)\s*:\s*(.*)\{\s*$')
    for line in lines:
        m = header_re.match(line)
        if m:
            indent, head, sup_part = m.groups()
            sups = _split_header_supertypes(sup_part)
            kept = [s for s in sups if not s.startswith(GMS_PREFIX)]
            if '(' not in head:
                head = head + '()'
            if kept:
                out.append(f"{indent}{head} : {', '.join(kept)} {{")
            else:
                out.append(f"{indent}{head} {{")
        else:
            out.append(line)
    return "\n".join(out)


def fix_constructors(text):
    """Drop no-arg `constructor()` and convert `constructor(args)` -> secondary
    `: this()` WHEN a primary `()` ctor already exists on the class header.
    Works anywhere in the body, not only immediately after the header."""
    # find each class header that now has a primary `()`
    lines = text.splitlines()
    out = []
    i = 0
    n = len(lines)
    primary_seen = False
    while i < n:
        line = lines[i]
        hdr = re.match(
            r'^\s*(?:open\s+|final\s+|abstract\s+)?'
            r'(?:class|enum class|annotation class)\s+\S+\([^)]*\)', line)
        if hdr:
            primary_seen = True
        # match a standalone constructor line
        cm = re.match(r'^(\s*)((?:public|protected|private)\s+)?constructor\s*\((.*?)\)\s*(:\s*this\s*\(\s*\)\s*)?\s*$', line)
        if cm and primary_seen and line_is_real_code(line):
            indent, vis, args, deleg = cm.groups()
            vis = vis or ''
            if args.strip() == '':
                # no-arg -> drop (covered by primary)
                i += 1
                continue
            if deleg:
                out.append(line)  # already secondary
            else:
                out.append(f"{indent}{vis}constructor({args}) : this()")
            i += 1
            continue
        out.append(line)
        i += 1
    return "\n".join(out)


def fix_props(text):
    """Initialize uninitialized class/companion properties. Handles
    `@JvmField`, visibility keywords, and `companion object` context."""
    out = []
    for line in text.splitlines():
        if not line_is_real_code(line):
            out.append(line)
            continue
        # match: [indent][@JvmField ][vis ](val|var) name: Type
        m = re.match(
            r'^(\s*)((?:@JvmField\s+)?((?:public|protected|private)\s+)?)?'
            r'(val|var)\s+([A-Za-z_][A-Za-z0-9_]*)\s*:\s*(.+?)\s*$',
            line,
        )
        if m and '=' not in line and '$' not in m.group(5):
            indent, _fullvis, vis, kw, name, ty = m.groups()
            vis = (vis or '').strip()
            vis_prefix = (vis + ' ') if vis else ''
            jvm = '@JvmField ' if (_fullvis and '@JvmField' in _fullvis) else ''
            if ty.endswith("?"):
                init = "= null"
            elif ty in PRIM_DEFAULT:
                init = "= " + PRIM_DEFAULT[ty]
            else:
                init = "= null"
                ty = ty + "?"
            out.append(f"{indent}{jvm}{vis_prefix}{kw} {name}: {ty} {init}")
            continue
        out.append(line)
    return "\n".join(out)


def _strip_override(line):
    return re.sub(r'^(\s*(?:public|protected|private|open|final|abstract)\s+)*override\s+',
                  lambda mm: mm.group(0).replace('override ', ''), line, count=1)


# supertype member signatures we know are overridden: name -> expected param
# count (for arity-gated override). None means "any arity".
OVERRIDE_ARITY = {
    "onStart": 0,           # LoaderActivitySlave.onStart()
    "onStop": 0,            # LoaderActivitySlave.onStop()
    "onCreate": 1,          # (Bundle?)
    "onActivityResult": 3,  # (Int, Int, Intent?)
    "onSignInFailed": 0, "onSignInSucceeded": 0, "onSignOut": 0,
}


def _count_params(linesig):
    # rough param count from `fun name(a: T, b: T)`: count commas + 1 if params present
    m = re.search(r'fun\s+\w+\s*\(([^)]*)\)', linesig)
    if not m:
        return None
    inside = m.group(1).strip()
    if not inside:
        return 0
    return inside.count(',') + 1


def fix_override_and_params(text):
    """Add `override` to genuine supertype overrides and make override-signature
    types nullable to match LoaderActivitySlave open members. Strip `override`
    from interface declarations and from methods that override nothing."""
    lines = text.splitlines()
    out = []
    in_interface = False
    class_has_super_re = re.compile(
        r'^\s*(?:open\s+|final\s+|abstract\s+)?'
        r'(?:class|enum class|annotation class)\s+\S+\s*(?:\([^)]*\))?\s*:\s*\S')
    iface_open_re = re.compile(r'^\s*(?:open\s+)?interface\s+\S+')
    class_curr_has_super = False
    for line in lines:
        s = line.strip()
        if iface_open_re.match(line) and '{' in line:
            in_interface = True
            out.append(line)
            continue
        if re.match(r'^\s*(?:open\s+|final\s+|abstract\s+)?(?:class|enum class|annotation class)\s+', line):
            in_interface = False
            class_curr_has_super = bool(class_has_super_re.match(line))
            out.append(line)
            continue
        meth_re = re.compile(
            r'^(\s*)((?:@Override\s+)?((?:public|protected|private|open|final|abstract)\s+)*'
            r'(override\s+)?)(fun\s+([A-Za-z_][A-Za-z0-9_]*)\s*\()')
        m = meth_re.match(line)
        if m and line_is_real_code(line):
            indent, _pre, _viskv, has_override, _funk, name = m.groups()
            arity = _count_params(line)
            expected = OVERRIDE_ARITY.get(name)
            want_override = (
                not in_interface
                and name in OVERRIDE_NAMES
                and class_curr_has_super
                and (expected is None or arity == expected)
            )
            if in_interface and has_override:
                line = _strip_override(line)
            elif in_interface:
                pass
            elif want_override and not has_override:
                line = f"{indent}override {line.lstrip()}"
            # nullify known override param types (only when actually overriding)
            if want_override:
                for nt, nn in NULLIFY_TYPES.items():
                    line = re.sub(r':\s*' + re.escape(nt) + r'(?=[),])',
                                  ': ' + nn, line)
            # toString overrides Any unconditionally
            if not in_interface and name == "toString" and not has_override:
                line = f"{indent}override {line.lstrip()}"
            # if override was wrongly present (e.g. GameHelper no super) strip it
            if not in_interface and has_override and not want_override and name in OVERRIDE_NAMES:
                line = _strip_override(line)
        out.append(line)
    return "\n".join(out)


def fix_interface_default_bodies(text, fname):
    """Give named interface methods default empty bodies, and nullify any
    platform-type params so implementers can declare nullable overrides."""
    if fname not in DEFAULT_BODY_INTERFACES:
        return text
    for nt, nn in NULLIFY_TYPES.items():
        text = re.sub(r':\s*' + re.escape(nt) + r'(?=[),])', ': ' + nn, text)
    methods = DEFAULT_BODY_INTERFACES[fname]
    for mname, retty in methods.items():
        if retty is None:
            # `fun onX()` -> `fun onX() {}`, also `: Unit` variants
            text = re.sub(
                r'(public\s+fun\s+' + re.escape(mname) + r'\(\s*\))\s*$',
                r'\1 {}',
                text,
                flags=re.MULTILINE,
            )
        else:
            # boolean-returning: `(...) -> Boolean = false`
            text = re.sub(
                r'(public\s+fun\s+' + re.escape(mname) + r'\([^)]*\))\s*:\s*' + re.escape(retty) + r'\s*$',
                r'\1: ' + retty + ' = false',
                text,
                flags=re.MULTILINE,
            )
    return text


def process_file(path):
    fname = os.path.basename(path)[:-3]  # strip .kt
    with open(path, encoding="utf-8") as f:
        text = f.read()
    new = text
    new = fix_this_dollar(new)
    new = fix_flattened_refs(new)
    new = fix_class_headers(new)
    new = fix_constructors(new)
    new = fix_raw_generics(new)
    new = fix_props(new)
    new = fix_todo_dollars(new)
    new = fix_noop_bodies(new)
    new = fix_override_and_params(new)
    new = fix_interface_default_bodies(new, fname)
    if new != text:
        with open(path, "w", encoding="utf-8") as f:
            f.write(new)


def main():
    for path in glob.glob(os.path.join(ROOT, "*.kt")):
        process_file(path)
    print("done")


if __name__ == "__main__":
    main()
