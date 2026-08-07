package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompat.java.
// 0 fields, 11 methods.

open class MediaControllerCompat_MediaControllerImplBase: android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl {
    constructor()

    public fun dispatchMediaButtonEvent(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMediaController(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getMetadata(): android.support.v4.media.MediaMetadataCompat { return TODO("body: ()Landroid/support/v4/media/MediaMetadataCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getPlaybackInfo(): android.support.v4.media.session.MediaControllerCompat.PlaybackInfo { return TODO("body: ()Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getPlaybackState(): android.support.v4.media.session.PlaybackStateCompat { return TODO("body: ()Landroid/support/v4/media/session/PlaybackStateCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getRatingType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getTransportControls(): android.support.v4.media.session.MediaControllerCompat.TransportControls { return TODO("body: ()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun registerCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback, handler: android.os.Handler) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;Landroid/os/Handler;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun sendCommand(command: String, params: android.os.Bundle, cb: android.os.ResultReceiver) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun unregisterCallback(callback: android.support.v4.media.session.MediaControllerCompat.Callback) { /* TODO(body): (Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
