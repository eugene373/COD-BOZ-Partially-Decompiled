package com.ideaworks3d.marmalade

import android.media.AudioRecord
import android.media.AudioRecord.OnRecordPositionUpdateListener

class SoundRecord : OnRecordPositionUpdateListener {
    private var m_AudioRecord: AudioRecord? = null
    private var m_Buffer: ShortArray? = null
    private var m_BufSize = 0
    private var m_Period = 0
    private var m_Frequency = 0
    private var m_BufferSizeHintMs = 0

    private external fun recordAudio(buffer: ShortArray, numRead: Int, frequency: Int)

    fun start(frequency: Int): Int {
        if (m_AudioRecord != null || available() == 0) return 0
        if (frequency != -1) {
            m_Frequency = frequency
        }
        val channelConfig = 16 // CHANNEL_IN_MONO
        val audioFormat = 2    // ENCODING_PCM_16BIT
        m_BufSize = AudioRecord.getMinBufferSize(m_Frequency, channelConfig, audioFormat)
        if (m_BufSize == -2) {
            trace("Frequency: $m_Frequency is unsupported on this device. Defaulting to 8000Hz")
            m_Frequency = 8000
            m_BufSize = AudioRecord.getMinBufferSize(m_Frequency, channelConfig, audioFormat)
            if (m_BufSize == -2) return 0
        }

        if (m_BufferSizeHintMs > 0) {
            val hinted = (m_Frequency * m_BufferSizeHintMs + 999) / 1000
            if (hinted > m_BufSize) {
                m_BufSize = hinted
            }
        } else if (m_BufSize <= 4096) {
            m_BufSize *= 2
        }

        m_Period = m_BufSize / 2
        trace("record m_Frequency = $m_Frequency")
        trace("record min bufsize (bytes) = ${m_BufSize * 2}")
        trace("record min delay (mills) = ${m_BufSize * 1000 / m_Frequency}")
        m_Buffer = ShortArray(m_BufSize)
        m_AudioRecord = AudioRecord(1, m_Frequency, channelConfig, audioFormat, m_BufSize)
        m_AudioRecord!!.setRecordPositionUpdateListener(this)
        m_AudioRecord!!.setPositionNotificationPeriod(m_Period)

        try {
            m_AudioRecord!!.startRecording()
        } catch (e: IllegalStateException) {
            trace("Exception: $e")
            return 0
        }

        trace("recording ...")
        val numRead = m_AudioRecord!!.read(m_Buffer!!, 0, m_Period)
        recordAudio(m_Buffer!!, numRead, m_Frequency)
        trace("recording working $numRead")
        return m_Frequency
    }

    override fun onMarkerReached(recorder: AudioRecord?) {}

    override fun onPeriodicNotification(recorder: AudioRecord?) {
        val numRead = recorder!!.read(m_Buffer!!, 0, m_Period)
        recordAudio(m_Buffer!!, numRead, m_Frequency)
    }

    fun stop(): Int {
        if (m_AudioRecord == null) return 1
        trace("stopping recording")
        m_AudioRecord!!.setRecordPositionUpdateListener(null as OnRecordPositionUpdateListener?)
        m_AudioRecord!!.stop()
        m_AudioRecord!!.release()
        m_AudioRecord = null
        trace("done stopping recording")
        return 0
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
        private const val PERIODS_IN_BUFFER = 2

        @JvmStatic
        fun available(): Int =
            if (LoaderActivity.m_Activity!!.packageManager.hasSystemFeature("android.hardware.microphone")) 1 else 0
    }
}
