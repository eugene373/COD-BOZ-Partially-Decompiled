package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 3 fields, 3 methods.

open class AppEventsLogger_AccessTokenAppIdPair_SerializationProxyV1: java.io.Serializable {
    private val accessToken: String
    private val appId: String

    private constructor(p0: String, p1: String)

    constructor(p0: String, p1: String, p2: com.facebook.AppEventsLogger.1)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->accessToken:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->appId:Ljava/lang/String;
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0L
    }
}
