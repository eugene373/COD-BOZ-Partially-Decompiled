package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompat.java.
// 3 fields, 16 methods.

open class MediaSessionCompat {
    private val mImpl: android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl

    public constructor(context: android.content.Context, tag: String)

    private constructor(impl: android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl)

    public fun getMediaSession(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->getMediaSession()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSessionToken(): android.support.v4.media.session.MediaSessionCompat.Token { return TODO("body: ()Landroid/support/v4/media/session/MediaSessionCompat$Token;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isActive(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->isActive()Z
    //         move-result v0
    //         return v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->release()V
    //         return-void
    */

    public fun sendSessionEvent(event: String, extras: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "event cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->sendSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun setActive(active: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setActive(Z)V
    //         return-void
    */

    public fun setCallback(callback: android.support.v4.media.session.MediaSessionCompat.Callback) { /* TODO(body): (Landroid/support/v4/media/session/MediaSessionCompat$Callback;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->setCallback(Landroid/support/v4/media/session/MediaSessionCompat$Callback;Landroid/os/Handler;)V
    //         return-void
    */

    public fun setCallback(callback: android.support.v4.media.session.MediaSessionCompat.Callback, handler: android.os.Handler) { /* TODO(body): (Landroid/support/v4/media/session/MediaSessionCompat$Callback;Landroid/os/Handler;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         if-eqz p2, :cond_0
    //         .end local p2    # "handler":Landroid/os/Handler;
    //         :goto_0
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setCallback(Landroid/support/v4/media/session/MediaSessionCompat$Callback;Landroid/os/Handler;)V
    //         return-void
    //         .restart local p2    # "handler":Landroid/os/Handler;
    //         :cond_0
    //         new-instance p2, Landroid/os/Handler;
    //         .end local p2    # "handler":Landroid/os/Handler;
    //         invoke-direct {p2}, Landroid/os/Handler;-><init>()V
    //         goto :goto_0
    */

    public fun setFlags(flags: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setFlags(I)V
    //         return-void
    */

    public fun setMetadata(metadata: android.support.v4.media.MediaMetadataCompat) { /* TODO(body): (Landroid/support/v4/media/MediaMetadataCompat;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V
    //         return-void
    */

    public fun setPlaybackState(state: android.support.v4.media.session.PlaybackStateCompat) { /* TODO(body): (Landroid/support/v4/media/session/PlaybackStateCompat;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    //         return-void
    */

    public fun setPlaybackToLocal(stream: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setPlaybackToLocal(I)V
    //         return-void
    */

    public fun setPlaybackToRemote(volumeProvider: android.support.v4.media.VolumeProviderCompat) { /* TODO(body): (Landroid/support/v4/media/VolumeProviderCompat;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "volumeProvider may not be null!"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat;->mImpl:Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;->setPlaybackToRemote(Landroid/support/v4/media/VolumeProviderCompat;)V
    //         return-void
    */

    companion object {
    @JvmField public val FLAG_HANDLES_MEDIA_BUTTONS: Int = 0x1
    @JvmField public val FLAG_HANDLES_TRANSPORT_CONTROLS: Int = 0x2

    public @JvmStatic fun obtain(mediaSession: Object): android.support.v4.media.session.MediaSessionCompat { return TODO("body: (Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat;
    //         new-instance v1, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;
    //         invoke-direct {v1, p0}, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;-><init>(Ljava/lang/Object;)V
    //         invoke-direct {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImpl;)V
    //         return-object v0
    */

    }
}
