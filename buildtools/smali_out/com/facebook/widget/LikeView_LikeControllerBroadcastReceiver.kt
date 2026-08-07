package com.facebook.widget

// Auto-emitted from smali source: LikeView.java.
// 1 fields, 3 methods.

open class LikeView_LikeControllerBroadcastReceiver: android.content.BroadcastReceiver() {
    val this$0: com.facebook.widget.LikeView

    private constructor(p0: com.facebook.widget.LikeView)

    constructor(p0: com.facebook.widget.LikeView, p1: com.facebook.widget.LikeView.1)

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         const-string v3, "com.facebook.sdk.LikeActionController.OBJECT_ID"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         iget-object v4, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v4}, Lcom/facebook/widget/LikeView;->access$600(Lcom/facebook/widget/LikeView;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v4, v3}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         :cond_0
    //         :goto_0
    //         if-nez v0, :cond_3
    //         :cond_1
    //         :goto_1
    //         return-void
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_3
    //         const-string v0, "com.facebook.sdk.LikeActionController.UPDATED"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v0}, Lcom/facebook/widget/LikeView;->access$700(Lcom/facebook/widget/LikeView;)V
    //         goto :goto_1
    //         :cond_4
    //         const-string v0, "com.facebook.sdk.LikeActionController.DID_ERROR"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v0}, Lcom/facebook/widget/LikeView;->access$800(Lcom/facebook/widget/LikeView;)Lcom/facebook/widget/LikeView$OnErrorListener;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v0}, Lcom/facebook/widget/LikeView;->access$800(Lcom/facebook/widget/LikeView;)Lcom/facebook/widget/LikeView$OnErrorListener;
    //         move-result-object v0
    //         invoke-interface {v0, v2}, Lcom/facebook/widget/LikeView$OnErrorListener;->onError(Landroid/os/Bundle;)V
    //         goto :goto_1
    //         :cond_5
    //         const-string v0, "com.facebook.sdk.LikeActionController.DID_RESET"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v1}, Lcom/facebook/widget/LikeView;->access$600(Lcom/facebook/widget/LikeView;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/widget/LikeView;->access$900(Lcom/facebook/widget/LikeView;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v0}, Lcom/facebook/widget/LikeView;->access$700(Lcom/facebook/widget/LikeView;)V
    //         goto :goto_1
    */

}
