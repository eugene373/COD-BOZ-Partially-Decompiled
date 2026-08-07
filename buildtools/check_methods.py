import re, glob, os

# Re-pointed at Main/ tree
ROOT_DECODED = r"C:\Users\Sam\Desktop\code\BOZ\Main\buildtools\decoded"
ROOT_KT     = r"C:\Users\Sam\Desktop\code\BOZ\Main\app\src\main\java"

def strings_of(p):
    d = open(p, 'rb').read()
    return set(s.decode() for s in re.findall(rb'[\x20-\x7e]{4,}', d))

so_methods = set()
for p in glob.glob('app/src/main/jniLibs/*/*.so'.replace('/', os.sep), recursive=True) or glob.glob('../Main/app/src/main/jniLibs/*/*.so', recursive=True):
    so_methods |= strings_of(p)

# Collect all Kotlin method names per (pkg, classname)
kt_methods = {}  # fqn_slash -> set(name)
for path in glob.glob(os.path.join(ROOT_KT, '**', '*.kt'), recursive=True):
    txt = open(path, encoding='utf-8', errors='replace').read()
    pkg = ''
    m = re.search(r'^package\s+([\w.]+);?', txt, re.M)
    if m:
        pkg = m.group(1)
    cls = None
    mm = re.search(r'^(?:open |abstract |sealed |internal |final )*(?:class|object|interface) (\w+)', txt, re.M)
    if mm:
        cls = mm.group(1)
    fqn = (pkg.replace('.', '/') + '/' + cls) if (pkg and cls) else cls
    names = set()
    for m in re.finditer(r'\bfun\s+(\w+)\s*\(', txt):
        names.add(m.group(1))
    for m in re.finditer(r'\b(\w+)\s*\([^)]*\)\s*(?:\{|;)', txt):
        names.add(m.group(1))
    kt_methods.setdefault(fqn, set())
    kt_methods[fqn] |= names

# javap-text: classes & their non-native method names
javap_methods = {}
for path in glob.glob(os.path.join(ROOT_DECODED, '**', '*.txt'), recursive=True):
    txt = open(path, encoding='utf-8', errors='replace').read()
    cm = re.search(r'\bclass\s+([\w/$]+)', txt) or re.search(r'\binterface\s+([\w/$]+)', txt)
    if not cm:
        continue
    cls = cm.group(1)
    names = set()
    for line in txt.splitlines():
        # javap method lines look like: "  public void foo(int);"
        mm = re.match(r'\s+(?:public|private|protected|static|final|synchronized|volatile|transient|native|abstract|\s)*\s+[\w$\[\].]+\s+(\w+)\(([^)]*)\)', line)
        if not mm:
            continue
        flags_line = line
        name = mm.group(1)
        if name in ('<init>', '<clinit>'):
            continue
        if 'native' in flags_line:
            continue
        names.add((name, 'static' in flags_line))
    if names:
        javap_methods[cls] = names

print("=== JAVAP (non-native) methods looked up by .so but MISSING in our Kotlin ===")
for cls, names in javap_methods.items():
    kt = kt_methods.get(cls, set())
    missing = []
    for (name, is_static) in sorted(names):
        if name in so_methods and name not in kt:
            missing.append((name, is_static))
    if missing:
        print(f"L{cls}; (kt_present={'YES' if cls in kt_methods and kt_methods[cls] else 'NO-CLASS'})")
        for nm, st in missing:
            print(f"    {'static' if st else 'instance'}  {nm}")
