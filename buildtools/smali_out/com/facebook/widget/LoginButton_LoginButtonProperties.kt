package com.facebook.widget

// Auto-emitted from smali source: LoginButton.java.
// 6 fields, 20 methods.

open class LoginButton_LoginButtonProperties {
    private var authorizationType: com.facebook.internal.SessionAuthorizationType
    private var defaultAudience: com.facebook.SessionDefaultAudience
    private var loginBehavior: com.facebook.SessionLoginBehavior
    private var onErrorListener: com.facebook.widget.LoginButton.OnErrorListener
    private var permissions: java.util.List
    private var sessionStatusCallback: com.facebook.Session.StatusCallback

    constructor()

    private fun validatePermissions(p0: java.util.List, p1: com.facebook.internal.SessionAuthorizationType, p2: com.facebook.Session): Boolean { return TODO("body: (Ljava/util/List;Lcom/facebook/internal/SessionAuthorizationType;Lcom/facebook/Session;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/internal/SessionAuthorizationType;",
    //                 "Lcom/facebook/Session;",
    //                 ")Z"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v0, p2}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Permissions for publish actions cannot be null or empty."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-eqz p3, :cond_1
    //         invoke-virtual {p3}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p3}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Utility;->isSubset(Ljava/util/Collection;Ljava/util/Collection;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-static {}, Lcom/facebook/widget/LoginButton;->access$000()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "Cannot set additional permissions when session is already open."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun clearPermissions() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/SessionAuthorizationType;
    //         return-void
    */

    public fun getDefaultAudience(): com.facebook.SessionDefaultAudience { return TODO("body: ()Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         return-object v0
    */

    public fun getLoginBehavior(): com.facebook.SessionLoginBehavior { return TODO("body: ()Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         return-object v0
    */

    public fun getOnErrorListener(): com.facebook.widget.LoginButton.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/LoginButton$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->onErrorListener:Lcom/facebook/widget/LoginButton$OnErrorListener;
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
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    //         return-object v0
    */

    public fun getSessionStatusCallback(): com.facebook.Session.StatusCallback { return TODO("body: ()Lcom/facebook/Session$StatusCallback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->sessionStatusCallback:Lcom/facebook/Session$StatusCallback;
    //         return-object v0
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience) { /* TODO(body): (Lcom/facebook/SessionDefaultAudience;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    //         return-void
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior) { /* TODO(body): (Lcom/facebook/SessionLoginBehavior;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.LoginButton.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/LoginButton$OnErrorListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->onErrorListener:Lcom/facebook/widget/LoginButton$OnErrorListener;
    //         return-void
    */

    public fun setPublishPermissions(p0: java.util.List, p1: com.facebook.Session) { /* TODO(body): (Ljava/util/List;Lcom/facebook/Session;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/Session;",
    //                 ")V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Cannot call setPublishPermissions after setReadPermissions has been called."
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-direct {p0, p1, v0, p2}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->validatePermissions(Ljava/util/List;Lcom/facebook/internal/SessionAuthorizationType;Lcom/facebook/Session;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/SessionAuthorizationType;
    //         :cond_1
    //         return-void
    */

    public fun setReadPermissions(p0: java.util.List, p1: com.facebook.Session) { /* TODO(body): (Ljava/util/List;Lcom/facebook/Session;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/Session;",
    //                 ")V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Cannot call setReadPermissions after setPublishPermissions has been called."
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-direct {p0, p1, v0, p2}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->validatePermissions(Ljava/util/List;Lcom/facebook/internal/SessionAuthorizationType;Lcom/facebook/Session;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/SessionAuthorizationType;
    //         :cond_1
    //         return-void
    */

    public fun setSessionStatusCallback(p0: com.facebook.Session.StatusCallback) { /* TODO(body): (Lcom/facebook/Session$StatusCallback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->sessionStatusCallback:Lcom/facebook/Session$StatusCallback;
    //         return-void
    */

}
