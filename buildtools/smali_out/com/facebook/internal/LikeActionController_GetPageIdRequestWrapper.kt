package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 3 fields, 3 methods.

open class LikeActionController_GetPageIdRequestWrapper: com.facebook.internal.LikeActionController.AbstractRequestWrapper() {
    var objectIsPage: Boolean
    val this$0: com.facebook.internal.LikeActionController
    var verifiedObjectId: String

    constructor(p0: com.facebook.internal.LikeActionController, p1: String)

    protected fun processError(p0: com.facebook.FacebookRequestError) { /* TODO(body): (Lcom/facebook/FacebookRequestError;)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Error getting the FB id for object \'%s\' : %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectId:Ljava/lang/String;
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         aput-object p1, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         return-void
    */

    protected fun processSuccess(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectId:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->tryGetJSONObjectFromResponse(Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, "id"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectIsPage:Z
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
