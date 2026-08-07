package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 5 fields, 9 methods.

open class AuthorizationClient_WebViewAuthHandler: com.facebook.AuthorizationClient.AuthHandler() {
    private var applicationId: String
    private var e2e: String
    private var loginDialog: com.facebook.widget.WebDialog
    val this$0: com.facebook.AuthorizationClient

    constructor(p0: com.facebook.AuthorizationClient)

    private fun loadCookieToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient;->getStartActivityDelegate()Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/facebook/AuthorizationClient$StartActivityDelegate;->getActivityContext()Landroid/app/Activity;
    //         move-result-object v0
    //         const-string v1, "com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         const-string v1, "TOKEN"
    //         const-string v2, ""
    //         invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private fun saveCookieToken(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient;->getStartActivityDelegate()Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/facebook/AuthorizationClient$StartActivityDelegate;->getActivityContext()Landroid/app/Activity;
    //         move-result-object v0
    //         const-string v1, "com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         const-string v1, "TOKEN"
    //         invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         return-void
    */

    fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loginDialog:Lcom/facebook/widget/WebDialog;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loginDialog:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/WebDialog;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)V
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loginDialog:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->dismiss()V
    //         iput-object v1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loginDialog:Lcom/facebook/widget/WebDialog;
    //         :cond_0
    //         return-void
    */

    fun getNameForLogging(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "web_view"
    //         return-object v0
    */

    fun needsInternetPermission(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    fun needsRestart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    fun onWebDialogComplete(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: android.os.Bundle, p2: com.facebook.FacebookException) { /* TODO(body): (Lcom/facebook/AuthorizationClient$AuthorizationRequest;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V */ }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         if-eqz p2, :cond_2
    //         const-string v0, "e2e"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "e2e"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/AccessTokenSource;->WEB_VIEW:Lcom/facebook/AccessTokenSource;
    //         invoke-static {v0, p2, v1}, Lcom/facebook/AccessToken;->createFromWebBundle(Ljava/util/List;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v0, v1}, Lcom/facebook/AuthorizationClient$Result;->createTokenResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AccessToken;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v2, v2, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         invoke-static {v2}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/webkit/CookieSyncManager;->sync()V
    //         invoke-virtual {v1}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {p0, v1}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->saveCookieToken(Ljava/lang/String;)V
    //         :goto_0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->applicationId:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         invoke-static {v1, v2, v3}, Lcom/facebook/AuthorizationClient;->access$200(Lcom/facebook/AuthorizationClient;Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v1, v0}, Lcom/facebook/AuthorizationClient;->completeAndValidate(Lcom/facebook/AuthorizationClient$Result;)V
    //         return-void
    //         :cond_2
    //         instance-of v0, p3, Lcom/facebook/FacebookOperationCanceledException;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v1, "User canceled log in."
    //         invoke-static {v0, v1}, Lcom/facebook/AuthorizationClient$Result;->createCancelResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         iput-object v2, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         invoke-virtual {p3}, Lcom/facebook/FacebookException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         instance-of v1, p3, Lcom/facebook/FacebookServiceException;
    //         if-eqz v1, :cond_4
    //         check-cast p3, Lcom/facebook/FacebookServiceException;
    //         invoke-virtual {p3}, Lcom/facebook/FacebookServiceException;->getRequestError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         const-string v1, "%d"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getErrorCode()I
    //         move-result v5
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         iget-object v3, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v3, v3, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v3, v2, v0, v1}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_4
    //         move-object v1, v2
    //         goto :goto_1
    */

    fun tryAuthorize(p0: com.facebook.AuthorizationClient.AuthorizationRequest): Boolean { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Z") }
    /*
    //         .locals 5
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->applicationId:Ljava/lang/String;
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, ","
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "scope"
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "scope"
    //         invoke-virtual {p0, v2, v1}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getDefaultAudience()Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v1
    //         const-string v2, "default_audience"
    //         invoke-virtual {v1}, Lcom/facebook/SessionDefaultAudience;->getNativeProtocolAudience()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPreviousAccessToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         invoke-direct {p0}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loadCookieToken()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         const-string v2, "access_token"
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "access_token"
    //         const-string v2, "1"
    //         invoke-virtual {p0, v1, v2}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V
    //         :goto_0
    //         new-instance v1, Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;
    //         invoke-direct {v1, p0, p1}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;-><init>(Lcom/facebook/AuthorizationClient$WebViewAuthHandler;Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    //         invoke-static {}, Lcom/facebook/AuthorizationClient;->access$100()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         const-string v2, "e2e"
    //         iget-object v3, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         invoke-virtual {p0, v2, v3}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V
    //         new-instance v2, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;
    //         iget-object v3, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v3}, Lcom/facebook/AuthorizationClient;->getStartActivityDelegate()Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         move-result-object v3
    //         invoke-interface {v3}, Lcom/facebook/AuthorizationClient$StartActivityDelegate;->getActivityContext()Landroid/app/Activity;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->applicationId:Ljava/lang/String;
    //         invoke-direct {v2, v3, v4, v0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->e2e:Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->setE2E(Ljava/lang/String;)Lcom/facebook/AuthorizationClient$AuthDialogBuilder;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isRerequest()Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->setIsRerequest(Z)Lcom/facebook/AuthorizationClient$AuthDialogBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)Lcom/facebook/widget/WebDialog$BuilderBase;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/WebDialog$Builder;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog$Builder;->build()Lcom/facebook/widget/WebDialog;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loginDialog:Lcom/facebook/widget/WebDialog;
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->loginDialog:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->show()V
    //         const/4 v0, 0x1
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v1, v1, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->clearFacebookCookies(Landroid/content/Context;)V
    //         const-string v1, "access_token"
    //         const-string v2, "0"
    //         invoke-virtual {p0, v1, v2}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
