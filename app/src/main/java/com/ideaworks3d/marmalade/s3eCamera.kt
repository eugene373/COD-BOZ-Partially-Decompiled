package com.ideaworks3d.marmalade

import android.content.Context
import android.hardware.Camera
import android.hardware.Camera.PreviewCallback
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView

class s3eCamera {

    companion object {
        private const val TAG = "s3eCamera"
        private var s_Instance: s3eCamera? = null

        fun GetInstance(): s3eCamera {
            if (s_Instance == null) {
                s_Instance = s3eCamera()
            }
            return s_Instance!!
        }
    }

    private var m_Camera: Camera? = null
    private var m_Preview: Preview? = null
    private var m_Context: Context? = null
    private var m_SurfaceCreated = false
    private var m_PreviewStarted = false
    private var m_CameraId = 0

    fun s3eCameraInit(context: Context?): Int {
        m_Context = context
        return 0
    }

    fun s3eCameraTerm() {
        stopPreview()
        releaseCamera()
    }

    @Suppress("DEPRECATION")
    fun s3eCameraStartPreview(surface: SurfaceHolder?): Int {
        if (m_Camera != null) {
            return -1
        }

        try {
            m_Camera = Camera.open(m_CameraId)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to open camera", e)
            return -1
        }

        try {
            m_Preview = Preview(m_Context!!)
            m_Preview!!.holder.addCallback(m_Preview)
            m_Preview!!.holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS)

            val params = m_Camera!!.parameters
            val bestSize = params.supportedPreviewSizes?.minByOrNull { it.width * it.height } ?: params.previewSize
            params.setPreviewSize(bestSize.width, bestSize.height)
            m_Camera!!.parameters = params
            m_Camera!!.setPreviewDisplay(m_Preview!!.holder)
            m_Camera!!.startPreview()
            m_PreviewStarted = true

            m_Camera!!.setPreviewCallback(m_Preview)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to start preview", e)
            releaseCamera()
            return -1
        }

        return 0
    }

    fun s3eCameraStopPreview() {
        stopPreview()
    }

    private fun stopPreview() {
        if (m_Camera != null) {
            if (m_PreviewStarted) {
                m_Camera!!.stopPreview()
                m_PreviewStarted = false
            }
            releaseCamera()
        }
    }

    private fun releaseCamera() {
        m_Camera?.release()
        m_Camera = null
        m_Preview?.holder?.removeCallback(m_Preview)
        m_Preview = null
    }

    fun s3eCameraSetCameraID(cameraID: Int): Int {
        m_CameraId = cameraID
        return 0
    }

    fun s3eCameraGetCameraID(): Int {
        return m_CameraId
    }

    inner class Preview(context: Context?) : SurfaceView(context), SurfaceHolder.Callback, PreviewCallback {

        init {
            holder.addCallback(this)
        }

        override fun surfaceCreated(holder: SurfaceHolder) {
            m_SurfaceCreated = true
        }

        override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
            if (m_Camera != null) {
                try {
                    m_Camera!!.stopPreview()
                    val params = m_Camera!!.parameters
                    val bestSize = params.supportedPreviewSizes?.minByOrNull { it.width * it.height } ?: params.previewSize
                    params.setPreviewSize(bestSize.width, bestSize.height)
                    m_Camera!!.parameters = params
                    m_Camera!!.setPreviewDisplay(holder)
                    m_Camera!!.startPreview()
                    m_PreviewStarted = true
                    m_Camera!!.setPreviewCallback(this)
                } catch (e: Exception) {
                    Log.e(TAG, "Error restarting preview", e)
                }
            }
        }

        override fun surfaceDestroyed(holder: SurfaceHolder) {
            m_SurfaceCreated = false
            stopPreview()
        }

        override fun onPreviewFrame(data: ByteArray?, camera: Camera?) {
            if (data != null) {
                s3eCameraFrameData(data, data.size)
            }
        }
    }

    external fun s3eCameraFrameData(data: ByteArray, size: Int): Unit
}