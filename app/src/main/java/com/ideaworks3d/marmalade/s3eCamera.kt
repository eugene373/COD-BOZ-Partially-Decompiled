package com.ideaworks3d.marmalade

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Camera
import android.hardware.Camera.AutoFocusCallback
import android.hardware.Camera.CameraInfo
import android.hardware.Camera.PictureCallback
import android.hardware.Camera.PreviewCallback
import android.hardware.Camera.ShutterCallback
import android.hardware.Camera.Size
import android.os.Build.VERSION
import android.view.SurfaceHolder
import android.view.SurfaceHolder.Callback
import android.view.SurfaceView
import android.view.WindowManager.LayoutParams
import java.util.concurrent.Semaphore
import java.util.concurrent.atomic.AtomicInteger

internal open class s3eCamera : PreviewCallback, SuspendResumeListener {
    @JvmField var m_SizeHint = 0
    @JvmField var m_Width = 0
    @JvmField var m_Height = 0
    @JvmField var m_PixelFormat = S3E_CAMERA_PIXEL_TYPE_NV21
    @JvmField var m_Type = -1
    @JvmField var m_Quality = 0
    @JvmField var m_AutoFocus = 0
    @JvmField var m_FlashMode = 0
    @JvmField var m_TorchMode = 0

    private var m_Camera: Camera? = null
    private var m_Preview: Preview? = null
    private var m_Running = false
    private var m_NeedsRemovePreview = false
    private var m_AutoFocusIsOn = false
    private var m_TypesToCameraId: IntArray = intArrayOf(-1, -1)
    private var m_AutoFocusModes = arrayOf("continuous-video", "continuous-picture")
    private var m_NonAutoFocusModes = arrayOf("auto", "fixed")

    private external fun previewCallback(data: ByteArray, format: Int, width: Int, height: Int, orientation: Int)
    private external fun onTakeImageCallback(data: ByteArray?, type: Int, err: Int)

    init {
        LoaderAPI.addSuspendResumeListener(this)
        val pm: PackageManager = LoaderActivity.m_Activity!!.packageManager
        if (pm.checkPermission("android.permission.CAMERA", LoaderActivity.m_Activity!!.packageName) == PackageManager.PERMISSION_GRANTED) {
            val info = CameraInfo()
            for (i in 0 until Camera.getNumberOfCameras()) {
                Camera.getCameraInfo(i, info)
                when (info.facing) {
                    0 -> m_TypesToCameraId[0] = i
                    1 -> m_TypesToCameraId[1] = i
                }
            }
            for (i in m_TypesToCameraId.indices) {
                if (m_TypesToCameraId[i] != -1) {
                    m_Type = i
                    break
                }
            }
        }
    }

    private fun isCameraOpen(): Boolean = synchronized(m_CameraLock) { m_Camera != null }

    private fun OpenCamera(): Boolean {
        if (isCameraOpen()) return true
        m_Camera = Camera.open(m_TypesToCameraId[m_Type])
        return m_Camera != null
    }

    private fun CloseCamera() {
        synchronized(m_CameraLock) {
            if (m_Camera != null) {
                m_Camera!!.setPreviewCallback(null as PreviewCallback?)
                m_Camera!!.stopPreview()
                m_Camera!!.release()
                m_Camera = null
            }
        }
    }

    fun s3eCameraGetInt(prop: Int): Int = when (prop) {
        S3E_CAMERA_AVAILABLE -> if (m_Type != -1) 1 else 0
        S3E_CAMERA_STATUS -> if (isCameraOpen()) 1 else 0
        S3E_CAMERA_AUTO_FOCUS -> if (m_AutoFocusIsOn) 1 else 0
        S3E_CAMERA_TYPE -> m_Type
        S3E_CAMERA_FLASH_MODE -> getFlashMode()
        S3E_CAMERA_TORCH_MODE -> getTorchMode()
        else -> 0
    }

    private fun isFocusModeSupported(mode: String): Boolean {
        if (!isCameraOpen()) return false
        val params = m_Camera!!.parameters
        return params.supportedFocusModes.contains(mode)
    }

