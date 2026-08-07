package com.facebook.internal

// Auto-emitted from smali source: ImageRequest.java.
// 5 fields, 10 methods.

open class ImageRequest_Builder {
    private var allowCachedRedirects: Boolean
    private var callback: com.facebook.internal.ImageRequest.Callback
    private var callerTag: Object
    private var context: android.content.Context
    private var imageUrl: java.net.URI

    public constructor(p0: android.content.Context, p1: java.net.URI)

    public fun build(): com.facebook.internal.ImageRequest { return TODO("body: ()Lcom/facebook/internal/ImageRequest;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/internal/ImageRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/internal/ImageRequest;-><init>(Lcom/facebook/internal/ImageRequest$Builder;Lcom/facebook/internal/ImageRequest$1;)V
    //         return-object v0
    */

    public fun setAllowCachedRedirects(p0: Boolean): com.facebook.internal.ImageRequest.Builder { return TODO("body: (Z)Lcom/facebook/internal/ImageRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/internal/ImageRequest$Builder;->allowCachedRedirects:Z
    //         return-object p0
    */

    public fun setCallback(p0: com.facebook.internal.ImageRequest.Callback): com.facebook.internal.ImageRequest.Builder { return TODO("body: (Lcom/facebook/internal/ImageRequest$Callback;)Lcom/facebook/internal/ImageRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/internal/ImageRequest$Builder;->callback:Lcom/facebook/internal/ImageRequest$Callback;
    //         return-object p0
    */

    public fun setCallerTag(p0: Object): com.facebook.internal.ImageRequest.Builder { return TODO("body: (Ljava/lang/Object;)Lcom/facebook/internal/ImageRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/internal/ImageRequest$Builder;->callerTag:Ljava/lang/Object;
    //         return-object p0
    */

}
