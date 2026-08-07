package com.facebook.internal

// Auto-emitted from smali source: ImageRequest.java.
// 11 fields, 8 methods.

open class ImageRequest {
    private var allowCachedRedirects: Boolean
    private var callback: com.facebook.internal.ImageRequest.Callback
    private var callerTag: Object
    private var context: android.content.Context
    private var imageUri: java.net.URI

    private constructor(p0: com.facebook.internal.ImageRequest.Builder)

    constructor(p0: com.facebook.internal.ImageRequest.Builder, p1: com.facebook.internal.ImageRequest.1)

    public fun getCallback(): com.facebook.internal.ImageRequest.Callback { return TODO("body: ()Lcom/facebook/internal/ImageRequest$Callback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->callback:Lcom/facebook/internal/ImageRequest$Callback;
    //         return-object v0
    */

    public fun getCallerTag(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->callerTag:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->context:Landroid/content/Context;
    //         return-object v0
    */

    public fun getImageUri(): java.net.URI { return TODO("body: ()Ljava/net/URI;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/ImageRequest;->imageUri:Ljava/net/URI;
    //         return-object v0
    */

    public fun isCachedRedirectAllowed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/ImageRequest;->allowCachedRedirects:Z
    //         return v0
    */

    companion object {
    private val HEIGHT_PARAM: String = "height"
    private val MIGRATION_PARAM: String = "migration_overrides"
    private val MIGRATION_VALUE: String = "{october_2012:true}"
    private val PROFILEPIC_URL_FORMAT: String = "https://graph.facebook.com/%s/picture"
    @JvmField public val UNSPECIFIED_DIMENSION: Int = 0x0
    private val WIDTH_PARAM: String = "width"

    public @JvmStatic fun getProfilePictureUrl(p0: String, p1: Int, p2: Int): java.net.URI { return TODO("body: (Ljava/lang/String;II)Ljava/net/URI;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/net/URISyntaxException;
    //             }
    //         .end annotation
    //         const/4 v5, 0x0
    //         const-string v0, "userId"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I
    //         move-result v1
    //         if-nez v0, :cond_0
    //         if-nez v1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Either width or height must be greater than 0"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v2, Landroid/net/Uri$Builder;
    //         invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V
    //         const-string v3, "https://graph.facebook.com/%s/picture"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         aput-object p0, v4, v5
    //         invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v2
    //         if-eqz v1, :cond_1
    //         const-string v3, "height"
    //         invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         :cond_1
    //         if-eqz v0, :cond_2
    //         const-string v1, "width"
    //         invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         :cond_2
    //         const-string v0, "migration_overrides"
    //         const-string v1, "{october_2012:true}"
    //         invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         new-instance v0, Ljava/net/URI;
    //         invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    //         return-object v0
    */

    }
}