    private fun setFocusMode(mode: String) {
        val params = m_Camera!!.parameters
        params.focusMode = mode
        m_Camera!!.parameters = params
    }

    private fun chooseFocusMode(modes: Array<String>): Boolean {
        var chosen: String? = null
        for (mode in modes) {
            if (chosen == null && isFocusModeSupported(mode)) chosen = mode
            if (chosen != null) break
        }
        if (chosen != null && isCameraOpen()) {
            var tries = 2
            while (true) {
                try {
                    setFocusMode(chosen)
                    break
                } catch (e: Exception) {
                    trace(e.toString())
                    tries--
                    if (tries == 0) break
                }
            }
            forceRefocus(chosen)
        }
        return chosen != null
    }

    private fun forceRefocus(mode: String) {
        if (m_Camera != null && mode == "auto") {
            m_Camera!!.autoFocus { _, _ -> }
        }
    }

    private fun setAutoFocusOnParams(): Boolean {
        val ok = chooseFocusMode(m_AutoFocusModes)
        m_AutoFocusIsOn = ok
        return ok
    }

    private fun setAutoFocusOffParams(): Boolean {
        val ok = chooseFocusMode(m_NonAutoFocusModes)
        m_AutoFocusIsOn = !ok
        return ok
    }

    fun s3eCameraSetInt(prop: Int, value: Int): Int {
        trace("s3eCameraSetInt: $prop <= $value")
        var result = 0
        if (prop == S3E_CAMERA_TYPE) {
            if (value < 0 || value >= m_TypesToCameraId.size || m_TypesToCameraId[value] == -1) return 1
            if (m_Type != value) {
                m_Type = value
                m_AutoFocusIsOn = false
                if (isCameraOpen()) {
                    CloseCamera()
                    result = if (OpenCamera()) 0 else 1
                }
            }
        } else if (prop == S3E_CAMERA_AUTO_FOCUS) {
            result = if (value == 0) {
                if (setAutoFocusOffParams()) 0 else 1
            } else {
                if (setAutoFocusOnParams()) 0 else 1
            }
        } else if (prop == S3E_CAMERA_FLASH_MODE) {
            result = setFlashMode(value)
        } else if (prop == S3E_CAMERA_TORCH_MODE) {
            result = setTorchMode(value)
        }
        return result
    }

    open fun setFlashMode(mode: Int): Int {
        var closeAfter = false
        if (!isCameraOpen()) {
            if (!OpenCamera()) return 1
            closeAfter = true
        }
        val out = arrayOfNulls<String>(1)
        val ok = s3eCameraFlashModeToPlatform(mode, out)
        val params = m_Camera!!.parameters
        val supported = params.supportedFlashModes
        val supportedContains = supported?.contains(out[0]) ?: false
        if (supportedContains) m_FlashMode = mode
        if (closeAfter) {
            CloseCamera()
        } else if (supportedContains) {
            params.flashMode = out[0]
            m_Camera!!.parameters = params
        }
        return if (ok && supportedContains) 0 else 1
    }

    fun getFlashMode(): Int = m_FlashMode

    open fun setTorchMode(mode: Int): Int {
        var closeAfter = false
        if (!isCameraOpen()) {
            if (!OpenCamera()) return 1
            closeAfter = true
        }
        val out = arrayOfNulls<String>(1)
        val ok = s3eCameraTorchModeToPlatform(mode, out)
        val params = m_Camera!!.parameters
        val supported = params.supportedFlashModes
        val supportedContains = supported?.contains(out[0]) ?: false
        if (supportedContains) m_TorchMode = mode
        if (closeAfter) {
            CloseCamera()
        } else if (supportedContains) {
            params.flashMode = out[0]
            m_Camera!!.parameters = params
        }
        return if (ok && supportedContains) 0 else 1
    }

    fun getTorchMode(): Int = m_TorchMode

    private fun s3ePixelFormatToPlatform(format: Int): Int = if (format == S3E_CAMERA_PIXEL_TYPE_NV21) 17 else 0

