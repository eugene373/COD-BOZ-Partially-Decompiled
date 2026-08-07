package com.facebook.internal

// Auto-emitted from smali source: SessionTracker.java.
// 2 fields, 2 methods.

open class SessionTracker_CallbackWrapper: com.facebook.Session.StatusCallback {
    val this$0: com.facebook.internal.SessionTracker
    private val wrapped: com.facebook.Session.StatusCallback

    public constructor(p0: com.facebook.internal.SessionTracker, p1: com.facebook.Session.StatusCallback)

    public fun call(p0: com.facebook.Session, p1: com.facebook.SessionState, p2: Exception) { /* TODO(body): (Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->wrapped:Lcom/facebook/Session$StatusCallback;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->isTracking()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->wrapped:Lcom/facebook/Session$StatusCallback;
    //         invoke-interface {v0, p1, p2, p3}, Lcom/facebook/Session$StatusCallback;->call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;
    //         invoke-static {v0}, Lcom/facebook/internal/SessionTracker;->access$200(Lcom/facebook/internal/SessionTracker;)Lcom/facebook/Session;
    //         move-result-object v0
    //         if-ne p1, v0, :cond_1
    //         invoke-virtual {p2}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V
    //         :cond_1
    //         return-void
    */

}
