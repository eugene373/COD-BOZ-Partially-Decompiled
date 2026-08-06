package com.ideaworks3d.marmalade

import android.media.AudioFormat
import android.media.AudioTrack
import android.os.SystemClock

class SoundPlayer : AudioTrack.OnPlaybackPositionUpdateListener {

    companion object {
        const val PERIODS_IN_BUFFER = 4
        const val AudioFormat_Encoding = AudioFormat.ENCODING_PCM_16BIT
    }

    private var m_BufSize = 0
    private var m_FrameSize = 0
    private var m_NeedsPrime = false
    private var m_Period = 0
    private var m_SampleData: ShortArray? = null
    private var m_SampleRate = 0
    private var m_Stereo = false
    private var m_Track: AudioTrack? = null
    private var m_Volume = 0

    private external fun generateAudio(samples: ShortArray, numSamples: Int)

    private fun applyVolume() {
        synchronized(this) {
            val maxVol = AudioTrack.getMaxVolume()
            val vol = m_Volume.toFloat() * maxVol / 100.0f
            m_Track?.setStereoVolume(vol, vol)
        }
    }

    @Synchronized
    fun init(sampleRate: Int, stereo: Boolean, bufferSize: Int): Int {
        m_SampleRate = sampleRate
        m_Stereo = stereo
        m_Volume = bufferSize

        if (m_SampleRate == 0) {
            m_SampleRate = AudioTrack.getNativeOutputSampleRate(3)
        }

        var channelConfig = 2
        if (m_Stereo) {
            channelConfig = 3
        }
        m_FrameSize = channelConfig
        if (m_Stereo) {
            m_FrameSize *= 2
        }

        m_BufSize = AudioTrack.getMinBufferSize(m_SampleRate, 3, AudioFormat.ENCODING_PCM_16BIT)
        m_Period = m_BufSize / m_FrameSize / 4

        try {
            m_Track = AudioTrack(3, m_SampleRate, channelConfig, AudioFormat_Encoding, m_BufSize, 1)
            applyVolume()
        } catch (e: IllegalArgumentException) {
            return 0
        }

        if (m_Track?.state != 2) {
            return 0
        }

        m_SampleData = ShortArray(m_BufSize)
        m_Track?.setPlaybackPositionUpdateListener(this)
        m_Track?.setPositionNotificationPeriod(m_Period)
        m_NeedsPrime = true

        return m_SampleRate
    }

    private fun writeSamples(numSamples: Int): Boolean {
        if (m_Track == null || m_SampleData == null) return false

        generateAudio(m_SampleData!!, numSamples)

        var samplesToWrite = numSamples
        if (m_Stereo) {
            samplesToWrite *= 2
        }

        if (m_Track == null || m_SampleData == null) return false

        val start = SystemClock.uptimeMillis()
        m_Track?.write(m_SampleData!!, 0, samplesToWrite)
        val elapsed = SystemClock.uptimeMillis() - start

        return elapsed <= 1
    }

    override fun onMarkerReached(track: AudioTrack?) {
    }

    @Synchronized
    override fun onPeriodicNotification(track: AudioTrack?) {
        writeSamples(m_Period)
    }

    @Synchronized
    fun pause() {
        if (m_Track == null) return
        if (m_Track?.playState == AudioTrack.PLAYSTATE_PLAYING) {
            m_Track?.pause()
        }
    }

    @Synchronized
    fun resume() {
        if (m_Track == null) return
        if (m_Track?.playState == AudioTrack.PLAYSTATE_PAUSED) {
            start()
            val numSamples = m_Period * 4 / 2
            writeSamples(numSamples)
        }
    }

    @Synchronized
    fun setVolume(volume: Int) {
        m_Volume = volume
        if (m_Track != null) {
            applyVolume()
        }
    }

    fun start() {
        if (m_Track == null) {
            init(m_SampleRate, m_Stereo, m_Volume)
        }
        m_Track?.play()
        if (m_NeedsPrime) {
            m_NeedsPrime = false
            val numSamples = m_Period * 4
            writeSamples(numSamples)
        }
    }

    @Synchronized
    fun stop() {
        if (m_Track == null) return
        m_Track?.setPlaybackPositionUpdateListener(null)
        m_Track?.stop()
        m_Track?.flush()
        m_Track?.release()
        m_Track = null
    }
}
