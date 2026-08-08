import lzma
import sys
import os

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

compressed = lzma.compress(
    data,
    format=lzma.FORMAT_ALONE,
    filters=filters
)

with open(output_file, "wb") as f:
    f.write(compressed)

print("Created LZMA_Alone archive.")