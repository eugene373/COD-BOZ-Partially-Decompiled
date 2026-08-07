package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompatApi21.java.
// 0 fields, 15 methods.

open class MediaSessionCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun createCallback(callback: android.support.v4.media.session.MediaSessionCompatApi21.Callback): Object { return TODO("body: (Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;
    //         invoke-direct {v0, p0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$CallbackProxy;-><init>(Landroid/support/v4/media/session/MediaSessionCompatApi21$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun createSession(context: android.content.Context, tag: String): Object { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/media/session/MediaSession;
    //         invoke-direct {v0, p0, p1}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    //         return-object v0
    */

    public @JvmStatic fun getSessionToken(sessionObj: Object): android.os.Parcelable { return TODO("body: (Ljava/lang/Object;)Landroid/os/Parcelable;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaSession;->getSessionToken()Landroid/media/session/MediaSession$Token;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isActive(sessionObj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaSession;->isActive()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun release(sessionObj: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaSession;->release()V
    //         return-void
    */

    public @JvmStatic fun sendSessionEvent(sessionObj: Object, event: String, extras: android.os.Bundle) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/media/session/MediaSession;->sendSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public @JvmStatic fun setActive(sessionObj: Object, active: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setActive(Z)V
    //         return-void
    */

    public @JvmStatic fun setCallback(sessionObj: Object, callbackObj: Object, handler: android.os.Handler) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Handler;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/session/MediaSession$Callback;
    //         .end local p1    # "callbackObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V
    //         return-void
    */

    public @JvmStatic fun setFlags(sessionObj: Object, flags: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setFlags(I)V
    //         return-void
    */

    public @JvmStatic fun setMetadata(sessionObj: Object, metadataObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/MediaMetadata;
    //         .end local p1    # "metadataObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V
    //         return-void
    */

    public @JvmStatic fun setPlaybackState(sessionObj: Object, stateObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/session/PlaybackState;
    //         .end local p1    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V
    //         return-void
    */

    public @JvmStatic fun setPlaybackToLocal(sessionObj: Object, stream: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/media/AudioAttributes$Builder;
    //         invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V
    //         .local v0, "bob":Landroid/media/AudioAttributes$Builder;
    //         invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Landroid/media/session/MediaSession;->setPlaybackToLocal(Landroid/media/AudioAttributes;)V
    //         return-void
    */

    public @JvmStatic fun setPlaybackToRemote(sessionObj: Object, volumeProviderObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/session/MediaSession;
    //         .end local p0    # "sessionObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/VolumeProvider;
    //         .end local p1    # "volumeProviderObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setPlaybackToRemote(Landroid/media/VolumeProvider;)V
    //         return-void
    */

    public @JvmStatic fun verifySession(mediaSession: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         instance-of v0, p0, Landroid/media/session/MediaSession;
    //         if-eqz v0, :cond_0
    //         return-object p0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "mediaSession is not a valid MediaSession object"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    }
}
