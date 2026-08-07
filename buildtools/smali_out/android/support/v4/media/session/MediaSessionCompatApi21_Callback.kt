package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompatApi21.java.
// 0 fields, 11 methods.

interface MediaSessionCompatApi21_Callback {
    public fun onCommand(p0: String, p1: android.os.Bundle, p2: android.os.ResultReceiver)

    public fun onFastForward()

    public fun onMediaButtonEvent(p0: android.content.Intent): Boolean

    public fun onPause()

    public fun onPlay()

    public fun onRewind()

    public fun onSeekTo(p0: Long)

    public fun onSetRating(p0: Object)

    public fun onSkipToNext()

    public fun onSkipToPrevious()

    public fun onStop()

}
