package com.facebook

// Auto-emitted from smali source: Session.java.
// 1 fields, 13 methods.

class Session_NewPermissionsRequest: com.facebook.Session.AuthorizationRequest() {
    public constructor(p0: android.app.Activity, p1: java.util.List)

    public constructor(p0: android.app.Activity, p1: Array<String>)

    public constructor(p0: android.support.v4.app.Fragment, p1: java.util.List)

    public constructor(p0: android.support.v4.app.Fragment, p1: Array<String>)

    fun getAuthorizationClientRequest(): com.facebook.AuthorizationClient.AuthorizationRequest { return TODO("body: ()Lcom/facebook/AuthorizationClient$AuthorizationRequest;") }
    /*
    //         .locals 2
    //         invoke-super {p0}, Lcom/facebook/Session$AuthorizationRequest;->getAuthorizationClientRequest()Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/facebook/AuthorizationClient$AuthorizationRequest;->setRerequest(Z)V
    //         return-object v0
    */

    public fun setCallback(p0: com.facebook.Session.StatusCallback): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$NewPermissionsRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$NewPermissionsRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setCallback(p0: com.facebook.Session.StatusCallback): com.facebook.Session.NewPermissionsRequest { return TODO("body: (Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$NewPermissionsRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$NewPermissionsRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$NewPermissionsRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience): com.facebook.Session.NewPermissionsRequest { return TODO("body: (Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$NewPermissionsRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$NewPermissionsRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$NewPermissionsRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior): com.facebook.Session.NewPermissionsRequest { return TODO("body: (Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$NewPermissionsRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setRequestCode(p0: Int): com.facebook.Session.AuthorizationRequest { return TODO("body: (I)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$NewPermissionsRequest;->setRequestCode(I)Lcom/facebook/Session$NewPermissionsRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setRequestCode(p0: Int): com.facebook.Session.NewPermissionsRequest { return TODO("body: (I)Lcom/facebook/Session$NewPermissionsRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setRequestCode(I)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
