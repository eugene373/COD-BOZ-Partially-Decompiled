import os, re, glob

# Re-pointed at Main/ tree (was: main_app/smali + main_app/app/src/main/java)
ROOT_SMALI = r"C:\Users\Sam\Desktop\code\BOZ\Main\buildtools\decoded"
ROOT_KT    = r"C:\Users\Sam\Desktop\code\BOZ\Main\app\src\main\java"

# javap-text classes that declare >=1 native method -> FQN
native_classes = {}  # fqn_slash -> set of native method names
for path in glob.glob(os.path.join(ROOT_SMALI, '**', '*.txt'), recursive=True):
    with open(path, encoding='utf-8', errors='replace') as f:
        text = f.read()
    if 'native' not in text and 'external' not in text:
        continue
    # javap header line: "public class com.foo.Bar extends ..." or "Compiled from"
    cm = re.search(r'\bclass\s+([\w/$]+)', text)
    if not cm:
        cm = re.search(r'Compiled from "([^"]+)"', text)
        if not cm:
            continue
        # derive FQN from filename only — fallback below
    cls = cm.group(1) if cm.lastindex == 1 else None
    if cls is None:
        # try "class com.foo.Bar" again loosely
        cm2 = re.search(r'\b(?:class|interface)\s+([\w./]+)', text)
        if not cm2:
            continue
        cls = cm2.group(1).replace('.', '/')
    nats = set()
    for m in re.finditer(r'(?:native|external)\s+\w+\s+(\w+)\s*\(', text):
        nats.add(m.group(1))
    if nats:
        native_classes[cls] = nats

# Kotlin top-level classes -> FQN (slashed)
kt_classes = {}  # fqn_slash -> (file, native_method_names)
for path in glob.glob(os.path.join(ROOT_KT, '**', '*.kt'), recursive=True):
    with open(path, encoding='utf-8') as f:
        text = f.read()
    m = re.search(r'^package\s+([\w.]+)', text, re.M)
    pkg = m.group(1) if m else ''
    for cm in re.finditer(r'^(?:open\s+|abstract\s+|sealed\s+|internal\s+|final\s+)*\bclass\s+(\w+)', text, re.M):
        name = cm.group(1)
        fqn = (pkg.replace('.', '/') + '/' + name) if pkg else name
        nats = set(re.findall(r'\bexternal\s+fun\s+(\w+)', text))
        kt_classes[fqn] = (path, nats)

print("=== JAVAP CLASSES WITH NATIVES NOT FOUND AS KOTLIN CLASS OF SAME FQN ===")
missing_cls = []
for cls in sorted(native_classes):
    if cls not in kt_classes:
        missing_cls.append(cls)
        print(f"  L{cls};  natives={sorted(native_classes[cls])}")
print(f"\nTotal classes missing: {len(missing_cls)}")

print("\n=== CLASSES FOUND but missing SOME native method names ===")
for cls, nats in native_classes.items():
    if cls in kt_classes:
        path, knats = kt_classes[cls]
        missing = nats - knats
        if missing:
            print(f"  L{cls}; missing natives={sorted(missing)}  (file: {path})")
