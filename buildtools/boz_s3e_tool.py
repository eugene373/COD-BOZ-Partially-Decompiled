#!/usr/bin/env python3
"""Unpack, edit, and repack Marmalade boz.s3e container files.

A boz.s3e file is a LZMA1-RAW compressed XE3U container. After decompression,
the inner container looks like:

    ┌─────────────────────────────┐
    │ 64-byte XE3U header          │
    │ (magic, version, offsets)   │
    ├─────────────────────────────┤
    │ 12-byte extra block (0x40-0x4C) │  undocumented; kept untouched
    ├─────────────────────────────┤
    │ Config Section 1 (s3e.icf)  │  global engine config (INI)
    │ + optional fixed pad bytes  │  (e.g. 3-byte "\r\n\n" before config2)
    ├─────────────────────────────┤
    │ Config Section 2 (game icf) │  game-specific config
    ├─────────────────────────────┤
    │ Config Section 3 (dl cfg)   │  resource download config
    ├─────────────────────────────┤
    │ File table entry (10 bytes) │  flags + offset + symbol count
    ├─────────────────────────────┤
    │ Symbol table                │  N null-terminated JNI names
    ├─────────────────────────────┤
    │ Binary section              │  ARM code + textures + assets
    ├─────────────────────────────┤
    │ 140-byte sig block          │  type + self_ref + hash + RSA-1024
    ├─────────────────────────────┤
    │ 288-byte trailer            │  XOR'd (0xEE) Marmalade license
    └─────────────────────────────┘

The native .so signature check is patched out (see disable_sig_check.py),
so we can freely edit the content (ICF configs) and still preserve the
sig block + trailer for file integrity.

Edit policy (the only on-device-verified working shrink path, confirmed
2026-08-09): repacking ALWAYS keeps every config's on-disk SPAN byte-
identical to stock. Each edited ICF is stripped of comments + whitespace
and padded back to its stock content size with `###` comment lines
appended at the end, so no downstream header offset field ever shifts and
the sig block stays anchored at stock 0x456df3. Any offset shift (from a
size-changing edit that wasn't padded back, or from re-pointing the
header) makes the Marmalade loader reject the file on device with
477/478/479 + `Invalid .s3e file`. If a stripped edit is larger than the
stock config size, the tool errors out rather than silently truncate.

Workflow:
    # 1. Unpack
    python boz_s3e_tool.py unpack app/src/main/assets/boz.s3e work/

    # 2. Edit s3e.icf, game_config.icf, etc. in work/

    # 3. Repack (preserving original sig block + trailer)
    python boz_s3e_tool.py repack work/ output.s3e

The repack command reads:
  - work/decompressed.s3e     (the content to repack, possibly edited)
  - work/sig_block.bin        (preserved from original)
  - work/trailer.bin          (preserved from original)
  - work/s3e_meta.txt         (offsets from the original)

If decompressed.s3e has been modified, the tool re-appends the original
sig block + trailer. No-edit round-trips preserve the original compressed
stream (byte-identical). Edited configs are strip+pad'd to stock size and
recompressed with LZMA1 (FORMAT_ALONE-style).
"""
import argparse
import lzma
import os
import struct
import sys

# ── Constants ──────────────────────────────────────────────────────────

S3E_MAGIC = b'XE3U'
S3E_HEADER_LEN = 13       # LZMA1-RAW outer header: 1 props byte + 12 reserved
XE3U_HEADER_LEN = 64       # The 16 documented uint32 fields occupy 0x00-0x40.
                           # NOTE: 0x40-0x4C is an extra 12-byte block present in
                           # the stock container (\x0c\x00\x00\x00 = 12, then
                           # 0x003DC000, 0x00000000) that is NOT part of the
                           # documented header and is left untouched by this tool
                           # (it lives inside decompressed.s3e, which is kept whole
                           # and only has ICF byte-ranges overwritten). config1
                           # (s3e.icf) begins at 0x4C.
SIG_BLOCK_SIZE = 140      # type(4) + self_ref(4) + hash(4) + RSA-1024 sig(128)
TRAILER_SIZE = 288        # XOR'd license text + binary tail
PADDING_SIZE = 42         # Zero bytes inserted before sig block in modified files
LZMA_PROPS_BYTE = 0x5D    # lc=3, lp=0, pb=2

LZMA_FILTER = {
    "id": lzma.FILTER_LZMA1,
    "lc": 3,
    "lp": 0,
    "pb": 2,
    "dict_size": 64 * 1024,
}

