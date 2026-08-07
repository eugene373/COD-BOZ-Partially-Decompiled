package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 5 fields, 3 methods.

open class LikeActionController_GetEngagementRequestWrapper: com.facebook.internal.LikeActionController.AbstractRequestWrapper() {
    var likeCountStringWithLike: String
    var likeCountStringWithoutLike: String
    var socialSentenceStringWithLike: String
    var socialSentenceStringWithoutLike: String
    val this$0: com.facebook.internal.LikeActionController

    constructor(p0: com.facebook.internal.LikeActionController, p1: String)

    protected fun processError(p0: com.facebook.FacebookRequestError) { /* TODO(body): (Lcom/facebook/FacebookRequestError;)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "Error fetching engagement for object \'%s\' : %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->objectId:Ljava/lang/String;
    //         aput-object v5, v3, v4
    //         const/4 v4, 0x1
    //         aput-object p1, v3, v4
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;
    //         const-string v1, "get_engagement"
    //         invoke-static {v0, v1, p1}, Lcom/facebook/internal/LikeActionController;->access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    //         return-void
    */

    protected fun processSuccess(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         const-string v1, "engagement"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->tryGetJSONObjectFromResponse(Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, "count_string_with_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->likeCountStringWithLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->likeCountStringWithLike:Ljava/lang/String;
    //         const-string v1, "count_string_without_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->likeCountStringWithoutLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->likeCountStringWithoutLike:Ljava/lang/String;
    //         const-string v1, "social_sentence_with_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->socialSentenceStringWithLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->socialSentenceStringWithLike:Ljava/lang/String;
    //         const-string v1, "social_sentence_without_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->socialSentenceStringWithoutLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->socialSentenceStringWithoutLike:Ljava/lang/String;
    //         :cond_0
    //         return-void
    */

}
