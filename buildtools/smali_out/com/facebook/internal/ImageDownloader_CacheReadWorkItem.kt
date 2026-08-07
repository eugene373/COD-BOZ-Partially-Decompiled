package com.facebook.internal

// Auto-emitted from smali source: ImageDownloader.java.
// 3 fields, 2 methods.

open class ImageDownloader_CacheReadWorkItem: Runnable {
    private var allowCachedRedirects: Boolean
    private var context: android.content.Context
    private var key: com.facebook.internal.ImageDownloader.RequestKey

    constructor(p0: android.content.Context, p1: com.facebook.internal.ImageDownloader.RequestKey, p2: Boolean)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;->key:Lcom/facebook/internal/ImageDownloader$RequestKey;
    //         iget-object v1, p0, Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;->context:Landroid/content/Context;
    //         iget-boolean v2, p0, Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;->allowCachedRedirects:Z
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/ImageDownloader;->access$100(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;Z)V
    //         return-void
    */

}
