package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompat.java.
// 1 fields, 12 methods.

open class MediaControllerCompat_MediaControllerImplApi21: android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl {
    private val mControllerObj: Object

    public constructor(context: android.content.Context, sessionToken: android.support.v4.media.session.MediaSessionCompat.Token)

    public constructor(context: android.content.Context, session: android.support.v4.media.session.MediaSessionCompat)

    public fun dispatchMediaButtonEvent(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->dispatchMediaButtonEvent(Ljava/lang/Object;Landroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun getMediaController(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getMetadata(): android.support.v4.media.MediaMetadataCompat { return TODO("body: ()Landroid/support/v4/media/MediaMetadataCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v1}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->getMetadata(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "metadataObj":Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         invoke-static {v0}, Landroid/support/v4/media/MediaMetadataCompat;->fromMediaMetadata(Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getPlaybackInfo(): android.support.v4.media.session.MediaControllerCompat.PlaybackInfo { return TODO("body: ()Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->getPlaybackInfo(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v6
    //         .local v6, "volumeInfoObj":Ljava/lang/Object;
    //         if-eqz v6, :cond_0
    //         new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;
    //         invoke-static {v6}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->getPlaybackType(Ljava/lang/Object;)I
    //         move-result v1
    //         invoke-static {v6}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->getLegacyAudioStream(Ljava/lang/Object;)I
    //         move-result v2
    //         invoke-static {v6}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->getVolumeControl(Ljava/lang/Object;)I
    //         move-result v3
    //         invoke-static {v6}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->getMaxVolume(Ljava/lang/Object;)I
    //         move-result v4
    //         invoke-static {v6}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->getCurrentVolume(Ljava/lang/Object;)I
    //         move-result v5
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;-><init>(IIIII)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getPlaybackState(): android.support.v4.media.session.PlaybackStateCompat { return TODO("body: ()Landroid/support/v4/media/session/PlaybackStateCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v1}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->getPlaybackState(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "stateObj":Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         invoke-static {v0}, Landroid/support/v4/media/session/PlaybackStateCompat;->fromPlaybackState(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getRatingType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->getRatingType(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getTransportControls(): android.support.v4.media.session.MediaControllerCompat.TransportControls { return TODO("body: ()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v1}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->getTransportControls(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "controlsObj":Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/support/v4/media/session/MediaControllerCompat$TransportControlsApi21;
    //         invoke-direct {v1, v0}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControlsApi21;-><init>(Ljava/lang/Object;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun registerCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback, handler: android.os.Handler) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         iget-object v1, p1, Landroid/support/v4/media/session/MediaControllerCompat$Callback;->mCallbackObj:Ljava/lang/Object;
    //         invoke-static {v0, v1, p2}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->registerCallback(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Handler;)V
    //         return-void
    */

    public fun sendCommand(command: String, params: android.os.Bundle, cb: android.os.ResultReceiver) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         invoke-static {v0, p1, p2, p3}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->sendCommand(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    //         return-void
    */

    public fun unregisterCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;->mControllerObj:Ljava/lang/Object;
    //         iget-object v1, p1, Landroid/support/v4/media/session/MediaControllerCompat$Callback;->mCallbackObj:Ljava/lang/Object;
    //         invoke-static {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompatApi21;->unregisterCallback(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

}
