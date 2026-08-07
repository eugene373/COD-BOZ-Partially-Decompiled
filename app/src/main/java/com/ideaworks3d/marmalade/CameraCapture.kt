package com.ideaworks3d.marmalade

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.graphics.Bitmap.CompressFormat
import android.hardware.Camera
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import android.media.ExifInterface
import android.net.Uri
import android.os.Environment
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Media
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

internal class CameraCapture {
    private fun CheckCamera(): Int {
        val cam = Camera.open(0)
        return if (cam == null) 0 else { cam.release(); 1 }
    }

    fun s3eCameraCaptureIsFormatSupported(format: Int): Int {
        if (format != S3E_CAMERACAPTURE_JPG && format != S3E_CAMERACAPTURE_VIDEO) return 0
        return try {
            CheckCamera()
        } catch (_: RuntimeException) {
            0
        }
    }

    fun s3eCameraCaptureToFile(format: Int): String? {
        var file: File? = null
        if (format == S3E_CAMERACAPTURE_VIDEO) {
            file = startCaptureVideo()
        } else if (format == S3E_CAMERACAPTURE_JPG) {
            file = startCaptureImage()
        }
        return if (file == null) null else "raw://" + file.path
    }

    private fun startCaptureVideo(): File? {
        val intent = Intent("android.media.action.VIDEO_CAPTURE")
        intent.putExtra("android.intent.extra.videoQuality", 1)
        val result = LoaderActivity.m_Activity!!.ExecuteIntent(intent)
        return if (result != null && result.data != null) {
            convertUriToFile(result.data!!, arrayOf("_data", "_id"))
        } else null
    }

    private fun startCaptureImage(): File? {
        val values = ContentValues()
        val captureIntent = Intent("android.media.action.IMAGE_CAPTURE")
        values.put("title", "New image " + s_Videos++)
        values.put("description", "Image captured by s3eCamera")
        var uri: Uri
        var resultFile: File
        try {
            uri = LoaderActivity.m_Activity!!.contentResolver.insert(Media.EXTERNAL_CONTENT_URI, values)!!
        } catch (_: UnsupportedOperationException) {
            resultFile = File(String.format("%s/image%d", Environment.getExternalStorageDirectory().path, s_Images++))
            uri = Uri.fromFile(resultFile)
        }
        captureIntent.putExtra("output", uri)
        captureIntent.putExtra("android.intent.extra.videoQuality", 1)
        LoaderAPI.trace("Executing Camera Capture intent")
        if (LoaderActivity.m_Activity!!.ExecuteIntent(captureIntent) == null) {
            LoaderAPI.trace("Activity returned null, assuming cancelled")
            LoaderActivity.m_Activity!!.applicationContext.contentResolver.delete(uri, null, null)
            return null
        }
        LoaderAPI.trace("Retrieving image url")
        resultFile = convertUriToFile(uri, arrayOf("_data", "_id"))!!
        fixRotatedJpegIssue(resultFile.absolutePath)
        return resultFile
    }

    companion object {
        private var s_Images = 0
        private var s_Videos = 0
        @Volatile private var m_WaitingForFile = false

        const val S3E_CAMERACAPTURE_JPG = 1
        const val S3E_CAMERACAPTURE_PNG = 2
        const val S3E_CAMERACAPTURE_BMP = 3
        const val S3E_CAMERACAPTURE_VIDEO = 4

        @JvmStatic
        fun convertUriToFile(uri: Uri, projection: Array<String>): File? {
            val out = arrayOfNulls<File>(1)
            m_WaitingForFile = true
            LoaderActivity.m_Activity!!.getCursor(uri, projection, object : LoaderActivity.CursorCompleteListener {
                override fun cursorLoadComplete(cursor: android.database.Cursor?) {
                    try {
                        val idx = cursor!!.getColumnIndexOrThrow("_data")
                        if (cursor.moveToFirst()) {
                            out[0] = File(cursor.getString(idx))
                        }
                    } catch (e: RuntimeException) {
                        LoaderAPI.trace("Exception in convertUriToFile: $e ${e.message}")
                    } finally {
                        cursor?.close()
                        LoaderAPI.trace("Finished waiting for file cursor")
                        m_WaitingForFile = false
                    }
                }
            })
            while (m_WaitingForFile) {
                LoaderAPI.s3eDeviceYield(1)
            }
            return out[0]
        }

        private fun fixRotatedJpegIssue(path: String) {
            val orientation = getImageOrientation(path)
            if (orientation == 0) return
            val matrix = Matrix().apply { postRotate(orientation.toFloat()) }
            val src = BitmapFactory.decodeFile(path)
            val rotated = Bitmap.createBitmap(src, 0, 0, src.width, src.height, matrix, true)
            try {
                FileOutputStream(path).use { fos -> rotated.compress(CompressFormat.JPEG, 90, fos) }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        private fun getImageOrientation(path: String): Int {
            var rotation = 0
            try {
                val exif = ExifInterface(path)
                val orientation = exif.getAttributeInt("Orientation", 1)
                rotation = when (orientation) {
                    3 -> 180
                    6 -> 90
                    8 -> 270
                    else -> 0
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return rotation
        }

        private fun PrintCameraCharacteristics() {
            if (VERSION.SDK_INT >= 21) {
                val ctx = LoaderAPI.getActivity().applicationContext
                val cm = ctx.getSystemService("camera") as CameraManager
                try {
                    for (id in cm.cameraIdList) {
                        val cc = cm.getCameraCharacteristics(id)
                        val sensorOrientation = cc.get(CameraCharacteristics.SENSOR_ORIENTATION) as Int
                        LoaderAPI.trace(String.format("Camera %s orientation = %d", id, sensorOrientation))
                    }
                } catch (e: CameraAccessException) {
                    e.printStackTrace()
                }
            }
        }
    }
}
