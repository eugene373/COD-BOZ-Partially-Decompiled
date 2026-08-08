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
    - A header section
    - Embedded ICF config files
    - Optional symbol tables

    Returns a dict with 'header' and any extractable content.
    """
    result = {
        'files': [],
        'symbols': [],
        'raw': decompressed,
    }

    if not decompressed.startswith(S3E_MAGIC):
        # Even without magic, still return raw data
        return result

    # The XE3U container has a header after the magic
    # Parse header fields to understand the layout
    header_size = min(len(decompressed), 40)
    header_bytes = decompressed[:header_size]

    # Look for ICF config files embedded in the data
    # ICF files are marked by '# This is the global system configuration...' comments
    icf_start = decompressed.find(b'# This is the global system configuration file for Marmalade applications.')
    if icf_start > 0:
        # Search for the end of the ICF file
        icf_end = decompressed.find(b'# -- END S3E.ICF --')
        if icf_end > icf_start:
            icf_end_marker = icf_end + len(b'# -- END S3E.ICF --')
            # Include trailing newline
            if icf_end_marker < len(decompressed) and decompressed[icf_end_marker:icf_end_marker+1] == b'\n':
                icf_end_marker += 1
            icf_content = decompressed[icf_start:icf_end_marker]
            result['files'].append({
                'name': 's3e.icf',
                'offset': icf_start,
                'size': len(icf_content),
                'data': icf_content,
            })

    # Parse symbol table if present
    # Symbol tables are null-terminated ASCII strings
    # Located at offset 0x4400 based on analysis
    symbol_offsets_to_try = [0x4400, 0x43f3, 0x440b, 0x43f7]
    for sym_offset in symbol_offsets_to_try:
        if sym_offset >= len(decompressed):
            continue
        # Look for a sequence of null-terminated strings
        symbols = []
        pos = sym_offset
        consecutive_null = 0
        while pos < len(decompressed):
            end = decompressed.find(b'\x00', pos)
            if end == -1 or end - pos > 128:
                break
            raw_name = decompressed[pos:end]
            if len(raw_name) == 0:
                consecutive_null += 1
                if consecutive_null > 1:
                    break
                pos = end + 1
                continue
            try:
                name = raw_name.decode('ascii')
            except UnicodeDecodeError:
                break
            # Filter out non-symbol strings
            if name and ('s3e' in name or 'gl' in name or 'egl' in name or
                          'Malloc' in name or 'Free' in name or name.isalpha() or
                          '_' in name):
                symbols.append((pos, name))
            pos = end + 1
            consecutive_null = 0
            if len(symbols) > 500:  # Sanity limit
                break

        if len(symbols) > 10:  # Found a real symbol table
            result['symbols'] = symbols
            break

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

    # Print header info
    header = {
        'version': struct.unpack('<I', decompressed[4:8])[0],
        'u32_at_8': struct.unpack('<I', decompressed[8:12])[0],
        'table_offset': struct.unpack('<I', decompressed[12:16])[0],
        'field_16': struct.unpack('<I', decompressed[16:20])[0],
        'field_20': struct.unpack('<I', decompressed[20:24])[0],
        'field_24': struct.unpack('<I', decompressed[24:28])[0],
        'field_28': struct.unpack('<I', decompressed[28:32])[0],
        'field_32': struct.unpack('<I', decompressed[32:36])[0],
        'field_36': struct.unpack('<I', decompressed[36:40])[0],
    }
    print("\n=== XE3U Header ===")
    print(f"  Version: {header['version']} (0x{header['version']:x})")
    print(f"  Field @ 8: {header['u32_at_8']} (0x{header['u32_at_8']:x})")
    print(f"  Symbol table offset: {header['table_offset']} (0x{header['table_offset']:x})")
    print(f"  Data offset: {header['field_16']} (0x{header['field_16']:x})")
    print(f"  Field @ 24: {header['field_24']} (0x{header['field_24']:x})")
    print(f"  Field @ 28: {header['field_28']} (0x{header['field_28']:x})")

    # Parse embedded content
    parsed = parse_xe3u_container(decompressed)

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