# XE3U header field offsets (within the 64-byte decompressed XE3U header at 0x00-0x40)
H_VERSION       = 0x04   # uint32: format version (0x00042800)
H_SDK_VERSION   = 0x08   # 4 bytes: SDK version (10.0.12.1)
H_SYM_TABLE_OFF = 0x0C   # uint32: offset to file table entry (10 bytes: flags+cfg_off+sym_cnt)
H_DATA_OFFSET_1 = 0x10   # uint32: texture index offset
H_CODE_ENTRY    = 0x14   # uint32: ARM code entry point
H_DATA_SECTION  = 0x18   # uint32: ARM data section offset
H_VA_ENTRY      = 0x1C   # uint32: ARM code entry virtual address
H_SIG_OFF       = 0x20   # uint32: offset of signature block (140 bytes)
H_SIG_SIZE      = 0x24   # uint32: sig block size (140)
H_RESERVED      = 0x28   # uint32: reserved (always 0)
H_LICENSE_LEN   = 0x2C   # uint32: length of XOR'd license text (76)
H_CONFIG3_OFF   = 0x30   # uint32: offset to config section 3 (download config)
H_FIELD_34      = 0x34   # uint32: 0x4A in low byte = length of ASCII sig string in trailer
H_TRAILER_OFF   = 0x38   # uint32: offset of trailer (288 bytes)
H_TRAILER_SIZE  = 0x3C   # uint32: trailer size (288)

# Container layout (all offsets in the decompressed 4,550,559-byte container):
#   0x000 - 0x040  XE3U header  (16 documented uint32 fields)
#   0x040 - 0x04C  extra 12-byte block (undocumented; kept untouched)
#   0x04C - 0x11C7 Config 1 s3e.icf        (4475 bytes content)
#   0x11C7- 0x11CA fixed 3-byte pad "\r\n\n" (preserved verbatim on repack)
#   0x11CA - 0x3FA7 Config 2 game_config.icf (11741 bytes, no trailing pad)
#   0x3FA7 - 0x43F3 Config 3 download_config (1100 bytes, no trailing pad)
#   0x43F3 - 0x43FD File table entry (10 bytes)
#   0x43FD - binary  Symbol table (N null-terminated JNI names) + ARM code/assets
#   0x456DF3-0x456E7F Sig block (140 bytes)
#   0x456E7F-0x456F9F Trailer (288 bytes, XOR key 0xEE)
# Each config's SPAN = [offset, span_end) = content + fixed pad; size-changing
# ICF edits shift only bytes at span_end and beyond, keeping the pad gap intact.


# ── LZMA compression / decompression ───────────────────────────────────

def decompress_s3e(data: bytes) -> bytes:
    """Decompress a boz.s3e file (LZMA1-RAW with 13-byte header)."""
    if len(data) < S3E_HEADER_LEN:
        raise ValueError(f"File too small ({len(data)} bytes)")
    props_byte = data[0]
    pb = props_byte // 45
    remainder = props_byte % 45
    lp = remainder // 9
    lc = remainder % 9
    raw_stream = data[S3E_HEADER_LEN:]
    filters = [{"id": lzma.FILTER_LZMA1, "lc": lc, "lp": lp, "pb": pb}]
    return lzma.decompress(raw_stream, format=lzma.FORMAT_RAW, filters=filters)


def compress_s3e(decompressed: bytes) -> bytes:
    """Compress decompressed container data into boz.s3e format.

    Uses LZMA1 with FORMAT_ALONE-style 13-byte header (props + dict_size +
    uncompressed size). This matches the Marmalade s3e header format where
    bytes 0-4 hold LZMA properties (props_byte + dict_size LE), and bytes
    5-12 hold the uncompressed size as 8-byte LE (not 0xFFFFFFFFFFFFFFFF).

    Note: Python's pyliblzma encoder may produce a different compressed byte
    stream than the original LZMA SDK used by Marmalade. For byte-identical
    round-trips with no edits, the repack command preserves the original
    compressed file directly instead of re-encoding.
    """
    # Use FORMAT_ALONE to get a proper LZMA header, then patch in the
    # uncompressed size (the original s3e format encodes the real size,
    # not the FORMAT_ALONE default of 0xFFFFFFFFFFFFFFFF)
    compressed_alone = lzma.compress(decompressed, format=lzma.FORMAT_ALONE,
                                     filters=[LZMA_FILTER])
    # Patch bytes 5-12 with the real uncompressed size
    size_bytes = struct.pack('<Q', len(decompressed))
    return compressed_alone[:5] + size_bytes + compressed_alone[13:]


# ── Container parsing ──────────────────────────────────────────────────

class S3EInfo:
    """Quick container info (no content mutation)."""

    def __init__(self, data: bytes):
        self.raw = data
        if data.startswith(S3E_MAGIC):
            self.sig_off = struct.unpack_from('<I', data, H_SIG_OFF)[0]
            self.sig_size = struct.unpack_from('<I', data, H_SIG_SIZE)[0]
            self.trailer_off = struct.unpack_from('<I', data, H_TRAILER_OFF)[0]
            self.trailer_size = struct.unpack_from('<I', data, H_TRAILER_SIZE)[0]
            self.sig_block = data[self.sig_off:self.sig_off + self.sig_size]
            self.trailer = data[self.trailer_off:self.trailer_off + self.trailer_size]
            self.content_end = self.sig_off  # Everything before sig block
        else:
            raise ValueError("Not a valid XE3U container")


# ── Config section extraction ──────────────────────────────────────────

