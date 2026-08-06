package com.ideaworks3d.marmalade

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Handler
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceHolder.Callback
import android.view.SurfaceView
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import javax.microedition.khronos.opengles.GL

class LoaderView(private val m_LoaderActivity: LoaderActivity, private var m_UseGL: Boolean) :
    SurfaceView(m_LoaderActivity), SurfaceHolder.Callback,
    DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

    companion object {
        val m_LoaderGL = LoaderGL()
        var g_PixelsLast: IntArray? = null

        const val VIDEO_PAUSE = 2
        const val VIDEO_PLAY = 1
        const val VIDEO_RESUME = 3
        const val VIDEO_STOP = 4
        const val VIDEO_VOLUME = 5
    }

    var m_GL: GL? = null
    var m_Height = 0
    var m_Width = 0
    var m_NewlyCreated = false
    var m_TerminateApplication = false
    private var m_Pixels: IntArray? = null
    private var m_FullScreenBitmap: Bitmap? = null
    private var m_Paint = Paint()
    var m_Handler = Handler()
    private var m_SurfaceHolder: SurfaceHolder? = null
    private var m_ErrorDialog: Dialog? = null
    private var m_ErrorRunning = false
    private var m_ErrorTitle: String? = null
    private var m_ErrorBody: String? = null
    private var m_ErrorType = 0
    private var m_ErrorRtn = 0
    private var m_InputDialog: Dialog? = null
    private var m_EditText: EditText? = null
    private var m_InputTextTitle: String? = null
    private var m_InputTextDefault: String? = null
    private var m_InputTextFlags = 0
    private var m_InputTextResult: String? = null
    private var m_InputTextRunning = false
    private var m_Vibrator = m_LoaderActivity.getSystemService(Context.VIBRATOR_SERVICE) as android.os.Vibrator
    private var m_VideoState = 0
    private var m_VideoView: S3EVideoView? = null
    var m_LoaderKeyboard: LoaderKeyboard

    private val m_ShowError = object : Runnable {
        override fun run() {
            showErrorReal()
        }
    }

    private val m_ShowInputText = object : Runnable {
        override fun run() {
            showInputTextReal()
        }
    }

    private val m_BacklightOn = object : Runnable {
        override fun run() {
            val attr = windowAttributes
            attr.flags = attr.flags or android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
        }
    }

    private val m_RunOnOSThread = object : Runnable {
        override fun run() {
            runOnOSThreadNative()
        }
    }

    private val windowAttributes get() =
        m_LoaderActivity.window.attributes

    init {
        m_SurfaceHolder = holder
        m_SurfaceHolder!!.addCallback(this)
        m_LoaderKeyboard = LoaderKeyboard(this)

        if (m_UseGL) {
            m_SurfaceHolder!!.setType(SurfaceHolder.SURFACE_TYPE_GPU)
            val config = IntArray(1)
            val result = LoaderAPI.s3eConfigGetInt("GL", "AndroidSurfaceHolder", config)
            if (result != 0) {
                m_SurfaceHolder!!.setFormat(config[0])
            }
        } else {
            m_SurfaceHolder!!.setType(SurfaceHolder.SURFACE_TYPE_NORMAL)
        }

        setFocusable(true)
        setFocusableInTouchMode(true)
        requestFocus()
        setId(0x1e432a)
    }

    private fun showErrorReal() {
        val builder = AlertDialog.Builder(m_LoaderActivity)
        m_ErrorRtn = 0
        builder.setTitle(m_ErrorTitle)
        builder.setMessage(m_ErrorBody)
        builder.setPositiveButton("Continue", this)

        if (m_ErrorType > 0) {
            builder.setNegativeButton("Stop", this)
        }
        if (m_ErrorType > 1) {
            builder.setNeutralButton("Ignore", this)
        }

        m_ErrorDialog = builder.create()
        m_ErrorDialog!!.setOnDismissListener(this)
        m_ErrorDialog!!.show()
    }

    private fun vibrateAvailable(): Boolean {
        try {
            val cls = m_Vibrator.javaClass
            val method = cls.getMethod("hasVibrator")
            return method.invoke(m_Vibrator) as Boolean
        } catch (e: Exception) {
            return true
        }
    }

    private fun videoIsPlaying(): Boolean {
        return videoGetStatus() == 1
    }

    private fun backlightOn() {
        m_Handler.post(m_BacklightOn)
    }

    fun backLight(isOn: Boolean) {
        val attr = m_LoaderActivity.window.attributes
        if (isOn) {
            attr.flags = attr.flags or android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
        } else {
            attr.flags = attr.flags and android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON.inv()
        }
        m_LoaderActivity.window.attributes = attr
    }

    external fun runOnOSThreadNative()

    external fun setInputText(text: String)

    external fun setPixelsNative(width: Int, height: Int, pixels: IntArray?, newlyCreated: Boolean)

    external fun videoStoppedNotify()

    fun onKey(v1: View, keyCode: Int, event: KeyEvent): Boolean {
        // Native method - implemented in libs3e_android.so
        return false
    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        return super.dispatchKeyEvent(event)
    }

    fun doDraw() {
        val bitmap = m_FullScreenBitmap
        if (bitmap == null) {
            m_SurfaceHolder?.let {
                it.unlockCanvasAndPost(null)
            }
            return
        }

        if (m_UseGL) {
            return
        }

        try {
            m_Pixels?.let { pixels ->
                bitmap.setPixels(pixels, 0, m_Width, 0, 0, m_Width, m_Height)
            }
            val canvas = m_SurfaceHolder?.lockCanvas()
            if (canvas == null) {
                m_SurfaceHolder?.unlockCanvasAndPost(null)
                return
            }
            canvas.drawBitmap(bitmap, 0f, 0f, m_Paint)
            m_SurfaceHolder?.unlockCanvasAndPost(canvas)
        } catch (e: Exception) {
        }
    }

    fun doneInputText(dialog: DialogInterface?, which: Int) {
        // No-op - handled in onDismiss
    }

    fun enableRespondingToRotation() {
        m_LoaderActivity.LoaderThread()?.onSplashFinished()
    }

    fun getCurrentOrientation(): Int {
        val sdk = android.os.Build.VERSION.SDK_INT
        if (sdk < 9) {
            val orientation = resources.configuration.orientation
            return when (orientation) {
                1 -> 1
                2 -> 2
                else -> -1
            }
        }

        val wm = m_LoaderActivity.getSystemService(Context.WINDOW_SERVICE) as android.view.WindowManager
        val display = wm.defaultDisplay
        val width = display.width
        val height = display.height
        val isPortrait = width < height
        val rotation = display.rotation

        return when (rotation) {
            0 -> if (isPortrait) 1 else 9
            1 -> if (isPortrait) 2 else 0
            2 -> if (isPortrait) 9 else 8
            3 -> if (isPortrait) 0 else 8
            else -> -1
        }
    }

    fun getInputString(title: String, defaultText: String, flags: Int) {
        m_InputTextTitle = title
        m_InputTextDefault = defaultText
        m_InputTextFlags = flags
        m_Handler.post(m_ShowInputText)
    }

    fun getLocale(): String {
        return java.util.Locale.getDefault().toString()
    }

    fun glInit(glVersion: Int): Boolean {
        if (m_UseGL) {
            if (!m_LoaderGL.started()) {
                m_GL = m_LoaderGL.startGL(m_SurfaceHolder!!, glVersion)
            }
        }
        return m_UseGL
    }

    fun glPause() {
        if (m_UseGL && m_LoaderGL.started()) {
            val config = IntArray(1)
            val result = LoaderAPI.s3eConfigGetInt("GL", "AndroidTerminateGLOnPause", config)
            if (result != 0 && config[0] == 0) {
                m_LoaderGL.stopGL()
            } else {
                m_LoaderGL.pauseGL()
            }
            m_GL = null
        }
    }

    fun glReInit() {
        if (m_UseGL) {
            if (m_LoaderGL.started()) {
                m_GL = m_LoaderGL.restartGL(m_SurfaceHolder!!)
            }
        }
    }

    fun glResume() {
        if (m_UseGL) {
            if (!m_LoaderGL.started()) {
                val config = IntArray(1)
                val result = LoaderAPI.s3eConfigGetInt("GL", "AndroidTerminateGLOnPause", config)
                if (result != 0 && config[0] == 0) {
                    m_GL = m_LoaderGL.restartGL(m_SurfaceHolder!!)
                } else {
                    m_GL = m_LoaderGL.resumeGL(m_SurfaceHolder!!)
                }
            }
        }
    }

    fun glSwapBuffers() {
        if (m_LoaderGL.started()) {
            m_LoaderGL.swap()
        }
    }

    fun glTerm() {
        if (m_UseGL && m_LoaderGL.started()) {
            m_LoaderGL.stopGL()
            m_GL = null
        }
    }

    override fun onClick(dialog: DialogInterface?, which: Int) {
        val inputDialog = m_InputDialog
        if (inputDialog != null && dialog === inputDialog) {
            if (which == DialogInterface.BUTTON_POSITIVE) {
                m_InputTextResult = m_EditText?.text.toString()
            }
            dialog?.dismiss()
        } else if (dialog === m_ErrorDialog) {
            when (which) {
                DialogInterface.BUTTON_NEUTRAL -> m_ErrorRtn = 2
                DialogInterface.BUTTON_NEGATIVE -> m_ErrorRtn = 1
                DialogInterface.BUTTON_POSITIVE -> m_ErrorRtn = 0
            }
            dialog?.dismiss()
        }
    }

    override fun onDismiss(dialog: DialogInterface?) {
        val inputDialog = m_InputDialog
        if (inputDialog != null && dialog === inputDialog) {
            setInputText(m_InputTextResult ?: "")
            m_InputTextRunning = false
            m_InputDialog = null
        } else if (dialog === m_ErrorDialog) {
            m_ErrorDialog = null
            m_ErrorRunning = false
        }
    }

    override fun onCreateInputConnection(info: EditorInfo?): InputConnection? {
        if (info != null) {
            info.imeOptions = info.imeOptions or android.view.inputmethod.EditorInfo.IME_FLAG_NO_EXTRACT_UI
        }
        return super.onCreateInputConnection(info)
    }

    protected override fun onDetachedFromWindow() {
    }

    fun onKeyEvent(keyCode: Int, event: KeyEvent): Boolean {
        if (m_InputTextRunning) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                m_InputTextRunning = false
            }
            return true
        }
        if (!dispatchKeyEvent(event)) {
            return m_LoaderKeyboard.onKeyEvent(keyCode, 0, event)
        }
        return true
    }

    override fun onKeyPreIme(keyCode: Int, event: KeyEvent?): Boolean {
        return m_LoaderKeyboard.onKeyPreIme(keyCode, event)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val thread = m_LoaderActivity.LoaderThread()
        return if (thread != null) {
            thread.onTouchEvent(event)
        } else {
            false
        }
    }

    fun showError(title: String, body: String, errorType: Int): Int {
        if (m_LoaderActivity.isFinishing) {
            return 0
        }
        synchronized(m_ShowError) {
            m_ErrorTitle = title
            m_ErrorBody = body
            m_ErrorType = errorType
            m_ErrorRtn = 0
            m_ErrorRunning = true
            m_Handler.post(m_ShowError)

            while (m_ErrorRunning) {
                LoaderAPI.s3eDeviceYield(20)
            }

            return m_ErrorRtn
        }
    }

    fun showInputTextReal() {
        val context = m_LoaderActivity
        val editText = EditText(context)
        m_EditText = editText
        editText.setText(m_InputTextDefault)

        when {
            (m_InputTextFlags and 1) != 0 -> {
                editText.inputType = android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
                editText.transformationMethod = android.text.method.PasswordTransformationMethod.getInstance()
            }
            (m_InputTextFlags and 2) != 0 -> {
                editText.inputType = android.text.InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            }
            (m_InputTextFlags and 4) != 0 -> {
                editText.inputType = android.text.InputType.TYPE_TEXT_VARIATION_NORMAL
            }
            (m_InputTextFlags and 8) != 0 -> {
                editText.inputType = android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            }
        }

        val builder = AlertDialog.Builder(context)
        builder.setTitle(m_InputTextTitle)
        builder.setView(editText)
        builder.setPositiveButton("OK", this)
        builder.setNegativeButton("Cancel", this)

        m_InputDialog = builder.create()
        m_InputTextRunning = true
        m_InputTextResult = null
        m_InputDialog!!.setOnDismissListener(this)
        m_InputDialog!!.show()

        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }

    @Synchronized
    override fun surfaceCreated(holder: SurfaceHolder) {
        m_NewlyCreated = true
    }

    @Synchronized
    override fun surfaceDestroyed(holder: SurfaceHolder) {
        val thread = m_LoaderActivity.LoaderThread()
        if (thread != null) {
            thread.suspendForSurfaceChange()

            m_Width = 0
            m_Height = 0

            if (m_LoaderGL.started()) {
                m_LoaderGL.stopGL()
                m_GL = null
            }

            m_FullScreenBitmap = null
            setPixelsNative(0, 0, null, false)
            m_Pixels = null

            thread.resumeAfterSurfaceChange()
            (this as java.lang.Object).notify()
        }
    }

    @Synchronized
    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        val thread = m_LoaderActivity.LoaderThread()
        if (m_Pixels != null && thread != null && !thread.skipSurfaceChange()) {
            (this as java.lang.Object).notify()
            return
        }

        if (thread != null) {
            thread.suspendForSurfaceChange()
        }

        m_Width = width
        m_Height = height

        if (m_FullScreenBitmap != null) {
            m_FullScreenBitmap!!.recycle()
            m_FullScreenBitmap = null
        }

        m_FullScreenBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)

        if (m_Pixels == null || m_Pixels!!.size != width * height) {
            if (g_PixelsLast != null && g_PixelsLast!!.size >= width * height) {
                m_Pixels = g_PixelsLast
            } else {
                m_Pixels = IntArray(width * height)
                g_PixelsLast = m_Pixels
            }
        }

        setPixelsNative(width, height, m_Pixels, m_NewlyCreated)
        m_NewlyCreated = false
        if (thread != null) {
            thread.resumeAfterSurfaceChange()
        }
        (this as java.lang.Object).notify()
    }

    fun videoGetPosition(): Int {
        return m_VideoView?.videoGetPosition() ?: 0
    }

    fun videoGetStatus(): Int {
        return m_VideoState
    }

    fun videoPlay(path: String, volume: Int, repeats: Int, x: Int, y: Int, width: Int, height: Int, fullscreen: Boolean, offset: Long, size: Long): Int {
        m_VideoState = 1
        val runner = VideoRunner()
        runner.play(path, volume, repeats, x, y, width, height, fullscreen, offset, size)
        return runner.runOnUiThread(true)
    }

    fun videoPause(): Int {
        if (m_VideoState == 1) {
            m_VideoState = 2
            val runner = VideoRunner()
            runner.setState(2)
            return runner.runOnUiThread(false)
        }
        return -1
    }

    fun videoResume(): Int {
        if (m_VideoState == 2) {
            m_VideoState = 1
            val runner = VideoRunner()
            runner.setState(3)
            return runner.runOnUiThread(false)
        }
        return -1
    }

    fun videoStop() {
        var wasPlaying = false
        if (m_VideoState != 0) {
            wasPlaying = true
            val runner = VideoRunner()
            runner.setState(4)
            runner.runOnUiThread(true)
            m_VideoState = 0
        }

        if (wasPlaying && !videoIsPlaying()) {
            videoStopped()
        }
    }

    fun videoSetVolume(volume: Int) {
        val runner = VideoRunner()
        runner.setVolume(volume)
        runner.runOnUiThread(false)
    }

    fun videoStopped() {
        if (m_VideoView != null) {
            m_VideoView!!.videoStop()
            m_VideoView!!.videoRemoveView()
            m_VideoView = null
        }
        m_VideoState = 0
        videoStoppedNotify()
    }

    @Synchronized
    fun waitForSurface(): Boolean {
        try {
            while (m_Pixels == null) {
                (this as java.lang.Object).wait()
            }
        } catch (e: InterruptedException) {
            return false
        }
        return m_Pixels != null
    }

    fun vibrateStart(duration: Long) {
        m_Vibrator.vibrate(duration)
    }

    fun vibrateStop() {
        m_Vibrator.cancel()
    }

    inner class VideoRunner : Runnable {
        private var m_Action = 0
        private var m_File: String? = null
        private var m_Fullscreen = false
        private var m_Height = 0
        private var m_Offset = 0L
        private var m_Repeats = 0
        private var m_Return = 0
        private var m_Size = 0L
        private var m_Volume = 0
        private var m_Width = 0
        private var m_X = 0
        private var m_Y = 0

        fun play(path: String, volume: Int, repeats: Int, x: Int, y: Int, width: Int, height: Int, fullscreen: Boolean, offset: Long, size: Long): VideoRunner {
            m_Action = VIDEO_PLAY
            m_File = path
            m_Volume = volume
            m_Repeats = repeats
            m_X = x
            m_Y = y
            m_Width = width
            m_Height = height
            m_Fullscreen = fullscreen
            m_Offset = offset
            m_Size = size
            return this
        }

        fun setState(state: Int) {
            when (state) {
                VIDEO_STOP -> m_Action = VIDEO_STOP
                VIDEO_RESUME -> m_Action = VIDEO_RESUME
                VIDEO_PAUSE -> m_Action = VIDEO_PAUSE
            }
        }

        fun setVolume(volume: Int) {
            m_Action = VIDEO_VOLUME
            m_Volume = volume
        }

        @Synchronized
        fun runOnUiThread(waitForResult: Boolean): Int {
            try {
                val currentThread = Thread.currentThread()
                val mainThread = m_LoaderActivity.mainLooper.thread
                if (currentThread == mainThread) {
                    run()
                } else {
                    m_Handler.post(this)
                    if (waitForResult) {
                        (this as java.lang.Object).wait()
                    }
                }
            } catch (e: InterruptedException) {
                return -1
            }
            return if (waitForResult) m_Return else 0
        }

        @Synchronized
        override fun run() {
            when (m_Action) {
                VIDEO_PLAY -> {
                    m_VideoView?.let {
                        it.videoStop()
                        it.videoRemoveView()
                        m_VideoView = null
                    }
                    m_VideoView = S3EVideoView(m_LoaderActivity)
                    m_VideoView?.videoAddView(m_Fullscreen, m_X, m_Y, m_Width, m_Height)
                    m_VideoView?.videoSetVolume(m_Volume)
                    m_Return = m_VideoView?.videoPlay(m_File!!, m_Repeats, m_Offset, m_Size) ?: -1
                }
                VIDEO_PAUSE -> m_VideoView?.videoPause()
                VIDEO_RESUME -> m_VideoView?.videoResume()
                VIDEO_STOP -> {
                    m_VideoView?.videoStop()
                    m_VideoView?.videoRemoveView()
                    m_VideoView = null
                }
                VIDEO_VOLUME -> m_VideoView?.videoSetVolume(m_Volume)
            }
            if (m_Action != VIDEO_PLAY) {
                m_Return = 0
            }
            (this as java.lang.Object).notify()
        }
    }
}
