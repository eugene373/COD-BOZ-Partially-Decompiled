package com.facebook.internal

// Auto-emitted from smali source: FacebookWebFallbackDialog.java.
// 3 fields, 7 methods.

open class FacebookWebFallbackDialog: com.facebook.widget.WebDialog() {
    private var waitingForDialogToClose: Boolean

    private constructor(p0: android.content.Context, p1: String, p2: String)

    public fun dismiss() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->getWebView()Landroid/webkit/WebView;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->isListenerCalled()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/webkit/WebView;->isShown()Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         :cond_0
    //         invoke-super {p0}, Lcom/facebook/widget/WebDialog;->dismiss()V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-boolean v1, p0, Lcom/facebook/internal/FacebookWebFallbackDialog;->waitingForDialogToClose:Z
    //         if-nez v1, :cond_1
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Lcom/facebook/internal/FacebookWebFallbackDialog;->waitingForDialogToClose:Z
    //         const-string v1, "(function() {  var event = document.createEvent(\'Event\');  event.initEvent(\'fbPlatformDialogMustClose\',true,true);  document.dispatchEvent(event);})();"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "javascript:"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    //         new-instance v0, Landroid/os/Handler;
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         new-instance v1, Lcom/facebook/internal/FacebookWebFallbackDialog$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/internal/FacebookWebFallbackDialog$2;-><init>(Lcom/facebook/internal/FacebookWebFallbackDialog;)V
    //         const-wide/16 v2, 0x5dc
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         goto :goto_0
    */

    protected fun parseResponseUri(p0: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->parseUrlQueryString(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v1
    //         const-string v0, "bridge_args"
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "bridge_args"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :try_start_0
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         invoke-static {v2}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v2, "com.facebook.platform.protocol.BRIDGE_ARGS"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         const-string v0, "method_results"
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "method_results"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_2
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         const-string v0, "{}"
    //         :cond_1
    //         :try_start_1
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         invoke-static {v2}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v2, "com.facebook.platform.protocol.RESULT_ARGS"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    //         :cond_2
    //         :goto_1
    //         const-string v0, "version"
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"
    //         invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I
    //         move-result v2
    //         invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object v1
    //         :catch_0
    //         move-exception v0
    //         sget-object v2, Lcom/facebook/internal/FacebookWebFallbackDialog;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to parse bridge_args JSON"
    //         invoke-static {v2, v3, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         sget-object v2, Lcom/facebook/internal/FacebookWebFallbackDialog;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to parse bridge_args JSON"
    //         invoke-static {v2, v3, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    */

    companion object {
    private val OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS: Int = 0x5dc
    private val TAG: String = null!!

    public @JvmStatic fun presentWebFallback(p0: android.content.Context, p1: String, p2: String, p3: com.facebook.widget.FacebookDialog.PendingCall, p4: com.facebook.widget.FacebookDialog.Callback): Boolean { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v2, "fb%s://bridge/"
    //         new-array v3, v1, [Ljava/lang/Object;
    //         aput-object p2, v3, v0
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v2, Lcom/facebook/internal/FacebookWebFallbackDialog;
    //         invoke-direct {v2, p0, p1, v0}, Lcom/facebook/internal/FacebookWebFallbackDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/internal/FacebookWebFallbackDialog$1;
    //         invoke-direct {v0, p0, p3, p4}, Lcom/facebook/internal/FacebookWebFallbackDialog$1;-><init>(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)V
    //         invoke-virtual {v2, v0}, Lcom/facebook/internal/FacebookWebFallbackDialog;->setOnCompleteListener(Lcom/facebook/widget/WebDialog$OnCompleteListener;)V
    //         invoke-virtual {v2}, Lcom/facebook/internal/FacebookWebFallbackDialog;->show()V
    //         move v0, v1
    //         goto :goto_0
    */

    }
}
