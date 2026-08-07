package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 2 fields, 2 methods.

open class AuthorizationClient_KatanaAuthHandler: com.facebook.AuthorizationClient.AuthHandler() {
    val this$0: com.facebook.AuthorizationClient

    constructor(p0: com.facebook.AuthorizationClient)

    protected fun tryIntent(p0: android.content.Intent, p1: Int): Boolean { return TODO("body: (Landroid/content/Intent;I)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$KatanaAuthHandler;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v1}, Lcom/facebook/AuthorizationClient;->getStartActivityDelegate()Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p1, p2}, Lcom/facebook/AuthorizationClient$StartActivityDelegate;->startActivityForResult(Landroid/content/Intent;I)V
    //         :try_end_0
    //         .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
