package com.facebook

// Auto-emitted from smali source: FacebookBroadcastReceiver.java.
// 0 fields, 4 methods.

open class FacebookBroadcastReceiver: android.content.BroadcastReceiver() {
    public constructor()

    protected fun onFailedAppCall(p0: String, p1: String, p2: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 4
    //         const-string v0, "com.facebook.platform.protocol.CALL_ID"
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "com.facebook.platform.protocol.PROTOCOL_ACTION"
    //         invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v0, :cond_0
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-static {p2}, Lcom/facebook/internal/NativeProtocol;->isErrorResult(Landroid/content/Intent;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/FacebookBroadcastReceiver;->onFailedAppCall(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/FacebookBroadcastReceiver;->onSuccessfulAppCall(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    protected fun onSuccessfulAppCall(p0: String, p1: String, p2: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
