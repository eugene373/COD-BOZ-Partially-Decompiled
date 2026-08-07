package com.facebook.internal

// Auto-emitted from smali source: ImageDownloader.java.
// 4 fields, 3 methods.

open class ImageDownloader_RequestKey {
    var tag: Object
    var uri: java.net.URI

    constructor(p0: java.net.URI, p1: Object)

    public fun equals(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_0
    //         instance-of v1, p1, Lcom/facebook/internal/ImageDownloader$RequestKey;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/facebook/internal/ImageDownloader$RequestKey;
    //         iget-object v1, p1, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;
    //         iget-object v2, p0, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p1, Lcom/facebook/internal/ImageDownloader$RequestKey;->tag:Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/facebook/internal/ImageDownloader$RequestKey;->tag:Ljava/lang/Object;
    //         if-ne v1, v2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/internal/ImageDownloader$RequestKey;->uri:Ljava/net/URI;
    //         invoke-virtual {v0}, Ljava/net/URI;->hashCode()I
    //         move-result v0
    //         add-int/lit16 v0, v0, 0x431
    //         mul-int/lit8 v0, v0, 0x25
    //         iget-object v1, p0, Lcom/facebook/internal/ImageDownloader$RequestKey;->tag:Ljava/lang/Object;
    //         invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         return v0
    */

    companion object {
    private val HASH_MULTIPLIER: Int = 0x25
    private val HASH_SEED: Int = 0x1d
    }
}
