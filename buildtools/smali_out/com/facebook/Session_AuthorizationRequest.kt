package com.facebook

// Auto-emitted from smali source: Session.java.
// 12 fields, 33 methods.

open class Session_AuthorizationRequest: java.io.Serializable {
    private var applicationId: String
    private val authId: String
    private var defaultAudience: com.facebook.SessionDefaultAudience
    private var isLegacy: Boolean
    private val loggingExtras: java.util.Map
    private var loginBehavior: com.facebook.SessionLoginBehavior
    private var permissions: java.util.List
    private var requestCode: Int
    private val startActivityDelegate: com.facebook.Session.StartActivityDelegate
    private var statusCallback: com.facebook.Session.StatusCallback
    private var validateSameFbidAsToken: String

    constructor(p0: android.app.Activity)

    constructor(p0: android.support.v4.app.Fragment)

    private constructor(p0: com.facebook.SessionLoginBehavior, p1: Int, p2: java.util.List, p3: String, p4: Boolean, p5: String, p6: String)

    constructor(p0: com.facebook.SessionLoginBehavior, p1: Int, p2: java.util.List, p3: String, p4: Boolean, p5: String, p6: String, p7: com.facebook.Session.1)

    private fun readObject(p0: java.io.ObjectInputStream) { /* TODO(body): (Ljava/io/ObjectInputStream;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/InvalidObjectException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/io/InvalidObjectException;
    //         const-string v1, "Cannot readObject, serialization proxy required"
    //         invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->applicationId:Ljava/lang/String;
    //         return-object v0
    */

    fun getAuthId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->authId:Ljava/lang/String;
    //         return-object v0
    */

    fun getAuthorizationClientRequest(): com.facebook.AuthorizationClient.AuthorizationRequest { return TODO("body: ()Lcom/facebook/AuthorizationClient$AuthorizationRequest;") }
    /*
    //         .locals 10
    //         new-instance v8, Lcom/facebook/Session$AuthorizationRequest$4;
    //         invoke-direct {v8, p0}, Lcom/facebook/Session$AuthorizationRequest$4;-><init>(Lcom/facebook/Session$AuthorizationRequest;)V
    //         new-instance v0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         iget-object v1, p0, Lcom/facebook/Session$AuthorizationRequest;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         iget v2, p0, Lcom/facebook/Session$AuthorizationRequest;->requestCode:I
    //         iget-boolean v3, p0, Lcom/facebook/Session$AuthorizationRequest;->isLegacy:Z
    //         iget-object v4, p0, Lcom/facebook/Session$AuthorizationRequest;->permissions:Ljava/util/List;
    //         iget-object v5, p0, Lcom/facebook/Session$AuthorizationRequest;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         iget-object v6, p0, Lcom/facebook/Session$AuthorizationRequest;->applicationId:Ljava/lang/String;
    //         iget-object v7, p0, Lcom/facebook/Session$AuthorizationRequest;->validateSameFbidAsToken:Ljava/lang/String;
    //         iget-object v9, p0, Lcom/facebook/Session$AuthorizationRequest;->authId:Ljava/lang/String;
    //         invoke-direct/range {v0 .. v9}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;-><init>(Lcom/facebook/SessionLoginBehavior;IZLjava/util/List;Lcom/facebook/SessionDefaultAudience;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AuthorizationClient$StartActivityDelegate;Ljava/lang/String;)V
    //         return-object v0
    */

    fun getCallback(): com.facebook.Session.StatusCallback { return TODO("body: ()Lcom/facebook/Session$StatusCallback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->statusCallback:Lcom/facebook/Session$StatusCallback;
    //         return-object v0
    */

    fun getDefaultAudience(): com.facebook.SessionDefaultAudience { return TODO("body: ()Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         return-object v0
    */

    fun getLoginBehavior(): com.facebook.SessionLoginBehavior { return TODO("body: ()Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         return-object v0
    */

    fun getPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->permissions:Ljava/util/List;
    //         return-object v0
    */

    fun getRequestCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/Session$AuthorizationRequest;->requestCode:I
    //         return v0
    */

    fun getStartActivityDelegate(): com.facebook.Session.StartActivityDelegate { return TODO("body: ()Lcom/facebook/Session$StartActivityDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->startActivityDelegate:Lcom/facebook/Session$StartActivityDelegate;
    //         return-object v0
    */

    fun getValidateSameFbidAsToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest;->validateSameFbidAsToken:Ljava/lang/String;
    //         return-object v0
    */

    fun isLegacy(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/Session$AuthorizationRequest;->isLegacy:Z
    //         return v0
    */

    fun setApplicationId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest;->applicationId:Ljava/lang/String;
    //         return-void
    */

    fun setCallback(p0: com.facebook.Session.StatusCallback): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest;->statusCallback:Lcom/facebook/Session$StatusCallback;
    //         return-object p0
    */

    fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 0
    //         if-eqz p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         :cond_0
    //         return-object p0
    */

    public fun setIsLegacy(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/Session$AuthorizationRequest;->isLegacy:Z
    //         return-void
    */

    fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 0
    //         if-eqz p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         :cond_0
    //         return-object p0
    */

    fun setPermissions(p0: java.util.List): com.facebook.Session.AuthorizationRequest { return TODO("body: (Ljava/util/List;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/Session$AuthorizationRequest;"
    //             }
    //         .end annotation
    //         if-eqz p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest;->permissions:Ljava/util/List;
    //         :cond_0
    //         return-object p0
    */

    fun setPermissions(p0: Array<String>): com.facebook.Session.AuthorizationRequest { return TODO("body: ([Ljava/lang/String;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/Session$AuthorizationRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$AuthorizationRequest;
    //         move-result-object v0
    //         return-object v0
    */

    fun setRequestCode(p0: Int): com.facebook.Session.AuthorizationRequest { return TODO("body: (I)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 0
    //         if-ltz p1, :cond_0
    //         iput p1, p0, Lcom/facebook/Session$AuthorizationRequest;->requestCode:I
    //         :cond_0
    //         return-object p0
    */

    fun setValidateSameFbidAsToken(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest;->validateSameFbidAsToken:Ljava/lang/String;
    //         return-void
    */

    fun writeReplace(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 9
    //         new-instance v0, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;
    //         iget-object v1, p0, Lcom/facebook/Session$AuthorizationRequest;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         iget v2, p0, Lcom/facebook/Session$AuthorizationRequest;->requestCode:I
    //         iget-object v3, p0, Lcom/facebook/Session$AuthorizationRequest;->permissions:Ljava/util/List;
    //         iget-object v4, p0, Lcom/facebook/Session$AuthorizationRequest;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         invoke-virtual {v4}, Lcom/facebook/SessionDefaultAudience;->name()Ljava/lang/String;
    //         move-result-object v4
    //         iget-boolean v5, p0, Lcom/facebook/Session$AuthorizationRequest;->isLegacy:Z
    //         iget-object v6, p0, Lcom/facebook/Session$AuthorizationRequest;->applicationId:Ljava/lang/String;
    //         iget-object v7, p0, Lcom/facebook/Session$AuthorizationRequest;->validateSameFbidAsToken:Ljava/lang/String;
    //         const/4 v8, 0x0
    //         invoke-direct/range {v0 .. v8}, Lcom/facebook/Session$AuthorizationRequest$AuthRequestSerializationProxyV1;-><init>(Lcom/facebook/SessionLoginBehavior;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/Session$1;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
