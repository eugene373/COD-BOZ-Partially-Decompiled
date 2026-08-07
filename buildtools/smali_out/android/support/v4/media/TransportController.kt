package android.support.v4.media

// Auto-emitted from smali source: TransportController.java.
// 0 fields, 12 methods.

open class TransportController {
    public constructor()

    public fun getBufferPercentage(): Int

    public fun getCurrentPosition(): Long

    public fun getDuration(): Long

    public fun getTransportControlFlags(): Int

    public fun isPlaying(): Boolean

    public fun pausePlaying()

    public fun registerStateListener(p0: android.support.v4.media.TransportStateListener)

    public fun seekTo(p0: Long)

    public fun startPlaying()

    public fun stopPlaying()

    public fun unregisterStateListener(p0: android.support.v4.media.TransportStateListener)

}
