package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 2 fields, 3 methods.

open class LikeActionController_Anon5: com.facebook.widget.FacebookDialog.Callback {
    val this$0: com.facebook.internal.LikeActionController
    val val$analyticsParameters: android.os.Bundle

    constructor(p0: com.facebook.internal.LikeActionController, p1: android.os.Bundle)

    public fun onComplete(p0: com.facebook.widget.FacebookDialog.PendingCall, p1: android.os.Bundle) { /* TODO(body): (Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 10
    //         if-eqz p2, :cond_0
    //         const-string v0, "object_is_liked"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "object_is_liked"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$800(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v0, "like_count_string"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "like_count_string"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         move-object v2, v3
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1000(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v4
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1100(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v5
    //         const-string v0, "social_sentence"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "social_sentence"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         move-object v4, v5
    //         :cond_3
    //         const-string v0, "object_is_liked"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         const-string v0, "unlike_token"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         :goto_1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->val$analyticsParameters:Landroid/os/Bundle;
    //         if-nez v0, :cond_5
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         :goto_2
    //         const-string v7, "call_id"
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v8
    //         invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v8
    //         invoke-virtual {v0, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v7, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v7}, Lcom/facebook/internal/LikeActionController;->access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v7
    //         const-string v8, "fb_like_control_dialog_did_succeed"
    //         const/4 v9, 0x0
    //         invoke-virtual {v7, v8, v9, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->access$1400(Lcom/facebook/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1200(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_1
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->val$analyticsParameters:Landroid/os/Bundle;
    //         goto :goto_2
    */

    public fun onError(p0: com.facebook.widget.FacebookDialog.PendingCall, p1: Exception, p2: android.os.Bundle) { /* TODO(body): (Lcom/facebook/widget/FacebookDialog$PendingCall;Ljava/lang/Exception;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Like Dialog failed with error : %s"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p2, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->val$analyticsParameters:Landroid/os/Bundle;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         :goto_0
    //         const-string v1, "call_id"
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v2, "present_dialog"
    //         invoke-static {v1, v2, v0}, Lcom/facebook/internal/LikeActionController;->access$1600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1700(Lcom/facebook/internal/LikeActionController;)Landroid/content/Context;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$5;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v2, "com.facebook.sdk.LikeActionController.DID_ERROR"
    //         invoke-static {v0, v1, v2, p3}, Lcom/facebook/internal/LikeActionController;->access$1800(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$5;->val$analyticsParameters:Landroid/os/Bundle;
    //         goto :goto_0
    */

}
