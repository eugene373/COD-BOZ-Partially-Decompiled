package com.facebook

// Auto-emitted from smali source: LoginActivity.java.
// 9 fields, 10 methods.

open class LoginActivity: android.app.Activity() {
    private var authorizationClient: com.facebook.AuthorizationClient
    private var callingPackage: String
    private var request: com.facebook.AuthorizationClient.AuthorizationRequest

    public constructor()

    private fun onAuthClientCompleted(p0: com.facebook.AuthorizationClient.Result) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/LoginActivity;->request:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         iget-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->code:Lcom/facebook/AuthorizationClient$Result$Code;
    //         sget-object v1, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "com.facebook.LoginActivity:Result"
    //         invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    //         new-instance v2, Landroid/content/Intent;
    //         invoke-direct {v2}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {p0, v0, v2}, Lcom/facebook/LoginActivity;->setResult(ILandroid/content/Intent;)V
    //         invoke-virtual {p0}, Lcom/facebook/LoginActivity;->finish()V
    //         return-void
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/AuthorizationClient;->onActivityResult(IILandroid/content/Intent;)Z
    //         return-void
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         sget v0, Lcom/facebook/android/R$layout;->com_facebook_login_activity_layout:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/LoginActivity;->setContentView(I)V
    //         if-eqz p1, :cond_0
    //         const-string v0, "callingPackage"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/LoginActivity;->callingPackage:Ljava/lang/String;
    //         const-string v0, "authorizationClient"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AuthorizationClient;
    //         iput-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0, p0}, Lcom/facebook/AuthorizationClient;->setContext(Landroid/app/Activity;)V
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         new-instance v1, Lcom/facebook/LoginActivity$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/LoginActivity$1;-><init>(Lcom/facebook/LoginActivity;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient;->setOnCompletedListener(Lcom/facebook/AuthorizationClient$OnCompletedListener;)V
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         new-instance v1, Lcom/facebook/LoginActivity$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/LoginActivity$2;-><init>(Lcom/facebook/LoginActivity;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient;->setBackgroundProcessingListener(Lcom/facebook/AuthorizationClient$BackgroundProcessingListener;)V
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/LoginActivity;->getCallingPackage()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/LoginActivity;->callingPackage:Ljava/lang/String;
    //         new-instance v0, Lcom/facebook/AuthorizationClient;
    //         invoke-direct {v0}, Lcom/facebook/AuthorizationClient;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {p0}, Lcom/facebook/LoginActivity;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         const-string v1, "request"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         iput-object v0, p0, Lcom/facebook/LoginActivity;->request:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         goto :goto_0
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onPause()V
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient;->cancelCurrentHandler()V
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_login_activity_progress_bar:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/LoginActivity;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         const/16 v1, 0x8
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onResume()V
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->callingPackage:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/facebook/LoginActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/facebook/LoginActivity;->finish()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         iget-object v1, p0, Lcom/facebook/LoginActivity;->request:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient;->startOrContinueAuth(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    //         goto :goto_0
    */

    public fun onSaveInstanceState(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         const-string v0, "callingPackage"
    //         iget-object v1, p0, Lcom/facebook/LoginActivity;->callingPackage:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "authorizationClient"
    //         iget-object v1, p0, Lcom/facebook/LoginActivity;->authorizationClient:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    //         return-void
    */

    companion object {
    private val EXTRA_REQUEST: String = "request"
    private val NULL_CALLING_PKG_ERROR_MSG: String = "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance."
    val RESULT_KEY: String = "com.facebook.LoginActivity:Result"
    private val SAVED_AUTH_CLIENT: String = "authorizationClient"
    private val SAVED_CALLING_PKG_KEY: String = "callingPackage"
    private val TAG: String = null!!

    @JvmStatic fun populateIntentExtras(p0: com.facebook.AuthorizationClient.AuthorizationRequest): android.os.Bundle { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "request"
    //         invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    //         return-object v0
    */

    }
}
