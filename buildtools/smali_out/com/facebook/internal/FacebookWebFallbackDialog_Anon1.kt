package com.facebook.internal

// Auto-emitted from smali source: FacebookWebFallbackDialog.java.
// 3 fields, 2 methods.

class FacebookWebFallbackDialog_Anon1: com.facebook.widget.WebDialog.OnCompleteListener {
    val val$appCall: com.facebook.widget.FacebookDialog.PendingCall
    val val$callback: com.facebook.widget.FacebookDialog.Callback
    val val$context: android.content.Context

    constructor(p0: android.content.Context, p1: com.facebook.widget.FacebookDialog.PendingCall, p2: com.facebook.widget.FacebookDialog.Callback)

    public fun onComplete(p0: android.os.Bundle, p1: com.facebook.FacebookException) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/FacebookException;)V */ }
    /*
    //         .locals 5
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         if-nez p1, :cond_0
    //         new-instance p1, Landroid/os/Bundle;
    //         invoke-direct {p1}, Landroid/os/Bundle;-><init>()V
    //         :cond_0
    //         invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/facebook/internal/FacebookWebFallbackDialog$1;->val$context:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/internal/FacebookWebFallbackDialog$1;->val$appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         iget-object v3, p0, Lcom/facebook/internal/FacebookWebFallbackDialog$1;->val$appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v3}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I
    //         move-result v3
    //         iget-object v4, p0, Lcom/facebook/internal/FacebookWebFallbackDialog$1;->val$callback:Lcom/facebook/widget/FacebookDialog$Callback;
    //         invoke-static {v1, v2, v3, v0, v4}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    //         return-void
    */

}
