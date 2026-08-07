package com.facebook

// Auto-emitted from smali source: Session.java.
// 3 fields, 4 methods.

class Session_Builder {
    private var applicationId: String
    private val context: android.content.Context
    private var tokenCachingStrategy: com.facebook.TokenCachingStrategy

    public constructor(p0: android.content.Context)

    public fun build(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/Session$Builder;->context:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/Session$Builder;->applicationId:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/facebook/Session$Builder;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         invoke-direct {v0, v1, v2, v3}, Lcom/facebook/Session;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/TokenCachingStrategy;)V
    //         return-object v0
    */

    public fun setApplicationId(p0: String): com.facebook.Session.Builder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/Session$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session$Builder;->applicationId:Ljava/lang/String;
    //         return-object p0
    */

    public fun setTokenCachingStrategy(p0: com.facebook.TokenCachingStrategy): com.facebook.Session.Builder { return TODO("body: (Lcom/facebook/TokenCachingStrategy;)Lcom/facebook/Session$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session$Builder;->tokenCachingStrategy:Lcom/facebook/TokenCachingStrategy;
    //         return-object p0
    */

}