def extract_configs(data: bytes) -> list:
    """Extract the three ICF config sections from decompressed container data.

    For each config returns a dict with:
      name      : the .icf filename
      offset    : on-disk start offset of the config content
      data      : the editable ICF *content* bytes (what the user edits)
      span_end  : on-disk offset where the NEXT section begins (file_table
                  for the last config). content may be shorter than
                  (span_end - offset); the bytes in between are fixed
                  inter-section padding that must be preserved verbatim
                  (e.g. the 3-byte "\\r\\n\\n" pad between s3e.icf and
                  game_config.icf). Editing the .icf file changes only
                  `data`; the pad region is kept untouched on repack.
      pad       : the raw padding bytes (span_end - offset - len(data)),
                  saved so size-changing edits can reinsert them verbatim.

    The authoritative section boundaries come from on-disk string markers and
    the header's sym_table_off (file table entry) at 0x0C:
      - config1 (s3e.icf) starts at its '# This is the global...' marker and
        its content ends at '# -- END S3E.ICF --' + newline; its span ends
        where config2 begins (its '# comments and whitespace...' marker).
      - config2 (game_config.icf) starts at its marker and runs until the
        download_config marker ('ResDownloadLink'); it has no trailing pad.
      - config3 (download_config.icf) starts at 'ResDownloadLink' and runs
        until the file table entry at header sym_table_off (0x0C); no pad.
    NOTE: header field 0x30 (documented as 'config3_off' = 0x43A7) does NOT
    point to the download_config start — it points ~1024 bytes into it (near
    the AndroidExtSo list). The true download_config start is at 'ResDownloadLink'
    (0x3FA7 in stock). Boundaries are therefore marker-derived, not header-derived.
    Only the file-table/sym-table boundary (sym_table_off at 0x0C) is trusted
    from the header, since it is the container's authoritative sectioning point.
    """
    configs = []
    sym_off = struct.unpack_from('<I', data, 0x0C)[0]     # file table entry (authoritative)

    # Config Section 1: main s3e.icf (content bounded by marker; span bounded by config2)
    marker = b'# This is the global system configuration file for Marmalade applications.'
    c1_start = data.find(marker)
    if c1_start > 0:
        end_marker = b'# -- END S3E.ICF --'
        c1_mark = data.find(end_marker, c1_start)
        if c1_mark > c1_start:
            c1_content_end = c1_mark + len(end_marker)
            # The 'END' marker is followed by a trailing newline that is part
            # of the ICF text on disk (then optional pad bytes to config2).
            if c1_content_end < len(data) and data[c1_content_end:c1_content_end + 1] == b'\n':
                c1_content_end += 1
            # config2 begins at its marker = span_end of config1.
            c2_marker = b'# comments and whitespace stripped by deployment tool'
            c2_spans = data.find(c2_marker, c1_start)
            if c2_spans < 0:
                c2_spans = c1_content_end  # fallback: no pad
            pad1 = data[c1_content_end:c2_spans]
            configs.append({
                'name': 's3e.icf',
                'offset': c1_start,
                'data': data[c1_start:c1_content_end],
                'span_end': c2_spans,
                'pad': pad1,
            })

    # Config Section 2: game config (span ends exactly where config3 begins)
    c2_marker = b'# comments and whitespace stripped by deployment tool'
    c2_start = data.find(c2_marker)
    if c2_start > 0:
        c3_start = data.find(b'ResDownloadLink', c2_start)
        if c3_start < 0 or c3_start > sym_off:
            c3_start = sym_off  # fallback
        configs.append({
            'name': 'game_config.icf',
            'offset': c2_start,
            'data': data[c2_start:c3_start],   # no trailing pad
            'span_end': c3_start,
            'pad': b'',
        })

    # Config Section 3: download config (span ends at the file table entry)
    if c2_start > 0:
        c3_start = data.find(b'ResDownloadLink', c2_start)
        if c3_start < 0 or c3_start > sym_off:
            c3_start = sym_off  # fallback
        configs.append({
            'name': 'download_config.icf',
            'offset': c3_start,
            'data': data[c3_start:sym_off],    # no trailing pad
            'span_end': sym_off,
            'pad': b'',
        })

    return configs


# ── ICF strip + pad helpers ────────────────────────────────────────────

def strip_icf(data: bytes) -> bytes:
    """Strip ICF comments and normalise whitespace.

    Returns the compacted ICF content: every `#`-prefixed comment line is
    dropped, every remaining line is trimmed of trailing whitespace, blank
    lines are removed, and all line endings are normalised to CRLF. Tabs
    between a key and its value (used for alignment, e.g. `TitleID\\t\\t= 1`)
    are preserved — they are functional ICF syntax, not decorative.

    Dropping comments frees room inside a config so a size-changing content
    edit can still be padded back to the stock byte length without
    truncating real keys. Signing off on `# comments and whitespace stripped
    by deployment tool` (the literal first line of every stock ICF): the
    marker is itself a comment and is also dropped — it was a one-time
    deployment breadcrumb, not load-bearing.
    """
    text = data.decode('latin1')
    # Normalise line endings to CRLF: handle CR, LF, CRLF, and lone CR.
    text = text.replace('\r\n', '\n').replace('\r', '\n')
    out_lines = []
    for line in text.split('\n'):
        stripped = line.strip(' \t')
        if not stripped or stripped.startswith('#'):
            continue
        # Preserve inner tabs (key/value alignment); only trim ends.
        out_lines.append(stripped.rstrip(' \t'))
    return ('\r\n'.join(out_lines)).encode('latin1')