    fun s3eCameraIsFormatSupported(format: Int): Boolean {
        trace("s3eCameraIsFormatSupported: $format")
        return format == S3E_CAMERA_PIXEL_TYPE_NV21
    }

    override fun onPreviewFrame(data: ByteArray?, camera: Camera) {
        val params = camera.parameters
        val size = params.previewSize
        if (m_PixelFormat == S3E_CAMERA_PIXEL_TYPE_NV21 &&
            s3ePixelFormatToPlatform(S3E_CAMERA_PIXEL_TYPE_NV21) == params.previewFormat &&
            data!!.size < size.width * size.height * 3 / 2
        ) {
            trace("Corrupted buffer was passed by platform. Skipping frame.")
        } else {
            previewCallback(data!!, params.previewFormat, size.width, size.height, LoaderActivity.m_Activity!!.LoaderThread().getOrientation())
        }
    }

    fun s3eCameraStart(sizeHint: Int, pixelFormat: Int, quality: Int, width: Int, height: Int): Int {
        m_SizeHint = sizeHint
        m_Width = width
        m_Height = height
        m_PixelFormat = pixelFormat
        m_Quality = quality
        return try {
            if (!OpenCamera()) throw RuntimeException("Can't open the camera.")
            val size = setCameraParameters()
            LoaderAPI.trace("Creating image buffer")
            LoaderAPI.trace("Invoking preview methods")
            m_Camera!!.setPreviewCallback(this)
            if (VERSION.SDK_INT >= 11) {
                try {
                    LoaderActivity.m_Activity!!.runOnUiThread { createPreview() }
                    m_CameraOpenSem.acquire()
                } catch (_: InterruptedException) {
                    trace("s3eCameraTakePictureToFile(): waiting for semaphore failed")
                    return 1
                }
            }
            m_Camera!!.startPreview()
            m_Running = true
            trace("CameraView: done")
            0
        } catch (e: Exception) {
            LoaderAPI.getStackTrace(e)
            s3eCameraStop()
            1
        }
    }

    fun s3eCameraStop(): Int {
        m_Running = false
        CloseCamera()
        if (m_NeedsRemovePreview) {
            LoaderActivity.m_Activity!!.runOnUiThread { removePreview() }
        }
        return 0
    }

    private fun getOptimalPreviewSize(sizes: List<Camera.Size>, targetW: Int, targetH: Int): Camera.Size {
        val w = if (targetW > targetH) targetW else targetH
        val h = if (targetW < targetH) targetW else targetH
        var best: Camera.Size = sizes[0]
        var bestDelta = Int.MAX_VALUE
        for (s in sizes) {
            trace("CameraView: Available size: ${s.width}x${s.height}")
            val delta = Math.abs(s.height - h) + Math.abs(s.width - w)
            if (delta < bestDelta) {
                best = s
                bestDelta = delta
            }
        }
        return best
    }

    open fun getCameraSizes(params: Camera.Parameters): List<Camera.Size>? = null

    open fun setCameraParameters(): Camera.Size? {
        if (m_Camera == null) return null
        LoaderAPI.trace("Setting camera parameters")
        val params = m_Camera!!.parameters
        val sizes = getCameraSizes(params)
        try {
            val formats = params.supportedPreviewFormats
            trace("CameraView: Supported formats: $formats")
            val platFormat = s3ePixelFormatToPlatform(m_PixelFormat)
            if (formats.contains(platFormat)) params.previewFormat = platFormat
        } catch (e: Exception) {
            trace("CameraView: Could not request alternative preview format (OS Version < 2.0?)")
        }

        LoaderAPI.trace("Setting preview size")
        val chosen: Camera.Size = if (m_SizeHint == S3E_CAMERA_STREAMING_SIZE_HINT_MAXIMUM) {
            trace("CameraView: Ideal size: maximum available")
            sizes!![sizes.size - 1]
        } else {
            var divisor = 1
            if (m_SizeHint == S3E_CAMERA_STREAMING_SIZE_HINT_MEDIUM) divisor = 2
            else if (m_SizeHint == S3E_CAMERA_STREAMING_SIZE_HINT_SMALLEST) divisor = 4
            val view = LoaderActivity.m_Activity!!.m_View!!
            val targetW = view.m_Width / divisor
            val targetH = view.m_Height / divisor
            trace("CameraView: Ideal size: ${targetW}x$targetH")
            getOptimalPreviewSize(sizes!!, targetW, targetH)
        }
        trace("CameraView: Got size: ${chosen.width}x${chosen.height}")
        params.setPreviewSize(chosen.width, chosen.height)
        LoaderAPI.trace("Setting camera ID: ${m_TypesToCameraId[m_Type]}")
        params.set("camera-id", m_TypesToCameraId[m_Type].toString())
        return try {
            m_Camera!!.stopPreview()
            m_Camera!!.parameters = params
            val actual = params.previewSize
            if (m_AutoFocusIsOn) setAutoFocusOnParams() else setAutoFocusOffParams()
            setTorchMode(m_TorchMode)
            actual
        } catch (e: Exception) {
            trace("CameraView: Exception setting requested preview size")
            chosen
        }
    }

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

