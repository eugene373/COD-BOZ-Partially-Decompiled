package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompat.java.
// 1 fields, 12 methods.

open class MediaSessionCompat_Callback {
    val mCallbackObj: Object

    public constructor()

    public fun onCommand(command: String, extras: android.os.Bundle, cb: android.os.ResultReceiver) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onFastForward() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onMediaButtonEvent(mediaButtonEvent: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPlay() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onRewind() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSeekTo(pos: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSetRating(rating: android.support.v4.media.RatingCompat) { /* TODO(body): (Landroid/support/v4/media/RatingCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSkipToNext() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSkipToPrevious() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