def pad_to_size(data: bytes, target_size: int, cfg_name: str = '') -> bytes:
    """Append `#`-comment lines until len(data) == target_size.

    The padding is ICF-comment lines (`#` runs followed by CRLF) appended
    at the END of the content — never inserted in the middle, never
    prepended — so no real key is ever cut off. Raises ValueError if
    `data` is already larger than `target_size`; the caller is expected to
    surface that as a hard error (we never silently truncate real content).
    """
    if len(data) > target_size:
        raise ValueError(
            f"{cfg_name or 'content'} stripped to {len(data)} bytes is larger "
            f"than stock {target_size} bytes; remove {len(data) - target_size} bytes of content"
        )
    out = bytearray(data)
    while len(out) < target_size:
        remaining = target_size - len(out)
        # Reserve 2 bytes for a CRLF terminator if it fits; else fill the
        # gap with '#' chars and no newline (so the byte count is exact).
        if remaining > 2:
            line_len = min(remaining - 2, 64)
            out.extend(b'#' * line_len)
            out.extend(b'\r\n')
        else:
            out.extend(b'#' * remaining)
    return bytes(out)


# ── CLI commands ───────────────────────────────────────────────────────

def cmd_info(args):
    """Display container information."""
    with open(args.input, 'rb') as f:
        s3e_data = f.read()

    decompressed = decompress_s3e(s3e_data)
    is_xe3u = decompressed.startswith(S3E_MAGIC)

    print(f"File:      {args.input}")
    print(f"Compressed: {len(s3e_data)} bytes")
    print(f"Decompressed: {len(decompressed)} bytes")
    print()

    if not is_xe3u:
        print("WARNING: decompressed data does not start with XE3U magic")
        print(f"First 16 bytes: {decompressed[:16].hex()}")
        return

    info = S3EInfo(decompressed)
    print(f"Magic:     {decompressed[:4].decode('ascii')}")
    print(f"Version:   0x{struct.unpack_from('<I', decompressed, 0x04)[0]:08x}")
    sdk = decompressed[8:12]
    print(f"SDK:       {sdk[0]}.{sdk[1]}.{sdk[2]}.{sdk[3]}")

    print()
    print("=== XE3U Offsets ===")
    print(f"  Symbol table:  0x{struct.unpack_from('<I', decompressed, 0x0C)[0]:06x}")
    print(f"  Data offset 1: 0x{struct.unpack_from('<I', decompressed, 0x10)[0]:06x}")
    print(f"  Code entry:    0x{struct.unpack_from('<I', decompressed, 0x14)[0]:06x}")
    print(f"  Data section:  0x{struct.unpack_from('<I', decompressed, 0x18)[0]:06x}")
    print(f"  VA entry:      0x{struct.unpack_from('<I', decompressed, 0x1C)[0]:06x}")
    print(f"  Sig block:     0x{info.sig_off:06x} ({info.sig_size} bytes)")
    print(f"  Trailer:       0x{info.trailer_off:06x} ({info.trailer_size} bytes)")

    print()
    print("=== Sig Block (140 bytes) ===")
    sb = info.sig_block
    sig_type = struct.unpack_from('<I', sb, 0)[0]
    self_ref = struct.unpack_from('<I', sb, 4)[0]
    sig_hash = struct.unpack_from('<I', sb, 8)[0]
    print(f"  Type:       0x{sig_type:08x}")
    print(f"  Self-ref:   0x{self_ref:08x}")
    print(f"  Hash:       0x{sig_hash:08x}")
    print(f"  RSA-1024:   {sb[12:140].hex()}")

    print()
    print("=== Trailer (288 bytes, XOR'd with 0xEE) ===")
    xored = bytes(b ^ 0xEE for b in info.trailer)
    # Find license text
    text_start = xored.find(b'LICENSE')
    if text_start >= 0:
        text_end = xored.find(b'\x00', text_start)
        if text_end < 0:
            text_end = text_start + 200
        license_text = xored[text_start:text_end].decode('ascii', errors='replace')
        print(f"  License text: {license_text[:80]}...")
    else:
        print(f"  XOR'd hex: {xored[:64].hex()}")

    configs = extract_configs(decompressed)
    print()
    print(f"=== Config Sections ({len(configs)}) ===")
    for cfg in configs:
        print(f"  {cfg['name']}: offset 0x{cfg['offset']:06x}, {len(cfg['data'])} bytes")

    # Parse symbols
    sym_off = struct.unpack_from('<I', decompressed, 0x0C)[0]
    if sym_off + 10 <= len(decompressed):
        flags = struct.unpack_from('<I', decompressed, sym_off)[0]
        sym_count = struct.unpack_from('<H', decompressed, sym_off + 8)[0]
        print(f"\n=== File Table Entry (at 0x{sym_off:06x}) ===")
        print(f"  Flags: 0x{flags:08x}, Symbol count: {sym_count}")

        # List first few symbols
        sym_start = sym_off + 10
        pos = sym_start
        symbols = []
        while pos < len(decompressed) and len(symbols) < sym_count:
            end = decompressed.find(b'\x00', pos)
            if end == -1:
                break
            try:
                name = decompressed[pos:end].decode('ascii')
                symbols.append(name)
            except UnicodeDecodeError:
                break
            pos = end + 1

        if symbols:
            print(f"\n=== Symbols ({len(symbols)} total) ===")
            for name in symbols[:5]:
                print(f"  {name}")
            if len(symbols) > 5:
                print(f"  ... ({len(symbols) - 5} more)")


