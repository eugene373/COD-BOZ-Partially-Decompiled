package com.ideaworks3d.marmalade

import android.content.Context
import android.graphics.ImageFormat
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraCaptureSession
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraDevice
import android.hardware.camera2.CameraManager
import android.hardware.camera2.CaptureRequest
import android.hardware.camera2.params.StreamConfigurationMap
import android.media.ImageReader
import android.media.Image.Plane
import android.media.ImageReader.OnImageAvailableListener
import android.util.Size
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.Collections
import java.util.Comparator
import java.util.concurrent.Semaphore
import java.util.concurrent.atomic.AtomicInteger

internal class s3eCamera2 : SuspendResumeListener {
    @JvmField var m_SizeHint = 0
    @JvmField var m_Width = 0
    @JvmField var m_Height = 0
    @JvmField var m_PixelFormat = 0
    @JvmField var m_Facing = 0
    @JvmField var m_Quality = 0
    @JvmField var m_AutoFocus = 0
    @JvmField var m_FlashMode = 0
    @JvmField var m_TorchMode = 0

    private var m_CameraInfos: Array<s3eCameraInfo?> = arrayOfNulls(2)
    private var m_CurrentCameraInfo: s3eCameraInfo? = null
    private var m_Camera: CameraDevice? = null
    private var m_Running = false
    private var m_ImageReader: ImageReader? = null
    private var m_ImageReaderJPEG: ImageReader? = null
    private var m_CaptureSession: CameraCaptureSession? = null
    private var m_PreviewRequestBuilder: CaptureRequest.Builder? = null
    private var m_PreviewRequestBuilderJPEG: CaptureRequest.Builder? = null
    private var m_strFile: String? = null
    private var m_bToFile = false
    private var m_nSaveFilePathType = 0
    private var m_bIsJPEG = false

    private external fun previewCallback(data: ByteArray, format: Int, width: Int, height: Int, orientation: Int)
    private external fun onTakeImageCallback(data: ByteArray?, type: Int, err: Int)

    private val mOnImageAvailableListenerJPEG = OnImageAvailableListener { reader ->
        val image = reader.acquireNextImage()
        val planes = image.planes
        val data = ByteArray(planes[0].buffer.remaining())
        planes[0].buffer.get(data)
        image.close()
        StartCapture(false)
        m_TakePictureSem.release()
        SaveToFile(data)
    }

    private val mOnImageAvailableListener = OnImageAvailableListener { reader ->
        synchronized(m_CameraLock) {
            if (m_Camera != null) {
                val image = reader.acquireNextImage()
                val planes = image.planes
                if (planes.size != 3) {
                    trace("Image was obtained in an unexpected format")
                    image.close()
                } else {
                    val w = image.width
                    val h = image.height
                    val extra = if (2 * planes[2].rowStride / w >= 2) planes[2].rowStride else 0
                    val out = ByteArray(3 * w * h / 2 + extra)
                    var format: Int
                    var indexIn: Int
                    if (planes[1].pixelStride == 1) {
                        var dest = CopyLines(out, 0, w, h, planes[0], 0)
                        dest = CopyLines(out, dest, w / 2, h / 2, planes[1], 0)
                        CopyLines(out, dest, w / 2, h / 2, planes[2], 0)
                        format = 842094169
                    } else {
                        planes[0].buffer.get(); planes[1].buffer.get(); planes[2].buffer.get()
                        val stride = 1
                        var dest = CopyLines(out, 0, w, h, planes[0], stride)
                        dest = CopyLines(out, dest, w, h / 2, planes[1], 1 + stride)
                        out[dest - 1] = planes[2].buffer.get(planes[2].buffer.remaining() - 1)
                        format = 17
                    }
                    previewCallback(out, format, w, h, LoaderActivity.m_Activity!!.LoaderThread().getOrientation())
                    image.close()
                }
            }
        }
    }

    private val mStateCallback: CameraDevice.StateCallback = object : CameraDevice.StateCallback() {
        override fun onOpened(camera: CameraDevice) {
            synchronized(m_CameraLock) {
                m_Camera = camera
                createCameraPreviewSession()
                m_CameraOpenSem.release()
            }
        }

        override fun onDisconnected(camera: CameraDevice) = camera.close()

        override fun onError(camera: CameraDevice, error: Int) = camera.close()
    }

    init {
        trace("s3eCamera2()")
        LoaderAPI.addSuspendResumeListener(this)
        ResetCameraIds()
    }

