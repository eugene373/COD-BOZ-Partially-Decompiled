import re, glob, os

# Re-pointed at Main/ tree
ROOT_KT     = r"C:\Users\Sam\Desktop\code\BOZ\Main\app\src\main\java"
ROOT_DECODED = r"C:\Users\Sam\Desktop\code\BOZ\Main\buildtools\decoded"

# --- Parse Kotlin external fun declarations ---
def kt_type_to_sig(t, pkg=None):
    t = t.strip()
    nullable = t.endswith('?')
    if nullable:
        t = t[:-1].strip()
    arr = ''
    while t.startswith('Array<') and t.endswith('>'):
        t = t[6:-1].strip()
        arr += '['
    prim = {'Int': 'I', 'Boolean': 'Z', 'Byte': 'B', 'Short': 'S', 'Long': 'J',
            'Float': 'F', 'Double': 'D', 'Char': 'C', 'Unit': 'V',
            'String': 'Ljava/lang/String;', 'IntArray': '[I', 'ShortArray': '[S',
            'ByteArray': '[B', 'LongArray': '[J', 'FloatArray': '[F',
            'DoubleArray': '[D', 'BooleanArray': '[Z', 'CharArray': '[C'}
    if t in prim:
        return arr + prim[t]
    name = t.replace('.', '/')
    if '/' not in name and pkg:
        name = pkg.replace('.', '/') + '/' + name
    return arr + 'L' + name + ';'

kt_decls = {}  # (pkg, classname, name) -> (signature, file, line)
for path in glob.glob(os.path.join(ROOT_KT, '**', '*.kt'), recursive=True):
    with open(path, encoding='utf-8') as f:
        lines = f.readlines()
    pkg = None
    for l in lines:
        m = re.match(r'package\s+([\w.]+)', l)
        if m:
            pkg = m.group(1)
            break
    topclass = None
    for l in lines:
        m = re.match(r'(?:open\s+|abstract\s+|sealed\s+|final\s+)?(?:class|object|interface)\s+(\w+)', l)
        if m:
            topclass = m.group(1)
            break
    for i, l in enumerate(lines):
        m = re.search(r'\bexternal\s+fun\s+(\w+)\s*\(([^)]*)\)\s*(?::\s*([^\s]+))?', l)
        if not m:
            continue
        name = m.group(1)
        params = m.group(2)
        ret = (m.group(3) or 'Unit').strip()
        if not params.strip():
            sig = '()V' if ret == 'Unit' else kt_type_to_sig(ret, pkg).replace('V', '')
        else:
            try:
                psigs = []
                for p in params.split(','):
                    p = p.strip()
                    if not p:
                        continue
                    pt = p.split(':', 1)[1].strip()
                    psigs.append(kt_type_to_sig(pt, pkg))
                sig = '(' + ''.join(psigs) + ')' + ('V' if ret == 'Unit' else kt_type_to_sig(ret, pkg))
            except Exception:
                sig = None
        key = (pkg, topclass, name)
        if key in kt_decls and kt_decls[key][0] != sig:
            kt_decls[key] = ('CONFLICT:' + str(sig), path, i + 1)
        else:
            kt_decls.setdefault(key, (sig, path, i + 1))

# --- Parse javap-text native methods ---
javap_natives = {}  # (pkg/class, name) -> list of descriptors
for path in glob.glob(os.path.join(ROOT_DECODED, '**', '*.txt'), recursive=True):
    with open(path, encoding='utf-8', errors='replace') as f:
        text = f.read()
    cm = re.search(r'\bclass\s+([\w/$]+)', text) or re.search(r'\binterface\s+([\w/$]+)', text)
    if not cm:
        continue
    cls_slash = cm.group(1)
    for line in text.splitlines():
        if 'native' not in line:
            continue
        m = re.match(r'\s+(?:public|private|protected|static|final|synchronized|volatile|transient|native|abstract|\s)*\s+([\w$\[\].]+)\s+(\w+)\(([^)]*)\)(\S*)', line)
        if not m:
            continue
        ret_word, name, params, ret_desc = m.group(1), m.group(2), m.group(3), m.group(4)
        pkg_segs = cls_slash.split('/')
        java_pkg = '.'.join(pkg_segs[:-1])
        classname = pkg_segs[-1]
        javap_natives.setdefault((java_pkg, classname, name), []).append('(' + params + ')' + ret_desc)

mismatches = []
missing_kt = []
for (java_pkg, classname, name), sigs in javap_natives.items():
    kt = kt_decls.get((java_pkg, classname, name))
    if not kt:
        missing_kt.append((java_pkg, classname, name, sigs))
        continue
    ktsig, ktpath, ktline = kt
    for s in sigs:
        if ktsig != s:
            mismatches.append((java_pkg, classname, name, s, ktsig, ktpath, ktline))

print("=== NATIVE METHOD SIGNATURE MISMATCHES ===")
for r in mismatches:
    sp = r[5].replace('\\', '/')
    print(f"  {r[0]}.{r[1]}.{r[2]}\n    javap : {r[3]}\n    kotlin: {r[4]}\n    at {sp}:{r[6]}")
print(f"\nTotal mismatches: {len(mismatches)}")
print(f"\n=== NATIVES IN JAVAP WITHOUT MATCHING Kotlin external fun ===: {len(missing_kt)}")
for r in missing_kt[:60]:
    print(f"  {r[0]}.{r[1]}.{r[2]}  javap={r[3]}")
