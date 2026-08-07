package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 2 fields, 3 methods.

open class LikeActionController_PublishUnlikeRequestWrapper: com.facebook.internal.LikeActionController.AbstractRequestWrapper() {
    val this$0: com.facebook.internal.LikeActionController
    private var unlikeToken: String

    constructor(p0: com.facebook.internal.LikeActionController, p1: String)

    protected fun processError(p0: com.facebook.FacebookRequestError) { /* TODO(body): (Lcom/facebook/FacebookRequestError;)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Error unliking object with unlike token \'%s\' : %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->unlikeToken:Ljava/lang/String;
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         aput-object p1, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v1, "publish_unlike"
    //         invoke-static {v0, v1, p1}, Lcom/facebook/internal/LikeActionController;->access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    //         return-void
    */

    protected fun processSuccess(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
