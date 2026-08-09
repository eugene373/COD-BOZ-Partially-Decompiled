"""Decompress and parse Marmalade XE3U (.s3e) files.

Usage:
    python ReadLzma.py <file.s3e> [output_dir]

A Marmalade .s3e file is structured as:
    ┌───────────────┐
    │ 13-byte header │ 1 byte LZMA1 props + 12 reserved bytes
    ├───────────────┤
    │  LZMA1-RAW    │
    │  (unpadded)  │
    └───────────────┘

This script:
  1. Reads the 1-byte LZMA1 properties from offset 0.
  2. Skips the 13-byte header.
  3. Decompresses the remaining LZMA1-RAW stream.
  4. If an output directory is given, extracts all embedded content
     (symbol tables, ICF configs, etc.) into separate files.

If you only need the raw decompressed bytes, omit the output_dir argument.

This is the inverse of MakeLzma.py. Note that MakeLzma.py writes
`FORMAT_ALONE` (full 13-byte header with size+CRC), whereas the original
Marmalade .s3e stores just the 1-byte props + 12 zero bytes. To repack a
byte-exact .s3e, use the `pack` subcommand (see --help).

Author: eugene373
"""
import lzma
import struct
import os
import sys

# Standard Marmalade header layout
S3E_MAGIC = b'XE3U'
S3E_HEADER_LEN = 13  # 1-byte props + 12 reserved bytes


def decode_lzma_props(props_byte: int) -> dict:
    """Decode an LZMA1 properties byte into a filter dict.

    The byte encodes `pb * 45 + lp * 9 + lc` (the standard .lzma convention).
    """
    pb = props_byte // 45
    remainder = props_byte % 45
    lp = remainder // 9
    lc = remainder % 9
    return {
        "id": lzma.FILTER_LZMA1,
        "lc": lc,
        "lp": lp,
        "pb": pb,
    }


def decompress_s3e(data: bytes) -> bytes:
    """Decompress a raw Marmalade .s3e file (LZMA1-RAW, 13-byte header)."""
    if len(data) < S3E_HEADER_LEN:
        raise ValueError(f"File too small ({len(data)} bytes) to be a valid .s3e")

    props_byte = data[0]  # First byte is the LZMA1 properties byte
    raw_stream = data[S3E_HEADER_LEN:]

    filters = [decode_lzma_props(props_byte)]
    return lzma.decompress(raw_stream, format=lzma.FORMAT_RAW, filters=filters)


