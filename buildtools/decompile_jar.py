"""Decompile every .class entry in a JAR to javap text using `javap -p -c -s -constants`.

Usage:
    python decompile_jar.py <input.jar> <output_dir>

For each class entry in <input.jar>:
  1. Extract the .class bytes to a temp file
  2. Run `javap -p -c -s -constants -verbose` against it (or fall back to
     `-p -c -s -constants` if -verbose fails for synthetic classes)
  3. Write the javap output to <output_dir>/<fqcn_slash>.txt
       e.g. com/ideaworks3d/marmalade/LoaderActivity.txt

Result: a directory of javap(text) dumps with same shape as the existing
loaderthread_decompiled.txt reference file.

`-s` emits JVM descriptors next to each method (needed by check_sig.py),
`-p` exposes private members, `-c` shows bytecode bodies,
`-constants` folds in the constant pool's final values (useful strings).
"""
import os
import sys
import re
import zipfile
import subprocess
import tempfile


JAVAP_ARGS = ["javap", "-p", "-c", "-s", "-constants"]


def safe_filename_for_entry(entry: str) -> str:
    # entry like "com/ideaworks3d/marmalade/LoaderActivity$1.class"
    assert entry.endswith(".class"), entry
    name = entry[:-len(".class")]
    # module-info, package-info, etc — keep as-is, will produce txt files
    return name + ".txt"


def decompile_classfile(class_bytes: bytes, label: str) -> str:
    with tempfile.NamedTemporaryFile(suffix=".class", delete=False) as tf:
        tf.write(class_bytes)
        tf_path = tf.name
    try:
        # Try full flags first; if javap errors (rare for malformed classes),
        # retry with a smaller flag set.
        for args in (JAVAP_ARGS, JAVAP_ARGS[:-1], ["javap", "-p"]):
            try:
                out = subprocess.check_output(
                    args + [tf_path],
                    stderr=subprocess.STDOUT,
                )
                return out.decode("utf-8", errors="replace")
            except subprocess.CalledProcessError as e:
                last_err = e.output.decode("utf-8", errors="replace") if e.output else ""
                # javap returns nonzero for module-info etc; fall through
                continue
        return f"# javap failed for {label}\n# last stderr: {last_err}\n"
    finally:
        os.unlink(tf_path)


def decompile_jar(jar_path: str, out_dir: str):
    if not os.path.exists(jar_path):
        print(f"ERROR: jar not found: {jar_path}", file=sys.stderr)
        sys.exit(1)

    os.makedirs(out_dir, exist_ok=True)

    count = 0
    skipped = 0
    errors = 0
    with zipfile.ZipFile(jar_path, "r") as z:
        for info in z.infolist():
            if info.is_dir():
                continue
            if not info.filename.endswith(".class"):
                continue

            # META-INF versions/ module-info etc -> skip per spec
            if info.filename.startswith("META-INF/"):
                skipped += 1
                continue

            try:
                class_bytes = z.read(info.filename)
            except Exception as e:
                print(f"  ! read failed {info.filename}: {e}", file=sys.stderr)
                errors += 1
                continue

            txt_path = os.path.join(out_dir, safe_filename_for_entry(info.filename))
            os.makedirs(os.path.dirname(txt_path), exist_ok=True)

            text = decompile_classfile(class_bytes, info.filename)
            with open(txt_path, "w", encoding="utf-8") as f:
                f.write(text)

            count += 1
            if count % 25 == 0:
                print(f"  ...{count} classes decompiled")

    print(f"Done: {count} decompiled, {skipped} skipped (META-INF/non-class), {errors} errors.")
    print(f"Output dir: {out_dir}")


def main():
    if len(sys.argv) != 3:
        print(__doc__)
        sys.exit(1)
    decompile_jar(sys.argv[1], sys.argv[2])


if __name__ == "__main__":
    main()
