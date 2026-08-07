package android.support.v4.content

// Auto-emitted from smali source: LocalBroadcastManager.java.
// 1 fields, 2 methods.

open class LocalBroadcastManager_Anon1: android.os.Handler() {
    val this$0: android.support.v4.content.LocalBroadcastManager

    constructor(x0: android.support.v4.content.LocalBroadcastManager, p1: android.os.Looper)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 1
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager$1;->this$0:Landroid/support/v4/content/LocalBroadcastManager;
    //         invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->access$000(Landroid/support/v4/content/LocalBroadcastManager;)V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

}
