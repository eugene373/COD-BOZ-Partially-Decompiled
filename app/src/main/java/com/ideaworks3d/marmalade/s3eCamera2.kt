package com.ideaworks3d.marmalade

import android.content.Context
import android.graphics.ImageFormat
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraDevice
import android.hardware.camera2.CameraManager
import android.hardware.camera2.CameraMetadata
import android.hardware.camera2.CaptureRequest
import android.hardware.camera2.params.StreamConfigurationMap
import android.media.Image
import android.media.ImageReader
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.util.Size
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import java.util.concurrent.Semaphore

class s3eCamera2 {

    companion object {
        private const val TAG = "s3eCamera2"
        private var s_Instance: s3eCamera2? = null

        fun GetInstance(): s3eCamera2 {
            if (s_Instance == null) {
                s_Instance = s3eCamera2()
            }
            return s_Instance!!
        }
    }

    private var m_CameraDevice: CameraDevice? = null
    private var m_CameraManager: CameraManager? = null
    private var m_CameraId = "0"
    private var m_ImageReader: ImageReader? = null
    private var m_Surface: Surface? = null
    private var m_Context: Context? = null
    private var m_Handler: Handler? = null
    private var m_BackgroundThread: HandlerThread? = null
    private var m_SessionClosed = false
    private val m_CameraOpenLock = Semaphore(1)

    private val m_StateCallback = object : CameraDevice.StateCallback() {
        override fun onOpened(camera: CameraDevice) {
            m_CameraOpenLock.release()
            m_CameraDevice = camera
            createCaptureSession()
        }

        override fun onDisconnected(camera: CameraDevice) {
            m_CameraOpenLock.release()
            camera.close()
            m_CameraDevice = null
        }

        override fun onError(camera: CameraDevice, error: Int) {
            m_CameraOpenLock.release()
            camera.close()
            m_CameraDevice = null
        }
    }

    fun s3eCamera2Init(context: Context?): Int {
        m_Context = context
        m_CameraManager = context?.getSystemService(Context.CAMERA_SERVICE) as CameraManager?
        return 0
    }

    fun s3eCamera2Term() {
        closeCamera()
        stopBackgroundThread()
    }

    fun s3eCamera2StartPreview(surfaceHolder: SurfaceHolder?): Int {
        if (m_CameraDevice != null) {
            return -1
        }

        try {
            startBackgroundThread()
            m_Surface = surfaceHolder?.surface

            val characteristics = m_CameraManager!!.getCameraCharacteristics(m_CameraId)
            val map = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) as StreamConfigurationMap
            val largest = map.getOutputSizes(ImageFormat.YUV_420_888)!!.maxByOrNull { it.width * it.height }

            m_ImageReader = ImageReader.newInstance(largest!!.width, largest.height, ImageFormat.YUV_420_888, 2)
            m_ImageReader!!.setOnImageAvailableListener(OnImageAvailableListener(), m_Handler)

            m_CameraManager!!.openCamera(m_CameraId, m_StateCallback, m_Handler)
            m_CameraOpenLock.acquire()

            if (m_CameraDevice == null) {
                return -1
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to start preview", e)
            return -1
        }
        return 0
    }

    fun s3eCamera2StopPreview() {
        closeCamera()
    }

    private fun closeCamera() {
        try {
            m_CameraOpenLock.acquire()
            m_CameraDevice?.close()
            m_CameraDevice = null
            m_ImageReader?.close()
            m_ImageReader = null
        } catch (e: InterruptedException) {
            Log.e(TAG, "Interrupted while closing camera", e)
        } finally {
            m_CameraOpenLock.release()
        }
    }

    private fun startBackgroundThread() {
        m_BackgroundThread = HandlerThread("CameraBackground")
        m_BackgroundThread!!.start()
        m_Handler = Handler(m_BackgroundThread!!.looper)
    }

    private fun stopBackgroundThread() {
        m_BackgroundThread?.quitSafely()
        try {
            m_BackgroundThread?.join()
        } catch (e: InterruptedException) {
            Log.e(TAG, "Interrupted while stopping background thread", e)
        }
        m_BackgroundThread = null
        m_Handler = null
    }

    private fun createCaptureSession() {
        try {
            val surfaces = arrayListOf<Surface>()
            surfaces.add(m_Surface!!)
            surfaces.add(m_ImageReader!!.surface)

            val requestBuilder = m_CameraDevice!!.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW)
            requestBuilder.addTarget(m_Surface!!)
            requestBuilder.addTarget(m_ImageReader!!.surface)

            m_CameraDevice!!.createCaptureSession(surfaces, object : android.hardware.camera2.CameraCaptureSession.StateCallback() {
                override fun onConfigured(session: android.hardware.camera2.CameraCaptureSession) {
                    if (m_CameraDevice == null) return
                    try {
                        requestBuilder.set(CaptureRequest.CONTROL_MODE, CameraMetadata.CONTROL_MODE_AUTO)
                        session.setRepeatingRequest(requestBuilder.build(), null, m_Handler)
                    } catch (e: CameraAccessException) {
                        Log.e(TAG, "Failed to start preview session", e)
                    }
                }

                override fun onConfigureFailed(session: android.hardware.camera2.CameraCaptureSession) {
                    Log.e(TAG, "Failed to configure capture session")
                }
            }, m_Handler)
        } catch (e: CameraAccessException) {
            Log.e(TAG, "Failed to create capture session", e)
        }
    }

    fun s3eCamera2SetCameraID(cameraID: Int): Int {
        m_CameraId = cameraID.toString()
        return 0
    }

    fun s3eCamera2GetCameraID(): Int {
        return m_CameraId.toIntOrNull() ?: 0
    }

    inner class OnImageAvailableListener : ImageReader.OnImageAvailableListener {
        override fun onImageAvailable(reader: ImageReader) {
            val image = reader.acquireLatestImage()
            image?.let {
                val planes = it.planes
                if (planes.size >= 1) {
                    val buffer = planes[0].buffer
                    val size = buffer.remaining()
                    val data = ByteArray(size)
                    buffer.get(data)
                    this@s3eCamera2.s3eCamera2FrameData(data, size)
                }
                it.close()
            }
        }
    }

    external fun s3eCamera2FrameData(data: ByteArray, size: Int): Unit
}