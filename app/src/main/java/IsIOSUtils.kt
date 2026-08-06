import java.nio.ByteBuffer
import java.util.HashMap

object IsIOSUtils {
    const val SEPARATOR_CHAR = 0x23.toChar()

    @JvmField
    var fileName: String = ".temp.bin"

    @JvmField
    var kobjMap: HashMap<String, KeychainObject> = HashMap()

    @JvmField
    var initKobjMap: Boolean = true

    @JvmStatic
    fun Test(): Boolean = true

    @JvmStatic
    fun IsInstallExceptionHandler() {}

    @JvmStatic
    fun IsInstallMemoryWarningHandler(tag: String, message: String, log: Boolean) {}

    @JvmStatic
    fun IsUninstallExceptionHandler() {}

    @JvmStatic
    fun IsUninstallMemoryWarningHandler() {}

    @JvmStatic
    fun IsSimulateMemoryWarning() {}

    @JvmStatic
    fun IsOSMalloc(size: Int) {}

    @JvmStatic
    fun IsOSRealloc(size: Int) {}

    @JvmStatic
    fun IsOSFree() {}

    @JvmStatic
    fun IsKeychainTerminate() {
        kobjMap.clear()
    }

    @JvmStatic
    fun IsKeychainWriteKey(key: String, value: String): Boolean {
        val activity = com.ideaworks3d.marmalade.LoaderAPI.getActivity()
        if (activity == null) {
            return false
        }

        if (!kobjMap.containsKey(key)) {
            val obj = KeychainObject()
            obj.valid = true
            obj.crc = -1
            kobjMap.put(key, obj)
        }

        var crc: Int = 0
        try {
            crc = Integer.parseInt(value)
        } catch (e: Exception) {
        }

        val obj = kobjMap[key]
        if (obj?.crc == crc) {
            return true
        }
        obj?.crc = crc

        try {
            val fos = activity.openFileOutput(fileName, 0)
            val entries = kobjMap.entries
            for ((k, v) in entries) {
                val keyChars = k.toCharArray()
                val bufferSize = keyChars.size * 2 + 2 + 4
                val buffer = ByteBuffer.allocate(bufferSize)
                for (c in keyChars) {
                    buffer.putChar(c)
                }
                buffer.putChar(SEPARATOR_CHAR)
                buffer.putInt(v.crc)
                buffer.rewind()
                fos.write(buffer.array())
            }
            fos.close()
        } catch (e: Exception) {
            return false
        }

        initKobjMap = false
        return true
    }

    @JvmStatic
    fun IsKeychainReadKey(key: String): Int {
        if (!kobjMap.containsKey(key)) {
            return 0
        }
        val obj = kobjMap[key]
        if (obj == null) return 0
        if (!obj.valid || obj.crc == -1) {
            return 0
        }
        return obj.crc
    }

    @JvmStatic
    fun IsKeychainSearchKey(key: String): Boolean {
        if (!kobjMap.containsKey(key)) {
            return false
        }
        val obj = kobjMap[key]
        if (obj == null) return false
        if (!obj.valid || obj.crc == -1) {
            return false
        }
        return true
    }

    @JvmStatic
    fun IsKeychainInit(filename: String): Boolean {
        val activity = com.ideaworks3d.marmalade.LoaderAPI.getActivity()
        if (activity == null) {
            return true
        }

        if (!initKobjMap) {
            return true
        }

        try {
            val fis = activity.openFileInput(fileName)
            val buf = ByteArray(0xffff)
            val len = fis.read(buf)
            if (len == -1) {
                fis.close()
                initKobjMap = false
                return true
            }

            val bb = ByteBuffer.wrap(buf, 0, len)
            var key = ""
            while (bb.position() < len) {
                val c = bb.getChar()
                if (c == SEPARATOR_CHAR) {
                    val crc = bb.getInt()
                    val obj = KeychainObject()
                    obj.valid = true
                    obj.crc = crc
                    kobjMap.put(key, obj)
                    key = ""
                } else {
                    key += c
                }
            }
            fis.close()

            initKobjMap = false
            return true
        } catch (e: Exception) {
            initKobjMap = false
            return true
        }
    }
}
