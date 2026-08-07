package com.facebook

// Auto-emitted from smali source: Session.java.
// 8 fields, 3 methods.

open class Session_AuthorizationRequest_AuthRequestSerializationProxyV1: java.io.Serializable {
    private val applicationId: String
    private val defaultAudience: String
    private var isLegacy: Boolean
    private val loginBehavior: com.facebook.SessionLoginBehavior
    private val permissions: java.util.List
    private val requestCode: Int
    private val validateSameFbidAsToken: String

    private constructor(p0: com.facebook.SessionLoginBehavior, p1: Int, p2: java.util.List, p3: String, p4: Boolean, p5: String, p6: String)

    constructor(p0: com.facebook.SessionLoginBehavior, p1: Int, p2: java.util.List, p3: String, p4: Boolean, p5: String, p6: String, p7: com.facebook.Session.1)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 9
    //         new-instance v0, Lcom/facebook/Session$AuthorizationRequest;
    //         iget-object v1, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         iget v2, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->requestCode:I
    //         iget-object v3, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->permissions:Ljava/util/List;
    //         iget-object v4, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->defaultAudience:Ljava/lang/String;
    //         iget-boolean v5, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->isLegacy:Z
    //         iget-object v6, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->applicationId:Ljava/lang/String;
    //         iget-object v7, p0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;->validateSameFbidAsToken:Ljava/lang/String;
    //         const/4 v8, 0x0
    //         invoke-direct/range {v0 .. v8}, Lcom/facebook/Session$AuthorizationRequest;-><init>(Lcom/facebook/SessionLoginBehavior;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/Session$1;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0L
    }
}
