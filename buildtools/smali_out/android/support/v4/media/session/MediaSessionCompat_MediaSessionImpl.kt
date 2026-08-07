package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompat.java.
// 0 fields, 12 methods.

interface MediaSessionCompat_MediaSessionImpl {
    public fun getMediaSession(): Object

    public fun getSessionToken(): android.support.v4.media.session.MediaSessionCompat.Token

    public fun isActive(): Boolean

    public fun release()

    public fun sendSessionEvent(p0: String, p1: android.os.Bundle)

    public fun setActive(p0: Boolean)

    public fun setCallback(p0: android.support.v4.media.session.MediaSessionCompat.Callback, p1: android.os.Handler)

    public fun setFlags(p0: Int)

    public fun setMetadata(p0: android.support.v4.media.MediaMetadataCompat)

    public fun setPlaybackState(p0: android.support.v4.media.session.PlaybackStateCompat)

    public fun setPlaybackToLocal(p0: Int)

    public fun setPlaybackToRemote(p0: android.support.v4.media.VolumeProviderCompat)

}
