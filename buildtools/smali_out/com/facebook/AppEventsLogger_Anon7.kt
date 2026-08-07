package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 4 fields, 2 methods.

class AppEventsLogger_Anon7: com.facebook.Request.Callback {
    val val$accessTokenAppId: com.facebook.AppEventsLogger.AccessTokenAppIdPair
    val val$flushState: com.facebook.AppEventsLogger.FlushStatistics
    val val$postRequest: com.facebook.Request
    val val$sessionEventsState: com.facebook.AppEventsLogger.SessionEventsState

    constructor(p0: com.facebook.AppEventsLogger.AccessTokenAppIdPair, p1: com.facebook.Request, p2: com.facebook.AppEventsLogger.SessionEventsState, p3: com.facebook.AppEventsLogger.FlushStatistics)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger$7;->val$accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger$7;->val$postRequest:Lcom/facebook/Request;
    //         iget-object v2, p0, Lcom/facebook/AppEventsLogger$7;->val$sessionEventsState:Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         iget-object v3, p0, Lcom/facebook/AppEventsLogger$7;->val$flushState:Lcom/facebook/AppEventsLogger$FlushStatistics;
    //         invoke-static {v0, v1, p1, v2, v3}, Lcom/facebook/AppEventsLogger;->access$900(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/Request;Lcom/facebook/Response;Lcom/facebook/AppEventsLogger$SessionEventsState;Lcom/facebook/AppEventsLogger$FlushStatistics;)V
    //         return-void
    */

}
