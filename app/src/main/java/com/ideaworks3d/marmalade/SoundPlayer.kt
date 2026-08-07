package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 9 fields, 11 methods.

open class SoundPlayer: android.media.AudioTrack.OnPlaybackPositionUpdateListener {
        private var m_Track: android.media.AudioTrack
        private var m_SampleData: Array<Short>
        private var m_BufSize: Int
        private var m_Period: Int
        private var m_FrameSize: Int
        private var m_Volume: Int
        private var m_Stereo: Boolean
        private var m_NeedsPrime: Boolean
        private var m_SampleRate: Int

    private external fun generateAudio(p0: Array<Short>, p1: Int)
    fun init(p0: Int, p1: Boolean, p2: Int): Int { return TODO("body: (IZI)I") }
    fun start() { /* TODO(body): ()V */ }
    public fun onMarkerReached(p0: android.media.AudioTrack) { /* TODO(body): (Landroid/media/AudioTrack;)V */ }
    private fun writeSamples(p0: Int): Boolean { return TODO("body: (I)Z") }
    public fun onPeriodicNotification(p0: android.media.AudioTrack) { /* TODO(body): (Landroid/media/AudioTrack;)V */ }
    fun stop() { /* TODO(body): ()V */ }
    fun pause() { /* TODO(body): ()V */ }
    fun resume() { /* TODO(body): ()V */ }
    fun setVolume(p0: Int) { /* TODO(body): (I)V */ }
    private fun applyVolume() { /* TODO(body): ()V */ }
}
