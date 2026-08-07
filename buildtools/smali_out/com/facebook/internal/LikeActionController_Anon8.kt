package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 1 fields, 2 methods.

open class LikeActionController_Anon8: com.facebook.internal.LikeActionController.RequestCompletionCallback {
    val this$0: com.facebook.internal.LikeActionController

    constructor(p0: com.facebook.internal.LikeActionController)

    public fun onComplete() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v2}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v3, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v3}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         new-instance v2, Lcom/facebook/RequestBatch;
    //         invoke-direct {v2}, Lcom/facebook/RequestBatch;-><init>()V
    //         invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V
    //         invoke-virtual {v1, v2}, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V
    //         new-instance v3, Lcom/facebook/internal/LikeActionController$8$1;
    //         invoke-direct {v3, p0, v0, v1}, Lcom/facebook/internal/LikeActionController$8$1;-><init>(Lcom/facebook/internal/LikeActionController$8;Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;)V
    //         invoke-virtual {v2, v3}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V
    //         invoke-virtual {v2}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         return-void
    */

}
