package android.support.v4.media

// Auto-emitted from smali source: TransportMediator.java.
// 1 fields, 5 methods.

open class TransportMediator_Anon2: android.view.KeyEvent.Callback {
    val this$0: android.support.v4.media.TransportMediator

    constructor(p0: android.support.v4.media.TransportMediator)

    public fun onKeyDown(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/media/TransportMediator;->isMediaKey(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator$2;->this$0:Landroid/support/v4/media/TransportMediator;
    //         iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/TransportPerformer;->onMediaButtonDown(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onKeyLongPress(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onKeyMultiple(keyCode: Int, count: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onKeyUp(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/media/TransportMediator;->isMediaKey(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/TransportMediator$2;->this$0:Landroid/support/v4/media/TransportMediator;
    //         iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/TransportPerformer;->onMediaButtonUp(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
