package bolts

// Auto-emitted from smali source: WebViewAppLinkResolver.java.
// 4 fields, 3 methods.

open class WebViewAppLinkResolver_Anon3: java.util.concurrent.Callable {
    val this$0: bolts.WebViewAppLinkResolver
    val val$content: bolts.Capture
    val val$contentType: bolts.Capture
    val val$url: android.net.Uri

    constructor(p0: bolts.WebViewAppLinkResolver, p1: android.net.Uri, p2: bolts.Capture, p3: bolts.Capture)

    public fun call(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lbolts/WebViewAppLinkResolver$3;->call()Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    public fun call(): Void { return TODO("body: ()Ljava/lang/Void;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/net/URL;
    //         iget-object v3, p0, Lbolts/WebViewAppLinkResolver$3;->val$url:Landroid/net/Uri;
    //         invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         .local v1, "currentURL":Ljava/net/URL;
    //         const/4 v0, 0x0
    //         .local v0, "connection":Ljava/net/URLConnection;
    //         :goto_0
    //         if-eqz v1, :cond_3
    //         invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v0
    //         instance-of v3, v0, Ljava/net/HttpURLConnection;
    //         if-eqz v3, :cond_0
    //         move-object v3, v0
    //         check-cast v3, Ljava/net/HttpURLConnection;
    //         const/4 v4, 0x1
    //         invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
    //         :cond_0
    //         const-string v3, "Prefer-Html-Meta-Tags"
    //         const-string v4, "al"
    //         invoke-virtual {v0, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
    //         instance-of v3, v0, Ljava/net/HttpURLConnection;
    //         if-eqz v3, :cond_2
    //         move-object v2, v0
    //         check-cast v2, Ljava/net/HttpURLConnection;
    //         .local v2, "httpConnection":Ljava/net/HttpURLConnection;
    //         invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v3
    //         const/16 v4, 0x12c
    //         if-lt v3, v4, :cond_1
    //         invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v3
    //         const/16 v4, 0x190
    //         if-ge v3, v4, :cond_1
    //         new-instance v1, Ljava/net/URL;
    //         .end local v1    # "currentURL":Ljava/net/URL;
    //         const-string v3, "Location"
    //         invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         .restart local v1    # "currentURL":Ljava/net/URL;
    //         invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         .end local v2    # "httpConnection":Ljava/net/HttpURLConnection;
    //         :cond_2
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :cond_3
    //         :try_start_0
    //         iget-object v3, p0, Lbolts/WebViewAppLinkResolver$3;->val$content:Lbolts/Capture;
    //         invoke-static {v0}, Lbolts/WebViewAppLinkResolver;->access$300(Ljava/net/URLConnection;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Lbolts/Capture;->set(Ljava/lang/Object;)V
    //         iget-object v3, p0, Lbolts/WebViewAppLinkResolver$3;->val$contentType:Lbolts/Capture;
    //         invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Lbolts/Capture;->set(Ljava/lang/Object;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         instance-of v3, v0, Ljava/net/HttpURLConnection;
    //         if-eqz v3, :cond_4
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         .end local v0    # "connection":Ljava/net/URLConnection;
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :cond_4
    //         const/4 v3, 0x0
    //         return-object v3
    //         .restart local v0    # "connection":Ljava/net/URLConnection;
    //         :catchall_0
    //         move-exception v3
    //         instance-of v4, v0, Ljava/net/HttpURLConnection;
    //         if-eqz v4, :cond_5
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         .end local v0    # "connection":Ljava/net/URLConnection;
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :cond_5
    //         throw v3
    */

}
