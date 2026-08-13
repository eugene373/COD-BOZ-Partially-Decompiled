package com.ideaworks3d.marmalade

import android.annotation.SuppressLint
import android.app.AlertDialog.Builder
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.content.DialogInterface.OnDismissListener
import android.graphics.Bitmap
import android.graphics.Bitmap.Config
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build.VERSION
import android.os.Handler
import android.os.PowerManager
import android.os.PowerManager.WakeLock
import android.os.Vibrator
import android.provider.Settings.Secure
import android.text.method.PasswordTransformationMethod
import android.view.Display
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceHolder.Callback
import android.view.SurfaceView
import android.view.WindowManager
import android.view.inputmethod.BaseInputConnection
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import java.lang.reflect.Method
import java.util.Locale
import javax.microedition.khronos.opengles.GL

@SuppressLint("ViewConstructor")
open class LoaderView : SurfaceView, Callback, OnClickListener, OnDismissListener {
    var m_GL: GL? = null
    @JvmField var m_LoaderKeyboard: LoaderKeyboard? = null
    @JvmField var m_LoaderActivity: LoaderActivity
    private var m_SurfaceHolder: SurfaceHolder
    private var m_FullScreenBitmap: Bitmap? = null
    private val m_Paint: Paint = Paint()
    var m_Handler: Handler = Handler()
    private var m_Vibrator: Vibrator
    private var m_Pixels: IntArray? = null
    @JvmField var m_Width: Int = 0
    @JvmField var m_Height: Int = 0
    @JvmField var m_NewlyCreated: Boolean = false
    private var m_ErrorDialog: Dialog? = null
    @JvmField var m_ErrorRunning: Boolean = false
    private var m_ErrorTitle: String? = null
    private var m_ErrorBody: String? = null
    private var m_ErrorType: Int = 0
    private var m_ErrorRtn: Int = 0
    private var m_InputDialog: Dialog? = null
    private var m_InputTextTitle: String? = null
    private var m_InputTextDefault: String? = null
    private var m_InputTextFlags: Int = 0
    private var m_InputTextResult: String? = null
    @JvmField var m_InputTextRunning: Boolean = false
    private var m_EditText: EditText? = null
    private var m_VideoView: S3EVideoView? = null
    private var m_VideoState: Int = 0
    @JvmField var m_TerminateApplication: Boolean = false

    private val m_ShowError: Runnable = Runnable { showErrorReal() }
    private val m_ShowInputText: Runnable = Runnable { showInputTextReal() }
    private val m_BacklightOn: Runnable = Runnable {
        val pm = m_LoaderActivity.getSystemService(Context.POWER_SERVICE) as PowerManager
        val wl = pm.newWakeLock(26, this::class.java.name)
        wl.acquire(3000L)
    }
    private val m_RunOnOSThread: Runnable = Runnable {
        synchronized(m_RunOnOSThread) {
            runOnOSThreadNative()
            (m_RunOnOSThread as Object).notify()
        }
    }

    private external fun setPixelsNative(p0: Int, p1: Int, p2: IntArray?, p3: Boolean)
    private external fun runOnOSThreadNative()
    private external fun setInputText(p0: String)
    private external fun videoStoppedNotify()

    @SuppressLint("ResourceType")
    constructor(loaderActivity: LoaderActivity, gl: Boolean) : super(loaderActivity) {
        g_GLActive = g_GLActive || gl
        m_LoaderActivity = loaderActivity
        m_Vibrator = m_LoaderActivity.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        m_SurfaceHolder = holder
        m_SurfaceHolder.addCallback(this)
        m_LoaderKeyboard = LoaderKeyboard(this)
        trace("new View $this gl=$g_GLActive($gl) holder=$m_SurfaceHolder")
        if (g_GLActive) {
            val cfg = IntArray(1)
            if (LoaderAPI.s3eConfigGetInt("GL", "AndroidSurfaceHolder", cfg) == 0) {
                trace("SurfaceHolder.setFormat: ${cfg[0]}")
                m_SurfaceHolder.setFormat(cfg[0])
            }
        }
        isFocusable = true
        isFocusableInTouchMode = true
        requestFocus()
        setId(1983274)
    }