    private fun ResetCameraIds() {
        try {
            val cm = LoaderActivity.m_Activity!!.getSystemService(Context.CAMERA_SERVICE) as CameraManager
            for (id in cm.cameraIdList) {
                val cc = cm.getCameraCharacteristics(id)
                var supportsCont = false
                val afModes = cc.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES) as IntArray
                for (afMode in afModes) {
                    supportsCont = afMode == 4
                    if (!supportsCont) continue
                    break
                }
                val flashAvailable = cc.get(CameraCharacteristics.FLASH_INFO_AVAILABLE) as Boolean
                var info: s3eCameraInfo? = null
                when (cc.get(CameraCharacteristics.LENS_FACING) as Int) {
                    0 -> { m_CameraInfos[1] = s3eCameraInfo(); info = m_CameraInfos[1] }
                    1 -> { m_CameraInfos[0] = s3eCameraInfo(); info = m_CameraInfos[0] }
                }
                if (info != null) {
                    info.m_CameraId = id
                    info.m_AutoFocusAvailable = supportsCont
                    info.m_FlashAvailable = flashAvailable
                }
            }
            if (m_CameraInfos[0] == null && m_CameraInfos[1] != null) {
                m_Facing = 1
            }
            m_CurrentCameraInfo = m_CameraInfos[m_Facing]
        } catch (e: CameraAccessException) {
            e.printStackTrace()
        }
    }

    private fun isCameraOpen(): Boolean = synchronized(m_CameraLock) { m_Camera != null }

    private fun CameraRestart(): Boolean =
        if (isCameraOpen()) { CloseCamera(); OpenCamera() } else true

    private fun GetCameraId(): String? = m_CurrentCameraInfo?.m_CameraId

    private fun GetIdealSize(): Size {
        var divisor = 1
        if (m_SizeHint == 1) divisor = 2
        else if (m_SizeHint == 0) divisor = 4
        val view = LoaderActivity.m_Activity!!.m_View!!
        var ideal = Size(view.m_Width / divisor, view.m_Height / divisor)
        if (ideal.width < ideal.height) {
            ideal = Size(ideal.height, ideal.width)
        }
        trace("IdealSize: ${ideal.width}x${ideal.height}")
        return ideal
    }

    private fun ChooseOptimalSize(sizes: Array<Size>): Size {
        val chosen: Size =
            if (m_Width > 0 && m_Height > 0) {
                val desired = Size(m_Width, m_Height)
                if (!Arrays.asList(*sizes).contains(desired)) {
                    throw RuntimeException("Can't apply desired size.")
                }
                desired
            } else {
                Collections.min(Arrays.asList(*sizes), CloseToIdeal(GetIdealSize()))
            }
        trace("SelectedSize: ${chosen.width}x${chosen.height}")
        return chosen
    }

    @Throws(CameraAccessException::class)
    private fun getCameraSizes(): Array<Size> {
        if (GetCameraId() != null) {
            val cm = LoaderActivity.m_Activity!!.getSystemService(Context.CAMERA_SERVICE) as CameraManager
            val cc = cm.getCameraCharacteristics(GetCameraId()!!)
            val map = cc.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) as StreamConfigurationMap
            return map.getOutputSizes(35)
        }
        return arrayOf()
    }

    private fun ResetPreviewSize() {
        try {
            val size = ChooseOptimalSize(getCameraSizes())
            m_ImageReader = ImageReader.newInstance(size.width, size.height, ImageFormat.YUV_420_888, 2)
            m_ImageReader!!.setOnImageAvailableListener(mOnImageAvailableListener, LoaderActivity.m_Activity!!.m_View!!.m_Handler)
            m_ImageReaderJPEG = ImageReader.newInstance(size.width, size.height, ImageFormat.JPEG, 2)
            m_ImageReaderJPEG!!.setOnImageAvailableListener(mOnImageAvailableListenerJPEG, LoaderActivity.m_Activity!!.m_View!!.m_Handler)
        } catch (e: CameraAccessException) {
            e.printStackTrace()
        }
    }

    private fun createCameraPreviewSession() {
        try {
            ResetPreviewSize()
            m_PreviewRequestBuilderJPEG = m_Camera!!.createCaptureRequest(CameraDevice.TEMPLATE_STILL_CAPTURE)
            m_PreviewRequestBuilderJPEG!!.addTarget(m_ImageReaderJPEG!!.surface)
            m_PreviewRequestBuilder = m_Camera!!.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW)
            m_PreviewRequestBuilder!!.addTarget(m_ImageReader!!.surface)
            StartCapture(false)
        } catch (e: CameraAccessException) {
            e.printStackTrace()
        }
    }

    private fun setPreviewRequestBuilderFields(builder: CaptureRequest.Builder) {
        val afMode = if (m_AutoFocus != 0) 4 else 0
        builder.set(CaptureRequest.CONTROL_AF_MODE, afMode)
        when (m_TorchMode) {
            0 -> {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1)
                builder.set(CaptureRequest.FLASH_MODE, 0)
            }
            1 -> {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1)
                builder.set(CaptureRequest.FLASH_MODE, 2)
            }
        }
    }

    private fun setStillCaptureRequestBuilderFields(builder: CaptureRequest.Builder) {
        val afMode = if (m_AutoFocus != 0) 4 else 0
        builder.set(CaptureRequest.CONTROL_AF_MODE, afMode)
        when (m_FlashMode) {
            0 -> {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1)
                builder.set(CaptureRequest.FLASH_MODE, 0)
            }
            1 -> {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1)
                builder.set(CaptureRequest.FLASH_MODE, 2)
            }
            2 -> builder.set(CaptureRequest.CONTROL_AE_MODE, 2)
            3 -> builder.set(CaptureRequest.CONTROL_AE_MODE, 4)
        }
    }

    private fun StartCapture(jpeg: Boolean) {
        if (m_CaptureSession != null) {
            m_CaptureSession!!.close()
            m_CaptureSession = null
        }
        m_bIsJPEG = jpeg
        try {
            val target = if (m_bIsJPEG) m_ImageReaderJPEG!!.surface else m_ImageReader!!.surface
            m_Camera!!.createCaptureSession(
                listOf(target),
                object : CameraCaptureSession.StateCallback() {
                    override fun onConfigured(session: CameraCaptureSession) {
                        if (m_Camera != null) {
                            try {
                                if (m_bIsJPEG) {
                                    setStillCaptureRequestBuilderFields(m_PreviewRequestBuilderJPEG!!)
                                    session.capture(
                                        m_PreviewRequestBuilderJPEG!!.build(),
                                        null as CameraCaptureSession.CaptureCallback?,
                                        LoaderActivity.m_Activity!!.m_View!!.m_Handler,
                                    )
                                } else {
                                    setPreviewRequestBuilderFields(m_PreviewRequestBuilder!!)
                                    session.setRepeatingRequest(
                                        m_PreviewRequestBuilder!!.build(),
                                        null as CameraCaptureSession.CaptureCallback?,
                                        LoaderActivity.m_Activity!!.m_View!!.m_Handler,
                                    )
                                }
                                m_CaptureSession = session
                            } catch (e: CameraAccessException) {
                                e.printStackTrace()
                            }
                        }
                    }

                    override fun onConfigureFailed(session: CameraCaptureSession) {
                        trace("mOnImageAvailableListener: OnImageAvailableListener 1")
                    }
                },
                LoaderActivity.m_Activity!!.m_View!!.m_Handler,
            )
        } catch (e: CameraAccessException) {
            e.printStackTrace()
        }
    }

    private fun OpenCamera(): Boolean {
        if (isCameraOpen()) return true
        if (GetCameraId() == null) return false
        return try {
            val cm = LoaderActivity.m_Activity!!.getSystemService(Context.CAMERA_SERVICE) as CameraManager
            cm.openCamera(GetCameraId()!!, mStateCallback, LoaderActivity.m_Activity!!.m_View!!.m_Handler)
            m_CameraOpenSem.acquire()
            isCameraOpen()
        } catch (e: CameraAccessException) {
            trace("CameraAccessException${e.message}")
            e.printStackTrace()
            false
        } catch (_: SecurityException) {
            trace("OpenCamera(): no permissions")
            false
        } catch (_: InterruptedException) {
            trace("OpenCamera(): waiting for semaphore failed")
            false
        }
    }

    fun s3eCameraStart(sizeHint: Int, pixelFormat: Int, quality: Int, width: Int, height: Int): Int {
        trace("s3eCameraStart")
        if (!s3eCameraIsFormatSupported(pixelFormat)) return 1
        m_SizeHint = sizeHint
        m_Width = width
        m_Height = height
        m_PixelFormat = pixelFormat
        m_Quality = quality
        m_Running = OpenCamera()
        return if (m_Running) 0 else 1
    }

    private fun CloseCamera() {
        trace("CloseCamera start")
        synchronized(m_CameraLock) {
            if (m_Camera != null) {
                while (m_CaptureSession == null) {
                    try { Thread.sleep(1) } catch (_: InterruptedException) {}
                }
                try { m_CaptureSession!!.stopRepeating() } catch (e: CameraAccessException) { e.printStackTrace() }
                m_CaptureSession!!.close()
                m_CaptureSession = null
                m_Camera!!.close()
                m_Camera = null
                m_ImageReader?.close(); m_ImageReader = null
                m_ImageReaderJPEG?.close(); m_ImageReaderJPEG = null
            }
        }
    }

    fun s3eCameraStop(): Int {
        m_Running = false
        CloseCamera()
        return 0
    }

    fun s3eCameraGetInt(prop: Int): Int = when (prop) {
        S3E_CAMERA_AVAILABLE -> if (s3eCameraHelpAPI.hasCameraSystemFeature() && s3eCameraHelpAPI.hasCameraPermissionGranted()) 1 else 0
        S3E_CAMERA_STATUS -> if (isCameraOpen()) 1 else 0
        S3E_CAMERA_AUTO_FOCUS -> m_AutoFocus
        S3E_CAMERA_TYPE -> m_Facing
        S3E_CAMERA_FLASH_MODE -> m_FlashMode
        S3E_CAMERA_TORCH_MODE -> m_TorchMode
        else -> -1
    }

    fun s3eCameraSetInt(prop: Int, value: Int): Int {
        var ok = false
        if (prop == S3E_CAMERA_TYPE) {
            if (m_Facing == value) ok = true
            else if (m_CameraInfos[value] != null) {
                m_Facing = value
                m_CurrentCameraInfo = m_CameraInfos[m_Facing]
                ok = CameraRestart()
                m_AutoFocus = 0; m_FlashMode = 0
            }
        } else if (prop == S3E_CAMERA_AUTO_FOCUS) {
            if (m_AutoFocus == value) ok = true
            else if (value != 0 && m_CurrentCameraInfo != null && !m_CurrentCameraInfo!!.m_AutoFocusAvailable) ok = false
            else { m_AutoFocus = value; ok = CameraRestart() }
        } else if (prop == S3E_CAMERA_FLASH_MODE) {
            if (m_FlashMode == value) ok = true
            else if (value != 0 && m_CurrentCameraInfo != null && !m_CurrentCameraInfo!!.m_FlashAvailable) ok = false
            else { m_FlashMode = value; ok = CameraRestart() }
        } else if (prop == S3E_CAMERA_TORCH_MODE) {
            if (m_TorchMode == value) ok = true
            else if (value != 0 && m_CurrentCameraInfo != null && !m_CurrentCameraInfo!!.m_FlashAvailable) ok = false
            else { m_TorchMode = value; ok = CameraRestart() }
        }
        trace("s3eCameraSetInt: $prop <= $value -> $ok")
        return if (ok) 0 else 1
    }

    fun s3eCameraIsFormatSupported(format: Int): Boolean = format == S3E_CAMERA_PIXEL_TYPE_YV12 || format == S3E_CAMERA_PIXEL_TYPE_NV21

    override fun onSuspendResumeEvent(event: SuspendResumeEvent) {
        if (!m_Running) return
        if (event.eventType == SuspendResumeEvent.EventType.RESUME) {
            s3eCameraStart(m_SizeHint, m_PixelFormat, m_Quality, m_Width, m_Height)
        }
        if (event.eventType == SuspendResumeEvent.EventType.SUSPEND) {
            s3eCameraStop()
            m_Running = true
        }
        if (event.eventType == SuspendResumeEvent.EventType.SHUTDOWN) {
            s3eCameraStop()
        }
    }

    fun SaveToFile(data: ByteArray) {
        val err = AtomicInteger(0)
        if (m_bToFile) {
            val saved = s3eCameraHelpAPI.SaveToFile(m_strFile!!, data, m_nSaveFilePathType, err)
            onTakeImageCallback(saved, S3E_CAMERA_TAKE_PICTURE_TYPE_FILE, err.get())
        } else {
            onTakeImageCallback(data, S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER, err.get())
        }
        trace("SaveToFile end")
    }

    fun s3eCameraTakePictureToFile(file: String?, savePathType: Int) {
        try {
            if (m_bIsJPEG || !isCameraOpen()) {
                onTakeImageCallback(null, S3E_CAMERA_TAKE_PICTURE_TYPE_FILE, S3E_CAMERA_ERR_OPERATION_NA)
                return
            }
            m_nSaveFilePathType = savePathType
            m_strFile = file
            m_bToFile = true
            StartCapture(true)
            m_TakePictureSem.acquire()
        } catch (_: InterruptedException) {
            trace("s3eCameraTakePictureToFile(): waiting for semaphore failed")
        }
    }

    fun s3eCameraTakePictureToBuffer() {
        try {
            if (m_bIsJPEG || !isCameraOpen()) {
                onTakeImageCallback(null, S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER, S3E_CAMERA_ERR_OPERATION_NA)
                return
            }
            m_strFile = null
            m_bToFile = false
            StartCapture(true)
            m_TakePictureSem.acquire()
        } catch (_: InterruptedException) {
            trace("s3eCameraTakePictureToBuffer(): waiting for semaphore failed")
        }
    }

    fun s3eCameraFetchResolutions(out: Array<IntArray>): Int = try {
        val sizes = Arrays.asList(*getCameraSizes())
        out[0] = IntArray(sizes.size * 2)
        for (i in sizes.indices) {
            out[0][2 * i] = sizes[i].width
            out[0][2 * i + 1] = sizes[i].height
        }
        sizes.size
    } catch (e: CameraAccessException) {
        e.printStackTrace()
        0
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    internal class CloseToIdeal(private val m_IdealSize: Size) : Comparator<Size> {
        override fun compare(s1: Size, s2: Size): Int =
            (Math.abs(s1.height - m_IdealSize.height) + Math.abs(s1.width - m_IdealSize.width)) -
                (Math.abs(s2.height - m_IdealSize.height) + Math.abs(s2.width - m_IdealSize.width))
    }

    internal class s3eCameraInfo {
        @JvmField var m_CameraId: String? = null
        @JvmField var m_AutoFocusAvailable = false
        @JvmField var m_FlashAvailable = false
    }

    companion object {
        const val S3E_RESULT_SUCCESS = 0
        const val S3E_RESULT_ERROR = 1
        const val S3E_CAMERA_AVAILABLE = 0
        const val S3E_CAMERA_STATUS = 1
        const val S3E_CAMERA_AUTO_FOCUS = 3
        const val S3E_CAMERA_BRIGHTNESS = 4
        const val S3E_CAMERA_CONTRAST = 5
        const val S3E_CAMERA_QUALITY = 6
        const val S3E_CAMERA_TYPE = 7
        const val S3E_CAMERA_FLASH_MODE = 8
        const val S3E_CAMERA_TORCH_MODE = 9
        const val S3E_CAMERA_IDLE = 0
        const val S3E_CAMERA_STREAMING = 1
        const val S3E_CAMERA_STREAMING_SIZE_HINT_SMALLEST = 0
        const val S3E_CAMERA_STREAMING_SIZE_HINT_MEDIUM = 1
        const val S3E_CAMERA_STREAMING_SIZE_HINT_LARGEST = 2
        const val S3E_CAMERA_STREAMING_SIZE_HINT_MAXIMUM = 3
        const val S3E_CAMERA_PIXEL_TYPE_NV21 = 4097
        const val S3E_CAMERA_PIXEL_TYPE_YV12 = 4098
        const val S3E_CAMERA_TYPE_REAR = 0
        const val S3E_CAMERA_TYPE_FRONT = 1
        const val S3E_CAMERA_ERR_NONE = 0
        const val S3E_CAMERA_ERR_MEM = 8
        const val S3E_CAMERA_ERR_OPEN_FILE = 9
        const val S3E_CAMERA_ERR_IO = 10
        const val S3E_CAMERA_ERR_UNKNOWN = 11
        const val S3E_CAMERA_ERR_OPERATION_NA = 12
        const val S3E_CAMERA_TAKE_PICTURE_TYPE_FILE = 1
        const val S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER = 2
        const val DefaultAutoFocusMode = 4

        private val m_CameraLock = Any()
        private val m_CameraOpenSem = Semaphore(0)
        private val m_TakePictureSem = Semaphore(0)

        @JvmStatic
        private fun CopyLines(out: ByteArray, destOffset: Int, width: Int, height: Int, plane: Plane, skip: Int): Int {
            var dest = destOffset
            val rowStride = plane.rowStride
            val buffer: ByteBuffer = plane.buffer
            if (rowStride == width) {
                buffer.get(out, dest, rowStride * height - skip)
                dest += width * height
            } else {
                for (i in 0 until height - 1) {
                    buffer.get(out, dest, rowStride)
                    dest += width
                }
                buffer.get(out, dest, width - skip)
                dest += width
            }
            return dest
        }
    }
}
