package bolts

// Auto-emitted from smali source: WebViewAppLinkResolver.java.
// 4 fields, 3 methods.

open class WebViewAppLinkResolver_Anon2: bolts.Continuation {
    val this$0: bolts.WebViewAppLinkResolver
    val val$content: bolts.Capture
    val val$contentType: bolts.Capture
    val val$url: android.net.Uri

    constructor(p0: bolts.WebViewAppLinkResolver, p1: bolts.Capture, p2: android.net.Uri, p3: bolts.Capture)

    public fun then(p0: bolts.Task): bolts.Task { return TODO("body: (Lbolts/Task;)Lbolts/Task;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;)",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Lorg/json/JSONArray;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Void;>;"
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v6
    //         .local v6, "tcs":Lbolts/Task$TaskCompletionSource;, "Lbolts/Task<Lorg/json/JSONArray;>.TaskCompletionSource;"
    //         new-instance v0, Landroid/webkit/WebView;
    //         iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->this$0:Lbolts/WebViewAppLinkResolver;
    //         invoke-static {v1}, Lbolts/WebViewAppLinkResolver;->access$200(Lbolts/WebViewAppLinkResolver;)Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
    //         .local v0, "webView":Landroid/webkit/WebView;
    //         invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
    //         move-result-object v1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
    //         invoke-virtual {v0, v5}, Landroid/webkit/WebView;->setNetworkAvailable(Z)V
    //         new-instance v1, Lbolts/WebViewAppLinkResolver$2$1;
    //         invoke-direct {v1, p0}, Lbolts/WebViewAppLinkResolver$2$1;-><init>(Lbolts/WebViewAppLinkResolver$2;)V
    //         invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
    //         new-instance v1, Lbolts/WebViewAppLinkResolver$2$2;
    //         invoke-direct {v1, p0, v6}, Lbolts/WebViewAppLinkResolver$2$2;-><init>(Lbolts/WebViewAppLinkResolver$2;Lbolts/Task$TaskCompletionSource;)V
    //         const-string v2, "boltsWebViewAppLinkResolverResult"
    //         invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    //         const/4 v3, 0x0
    //         .local v3, "inferredContentType":Ljava/lang/String;
    //         iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->val$contentType:Lbolts/Capture;
    //         invoke-virtual {v1}, Lbolts/Capture;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->val$contentType:Lbolts/Capture;
    //         invoke-virtual {v1}, Lbolts/Capture;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v2, ";"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v1
    //         aget-object v3, v1, v5
    //         :cond_0
    //         iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2;->val$url:Landroid/net/Uri;
    //         invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lbolts/WebViewAppLinkResolver$2;->val$content:Lbolts/Capture;
    //         invoke-virtual {v2}, Lbolts/Capture;->get()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         move-object v5, v4
    //         invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v6}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v1
    //         return-object v1
    */

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lbolts/WebViewAppLinkResolver$2;->then(Lbolts/Task;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

}
