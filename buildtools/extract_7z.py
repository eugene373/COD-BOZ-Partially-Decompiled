"""Extract and audit marmalade.7z using py7zr.

Usage:
    python extract_7z.py <archive.7z> [output_dir]

Lists entries, then extracts if output_dir is given. Without output_dir,
just prints the manifest so you can decide what to do next.
"""
import sys
import os

try:
    import py7zr
except ImportError:
    print("ERROR: py7zr not installed. Run: pip install py7zr", file=sys.stderr)
    sys.exit(2)


def main():
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    archive = sys.argv[1]
    out_dir = sys.argv[2] if len(sys.argv) > 2 else None

    if not os.path.exists(archive):
        print(f"ERROR: archive not found: {archive}", file=sys.stderr)
        sys.exit(1)

    print(f"=== Manifest of {archive} ===")
    with py7zr.SevenZipFile(archive, mode='r') as z:
        infos = z.list()
        for info in infos:
            # info: name, uncompressed, compressed, is_directory, archname, crc32
            print(f"  {'d' if info.is_directory else 'f':1}  {info.uncompressed:>10}  {info.filename}")
        print(f"\nTotal entries: {len(infos)}")

    if out_dir:
        os.makedirs(out_dir, exist_ok=True)
        print(f"\n=== Extracting to {out_dir} ===")
        with py7zr.SevenZipFile(archive, mode='r') as z:
            z.extractall(path=out_dir)
        print("Extraction complete.")


if __name__ == '__main__':
    main()
