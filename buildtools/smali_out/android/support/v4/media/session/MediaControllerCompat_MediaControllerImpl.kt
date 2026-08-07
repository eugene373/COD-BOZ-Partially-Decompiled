package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompat.java.
// 0 fields, 10 methods.

interface MediaControllerCompat_MediaControllerImpl {
    public fun dispatchMediaButtonEvent(p0: android.view.KeyEvent): Boolean

    public fun getMediaController(): Object

    public fun getMetadata(): android.support.v4.media.MediaMetadataCompat

    public fun getPlaybackInfo(): android.support.v4.media.session.MediaControllerCompat.PlaybackInfo

    public fun getPlaybackState(): android.support.v4.media.session.PlaybackStateCompat

    public fun getRatingType(): Int

    public fun getTransportControls(): android.support.v4.media.session.MediaControllerCompat.TransportControls

    public fun registerCallback(p0: android.support.v4.media.session.MediaControllerCompat.Callback, p1: android.os.Handler)

    public fun sendCommand(p0: String, p1: android.os.Bundle, p2: android.os.ResultReceiver)

    public fun unregisterCallback(p0: android.support.v4.media.session.MediaControllerCompat.Callback)

}
