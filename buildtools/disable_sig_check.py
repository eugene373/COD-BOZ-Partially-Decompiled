#!/usr/bin/env python3
"""
Disable signature checking in libs3e_android.so across all architectures.

The Marmalade engine's libs3e_android.so verifies signed s3e container files
(.s3e) at load time. This check prevents runtime modification of the game
archive — i.e. editing embedded s3e.cfg configuration or map data.

This script patches the signature-check branch in each architecture's copy
to always take the success path (return 0 / NOP the failure branch).

Patch technique per architecture:
  - armeabi      (ARM 32-bit,     ARM mode): BLE -> MOVNE R0, #0
  - armeabi-v7a  (ARM 32-bit,    Thumb mode): BLE -> MOVNE R0, #0
  - arm64-v8a    (AArch64, 64-bit):          B.LE -> NOP

Usage:
    python buildtools/disable_sig_check.py              # patch all found .so files
    python buildtools/disable_sig_check.py <file.so>   # patch specific file(s)
"""
import sys
import os
import struct
import glob

# Patch definitions per architecture.
# Each entry specifies the file offset and the instruction bytes.
PATCHES = {
    "armeabi": {
        "offset": 0x2496c,
        "patch":   b"\x00\x00\xa0\x13",  # movne r0, #0
        "expected": b"\x13\x00\x00\xda",  # ble +0x13 (original)
        "desc":    "BLE -> MOVNE R0, #0",
    },
    "armeabi-v7a": {
        "offset": 0x383b0,
        "patch":   b"\x00\x00\xa0\x13",  # movne r0, #0
        "expected": b"\x13\x00\x00\xda",  # ble +0x13 (original)
        "desc":    "BLE -> MOVNE R0, #0",
    },
    "arm64-v8a": {
        "offset": 0x2aa08,
        "patch":   b"\x1f\x20\x03\xd5",  # NOP  (0xd503201f)
        "expected": b"\x6d\x11\x00\x54",  # b.le +0x45c (original B.LE)
        "desc":    "B.LE -> NOP",
        # For arm64, accept any B.LE at this offset (different versions
        # may have different branch targets).
        "match_any_ble": True,
    },
}

# Magic string that appears in the signature-check code path of this .so.
# Used to verify we're patching the right file before applying changes.
# "Incorrect signature in s3e file" appears in the error path.
SIGNATURE_MARKER = b"Incorrect signature"


def detect_arch(path):
    """Detect the architecture of a .so file based on its path or ELF header."""
    path_norm = path.replace("\\", "/")
    for arch in PATCHES:
        if f"/{arch}/" in path_norm:
            return arch
    # Fallback: check ELF header e_machine field (bytes 18-19)
    try:
        with open(path, "rb") as f:
            f.seek(0x12)
            machine = struct.unpack("<H", f.read(2))[0]
            # EM_AARCH64 = 183, EM_ARM = 40
            if machine == 183:
                return "arm64-v8a"
            if machine == 40:
                # ARM 32-bit — can't distinguish Thumb vs ARM mode from header alone
                # Check path for more context
                return None
    except Exception:
        pass
    return None


def verify_is_boz_so(path):
    """Verify that the file is a BOZ libs3e_android.so by checking for the
    signature-check marker string. Returns True if the file is ours."""
    try:
        with open(path, "rb") as f:
            # Search for the marker string in the file
            data = f.read()
            if SIGNATURE_MARKER in data:
                return True
    except Exception:
        pass
    return False


def patch_so(path):
    """Patch a single libs3e_android.so file to disable signature checks.

    Returns True on success (patched or already patched), False on failure.
    """
    if not os.path.exists(path):
        print(f"  ERROR: File not found: {path}", file=sys.stderr)
        return False

    # Verify this is our file by checking for the signature marker string
    if not verify_is_boz_so(path):
        print(f"  SKIP: Not a BOZ libs3e_android.so (no signature marker found): {path}",
              file=sys.stderr)
        return False

    arch = detect_arch(path)
    if arch is None:
        print(f"  WARNING: Could not detect architecture: {path}", file=sys.stderr)
        return False

    config = PATCHES[arch]
    patch_offset = config["offset"]
    patch_bytes = config["patch"]
    expected_bytes = config["expected"]

    with open(path, "r+b") as f:
        f.seek(patch_offset)
        current = f.read(4)

        # Check if already patched
        if current == patch_bytes:
            print(f"  Already patched ({arch}): {path}")
            return True

        # Check if matches expected original instruction
        if current == expected_bytes:
            f.seek(patch_offset)
            f.write(patch_bytes)
            print(f"  Patched ({arch}, {config['desc']}): {path}")
            return True

        # For arm64: accept any B.LE instruction at the offset (different builds
        # may have different branch targets but same instruction type)
        if config.get("match_any_ble") and arch == "arm64-v8a":
            val = struct.unpack("<I", current)[0]
            if (val & 0xff000000) == 0x54000000 and (val & 0x0f) == 0x0d:
                # It's a B.LE — check it's in the expected address range
                # and target is the success path (0x2ac34 -> mov w0, #0)
                f.seek(patch_offset)
                f.write(patch_bytes)
                print(f"  Patched ({arch}, different B.LE target 0x{val:08x}): {path}")
                return True

        # For ARM32: accept any BLE instruction (same encoding for both armeabi and v7a)
        if arch in ("armeabi", "armeabi-v7a"):
            val = struct.unpack("<I", current)[0]
            if (val & 0xff000000) == 0xda000000 and (val >> 24) == 0xda:
                # BLE encoding: bits[31:25]=1101111, bits[24:21]=cond(0x0d=LE for BLE)
                # Actually: BLE is 0xda000000 | imm8 | 0x0d
                cond = val & 0xf
                if cond == 0x0d:  # LE condition
                    f.seek(patch_offset)
                    f.write(patch_bytes)
                    print(f"  Patched ({arch}, different BLE target 0x{val:08x}): {path}")
                    return True

        print(f"  UNEXPECTED: At offset 0x{patch_offset:x}: found 0x{current.hex()}",
              file=sys.stderr)
        print(f"  Expected: {expected_bytes.hex(' ')} (original {arch} instruction)",
              file=sys.stderr)
        print(f"  File may be a different version.", file=sys.stderr)
        return False


def main():
    if len(sys.argv) >= 2:
        # Patch specific files passed as arguments
        results = []
        for path in sys.argv[1:]:
            results.append(patch_so(path))
        if not all(results):
            sys.exit(1)
    else:
        # Default: patch all libs3e_android.so files
        print("Patching all libs3e_android.so files...")
        so_files = glob.glob("app/**/jniLibs/**/libs3e_android.so", recursive=True)
        # Also check build intermediates
        so_files += glob.glob("app/build/intermediates/**/*.so", recursive=True)
        # Deduplicate while preserving order
        seen = set()
        unique_files = []
        for f in so_files:
            if f not in seen and "libs3e_android.so" in f:
                seen.add(f)
                unique_files.append(f)

        results = []
        for path in unique_files:
            results.append(patch_so(path))
        if not all(results):
            sys.exit(1)


if __name__ == "__main__":
    main()
