package com.facebook

// Auto-emitted from smali source: Session.java.
// 33 fields, 92 methods.

open class Session: java.io.Serializable {
    private var appEventsLogger: com.facebook.AppEventsLogger
    private var applicationId: String
    private var authorizationBundle: android.os.Bundle
    private var authorizationClient: com.facebook.AuthorizationClient
    private var autoPublishAsyncTask: com.facebook.Session.AutoPublishAsyncTask
    private val callbacks: java.util.List
    private var currentTokenRefreshRequest: com.facebook.Session.TokenRefreshRequest
    private var handler: android.os.Handler
    private var lastAttemptedTokenExtendDate: java.util.Date
    private val lock: Object
    private var pendingAuthorizationRequest: com.facebook.Session.AuthorizationRequest
    private var state: com.facebook.SessionState
    private var tokenCachingStrategy: com.facebook.TokenCachingStrategy
    private var tokenInfo: com.facebook.AccessToken

    public constructor(p0: android.content.Context)

    constructor(p0: android.content.Context, p1: String, p2: com.facebook.TokenCachingStrategy)

    constructor(p0: android.content.Context, p1: String, p2: com.facebook.TokenCachingStrategy, p3: Boolean)

    private constructor(p0: String, p1: com.facebook.SessionState, p2: com.facebook.AccessToken, p3: java.util.Date, p4: Boolean, p5: com.facebook.Session.AuthorizationRequest)

    constructor(p0: String, p1: com.facebook.SessionState, p2: com.facebook.AccessToken, p3: java.util.Date, p4: Boolean, p5: com.facebook.Session.AuthorizationRequest, p6: com.facebook.Session.1)

    private constructor(p0: String, p1: com.facebook.SessionState, p2: com.facebook.AccessToken, p3: java.util.Date, p4: Boolean, p5: com.facebook.Session.AuthorizationRequest, p6: java.util.Set)

    constructor(p0: String, p1: com.facebook.SessionState, p2: com.facebook.AccessToken, p3: java.util.Date, p4: Boolean, p5: com.facebook.Session.AuthorizationRequest, p6: java.util.Set, p7: com.facebook.Session.1)

    private fun autoPublishAsync() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/facebook/Session;->autoPublishAsyncTask:Lcom/facebook/Session$AutoPublishAsyncTask;
    //         if-nez v1, :cond_0
    //         invoke-static {}, Lcom/facebook/Settings;->getShouldAutoPublishInstall()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lcom/facebook/Session$AutoPublishAsyncTask;
    //         sget-object v2, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         invoke-direct {v0, p0, v1, v2}, Lcom/facebook/Session$AutoPublishAsyncTask;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/Session;->autoPublishAsyncTask:Lcom/facebook/Session$AutoPublishAsyncTask;
    //         :cond_0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/Void;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session$AutoPublishAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         :cond_1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    private fun finishAuthorization(p0: com.facebook.AccessToken, p1: Exception) { /* TODO(body): (Lcom/facebook/AccessToken;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         if-eqz p1, :cond_1
    //         iput-object p1, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->saveTokenToCache(Lcom/facebook/AccessToken;)V
    //         sget-object v1, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;
    //         iput-object v1, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         :cond_0
    //         :goto_0
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         iget-object v1, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {p0, v0, v1, p2}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         return-void
    //         :cond_1
    //         if-eqz p2, :cond_0
    //         sget-object v1, Lcom/facebook/SessionState;->CLOSED_LOGIN_FAILED:Lcom/facebook/SessionState;
    //         iput-object v1, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         goto :goto_0
    */

