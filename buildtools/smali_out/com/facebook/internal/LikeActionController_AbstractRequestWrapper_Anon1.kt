package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 1 fields, 2 methods.

open class LikeActionController_AbstractRequestWrapper_Anon1: com.facebook.Request.Callback {
    val this$1: com.facebook.internal.LikeActionController.AbstractRequestWrapper

    constructor(p0: com.facebook.internal.LikeActionController.AbstractRequestWrapper)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         iput-object v1, v0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
    //         iget-object v0, v0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
    //         iget-object v1, v1, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->error:Lcom/facebook/FacebookRequestError;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->processError(Lcom/facebook/FacebookRequestError;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->processSuccess(Lcom/facebook/Response;)V
    //         goto :goto_0
    */

}