    fun getCurrentOrientation(): Int {
        val display = (m_LoaderActivity.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay
        val landscape = display.width >= display.height
        return when (display.rotation) {
            0 -> if (landscape) 0 else 1
            1 -> if (landscape) 0 else 9
            2 -> if (landscape) 8 else 9
            3 -> if (landscape) 8 else 1
            else -> -1
        }
    }

    private fun getCurrentKeyboardId(): String {
        val imm = m_LoaderActivity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        val list = imm.enabledInputMethodList
        var id = ""
        for (i in list.indices) {
            val imi = list[i]
            if (imi.id == Secure.getString(m_LoaderActivity.contentResolver, "default_input_method")) {
                id = imi.id
            }
        }
        return id
    }

    override fun onCreateInputConnection(editorInfo: EditorInfo?): InputConnection {
        trace("onCreateInputConnection")
        if (editorInfo != null) {
            if (getCurrentKeyboardId().contains("SamsungKeypad")) {
                editorInfo.inputType = 0
            } else {
                editorInfo.imeOptions = editorInfo.imeOptions or 268435456
                editorInfo.inputType = m_LoaderKeyboard!!.getKeyboardInputType()
            }
        }
        return BaseInputConnection(this, false)
    }

    private fun backlightOn() {
        m_Handler.post(m_BacklightOn)
    }

    private fun terminateApplication() {
        m_TerminateApplication = true
    }

    override fun onKeyPreIme(keyCode: Int, event: KeyEvent): Boolean =
        m_LoaderKeyboard!!.onKeyPreIme(keyCode, event)

    override fun onDetachedFromWindow() {
        trace("onDetachedFromWindow")
        super.onDetachedFromWindow()
        trace("onDetachedFromWindow done")
    }

    override fun onDismiss(dialog: DialogInterface) {
        trace("onDismiss intput=$m_InputTextRunning error=$m_ErrorRunning")
        if (dialog === m_InputDialog) {
            setInputText(m_InputTextResult!!)
            m_InputTextRunning = false
            m_InputDialog = null
        } else if (dialog === m_ErrorDialog) {
            m_ErrorDialog = null
            m_ErrorRunning = false
        } else {
            trace("onDismiss called with unknown dialog (suppressed): $dialog")
        }
    }

    override fun onClick(dialog: DialogInterface, which: Int) {
        if (dialog === m_InputDialog) {
            if (which == -1) {
                m_InputTextResult = m_EditText?.text?.toString() ?: ""
            }
            dialog.dismiss()
        } else if (dialog === m_ErrorDialog) {
            when (which) {
                -3 -> m_ErrorRtn = 2
                -2 -> m_ErrorRtn = 1
                -1 -> m_ErrorRtn = 0
            }
            trace("onClick: $which->$m_ErrorRtn")
            dialog.dismiss()
        } else {
            trace("onClick called with unknown dialog (suppressed): $dialog")
        }
    }

    fun onKeyEvent(keyCode: Int, action: Int, event: KeyEvent): Boolean {
        if (m_InputTextRunning && keyCode == 4) {
            m_InputTextRunning = false
            return true
        }
        return if (dispatchKeyEvent(event)) true else m_LoaderKeyboard!!.onKeyEvent(keyCode, action, event)
    }

    fun runOnOSThread() {
        synchronized(m_RunOnOSThread) {
            m_Handler.post(m_RunOnOSThread)
            try {
                (m_RunOnOSThread as Object).wait()
            } catch (_: InterruptedException) {
                trace("got InterruptedException during runOnOSThread")
            }
        }
    }

    fun enableRespondingToRotation() {
        m_LoaderActivity.LoaderThread().onSplashFinished()
    }

    fun videoPlay(
        p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int,
        p7: Boolean, p8: Long, p9: Long,
    ): Int {
        trace("videoPlay")
        m_VideoState = 1
        val runner = VideoRunner()
        runner.play(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)
        return runner.runOnUiThread(true)
    }

    fun videoPause(): Int {
        trace("videoPause")
        if (m_VideoState == 1) {
            m_VideoState = 2
            val runner = VideoRunner()
            runner.setState(2)
            return runner.runOnUiThread(false)
        }
        return -1
    }

    fun videoResume(): Int {
        trace("videoResume")
        if (m_VideoState == 2) {
            m_VideoState = 1
            val runner = VideoRunner()
            runner.setState(1)
            return runner.runOnUiThread(false)
        }
        return -1
    }

    private fun videoIsPlaying(): Boolean = videoGetStatus() == 1

    fun videoStop() {
        trace("videoStop")
        var wasPlaying = false
        if (m_VideoState != 0) {
            val runner = VideoRunner()
            runner.setState(0)
            runner.runOnUiThread(true)
            wasPlaying = videoIsPlaying()
            m_VideoState = 0
        }
        if (wasPlaying && !videoIsPlaying()) {
            videoStopped()
        }
    }

    fun videoSetVolume(p0: Int) {
        val runner = VideoRunner()
        runner.setVolume(p0)
        runner.runOnUiThread(false)
    }

    fun videoGetStatus(): Int = m_VideoState

    fun videoGetPosition(): Int =
        if (m_VideoView != null) m_VideoView!!.videoGetPosition() else 0

    fun videoStopped() {
        if (m_VideoView != null) {
            m_VideoView!!.videoRemoveView()
            m_VideoView = null
        }
        m_VideoState = 0
        videoStoppedNotify()
    }

    private fun showErrorReal() {
        trace("showErrorReal: suppressed (no pop-up mode)")
        m_ErrorRtn = 0
        m_ErrorRunning = false
    }

    fun showError(p0: String, p1: String, p2: Int): Int {
        trace("showError: suppressed (no pop-up mode): $p0")
        return 0
    }

    fun doneInputText(dialog: DialogInterface, which: Int) {
    }

    fun showInputTextReal() {
        trace("showInputTextReal: suppressed (no pop-up mode)")
        m_InputTextRunning = false
        m_InputTextResult = m_InputTextDefault ?: ""
    }

    fun getInputString(p0: String, p1: String, p2: Int) {
        trace("getInputString: suppressed (no pop-up mode): $p0")
        m_InputTextTitle = p0
        m_InputTextDefault = p1
        m_InputTextFlags = p2
        m_InputTextRunning = false
    }

    fun vibrateStart(p0: Long) {
        trace("vibrateStart $p0")
        m_Vibrator.vibrate(p0)
    }

    fun vibrateStop() {
        trace("vibrateStop")
        m_Vibrator.cancel()
    }

    fun vibrateAvailable(): Boolean {
        trace("vibrateAvailable")
        return try {
            val cls = m_Vibrator.javaClass
            val m = cls.getMethod("hasVibrator")
            m.invoke(m_Vibrator) as Boolean
        } catch (_: Exception) {
            true
        }
    }

    fun getLocale(): String = Locale.getDefault().toString()

    fun glInit(p0: Int): Boolean {
        trace("glInit")
        if (g_GLActive && !m_LoaderGL.started()) {
            m_GL = m_LoaderGL.startGL(m_SurfaceHolder, p0)
        }
        trace("glInit Done")
        return g_GLActive
    }

    fun glReInit() {
        trace("glReInit")
        if (g_GLActive && m_LoaderGL.started()) {
            m_GL = m_LoaderGL.restartGL(m_SurfaceHolder)
        }
        trace("glReInit Done")
    }

    fun glPause() {
        trace("glPause")
        if (g_GLActive && m_LoaderGL.started()) {
            val cfg = IntArray(1)
            if (LoaderAPI.s3eConfigGetInt("GL", "AndroidTerminateGLOnPause", cfg) == 0 && cfg[0] != 0) {
                m_LoaderGL.stopGL()
            } else {
                m_LoaderGL.pauseGL()
            }
            m_GL = null
        }
        trace("glPause Done")
    }

    fun glResume() {
        trace("glResume")
        if (g_GLActive && !m_LoaderGL.started()) {
            val cfg = IntArray(1)
            if (LoaderAPI.s3eConfigGetInt("GL", "AndroidTerminateGLOnPause", cfg) == 0 && cfg[0] != 0) {
                m_GL = m_LoaderGL.restartGL(m_SurfaceHolder)
            } else {
                m_GL = m_LoaderGL.resumeGL(m_SurfaceHolder)
            }
        }
        trace("glResume Done")
    }

    fun glTerm() {
        trace("glTerm")
        if (g_GLActive) {
            if (m_LoaderGL.started()) {
                m_LoaderGL.stopGL()
                m_GL = null
            }
            g_GLActive = false
        }
        trace("glTerm done")
    }

    fun glSwapBuffers() {
        if (!m_LoaderGL.started()) {
            trace("glSwapBuffers called before glInit")
        } else {
            m_LoaderGL.swap()
        }
    }

    override fun onTouchEvent(p0: MotionEvent): Boolean =
        m_LoaderActivity.LoaderThread() != null && m_LoaderActivity.LoaderThread().onTouchEvent(p0)

    override fun dispatchKeyEvent(p0: KeyEvent): Boolean {
        if (LoaderAPI.s3eConfigGet("AndroidIgnoreBackKeyFromPointerDevice", 0) != 0 && p0.keyCode == 4) {
            val dev = p0.device.id and 255
            if (dev and 2 == 2) {
                trace("ignored KEYCODE_BACK from pointer device/mouse")
                return true
            }
            return super.dispatchKeyEvent(p0)
        }
        return super.dispatchKeyEvent(p0)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        trace("draw")
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        trace("surfaceCreated: $this")
        m_NewlyCreated = true
    }

    @Synchronized
    override fun surfaceDestroyed(holder: SurfaceHolder) {
        trace("surfaceDestroyed: $m_Pixels")
        val loaderThread = m_LoaderActivity.LoaderThread()
        if (loaderThread != null) {
            loaderThread.suspendForSurfaceChange()
            m_Width = 0
            m_Height = 0
            if (VERSION.SDK_INT >= 24) {
                glPause()
            } else if (m_LoaderGL.started()) {
                m_LoaderGL.stopGL()
                m_GL = null
            }
            m_FullScreenBitmap = null
            setPixelsNative(0, 0, null, false)
            m_Pixels = null
            loaderThread.resumeAfterSurfaceChange()
            (this as Object).notify()
            trace("done surfaceDestroyed")
        }
    }

    @Synchronized
    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        trace("surfaceChanged: ${width}x${height}")
        val loaderThread = m_LoaderActivity.LoaderThread()
        if (m_Pixels != null && loaderThread.skipSurfaceChange()) {
            trace("surfaceChanged skipped")
            (this as Object).notify()
        } else {
            loaderThread.suspendForSurfaceChange()
            m_Width = width
            m_Height = height
            if (m_FullScreenBitmap != null) {
                m_FullScreenBitmap!!.recycle()
                m_FullScreenBitmap = null
            }
            m_FullScreenBitmap = Bitmap.createBitmap(m_Width, m_Height, Config.RGB_565)
            if (m_Pixels == null || m_Pixels!!.size != m_Width * m_Height) {
                if (g_PixelsLast != null && g_PixelsLast!!.size >= m_Width * m_Height) {
                    m_Pixels = g_PixelsLast
                    trace("using cached pixel buffer: $m_Pixels")
                } else {
                    m_Pixels = IntArray(m_Width * m_Height)
                    g_PixelsLast = m_Pixels
                    trace("created new pixel buffer: $m_Pixels")
                }
            }
            setPixelsNative(m_Width, m_Height, m_Pixels, m_NewlyCreated)
            m_NewlyCreated = false
            loaderThread.resumeAfterSurfaceChange()
            (this as Object).notify()
            trace("surfaceChanged done: ${m_Width}x${m_Height}")
        }
    }

