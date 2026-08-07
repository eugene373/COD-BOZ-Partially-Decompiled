package com.facebook

// Auto-emitted from smali source: UiLifecycleHelper.java.
// 1 fields, 3 methods.

open class UiLifecycleHelper_ActiveSessionBroadcastReceiver: android.content.BroadcastReceiver() {
    val this$0: com.facebook.UiLifecycleHelper

    private constructor(p0: com.facebook.UiLifecycleHelper)

    constructor(p0: com.facebook.UiLifecycleHelper, p1: com.facebook.UiLifecycleHelper.1)

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_SET"
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/UiLifecycleHelper;
    //         invoke-static {v1}, Lcom/facebook/UiLifecycleHelper;->access$100(Lcom/facebook/UiLifecycleHelper;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/UiLifecycleHelper;
    //         invoke-static {v1}, Lcom/facebook/UiLifecycleHelper;->access$100(Lcom/facebook/UiLifecycleHelper;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/UiLifecycleHelper;
    //         invoke-static {v1}, Lcom/facebook/UiLifecycleHelper;->access$100(Lcom/facebook/UiLifecycleHelper;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/UiLifecycleHelper;
    //         invoke-static {v1}, Lcom/facebook/UiLifecycleHelper;->access$100(Lcom/facebook/UiLifecycleHelper;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         goto :goto_0
    */

}