    @SuppressLint("WrongConstant")
    fun createPreview(): Int {
        val lp = LayoutParams().apply {
            flags = flags or LayoutParams.FLAG_NOT_FOCUSABLE or
                LayoutParams.FLAG_NOT_TOUCHABLE or
                LayoutParams.FLAG_LAYOUT_NO_LIMITS or
                LayoutParams.FLAG_FULLSCREEN
            gravity = 85
            x = 0; y = 0; width = 1; height = 1
        }
        m_Preview = Preview(LoaderActivity.m_Activity!!)
        m_NeedsRemovePreview = true
        LoaderActivity.m_Activity!!.window.windowManager.addView(m_Preview, lp)
        return 0
    }

    fun removePreview(): Int {
        if (m_Preview != null && m_NeedsRemovePreview) {
            m_NeedsRemovePreview = false
            LoaderActivity.m_Activity!!.window.windowManager.removeViewImmediate(m_Preview)
            m_Preview = null
            return 0
        }
        return 1
    }

    fun s3eCameraTakePictureToFile(file: String?, type: Int) {
        trace("s3eCameraTakePictureToFile: $type")
        if (m_Camera != null) {
            val cb = s3eCameraTakePicture().apply {
                m_nType = type
                m_strFile = file
                m_bToFile = true
            }
            setFlashMode(m_FlashMode)
            m_Camera!!.takePicture(null as ShutterCallback?, null as PictureCallback?, cb)
        } else {
            onTakeImageCallback(null, S3E_CAMERA_TAKE_PICTURE_TYPE_FILE, S3E_CAMERA_ERR_OPERATION_NA)
        }
    }

    fun s3eCameraTakePictureToBuffer() {
        trace("s3eCameraTakePictureToBuffer")
        if (m_Camera != null) {
            val cb = s3eCameraTakePicture().apply { m_bToFile = false }
            setFlashMode(m_FlashMode)
            m_Camera!!.takePicture(null as ShutterCallback?, null as PictureCallback?, cb)
        } else {
            onTakeImageCallback(null, S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER, S3E_CAMERA_ERR_OPERATION_NA)
        }
    }

    fun s3eCameraFetchResolutions(out: Array<IntArray>): Int {
        trace("s3eCameraFetchResolutions")
        var closeAfter = false
        if (!isCameraOpen()) {
            if (!OpenCamera()) return 0
            closeAfter = true
        }
        val params = m_Camera!!.parameters
        val sizes = getCameraSizes(params)
        out[0] = IntArray(sizes!!.size * 2)
        for (i in sizes.indices) {
            out[0][2 * i] = sizes[i].width
            out[0][2 * i + 1] = sizes[i].height
        }
        if (closeAfter) CloseCamera()
        return sizes.size
    }

