package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompatApi21.java.
// 1 fields, 12 methods.

open class MediaSessionCompatApi21_CallbackProxy: android.media.session.MediaSession.Callback() {
    protected val mCallback: android.support.v4.media.session.MediaSessionCompatApi21.Callback

    public constructor(p0: android.support.v4.media.session.MediaSessionCompatApi21.Callback)

    public fun onCommand(command: String, args: android.os.Bundle, cb: android.os.ResultReceiver) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    //         return-void
    */

    public fun onFastForward() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onFastForward()V
    //         return-void
    */

    public fun onMediaButtonEvent(mediaButtonIntent: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onMediaButtonEvent(Landroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onPause()V
    //         return-void
    */

    public fun onPlay() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onPlay()V
    //         return-void
    */

    public fun onRewind() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onRewind()V
    //         return-void
    */

    public fun onSeekTo(pos: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onSeekTo(J)V
    //         return-void
    */

    public fun onSetRating(rating: android.media.Rating) { /* TODO(body): (Landroid/media/Rating;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onSetRating(Ljava/lang/Object;)V
    //         return-void
    */

    public fun onSkipToNext() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onSkipToNext()V
    //         return-void
    */

    public fun onSkipToPrevious() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onSkipToPrevious()V
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;->onStop()V
    //         return-void
    */

}
