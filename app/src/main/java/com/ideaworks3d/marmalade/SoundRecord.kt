package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 6 fields, 6 methods.

open class SoundRecord: android.media.AudioRecord.OnRecordPositionUpdateListener {
        private var m_AudioRecord: android.media.AudioRecord
        private var m_Buffer: Array<Short>
        private var m_BufSize: Int
        private var m_Period: Int
        private var m_Frequency: Int
        private var m_BufferSizeHintMs: Int

    private external fun recordAudio(p0: Array<Short>, p1: Int, p2: Int)
    public fun start(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    public fun onMarkerReached(p0: android.media.AudioRecord) { /* TODO(body): (Landroid/media/AudioRecord;)V */ }
    public fun onPeriodicNotification(p0: android.media.AudioRecord) { /* TODO(body): (Landroid/media/AudioRecord;)V */ }
    public fun stop(): Int { return TODO("body: ()I") }

    companion object {
        public @JvmStatic fun available(): Int { return TODO("body: ()I") }
    }
}