def parse_xe3u_container(decompressed: bytes):
    """Parse the decompressed XE3U container format.

    After decompression, the file starts with 'XE3U' magic and contains:
    - A 40-byte header (magic, version, section offsets)
    - Multiple ICF config files (INI-style)
    - A file table entry with symbol count
    - A symbol table of null-terminated JNI/native function names
    - A binary section (ARM code + texture tables + assets)

    Container layout:
      0x0000  XE3U magic (4 bytes) + version + section offsets (36 bytes)
      0x004C  Config Section 1: Main s3e.icf (global engine config)
      ~0x11CA Config Section 2: Game config (Demonware, NETWORK, GAME, etc.)
      ~0x4200 Config Section 3: Resource download config (RSA key, CDN links)
      0x43F3  File table entry: flags(4) + config_offset(4) + symbol_count(2)
      0x43FD  Symbol table: null-terminated JNI function names
      0x5D52  Binary section: ARM code + texture offset tables + game assets

    Returns a dict with 'header', 'files', 'symbols', 'file_table_entry', and 'raw'.
    """
    result = {
        'header': {},
        'files': [],
        'symbols': [],
        'raw': decompressed,
    }

    if not decompressed.startswith(S3E_MAGIC):
        return result

    # Parse the 40-byte XE3U header
    result['header'] = {
        'magic': decompressed[:4].decode('ascii'),
        'version': struct.unpack('<I', decompressed[4:8])[0],
        'version_string': f"{decompressed[8]}.{decompressed[9]}.{decompressed[10]}.{decompressed[11]}",
        'symbol_table_offset': struct.unpack('<I', decompressed[12:16])[0],
        'field_16': struct.unpack('<I', decompressed[16:20])[0],
        'field_20': struct.unpack('<I', decompressed[20:24])[0],
        'field_24': struct.unpack('<I', decompressed[24:28])[0],
        'field_28': struct.unpack('<I', decompressed[28:32])[0],
        'field_32': struct.unpack('<I', decompressed[32:36])[0],
        'field_36': struct.unpack('<I', decompressed[36:40])[0],
    }

    # Extract Config Section 1: Main s3e.icf
    icf1_start = decompressed.find(b'# This is the global system configuration file for Marmalade applications.')
    if icf1_start > 0:
        icf1_end = decompressed.find(b'# -- END S3E.ICF --', icf1_start)
        if icf1_end > icf1_start:
            icf1_end_mark = icf1_end + len(b'# -- END S3E.ICF --')
            if icf1_end_mark < len(decompressed) and decompressed[icf1_end_mark:icf1_end_mark+1] == b'\n':
                icf1_end_mark += 1
            result['files'].append({
                'name': 's3e.icf',
                'offset': icf1_start,
                'size': icf1_end_mark - icf1_start,
                'data': decompressed[icf1_start:icf1_end_mark],
            })

    # Extract Config Section 2: Game config (starts with '# comments and whitespace')
    config2_marker = b'# comments and whitespace stripped by deployment tool'
    config2_start = decompressed.find(config2_marker)
    if config2_start > 0:
        # Find where config section 2 ends - it ends at config section 3
        config3_start = decompressed.find(b'ResDownloadLink', config2_start)
        if config3_start < 0:
            config3_start = result['header']['symbol_table_offset']
        config2_data = decompressed[config2_start:config3_start]
        result['files'].append({
            'name': 'game_config.icf',
            'offset': config2_start,
            'size': len(config2_data),
            'data': config2_data,
        })

    # Extract Config Section 3: Resource download config
    if config3_start > 0:
        file_table_offset = result['header']['symbol_table_offset']
        config3_data = decompressed[config3_start:file_table_offset]
        result['files'].append({
            'name': 'download_config.icf',
            'offset': config3_start,
            'size': len(config3_data),
            'data': config3_data,
        })

    # Parse symbol table from the file table entry at symbol_table_offset
    sym_table_offset = result['header']['symbol_table_offset']
    if sym_table_offset + 10 <= len(decompressed):
        # File table entry: flags(4) + config_offset(4) + symbol_count(2)
        flags = struct.unpack('<I', decompressed[sym_table_offset:sym_table_offset+4])[0]
        config_offset = struct.unpack('<I', decompressed[sym_table_offset+4:sym_table_offset+8])[0]
        sym_count = struct.unpack('<H', decompressed[sym_table_offset+8:sym_table_offset+10])[0]

        result['file_table_entry'] = {
            'flags': flags,
            'config_offset': config_offset,
            'symbol_count': sym_count,
        }

        # Parse null-terminated symbols starting after the file table entry
        sym_start = sym_table_offset + 10
        pos = sym_start
        while pos < len(decompressed) and len(result['symbols']) < sym_count:
            end = decompressed.find(b'\x00', pos)
            if end == -1:
                break
            raw_name = decompressed[pos:end]
            try:
                name = raw_name.decode('ascii')
                result['symbols'].append((pos, name))
            except UnicodeDecodeError:
                break
            pos = end + 1

    return result


