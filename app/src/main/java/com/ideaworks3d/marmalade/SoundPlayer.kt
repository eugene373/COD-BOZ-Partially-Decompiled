package com.ideaworks3d.marmalade

import android.media.AudioTrack
import android.media.AudioTrack.OnPlaybackPositionUpdateListener
import android.os.SystemClock

class SoundPlayer : OnPlaybackPositionUpdateListener {
    private var m_Track: AudioTrack? = null
    private var m_SampleData: ShortArray? = null
    private var m_BufSize = 0
    private var m_Period = 0
    private var m_FrameSize = 0
    private var m_Volume = 0
    private var m_Stereo = false
    private var m_NeedsPrime = false
    private var m_SampleRate = 0

    private external fun generateAudio(buffer: ShortArray, frames: Int)

    fun init(volume: Int, stereo: Boolean, sampleRate: Int): Int {
        m_SampleRate = sampleRate
        m_Stereo = stereo
        m_Volume = volume
        if (m_SampleRate == 0) {
            m_SampleRate = AudioTrack.getNativeOutputSampleRate(3)
        }
        val audioFormat = 2 // ENCODING_PCM_16BIT
        val mode = 1        // MODE_STREAM
        var channelConfig = 4 // CHANNEL_OUT_MONO
        if (m_Stereo) channelConfig = 12 // CHANNEL_OUT_STEREO
        m_FrameSize = 2
        if (m_Stereo) m_FrameSize *= 2
        m_BufSize = AudioTrack.getMinBufferSize(m_SampleRate, channelConfig, audioFormat)
        m_Period = (m_BufSize / m_FrameSize) / 2
        trace("snd stereo      = $m_Stereo")
        trace("snd samplerate  = $m_SampleRate native: ${AudioTrack.getNativeOutputSampleRate(3)}")
        trace("snd buf (bytes) = $m_BufSize")
        trace("snd buf (mills) = ${m_BufSize / 2 * 1000 / m_SampleRate}")
        trace("snd framesize   = $m_FrameSize")
        trace("snd period      = $m_Period")
        try {
            m_Track = AudioTrack(3, m_SampleRate, channelConfig, audioFormat, m_BufSize * 2, mode)
            applyVolume()
        } catch (e: IllegalArgumentException) {
            trace("error creating AudioTrack $e")
            return 0
        }
        if (m_Track!!.state != 1) {
            trace("AudioTrack not initialized")
            return 0
        }
        m_SampleData = ShortArray(m_BufSize * 2)
        m_Track!!.setPlaybackPositionUpdateListener(this)
        m_Track!!.setPositionNotificationPeriod(m_Period)
        trace("snd chanconfig  = ${m_Track!!.channelConfiguration}")
        trace("snd samplerate  = ${m_Track!!.playbackRate}")
        m_NeedsPrime = true
        return m_SampleRate
    }

    fun start() {
        if (m_Track == null) {
            init(m_Volume, m_Stereo, m_SampleRate)
        }
        trace("starting sound")
        m_Track!!.play()
        if (m_NeedsPrime) {
            m_NeedsPrime = false
            writeSamples(m_Period * 2 * 2)
        }
    }

    override fun onMarkerReached(track: AudioTrack?) {
        trace("onMarkerReached")
    }

    private fun writeSamples(frames: Int): Boolean {
        if (m_Track != null && m_SampleData != null) {
            generateAudio(m_SampleData!!, frames)
            var count = frames
            if (m_Stereo) count = frames * 2
            if (m_Track != null && m_SampleData != null) {
                val t0 = SystemClock.uptimeMillis()
                m_Track!!.write(m_SampleData!!, 0, count)
                val delta = SystemClock.uptimeMillis() - t0
                if (delta > 1L) {
                    trace("write blocked $delta headpos=${m_Track!!.playbackHeadPosition}")
                }
                return true
            }
            return false
        }
        return false
    }

    @Synchronized
    override fun onPeriodicNotification(track: AudioTrack?) {
        val ok = writeSamples(m_Period)
        if (!ok) {
            trace("Sound engine already paused")
        }
    }

    @Synchronized
    fun stop() {
        if (m_Track != null) {
            trace("stopping sound")
            m_Track!!.setPlaybackPositionUpdateListener(null as OnPlaybackPositionUpdateListener?)
            m_Track!!.stop()
            m_Track!!.flush()
            m_Track!!.release()
            m_Track = null
            trace("done stopping sound")
        }
    }

    @Synchronized
    fun pause() {
        if (m_Track != null) {
            trace("pause : ${m_Track!!.playState}")
            if (m_Track!!.playState == 3) {
                trace("pausing sound")
                m_Track!!.pause()
            }
        }
    }

    @Synchronized
    fun resume() {
        if (m_Track != null) {
            trace("resume : ${m_Track!!.playState}")
            if (m_Track!!.playState == 2) {
                trace("resuming sound")
                start()
                writeSamples(m_Period * 2 * 2)
            }
        }
    }

    @Synchronized
    fun setVolume(volume: Int) {
        m_Volume = volume
        if (m_Track != null) {
            applyVolume()
        }
    }

    @Synchronized
    private fun applyVolume() {
        val vol = (m_Volume * AudioTrack.getMaxVolume()) / 100.0f
        m_Track!!.setStereoVolume(vol, vol)
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
        private const val INITIAL_BUFFER_SIZE_MULTIPLIER = 2
        private const val PERIODS_IN_BUFFER = 2
    }
}
