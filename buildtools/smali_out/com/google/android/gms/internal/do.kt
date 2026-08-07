package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 17 methods.

class do: android.widget.FrameLayout(), android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener {
    private val md: com.google.android.gms.internal.gv
    private val rX: android.widget.MediaController
    private val rY: com.google.android.gms.internal.do.a
    private val rZ: android.widget.VideoView
    private var sa: Long
    private var sb: String

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.gv)

    public fun C(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/do;->sb:Ljava/lang/String;
    //         return-void
    */

    public fun b(p0: android.view.MotionEvent) { /* TODO(body): (Landroid/view/MotionEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0, p1}, Landroid/widget/VideoView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    //         return-void
    */

    public fun ch() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->sb:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/do;->sb:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->md:Lcom/google/android/gms/internal/gv;
    //         const-string v1, "no_src"
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun ci() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I
    //         move-result v0
    //         int-to-long v0, v0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/do;->sa:J
    //         cmp-long v2, v2, v0
    //         if-eqz v2, :cond_0
    //         long-to-float v2, v0
    //         const/high16 v3, 0x447a0000    # 1000.0f
    //         div-float/2addr v2, v3
    //         iget-object v3, p0, Lcom/google/android/gms/internal/do;->md:Lcom/google/android/gms/internal/gv;
    //         const-string v4, "timeupdate"
    //         const-string v5, "time"
    //         invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v3, v4, v5, v2}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/do;->sa:J
    //         :cond_0
    //         return-void
    */

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rY:Lcom/google/android/gms/internal/do$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/do$a;->cancel()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V
    //         return-void
    */

    public fun onCompletion(mediaPlayer: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->md:Lcom/google/android/gms/internal/gv;
    //         const-string v1, "ended"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;)V
    //         return-void
    */

    public fun onError(mediaPlayer: android.media.MediaPlayer, what: Int, extra: Int): Boolean { return TODO("body: (Landroid/media/MediaPlayer;II)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun onPrepared(mediaPlayer: android.media.MediaPlayer) { /* TODO(body): (Landroid/media/MediaPlayer;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0}, Landroid/widget/VideoView;->getDuration()I
    //         move-result v0
    //         int-to-float v0, v0
    //         const/high16 v1, 0x447a0000    # 1000.0f
    //         div-float/2addr v0, v1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/do;->md:Lcom/google/android/gms/internal/gv;
    //         const-string v2, "canplaythrough"
    //         const-string v3, "duration"
    //         invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V
    //         return-void
    */

    public fun play() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0}, Landroid/widget/VideoView;->start()V
    //         return-void
    */

    public fun q(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/do;->rX:Landroid/widget/MediaController;
    //         invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rX:Landroid/widget/MediaController;
    //         invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V
    //         goto :goto_0
    */

    public fun seekTo(timeInMilliseconds: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/do;->rZ:Landroid/widget/VideoView;
    //         invoke-virtual {v0, p1}, Landroid/widget/VideoView;->seekTo(I)V
    //         return-void
    */

    companion object {
    private @JvmStatic fun a(p0: com.google.android.gms.internal.gv, p1: String) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/util/HashMap;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/util/Map;)V
    //         return-void
    */

    public @JvmStatic fun a(p0: com.google.android.gms.internal.gv, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         if-nez p2, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         new-instance v2, Ljava/util/HashMap;
    //         if-eqz v0, :cond_2
    //         const/4 v1, 0x2
    //         :goto_1
    //         invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V
    //         const-string v1, "what"
    //         invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         const-string v0, "extra"
    //         invoke-virtual {v2, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         const-string v0, "error"
    //         invoke-static {p0, v0, v2}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/util/Map;)V
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_2
    //         const/4 v1, 0x3
    //         goto :goto_1
    */

    private @JvmStatic fun a(p0: com.google.android.gms.internal.gv, p1: String, p2: String, p3: String) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/util/HashMap;
    //         const/4 v1, 0x2
    //         invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V
    //         invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/do;->a(Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/util/Map;)V
    //         return-void
    */

    private @JvmStatic fun a(p0: com.google.android.gms.internal.gv, p1: String, p2: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/lang/String;Ljava/util/Map;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/gv;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "event"
    //         invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "onVideoEvent"
    //         invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/gv;->a(Ljava/lang/String;Ljava/util/Map;)V
    //         return-void
    */

    }
}
