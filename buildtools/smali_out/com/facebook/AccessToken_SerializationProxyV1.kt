package com.facebook

// Auto-emitted from smali source: AccessToken.java.
// 6 fields, 2 methods.

open class AccessToken_SerializationProxyV1: java.io.Serializable {
    private val expires: java.util.Date
    private val lastRefresh: java.util.Date
    private val permissions: java.util.List
    private val source: com.facebook.AccessTokenSource
    private val token: String

    private constructor(p0: String, p1: java.util.Date, p2: java.util.List, p3: com.facebook.AccessTokenSource, p4: java.util.Date)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         iget-object v1, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->token:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->expires:Ljava/util/Date;
    //         iget-object v3, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->permissions:Ljava/util/List;
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->source:Lcom/facebook/AccessTokenSource;
    //         iget-object v6, p0, Lcom/facebook/AccessToken$SerializationProxyV1;->lastRefresh:Ljava/util/Date;
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0L
    }
}
