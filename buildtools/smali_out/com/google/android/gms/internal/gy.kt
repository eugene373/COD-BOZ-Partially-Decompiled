package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

open class gy: com.google.android.gms.internal.gw() {
    public constructor(p0: com.google.android.gms.internal.gv, p1: Boolean)

    protected fun d(p0: android.content.Context, p1: String, p2: String): android.webkit.WebResourceResponse { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/net/URL;
    //         invoke-direct {v0, p3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v0
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         const/4 v1, 0x1
    //         const/4 v2, 0x1
    //         :try_start_0
    //         invoke-static {p1, p2, v1, v0, v2}, Lcom/google/android/gms/internal/gj;->a(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;Z)V
    //         const-string v1, "Cache-Control"
    //         const-string v2, "max-stale=3600"
    //         invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
    //         new-instance v1, Ljava/io/InputStreamReader;
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gj;->a(Ljava/lang/Readable;)Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Landroid/webkit/WebResourceResponse;
    //         const-string v3, "application/javascript"
    //         const-string v4, "UTF-8"
    //         new-instance v5, Ljava/io/ByteArrayInputStream;
    //         const-string v6, "UTF-8"
    //         invoke-virtual {v1, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         move-result-object v1
    //         invoke-direct {v5, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    //         invoke-direct {v2, v3, v4, v5}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         return-object v2
    //         :catchall_0
    //         move-exception v1
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         throw v1
    */

    public fun shouldInterceptRequest(webView: android.webkit.WebView, url: String): android.webkit.WebResourceResponse { return TODO("body: (Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;") }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v1, Ljava/io/File;
    //         invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "mraid.js"
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/gw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         instance-of v1, p1, Lcom/google/android/gms/internal/gv;
    //         if-nez v1, :cond_1
    //         const-string v1, "Tried to intercept request from a WebView that wasn\'t an AdWebView."
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/gw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_1
    //         move-object v0, p1
    //         check-cast v0, Lcom/google/android/gms/internal/gv;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gw;->bX()V
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v2
    //         iget-boolean v2, v2, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-eqz v2, :cond_2
    //         const-string v2, "shouldInterceptRequest(https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js)"
    //         invoke-static {v2}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gy;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v2
    //         iget-object v2, v2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         const-string v3, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js"
    //         invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/gy;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->dy()Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         const-string v2, "shouldInterceptRequest(https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js)"
    //         invoke-static {v2}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gy;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v2
    //         iget-object v2, v2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         const-string v3, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js"
    //         invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/gy;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_3
    //         const-string v2, "shouldInterceptRequest(https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js)"
    //         invoke-static {v2}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gy;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v2
    //         iget-object v2, v2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         const-string v3, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js"
    //         invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/gy;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Could not fetch MRAID JS. "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/gw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //         move-result-object v1
    //         goto/16 :goto_0
    */

}
