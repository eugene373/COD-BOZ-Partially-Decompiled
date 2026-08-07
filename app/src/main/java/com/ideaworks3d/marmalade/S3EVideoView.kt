package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 12 fields, 14 methods.

open class S3EVideoView: android.widget.VideoView(), android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, com.ideaworks3d.marmalade.SuspendResumeListener {
        private var m_LoaderActivity: com.ideaworks3d.marmalade.LoaderActivity
        private var m_Path: String
        private var m_Uri: android.net.Uri
        private var m_Repeats: Int
        private var m_Fullscreen: Boolean
        private var m_Width: Int
        private var m_Height: Int
        private var m_MediaPlayer: android.media.MediaPlayer
        private var m_Volume: Float
        private var m_StoredPos: Int
        private var m_PausedBeforeSuspend: Boolean
        private var m_FullScreenView: android.widget.FrameLayout

    public fun videoGetPosition(): Int { return TODO("body: ()I") }
    public fun videoPlay(p0: String, p1: Int, p2: Long, p3: Long): Int { return TODO("body: (Ljava/lang/String;IJJ)I") }
    public fun videoPause() { /* TODO(body): ()V */ }
    public fun videoResume() { /* TODO(body): ()V */ }
    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    public fun videoStop() { /* TODO(body): ()V */ }
    public fun videoAddView(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) { /* TODO(body): (ZIIII)V */ }
    public fun videoRemoveView() { /* TODO(body): ()V */ }
    public fun videoSetVolume(p0: Int) { /* TODO(body): (I)V */ }
    public fun onPrepared(p0: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    public fun onError(p0: android.media.MediaPlayer, p1: Int, p2: Int): Boolean { return TODO("body: (Landroid/media/MediaPlayer;II)Z") }
    public fun onCompletion(p0: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    public fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    protected fun onMeasure(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
}
