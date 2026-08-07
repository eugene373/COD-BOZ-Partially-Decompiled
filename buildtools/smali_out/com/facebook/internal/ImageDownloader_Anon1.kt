package com.facebook.internal

// Auto-emitted from smali source: ImageDownloader.java.
// 5 fields, 2 methods.

class ImageDownloader_Anon1: Runnable {
    val val$bitmap: android.graphics.Bitmap
    val val$callback: com.facebook.internal.ImageRequest.Callback
    val val$error: Exception
    val val$isCachedRedirect: Boolean
    val val$request: com.facebook.internal.ImageRequest

    constructor(p0: com.facebook.internal.ImageRequest, p1: Exception, p2: Boolean, p3: android.graphics.Bitmap, p4: com.facebook.internal.ImageRequest.Callback)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         new-instance v0, Lcom/facebook/internal/ImageResponse;
    //         iget-object v1, p0, Lcom/facebook/internal/ImageDownloader$1;->val$request:Lcom/facebook/internal/ImageRequest;
    //         iget-object v2, p0, Lcom/facebook/internal/ImageDownloader$1;->val$error:Ljava/lang/Exception;
    //         iget-boolean v3, p0, Lcom/facebook/internal/ImageDownloader$1;->val$isCachedRedirect:Z
    //         iget-object v4, p0, Lcom/facebook/internal/ImageDownloader$1;->val$bitmap:Landroid/graphics/Bitmap;
    //         invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/internal/ImageResponse;-><init>(Lcom/facebook/internal/ImageRequest;Ljava/lang/Exception;ZLandroid/graphics/Bitmap;)V
    //         iget-object v1, p0, Lcom/facebook/internal/ImageDownloader$1;->val$callback:Lcom/facebook/internal/ImageRequest$Callback;
    //         invoke-interface {v1, v0}, Lcom/facebook/internal/ImageRequest$Callback;->onCompleted(Lcom/facebook/internal/ImageResponse;)V
    //         return-void
    */

}
