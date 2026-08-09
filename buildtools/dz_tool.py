import struct
import sys
from pathlib import Path

MAGIC = b"DTRZ"
SEP = "\x01"

def parse_dz(path):
    data = Path(path).read_bytes()
    count, dir_count = struct.unpack_from("<HH", data, 4)
    flag = data[8]
    pos = 9

    names = []
    for i in range(count):
        end = data.index(0, pos)
        names.append(data[pos:end].decode("ascii"))
        pos = end + 1

    dirs = [""]
    for i in range(dir_count - 1):
        end = data.index(0, pos)
        dirs.append(data[pos:end].decode("ascii"))
        pos = end + 1

    file_dirs = [0] * count
    for i in range(count):
        dir_id, file_id, _ = struct.unpack_from("<HHH", data, pos)
        file_dirs[file_id] = dir_id
        pos += 6

    files = []
    for i in range(count):
        flags, offset, size, _ = struct.unpack_from("<IIII", data, pos)
        folder = dirs[file_dirs[i]].replace("\\", "/")
        full = f"{folder}/{names[i]}" if folder else names[i]
        files.append((full, file_dirs[i], flags, offset, size))
        pos += 16

    return data, flag, dirs, files

def extract(path):
    path = Path(path)
    out_dir = path.with_name(path.stem + "_extracted")
    data, flag, dirs, files = parse_dz(path)

    out_dir.mkdir(exist_ok=True)
    meta = [
        "HEADER_FLAG|" + str(flag),
        "ORIGINAL_DZ|" + path.name,
        "DIRS|" + SEP.join(dirs),
    ]

    for full, dir_id, flags, offset, size in files:
        out = out_dir / full
        out.parent.mkdir(parents=True, exist_ok=True)
        out.write_bytes(data[offset:offset + size])
        meta.append(f"{full}|{flags:#010x}|{dir_id}")

    (out_dir / "_dz_meta.txt").write_text("\n".join(meta) + "\n")
    print(path.name, "->", out_dir.name)

def repack(folder):
    folder = Path(folder)
    flag = 0
    original = folder.name.replace("_extracted", "") + ".dz"
    dirs = []
    files = []

    for line in (folder / "_dz_meta.txt").read_text().splitlines():
        if line.startswith("HEADER_FLAG|"):
            flag = int(line.split("|", 1)[1])
        elif line.startswith("ORIGINAL_DZ|"):
            original = line.split("|", 1)[1]
        elif line.startswith("DIRS|"):
            dirs = line.split("|", 1)[1].split(SEP)
        elif line:
            full, flags, dir_id = line.split("|")
            files.append((full, int(dir_id), int(flags, 16)))

    out = bytearray(MAGIC)
    out += struct.pack("<HHB", len(files), len(dirs), flag)

    for full, dir_id, flags in files:
        out += full.split("/")[-1].encode("ascii") + b"\0"

    for d in dirs[1:]:
        out += d.encode("ascii") + b"\0"

    for i, item in enumerate(files):
        out += struct.pack("<HHH", item[1], i, 0xFFFF)

    table = len(out)
    out += b"\0" * (len(files) * 16)
    out += struct.pack("<I", 0x100)

    offset = len(out)
    for i, (full, dir_id, flags) in enumerate(files):
        data = (folder / full).read_bytes()
        size = len(data)
        struct.pack_into("<IIII", out, table + i * 16, flags, offset, size, size)
        out += data
        offset += size

    out_path = folder.with_name(Path(original).stem + "_new.dz")
    out_path.write_bytes(out)
    print(folder.name, "->", out_path.name)

if len(sys.argv) < 2:
    print("dz_tool\n\nUsage:\n\tdz_tool.py inputfile\n\tdz_tool.py inputfolder\n")
    input("Press Enter to quit.")
    raise SystemExit

for arg in sys.argv[1:]:
    p = Path(arg)
    if p.is_dir():
        repack(p)
    else:
        extract(p)
