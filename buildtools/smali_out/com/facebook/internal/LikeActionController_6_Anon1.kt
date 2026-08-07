package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 2 fields, 2 methods.

open class LikeActionController_6_Anon1: com.facebook.RequestBatch.Callback {
    val this$1: com.facebook.internal.LikeActionController.6
    val val$likeRequest: com.facebook.internal.LikeActionController.PublishLikeRequestWrapper

    constructor(p0: com.facebook.internal.LikeActionController.6, p1: com.facebook.internal.LikeActionController.PublishLikeRequestWrapper)

    public fun onBatchCompleted(p0: com.facebook.RequestBatch) { /* TODO(body): (Lcom/facebook/RequestBatch;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0, v3}, Lcom/facebook/internal/LikeActionController;->access$2002(Lcom/facebook/internal/LikeActionController;Z)Z
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v1, v1, Lcom/facebook/internal/LikeActionController$6;->val$activity:Landroid/app/Activity;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/LikeActionController;->access$2100(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;Z)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;
    //         iget-object v1, v1, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->unlikeToken:Ljava/lang/String;
    //         invoke-static {v1, v4}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1202(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const/4 v1, 0x1
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2202(Lcom/facebook/internal/LikeActionController;Z)Z
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         const-string v1, "fb_like_control_did_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;
    //         invoke-virtual {v0, v1, v4, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v1, v1, Lcom/facebook/internal/LikeActionController$6;->val$activity:Landroid/app/Activity;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;
    //         iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$2300(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

}
