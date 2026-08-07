package com.ideaworks3d.marmalade

import android.content.Intent
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore.Images.Media
import android.util.Log
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.net.URL
import java.text.SimpleDateFormat
import java.util.Date

internal class s3eImagePicker {
    @Volatile private var waitingForFile = false

    external fun ImagePicker_addResultString(path: String): Boolean

    fun s3eImagePickerSaveToGallery(
        isRawPath: Boolean,
        unused1: Int,
        unused2: Int,
        path: String,
        data: ByteArray,
    ): Int {
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        if (isRawPath) {
            val cleaned = path.replace("raw://", "")
            var result: String? = null
            try {
                result = Media.insertImage(LoaderActivity.m_Activity!!.contentResolver, cleaned, timestamp, " ")
            } catch (e: FileNotFoundException) {
                Log.d("IMAGEPICKER", e.toString())
            }
            return if (result == null) 6 else 0
        }
        Log.d("IMAGEPICKER", "saving to gallery from file")
        val bmp: Bitmap = BitmapFactory.decodeByteArray(data, 0, data.size)
        val result = Media.insertImage(LoaderActivity.m_Activity!!.contentResolver, bmp, timestamp, " ")
        if (result == null) {
            Log.d("IMAGEPICKER", "insertImage result : error not saved from buffer to galery  $result")
            return 6
        }
        Log.d("IMAGEPICKER", "insertImage result :  $result")
        return 0
    }

    fun s3eImagePickerToFile(type: Int, unused: Int): String? {
        var intent = Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI)
        when (type) {
            S3E_IMAGEPICKER_FORMAT_ANY -> {
                intent = Intent("android.intent.action.PICK")
                intent.type = "*/*"
            }
            S3E_IMAGEPICKER_FORMAT_JPG, S3E_IMAGEPICKER_FORMAT_PNG, S3E_IMAGEPICKER_FORMAT_BMP,
            S3E_IMAGEPICKER_FORMAT_GIF, S3E_IMAGEPICKER_FORMAT_ANYIMAGE -> intent.type = "image/*"
            S3E_IMAGEPICKER_FORMAT_ANYVIDEO -> {
                intent = Intent("android.intent.action.PICK", android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI)
                intent.type = "video/*"
            }
            else -> return null
        }
        val result = LoaderActivity.m_Activity!!.ExecuteIntent(intent) ?: return null
        val uri = result.data ?: return null
        val file = convertUriToFile(uri) ?: return null
        val raw = "raw://" + file.path
        return if (!ImagePicker_addResultString(raw)) null else raw
    }

    private fun CopyStream(input: InputStream, output: OutputStream): Boolean {
        var total = 0
        return try {
            val buf = ByteArray(1024)
            while (true) {
                val read = input.read(buf, 0, 1024)
                if (read == -1) break
                output.write(buf, 0, read)
                total += read
            }
            total > 0
        } catch (e: Exception) {
            trace("Exception: ${e.message}")
            false
        }
    }

    private fun getPicasaFile(uri: Uri): File? {
        val baseDir = if (Environment.getExternalStorageState() == "mounted") {
            File(LoaderActivity.m_Activity!!.externalCacheDir, "Picasa")
        } else {
            LoaderActivity.m_Activity!!.cacheDir
        }
        if (!baseDir.exists()) baseDir.mkdirs()
        return try {
            val temp = File.createTempFile("img", ".jpg", baseDir)
            val input: InputStream =
                if (!uri.toString().startsWith("content://com.android.gallery3d") &&
                    !uri.toString().startsWith("content://com.google.android.gallery3d")
                ) {
                    URL(uri.toString()).openStream()
                } else {
                    LoaderActivity.m_Activity!!.contentResolver.openInputStream(uri) ?: return null
                }
            FileOutputStream(temp).use { fos ->
                if (!CopyStream(input, fos)) {
                    temp.delete()
                    return null
                }
            }
            temp
        } catch (e: Exception) {
            trace("Exception: ${e.message}")
            null
        }
    }

    private fun convertUriToFile(uri: Uri): File? {
        val out = arrayOfNulls<File>(1)
        val projection = arrayOf("_data", "_display_name")
        val cursor: Cursor? = LoaderActivity.m_Activity!!.contentResolver.query(uri, projection, null, null, null)
        if (cursor != null) {
            cursor.moveToFirst()
            val dataIdx = cursor.getColumnIndex("_data")
            if (!uri.toString().startsWith("content://com.android.gallery3d") &&
                !uri.toString().startsWith("content://com.google.android.gallery3d")
            ) {
                val dataPath = cursor.getString(dataIdx)
                cursor.close()
                return File(dataPath)
            }
            val nameIdx = cursor.getColumnIndex("_display_name")
            if (nameIdx != -1) {
                waitingForFile = true
                LoaderActivity.m_Activity!!.ShowProgressDialog()
                Thread {
                    out[0] = getPicasaFile(uri)
                    waitingForFile = false
                }.start()
            }
        } else if (uri.toString().isNotEmpty()) {
            waitingForFile = true
            LoaderActivity.m_Activity!!.ShowProgressDialog()
            Thread {
                out[0] = getPicasaFile(uri)
                waitingForFile = false
            }.start()
        }
        while (waitingForFile) {
            LoaderAPI.s3eDeviceYield(1)
        }
        LoaderActivity.m_Activity!!.HideProgressDialog()
        return out[0]
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    inner class ImagePickerResult {
        @JvmField var format: Int = 0
        @JvmField var path: String? = null
        @JvmField var size: Int = 0
    }

    companion object {
        const val S3E_IMAGEPICKER_FORMAT_ANY = 0
        const val S3E_IMAGEPICKER_FORMAT_JPG = 1
        const val S3E_IMAGEPICKER_FORMAT_PNG = 2
        const val S3E_IMAGEPICKER_FORMAT_BMP = 3
        const val S3E_IMAGEPICKER_FORMAT_GIF = 4
        const val S3E_IMAGEPICKER_FORMAT_ANYVIDEO = 5
        const val S3E_IMAGEPICKER_FORMAT_ANYIMAGE = 6
        const val S3E_IMAGEPICKER_FORMAT_UNKNOWN = 7
        const val S3E_IMAGEPICKER_ERR_NONE = 0
        const val S3E_IMAGEPICKER_ERR_PARAM = 1
        const val S3E_IMAGEPICKER_ERR_NOT_FOUND = 4
        const val S3E_IMAGEPICKER_ERR_UNAVAIL = 5
        const val S3E_IMAGEPICKER_ERR_DEVICE = 6
        const val S3E_IMAGEPICKER_ERR_UNSUPPORTED = 7
        const val S3E_IMAGEPICKER_ERR_MEM = 8
        const val S3E_IMAGEPICKER_ERR_ACCESS = 13
        const val S3E_IMAGEPICKER_ERR_CANCELLED = 1001
        const val S3E_IMAGEPICKER_ERR_ALREADY_IN_PROGRESS = 1002
        val CURSOR_TYPE = arrayOf("_data", "_id")
    }
}