    fun waitForSurface(): Boolean {
        trace("waitForSurface: $this")
        synchronized(this) {
            if (m_Pixels == null) {
                try {
                    trace("waitForSurface: waiting ...")
                    (this as Object).wait()
                } catch (_: InterruptedException) {
                    trace("waitForSurface: InterruptedException")
                    return false
                }
            }
            if (m_Pixels == null) {
                trace("waitForSurface: signalled early")
                return false
            }
        }
        trace("waitForSurface: done")
        return true
    }

    fun doDraw() {
        var canvas: Canvas? = null
        try {
            if (m_FullScreenBitmap != null) {
                if (g_GLActive) {
                    trace("doDraw: ignoring due to GL mode")
                    return
                }
                val bitmap = m_FullScreenBitmap!!
                bitmap.setPixels(m_Pixels!!, 0, m_Width, 0, 0, m_Width, m_Height)
                canvas = m_SurfaceHolder.lockCanvas()
                if (canvas == null) {
                    trace("doDraw: fail to lock canvas")
                    return
                }
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, m_Paint)
                return
            }
            trace("doDraw: no m_FullScreenBitmap")
        } finally {
            if (canvas != null) {
                m_SurfaceHolder.unlockCanvasAndPost(canvas)
            }
        }
    }

    private inner class VideoRunner : Runnable {
        private var m_Action: Int = 0
        private var m_File: String? = null
        private var m_Volume: Int = 0
        private var m_Repeats: Int = 0
        private var m_X: Int = 0
        private var m_Y: Int = 0
        private var m_Width: Int = 0
        private var m_Height: Int = 0
        private var m_Fullscreen: Boolean = false
        private var m_Offset: Long = 0L
        private var m_Size: Long = 0L
        private var m_Return: Int = 0

        fun play(
            file: String, volume: Int, repeats: Int, x: Int, y: Int, w: Int, h: Int,
            fullscreen: Boolean, offset: Long, size: Long,
        ) {
            m_Action = 1
            m_File = file
            m_Volume = volume
            m_Repeats = repeats
            m_X = x
            m_Y = y
            m_Width = w
            m_Height = h
            m_Fullscreen = fullscreen
            m_Offset = offset
            m_Size = size
        }

        fun setState(state: Int) {
            when (state) {
                0 -> m_Action = 4
                1 -> m_Action = 3
                2 -> m_Action = 2
            }
        }

        fun setVolume(volume: Int) {
            m_Action = 5
            m_Volume = volume
        }

        @Synchronized
        fun runOnUiThread(wait: Boolean): Int {
            return try {
                if (Thread.currentThread() == m_LoaderActivity.mainLooper.thread) {
                    run()
                } else {
                    m_Handler.post(this)
                    if (wait) {
                        (this as Object).wait()
                    }
                }
                if (wait) m_Return else 0
            } catch (_: InterruptedException) {
                trace("got InterruptedException during showVideo")
                -1
            }
        }

        @Synchronized
        override fun run() {
            if (m_Action == 1) {
                if (m_VideoView != null) {
                    m_VideoView!!.videoStop()
                    m_VideoView!!.videoRemoveView()
                    m_VideoView = null
                }
                m_VideoView = S3EVideoView(m_LoaderActivity)
                m_VideoView!!.videoAddView(m_Fullscreen, m_X, m_Y, m_Width, m_Height)
                m_VideoView!!.videoSetVolume(m_Volume)
                m_Return = m_VideoView!!.videoPlay(m_File!!, m_Repeats, m_Offset, m_Size)
            } else if (m_VideoView != null) {
                when (m_Action) {
                    2 -> m_VideoView!!.videoPause()
                    3 -> m_VideoView!!.videoResume()
                    4 -> {
                        m_VideoView!!.videoStop()
                        m_VideoView!!.videoRemoveView()
                        m_VideoView = null
                    }
                    5 -> m_VideoView!!.videoSetVolume(m_Volume)
                }
                m_Return = 0
            }
            (this as Object).notify()
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
        private val m_LoaderGL: LoaderGL = LoaderGL()
        private var g_PixelsLast: IntArray? = null
        private var g_GLActive: Boolean = false
    }
}
