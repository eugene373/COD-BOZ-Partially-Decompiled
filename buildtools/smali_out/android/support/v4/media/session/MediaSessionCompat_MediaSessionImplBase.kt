package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompat.java.
// 0 fields, 13 methods.

open class MediaSessionCompat_MediaSessionImplBase: android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl {
    constructor()

    public fun getMediaSession(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getSessionToken(): android.support.v4.media.session.MediaSessionCompat.Token { return TODO("body: ()Landroid/support/v4/media/session/MediaSessionCompat$Token;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun isActive(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun sendSessionEvent(event: String, extras: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setActive(active: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setCallback(callback: android.support.v4.media.session.MediaSessionCompat.Callback, handler: android.os.Handler) { /* TODO(body): (Landroid/support/v4/media/session/MediaSessionCompat$Callback;Landroid/os/Handler;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setFlags(flags: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setMetadata(metadata: android.support.v4.media.MediaMetadataCompat) { /* TODO(body): (Landroid/support/v4/media/MediaMetadataCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPlaybackState(state: android.support.v4.media.session.PlaybackStateCompat) { /* TODO(body): (Landroid/support/v4/media/session/PlaybackStateCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPlaybackToLocal(stream: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPlaybackToRemote(volumeProvider: android.support.v4.media.VolumeProviderCompat) { /* TODO(body): (Landroid/support/v4/media/VolumeProviderCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
