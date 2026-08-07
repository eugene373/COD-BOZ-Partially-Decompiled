package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompat.java.
// 2 fields, 14 methods.

open class MediaSessionCompat_MediaSessionImplApi21: android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl {
    private val mSessionObj: Object
    private val mToken: android.support.v4.media.session.MediaSessionCompat.Token

    public constructor(context: android.content.Context, tag: String)

    public constructor(mediaSession: Object)

    public fun getMediaSession(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getSessionToken(): android.support.v4.media.session.MediaSessionCompat.Token { return TODO("body: ()Landroid/support/v4/media/session/MediaSessionCompat$Token;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mToken:Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //         return-object v0
    */

    public fun isActive(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->isActive(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->release(Ljava/lang/Object;)V
    //         return-void
    */

    public fun sendSessionEvent(event: String, extras: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-static {v0, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->sendSessionEvent(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun setActive(active: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-static {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setActive(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setCallback(callback: android.support.v4.media.session.MediaSessionCompat.Callback, handler: android.os.Handler) { /* TODO(body): (Landroid/support/v4/media/session/MediaSessionCompat$Callback;Landroid/os/Handler;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         iget-object v1, p1, Landroid/support/v4/media/session/MediaSessionCompat$Callback;->mCallbackObj:Ljava/lang/Object;
    //         invoke-static {v0, v1, p2}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setCallback(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Handler;)V
    //         return-void
    */

    public fun setFlags(flags: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-static {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setFlags(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setMetadata(metadata: android.support.v4.media.MediaMetadataCompat) { /* TODO(body): (Landroid/support/v4/media/MediaMetadataCompat;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->getMediaMetadata()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setMetadata(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public fun setPlaybackState(state: android.support.v4.media.session.PlaybackStateCompat) { /* TODO(body): (Landroid/support/v4/media/session/PlaybackStateCompat;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPlaybackState()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setPlaybackState(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public fun setPlaybackToLocal(stream: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-static {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setPlaybackToLocal(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun setPlaybackToRemote(volumeProvider: android.support.v4.media.VolumeProviderCompat) { /* TODO(body): (Landroid/support/v4/media/VolumeProviderCompat;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21;->mSessionObj:Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/support/v4/media/VolumeProviderCompat;->getVolumeProvider()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompatApi21;->setPlaybackToRemote(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

}
