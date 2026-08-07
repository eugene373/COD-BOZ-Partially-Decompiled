package com.facebook

// Auto-emitted from smali source: Session.java.
// 3 fields, 2 methods.

open class Session_Anon4: Runnable {
    val this$0: com.facebook.Session
    val val$exception: Exception
    val val$newState: com.facebook.SessionState

    constructor(p0: com.facebook.Session, p1: com.facebook.SessionState, p2: Exception)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;
    //         invoke-static {v0}, Lcom/facebook/Session;->access$1200(Lcom/facebook/Session;)Ljava/util/List;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;
    //         invoke-static {v0}, Lcom/facebook/Session;->access$1200(Lcom/facebook/Session;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Session$StatusCallback;
    //         new-instance v3, Lcom/facebook/Session$4$1;
    //         invoke-direct {v3, p0, v0}, Lcom/facebook/Session$4$1;-><init>(Lcom/facebook/Session$4;Lcom/facebook/Session$StatusCallback;)V
    //         iget-object v0, p0, Lcom/facebook/Session$4;->this$0:Lcom/facebook/Session;
    //         invoke-static {v0}, Lcom/facebook/Session;->access$1300(Lcom/facebook/Session;)Landroid/os/Handler;
    //         move-result-object v0
    //         invoke-static {v0, v3}, Lcom/facebook/Session;->access$1400(Landroid/os/Handler;Ljava/lang/Runnable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

}
