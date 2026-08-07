package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 3 fields, 5 methods.

open class AuthorizationClient_KatanaProxyAuthHandler: com.facebook.AuthorizationClient.KatanaAuthHandler() {
    private var applicationId: String
    val this$0: com.facebook.AuthorizationClient

    constructor(p0: com.facebook.AuthorizationClient)

    private fun handleResultOk(p0: android.content.Intent): com.facebook.AuthorizationClient.Result { return TODO("body: (Landroid/content/Intent;)Lcom/facebook/AuthorizationClient$Result;") }
    /*
    //         .locals 8
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v3
    //         const-string v0, "error"
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "error_type"
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         const-string v1, "error_code"
    //         invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         const-string v1, "error_message"
    //         invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         const-string v1, "error_description"
    //         invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         :cond_1
    //         const-string v5, "e2e"
    //         invoke-virtual {v3, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v5}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v6
    //         if-nez v6, :cond_2
    //         iget-object v6, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v7, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->applicationId:Ljava/lang/String;
    //         invoke-static {v6, v7, v5}, Lcom/facebook/AuthorizationClient;->access$200(Lcom/facebook/AuthorizationClient;Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_2
    //         if-nez v0, :cond_3
    //         if-nez v4, :cond_3
    //         if-nez v1, :cond_3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_WEB:Lcom/facebook/AccessTokenSource;
    //         invoke-static {v0, v3, v1}, Lcom/facebook/AccessToken;->createFromWebBundle(Ljava/util/List;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v1, v1, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v1, v0}, Lcom/facebook/AuthorizationClient$Result;->createTokenResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AccessToken;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_3
    //         sget-object v3, Lcom/facebook/internal/ServerProtocol;->errorsProxyAuthDisabled:Ljava/util/Collection;
    //         invoke-interface {v3, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         move-object v0, v2
    //         goto :goto_0
    //         :cond_4
    //         sget-object v3, Lcom/facebook/internal/ServerProtocol;->errorsUserCanceled:Ljava/util/Collection;
    //         invoke-interface {v3, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_5
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v0, v2}, Lcom/facebook/AuthorizationClient$Result;->createCancelResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_5
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v2, v2, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v2, v0, v1, v4}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    */

    fun getNameForLogging(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "katana_proxy_auth"
    //         return-object v0
    */

    fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent): Boolean { return TODO("body: (IILandroid/content/Intent;)Z") }
    /*
    //         .locals 3
    //         if-nez p3, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v1, "Operation canceled"
    //         invoke-static {v0, v1}, Lcom/facebook/AuthorizationClient$Result;->createCancelResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         :goto_0
    //         if-eqz v0, :cond_3
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v1, v0}, Lcom/facebook/AuthorizationClient;->completeAndValidate(Lcom/facebook/AuthorizationClient$Result;)V
    //         :goto_1
    //         const/4 v0, 0x1
    //         return v0
    //         :cond_0
    //         if-nez p2, :cond_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v1, "error"
    //         invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/AuthorizationClient$Result;->createCancelResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, -0x1
    //         if-eq p2, v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v1, "Unexpected resultCode from authorization."
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         invoke-direct {p0, p3}, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->handleResultOk(Landroid/content/Intent;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient;->tryNextHandler()V
    //         goto :goto_1
    */

    fun tryAuthorize(p0: com.facebook.AuthorizationClient.AuthorizationRequest): Boolean { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Z") }
    /*
    //         .locals 6
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->applicationId:Ljava/lang/String;
    //         invoke-static {}, Lcom/facebook/AuthorizationClient;->access$100()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v2
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isRerequest()Z
    //         move-result v4
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getDefaultAudience()Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v5
    //         invoke-static/range {v0 .. v5}, Lcom/facebook/internal/NativeProtocol;->createProxyAuthIntent(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLcom/facebook/SessionDefaultAudience;)Landroid/content/Intent;
    //         move-result-object v0
    //         const-string v1, "e2e"
    //         invoke-virtual {p0, v1, v3}, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getRequestCode()I
    //         move-result v1
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/AuthorizationClient$KatanaProxyAuthHandler;->tryIntent(Landroid/content/Intent;I)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