    internal inner class s3eCameraTakePicture : PictureCallback {
        @JvmField var m_strFile: String? = null
        @JvmField var m_bToFile = false
        @JvmField var m_nType = 0

        override fun onPictureTaken(data: ByteArray?, camera: Camera) {
            val err = AtomicInteger(0)
            if (m_bToFile) {
                val saved = s3eCameraHelpAPI.SaveToFile(m_strFile!!, data!!, m_nType, err)
                this@s3eCamera.onTakeImageCallback(saved, S3E_CAMERA_TAKE_PICTURE_TYPE_FILE, err.get())
            } else {
                this@s3eCamera.onTakeImageCallback(data, S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER, err.get())
            }
            trace("onTakeImageCallback end")
        }
    }

    internal inner class Preview(context: Context) : SurfaceView(context), Callback {
        init {
            val holder = holder
            holder.addCallback(this)
            holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS)
        }

        override fun surfaceCreated(holder: SurfaceHolder) {
            if (this@s3eCamera.OpenCamera()) {
                try {
                    this@s3eCamera.m_Camera!!.setPreviewDisplay(holder)
                    this@s3eCamera.m_Camera!!.setPreviewCallback(this@s3eCamera)
                } catch (_: Exception) {
                    this@s3eCamera.CloseCamera()
                }
                m_CameraOpenSem.release()
            }
        }

        override fun surfaceDestroyed(holder: SurfaceHolder) {
            this@s3eCamera.CloseCamera()
        }

        override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
            if (!holder.isCreating) {
                synchronized(m_CameraLock) {
                    if (this@s3eCamera.m_Camera != null) {
                        this@s3eCamera.setCameraParameters()
                        this@s3eCamera.m_Camera!!.startPreview()
                    }
                }
            }
        }
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
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
        const val S3E_CAMERA_ERR_NONE = 0
        const val S3E_CAMERA_ERR_MEM = 8
        const val S3E_CAMERA_ERR_OPEN_FILE = 9
        const val S3E_CAMERA_ERR_IO = 10
        const val S3E_CAMERA_ERR_UNKNOWN = 11
        const val S3E_CAMERA_ERR_OPERATION_NA = 12
        const val S3E_CAMERA_TAKE_PICTURE_TYPE_FILE = 1
        const val S3E_CAMERA_TAKE_PICTURE_TYPE_BUFFER = 2
        const val S3E_CAMERA_SAVE_PATH_USER = 0
        const val S3E_CAMERA_SAVE_PATH_GALLERY = 1
        const val S3E_CAMERA_SAVE_PATH_CAMERA = 2
        const val S3E_CAMERA_SAVE_PATH_GALLERY_AND_CAMERA = 3
        const val S3E_CAMERA_FLASH_MODE_OFF = 0
        const val S3E_CAMERA_FLASH_MODE_ON = 1
        const val S3E_CAMERA_FLASH_MODE_AUTO = 2
        const val S3E_CAMERA_FLASH_MODE_RED_EYE_REDUCTION = 3
        const val S3E_CAMERA_TORCH_MODE_OFF = 0
        const val S3E_CAMERA_TORCH_MODE_ON = 1
        const val S3E_CAMERA_TORCH_MODE_AUTO = 2
        const val S3E_RESULT_SUCCESS = 0
        const val S3E_RESULT_ERROR = 1
        const val S3E_CAMERA_TYPE_REAR = 0
        const val S3E_CAMERA_TYPE_FRONT = 1
        const val S3E_CAMERA_TYPE_UNAVAILABLE = -1

        private val m_CameraLock = Any()
        private val m_CameraOpenSem = Semaphore(0)

        @JvmStatic
        fun s3eCameraFlashModeToPlatform(mode: Int, out: Array<String?>): Boolean = when (mode) {
            0 -> { out[0] = "off"; true }
            1 -> { out[0] = "on"; true }
            2 -> { out[0] = "auto"; true }
            3 -> { out[0] = "red-eye"; true }
            else -> { out[0] = "off"; false }
        }

        @JvmStatic
        fun s3eCameraTorchModeToPlatform(mode: Int, out: Array<String?>): Boolean = when (mode) {
            0 -> { out[0] = "off"; true }
            1 -> { out[0] = "torch"; true }
            2 -> { out[0] = "off"; false }
            else -> { out[0] = "off"; false }
        }
    }
}
