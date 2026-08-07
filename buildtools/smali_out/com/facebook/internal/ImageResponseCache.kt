package com.facebook.internal

// Auto-emitted from smali source: ImageResponseCache.java.
// 2 fields, 6 methods.

open class ImageResponseCache {
    constructor()

    companion object {
    val TAG: String = null!!
    private var imageCache: com.facebook.internal.FileLruCache

    @JvmStatic fun clearCache(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 6
    //         :try_start_0
    //         invoke-static {p0}, Lcom/facebook/internal/ImageResponseCache;->getCache(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/internal/FileLruCache;->clearCache()V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         const/4 v2, 0x5
    //         sget-object v3, Lcom/facebook/internal/ImageResponseCache;->TAG:Ljava/lang/String;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "clearCache failed "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v2, v3, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    @JvmStatic fun getCachedImageStream(p0: java.net.URI, p1: android.content.Context): java.io.InputStream { return TODO("body: (Ljava/net/URI;Landroid/content/Context;)Ljava/io/InputStream;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         if-eqz p0, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/ImageResponseCache;->isCDNURL(Ljava/net/URI;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         invoke-static {p1}, Lcom/facebook/internal/ImageResponseCache;->getCache(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //         move-result-object v1
    //         invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;)Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         const/4 v3, 0x5
    //         sget-object v4, Lcom/facebook/internal/ImageResponseCache;->TAG:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v3, v4, v1}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    @JvmStatic fun interceptAndCacheImageStream(p0: android.content.Context, p1: java.net.HttpURLConnection): java.io.InputStream { return TODO("body: (Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v1
    //         const/16 v2, 0xc8
    //         if-ne v1, v2, :cond_0
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;
    //         move-result-object v1
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v0
    //         :try_start_0
    //         invoke-virtual {v1}, Ljava/net/URL;->toURI()Ljava/net/URI;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/facebook/internal/ImageResponseCache;->isCDNURL(Ljava/net/URI;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/ImageResponseCache;->getCache(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v3, Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;
    //         invoke-direct {v3, v0, p1}, Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;-><init>(Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V
    //         invoke-virtual {v2, v1, v3}, Lcom/facebook/internal/FileLruCache;->interceptAndPut(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         goto :goto_0
    */

    private @JvmStatic fun isCDNURL(p0: java.net.URI): Boolean { return TODO("body: (Ljava/net/URI;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         if-eqz p0, :cond_2
    //         invoke-virtual {p0}, Ljava/net/URI;->getHost()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "fbcdn.net"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const-string v2, "fbcdn"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const-string v2, "akamaihd.net"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
