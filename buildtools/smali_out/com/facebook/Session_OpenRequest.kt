package com.facebook

// Auto-emitted from smali source: Session.java.
// 1 fields, 14 methods.

class Session_OpenRequest: com.facebook.Session.AuthorizationRequest() {
    public constructor(p0: android.app.Activity)

    public constructor(p0: android.support.v4.app.Fragment)

    public fun setCallback(p0: com.facebook.Session.StatusCallback): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setCallback(p0: com.facebook.Session.StatusCallback): com.facebook.Session.OpenRequest { return TODO("body: (Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience): com.facebook.Session.OpenRequest { return TODO("body: (Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$OpenRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior): com.facebook.Session.AuthorizationRequest { return TODO("body: (Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior): com.facebook.Session.OpenRequest { return TODO("body: (Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setPermissions(p0: java.util.List): com.facebook.Session.AuthorizationRequest { return TODO("body: (Ljava/util/List;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setPermissions(p0: Array<String>): com.facebook.Session.AuthorizationRequest { return TODO("body: ([Ljava/lang/String;)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setPermissions([Ljava/lang/String;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setPermissions(p0: java.util.List): com.facebook.Session.OpenRequest { return TODO("body: (Ljava/util/List;)Lcom/facebook/Session$OpenRequest;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/Session$OpenRequest;"
    //             }
    //         .end annotation
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setPermissions(p0: Array<String>): com.facebook.Session.OpenRequest { return TODO("body: ([Ljava/lang/String;)Lcom/facebook/Session$OpenRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setPermissions([Ljava/lang/String;)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    public fun setRequestCode(p0: Int): com.facebook.Session.AuthorizationRequest { return TODO("body: (I)Lcom/facebook/Session$AuthorizationRequest;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setRequestCode(p0: Int): com.facebook.Session.OpenRequest { return TODO("body: (I)Lcom/facebook/Session$OpenRequest;") }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setRequestCode(I)Lcom/facebook/Session$AuthorizationRequest;
    //         return-object p0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
