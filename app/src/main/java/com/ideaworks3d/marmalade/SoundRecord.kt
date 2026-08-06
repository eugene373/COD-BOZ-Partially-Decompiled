package com.ideaworks3d.marmalade

import android.content.pm.PackageManager
import android.media.AudioFormat
import android.media.AudioRecord
import android.media.MediaRecorder

class SoundRecord : AudioRecord.OnRecordPositionUpdateListener {

    companion object {
        const val AudioFormat_Encoding = AudioFormat.ENCODING_PCM_16BIT

        fun available(): Boolean {
            val activity = LoaderActivity.m_Activity
            val pm = activity?.packageManager
            return pm?.hasSystemFeature("android.hardware.microphone") == true
        }
    }

    private var m_AudioRecord: AudioRecord? = null
    private var m_BufSize = 0
    private var m_Buffer: ShortArray? = null
    private var m_Frequency = 0
    private var m_Period = 0

    private external fun recordAudio(samples: ShortArray, numSamples: Int, frequency: Int)

    override fun onMarkerReached(recorder: AudioRecord?) {
    }

    override fun onPeriodicNotification(recorder: AudioRecord?) {
        val result = m_AudioRecord?.read(m_Buffer!!, 0, m_Period) ?: 0
        recordAudio(m_Buffer!!, result, m_Frequency)
    }

    fun start(bufferSize: Int): Int {
        if (m_AudioRecord != null || !available()) {
            return 0
        }

        if (bufferSize != -1) {
            m_Frequency = bufferSize
        }

        m_BufSize = AudioRecord.getMinBufferSize(m_Frequency, 3, AudioFormat.ENCODING_PCM_16BIT)

        if (m_BufSize == -1 || m_BufSize == AudioRecord.ERROR) {
            m_Frequency = 8000
            m_BufSize = AudioRecord.getMinBufferSize(m_Frequency, 3, AudioFormat.ENCODING_PCM_16BIT)
            if (m_BufSize == -1 || m_BufSize == AudioRecord.ERROR) {
                return 0
            }
        }

        if (m_BufSize > 4096) {
            m_BufSize *= 2
        }

        m_Period = m_BufSize / 4
        m_Buffer = ShortArray(m_BufSize)

        m_AudioRecord = AudioRecord(
            MediaRecorder.AudioSource.MIC,
            m_Frequency,
            3,
            AudioFormat_Encoding,
            m_BufSize
        )

        try {
            m_AudioRecord?.setRecordPositionUpdateListener(this)
            m_AudioRecord?.setPositionNotificationPeriod(m_Period)
            m_AudioRecord?.startRecording()

            val result = m_AudioRecord?.read(m_Buffer!!, 0, m_Period) ?: 0
            recordAudio(m_Buffer!!, result, m_Frequency)
            return m_Frequency
        } catch (e: IllegalStateException) {
            return 0
        }
    }

    fun stop(): Int {
        if (m_AudioRecord == null) {
            return 1
        }
        m_AudioRecord?.setRecordPositionUpdateListener(null)
        m_AudioRecord?.stop()
        m_AudioRecord?.release()
        m_AudioRecord = null
        return 0
    }
}
