package android.support.v4.media

// Auto-emitted from smali source: TransportMediator.java.
// 1 fields, 5 methods.

open class TransportMediator_Anon1: android.support.v4.media.TransportMediatorCallback {
    val this$0: android.support.v4.media.TransportMediator

    constructor(p0: android.support.v4.media.TransportMediator)

    public fun getPlaybackPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
    //         iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetCurrentPosition()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun handleAudioFocusChange(focusChange: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
    //         iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/media/TransportPerformer;->onAudioFocusChange(I)V
    //         return-void
    */

    public fun handleKey(key: android.view.KeyEvent) { /* TODO(body): (Landroid/view/KeyEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
    //         iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mKeyEventCallback:Landroid/view/KeyEvent$Callback;
    //         invoke-virtual {p1, v0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;)Z
    //         return-void
    */

    public fun playbackPositionUpdate(newPositionMs: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
    //         iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/TransportPerformer;->onSeekTo(J)V
    //         return-void
    */

}