def cmd_unpack(args):
    """Unpack .s3e into a working directory with editable configs."""
    with open(args.input, 'rb') as f:
        s3e_data = f.read()

    decompressed = decompress_s3e(s3e_data)
    if not decompressed.startswith(S3E_MAGIC):
        print("ERROR: decompressed data is not a valid XE3U container", file=sys.stderr)
        sys.exit(1)

    info = S3EInfo(decompressed)
    out_dir = args.output_dir
    os.makedirs(out_dir, exist_ok=True)

    # Write full decompressed container (for reference / direct editing)
    with open(os.path.join(out_dir, 'decompressed.s3e'), 'wb') as f:
        f.write(decompressed)

    # Write the compressed original (for reference)
    with open(os.path.join(out_dir, 'original.s3e'), 'wb') as f:
        f.write(s3e_data)

    # Extract config sections
    configs = extract_configs(decompressed)
    print(f"Config sections found: {len(configs)}")
    for cfg in configs:
        path = os.path.join(out_dir, cfg['name'])
        with open(path, 'wb') as f:
            f.write(cfg['data'])
        print(f"  Extracted: {cfg['name']} ({len(cfg['data'])} bytes, offset 0x{cfg['offset']:06x}, span_end 0x{cfg['span_end']:06x}, pad {len(cfg['pad'])} bytes)")
        if cfg['pad']:
            pad_path = os.path.join(out_dir, 'pad_' + cfg['name'])
            with open(pad_path, 'wb') as f:
                f.write(cfg['pad'])

    # Extract symbol table
    sym_off = struct.unpack_from('<I', decompressed, 0x0C)[0]
    if sym_off + 10 <= len(decompressed):
        sym_count = struct.unpack_from('<H', decompressed, sym_off + 8)[0]
        sym_start = sym_off + 10
        pos = sym_start
        symbols = []
        while pos < len(decompressed) and len(symbols) < sym_count:
            end = decompressed.find(b'\x00', pos)
            if end == -1:
                break
            try:
                name = decompressed[pos:end].decode('ascii')
                symbols.append(name)
            except UnicodeDecodeError:
                break
            pos = end + 1

        if symbols:
            sym_path = os.path.join(out_dir, 'exports.txt')
            with open(sym_path, 'w') as f:
                for name in symbols:
                    f.write(name + '\n')
            print(f"  Extracted: exports.txt ({len(symbols)} symbols)")

    # Extract and preserve sig block + trailer
    sig_path = os.path.join(out_dir, 'sig_block.bin')
    with open(sig_path, 'wb') as f:
        f.write(info.sig_block)
    print(f"  Extracted: sig_block.bin ({info.sig_size} bytes, at 0x{info.sig_off:06x})")

    trailer_path = os.path.join(out_dir, 'trailer.bin')
    with open(trailer_path, 'wb') as f:
        f.write(info.trailer)
    print(f"  Extracted: trailer.bin ({info.trailer_size} bytes, at 0x{info.trailer_off:06x})")

    # Write metadata for repack
    meta_path = os.path.join(out_dir, 's3e_meta.txt')
    with open(meta_path, 'w') as f:
        f.write(f"# S3E metadata - used by 'repack' command\n")
        f.write(f"# Edit the .icf files above, then run: python boz_s3e_tool.py repack <output.s3e>\n")
        f.write(f"\n")
        f.write(f"original_size={len(decompressed)}\n")
        f.write(f"content_size={info.content_end}\n")
        f.write(f"content_end=0x{info.content_end:08x}\n")
        f.write(f"sig_offset=0x{info.sig_off:08x}\n")
        f.write(f"sig_size={info.sig_size}\n")
        f.write(f"trailer_offset=0x{info.trailer_off:08x}\n")
        f.write(f"trailer_size={info.trailer_size}\n")
        f.write(f"padding_size={PADDING_SIZE}\n")
        f.write(f"\n")
        f.write(f"# Config section offsets within decompressed.s3e\n")
        f.write(f"# For each config: offset = content start; size = editable content\n")
        f.write(f"# length; span_end = where the next section begins; pad = the\n")
        f.write(f"# fixed inter-section padding bytes (preserved verbatim on\n")
        f.write(f"# size-changing edits so the block layout start/stop stays intact).\n")
        for cfg in configs:
            f.write(f"config_{cfg['name']}_offset=0x{cfg['offset']:08x}\n")
            f.write(f"config_{cfg['name']}_size={len(cfg['data'])}\n")
            f.write(f"config_{cfg['name']}_span_end=0x{cfg['span_end']:08x}\n")
            f.write(f"config_{cfg['name']}_pad_size={len(cfg['pad'])}\n")
        f.write(f"# The sig_block.bin and trailer.bin files are preserved from the original.\n")
        f.write(f"# The decompressed.s3e file has the editable content.\n")
    print(f"  Extracted: s3e_meta.txt (metadata for repack)")

    print(f"\nWorking directory: {out_dir}")
    print(f"  -> Edit the .icf files or decompressed.s3e directly")
    print(f"  -> Then run: python boz_s3e_tool.py repack {out_dir} <output.s3e>")


