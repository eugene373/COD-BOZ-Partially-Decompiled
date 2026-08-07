package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompatApi21.java.
// 1 fields, 5 methods.

open class MediaControllerCompatApi21_CallbackProxy: android.media.session.MediaController.Callback() {
    protected val mCallback: android.support.v4.media.session.MediaControllerCompatApi21.Callback

    public constructor(p0: android.support.v4.media.session.MediaControllerCompatApi21.Callback)

    public fun onMetadataChanged(metadata: android.media.MediaMetadata) { /* TODO(body): (Landroid/media/MediaMetadata;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;->onMetadataChanged(Ljava/lang/Object;)V
    //         return-void
    */

    public fun onPlaybackStateChanged(state: android.media.session.PlaybackState) { /* TODO(body): (Landroid/media/session/PlaybackState;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;->onPlaybackStateChanged(Ljava/lang/Object;)V
    //         return-void
    */

    public fun onSessionDestroyed() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;->onSessionDestroyed()V
    //         return-void
    */

    public fun onSessionEvent(event: String, extras: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;, "Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompatApi21$CallbackProxy;->mCallback:Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompatApi21$Callback;->onSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

}
