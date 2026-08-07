package com.facebook

// Auto-emitted from smali source: Session.java.
// 7 fields, 2 methods.

open class Session_SerializationProxyV1: java.io.Serializable {
    private val applicationId: String
    private val lastAttemptedTokenExtendDate: java.util.Date
    private val pendingAuthorizationRequest: com.facebook.Session.AuthorizationRequest
    private val shouldAutoPublish: Boolean
    private val state: com.facebook.SessionState
    private val tokenInfo: com.facebook.AccessToken

    constructor(p0: String, p1: com.facebook.SessionState, p2: com.facebook.AccessToken, p3: java.util.Date, p4: Boolean, p5: com.facebook.Session.AuthorizationRequest)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 8
    //         new-instance v0, Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/Session$SerializationProxyV1;->applicationId:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/Session$SerializationProxyV1;->state:Lcom/facebook/SessionState;
    //         iget-object v3, p0, Lcom/facebook/Session$SerializationProxyV1;->tokenInfo:Lcom/facebook/AccessToken;
    //         iget-object v4, p0, Lcom/facebook/Session$SerializationProxyV1;->lastAttemptedTokenExtendDate:Ljava/util/Date;
    //         iget-boolean v5, p0, Lcom/facebook/Session$SerializationProxyV1;->shouldAutoPublish:Z
    //         iget-object v6, p0, Lcom/facebook/Session$SerializationProxyV1;->pendingAuthorizationRequest:Lcom/facebook/Session$AuthorizationRequest;
    //         const/4 v7, 0x0
    //         invoke-direct/range {v0 .. v7}, Lcom/facebook/Session;-><init>(Ljava/lang/String;Lcom/facebook/SessionState;Lcom/facebook/AccessToken;Ljava/util/Date;ZLcom/facebook/Session$AuthorizationRequest;Lcom/facebook/Session$1;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0x6a59fe98cd935affL
    }
}
