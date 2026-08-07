package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 4 fields, 4 methods.

open class AuthorizationClient_AuthDialogBuilder: com.facebook.widget.WebDialog.Builder() {
    private var e2e: String
    private var isRerequest: Boolean

    public constructor(p0: android.content.Context, p1: String, p2: android.os.Bundle)

    public fun build(): com.facebook.widget.WebDialog { return TODO("body: ()Lcom/facebook/widget/WebDialog;") }
    /*
    //         .locals 6
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v3
    //         const-string v0, "redirect_uri"
    //         const-string v1, "fbconnect://success"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "client_id"
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->getApplicationId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "e2e"
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->e2e:Ljava/lang/String;
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "response_type"
    //         const-string v1, "token"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "return_scopes"
    //         const-string v1, "true"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->isRerequest:Z
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Settings;->getPlatformCompatibilityEnabled()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "auth_type"
    //         const-string v1, "rerequest"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         new-instance v0, Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         const-string v2, "oauth"
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->getTheme()I
    //         move-result v4
    //         invoke-virtual {p0}, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->getListener()Lcom/facebook/widget/WebDialog$OnCompleteListener;
    //         move-result-object v5
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/WebDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/widget/WebDialog$OnCompleteListener;)V
    //         return-object v0
    */

    public fun setE2E(p0: String): com.facebook.AuthorizationClient.AuthDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AuthorizationClient$AuthDialogBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->e2e:Ljava/lang/String;
    //         return-object p0
    */

    public fun setIsRerequest(p0: Boolean): com.facebook.AuthorizationClient.AuthDialogBuilder { return TODO("body: (Z)Lcom/facebook/AuthorizationClient$AuthDialogBuilder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/AuthorizationClient$AuthDialogBuilder;->isRerequest:Z
    //         return-object p0
    */

    companion object {
    private val OAUTH_DIALOG: String = "oauth"
    val REDIRECT_URI: String = "fbconnect://success"
    }
}
