package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompat.java.
// 1 fields, 13 methods.

class MediaControllerCompat {
    private val mImpl: android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl

    public constructor(context: android.content.Context, sessionToken: android.support.v4.media.session.MediaSessionCompat.Token)

    public constructor(context: android.content.Context, session: android.support.v4.media.session.MediaSessionCompat)

    public fun dispatchMediaButtonEvent(keyEvent: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "KeyEvent may not be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun getMediaController(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->getMediaController()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMetadata(): android.support.v4.media.MediaMetadataCompat { return TODO("body: ()Landroid/support/v4/media/MediaMetadataCompat;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPlaybackInfo(): android.support.v4.media.session.MediaControllerCompat.PlaybackInfo { return TODO("body: ()Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->getPlaybackInfo()Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPlaybackState(): android.support.v4.media.session.PlaybackStateCompat { return TODO("body: ()Landroid/support/v4/media/session/PlaybackStateCompat;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRatingType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->getRatingType()I
    //         move-result v0
    //         return v0
    */

    public fun getTransportControls(): android.support.v4.media.session.MediaControllerCompat.TransportControls { return TODO("body: ()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;
    //         move-result-object v0
    //         return-object v0
    */

    public fun registerCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V
    //         return-void
    */

    public fun registerCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback, handler: android.os.Handler) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "callback cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-nez p2, :cond_1
    //         new-instance p2, Landroid/os/Handler;
    //         .end local p2    # "handler":Landroid/os/Handler;
    //         invoke-direct {p2}, Landroid/os/Handler;-><init>()V
    //         .restart local p2    # "handler":Landroid/os/Handler;
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V
    //         return-void
    */

    public fun sendCommand(command: String, params: android.os.Bundle, cb: android.os.ResultReceiver) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "command cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    //         return-void
    */

    public fun unregisterCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "callback cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat;->mImpl:Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImpl;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V
    //         return-void
    */

}
