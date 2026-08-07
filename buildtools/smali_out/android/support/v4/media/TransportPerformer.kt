package android.support.v4.media

// Auto-emitted from smali source: TransportPerformer.java.
// 6 fields, 13 methods.

open class TransportPerformer {
    public constructor()

    public fun onAudioFocusChange(focusChange: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 9
    //         const/4 v7, 0x0
    //         .local v7, "keyCode":I
    //         packed-switch p1, :pswitch_data_0
    //         :goto_0
    //         if-eqz v7, :cond_0
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v2
    //         .local v2, "now":J
    //         new-instance v1, Landroid/view/KeyEvent;
    //         const/4 v6, 0x0
    //         const/4 v8, 0x0
    //         move-wide v4, v2
    //         invoke-direct/range {v1 .. v8}, Landroid/view/KeyEvent;-><init>(JJIII)V
    //         invoke-virtual {p0, v7, v1}, Landroid/support/v4/media/TransportPerformer;->onMediaButtonDown(ILandroid/view/KeyEvent;)Z
    //         new-instance v1, Landroid/view/KeyEvent;
    //         const/4 v6, 0x1
    //         const/4 v8, 0x0
    //         move-wide v4, v2
    //         invoke-direct/range {v1 .. v8}, Landroid/view/KeyEvent;-><init>(JJIII)V
    //         invoke-virtual {p0, v7, v1}, Landroid/support/v4/media/TransportPerformer;->onMediaButtonUp(ILandroid/view/KeyEvent;)Z
    //         .end local v2    # "now":J
    //         :cond_0
    //         return-void
    //         :pswitch_0
    //         const/16 v7, 0x7f
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch -0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun onGetBufferPercentage(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/16 v0, 0x64
    //         return v0
    */

    public fun onGetCurrentPosition(): Long

    public fun onGetDuration(): Long

    public fun onGetTransportControlFlags(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/16 v0, 0x3c
    //         return v0
    */

    public fun onIsPlaying(): Boolean

    public fun onMediaButtonDown(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         :goto_0
    //         return v1
    //         :sswitch_0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onStart()V
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onPause()V
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onStop()V
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onIsPlaying()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onPause()V
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onStart()V
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x4f -> :sswitch_3
    //             0x55 -> :sswitch_3
    //             0x56 -> :sswitch_2
    //             0x7e -> :sswitch_0
    //             0x7f -> :sswitch_1
    //         .end sparse-switch
    */

    public fun onMediaButtonUp(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun onPause()

    public fun onSeekTo(p0: Long)

    public fun onStart()

    public fun onStop()

    companion object {
    val AUDIOFOCUS_GAIN: Int = 0x1
    val AUDIOFOCUS_GAIN_TRANSIENT: Int = 0x2
    val AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK: Int = 0x3
    val AUDIOFOCUS_LOSS: Int = 0
    val AUDIOFOCUS_LOSS_TRANSIENT: Int = 0
    val AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK: Int = 0
    }
}
