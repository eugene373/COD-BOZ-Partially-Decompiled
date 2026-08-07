package com.facebook.internal

// Auto-emitted from smali source: UrlRedirectCache.java.
// 3 fields, 5 methods.

open class UrlRedirectCache {
    constructor()

    companion object {
    private val REDIRECT_CONTENT_TAG: String = null!!
    val TAG: String = null!!
    private var urlRedirectCache: com.facebook.internal.FileLruCache

    @JvmStatic fun cacheUriRedirect(p0: android.content.Context, p1: java.net.URI, p2: java.net.URI) { /* TODO(body): (Landroid/content/Context;Ljava/net/URI;Ljava/net/URI;)V */ }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_0
    //         if-nez p2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-static {p0}, Lcom/facebook/internal/UrlRedirectCache;->getCache(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //         move-result-object v1
    //         invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         sget-object v3, Lcom/facebook/internal/UrlRedirectCache;->REDIRECT_CONTENT_TAG:Ljava/lang/String;
    //         invoke-virtual {v1, v2, v3}, Lcom/facebook/internal/FileLruCache;->openPutStream(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         :try_start_1
    //         invoke-virtual {p2}, Ljava/net/URI;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         move-object v4, v1
    //         move-object v1, v0
    //         move-object v0, v4
    //         :goto_1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :catchall_1
    //         move-exception v1
    //         move-object v4, v1
    //         move-object v1, v0
    //         move-object v0, v4
    //         goto :goto_1
    */

    @JvmStatic fun clearCache(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 6
    //         :try_start_0
    //         invoke-static {p0}, Lcom/facebook/internal/UrlRedirectCache;->getCache(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
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
    //         sget-object v3, Lcom/facebook/internal/UrlRedirectCache;->TAG:Ljava/lang/String;
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

    @JvmStatic fun getRedirectedUri(p0: android.content.Context, p1: java.net.URI): java.net.URI { return TODO("body: (Landroid/content/Context;Ljava/net/URI;)Ljava/net/URI;") }
    /*
    //         .locals 9
    //         const/4 v0, 0x0
    //         const/4 v1, 0x0
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         :try_start_0
    //         invoke-static {p0}, Lcom/facebook/internal/UrlRedirectCache;->getCache(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //         :try_end_0
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_4
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v4
    //         move-object v3, v2
    //         move-object v2, v0
    //         :goto_1
    //         :try_start_1
    //         sget-object v5, Lcom/facebook/internal/UrlRedirectCache;->REDIRECT_CONTENT_TAG:Ljava/lang/String;
    //         invoke-virtual {v4, v3, v5}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //         move-result-object v5
    //         if-eqz v5, :cond_2
    //         const/4 v3, 0x1
    //         new-instance v1, Ljava/io/InputStreamReader;
    //         invoke-direct {v1, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    //         :try_end_1
    //         .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_5
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_2
    //         const/16 v2, 0x80
    //         :try_start_2
    //         new-array v2, v2, [C
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         :goto_2
    //         const/4 v6, 0x0
    //         array-length v7, v2
    //         invoke-virtual {v1, v2, v6, v7}, Ljava/io/InputStreamReader;->read([CII)I
    //         move-result v6
    //         if-lez v6, :cond_1
    //         const/4 v7, 0x0
    //         invoke-virtual {v5, v2, v7, v6}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    //         :try_end_2
    //         .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         goto :goto_2
    //         :catch_0
    //         move-exception v2
    //         :goto_3
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :cond_1
    //         :try_start_3
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         :try_end_3
    //         .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         move-result-object v2
    //         move v8, v3
    //         move-object v3, v2
    //         move-object v2, v1
    //         move v1, v8
    //         goto :goto_1
    //         :cond_2
    //         if-eqz v1, :cond_3
    //         :try_start_4
    //         new-instance v1, Ljava/net/URI;
    //         invoke-direct {v1, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    //         :try_end_4
    //         .catch Ljava/net/URISyntaxException; {:try_start_4 .. :try_end_4} :catch_5
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_2
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         move-object v1, v0
    //         :goto_4
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         move-object v8, v1
    //         move-object v1, v0
    //         move-object v0, v8
    //         :goto_5
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_5
    //         :catchall_2
    //         move-exception v0
    //         move-object v1, v2
    //         goto :goto_5
    //         :catch_2
    //         move-exception v2
    //         goto :goto_4
    //         :catch_3
    //         move-exception v1
    //         move-object v1, v2
    //         goto :goto_4
    //         :catch_4
    //         move-exception v1
    //         move-object v1, v0
    //         goto :goto_3
    //         :catch_5
    //         move-exception v1
    //         move-object v1, v2
    //         goto :goto_3
    */

    }
}
