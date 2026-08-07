package android.support.v4.media

// Auto-emitted from smali source: TransportMediatorJellybeanMR2.java.
// 1 fields, 2 methods.

open class TransportMediatorJellybeanMR2_Anon3: android.content.BroadcastReceiver() {
    val this$0: android.support.v4.media.TransportMediatorJellybeanMR2

    constructor(p0: android.support.v4.media.TransportMediatorJellybeanMR2)

    public fun onReceive(context: android.content.Context, intent: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         const-string v2, "android.intent.extra.KEY_EVENT"
    //         invoke-virtual {p2, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Landroid/view/KeyEvent;
    //         .local v1, "event":Landroid/view/KeyEvent;
    //         iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;->this$0:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
    //         iget-object v2, v2, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
    //         invoke-interface {v2, v1}, Landroid/support/v4/media/TransportMediatorCallback;->handleKey(Landroid/view/KeyEvent;)V
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v1    # "event":Landroid/view/KeyEvent;
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/ClassCastException;
    //         const-string v2, "TransportController"
    //         invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

}
