package com.ideaworks3d.marmalade

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.VideoView

class S3EVideoView(private val m_LoaderActivity: LoaderActivity) : VideoView(m_LoaderActivity),
    MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    companion object {
        const val S3E_VIDEO_FAILED = 3
        const val S3E_VIDEO_MAX_VOLUME = 0x100
        const val S3E_VIDEO_PAUSED = 2
        const val S3E_VIDEO_PLAYING = 1
        const val S3E_VIDEO_STOPPED = 0

        @JvmStatic
        fun requiresSeparateWindow(): Boolean {
            return android.os.Build.VERSION.SDK_INT > 4
        }
    }

    private var m_Fullscreen = false
    private var m_Height = 0
    private var m_MediaPlayer: MediaPlayer? = null
    private var m_Path: String? = null
    private var m_Repeats = 0
    private var m_Uri: Uri? = null
    private var m_Volume = 1.0f
    private var m_Width = 0

    init {
        setOnPreparedListener(this)
        setOnCompletionListener(this)
        setOnErrorListener(this)
    }

    override fun onPrepared(mp: MediaPlayer?) {
        m_MediaPlayer = mp
        mp?.setVolume(m_Volume, m_Volume)
        start()
    }

    override fun onCompletion(mp: MediaPlayer?) {
        m_MediaPlayer = null
        m_Repeats--
        if (m_Repeats > 0) {
            videoStop()
            m_LoaderActivity.m_View?.videoStopped()
        } else {
            stopPlayback()
            if (m_Uri != null) {
                setVideoURI(m_Uri)
            } else {
                m_Path?.let { setVideoPath(it) }
            }
        }
    }

    override fun onError(mp: MediaPlayer?, what: Int, extra: Int): Boolean {
        m_LoaderActivity.m_View?.videoStopped()
        return true
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (m_Width != 0 && m_Height != 0) {
            setMeasuredDimension(m_Width, m_Height)
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val thread = m_LoaderActivity.LoaderThread()
        if (thread != null && event != null) {
            val location = IntArray(2)
            getLocationOnScreen(location)
            event.offsetLocation(location[0].toFloat(), location[1].toFloat())
            return thread.onTouchEvent(event)
        }
        return false
    }

    fun videoAddView(fullscreen: Boolean, x: Int, y: Int, width: Int, height: Int) {
        m_Fullscreen = fullscreen
        m_Width = width
        m_Height = height

        if (requiresSeparateWindow()) {
            val lp = WindowManager.LayoutParams()
            lp.flags = lp.flags or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
            lp.flags = lp.flags or WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
            lp.flags = lp.flags or WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
            lp.gravity = android.view.Gravity.START or android.view.Gravity.TOP
            lp.x = x
            lp.y = y
            lp.width = width
            lp.height = height
            m_LoaderActivity.window.windowManager.addView(this, lp)
        } else if (fullscreen) {
            val lp = FrameLayout.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT,
                android.view.Gravity.CENTER
            )
            m_Width = 0
            m_Height = 0
            m_LoaderActivity.m_FrameLayout?.addView(this, lp)
        } else {
            val lp = RelativeLayout.LayoutParams(width, height)
            lp.leftMargin = x
            lp.topMargin = y
            m_LoaderActivity.m_TopLevel?.addView(this, lp)
        }

        try {
            val cls = javaClass
            val method = cls.getMethod("setZOrderOnTop", Boolean::class.javaPrimitiveType)
            method.invoke(this, true)
        } catch (e: Exception) {
        }
    }

    fun videoGetPosition(): Int {
        return try {
            currentPosition
        } catch (e: IllegalStateException) {
            0
        }
    }

    fun videoPause() {
        pause()
    }

    fun videoPlay(path: String, repeats: Int, offset: Long, size: Long): Int {
        m_Repeats = repeats
        if (size == 0L) {
            m_Path = path
            setVideoPath(path)
        } else {
            val uri = Uri.parse("${VFSProvider.ASSET_URI}/$path/$offset/$size")
            m_Uri = uri
            setVideoURI(uri)
        }
        return 0
    }

    fun videoRemoveView() {
        if (requiresSeparateWindow()) {
            m_LoaderActivity.window.windowManager.removeViewImmediate(this)
        } else if (m_Fullscreen) {
            m_LoaderActivity.m_FrameLayout?.removeView(this)
        } else {
            m_LoaderActivity.m_TopLevel?.removeView(this)
        }
    }

    fun videoResume() {
        start()
    }

    fun videoSetVolume(volume: Int) {
        m_Volume = volume.toFloat() / S3E_VIDEO_MAX_VOLUME
        m_MediaPlayer?.setVolume(m_Volume, m_Volume)
    }

    fun videoStop() {
        m_MediaPlayer = null
        stopPlayback()
    }
}