def cmd_repack(args):
    """Repack working directory back to .s3e.

    Reads decompressed.s3e (the editable container), optionally edits each
    edited-.icf file via strip+pad-to-stock-size (see below), then appends
    the preserved sig_block.bin + trailer.bin.

    Edit policy (the only on-device-verified working shrink path):
      - Each edited ICF is stripped of comments + normalised whitespace
        (`strip_icf`), then padded back to its STOCK content byte length
        with `#`-comment lines appended at the end (`pad_to_size`).
      - If a stripped edit is larger than the stock config size, the tool
        ERRORS OUT — it never silently truncates real content.
      - Result: every config's on-disk SPAN is byte-identical to stock, so
        no downstream header offset field ever shifts. The sig block stays
        at stock `0x456df3` and the trailer at stock `0x456e7f`. This is
        the only layout the Marmalade loader accepts for a content-modified
        boz.s3e (verified on device 2026-08-09: any offset shift →
        477/478/479 + `Invalid .s3e file`).

    When no edits were made (content byte-identical to original), the
    original compressed stream is preserved (byte-identical round-trip),
    because Python's LZMA encoder produces different bytes than the
    Marmalade LZMA SDK.
    """
    in_dir = args.input_dir

    # Read decompressed content (may have been edited)
    dec_path = os.path.join(in_dir, 'decompressed.s3e')
    if not os.path.exists(dec_path):
        print(f"ERROR: decompressed.s3e not found in {in_dir}", file=sys.stderr)
        sys.exit(1)
    with open(dec_path, 'rb') as f:
        content = bytearray(f.read())

    # Read preserved sig block + trailer
    sig_path = os.path.join(in_dir, 'sig_block.bin')
    trailer_path = os.path.join(in_dir, 'trailer.bin')
    meta_path = os.path.join(in_dir, 's3e_meta.txt')

    if not os.path.exists(sig_path) or not os.path.exists(trailer_path):
        print(f"ERROR: sig_block.bin and trailer.bin are required for repack", file=sys.stderr)
        print(f"  Run 'unpack' first to extract them.", file=sys.stderr)
        sys.exit(1)

    with open(sig_path, 'rb') as f:
        sig_block = f.read()
    with open(trailer_path, 'rb') as f:
        trailer = f.read()

    # Read metadata
    sig_off_orig = H_SIG_OFF
    trailer_off_orig = H_TRAILER_OFF
    content_size = None
    if os.path.exists(meta_path):
        with open(meta_path) as f:
            for line in f:
                line = line.strip()
                if line.startswith('sig_offset='):
                    sig_off_orig = int(line.split('=', 1)[1], 16)
                elif line.startswith('trailer_offset='):
                    trailer_off_orig = int(line.split('=', 1)[1], 16)
                elif line.startswith('content_size='):
                    content_size = int(line.split('=', 1)[1])

    # Strip sig block + trailer from content first.
    # The decompressed.s3e may already contain the sig block + trailer at the
    # position recorded in the XE3U header (which may have been shifted by prior
    # edits). We find the ACTUAL sig block position by searching for the sig_block
    # bytes, rather than trusting the metadata's content_size/sig_off.
    content_end = content_size if content_size is not None else sig_off_orig

    if content.startswith(S3E_MAGIC) and len(content) > sig_off_orig:
        # Find the actual sig block position in the content
        sig_off_in_content = content.find(sig_block)
        if sig_off_in_content >= 0:
            # Sig block found — strip everything from it onwards
            content = content[:sig_off_in_content]
            content_end = sig_off_in_content
            print(f"  Stripped sig block + trailer from content (sig was at 0x{sig_off_in_content:06x}, content_end={content_end})")
        else:
            # Sig block not found — strip at content_end (metadata offset or header sig_off)
            content = content[:content_end]
            print(f"  Stripped content at content_end=0x{content_end:06x} (sig block not found in content)")
    elif len(content) < content_end:
        print(f"  WARNING: content is {len(content)} bytes, less than original {content_end}")
        print(f"  (header offsets may point beyond content — but .so is patched)")

    # Patch edited ICF configs back into the decompressed content. Every
    # config occupies a fixed on-disk SPAN [cfg_offset, span_end) = editable
    # ICF content + optional fixed inter-section padding (e.g. the 3-byte
    # "\r\n\n" between s3e.icf and game_config.icf). The on-device-verified
    # working path is to keep each config's SPAN byte-identical to stock:
    # we strip comments + whitespace from the edited ICF, pad it back to the
    # STOCK content size with `#`-comment lines appended at the end, then
    # overwrite exactly the content bytes in place. The fixed pad + the
    # binary + every header offset field stay untouched. No offset ever
    # shifts — the only layout the Marmalade loader accepts for an edited
    # boz.s3e (shifting offsets → 477/478/479 + `Invalid .s3e file`).
    config_names = ['s3e.icf', 'game_config.icf', 'download_config.icf']
    for cfg_name in config_names:
        cfg_path = os.path.join(in_dir, cfg_name)
        if not os.path.exists(cfg_path):
            continue
        with open(cfg_path, 'rb') as f:
            new_cfg_data = f.read()

        # Read per-config metadata: content offset, content size, pad size
        offset_key = f'config_{cfg_name}_offset'
        size_key = f'config_{cfg_name}_size'
        cfg_offset = None
        cfg_size = None
        if os.path.exists(meta_path):
            with open(meta_path) as f:
                for line in f:
                    line = line.strip()
                    if line.startswith(offset_key + '='):
                        cfg_offset = int(line.split('=', 1)[1], 16)
                    elif line.startswith(size_key + '='):
                        cfg_size = int(line.split('=', 1)[1])

        if cfg_offset is None or cfg_size is None:
            print(f"  WARNING: no metadata for {cfg_name}; leaving content untouched")
            continue

        # Skip the strip+pad path entirely when the user's file already
        # matches the stock content byte-for-byte (the common no-edit case,
        # or an in-place same-size edit). This preserves byte-identical
        # round-trips without touching the content bytes.
        if len(new_cfg_data) == cfg_size and content[cfg_offset:cfg_offset + cfg_size] == new_cfg_data:
            print(f"  {cfg_name}: byte-identical to stock ({cfg_size} bytes at 0x{cfg_offset:06x}) — untouched")
            continue

        stripped = strip_icf(new_cfg_data)
        try:
            padded = pad_to_size(stripped, cfg_size, cfg_name)
        except ValueError as e:
            print(f"ERROR: {e}", file=sys.stderr)
            print(f"  Stripped content is larger than the stock config size;", file=sys.stderr)
            print(f"  trim your edit or remove content to fit {cfg_size} bytes.", file=sys.stderr)
            sys.exit(2)
        content[cfg_offset:cfg_offset + cfg_size] = padded
        pad_added = cfg_size - len(stripped)
        print(f"  Patched {cfg_name}: stripped {len(new_cfg_data)} -> {len(stripped)} bytes, "
              f"padded +{pad_added} bytes of '#' comments to stock {cfg_size} at 0x{cfg_offset:06x}")

    # The content is now exactly the stock content size (every edited config
    # was padded back to its stock byte length; untouched configs + the
    # binary section never moved). So sig_off / trailer_off / every header
    # offset field retain their stock values — nothing to re-point.
    if content_size is not None:
        if len(content) != content_size:
            print(f"  WARNING: content is {len(content)} bytes, expected stock {content_size} — "
                  f"header offsets may be stale", file=sys.stderr)
        else:
            print(f"  Content is stock size ({content_size} bytes) — all header offsets unchanged")

    use_padding = 0
    padding_bytes = b''
    print(f"\nContent size:  {len(content)} bytes")
    print(f"Padding:       {use_padding} bytes (at 0x{len(content):06x})")
    print(f"Sig block:     {len(sig_block)} bytes (preserved from original)")
    print(f"Trailer:       {len(trailer)} bytes (preserved from original)")

    # Build the repacked container:
    # content + sig_block(140) + trailer(288)  (no gap before sig, like stock)
    result = bytearray(content)
    if use_padding:
        result.extend(padding_bytes)
    result.extend(sig_block)
    result.extend(trailer)

    total = len(result)
    new_sig_off = len(content) + use_padding
    new_trailer_off = new_sig_off + len(sig_block)

    print(f"\nNew layout:")
    print(f"  Content:    0x000000 - 0x{len(content):06x} ({len(content)} bytes)")
    if use_padding:
        print(f"  Padding:    0x{len(content):06x} - 0x{new_sig_off:06x} ({use_padding} bytes)")
    print(f"  Sig block:  0x{new_sig_off:06x} - 0x{new_trailer_off:06x} ({len(sig_block)} bytes)")
    print(f"  Trailer:    0x{new_trailer_off:06x} - 0x{total:06x} ({len(trailer)} bytes)")

    # Defence-in-depth: the strip+pad policy guarantees new_sig_off == the
    # stock sig_off (content size is preserved). If this ever fails, the
    # policy is broken — fail loudly rather than silently re-pointing offsets
    # (re-pointing is the Option-2 path that's proven to fail on device).
    if new_sig_off != sig_off_orig:
        print(f"ERROR: content size changed (new_sig_off=0x{new_sig_off:06x} vs stock "
              f"0x{sig_off_orig:06x}) — strip+pad policy violated; refusing to write a "
              f"layout-shifting container (proven to fail on device).", file=sys.stderr)
        sys.exit(2)
    if new_trailer_off != trailer_off_orig:
        print(f"ERROR: trailer offset drifted (0x{new_trailer_off:06x} vs stock "
              f"0x{trailer_off_orig:06x}) — strip+pad policy violated.", file=sys.stderr)
        sys.exit(2)

    # For no-edit round-trip when no edits were made: preserve the
    # original compressed file. Python's pyliblzma encoder may produce
    # different compressed bytes than the original LZMA SDK, so we bypass
    # recompression entirely when the result matches the original exactly.
    # This check compares the full decompressed content (including sig block
    # and trailer) to detect if any edits were made at all.
    orig_s3e_path = os.path.join(in_dir, 'original.s3e')
    s3e_data = None
    if os.path.exists(orig_s3e_path):
        with open(orig_s3e_path, 'rb') as f:
            orig_s3e = f.read()
        try:
            orig_decomp = decompress_s3e(orig_s3e)
            if orig_decomp == bytes(result):
                print(f"  Content is byte-identical to original — preserving original compressed stream")
                s3e_data = orig_s3e
        except Exception:
            pass  # Fall through to recompression

    if s3e_data is None:
        # Compress with LZMA
        s3e_data = compress_s3e(result)

    # Write output
    output_path = args.output
    if output_path is None:
        # Try to get from args or default
        output_path = os.path.join(in_dir, 'output.s3e')
    with open(output_path, 'wb') as f:
        f.write(s3e_data)

    print(f"\nSuccess!")
    print(f"  Decompressed: {len(result)} bytes")
    print(f"  Compressed:   {len(s3e_data)} bytes")
    print(f"  Output:       {output_path}")


