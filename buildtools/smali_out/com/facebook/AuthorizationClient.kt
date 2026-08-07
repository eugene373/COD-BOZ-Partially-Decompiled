package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 36 fields, 41 methods.

open class AuthorizationClient: java.io.Serializable {
    private var appEventsLogger: com.facebook.AppEventsLogger
    var backgroundProcessingListener: com.facebook.AuthorizationClient.BackgroundProcessingListener
    var checkedInternetPermission: Boolean
    var context: android.content.Context
    var currentHandler: com.facebook.AuthorizationClient.AuthHandler
    var handlersToTry: java.util.List
    var loggingExtras: java.util.Map
    var onCompletedListener: com.facebook.AuthorizationClient.OnCompletedListener
    var pendingRequest: com.facebook.AuthorizationClient.AuthorizationRequest
    var startActivityDelegate: com.facebook.AuthorizationClient.StartActivityDelegate

    constructor()

    private fun addLoggingExtra(p0: String, p1: String, p2: Boolean) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         if-eqz p3, :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p2
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    private fun completeWithFailure() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v1, "Login attempt failed."
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/AuthorizationClient;->complete(Lcom/facebook/AuthorizationClient$Result;)V
    //         return-void
    */

    private fun getAppEventsLogger(): com.facebook.AppEventsLogger { return TODO("body: ()Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         invoke-virtual {v0}, Lcom/facebook/AppEventsLogger;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         return-object v0
    */

    private fun getHandlerTypes(p0: com.facebook.AuthorizationClient.AuthorizationRequest): java.util.List { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Ljava/util/List;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/AuthorizationClient$AuthorizationRequest;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/AuthorizationClient$AuthHandler;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getLoginBehavior()Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/SessionLoginBehavior;->allowsKatanaAuth()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isLegacy()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         new-instance v2, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;
    //         invoke-direct {v2, p0}, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;-><init>(Lcom/facebook/AuthorizationClient;)V
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         new-instance v2, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;
    //         invoke-direct {v2, p0}, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;-><init>(Lcom/facebook/AuthorizationClient;)V
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_1
    //         invoke-virtual {v1}, Lcom/facebook/SessionLoginBehavior;->allowsWebViewAuth()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         new-instance v1, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;
    //         invoke-direct {v1, p0}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;-><init>(Lcom/facebook/AuthorizationClient;)V
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_2
    //         return-object v0
    */

    private fun logAuthorizationMethodComplete(p0: String, p1: com.facebook.AuthorizationClient.Result, p2: java.util.Map) { /* TODO(body): (Ljava/lang/String;Lcom/facebook/AuthorizationClient$Result;Ljava/util/Map;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/AuthorizationClient$Result;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p2, Lcom/facebook/AuthorizationClient$Result;->code:Lcom/facebook/AuthorizationClient$Result$Code;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$Result$Code;->getLoggingValue()Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p2, Lcom/facebook/AuthorizationClient$Result;->errorMessage:Ljava/lang/String;
    //         iget-object v4, p2, Lcom/facebook/AuthorizationClient$Result;->errorCode:Ljava/lang/String;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AuthorizationClient;->logAuthorizationMethodComplete(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //         return-void
    */

    private fun logAuthorizationMethodComplete(p0: String, p1: String, p2: String, p3: String, p4: java.util.Map) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-nez v0, :cond_1
    //         const-string v0, ""
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->newAuthorizationLoggingBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "2_result"
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;
    //         invoke-virtual {v2}, Lcom/facebook/AuthorizationClient$Result$Code;->getLoggingValue()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "5_error_message"
    //         const-string v2, "Unexpected call to logAuthorizationMethodComplete with null pendingRequest."
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         const-string v1, "3_method"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "1_timestamp_ms"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         invoke-direct {p0}, Lcom/facebook/AuthorizationClient;->getAppEventsLogger()Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         const-string v2, "fb_mobile_login_method_complete"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getAuthId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->newAuthorizationLoggingBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz p2, :cond_2
    //         const-string v1, "2_result"
    //         invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_2
    //         if-eqz p3, :cond_3
    //         const-string v1, "5_error_message"
    //         invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_3
    //         if-eqz p4, :cond_4
    //         const-string v1, "4_error_code"
    //         invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_4
    //         if-eqz p5, :cond_0
    //         invoke-interface {p5}, Ljava/util/Map;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1, p5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    //         const-string v2, "6_extras"
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun logAuthorizationMethodStart(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getAuthId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->newAuthorizationLoggingBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "1_timestamp_ms"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v1, "3_method"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/facebook/AuthorizationClient;->getAppEventsLogger()Lcom/facebook/AppEventsLogger;
    //         move-result-object v1
    //         const-string v2, "fb_mobile_login_method_start"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    */

    private fun logWebLoginCompleted(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         invoke-static {v0, p1}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "fb_web_login_e2e"
    //         invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "fb_web_login_switchback_time"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v4
    //         invoke-virtual {v1, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v2, "app_id"
    //         invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "fb_dialogs_web_login_dialog_complete"
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v2, v3, v1}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    */

    private fun notifyBackgroundProcessingStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->backgroundProcessingListener:Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->backgroundProcessingListener:Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;
    //         invoke-interface {v0}, Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;->onBackgroundProcessingStarted()V
    //         :cond_0
    //         return-void
    */

    private fun notifyBackgroundProcessingStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->backgroundProcessingListener:Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->backgroundProcessingListener:Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;
    //         invoke-interface {v0}, Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;->onBackgroundProcessingStopped()V
    //         :cond_0
    //         return-void
    */

    private fun notifyOnCompleteListener(p0: com.facebook.AuthorizationClient.Result) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->onCompletedListener:Lcom/facebook/AuthorizationClient$OnCompletedListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->onCompletedListener:Lcom/facebook/AuthorizationClient$OnCompletedListener;
    //         invoke-interface {v0, p1}, Lcom/facebook/AuthorizationClient$OnCompletedListener;->onCompleted(Lcom/facebook/AuthorizationClient$Result;)V
    //         :cond_0
    //         return-void
    */

    fun authorize(p0: com.facebook.AuthorizationClient.AuthorizationRequest) { /* TODO(body): (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-eqz v0, :cond_2
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Attempted to authorize while a request is pending."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->needsNewTokenValidation()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->checkInternetPermission()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :cond_3
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-direct {p0, p1}, Lcom/facebook/AuthorizationClient;->getHandlerTypes(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Ljava/util/List;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient;->handlersToTry:Ljava/util/List;
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->tryNextHandler()V
    //         goto :goto_0
    */

    fun cancelCurrentHandler() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthHandler;->cancel()V
    //         :cond_0
    //         return-void
    */

    fun checkInternetPermission(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         iget-boolean v1, p0, Lcom/facebook/AuthorizationClient;->checkedInternetPermission:Z
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v1, "android.permission.INTERNET"
    //         invoke-virtual {p0, v1}, Lcom/facebook/AuthorizationClient;->checkPermission(Ljava/lang/String;)I
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_internet_permission_error_title:I
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         sget v2, Lcom/facebook/android/R$string;->com_facebook_internet_permission_error_message:I
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v2, v0, v1}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/AuthorizationClient;->complete(Lcom/facebook/AuthorizationClient$Result;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         iput-boolean v0, p0, Lcom/facebook/AuthorizationClient;->checkedInternetPermission:Z
    //         goto :goto_0
    */

    fun checkPermission(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         invoke-virtual {v0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    fun complete(p0: com.facebook.AuthorizationClient.Result) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthHandler;->getNameForLogging()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         iget-object v1, v1, Lcom/facebook/AuthorizationClient$AuthHandler;->methodLoggingExtras:Ljava/util/Map;
    //         invoke-direct {p0, v0, p1, v1}, Lcom/facebook/AuthorizationClient;->logAuthorizationMethodComplete(Ljava/lang/String;Lcom/facebook/AuthorizationClient$Result;Ljava/util/Map;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         iput-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->loggingExtras:Ljava/util/Map;
    //         :cond_1
    //         iput-object v2, p0, Lcom/facebook/AuthorizationClient;->handlersToTry:Ljava/util/List;
    //         iput-object v2, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         iput-object v2, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         iput-object v2, p0, Lcom/facebook/AuthorizationClient;->loggingExtras:Ljava/util/Map;
    //         invoke-direct {p0, p1}, Lcom/facebook/AuthorizationClient;->notifyOnCompleteListener(Lcom/facebook/AuthorizationClient$Result;)V
    //         return-void
    */

    fun completeAndValidate(p0: com.facebook.AuthorizationClient.Result) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->token:Lcom/facebook/AccessToken;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->needsNewTokenValidation()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/facebook/AuthorizationClient;->validateSameFbidAndFinish(Lcom/facebook/AuthorizationClient$Result;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1}, Lcom/facebook/AuthorizationClient;->complete(Lcom/facebook/AuthorizationClient$Result;)V
    //         goto :goto_0
    */

    fun continueAuth() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Attempted to continue authorization without a pending request."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthHandler;->needsRestart()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthHandler;->cancel()V
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->tryCurrentHandler()Z
    //         :cond_2
    //         return-void
    */

    fun createGetPermissionsRequest(p0: String): com.facebook.Request { return TODO("body: (Ljava/lang/String;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "access_token"
    //         invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/permissions"
    //         sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         move-object v5, v1
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    fun createGetProfileIdRequest(p0: String): com.facebook.Request { return TODO("body: (Ljava/lang/String;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "fields"
    //         const-string v2, "id"
    //         invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "access_token"
    //         invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me"
    //         sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         move-object v5, v1
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    fun createReauthValidationBatch(p0: com.facebook.AuthorizationClient.Result): com.facebook.RequestBatch { return TODO("body: (Lcom/facebook/AuthorizationClient$Result;)Lcom/facebook/RequestBatch;") }
    /*
    //         .locals 9
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    //         new-instance v5, Ljava/util/ArrayList;
    //         invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->token:Lcom/facebook/AccessToken;
    //         invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/AuthorizationClient$3;
    //         invoke-direct {v1, p0, v2}, Lcom/facebook/AuthorizationClient$3;-><init>(Lcom/facebook/AuthorizationClient;Ljava/util/ArrayList;)V
    //         iget-object v3, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v3}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPreviousAccessToken()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v3}, Lcom/facebook/AuthorizationClient;->createGetProfileIdRequest(Ljava/lang/String;)Lcom/facebook/Request;
    //         move-result-object v6
    //         invoke-virtual {v6, v1}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/AuthorizationClient;->createGetProfileIdRequest(Ljava/lang/String;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         invoke-virtual {p0, v3}, Lcom/facebook/AuthorizationClient;->createGetPermissionsRequest(Ljava/lang/String;)Lcom/facebook/Request;
    //         move-result-object v1
    //         new-instance v3, Lcom/facebook/AuthorizationClient$4;
    //         invoke-direct {v3, p0, v4, v5}, Lcom/facebook/AuthorizationClient$4;-><init>(Lcom/facebook/AuthorizationClient;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //         invoke-virtual {v1, v3}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         new-instance v7, Lcom/facebook/RequestBatch;
    //         const/4 v3, 0x3
    //         new-array v3, v3, [Lcom/facebook/Request;
    //         const/4 v8, 0x0
    //         aput-object v6, v3, v8
    //         const/4 v6, 0x1
    //         aput-object v0, v3, v6
    //         const/4 v0, 0x2
    //         aput-object v1, v3, v0
    //         invoke-direct {v7, v3}, Lcom/facebook/RequestBatch;-><init>([Lcom/facebook/Request;)V
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v7, v0}, Lcom/facebook/RequestBatch;->setBatchApplicationId(Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/AuthorizationClient$5;
    //         move-object v1, p0
    //         move-object v3, p1
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AuthorizationClient$5;-><init>(Lcom/facebook/AuthorizationClient;Ljava/util/ArrayList;Lcom/facebook/AuthorizationClient$Result;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //         invoke-virtual {v7, v0}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V
    //         return-object v7
    */

    fun getBackgroundProcessingListener(): com.facebook.AuthorizationClient.BackgroundProcessingListener { return TODO("body: ()Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->backgroundProcessingListener:Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;
    //         return-object v0
    */

    fun getInProgress(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun getOnCompletedListener(): com.facebook.AuthorizationClient.OnCompletedListener { return TODO("body: ()Lcom/facebook/AuthorizationClient$OnCompletedListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->onCompletedListener:Lcom/facebook/AuthorizationClient$OnCompletedListener;
    //         return-object v0
    */

    fun getStartActivityDelegate(): com.facebook.AuthorizationClient.StartActivityDelegate { return TODO("body: ()Lcom/facebook/AuthorizationClient$StartActivityDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->startActivityDelegate:Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->startActivityDelegate:Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/facebook/AuthorizationClient$2;
    //         invoke-direct {v0, p0}, Lcom/facebook/AuthorizationClient$2;-><init>(Lcom/facebook/AuthorizationClient;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent): Boolean { return TODO("body: (IILandroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getRequestCode()I
    //         move-result v0
    //         if-ne p1, v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/AuthorizationClient$AuthHandler;->onActivityResult(IILandroid/content/Intent;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun setBackgroundProcessingListener(p0: com.facebook.AuthorizationClient.BackgroundProcessingListener) { /* TODO(body): (Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient;->backgroundProcessingListener:Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;
    //         return-void
    */

    fun setContext(p0: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         new-instance v0, Lcom/facebook/AuthorizationClient$1;
    //         invoke-direct {v0, p0, p1}, Lcom/facebook/AuthorizationClient$1;-><init>(Lcom/facebook/AuthorizationClient;Landroid/app/Activity;)V
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient;->startActivityDelegate:Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         return-void
    */

    fun setContext(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient;->startActivityDelegate:Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         return-void
    */

    fun setOnCompletedListener(p0: com.facebook.AuthorizationClient.OnCompletedListener) { /* TODO(body): (Lcom/facebook/AuthorizationClient$OnCompletedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient;->onCompletedListener:Lcom/facebook/AuthorizationClient$OnCompletedListener;
    //         return-void
    */

    fun startOrContinueAuth(p0: com.facebook.AuthorizationClient.AuthorizationRequest) { /* TODO(body): (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->getInProgress()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->continueAuth()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1}, Lcom/facebook/AuthorizationClient;->authorize(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    //         goto :goto_0
    */

    fun tryCurrentHandler(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v1}, Lcom/facebook/AuthorizationClient$AuthHandler;->needsInternetPermission()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->checkInternetPermission()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "no_internet_permission"
    //         const-string v2, "1"
    //         invoke-direct {p0, v1, v2, v0}, Lcom/facebook/AuthorizationClient;->addLoggingExtra(Ljava/lang/String;Ljava/lang/String;Z)V
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient$AuthHandler;->tryAuthorize(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v1}, Lcom/facebook/AuthorizationClient$AuthHandler;->getNameForLogging()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {p0, v1}, Lcom/facebook/AuthorizationClient;->logAuthorizationMethodStart(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "not_tried"
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v2}, Lcom/facebook/AuthorizationClient$AuthHandler;->getNameForLogging()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x1
    //         invoke-direct {p0, v1, v2, v3}, Lcom/facebook/AuthorizationClient;->addLoggingExtra(Ljava/lang/String;Ljava/lang/String;Z)V
    //         goto :goto_0
    */

    fun tryNextHandler() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthHandler;->getNameForLogging()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "skipped"
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         iget-object v5, v0, Lcom/facebook/AuthorizationClient$AuthHandler;->methodLoggingExtras:Ljava/util/Map;
    //         move-object v0, p0
    //         move-object v4, v3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AuthorizationClient;->logAuthorizationMethodComplete(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->handlersToTry:Ljava/util/List;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->handlersToTry:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->handlersToTry:Ljava/util/List;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AuthorizationClient$AuthHandler;
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient;->currentHandler:Lcom/facebook/AuthorizationClient$AuthHandler;
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient;->tryCurrentHandler()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         if-eqz v0, :cond_1
    //         invoke-direct {p0}, Lcom/facebook/AuthorizationClient;->completeWithFailure()V
    //         goto :goto_0
    */

    fun validateSameFbidAndFinish(p0: com.facebook.AuthorizationClient.Result) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->token:Lcom/facebook/AccessToken;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Can\'t validate without a token"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p0, p1}, Lcom/facebook/AuthorizationClient;->createReauthValidationBatch(Lcom/facebook/AuthorizationClient$Result;)Lcom/facebook/RequestBatch;
    //         move-result-object v0
    //         invoke-direct {p0}, Lcom/facebook/AuthorizationClient;->notifyBackgroundProcessingStart()V
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         return-void
    */

    companion object {
    val EVENT_EXTRAS_DEFAULT_AUDIENCE: String = "default_audience"
    val EVENT_EXTRAS_IS_LEGACY: String = "is_legacy"
    val EVENT_EXTRAS_LOGIN_BEHAVIOR: String = "login_behavior"
    val EVENT_EXTRAS_MISSING_INTERNET_PERMISSION: String = "no_internet_permission"
    val EVENT_EXTRAS_NEW_PERMISSIONS: String = "new_permissions"
    val EVENT_EXTRAS_NOT_TRIED: String = "not_tried"
    val EVENT_EXTRAS_PERMISSIONS: String = "permissions"
    val EVENT_EXTRAS_REQUEST_CODE: String = "request_code"
    val EVENT_EXTRAS_TRY_LEGACY: String = "try_legacy"
    val EVENT_EXTRAS_TRY_LOGIN_ACTIVITY: String = "try_login_activity"
    val EVENT_NAME_LOGIN_COMPLETE: String = "fb_mobile_login_complete"
    private val EVENT_NAME_LOGIN_METHOD_COMPLETE: String = "fb_mobile_login_method_complete"
    private val EVENT_NAME_LOGIN_METHOD_START: String = "fb_mobile_login_method_start"
    val EVENT_NAME_LOGIN_START: String = "fb_mobile_login_start"
    val EVENT_PARAM_AUTH_LOGGER_ID: String = "0_auth_logger_id"
    val EVENT_PARAM_ERROR_CODE: String = "4_error_code"
    val EVENT_PARAM_ERROR_MESSAGE: String = "5_error_message"
    val EVENT_PARAM_EXTRAS: String = "6_extras"
    val EVENT_PARAM_LOGIN_RESULT: String = "2_result"
    val EVENT_PARAM_METHOD: String = "3_method"
    private val EVENT_PARAM_METHOD_RESULT_SKIPPED: String = "skipped"
    val EVENT_PARAM_TIMESTAMP: String = "1_timestamp_ms"
    private val TAG: String = "Facebook-AuthorizationClient"
    private val WEB_VIEW_AUTH_HANDLER_STORE: String = "com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
    private val WEB_VIEW_AUTH_HANDLER_TOKEN_KEY: String = "TOKEN"
    private val serialVersionUID: Long = 0x1L

    private @JvmStatic fun getE2E(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "init"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    @JvmStatic fun newAuthorizationLoggingBundle(p0: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "1_timestamp_ms"
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v1, "0_auth_logger_id"
    //         invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "3_method"
    //         const-string v2, ""
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "2_result"
    //         const-string v2, ""
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "5_error_message"
    //         const-string v2, ""
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "4_error_code"
    //         const-string v2, ""
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "6_extras"
    //         const-string v2, ""
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    }
}
