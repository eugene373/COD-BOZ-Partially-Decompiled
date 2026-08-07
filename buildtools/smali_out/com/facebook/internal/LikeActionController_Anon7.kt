package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 4 fields, 2 methods.

open class LikeActionController_Anon7: com.facebook.RequestBatch.Callback {
    val this$0: com.facebook.internal.LikeActionController
    val val$activity: android.app.Activity
    val val$analyticsParameters: android.os.Bundle
    val val$unlikeRequest: com.facebook.internal.LikeActionController.PublishUnlikeRequestWrapper

    constructor(p0: com.facebook.internal.LikeActionController, p1: com.facebook.internal.LikeActionController.PublishUnlikeRequestWrapper, p2: android.app.Activity, p3: android.os.Bundle)

    public fun onBatchCompleted(p0: com.facebook.RequestBatch) { /* TODO(body): (Lcom/facebook/RequestBatch;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2002(Lcom/facebook/internal/LikeActionController;Z)Z
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->val$unlikeRequest:Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$7;->val$activity:Landroid/app/Activity;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;
    //         const/4 v3, 0x1
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/LikeActionController;->access$2100(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;Z)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0, v3}, Lcom/facebook/internal/LikeActionController;->access$1202(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2202(Lcom/facebook/internal/LikeActionController;Z)Z
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         const-string v1, "fb_like_control_did_unlike"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;
    //         invoke-virtual {v0, v1, v3, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$7;->this$0:Lcom/facebook/internal/LikeActionController;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$7;->val$activity:Landroid/app/Activity;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$7;->val$analyticsParameters:Landroid/os/Bundle;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$2300(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

}
