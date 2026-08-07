package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 3 fields, 3 methods.

open class LikeActionController_GetOGObjectLikesRequestWrapper: com.facebook.internal.LikeActionController.AbstractRequestWrapper() {
    var objectIsLiked: Boolean
    val this$0: com.facebook.internal.LikeActionController
    var unlikeToken: String

    constructor(p0: com.facebook.internal.LikeActionController, p1: String)

    protected fun processError(p0: com.facebook.FacebookRequestError) { /* TODO(body): (Lcom/facebook/FacebookRequestError;)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Error fetching like status for object \'%s\' : %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->objectId:Ljava/lang/String;
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         aput-object p1, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v1, "get_og_object_like"
    //         invoke-static {v0, v1, p1}, Lcom/facebook/internal/LikeActionController;->access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    //         return-void
    */

    protected fun processSuccess(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 6
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         const-string v1, "data"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->tryGetJSONArrayFromResponse(Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         if-ge v0, v2, :cond_1
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         const/4 v3, 0x1
    //         iput-boolean v3, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->objectIsLiked:Z
    //         const-string v3, "application"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         iget-object v4, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v4}, Lcom/facebook/internal/LikeActionController;->access$2700(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/Session;
    //         move-result-object v4
    //         invoke-virtual {v4}, Lcom/facebook/Session;->getApplicationId()Ljava/lang/String;
    //         move-result-object v4
    //         const-string v5, "id"
    //         invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v4, v3}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         const-string v3, "id"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->unlikeToken:Ljava/lang/String;
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

}
