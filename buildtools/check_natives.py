import os, re, glob

# Re-pointed at Main/ tree
ROOT_DECODED = r"C:\Users\Sam\Desktop\code\BOZ\Main\buildtools\decoded"
ROOT_KT    = r"C:\Users\Sam\Desktop\code\BOZ\Main\app\src\main\java"

def strings_of(p):
    d = open(p, 'rb').read()
    return set(s.decode() for s in re.findall(rb'[\x20-\x7e]{4,}', d))

so_methods = set()
for p in glob.glob('app/src/main/jniLibs/*/*.so'.replace('/', os.sep), recursive=True) or glob.glob('../Main/app/src/main/jniLibs/*/*.so', recursive=True):
    so_methods |= strings_of(p)

# javap-text descriptors per (cls_slash, name) -> set of full descriptor '(params)ret'
javap_descs = {}
for path in glob.glob(os.path.join(ROOT_DECODED, '**', '*.txt'), recursive=True):
    txt = open(path, encoding='utf-8', errors='replace').read()
    cm = re.search(r'\bclass\s+([\w/$]+)', txt) or re.search(r'\binterface\s+([\w/$]+)', txt)
    if not cm:
        continue
    cls = cm.group(1)
    for line in txt.splitlines():
        mm = re.match(r'\s+(?:public|private|protected|static|final|synchronized|volatile|transient|native|abstract|\s)*\s+[\w$\[\].]+\s+(\w+)\(([^)]*)\)(\S*)', line)
        if not mm:
            continue
        nm = mm.group(1)
        if nm in ('<init>', '<clinit>'):
            continue
        if 'synthetic' in line:
            continue
        if 'native' in line:
            continue  # JNI registers natives separately
        # javap shows descriptor only with -s; without it we approximate from the declared return type
        # We store the raw param string + return word so check_sig can do the real comparison.
        javap_descs.setdefault((cls, nm), set()).add('(' + mm.group(2) + ')' + mm.group(3))

TARGETS = [
    'com/ideaworks3d/marmalade/LoaderThread', 'com/ideaworks3d/marmalade/LoaderView',
    'com/ideaworks3d/marmalade/LoaderActivity', 'com/ideaworks3d/marmalade/LoaderKeyboard',
    'com/ideaworks3d/marmalade/LoaderGL', 'com/ideaworks3d/marmalade/LoaderLocation',
    'com/ideaworks3d/studio/IsDevice', 'com/ideaworks3d/studio/IsDeviceActivity',
]

print("# Kotlin expression-body methods in target classes that the .so loads OR javap knows,")
print("# whose body could yield a non-void/nullable JVM signature when javap may expect V:\n")

for fp in glob.glob(os.path.join(ROOT_KT, '**', '*.kt'), recursive=True):
    txt = open(fp, encoding='utf-8', errors='replace').read()
    pkg = ''
    mm = re.search(r'^package\s+([\w.]+)', txt, re.M)
    if mm:
        pkg = mm.group(1)
    cls = None
    mm = re.search(r'^(?:open |abstract |sealed |internal |final )*(?:class|object) (\w+)', txt, re.M)
    if mm:
        cls = mm.group(1)
    if not cls:
        continue
    fqn = pkg.replace('.', '/') + '/' + cls
    if fqn not in TARGETS:
        continue
    for m in re.finditer(r'(?m)^[\t ]*(?:(?:private |public |protected |internal |open |override |final |@[\w()".=, ]+ )*\bfun\s+(\w+)\s*\(([^)]*)\)\s*(?::\s*([A-Za-z_][\w.<>?\[\]]*))?\s*=\s*(.+)$)', txt):
        name = m.group(1)
        retdecl = m.group(3)
        body = m.group(4).strip()
        jp = javap_descs.get((fqn, name))
        in_so = name in so_methods
        if not jp and not in_so:
            continue
        uses_safe_chain = ('?.' in body) or ('?:' in body)
        explicit_void = retdecl is not None and retdecl.strip() == 'Unit'
        jp_returns_void = jp and all(d.endswith('V') for d in jp)
        risk = (retdecl is None) and uses_safe_chain and jp_returns_void
        if risk or (in_so and jp_returns_void and retdecl is None):
            print(f"{fqn}.{name}")
            print(f"   javap: {jp}  in_so: {in_so}")
            print(f"   kt body: {body.strip()[:120]}")
            print()