def cmd_decompress(args):
    """Decompress .s3e to raw bytes."""
    with open(args.input, 'rb') as f:
        data = f.read()
    decompressed = decompress_s3e(data)
    with open(args.output, 'wb') as f:
        f.write(decompressed)
    print(f"Decompressed: {args.input} ({len(data)} bytes) -> {args.output} ({len(decompressed)} bytes)")
    if decompressed[:4] == S3E_MAGIC:
        print("OK: output begins with 'XE3U' Marmalade container magic.")


def cmd_compress(args):
    """Compress raw bytes to .s3e."""
    with open(args.input, 'rb') as f:
        data = f.read()
    s3e = compress_s3e(data)
    with open(args.output, 'wb') as f:
        f.write(s3e)
    print(f"Compressed: {args.input} ({len(data)} bytes) -> {args.output} ({len(s3e)} bytes)")


def main():
    parser = argparse.ArgumentParser(
        description='Tool for unpacking, editing, and repacking boz.s3e files.',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""\
Workflow:
  1. Unpack:  python boz_s3e_tool.py unpack app/src/main/assets/boz.s3e work/
  2. Edit:    Edit config files in work/ (s3e.icf, game_config.icf, etc.)
  3. Repack:  python boz_s3e_tool.py repack work/ output.s3e

The sig_block.bin and trailer.bin files are preserved from the original,
ensuring the RSA signature and Marmalade license remain intact after repacking.
"""
    )
    sub = parser.add_subparsers(dest='command', help='Available commands')

    p = sub.add_parser('info', help='Display container information')
    p.add_argument('input', help='Input .s3e file')
    p.set_defaults(func=cmd_info)

    p = sub.add_parser('unpack', help='Unpack .s3e into a working directory')
    p.add_argument('input', help='Input .s3e file')
    p.add_argument('output_dir', help='Output directory')
    p.set_defaults(func=cmd_unpack)

    p = sub.add_parser('repack', help='Repack working directory back to .s3e')
    p.add_argument('input_dir', help='Working directory (from unpack)')
    p.add_argument('output', nargs='?', default=None, help='Output .s3e file')
    p.set_defaults(func=cmd_repack)

    p = sub.add_parser('decompress', help='Decompress .s3e to raw bytes')
    p.add_argument('input', help='Input .s3e file')
    p.add_argument('output', help='Output file path')
    p.set_defaults(func=cmd_decompress)

    p = sub.add_parser('compress', help='Compress raw bytes to .s3e')
    p.add_argument('input', help='Input file (decompressed)')
    p.add_argument('output', help='Output .s3e file')
    p.set_defaults(func=cmd_compress)

    args = parser.parse_args()
    if not args.command:
        parser.print_help()
        sys.exit(1)

    args.func(args)


if __name__ == '__main__':
    main()
