package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 3 fields, 2 methods.

open class LikeActionController_Anon6: com.facebook.internal.LikeActionController.RequestCompletionCallback {
    val this$0: com.facebook.internal.LikeActionController
    val val$activity: android.app.Activity
    val val$analyticsParameters: android.os.Bundle

    constructor(p0: com.facebook.internal.LikeActionController, p1: android.app.Activity, p2: android.os.Bundle)

    public fun onComplete() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "com.facebook.platform.status.ERROR_DESCRIPTION"
    //         const-string v2, "Invalid Object Id"
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v1}, Lcom/facebook/internal/LikeActionController;->access$1700(Lcom/facebook/internal/LikeActionController;)Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v3, "com.facebook.sdk.LikeActionController.DID_ERROR"
    //         invoke-static {v1, v2, v3, v0}, Lcom/facebook/internal/LikeActionController;->access$1800(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/facebook/RequestBatch;
    //         invoke-direct {v0}, Lcom/facebook/RequestBatch;-><init>()V
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v3, p0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v3}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$6$1;
    //         invoke-direct {v2, p0, v1}, Lcom/facebook/internal/LikeActionController$6$1;-><init>(Lcom/facebook/internal/LikeActionController$6;Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;)V
    //         invoke-virtual {v0, v2}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         goto :goto_0
    */

}
