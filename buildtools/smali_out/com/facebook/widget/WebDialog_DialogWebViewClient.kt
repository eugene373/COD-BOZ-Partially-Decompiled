package com.facebook.widget

// Auto-emitted from smali source: WebDialog.java.
// 1 fields, 7 methods.

open class WebDialog_DialogWebViewClient: android.webkit.WebViewClient() {
    val this$0: com.facebook.widget.WebDialog

    private constructor(p0: com.facebook.widget.WebDialog)

    constructor(p0: com.facebook.widget.WebDialog, p1: com.facebook.widget.WebDialog.1)

    public fun onPageFinished(p0: android.webkit.WebView, p1: String) { /* TODO(body): (Landroid/webkit/WebView;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$200(Lcom/facebook/widget/WebDialog;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$300(Lcom/facebook/widget/WebDialog;)Landroid/app/ProgressDialog;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$400(Lcom/facebook/widget/WebDialog;)Landroid/widget/FrameLayout;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$500(Lcom/facebook/widget/WebDialog;)Landroid/webkit/WebView;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$600(Lcom/facebook/widget/WebDialog;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    //         return-void
    */

    public fun onPageStarted(p0: android.webkit.WebView, p1: String, p2: android.graphics.Bitmap) { /* TODO(body): (Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "FacebookSDK.WebDialog"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Webview loading URL: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$200(Lcom/facebook/widget/WebDialog;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$300(Lcom/facebook/widget/WebDialog;)Landroid/app/ProgressDialog;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
    //         :cond_0
    //         return-void
    */

    public fun onReceivedError(p0: android.webkit.WebView, p1: Int, p2: String, p3: String) { /* TODO(body): (Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         new-instance v1, Lcom/facebook/FacebookDialogException;
    //         invoke-direct {v1, p3, p2, p4}, Lcom/facebook/FacebookDialogException;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V
    //         return-void
    */

    public fun onReceivedSslError(p0: android.webkit.WebView, p1: android.webkit.SslErrorHandler, p2: android.net.http.SslError) { /* TODO(body): (Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    //         invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         new-instance v1, Lcom/facebook/FacebookDialogException;
    //         const/16 v2, -0xb
    //         invoke-direct {v1, v3, v2, v3}, Lcom/facebook/FacebookDialogException;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V
    //         return-void
    */

    public fun shouldOverrideUrlLoading(p0: android.webkit.WebView, p1: String): Boolean { return TODO("body: (Landroid/webkit/WebView;Ljava/lang/String;)Z") }
    /*
    //         .locals 7
    //         const/4 v4, 0x1
    //         const/4 v3, -0x1
    //         const-string v0, "FacebookSDK.WebDialog"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Redirect URL: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-static {v0}, Lcom/facebook/widget/WebDialog;->access$100(Lcom/facebook/widget/WebDialog;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0, p2}, Lcom/facebook/widget/WebDialog;->parseResponseUri(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v5
    //         const-string v0, "error"
    //         invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "error_type"
    //         invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         const-string v1, "error_msg"
    //         invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         const-string v1, "error_description"
    //         invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         :cond_1
    //         const-string v2, "error_code"
    //         invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v6
    //         if-nez v6, :cond_9
    //         :try_start_0
    //         invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v2
    //         :goto_0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v6
    //         if-eqz v6, :cond_2
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v6
    //         if-eqz v6, :cond_2
    //         if-ne v2, v3, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0, v5}, Lcom/facebook/widget/WebDialog;->sendSuccessToListener(Landroid/os/Bundle;)V
    //         :goto_1
    //         move v0, v4
    //         :goto_2
    //         return v0
    //         :catch_0
    //         move-exception v2
    //         move v2, v3
    //         goto :goto_0
    //         :cond_2
    //         if-eqz v0, :cond_4
    //         const-string v3, "access_denied"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-nez v3, :cond_3
    //         const-string v3, "OAuthAccessDeniedException"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->sendCancelToListener()V
    //         goto :goto_1
    //         :cond_4
    //         const/16 v3, 0x1069
    //         if-ne v2, v3, :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->sendCancelToListener()V
    //         goto :goto_1
    //         :cond_5
    //         new-instance v3, Lcom/facebook/FacebookRequestError;
    //         invoke-direct {v3, v2, v0, v1}, Lcom/facebook/FacebookRequestError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         new-instance v2, Lcom/facebook/FacebookServiceException;
    //         invoke-direct {v2, v3, v1}, Lcom/facebook/FacebookServiceException;-><init>(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V
    //         invoke-virtual {v0, v2}, Lcom/facebook/widget/WebDialog;->sendErrorToListener(Ljava/lang/Throwable;)V
    //         goto :goto_1
    //         :cond_6
    //         const-string v0, "fbconnect://cancel"
    //         invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->sendCancelToListener()V
    //         move v0, v4
    //         goto :goto_2
    //         :cond_7
    //         const-string v0, "touch"
    //         invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         const/4 v0, 0x0
    //         goto :goto_2
    //         :cond_8
    //         iget-object v0, p0, Lcom/facebook/widget/WebDialog$DialogWebViewClient;->this$0:Lcom/facebook/widget/WebDialog;
    //         invoke-virtual {v0}, Lcom/facebook/widget/WebDialog;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "android.intent.action.VIEW"
    //         invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         move v0, v4
    //         goto :goto_2
    //         :cond_9
    //         move v2, v3
    //         goto :goto_0
    */

}
