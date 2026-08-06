package com.ideaworks3d.marmalade

import android.app.Activity
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.ContentResolver
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream

class s3eImagePicker {

    companion object {
        private const val TAG = "s3eImagePicker"
        private var s_Instance: s3eImagePicker? = null

        fun GetInstance(): s3eImagePicker {
            if (s_Instance == null) {
                s_Instance = s3eImagePicker()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null
    private var m_Activity: Activity? = null
    private var m_ResultListener: ImagePickerResult? = null
    private var m_ProgressDialog: ProgressDialog? = null

    fun s3eImagePickerInit(context: Context?): Int {
        m_Context = context
        m_Activity = context as? Activity
        return 0
    }

    fun s3eImagePickerTerm() {
    }

    fun s3eImagePickerPickImage(resultListener: ImagePickerResult): Boolean {
        m_ResultListener = resultListener
        showPickerDialog()
        return true
    }

    private fun showPickerDialog() {
        val activity = m_Activity ?: return

        runOnUiThread {
            val builder = AlertDialog.Builder(activity)
            builder.setTitle("Select Image")
            builder.setItems(arrayOf("Camera", "Gallery")) { dialog, which ->
                if (which == 0) {
                    launchCamera()
                } else {
                    launchGallery()
                }
            }
            builder.setNegativeButton("Cancel", null)
            builder.show()
        }
    }

    private fun launchCamera() {
        val activity = m_Activity ?: return

        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        val file = createImageFile()
        m_ProgressDialog = ProgressDialog.show(activity, "", "Processing...", true)

        activity.startActivityForResult(intent, 100)
    }

    private fun launchGallery() {
        val activity = m_Activity ?: return

        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        intent.type = "image/*"
        activity.startActivityForResult(intent, 101)
    }

    fun s3eImagePickerOnActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            100 -> handleCameraResult(resultCode, data)
            101 -> handleGalleryResult(resultCode, data)
        }
    }

    private fun handleCameraResult(resultCode: Int, data: Intent?) {
        val activity = m_Activity ?: return

        if (resultCode == Activity.RESULT_OK) {
            val bitmap = data?.extras?.get("data") as? Bitmap
            if (bitmap != null) {
                saveImageToGallery(bitmap)
            }
        }
        dismissProgressDialog()
    }

    private fun handleGalleryResult(resultCode: Int, data: Intent?) {
        val activity = m_Activity ?: return

        if (resultCode == Activity.RESULT_OK && data?.data != null) {
            val uri = data.data!!
            try {
                val bitmap = MediaStore.Images.Media.getBitmap(activity.contentResolver, uri)
                val file = saveImageToFile(bitmap)
                m_ResultListener?.onImageSelected(file?.absolutePath ?: "")
            } catch (e: Exception) {
                Log.e(TAG, "Failed to load image from gallery", e)
                m_ResultListener?.onImageSelected("")
            }
        } else {
            m_ResultListener?.onImageSelected("")
        }
        dismissProgressDialog()
    }

    private fun createImageFile(): File {
        val storageDir = m_Context?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile("IMG_", ".jpg", storageDir)
    }

    private fun saveImageToGallery(bitmap: Bitmap): File? {
        return try {
            val galleryPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
            val file = File(galleryPath, "IMG_${System.currentTimeMillis()}.jpg")
            val outputStream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStream)
            outputStream.close()
            file.also {
                MediaStore.Images.Media.insertImage(m_Context?.contentResolver, it.absolutePath, it.name, null)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to save image to gallery", e)
            null
        }
    }

    private fun saveImageToFile(bitmap: Bitmap): File? {
        return try {
            val storageDir = m_Context?.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
            val file = File.createTempFile("IMG_", ".jpg", storageDir)
            val outputStream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStream)
            outputStream.close()
            file
        } catch (e: Exception) {
            Log.e(TAG, "Failed to save image to file", e)
            null
        }
    }

    private fun dismissProgressDialog() {
        m_ProgressDialog?.dismiss()
        m_ProgressDialog = null
    }

    private fun runOnUiThread(action: () -> Unit) {
        Handler(Looper.getMainLooper()).post(action)
    }

    interface ImagePickerResult {
        fun onImageSelected(path: String)
    }
}