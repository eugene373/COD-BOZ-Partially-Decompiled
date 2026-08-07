package com.facebook.internal

// Auto-emitted from smali source: CacheableRequestBatch.java.
// 2 fields, 6 methods.

open class CacheableRequestBatch: com.facebook.RequestBatch() {
    private var cacheKey: String
    private var forceRoundTrip: Boolean

    public constructor()

    public constructor(p0: Array<com.facebook.Request>)

    public fun getCacheKeyOverride(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/CacheableRequestBatch;->cacheKey:Ljava/lang/String;
    //         return-object v0
    */

    public fun getForceRoundTrip(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/CacheableRequestBatch;->forceRoundTrip:Z
    //         return v0
    */

    public fun setCacheKeyOverride(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/internal/CacheableRequestBatch;->cacheKey:Ljava/lang/String;
    //         return-void
    */

    public fun setForceRoundTrip(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/internal/CacheableRequestBatch;->forceRoundTrip:Z
    //         return-void
    */

}
