package com.facebook

// Auto-emitted from smali source: LoginActivity.java.
// 1 fields, 3 methods.

open class LoginActivity_Anon2: com.facebook.AuthorizationClient.BackgroundProcessingListener {
    val this$0: com.facebook.LoginActivity

    constructor(p0: com.facebook.LoginActivity)

    public fun onBackgroundProcessingStarted() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/LoginActivity$2;->this$0:Lcom/facebook/LoginActivity;
    //         sget v1, Lcom/facebook/android/R$id;->com_facebook_login_activity_progress_bar:I
    //         invoke-virtual {v0, v1}, Lcom/facebook/LoginActivity;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         return-void
    */

    public fun onBackgroundProcessingStopped() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/LoginActivity$2;->this$0:Lcom/facebook/LoginActivity;
    //         sget v1, Lcom/facebook/android/R$id;->com_facebook_login_activity_progress_bar:I
    //         invoke-virtual {v0, v1}, Lcom/facebook/LoginActivity;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         const/16 v1, 0x8
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    //         return-void
    */

}
