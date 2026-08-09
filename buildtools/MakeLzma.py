import lzma
import struct
import sys

input_file = sys.argv[1]
output_file = sys.argv[2]

filters = [{
    "id": lzma.FILTER_LZMA1,
    "dict_size": 64 * 1024,
    "lc": 3,
    "lp": 0,
    "pb": 2,
}]

with open(input_file, "rb") as f:
    data = f.read()

# boz.s3e uses FORMAT_RAW (LZMA1-RAW) with a 13-byte header prepended
# header: 1 byte props (0x5D = lc=3/lp=0/pb=2) + 4 bytes dict_size + 8 bytes uncompressed_size
compressed = lzma.compress(
    data,
    format=lzma.FORMAT_RAW,
    filters=filters
)

# Build the 13-byte header matching the original
props_byte = 0x5D
dict_size = 64 * 1024
header = bytes([props_byte]) + struct.pack('<I', dict_size) + struct.pack('<Q', len(data))
compressed = header + compressed

with open(output_file, "wb") as f:
    f.write(compressed)

print(f"Created LZMA1-RAW archive ({len(compressed)} bytes), decompressed size: {len(data)}")
