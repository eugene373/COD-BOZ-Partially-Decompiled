package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 3 fields, 6 methods.

open class AuthorizationClient_GetTokenAuthHandler: com.facebook.AuthorizationClient.AuthHandler() {
    private var getTokenClient: com.facebook.GetTokenClient
    val this$0: com.facebook.AuthorizationClient

    constructor(p0: com.facebook.AuthorizationClient)

    fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         invoke-virtual {v0}, Lcom/facebook/GetTokenClient;->cancel()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         :cond_0
    //         return-void
    */

    fun getNameForLogging(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "get_token"
    //         return-object v0
    */

    fun getTokenCompleted(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: android.os.Bundle) { /* TODO(body): (Lcom/facebook/AuthorizationClient$AuthorizationRequest;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->access$000(Lcom/facebook/AuthorizationClient;)V
    //         if-eqz p2, :cond_5
    //         const-string v0, "com.facebook.platform.extra.PERMISSIONS"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         if-eqz v1, :cond_1
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->containsAll(Ljava/util/Collection;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         :cond_0
    //         sget-object v0, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_SERVICE:Lcom/facebook/AccessTokenSource;
    //         invoke-static {p2, v0}, Lcom/facebook/AccessToken;->createFromNativeLogin(Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v1, v1, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v1, v0}, Lcom/facebook/AuthorizationClient$Result;->createTokenResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AccessToken;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v1, v0}, Lcom/facebook/AuthorizationClient;->completeAndValidate(Lcom/facebook/AuthorizationClient$Result;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_2
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-nez v4, :cond_2
    //         invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_3
    //         invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         const-string v0, "new_permissions"
    //         const-string v1, ","
    //         invoke-static {v1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->addLoggingExtra(Ljava/lang/String;Ljava/lang/Object;)V
    //         :cond_4
    //         invoke-virtual {p1, v2}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->setPermissions(Ljava/util/List;)V
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient;->tryNextHandler()V
    //         goto :goto_0
    */

    fun needsRestart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun tryAuthorize(p0: com.facebook.AuthorizationClient.AuthorizationRequest): Boolean { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Z") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/facebook/GetTokenClient;
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v1, v1, Lcom/facebook/AuthorizationClient;->context:Landroid/content/Context;
    //         invoke-virtual {p1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/GetTokenClient;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         invoke-virtual {v0}, Lcom/facebook/GetTokenClient;->start()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->access$300(Lcom/facebook/AuthorizationClient;)V
    //         new-instance v0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler$1;
    //         invoke-direct {v0, p0, p1}, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler$1;-><init>(Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$GetTokenAuthHandler;->getTokenClient:Lcom/facebook/GetTokenClient;
    //         invoke-virtual {v1, v0}, Lcom/facebook/GetTokenClient;->setCompletedListener(Lcom/facebook/internal/PlatformServiceClient$CompletedListener;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
