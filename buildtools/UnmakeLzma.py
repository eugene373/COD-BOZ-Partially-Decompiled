"""Decompress a Marmalade boz.s3e LZMA1-RAW stream.

Usage:
    python UnmakeLzma.py <input.s3e> [output.bin]

A Marmalade boz.s3e file is an LZMA1-RAW stream with a 13-byte header
prepended:
    byte  0     : LZMA properties byte (lc/lp/pb packed), e.g. 0x5D
    bytes 1-4   : uncompressed-size field (informational; often 0xFFFFFFFF
                  or a placeholder — Marmalade does not use the FORMAT_ALONE
                  container, just the props byte)
    bytes 5-12  : reserved / unused

The decompressor skips those 13 bytes, extracts the LZMA1 filter spec from
the properties byte, then decodes the remaining bytes as a raw LZMA1 bitstream.
The output is the embedded "XE3U" Marmalade archive (which itself contains the
ICF config + the ARM executable).

This is the inverse of MakeLzma.py (which emits FORMAT_ALONE). No third-party
dependencies required — runs in any stock CPython 3.8+.

Example:
    python UnmakeLzma.py boz.s3e boz_decompressed.xz
"""
import lzma
import os
import sys

# The Marmalade boz.s3e layout: 1-byte LZMA props + 12 reserved bytes.
S3E_HEADER_LEN = 13


def lzma_props_byte_to_filter(props: int) -> dict:
    """Decode an LZMA properties byte (0..224) into an lzma filter dict.

    The byte packs: pb*45 + lp*9 + lc. (Standard 7z / LZMA1 convention.)
    """
    pb = props // 45
    remainder = props % 45
    lp = remainder // 9
    lc = remainder % 9
    return {
        "id": lzma.FILTER_LZMA1,
        "lc": lc,
        "lp": lp,
        "pb": pb,
    }


def main():
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    input_file = sys.argv[1]

    if not os.path.exists(input_file):
        print(f"ERROR: input file not found: {input_file}", file=sys.stderr)
        sys.exit(1)

    base, _ = os.path.splitext(input_file)
    output_file = sys.argv[2] if len(sys.argv) > 2 else base + "_decompressed.xz"

    with open(input_file, "rb") as f:
        data = f.read()

    if len(data) < S3E_HEADER_LEN:
        print(
            f"ERROR: {input_file} is too small ({len(data)} bytes) to contain a "
            f"{S3E_HEADER_LEN}-byte header.",
            file=sys.stderr,
        )
        sys.exit(1)

    # Byte 0 holds the LZMA1 lc/lp/pb spec; bytes 1..12 are the Marmalade
    # reserved header and are skipped.
    props_byte = data[0]
    raw_stream = data[S3E_HEADER_LEN:]

    filters = [lzma_props_byte_to_filter(props_byte)]

    try:
        decompressed = lzma.decompress(raw_stream, format=lzma.FORMAT_RAW, filters=filters)
    except lzma.LZMAError as e:
        print(f"ERROR: failed to decompress {input_file}: {e}", file=sys.stderr)
        print(
            "Hint: verify this is an LZMA1-RAW (.s3e) stream, not FORMAT_ALONE.",
            file=sys.stderr,
        )
        sys.exit(1)

    with open(output_file, "wb") as f:
        f.write(decompressed)

    print(
        f"Decompressed {input_file} -> {output_file} "
        f"({len(data)} in -> {len(decompressed)} out)"
    )

    # Sanity-check: the Marmalade container magic should follow decompression.
    if decompressed[:4] == b"XE3U":
        print("OK: output begins with 'XE3U' Marmalade container magic.")
    else:
        print(
            "WARNING: output does not begin with XE3U. Got: "
            + repr(decompressed[:4]),
            file=sys.stderr,
        )


if __name__ == '__main__':
    main()
