package com.ideaworks3d.marmalade

import android.content.ContentValues
import android.content.pm.PackageManager
import android.os.Build.VERSION
import android.os.Environment
import android.provider.MediaStore.Images.Media
import android.util.Log
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.io.UnsupportedEncodingException
import java.text.SimpleDateFormat
import java.util.concurrent.atomic.AtomicInteger

object s3eCameraHelpAPI {
    const val S3E_CAMERA_ERR_NONE = 0
    const val S3E_CAMERA_ERR_MEM = 8
    const val S3E_CAMERA_ERR_OPEN_FILE = 9
    const val S3E_CAMERA_ERR_IO = 10
    const val S3E_CAMERA_ERR_UNKNOWN = 11
    const val S3E_CAMERA_ERR_OPERATION_NA = 12
    const val S3E_CAMERA_SAVE_PATH_USER = 0
    const val S3E_CAMERA_SAVE_PATH_GALLERY = 1
    const val S3E_CAMERA_SAVE_PATH_CAMERA = 2
    const val S3E_CAMERA_SAVE_PATH_GALLERY_AND_CAMERA = 3

    @JvmField
    var TAG = "s3eCameraHelpAPI"

    private fun SaveToFile_internal(path: String, data: ByteArray, err: AtomicInteger): ByteArray? {
        var result: ByteArray? = null
        val file = File(path)
        try {
            FileOutputStream(file).use { fos ->
                fos.write(data)
                fos.flush()
            }
            result = ("raw://" + file.path).toByteArray(charset("UTF-8"))
            Log.d(TAG, "SaveToFile_internal: ${file.path}")
        } catch (_: UnsupportedEncodingException) {
            Log.d(TAG, "onPictureTaken: Unsupported exception.")
            err.set(S3E_CAMERA_ERR_UNKNOWN)
        } catch (_: FileNotFoundException) {
            Log.d(TAG, "onPictureTaken: can not open file.")
            err.set(S3E_CAMERA_ERR_OPEN_FILE)
        } catch (_: IOException) {
            Log.d(TAG, "onPictureTaken: io error.")
            err.set(S3E_CAMERA_ERR_IO)
        }
        return result
    }

    private fun SaveToCameraFolder(filename: String?, data: ByteArray, err: AtomicInteger): ByteArray? {
        Log.d(TAG, "SaveToCameraFolder: start.")
        val dir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Camera")
        if (!dir.exists() && !dir.mkdirs()) return null
        val name = if (!filename.isNullOrEmpty()) filename
        else "IMG_" + SimpleDateFormat("yyyyMMdd_HHmmss").format(java.util.Date())
        return SaveToFile_internal(dir.path + File.separator + name + ".jpg", data, err)
    }

    private fun SaveToGalleryFolder(filename: String?, data: ByteArray, err: AtomicInteger): ByteArray? {
        Log.d(TAG, "SaveToGalleryFolder: start.")
        var result: ByteArray? = null
        try {
            val title = filename ?: "Camera image"
            val values = ContentValues().apply {
                put("title", title)
                put("_display_name", title)
                put("description", title)
                put("mime_type", "image/jpeg")
                put("date_added", System.currentTimeMillis())
                put("datetaken", System.currentTimeMillis())
            }
            val cr = LoaderAPI.getActivity().contentResolver
            val uri = cr.insert(Media.EXTERNAL_CONTENT_URI, values)
            cr.openOutputStream(uri!!)?.use { os ->
                os.write(data)
                os.flush()
            }
            val projection = arrayOf("_data")
            cr.query(uri, projection, null, null, null).use { cursor ->
                val idx = cursor!!.getColumnIndexOrThrow("_data")
                cursor.moveToFirst()
                val dataPath = cursor.getString(idx)
                result = ("raw://$dataPath").toByteArray(charset("UTF-8"))
                Log.d(TAG, "SaveToGalleryFolder: $dataPath")
            }
        } catch (_: UnsupportedEncodingException) {
            Log.d(TAG, "onPictureTaken: Unsupported exception.")
            err.set(S3E_CAMERA_ERR_UNKNOWN)
        } catch (_: FileNotFoundException) {
            Log.d(TAG, "onPictureTaken: can not open file.")
            err.set(S3E_CAMERA_ERR_OPEN_FILE)
        } catch (_: IOException) {
            Log.d(TAG, "onPictureTaken: io error.")
            err.set(S3E_CAMERA_ERR_IO)
        }
        return result
    }

    @JvmStatic
    fun SaveToFile(path: String, data: ByteArray, savePath: Int, err: AtomicInteger): ByteArray? {
        var result: ByteArray? = null
        Log.d(TAG, "SaveToFile: $savePath")
        when (savePath) {
            S3E_CAMERA_SAVE_PATH_USER -> result = SaveToFile_internal(path, data, err)
            S3E_CAMERA_SAVE_PATH_GALLERY -> result = SaveToGalleryFolder(path, data, err)
            S3E_CAMERA_SAVE_PATH_CAMERA -> result = SaveToCameraFolder(path, data, err)
        }
        return result
    }

    @JvmStatic
    fun getPermissionGrantedValue(permission: String): Int =
        if (VERSION.SDK_INT >= 23) {
            LoaderAPI.getActivity().checkSelfPermission(permission)
        } else {
            Log.i(TAG, "Warning: getPermissionGrantedValue called in compatibility mode (app is not targeting api level 23)")
            val pm: PackageManager = LoaderAPI.getActivity().packageManager
            val pkg = LoaderAPI.getActivity().packageName
            pm.checkPermission(permission, pkg)
        }

    @JvmStatic
    fun hasCameraPermissionGranted(): Boolean = getPermissionGrantedValue("android.permission.CAMERA") == 0

    @JvmStatic
    fun hasCameraSystemFeature(): Boolean {
        val pm: PackageManager = LoaderAPI.getActivity().packageManager
        var has = pm.hasSystemFeature("android.hardware.camera") ||
            pm.hasSystemFeature("android.hardware.camera.front")
        if (!has && VERSION.SDK_INT >= 17) {
            has = pm.hasSystemFeature("android.hardware.camera.any")
        }
        return has
    }
}
