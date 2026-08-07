package android.support.v4.media

// Auto-emitted from smali source: TransportMediator.java.
// 20 fields, 23 methods.

open class TransportMediator: android.support.v4.media.TransportController() {
    val mAudioManager: android.media.AudioManager
    val mCallbacks: android.support.v4.media.TransportPerformer
    val mContext: android.content.Context
    val mController: android.support.v4.media.TransportMediatorJellybeanMR2
    val mDispatcherState: Object
    val mKeyEventCallback: android.view.KeyEvent.Callback
    val mListeners: java.util.ArrayList
    val mTransportKeyCallback: android.support.v4.media.TransportMediatorCallback
    val mView: android.view.View

    public constructor(activity: android.app.Activity, callbacks: android.support.v4.media.TransportPerformer)

    private constructor(activity: android.app.Activity, view: android.view.View, callbacks: android.support.v4.media.TransportPerformer)

    public constructor(view: android.view.View, callbacks: android.support.v4.media.TransportPerformer)

    private fun getListeners(): Array<android.support.v4.media.TransportStateListener> { return TODO("body: ()[Landroid/support/v4/media/TransportStateListener;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-gtz v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         new-array v0, v1, [Landroid/support/v4/media/TransportStateListener;
    //         .local v0, "listeners":[Landroid/support/v4/media/TransportStateListener;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         goto :goto_0
    */

    private fun pushControllerState() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v1}, Landroid/support/v4/media/TransportPerformer;->onIsPlaying()Z
    //         move-result v1
    //         iget-object v2, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v2}, Landroid/support/v4/media/TransportPerformer;->onGetCurrentPosition()J
    //         move-result-wide v2
    //         iget-object v4, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v4}, Landroid/support/v4/media/TransportPerformer;->onGetTransportControlFlags()I
    //         move-result v4
    //         invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->refreshState(ZJI)V
    //         :cond_0
    //         return-void
    */

    private fun reportPlayingChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->getListeners()[Landroid/support/v4/media/TransportStateListener;
    //         move-result-object v4
    //         .local v4, "listeners":[Landroid/support/v4/media/TransportStateListener;
    //         if-eqz v4, :cond_0
    //         move-object v0, v4
    //         .local v0, "arr$":[Landroid/support/v4/media/TransportStateListener;
    //         array-length v2, v0
    //         .local v2, "len$":I
    //         const/4 v1, 0x0
    //         .local v1, "i$":I
    //         :goto_0
    //         if-ge v1, v2, :cond_0
    //         aget-object v3, v0, v1
    //         .local v3, "listener":Landroid/support/v4/media/TransportStateListener;
    //         invoke-virtual {v3, p0}, Landroid/support/v4/media/TransportStateListener;->onPlayingChanged(Landroid/support/v4/media/TransportController;)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v0    # "arr$":[Landroid/support/v4/media/TransportStateListener;
    //         .end local v1    # "i$":I
    //         .end local v2    # "len$":I
    //         .end local v3    # "listener":Landroid/support/v4/media/TransportStateListener;
    //         :cond_0
    //         return-void
    */

    private fun reportTransportControlsChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->getListeners()[Landroid/support/v4/media/TransportStateListener;
    //         move-result-object v4
    //         .local v4, "listeners":[Landroid/support/v4/media/TransportStateListener;
    //         if-eqz v4, :cond_0
    //         move-object v0, v4
    //         .local v0, "arr$":[Landroid/support/v4/media/TransportStateListener;
    //         array-length v2, v0
    //         .local v2, "len$":I
    //         const/4 v1, 0x0
    //         .local v1, "i$":I
    //         :goto_0
    //         if-ge v1, v2, :cond_0
    //         aget-object v3, v0, v1
    //         .local v3, "listener":Landroid/support/v4/media/TransportStateListener;
    //         invoke-virtual {v3, p0}, Landroid/support/v4/media/TransportStateListener;->onTransportControlsChanged(Landroid/support/v4/media/TransportController;)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v0    # "arr$":[Landroid/support/v4/media/TransportStateListener;
    //         .end local v1    # "i$":I
    //         .end local v2    # "len$":I
    //         .end local v3    # "listener":Landroid/support/v4/media/TransportStateListener;
    //         :cond_0
    //         return-void
    */

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->destroy()V
    //         return-void
    */

    public fun dispatchKeyEvent(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mKeyEventCallback:Landroid/view/KeyEvent$Callback;
    //         iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mDispatcherState:Ljava/lang/Object;
    //         invoke-static {p1, v0, v1, p0}, Landroid/support/v4/view/KeyEventCompat;->dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun getBufferPercentage(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetBufferPercentage()I
    //         move-result v0
    //         return v0
    */

    public fun getCurrentPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetCurrentPosition()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getDuration(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetDuration()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getRemoteControlClient(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->getRemoteControlClient()Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getTransportControlFlags(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetTransportControlFlags()I
    //         move-result v0
    //         return v0
    */

    public fun isPlaying(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onIsPlaying()Z
    //         move-result v0
    //         return v0
    */

    public fun pausePlaying() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->pausePlaying()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onPause()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
    //         return-void
    */

    public fun refreshState() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportTransportControlsChanged()V
    //         return-void
    */

    public fun registerStateListener(listener: android.support.v4.media.TransportStateListener) { /* TODO(body): (Landroid/support/v4/media/TransportStateListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun seekTo(pos: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/TransportPerformer;->onSeekTo(J)V
    //         return-void
    */

    public fun startPlaying() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->startPlaying()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onStart()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
    //         return-void
    */

    public fun stopPlaying() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->stopPlaying()V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onStop()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
    //         invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
    //         return-void
    */

    public fun unregisterStateListener(listener: android.support.v4.media.TransportStateListener) { /* TODO(body): (Landroid/support/v4/media/TransportStateListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         return-void
    */

    companion object {
    @JvmField public val FLAG_KEY_MEDIA_FAST_FORWARD: Int = 0x40
    @JvmField public val FLAG_KEY_MEDIA_NEXT: Int = 0x80
    @JvmField public val FLAG_KEY_MEDIA_PAUSE: Int = 0x10
    @JvmField public val FLAG_KEY_MEDIA_PLAY: Int = 0x4
    @JvmField public val FLAG_KEY_MEDIA_PLAY_PAUSE: Int = 0x8
    @JvmField public val FLAG_KEY_MEDIA_PREVIOUS: Int = 0x1
    @JvmField public val FLAG_KEY_MEDIA_REWIND: Int = 0x2
    @JvmField public val FLAG_KEY_MEDIA_STOP: Int = 0x20
    @JvmField public val KEYCODE_MEDIA_PAUSE: Int = 0x7f
    @JvmField public val KEYCODE_MEDIA_PLAY: Int = 0x7e
    @JvmField public val KEYCODE_MEDIA_RECORD: Int = 0x82

    @JvmStatic fun isMediaKey(keyCode: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         sparse-switch p0, :sswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x4f -> :sswitch_0
    //             0x55 -> :sswitch_0
    //             0x56 -> :sswitch_0
    //             0x57 -> :sswitch_0
    //             0x58 -> :sswitch_0
    //             0x59 -> :sswitch_0
    //             0x5a -> :sswitch_0
    //             0x5b -> :sswitch_0
    //             0x7e -> :sswitch_0
    //             0x7f -> :sswitch_0
    //             0x82 -> :sswitch_0
    //         .end sparse-switch
    */

    }
}