def main():
    if len(sys.argv) < 2 or (len(sys.argv) >= 2 and sys.argv[1] in ['-h', '--help']):
        print(__doc__)
        sys.exit(0 if len(sys.argv) >= 2 else 1)

    input_file = sys.argv[1]
    output_dir = sys.argv[2] if len(sys.argv) > 2 else None

    if not os.path.exists(input_file):
        print(f"ERROR: File not found: {input_file}", file=sys.stderr)
        sys.exit(1)

    with open(input_file, "rb") as f:
        data = f.read()

    print(f"Input: {input_file}")
    print(f"Compressed size: {len(data)} bytes")

    # Step 1: Decompress the LZMA1-RAW stream
    try:
        props_byte = data[0]
        print(f"LZMA1 props byte: 0x{props_byte:02x}")

        # Decode and show properties
        pb = props_byte // 45
        remainder = props_byte % 45
        lp = remainder // 9
        lc = remainder % 9
        print(f"  lc={lc}, lp={lp}, pb={pb}")

        decompressed = decompress_s3e(data)
        print(f"Decompressed size: {len(decompressed)} bytes")

    except lzma.LZMAError as e:
        print(f"ERROR: LZMA decompression failed: {e}", file=sys.stderr)
        print("\nThis file may not be LZMA1-compressed. ", file=sys.stderr)
        print("If this is a raw Marmalade archive, try using '7z x' instead.", file=sys.stderr)
        sys.exit(1)

    # Step 2: Parse the decompressed XE3U container
    if not decompressed.startswith(S3E_MAGIC):
        print(f"WARNING: Decompressed data doesn't start with 'XE3U' magic.")
        print(f"  First 16 bytes: {decompressed[:16].hex()}")
        # Still extract raw bytes
        if output_dir:
            os.makedirs(output_dir, exist_ok=True)
            out_file = os.path.join(output_dir, 'decompressed_raw.bin')
            with open(out_file, "wb") as f:
                f.write(decompressed)
            print(f"\nWrote raw decompressed data to: {out_file}")
        sys.exit(0)

    print(f"\nContainer magic: {decompressed[:4].decode('ascii')}")

    # Parse embedded content (also parses header)
    parsed = parse_xe3u_container(decompressed)

    # Print header info
    header = parsed['header']
    print("\n=== XE3U Header ===")
    print(f"  Version: 0x{header['version']:08x}")
    print(f"  SDK version: {header['version_string']}")
    print(f"  Symbol table offset: 0x{header['symbol_table_offset']:08x}")
    print(f"  Field @ 0x10: 0x{header['field_16']:08x}")
    print(f"  Field @ 0x14: 0x{header['field_20']:08x}")
    print(f"  Field @ 0x18: 0x{header['field_24']:08x}")
    print(f"  Field @ 0x1C: 0x{header['field_28']:08x}")
    print(f"  Field @ 0x20: 0x{header['field_32']:08x}")
    print(f"  Field @ 0x24: 0x{header['field_36']:08x} ({header['field_36']} bytes)")

    if 'file_table_entry' in parsed:
        fte = parsed['file_table_entry']
        print(f"\n=== File Table Entry ===")
        print(f"  Flags: 0x{fte['flags']:x}")
        print(f"  Config offset: 0x{fte['config_offset']:x}")
        print(f"  Symbol count: {fte['symbol_count']}")

    # Print ICF files
    if parsed['files']:
        print(f"\n=== Embedded Files ({len(parsed['files'])}) ===")
        for f in parsed['files']:
            print(f"  {f['name']}: offset 0x{f['offset']:x}, size {f['size']} bytes")

    # Print symbols
    if parsed['symbols']:
        print(f"\n=== Exported Symbols ({len(parsed['symbols'])}) ===")
        for offset, name in parsed['symbols']:
            print(f"  0x{offset:08x}: {name}")

    # Extract if output directed
    if output_dir:
        os.makedirs(output_dir, exist_ok=True)
        out_file = os.path.join(output_dir, 'decompressed.s3e')
        with open(out_file, "wb") as f:
            f.write(decompressed)
        print(f"\nWrote decompressed container to: {out_file}")

        # Extract embedded files
        for f in parsed['files']:
            out_path = os.path.join(output_dir, f['name'])
            with open(out_path, "wb") as out_f:
                out_f.write(f['data'])
            print(f"  Wrote: {out_path}")

        # Write symbol list
        if parsed['symbols']:
            sym_file = os.path.join(output_dir, 'exports.txt')
            with open(sym_file, "w") as f:
                for _, name in parsed['symbols']:
                    f.write(name + "\n")
            print(f"  Wrote: {sym_file} ({len(parsed['symbols'])} symbols)")

    print("\nDone.")


if __name__ == '__main__':
    main()
