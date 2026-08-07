package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 4 fields, 5 methods.

open class LikeActionController_AbstractRequestWrapper {
    var error: com.facebook.FacebookRequestError
    protected var objectId: String
    private var request: com.facebook.Request
    val this$0: com.facebook.internal.LikeActionController

    protected constructor(p0: com.facebook.internal.LikeActionController, p1: String)

    fun addToBatch(p0: com.facebook.RequestBatch) { /* TODO(body): (Lcom/facebook/RequestBatch;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->request:Lcom/facebook/Request;
    //         invoke-virtual {p1, v0}, Lcom/facebook/RequestBatch;->add(Lcom/facebook/Request;)Z
    //         return-void
    */

    protected fun processError(p0: com.facebook.FacebookRequestError) { /* TODO(body): (Lcom/facebook/FacebookRequestError;)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Error running request for object \'%s\' : %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->objectId:Ljava/lang/String;
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         aput-object p1, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         return-void
    */

    protected fun processSuccess(p0: com.facebook.Response)

    protected fun setRequest(p0: com.facebook.Request) { /* TODO(body): (Lcom/facebook/Request;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->request:Lcom/facebook/Request;
    //         const-string v0, "v2.2"
    //         invoke-virtual {p1, v0}, Lcom/facebook/Request;->setVersion(Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;
    //         invoke-direct {v0, p0}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;-><init>(Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;)V
    //         invoke-virtual {p1, v0}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         return-void
    */

}
