package com.facebook.internal

// Auto-emitted from smali source: ImageResponse.java.
// 4 fields, 5 methods.

open class ImageResponse {
    private var bitmap: android.graphics.Bitmap
    private var error: Exception
    private var isCachedRedirect: Boolean
    private var request: com.facebook.internal.ImageRequest

    constructor(p0: com.facebook.internal.ImageRequest, p1: Exception, p2: Boolean, p3: android.graphics.Bitmap)

    public fun getBitmap(): android.graphics.Bitmap { return TODO("body: ()Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageResponse;->bitmap:Landroid/graphics/Bitmap;
    //         return-object v0
    */

    public fun getError(): Exception { return TODO("body: ()Ljava/lang/Exception;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageResponse;->error:Ljava/lang/Exception;
    //         return-object v0
    */

    public fun getRequest(): com.facebook.internal.ImageRequest { return TODO("body: ()Lcom/facebook/internal/ImageRequest;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageResponse;->request:Lcom/facebook/internal/ImageRequest;
    //         return-object v0
    */

    public fun isCachedRedirect(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/ImageResponse;->isCachedRedirect:Z
    //         return v0
    */

}
