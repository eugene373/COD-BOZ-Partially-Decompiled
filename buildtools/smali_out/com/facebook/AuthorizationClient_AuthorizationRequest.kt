package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 11 fields, 15 methods.

open class AuthorizationClient_AuthorizationRequest: java.io.Serializable {
    private val applicationId: String
    private val authId: String
    private val defaultAudience: com.facebook.SessionDefaultAudience
    private var isLegacy: Boolean
    private var isRerequest: Boolean
    private val loginBehavior: com.facebook.SessionLoginBehavior
    private var permissions: java.util.List
    private val previousAccessToken: String
    private val requestCode: Int
    private val startActivityDelegate: com.facebook.AuthorizationClient.StartActivityDelegate

    constructor(p0: com.facebook.SessionLoginBehavior, p1: Int, p2: Boolean, p3: java.util.List, p4: com.facebook.SessionDefaultAudience, p5: String, p6: String, p7: com.facebook.AuthorizationClient.StartActivityDelegate, p8: String)

    fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->applicationId:Ljava/lang/String;
    //         return-object v0
    */

    fun getAuthId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->authId:Ljava/lang/String;
    //         return-object v0
    */

    fun getDefaultAudience(): com.facebook.SessionDefaultAudience { return TODO("body: ()Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         return-object v0
    */

    fun getLoginBehavior(): com.facebook.SessionLoginBehavior { return TODO("body: ()Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
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
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->permissions:Ljava/util/List;
    //         return-object v0
    */

    fun getPreviousAccessToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->previousAccessToken:Ljava/lang/String;
    //         return-object v0
    */

    fun getRequestCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->requestCode:I
    //         return v0
    */

    fun getStartActivityDelegate(): com.facebook.AuthorizationClient.StartActivityDelegate { return TODO("body: ()Lcom/facebook/AuthorizationClient$StartActivityDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->startActivityDelegate:Lcom/facebook/AuthorizationClient$StartActivityDelegate;
    //         return-object v0
    */

    fun isLegacy(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isLegacy:Z
    //         return v0
    */

    fun isRerequest(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isRerequest:Z
    //         return v0
    */

    fun needsNewTokenValidation(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->previousAccessToken:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isLegacy:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun setIsLegacy(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isLegacy:Z
    //         return-void
    */

    fun setPermissions(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->permissions:Ljava/util/List;
    //         return-void
    */

    fun setRerequest(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->isRerequest:Z
    //         return-void
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
