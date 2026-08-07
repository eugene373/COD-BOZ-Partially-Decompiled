package com.facebook.widget

// Auto-emitted from smali source: LikeView.java.
// 2 fields, 4 methods.

open class LikeView_LikeActionControllerCreationCallback: com.facebook.internal.LikeActionController.CreationCallback {
    private var isCancelled: Boolean
    val this$0: com.facebook.widget.LikeView

    private constructor(p0: com.facebook.widget.LikeView)

    constructor(p0: com.facebook.widget.LikeView, p1: com.facebook.widget.LikeView.1)

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;->isCancelled:Z
    //         return-void
    */

    public fun onComplete(p0: com.facebook.internal.LikeActionController) { /* TODO(body): (Lcom/facebook/internal/LikeActionController;)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;->isCancelled:Z
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v0, p1}, Lcom/facebook/widget/LikeView;->access$1000(Lcom/facebook/widget/LikeView;Lcom/facebook/internal/LikeActionController;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/widget/LikeView;
    //         invoke-static {v0}, Lcom/facebook/widget/LikeView;->access$700(Lcom/facebook/widget/LikeView;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;->this$0:Lcom/facebook/widget/LikeView;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/facebook/widget/LikeView;->access$1102(Lcom/facebook/widget/LikeView;Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;)Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         goto :goto_0
    */

}
