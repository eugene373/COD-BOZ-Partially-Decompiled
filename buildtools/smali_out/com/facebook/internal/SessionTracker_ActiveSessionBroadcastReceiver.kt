package com.facebook.internal

// Auto-emitted from smali source: SessionTracker.java.
// 1 fields, 3 methods.

open class SessionTracker_ActiveSessionBroadcastReceiver: android.content.BroadcastReceiver() {
    val this$0: com.facebook.internal.SessionTracker

    private constructor(p0: com.facebook.internal.SessionTracker)

    constructor(p0: com.facebook.internal.SessionTracker, p1: com.facebook.internal.SessionTracker.1)

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_SET"
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/internal/SessionTracker$ActiveSessionBroadcastReceiver;->this$0:Lcom/facebook/internal/SessionTracker;
    //         invoke-static {v1}, Lcom/facebook/internal/SessionTracker;->access$100(Lcom/facebook/internal/SessionTracker;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_0
    //         return-void
    */

}
