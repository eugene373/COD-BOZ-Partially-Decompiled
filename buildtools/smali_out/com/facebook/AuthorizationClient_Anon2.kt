package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 1 fields, 3 methods.

open class AuthorizationClient_Anon2: com.facebook.AuthorizationClient.StartActivityDelegate {
    val this$0: com.facebook.AuthorizationClient

    constructor(p0: com.facebook.AuthorizationClient)

    public fun getActivityContext(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$2;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getStartActivityDelegate()Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/facebook/AuthorizationClient$StartActivityDelegate;->getActivityContext()Landroid/app/Activity;
    //         move-result-object v0
    //         return-object v0
    */

    public fun startActivityForResult(p0: android.content.Intent, p1: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$2;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-virtual {v0}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->getStartActivityDelegate()Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         move-result-object v0
    //         invoke-interface {v0, p1, p2}, Lcom/facebook/AuthorizationClient$StartActivityDelegate;->startActivityForResult(Landroid/content/Intent;I)V
    //         return-void
    */

}
