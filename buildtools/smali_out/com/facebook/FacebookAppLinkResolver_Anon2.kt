package com.facebook

// Auto-emitted from smali source: FacebookAppLinkResolver.java.
// 4 fields, 2 methods.

open class FacebookAppLinkResolver_Anon2: com.facebook.Request.Callback {
    val this$0: com.facebook.FacebookAppLinkResolver
    val val$appLinkResults: java.util.Map
    val val$taskCompletionSource: bolts.Task.TaskCompletionSource
    val val$urisToRequest: java.util.HashSet

    constructor(p0: com.facebook.FacebookAppLinkResolver, p1: bolts.Task.TaskCompletionSource, p2: java.util.Map, p3: java.util.HashSet)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 9
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v0}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v0
    //         move-object v2, v0
    //         :goto_1
    //         if-nez v2, :cond_2
    //         iget-object v0, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;
    //         iget-object v1, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;
    //         invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         move-object v2, v0
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$urisToRequest:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_3
    //         :goto_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         :try_start_0
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v4, "app_links"
    //         invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v4
    //         const-string v1, "android"
    //         invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v5
    //         invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    //         move-result v6
    //         new-instance v7, Ljava/util/ArrayList;
    //         invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v1, 0x0
    //         :goto_3
    //         if-ge v1, v6, :cond_5
    //         invoke-virtual {v5, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v8
    //         invoke-static {v8}, Lcom/facebook/FacebookAppLinkResolver;->access$000(Lorg/json/JSONObject;)Lbolts/AppLink$Target;
    //         move-result-object v8
    //         if-eqz v8, :cond_4
    //         invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_4
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_3
    //         :cond_5
    //         invoke-static {v0, v4}, Lcom/facebook/FacebookAppLinkResolver;->access$100(Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;
    //         move-result-object v1
    //         new-instance v4, Lbolts/AppLink;
    //         invoke-direct {v4, v0, v7, v1}, Lbolts/AppLink;-><init>(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V
    //         iget-object v1, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;
    //         invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/facebook/FacebookAppLinkResolver$2;->this$0:Lcom/facebook/FacebookAppLinkResolver;
    //         invoke-static {v1}, Lcom/facebook/FacebookAppLinkResolver;->access$200(Lcom/facebook/FacebookAppLinkResolver;)Ljava/util/HashMap;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :try_start_1
    //         iget-object v5, p0, Lcom/facebook/FacebookAppLinkResolver$2;->this$0:Lcom/facebook/FacebookAppLinkResolver;
    //         invoke-static {v5}, Lcom/facebook/FacebookAppLinkResolver;->access$200(Lcom/facebook/FacebookAppLinkResolver;)Ljava/util/HashMap;
    //         move-result-object v5
    //         invoke-virtual {v5, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         throw v0
    //         :try_end_2
    //         .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_2
    //         :cond_6
    //         iget-object v0, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$taskCompletionSource:Lbolts/Task$TaskCompletionSource;
    //         iget-object v1, p0, Lcom/facebook/FacebookAppLinkResolver$2;->val$appLinkResults:Ljava/util/Map;
    //         invoke-virtual {v0, v1}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    //         goto/16 :goto_0
    */

}
