package com.ideaworks3d.marmalade

import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.media.MediaPlayer.OnErrorListener
import android.media.MediaPlayer.OnPreparedListener
import android.net.Uri
import android.view.MotionEvent
import android.widget.FrameLayout
import android.widget.VideoView

class S3EVideoView(
    private val m_LoaderActivity: LoaderActivity,
) : VideoView(m_LoaderActivity),
    OnPreparedListener,
    OnCompletionListener,
    OnErrorListener,
    SuspendResumeListener {

    private var m_Path: String? = null
    private var m_Uri: Uri? = null
    private var m_Repeats = 0
    private var m_Fullscreen = false
    private var m_Width = 0
    private var m_Height = 0
    private var m_MediaPlayer: MediaPlayer? = null
    private var m_Volume = 1.0f
    private var m_StoredPos = 0
    private var m_PausedBeforeSuspend = false
    private var m_FullScreenView: FrameLayout? = null

    init {
        setOnPreparedListener(this)
        setOnCompletionListener(this)
        setOnErrorListener(this)
        LoaderAPI.addSuspendResumeListener(this)
    }

    fun videoGetPosition(): Int = try {
        currentPosition
    } catch (_: IllegalStateException) {
        0
    }

    fun videoPlay(path: String, repeats: Int, offset: Long, length: Long): Int {
        m_Repeats = repeats
        if (length == 0L) {
            m_Path = path
            setVideoPath(m_Path)
        } else {
            m_Uri = Uri.parse(VFSProvider.ASSET_URI.toString() + "/$path/$offset/$length")
            setVideoURI(m_Uri)
        }
        return 0
    }

    fun videoPause() {
        m_StoredPos = currentPosition
        pause()
    }

    fun videoResume() {
        seekTo(m_StoredPos)
        if (m_PausedBeforeSuspend) {
            m_PausedBeforeSuspend = false
            pause()
        } else {
            start()
        }
    }

    override fun onSuspendResumeEvent(event: SuspendResumeEvent) {
        if (event.eventType == SuspendResumeEvent.EventType.SUSPEND) {
            m_PausedBeforeSuspend = m_MediaPlayer == null || !isPlaying
            videoPause()
        }
    }

    fun videoStop() {
        m_MediaPlayer = null
        m_StoredPos = 0
        stopPlayback()
    }

    fun videoAddView(fullscreen: Boolean, x: Int, y: Int, w: Int, h: Int) {
        m_Fullscreen = fullscreen
        m_Width = w
        m_Height = h
        if (fullscreen) {
            val lp = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT,
                17, // Gravity.CENTER
            )
            m_Width = 0
            m_Height = 0
            m_FullScreenView = FrameLayout(m_LoaderActivity)
            m_FullScreenView!!.addView(this, lp)
            m_FullScreenView!!.setBackgroundColor(-0x1000000)
            m_LoaderActivity.m_FrameLayout!!.addView(m_FullScreenView, lp)
        } else {
            val lp = android.widget.RelativeLayout.LayoutParams(w, h)
            lp.leftMargin = x
            lp.topMargin = y
            m_LoaderActivity.m_TopLevel!!.addView(this, lp)
        }
        setZOrderOnTop(true)
    }

    fun videoRemoveView() {
        if (m_Fullscreen) {
            m_LoaderActivity.m_FrameLayout!!.removeView(m_FullScreenView)
            m_FullScreenView = null
        } else {
            m_LoaderActivity.m_TopLevel!!.removeView(this)
        }
    }

    fun videoSetVolume(volume: Int) {
        m_Volume = volume / 256.0f
        m_MediaPlayer?.setVolume(m_Volume, m_Volume)
    }

    override fun onPrepared(mp: MediaPlayer) {
        m_MediaPlayer = mp
        m_MediaPlayer!!.setVolume(m_Volume, m_Volume)
        videoResume()
    }

    override fun onError(mp: MediaPlayer, what: Int, extra: Int): Boolean {
        trace("videoError : $what")
        m_LoaderActivity.m_View!!.videoStopped()
        return true
    }

    override fun onCompletion(mp: MediaPlayer) {
        trace("videoCompletion")
        m_MediaPlayer = null
        m_Repeats--
        if (m_Repeats <= 0) {
            videoStop()
            m_LoaderActivity.m_View!!.videoStopped()
        } else {
            stopPlayback()
            m_StoredPos = 0
            if (m_Uri != null) {
                setVideoURI(m_Uri)
            } else {
                setVideoPath(m_Path)
            }
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val thread = m_LoaderActivity.LoaderThread() ?: return false
        val location = IntArray(2)
        getLocationOnScreen(location)
        event.offsetLocation(location[0].toFloat(), location[1].toFloat())
        return thread.onTouchEvent(event)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        if (m_Width != 0 && m_Height != 0) {
            setMeasuredDimension(m_Width, m_Height)
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
        const val S3E_VIDEO_STOPPED = 0
        const val S3E_VIDEO_PLAYING = 1
        const val S3E_VIDEO_PAUSED = 2
        const val S3E_VIDEO_FAILED = 3
        const val S3E_VIDEO_MAX_VOLUME = 256
    }
}
