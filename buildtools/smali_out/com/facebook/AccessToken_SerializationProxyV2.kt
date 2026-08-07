package com.facebook

// Auto-emitted from smali source: AccessToken.java.
// 7 fields, 3 methods.

open class AccessToken_SerializationProxyV2: java.io.Serializable {
    private val declinedPermissions: java.util.List
    private val expires: java.util.Date
    private val lastRefresh: java.util.Date
    private val permissions: java.util.List
    private val source: com.facebook.AccessTokenSource
    private val token: String

    private constructor(p0: String, p1: java.util.Date, p2: java.util.List, p3: java.util.List, p4: com.facebook.AccessTokenSource, p5: java.util.Date)

    constructor(p0: String, p1: java.util.Date, p2: java.util.List, p3: java.util.List, p4: com.facebook.AccessTokenSource, p5: java.util.Date, p6: com.facebook.AccessToken.1)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         iget-object v1, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->token:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->expires:Ljava/util/Date;
    //         iget-object v3, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->permissions:Ljava/util/List;
    //         iget-object v4, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->declinedPermissions:Ljava/util/List;
    //         iget-object v5, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->source:Lcom/facebook/AccessTokenSource;
    //         iget-object v6, p0, Lcom/facebook/AccessToken$SerializationProxyV2;->lastRefresh:Ljava/util/Date;
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0L
    }
}
