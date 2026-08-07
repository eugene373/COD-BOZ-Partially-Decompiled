package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 4 fields, 2 methods.

open class LikeActionController_Anon10: com.facebook.RequestBatch.Callback {
    val this$0: com.facebook.internal.LikeActionController
    val val$completionHandler: com.facebook.internal.LikeActionController.RequestCompletionCallback
    val val$objectIdRequest: com.facebook.internal.LikeActionController.GetOGObjectIdRequestWrapper
    val val$pageIdRequest: com.facebook.internal.LikeActionController.GetPageIdRequestWrapper

    constructor(p0: com.facebook.internal.LikeActionController, p1: com.facebook.internal.LikeActionController.GetOGObjectIdRequestWrapper, p2: com.facebook.internal.LikeActionController.GetPageIdRequestWrapper, p3: com.facebook.internal.LikeActionController.RequestCompletionCallback)

    public fun onBatchCompleted(p0: com.facebook.RequestBatch) { /* TODO(body): (Lcom/facebook/RequestBatch;)V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->val$objectIdRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;
    //         iget-object v1, v1, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1902(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
    //         iget-object v1, v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1902(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
    //         iget-boolean v1, v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectIsPage:Z
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2502(Lcom/facebook/internal/LikeActionController;Z)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Unable to verify the FB id for \'%s\'. Verify that it is a valid FB object or page"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v5}, Lcom/facebook/internal/LikeActionController;->access$2400(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v2, "get_verified_id"
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         :goto_0
    //         invoke-static {v1, v2, v0}, Lcom/facebook/internal/LikeActionController;->access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$completionHandler:Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$completionHandler:Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;
    //         invoke-interface {v0}, Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;->onComplete()V
    //         :cond_2
    //         return-void
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$objectIdRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         goto :goto_0
    */

}
