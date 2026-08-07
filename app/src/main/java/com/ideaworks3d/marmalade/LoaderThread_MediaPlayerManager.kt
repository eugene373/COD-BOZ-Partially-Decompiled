package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 6 fields, 17 methods.

open class LoaderThread_MediaPlayerManager {
        private var m_MediaPlayer: Array<android.media.MediaPlayer>
        private var m_MediaPlayerListener: Array<com.ideaworks3d.marmalade.LoaderThread$MediaPlayerManager$MediaPlayerListener>
        private var m_AudioState: Array<com.ideaworks3d.marmalade.LoaderThread$AudioState>
        private var m_AudioIsPaused: Array<Boolean>
        private var m_AudioPlayRepeats: Array<Int>
        private var m_AudioVolume: Array<Int>

    public fun audioGetNumChannels(): Int { return TODO("body: ()I") }
    private fun audioStopped(p0: Int) { /* TODO(body): (I)V */ }
    public fun audioPlay(p0: String, p1: Int, p2: Long, p3: Long, p4: Int): Int { return TODO("body: (Ljava/lang/String;IJJI)I") }
    public fun doPause() { /* TODO(body): ()V */ }
    public fun doResume() { /* TODO(body): ()V */ }
    public fun audioPause(p0: Int): Int { return TODO("body: (I)I") }
    public fun audioResume(p0: Int): Int { return TODO("body: (I)I") }
    public fun audioStopAll() { /* TODO(body): ()V */ }
    public fun audioStop(p0: Int) { /* TODO(body): (I)V */ }
    public fun audioIsPlaying(p0: Int): Boolean { return TODO("body: (I)Z") }
    public fun audioGetStatus(p0: Int): Int { return TODO("body: (I)I") }
    public fun audioGetPosition(p0: Int): Int { return TODO("body: (I)I") }
    public fun audioGetDuration(p0: Int): Int { return TODO("body: (I)I") }
    public fun audioSetPosition(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    public fun audioSetVolume(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    private fun audioSetVolumeInternal(p0: Int) { /* TODO(body): (I)V */ }
    private fun audioChangeState(p0: com.ideaworks3d.marmalade.LoaderThread$AudioState, p1: Int) { /* TODO(body): (Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;I)V */ }
}
