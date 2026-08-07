package com.facebook

// Auto-emitted from smali source: Request.java.
// 2 fields, 2 methods.

class Request_Anon4: Runnable {
    val val$callbacks: java.util.ArrayList
    val val$requests: com.facebook.RequestBatch

    constructor(p0: java.util.ArrayList, p1: com.facebook.RequestBatch)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/Request$4;->val$callbacks:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/util/Pair;
    //         iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;
    //         check-cast v1, Lcom/facebook/Request$Callback;
    //         iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;
    //         check-cast v0, Lcom/facebook/Response;
    //         invoke-interface {v1, v0}, Lcom/facebook/Request$Callback;->onCompleted(Lcom/facebook/Response;)V
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Request$4;->val$requests:Lcom/facebook/RequestBatch;
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->getCallbacks()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/RequestBatch$Callback;
    //         iget-object v2, p0, Lcom/facebook/Request$4;->val$requests:Lcom/facebook/RequestBatch;
    //         invoke-interface {v0, v2}, Lcom/facebook/RequestBatch$Callback;->onBatchCompleted(Lcom/facebook/RequestBatch;)V
    //         goto :goto_1
    //         :cond_1
    //         return-void
    */

}
