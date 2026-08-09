# BOZ.s3e Container Analysis

## Quick Start

```bash
# Decompress and parse the s3e container
python ReadLzma.py boz.s3e boz_contents/
python UnmakeLzma.py boz.s3e boz_decompressed.s3e
```

## Tools

| Tool | Purpose |
|------|---------|
| `UnmakeLzma.py` | Decompresses the 13-byte LZMA1-RAW header |
| `ReadLzma.py` | Parses the resulting XE3U container (header, 3 ICF configs, symbol table) |
| `MakeLzma.py` | Compresses back to `.s3e` format (uses FORMAT_ALONE — needs adjustment for exact match) |

## Container Format

The `boz.s3e` file uses a **Marmalade XE3U container**:

1. **Outer layer**: LZMA1-RAW compression with 13-byte header (1 byte props + 12 reserved)
2. **Inner layer**: XE3U container with header, config files, symbol table, and binary payload

### XE3U Header (40 bytes)

| Offset | Size | Field | Value | Description |
|--------|------|-------|-------|-------------|
| 0x00 | 4 | magic | `XE3U` | Container magic bytes |
| 0x04 | 4 | version | `0x00042800` | Format version |
| 0x08 | 4 | sdk_version | `10.0.12.1` | Marmalade SDK version (10, 0, 12, 1) |
| 0x0C | 4 | sym_table_off | `0x43F3` | Offset to symbol table / file table entry |
| 0x10 | 4 | field_16 | `0x35090` | Offset to data table in binary section |
| 0x14 | 4 | field_20 | `0x39483` | ARM code entry point offset |
| 0x18 | 4 | field_24 | `0x41D970` | ARM data section offset |
| 0x1C | 4 | field_28 | `0x4A7DC8` | ARM code virtual address (entry point VA) |
| 0x20 | 4 | field_32 | `0x456DF3` | End-of-file hash/signature offset |
| 0x24 | 4 | field_36 | `0x8C` (140) | Hash/signature size in bytes |

## Layout

```
0x0000  ┌─────────────────┐
        │  XE3U Header    │ 40 bytes
0x0028  ├─────────────────┤
0x004C  │  Config 1       │ Main s3e.icf (~4.4 KB)
        │  s3e.icf        │ Global engine config
0x11CA  ├─────────────────┤
        │  Config 2       │ Game config (~11.7 KB)
        │  game_config    │ Demonware, NETWORK, GAME, TRACE, etc.
0x4200  ├─────────────────┤
        │  Config 3       │ Download config (~1.1 KB)
        │  download_conf  │ RSA key, CDN links, AndroidExtSo
0x43F3  ├─────────────────┤
        │  File Table     │ 10 bytes: flags(4) + cfg_off(4) + sym_cnt(2)
0x43FD  ├─────────────────┤
        │  Symbol Table   │ 391 symbols (~6.5 KB)
0x5D52  ├─────────────────┤
        │  Binary Data    │ 4.3 MB
        │  (ARM code +    │ Texture tables + embedded assets
        │   textures)     │
0x456F  └─────────────────┘
```

## Symbol Table (391 entries)

The symbol table contains 391 JNI function names that `libs3e_android.so` registers
via `RegisterNatives`. Categories:

- **144** `s3e*` — Marmalade S3E API functions
- **224** `gl*` — OpenGL ES 1.x/2.0 functions
- **23** `egl*` — EGL functions

Full list: see `boz_contents/exports.txt`

## Binary Section

The 4.3 MB binary section contains:

1. **ARM executable code** starting at header field `@0x14` (0x39483)
   - Entry instruction: `e59f008c` = `ldr r0, [r15, #0x8c]` (PIC trampoline)
   
2. **Texture offset tables** starting at field `@0x10` (0x35090)
   - 612 tables with varying entry counts
   - Each entry: 32-bit value like `0x3DC0XXXX` incrementing by 0x400
   
3. **Embedded game assets** (textures, sounds, etc.)

4. **End-of-file hash**: 140 bytes at offset 0x456DF3

## Config Sections

### Section 1: s3e.icf
Global engine config — platform-specific rendering, memory, input, and EGL settings.
Covers Windows, Windows Phone 8, Linux, QNX, Android, Tizen, OSX, Roku, NACL, LGTV.

### Section 2: game_config.icf
Game-specific settings including:
- Demonware network configuration (dev/prod servers)
- Memory bucket sizes
- Network timeouts and protocol versions
- Online account settings
- Flash/IwGx rendering settings
- Device-specific overrides for iPhone/Android
- Deploy config conditionals (debug/profiling/heap analyser)

### Section 3: download_config.icf
Resource download configuration:
- RSA public key for Google Play Billing
- CDN download links (dev: `10.80.0.199:8080`, prod: `cdn-boz-android.callofduty.com`)
- Android external library list (`AndroidExtSo`)
- App version info and GL ES settings

## Detailed Documentation

See `boz_s3e_icf_analysis.md` for full setting-by-setting documentation.