    private fun finishReauthorization(p0: com.facebook.AccessToken, p1: Exception) { /* TODO(body): (Lcom/facebook/AccessToken;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         if-eqz p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->saveTokenToCache(Lcom/facebook/AccessToken;)V
    //         sget-object v1, Lcom/facebook/SessionState;->OPENED_TOKEN_UPDATED:Lcom/facebook/SessionState;
    //         iput-object v1, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         :cond_0
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         iget-object v1, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {p0, v0, v1, p2}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         return-void
    */

    private fun getAppEventsLogger(): com.facebook.AppEventsLogger { return TODO("body: ()Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         invoke-static {v0, v2}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/Session;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun getLoginActivityIntent(p0: com.facebook.Session.AuthorizationRequest): android.content.Intent { return TODO("body: (Lcom/facebook/Session$AuthorizationRequest;)Landroid/content/Intent;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v1
    //         const-class v2, Lcom/facebook/LoginActivity;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getLoginBehavior()Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/SessionLoginBehavior;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getAuthorizationClientRequest()Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/LoginActivity;->populateIntentExtras(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         return-object v0
    */

    private fun handleAuthorizationResult(p0: Int, p1: com.facebook.AuthorizationClient.Result) { /* TODO(body): (ILcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         const/4 v0, -0x1
    //         if-ne p1, v0, :cond_1
    //         iget-object v0, p2, Lcom/facebook/AuthorizationClient$Result;->code:Lcom/facebook/AuthorizationClient$Result$Code;
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->SUCCESS:Lcom/facebook/AuthorizationClient$Result$Code;
    //         if-ne v0, v2, :cond_0
    //         iget-object v0, p2, Lcom/facebook/AuthorizationClient$Result;->token:Lcom/facebook/AccessToken;
    //         move-object v2, v0
    //         move-object v0, v1
    //         :goto_0
    //         iget-object v3, p2, Lcom/facebook/AuthorizationClient$Result;->code:Lcom/facebook/AuthorizationClient$Result$Code;
    //         iget-object v4, p2, Lcom/facebook/AuthorizationClient$Result;->loggingExtras:Ljava/util/Map;
    //         invoke-direct {p0, v3, v4, v0}, Lcom/facebook/Session;->logAuthorizationComplete(Lcom/facebook/AuthorizationClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;)V
    //         iput-object v1, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {p0, v2, v0}, Lcom/facebook/Session;->finishAuthOrReauth(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/facebook/FacebookAuthorizationException;
    //         iget-object v2, p2, Lcom/facebook/AuthorizationClient$Result;->errorMessage:Ljava/lang/String;
    //         invoke-direct {v0, v2}, Lcom/facebook/FacebookAuthorizationException;-><init>(Ljava/lang/String;)V
    //         move-object v2, v1
    //         goto :goto_0
    //         :cond_1
    //         if-nez p1, :cond_2
    //         new-instance v0, Lcom/facebook/FacebookOperationCanceledException;
    //         iget-object v2, p2, Lcom/facebook/AuthorizationClient$Result;->errorMessage:Ljava/lang/String;
    //         invoke-direct {v0, v2}, Lcom/facebook/FacebookOperationCanceledException;-><init>(Ljava/lang/String;)V
    //         move-object v2, v1
    //         goto :goto_0
    //         :cond_2
    //         move-object v0, v1
    //         move-object v2, v1
    //         goto :goto_0
    */

    private fun logAuthorizationComplete(p0: com.facebook.AuthorizationClient.Result.Code, p1: java.util.Map, p2: Exception) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/AuthorizationClient$Result$Code;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/lang/Exception;",
    //                 ")V"
    //             }
    //         .end annotation
    //         const/4 v4, 0x0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         if-nez v0, :cond_0
    //         const-string v0, ""
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->newAuthorizationLoggingBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "2_result"
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;
    //         invoke-virtual {v2}, Lcom/facebook/AuthorizationClient$Result$Code;->getLoggingValue()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "5_error_message"
    //         const-string v2, "Unexpected call to logAuthorizationComplete with null pendingAuthorizationRequest."
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         const-string v1, "1_timestamp_ms"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         invoke-direct {p0}, Lcom/facebook/Session;->getAppEventsLogger()Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         const-string v2, "fb_mobile_login_complete"
    //         invoke-virtual {v1, v2, v4, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/Session$AuthorizationRequest;->getAuthId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->newAuthorizationLoggingBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v2
    //         if-eqz p1, :cond_1
    //         const-string v0, "2_result"
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$Result$Code;->getLoggingValue()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         if-eqz p3, :cond_2
    //         invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "5_error_message"
    //         invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v0}, Lcom/facebook/Session$AuthorizationRequest;->access$500(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         new-instance v0, Lorg/json/JSONObject;
    //         iget-object v1, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v1}, Lcom/facebook/Session$AuthorizationRequest;->access$500(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/Map;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    //         :goto_1
    //         if-eqz p2, :cond_3
    //         if-nez v0, :cond_6
    //         new-instance v3, Lorg/json/JSONObject;
    //         invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    //         :goto_2
    //         :try_start_0
    //         invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_3
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_3
    //         :catch_0
    //         move-exception v0
    //         move-object v0, v3
    //         :cond_3
    //         :goto_4
    //         if-eqz v0, :cond_4
    //         const-string v1, "6_extras"
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_4
    //         move-object v0, v2
    //         goto/16 :goto_0
    //         :cond_5
    //         move-object v0, v3
    //         goto :goto_4
    //         :cond_6
    //         move-object v3, v0
    //         goto :goto_2
    //         :cond_7
    //         move-object v0, v4
    //         goto :goto_1
    */

    private fun logAuthorizationStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/Session$AuthorizationRequest;->getAuthId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->newAuthorizationLoggingBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "1_timestamp_ms"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         :try_start_0
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         const-string v2, "login_behavior"
    //         iget-object v3, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v3}, Lcom/facebook/Session$AuthorizationRequest;->access$700(Lcom/facebook/Session$AuthorizationRequest;)Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/facebook/SessionLoginBehavior;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "request_code"
    //         iget-object v3, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v3}, Lcom/facebook/Session$AuthorizationRequest;->access$800(Lcom/facebook/Session$AuthorizationRequest;)I
    //         move-result v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         const-string v2, "is_legacy"
    //         iget-object v3, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v3}, Lcom/facebook/Session$AuthorizationRequest;->access$600(Lcom/facebook/Session$AuthorizationRequest;)Z
    //         move-result v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         const-string v2, "permissions"
    //         const-string v3, ","
    //         iget-object v4, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v4}, Lcom/facebook/Session$AuthorizationRequest;->access$900(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/List;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "default_audience"
    //         iget-object v3, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v3}, Lcom/facebook/Session$AuthorizationRequest;->access$1000(Lcom/facebook/Session$AuthorizationRequest;)Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/facebook/SessionDefaultAudience;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "6_extras"
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-direct {p0}, Lcom/facebook/Session;->getAppEventsLogger()Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         const-string v2, "fb_mobile_login_start"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    private fun open(p0: com.facebook.Session.OpenRequest, p1: com.facebook.internal.SessionAuthorizationType) { /* TODO(body): (Lcom/facebook/Session$OpenRequest;Lcom/facebook/internal/SessionAuthorizationType;)V */ }
    /*
    //         .locals 5
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/Session;->validatePermissions(Lcom/facebook/Session$AuthorizationRequest;Lcom/facebook/internal/SessionAuthorizationType;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->validateLoginBehavior(Lcom/facebook/Session$AuthorizationRequest;)V
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         new-instance v3, Ljava/lang/UnsupportedOperationException;
    //         const-string v4, "Session: an attempt was made to open a session that has a pending request."
    //         invoke-direct {v3, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         monitor-exit v1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v0, Lcom/facebook/Session$5;->$SwitchMap$com$facebook$SessionState:[I
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v3}, Lcom/facebook/SessionState;->ordinal()I
    //         move-result v3
    //         aget v0, v0, v3
    //         packed-switch v0, :pswitch_data_0
    //         :pswitch_0
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to open an already opened session."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :pswitch_1
    //         :try_start_1
    //         sget-object v0, Lcom/facebook/SessionState;->OPENING:Lcom/facebook/SessionState;
    //         iput-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         if-nez p1, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v2, "openRequest cannot be null when opening a new Session"
    //         invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         iput-object p1, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         :goto_1
    //         if-eqz p1, :cond_3
    //         invoke-virtual {p1}, Lcom/facebook/Session$OpenRequest;->getCallback()Lcom/facebook/Session$StatusCallback;
    //         move-result-object v3
    //         invoke-virtual {p0, v3}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_3
    //         const/4 v3, 0x0
    //         invoke-virtual {p0, v2, v0, v3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         sget-object v1, Lcom/facebook/SessionState;->OPENING:Lcom/facebook/SessionState;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session;->authorize(Lcom/facebook/Session$AuthorizationRequest;)V
    //         goto :goto_0
    //         :pswitch_2
    //         if-eqz p1, :cond_4
    //         :try_start_2
    //         invoke-virtual {p1}, Lcom/facebook/Session$OpenRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         invoke-virtual {p1}, Lcom/facebook/Session$OpenRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/facebook/internal/Utility;->isSubset(Ljava/util/Collection;Ljava/util/Collection;)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         iput-object p1, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         :cond_4
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         if-nez v0, :cond_5
    //         sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;
    //         iput-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         goto :goto_1
    //         :cond_5
    //         sget-object v0, Lcom/facebook/SessionState;->OPENING:Lcom/facebook/SessionState;
    //         iput-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_2
    //         .end packed-switch
    */

    private fun readObject(p0: java.io.ObjectInputStream) { /* TODO(body): (Ljava/io/ObjectInputStream;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/InvalidObjectException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/io/InvalidObjectException;
    //         const-string v1, "Cannot readObject, serialization proxy required"
    //         invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private fun requestNewPermissions(p0: com.facebook.Session.NewPermissionsRequest, p1: com.facebook.internal.SessionAuthorizationType) { /* TODO(body): (Lcom/facebook/Session$NewPermissionsRequest;Lcom/facebook/internal/SessionAuthorizationType;)V */ }
    /*
    //         .locals 3
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/Session;->validatePermissions(Lcom/facebook/Session$AuthorizationRequest;Lcom/facebook/internal/SessionAuthorizationType;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->validateLoginBehavior(Lcom/facebook/Session$AuthorizationRequest;)V
    //         if-eqz p1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to request new permissions for a session that has a pending request."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/SessionState;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iput-object p1, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-virtual {p0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Lcom/facebook/Session$NewPermissionsRequest;->setValidateSameFbidAsToken(Ljava/lang/String;)V
    //         invoke-virtual {p1}, Lcom/facebook/Session$NewPermissionsRequest;->getCallback()Lcom/facebook/Session$StatusCallback;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session;->authorize(Lcom/facebook/Session$AuthorizationRequest;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         :try_start_2
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to request new permissions for a session that has been closed."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to request new permissions for a session that is not currently open."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    */

    private fun resolveIntent(p0: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private fun saveTokenToCache(p0: com.facebook.AccessToken) { /* TODO(body): (Lcom/facebook/AccessToken;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         invoke-virtual {p1}, Lcom/facebook/AccessToken;->toCacheBundle()Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/TokenCachingStrategy;->save(Landroid/os/Bundle;)V
    //         :cond_0
    //         return-void
    */

    private fun tryLegacyAuth(p0: com.facebook.Session.AuthorizationRequest) { /* TODO(body): (Lcom/facebook/Session$AuthorizationRequest;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/AuthorizationClient;
    //         invoke-direct {v0}, Lcom/facebook/AuthorizationClient;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         new-instance v1, Lcom/facebook/Session$3;
    //         invoke-direct {v1, p0}, Lcom/facebook/Session$3;-><init>(Lcom/facebook/Session;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient;->setOnCompletedListener(Lcom/facebook/AuthorizationClient$OnCompletedListener;)V
    //         iget-object v0, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient;->setContext(Landroid/content/Context;)V
    //         iget-object v0, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getAuthorizationClientRequest()Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient;->startOrContinueAuth(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    //         return-void
    */

    private fun tryLoginActivity(p0: com.facebook.Session.AuthorizationRequest): Boolean { return TODO("body: (Lcom/facebook/Session$AuthorizationRequest;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->getLoginActivityIntent(Lcom/facebook/Session$AuthorizationRequest;)Landroid/content/Intent;
    //         move-result-object v1
    //         invoke-direct {p0, v1}, Lcom/facebook/Session;->resolveIntent(Landroid/content/Intent;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getStartActivityDelegate()Lcom/facebook/Session$StartActivityDelegate;
    //         move-result-object v2
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getRequestCode()I
    //         move-result v3
    //         invoke-interface {v2, v1, v3}, Lcom/facebook/Session$StartActivityDelegate;->startActivityForResult(Landroid/content/Intent;I)V
    //         :try_end_0
    //         .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    private fun validateLoginBehavior(p0: com.facebook.Session.AuthorizationRequest) { /* TODO(body): (Lcom/facebook/Session$AuthorizationRequest;)V */ }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_0
    //         invoke-static {p1}, Lcom/facebook/Session$AuthorizationRequest;->access$600(Lcom/facebook/Session$AuthorizationRequest;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v1
    //         const-class v2, Lcom/facebook/LoginActivity;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    //         invoke-direct {p0, v0}, Lcom/facebook/Session;->resolveIntent(Landroid/content/Intent;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Cannot use SessionLoginBehavior %s when %s is not declared as an activity in AndroidManifest.xml"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getLoginBehavior()Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         const-class v4, Lcom/facebook/LoginActivity;
    //         invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    private fun validatePermissions(p0: com.facebook.Session.AuthorizationRequest, p1: com.facebook.internal.SessionAuthorizationType) { /* TODO(body): (Lcom/facebook/Session$AuthorizationRequest;Lcom/facebook/internal/SessionAuthorizationType;)V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v0, p2}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Cannot request publish or manage authorization with no permissions."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p1}, Lcom/facebook/Session$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_2
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Lcom/facebook/Session;->isPublishPermission(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         sget-object v2, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v2, p2}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         const-string v2, "Cannot pass a publish or manage permission (%s) to a request for read authorization"
    //         new-array v3, v6, [Ljava/lang/Object;
    //         aput-object v0, v3, v5
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_3
    //         sget-object v2, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v2, p2}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         sget-object v2, Lcom/facebook/Session;->TAG:Ljava/lang/String;
    //         const-string v3, "Should not pass a read permission (%s) to a request for publish or manage authorization"
    //         new-array v4, v6, [Ljava/lang/Object;
    //         aput-object v0, v4, v5
    //         invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_4
    //         return-void
    */

    private fun writeReplace(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/facebook/Session$SerializationProxyV1;
    //         iget-object v1, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v3, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         iget-object v4, p0, Lcom/facebook/Session;->lastAttemptedTokenExtendDate:Ljava/util/Date;
    //         const/4 v5, 0x0
    //         iget-object v6, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/Session$SerializationProxyV1;-><init>(Ljava/lang/String;Lcom/facebook/SessionState;Lcom/facebook/AccessToken;Ljava/util/Date;ZLcom/facebook/Session$AuthorizationRequest;)V
    //         return-object v0
    */

    public fun addCallback(p0: com.facebook.Session.StatusCallback) { /* TODO(body): (Lcom/facebook/Session$StatusCallback;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->callbacks:Ljava/util/List;
    //         monitor-enter v1
    //         if-eqz p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->callbacks:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->callbacks:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun authorize(p0: com.facebook.Session.AuthorizationRequest) { /* TODO(body): (Lcom/facebook/Session$AuthorizationRequest;)V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Lcom/facebook/Session$AuthorizationRequest;->setApplicationId(Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/facebook/Session;->autoPublishAsync()V
    //         invoke-direct {p0}, Lcom/facebook/Session;->logAuthorizationStart()V
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->tryLoginActivity(Lcom/facebook/Session$AuthorizationRequest;)Z
    //         move-result v1
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v0}, Lcom/facebook/Session$AuthorizationRequest;->access$500(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/Map;
    //         move-result-object v2
    //         const-string v3, "try_login_activity"
    //         if-eqz v1, :cond_1
    //         const-string v0, "1"
    //         :goto_0
    //         invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         if-nez v1, :cond_2
    //         invoke-static {p1}, Lcom/facebook/Session$AuthorizationRequest;->access$600(Lcom/facebook/Session$AuthorizationRequest;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-static {v0}, Lcom/facebook/Session$AuthorizationRequest;->access$500(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/Map;
    //         move-result-object v0
    //         const-string v1, "try_legacy"
    //         const-string v2, "1"
    //         invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/facebook/Session;->tryLegacyAuth(Lcom/facebook/Session$AuthorizationRequest;)V
    //         const/4 v0, 0x1
    //         :goto_1
    //         if-nez v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v2, Lcom/facebook/Session$5;->$SwitchMap$com$facebook$SessionState:[I
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v3}, Lcom/facebook/SessionState;->ordinal()I
    //         move-result v3
    //         aget v2, v2, v3
    //         packed-switch v2, :pswitch_data_0
    //         sget-object v2, Lcom/facebook/SessionState;->CLOSED_LOGIN_FAILED:Lcom/facebook/SessionState;
    //         iput-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         const-string v3, "Log in attempt failed: LoginActivity could not be started, and not legacy request"
    //         invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         sget-object v3, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;
    //         const/4 v4, 0x0
    //         invoke-direct {p0, v3, v4, v2}, Lcom/facebook/Session;->logAuthorizationComplete(Lcom/facebook/AuthorizationClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;)V
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {p0, v0, v3, v2}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         :goto_2
    //         return-void
    //         :cond_1
    //         const-string v0, "0"
    //         goto :goto_0
    //         :pswitch_0
    //         :try_start_1
    //         monitor-exit v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x6
    //             :pswitch_0
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v2, Lcom/facebook/Session$5;->$SwitchMap$com$facebook$SessionState:[I
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v3}, Lcom/facebook/SessionState;->ordinal()I
    //         move-result v3
    //         aget v2, v2, v3
    //         packed-switch v2, :pswitch_data_0
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :pswitch_0
    //         sget-object v2, Lcom/facebook/SessionState;->CLOSED_LOGIN_FAILED:Lcom/facebook/SessionState;
    //         iput-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         new-instance v3, Lcom/facebook/FacebookException;
    //         const-string v4, "Log in attempt aborted."
    //         invoke-direct {v3, v4}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :pswitch_1
    //         :try_start_1
    //         sget-object v2, Lcom/facebook/SessionState;->CLOSED:Lcom/facebook/SessionState;
    //         iput-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         const/4 v3, 0x0
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_1
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun closeAndClearTokenInformation() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         invoke-virtual {v0}, Lcom/facebook/TokenCachingStrategy;->clear()V
    //         :cond_0
    //         sget-object v0, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->clearFacebookCookies(Landroid/content/Context;)V
    //         sget-object v0, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->clearCaches(Landroid/content/Context;)V
    //         invoke-virtual {p0}, Lcom/facebook/Session;->close()V
    //         return-void
    */

    public fun equals(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/facebook/Session;
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         check-cast p1, Lcom/facebook/Session;
    //         iget-object v1, p1, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/facebook/Session;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p1, Lcom/facebook/Session;->authorizationBundle:Landroid/os/Bundle;
    //         iget-object v2, p0, Lcom/facebook/Session;->authorizationBundle:Landroid/os/Bundle;
    //         invoke-static {v1, v2}, Lcom/facebook/Session;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p1, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-static {v1, v2}, Lcom/facebook/Session;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/Session;->getExpirationDate()Ljava/util/Date;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/facebook/Session;->getExpirationDate()Ljava/util/Date;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/facebook/Session;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun extendAccessToken() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lcom/facebook/Session;->currentTokenRefreshRequest:Lcom/facebook/Session$TokenRefreshRequest;
    //         if-nez v2, :cond_0
    //         new-instance v0, Lcom/facebook/Session$TokenRefreshRequest;
    //         invoke-direct {v0, p0}, Lcom/facebook/Session$TokenRefreshRequest;-><init>(Lcom/facebook/Session;)V
    //         iput-object v0, p0, Lcom/facebook/Session;->currentTokenRefreshRequest:Lcom/facebook/Session$TokenRefreshRequest;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/Session$TokenRefreshRequest;->bind()V
    //         :cond_1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    fun extendAccessTokenIfNeeded() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/Session;->shouldExtendAccessToken()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/Session;->extendAccessToken()V
    //         :cond_0
    //         return-void
    */

    fun extendTokenCompleted(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v2, Lcom/facebook/Session$5;->$SwitchMap$com$facebook$SessionState:[I
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v3}, Lcom/facebook/SessionState;->ordinal()I
    //         move-result v3
    //         aget v2, v2, v3
    //         packed-switch v2, :pswitch_data_0
    //         sget-object v0, Lcom/facebook/Session;->TAG:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "refreshToken ignored in state "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         sget-object v2, Lcom/facebook/SessionState;->OPENED_TOKEN_UPDATED:Lcom/facebook/SessionState;
    //         iput-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         const/4 v3, 0x0
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-static {v0, p1}, Lcom/facebook/AccessToken;->createFromRefresh(Lcom/facebook/AccessToken;Landroid/os/Bundle;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         iget-object v2, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v2}, Lcom/facebook/AccessToken;->toCacheBundle()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Lcom/facebook/TokenCachingStrategy;->save(Landroid/os/Bundle;)V
    //         :cond_0
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :pswitch_data_0
    //         .packed-switch 0x4
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    fun finishAuthOrReauth(p0: com.facebook.AccessToken, p1: Exception) { /* TODO(body): (Lcom/facebook/AccessToken;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 4
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/AccessToken;->isInvalid()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 p1, 0x0
    //         new-instance p2, Lcom/facebook/FacebookException;
    //         const-string v0, "Invalid access token."
    //         invoke-direct {p2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Session$5;->$SwitchMap$com$facebook$SessionState:[I
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v2}, Lcom/facebook/SessionState;->ordinal()I
    //         move-result v2
    //         aget v0, v0, v2
    //         packed-switch v0, :pswitch_data_0
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :pswitch_0
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/Session;->finishAuthorization(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :pswitch_1
    //         :try_start_1
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/Session;->finishReauthorization(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V
    //         goto :goto_0
    //         :pswitch_2
    //         sget-object v0, Lcom/facebook/Session;->TAG:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unexpected call to finishAuthOrReauth in state "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_2
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun getAccessToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         monitor-exit v1
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAuthorizationBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->authorizationBundle:Landroid/os/Bundle;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getDeclinedPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         monitor-exit v1
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v0}, Lcom/facebook/AccessToken;->getDeclinedPermissions()Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getExpirationDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         monitor-exit v1
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v0}, Lcom/facebook/AccessToken;->getExpires()Ljava/util/Date;
    //         move-result-object v0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun getLastAttemptedTokenExtendDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session;->lastAttemptedTokenExtendDate:Ljava/util/Date;
    //         return-object v0
    */

    public fun getPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         monitor-exit v1
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v0}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getState(): com.facebook.SessionState { return TODO("body: ()Lcom/facebook/SessionState;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun getTokenInfo(): com.facebook.AccessToken { return TODO("body: ()Lcom/facebook/AccessToken;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v0
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isOpened(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/SessionState;->isOpened()Z
    //         move-result v0
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isPermissionGranted(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onActivityResult(p0: android.app.Activity, p1: Int, p2: Int, p3: android.content.Intent): Boolean { return TODO("body: (Landroid/app/Activity;IILandroid/content/Intent;)Z") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         const/4 v1, 0x1
    //         const-string v0, "currentActivity"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {p1}, Lcom/facebook/Session;->initializeStaticContext(Landroid/content/Context;)V
    //         iget-object v2, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/Session$AuthorizationRequest;->getRequestCode()I
    //         move-result v0
    //         if-eq p2, v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         monitor-exit v2
    //         :goto_0
    //         return v0
    //         :cond_1
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;
    //         if-eqz p4, :cond_5
    //         const-string v0, "com.facebook.LoginActivity:Result"
    //         invoke-virtual {p4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AuthorizationClient$Result;
    //         if-eqz v0, :cond_2
    //         invoke-direct {p0, p3, v0}, Lcom/facebook/Session;->handleAuthorizationResult(ILcom/facebook/AuthorizationClient$Result;)V
    //         move v0, v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/Session;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0, p2, p3, p4}, Lcom/facebook/AuthorizationClient;->onActivityResult(IILandroid/content/Intent;)Z
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         move-object v0, v3
    //         :goto_1
    //         if-nez v0, :cond_4
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v4, "Unexpected call to Session.onActivityResult"
    //         invoke-direct {v0, v4}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         :cond_4
    //         invoke-direct {p0, v2, v3, v0}, Lcom/facebook/Session;->logAuthorizationComplete(Lcom/facebook/AuthorizationClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;)V
    //         invoke-virtual {p0, v3, v0}, Lcom/facebook/Session;->finishAuthOrReauth(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_5
    //         if-nez p3, :cond_6
    //         new-instance v2, Lcom/facebook/FacebookOperationCanceledException;
    //         const-string v0, "User canceled operation."
    //         invoke-direct {v2, v0}, Lcom/facebook/FacebookOperationCanceledException;-><init>(Ljava/lang/String;)V
    //         sget-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;
    //         move-object v5, v0
    //         move-object v0, v2
    //         move-object v2, v5
    //         goto :goto_1
    //         :cond_6
    //         move-object v0, v3
    //         goto :goto_1
    */

    public fun open(p0: com.facebook.AccessToken, p1: com.facebook.Session.StatusCallback) { /* TODO(body): (Lcom/facebook/AccessToken;Lcom/facebook/Session$StatusCallback;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/facebook/Session;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to open a session that has a pending request."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to open a previously-closed session."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v2, Lcom/facebook/SessionState;->CREATED:Lcom/facebook/SessionState;
    //         if-eq v0, v2, :cond_2
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v2, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;
    //         if-eq v0, v2, :cond_2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v2, "Session: an attempt was made to open an already opened session."
    //         invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         if-eqz p2, :cond_3
    //         invoke-virtual {p0, p2}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_3
    //         iput-object p1, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         invoke-virtual {p1}, Lcom/facebook/AccessToken;->toCacheBundle()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Lcom/facebook/TokenCachingStrategy;->save(Landroid/os/Bundle;)V
    //         :cond_4
    //         iget-object v0, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         sget-object v2, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;
    //         iput-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         const/4 v3, 0x0
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-direct {p0}, Lcom/facebook/Session;->autoPublishAsync()V
    //         return-void
    */

    public fun openForPublish(p0: com.facebook.Session.OpenRequest) { /* TODO(body): (Lcom/facebook/Session$OpenRequest;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/Session;->open(Lcom/facebook/Session$OpenRequest;Lcom/facebook/internal/SessionAuthorizationType;)V
    //         return-void
    */

    public fun openForRead(p0: com.facebook.Session.OpenRequest) { /* TODO(body): (Lcom/facebook/Session$OpenRequest;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/Session;->open(Lcom/facebook/Session$OpenRequest;Lcom/facebook/internal/SessionAuthorizationType;)V
    //         return-void
    */

    fun postStateChange(p0: com.facebook.SessionState, p1: com.facebook.SessionState, p2: Exception) { /* TODO(body): (Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         if-ne p1, p2, :cond_1
    //         sget-object v0, Lcom/facebook/SessionState;->OPENED_TOKEN_UPDATED:Lcom/facebook/SessionState;
    //         if-eq p1, v0, :cond_1
    //         if-nez p3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p2}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-static {}, Lcom/facebook/AccessToken;->createEmptyToken()Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         :cond_2
    //         new-instance v0, Lcom/facebook/Session$4;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/facebook/Session$4;-><init>(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         iget-object v1, p0, Lcom/facebook/Session;->handler:Landroid/os/Handler;
    //         invoke-static {v1, v0}, Lcom/facebook/Session;->runWithHandlerOrExecutor(Landroid/os/Handler;Ljava/lang/Runnable;)V
    //         sget-object v0, Lcom/facebook/Session;->activeSession:Lcom/facebook/Session;
    //         if-ne p0, v0, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/SessionState;->isOpened()Z
    //         move-result v0
    //         invoke-virtual {p2}, Lcom/facebook/SessionState;->isOpened()Z
    //         move-result v1
    //         if-eq v0, v1, :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/SessionState;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_OPENED"
    //         invoke-static {v0}, Lcom/facebook/Session;->postActiveSessionAction(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_CLOSED"
    //         invoke-static {v0}, Lcom/facebook/Session;->postActiveSessionAction(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun refreshPermissions() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v1, "me/permissions"
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;)V
    //         new-instance v1, Lcom/facebook/Session$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/Session$2;-><init>(Lcom/facebook/Session;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         return-void
    */

    public fun removeCallback(p0: com.facebook.Session.StatusCallback) { /* TODO(body): (Lcom/facebook/Session$StatusCallback;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/facebook/Session;->callbacks:Ljava/util/List;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session;->callbacks:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun requestNewPublishPermissions(p0: com.facebook.Session.NewPermissionsRequest) { /* TODO(body): (Lcom/facebook/Session$NewPermissionsRequest;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/Session;->requestNewPermissions(Lcom/facebook/Session$NewPermissionsRequest;Lcom/facebook/internal/SessionAuthorizationType;)V
    //         return-void
    */

    public fun requestNewReadPermissions(p0: com.facebook.Session.NewPermissionsRequest) { /* TODO(body): (Lcom/facebook/Session$NewPermissionsRequest;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/Session;->requestNewPermissions(Lcom/facebook/Session$NewPermissionsRequest;Lcom/facebook/internal/SessionAuthorizationType;)V
    //         return-void
    */

    fun setCurrentTokenRefreshRequest(p0: com.facebook.Session.TokenRefreshRequest) { /* TODO(body): (Lcom/facebook/Session$TokenRefreshRequest;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session;->currentTokenRefreshRequest:Lcom/facebook/Session$TokenRefreshRequest;
    //         return-void
    */

    fun setLastAttemptedTokenExtendDate(p0: java.util.Date) { /* TODO(body): (Ljava/util/Date;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session;->lastAttemptedTokenExtendDate:Ljava/util/Date;
    //         return-void
    */

    fun setTokenInfo(p0: com.facebook.AccessToken) { /* TODO(body): (Lcom/facebook/AccessToken;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         return-void
    */

    fun shouldExtendAccessToken(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/Session;->currentTokenRefreshRequest:Lcom/facebook/Session$TokenRefreshRequest;
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         new-instance v1, Ljava/util/Date;
    //         invoke-direct {v1}, Ljava/util/Date;-><init>()V
    //         iget-object v2, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v2}, Lcom/facebook/SessionState;->isOpened()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v2}, Lcom/facebook/AccessToken;->getSource()Lcom/facebook/AccessTokenSource;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/facebook/AccessTokenSource;->canExtendToken()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v1}, Ljava/util/Date;->getTime()J
    //         move-result-wide v2
    //         iget-object v4, p0, Lcom/facebook/Session;->lastAttemptedTokenExtendDate:Ljava/util/Date;
    //         invoke-virtual {v4}, Ljava/util/Date;->getTime()J
    //         move-result-wide v4
    //         sub-long/2addr v2, v4
    //         const-wide/32 v4, 0x36ee80
    //         cmp-long v2, v2, v4
    //         if-lez v2, :cond_0
    //         invoke-virtual {v1}, Ljava/util/Date;->getTime()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         invoke-virtual {v1}, Lcom/facebook/AccessToken;->getLastRefresh()Ljava/util/Date;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/Date;->getTime()J
    //         move-result-wide v4
    //         sub-long/2addr v2, v4
    //         const-wide/32 v4, 0x5265c00
    //         cmp-long v1, v2, v4
    //         if-lez v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{Session"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " state:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Session;->state:Lcom/facebook/SessionState;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", token:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         if-nez v0, :cond_0
    //         const-string v0, "null"
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", appId:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         const-string v0, "null"
    //         :goto_1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Session;->tokenInfo:Lcom/facebook/AccessToken;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/Session;->applicationId:Ljava/lang/String;
    //         goto :goto_1
    */

    companion object {
    @JvmField public val ACTION_ACTIVE_SESSION_CLOSED: String = "com.facebook.sdk.ACTIVE_SESSION_CLOSED"
    @JvmField public val ACTION_ACTIVE_SESSION_OPENED: String = "com.facebook.sdk.ACTIVE_SESSION_OPENED"
    @JvmField public val ACTION_ACTIVE_SESSION_SET: String = "com.facebook.sdk.ACTIVE_SESSION_SET"
    @JvmField public val ACTION_ACTIVE_SESSION_UNSET: String = "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    private val AUTH_BUNDLE_SAVE_KEY: String = "com.facebook.sdk.Session.authBundleKey"
    @JvmField public val DEFAULT_AUTHORIZE_ACTIVITY_CODE: Int = 0xface
    private val MANAGE_PERMISSION_PREFIX: String = "manage"
    private val OTHER_PUBLISH_PERMISSIONS: java.util.Set = null!!
    private val PUBLISH_PERMISSION_PREFIX: String = "publish"
    private val SESSION_BUNDLE_SAVE_KEY: String = "com.facebook.sdk.Session.saveSessionKey"
    private val STATIC_LOCK: Object = null!!
    @JvmField public val TAG: String = null!!
    private val TOKEN_EXTEND_RETRY_SECONDS: Int = 0xe10
    private val TOKEN_EXTEND_THRESHOLD_SECONDS: Int = 0x15180
    @JvmField public val WEB_VIEW_ERROR_CODE_KEY: String = "com.facebook.sdk.WebViewErrorCode"
    @JvmField public val WEB_VIEW_FAILING_URL_KEY: String = "com.facebook.sdk.FailingUrl"
    private var activeSession: com.facebook.Session
    private val serialVersionUID: Long = 0x1L
    private var staticContext: android.content.Context

    private @JvmStatic fun areEqual(p0: Object, p1: Object): Boolean { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_1
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun getActiveSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/Session;->STATIC_LOCK:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Session;->activeSession:Lcom/facebook/Session;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    @JvmStatic fun getStaticContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         return-object v0
    */

    @JvmStatic fun handlePermissionResponse(p0: com.facebook.Response): com.facebook.Session.PermissionsPair { return TODO("body: (Lcom/facebook/Response;)Lcom/facebook/Session$PermissionsPair;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-class v0, Lcom/facebook/model/GraphMultiResult;
    //         invoke-virtual {p0, v0}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphMultiResult;
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         invoke-interface {v0}, Lcom/facebook/model/GraphMultiResult;->getData()Lcom/facebook/model/GraphObjectList;
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {v2}, Lcom/facebook/model/GraphObjectList;->size()I
    //         move-result v0
    //         if-nez v0, :cond_3
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-interface {v2}, Lcom/facebook/model/GraphObjectList;->size()I
    //         move-result v0
    //         invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-interface {v2}, Lcom/facebook/model/GraphObjectList;->size()I
    //         move-result v0
    //         invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         invoke-interface {v2, v0}, Lcom/facebook/model/GraphObjectList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         const-string v1, "permission"
    //         invoke-interface {v0, v1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_6
    //         invoke-interface {v2}, Lcom/facebook/model/GraphObjectList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_4
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphObject;
    //         const-string v1, "permission"
    //         invoke-interface {v0, v1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v5, "installed"
    //         invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-nez v5, :cond_4
    //         const-string v5, "status"
    //         invoke-interface {v0, v5}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v5, "granted"
    //         invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-eqz v5, :cond_5
    //         invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_5
    //         const-string v5, "declined"
    //         invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_6
    //         invoke-interface {v0}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_7
    //         :goto_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v5, "installed"
    //         invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_7
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/Integer;
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         move-result v1
    //         const/4 v5, 0x1
    //         if-ne v1, v5, :cond_7
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_2
    //         :cond_8
    //         new-instance v0, Lcom/facebook/Session$PermissionsPair;
    //         invoke-direct {v0, v3, v4}, Lcom/facebook/Session$PermissionsPair;-><init>(Ljava/util/List;Ljava/util/List;)V
    //         goto/16 :goto_0
    */

    @JvmStatic fun initializeStaticContext(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_1
    //         sget-object v0, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         if-nez v0, :cond_1
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         move-object p0, v0
    //         :cond_0
    //         sput-object p0, Lcom/facebook/Session;->staticContext:Landroid/content/Context;
    //         :cond_1
    //         return-void
    */

    public @JvmStatic fun isPublishPermission(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_1
    //         const-string v0, "publish"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "manage"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/facebook/Session;->OTHER_PUBLISH_PERMISSIONS:Ljava/util/Set;
    //         invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun openActiveSession(p0: android.app.Activity, p1: Boolean, p2: com.facebook.Session.StatusCallback): com.facebook.Session { return TODO("body: (Landroid/app/Activity;ZLcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         invoke-direct {v0, p0}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v0, p2}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         invoke-static {p0, p1, v0}, Lcom/facebook/Session;->openActiveSession(Landroid/content/Context;ZLcom/facebook/Session$OpenRequest;)Lcom/facebook/Session;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun openActiveSession(p0: android.app.Activity, p1: Boolean, p2: java.util.List, p3: com.facebook.Session.StatusCallback): com.facebook.Session { return TODO("body: (Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/app/Activity;",
    //                 "Z",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/Session$StatusCallback;",
    //                 ")",
    //                 "Lcom/facebook/Session;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         invoke-direct {v0, p0}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v0, p3}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         invoke-static {p0, p1, v0}, Lcom/facebook/Session;->openActiveSession(Landroid/content/Context;ZLcom/facebook/Session$OpenRequest;)Lcom/facebook/Session;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun openActiveSession(p0: android.content.Context, p1: android.support.v4.app.Fragment, p2: Boolean, p3: com.facebook.Session.StatusCallback): com.facebook.Session { return TODO("body: (Landroid/content/Context;Landroid/support/v4/app/Fragment;ZLcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         invoke-direct {v0, p1}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/support/v4/app/Fragment;)V
    //         invoke-virtual {v0, p3}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         invoke-static {p0, p2, v0}, Lcom/facebook/Session;->openActiveSession(Landroid/content/Context;ZLcom/facebook/Session$OpenRequest;)Lcom/facebook/Session;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun openActiveSession(p0: android.content.Context, p1: android.support.v4.app.Fragment, p2: Boolean, p3: java.util.List, p4: com.facebook.Session.StatusCallback): com.facebook.Session { return TODO("body: (Landroid/content/Context;Landroid/support/v4/app/Fragment;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Landroid/support/v4/app/Fragment;",
    //                 "Z",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/Session$StatusCallback;",
    //                 ")",
    //                 "Lcom/facebook/Session;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         invoke-direct {v0, p1}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/support/v4/app/Fragment;)V
    //         invoke-virtual {v0, p4}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         invoke-virtual {v0, p3}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         invoke-static {p0, p2, v0}, Lcom/facebook/Session;->openActiveSession(Landroid/content/Context;ZLcom/facebook/Session$OpenRequest;)Lcom/facebook/Session;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun openActiveSession(p0: android.content.Context, p1: Boolean, p2: com.facebook.Session.OpenRequest): com.facebook.Session { return TODO("body: (Landroid/content/Context;ZLcom/facebook/Session$OpenRequest;)Lcom/facebook/Session;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/facebook/Session$Builder;
    //         invoke-direct {v0, p0}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v0}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         if-eqz p1, :cond_1
    //         :cond_0
    //         invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V
    //         invoke-virtual {v0, p2}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun openActiveSessionFromCache(p0: android.content.Context): com.facebook.Session { return TODO("body: (Landroid/content/Context;)Lcom/facebook/Session;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x0
    //         invoke-static {p0, v0, v1}, Lcom/facebook/Session;->openActiveSession(Landroid/content/Context;ZLcom/facebook/Session$OpenRequest;)Lcom/facebook/Session;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun openActiveSessionWithAccessToken(p0: android.content.Context, p1: com.facebook.AccessToken, p2: com.facebook.Session.StatusCallback): com.facebook.Session { return TODO("body: (Landroid/content/Context;Lcom/facebook/AccessToken;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         new-instance v0, Lcom/facebook/Session;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v2, v2, v1}, Lcom/facebook/Session;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/TokenCachingStrategy;Z)V
    //         invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V
    //         invoke-virtual {v0, p1, p2}, Lcom/facebook/Session;->open(Lcom/facebook/AccessToken;Lcom/facebook/Session$StatusCallback;)V
    //         return-object v0
    */

    @JvmStatic fun postActiveSessionAction(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z
    //         return-void
    */

    public @JvmStatic fun restoreSession(p0: android.content.Context, p1: com.facebook.TokenCachingStrategy, p2: com.facebook.Session.StatusCallback, p3: android.os.Bundle): com.facebook.Session { return TODO("body: (Landroid/content/Context;Lcom/facebook/TokenCachingStrategy;Lcom/facebook/Session$StatusCallback;Landroid/os/Bundle;)Lcom/facebook/Session;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         if-nez p3, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.facebook.sdk.Session.saveSessionKey"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         new-instance v2, Ljava/io/ByteArrayInputStream;
    //         invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    //         :try_start_0
    //         new-instance v0, Ljava/io/ObjectInputStream;
    //         invoke-direct {v0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    //         invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Session;
    //         invoke-static {p0}, Lcom/facebook/Session;->initializeStaticContext(Landroid/content/Context;)V
    //         if-eqz p1, :cond_3
    //         iput-object p1, v0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         :goto_1
    //         if-eqz p2, :cond_1
    //         invoke-virtual {v0, p2}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_1
    //         const-string v2, "com.facebook.sdk.Session.authBundleKey"
    //         invoke-virtual {p3, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v2
    //         iput-object v2, v0, Lcom/facebook/Session;->authorizationBundle:Landroid/os/Bundle;
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         sget-object v2, Lcom/facebook/Session;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to restore session"
    //         invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :cond_2
    //         :goto_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         :try_start_1
    //         new-instance v2, Lcom/facebook/SharedPreferencesTokenCachingStrategy;
    //         invoke-direct {v2, p0}, Lcom/facebook/SharedPreferencesTokenCachingStrategy;-><init>(Landroid/content/Context;)V
    //         iput-object v2, v0, Lcom/facebook/Session;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         :try_end_1
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         sget-object v2, Lcom/facebook/Session;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to restore session."
    //         invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_2
    */

    private @JvmStatic fun runWithHandlerOrExecutor(p0: android.os.Handler, p1: Runnable) { /* TODO(body): (Landroid/os/Handler;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         goto :goto_0
    */

    public @JvmStatic fun saveSession(p0: com.facebook.Session, p1: android.os.Bundle) { /* TODO(body): (Lcom/facebook/Session;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         if-eqz p0, :cond_0
    //         const-string v0, "com.facebook.sdk.Session.saveSessionKey"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         :try_start_0
    //         new-instance v1, Ljava/io/ObjectOutputStream;
    //         invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         invoke-virtual {v1, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         const-string v1, "com.facebook.sdk.Session.saveSessionKey"
    //         invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    //         move-result-object v0
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    //         const-string v0, "com.facebook.sdk.Session.authBundleKey"
    //         iget-object v1, p0, Lcom/facebook/Session;->authorizationBundle:Landroid/os/Bundle;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         :cond_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         const-string v2, "Unable to save session."
    //         invoke-direct {v1, v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    public @JvmStatic fun setActiveSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/Session;->STATIC_LOCK:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Session;->activeSession:Lcom/facebook/Session;
    //         if-eq p0, v0, :cond_2
    //         sget-object v0, Lcom/facebook/Session;->activeSession:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->close()V
    //         :cond_0
    //         sput-object p0, Lcom/facebook/Session;->activeSession:Lcom/facebook/Session;
    //         if-eqz v0, :cond_1
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    //         invoke-static {v0}, Lcom/facebook/Session;->postActiveSessionAction(Ljava/lang/String;)V
    //         :cond_1
    //         if-eqz p0, :cond_2
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_SET"
    //         invoke-static {v0}, Lcom/facebook/Session;->postActiveSessionAction(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "com.facebook.sdk.ACTIVE_SESSION_OPENED"
    //         invoke-static {v0}, Lcom/facebook/Session;->postActiveSessionAction(Ljava/lang/String;)V
    //         :cond_2
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
