package com.facebook.widget

// Auto-emitted from smali source: FacebookFragment.java.
// 1 fields, 20 methods.

open class FacebookFragment: android.support.v4.app.Fragment() {
    private var sessionTracker: com.facebook.internal.SessionTracker

    constructor()

    private fun openSession(p0: String, p1: java.util.List, p2: com.facebook.SessionLoginBehavior, p3: Int, p4: com.facebook.internal.SessionAuthorizationType) { /* TODO(body): (Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;ILcom/facebook/internal/SessionAuthorizationType;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/SessionLoginBehavior;",
    //                 "I",
    //                 "Lcom/facebook/internal/SessionAuthorizationType;",
    //                 ")V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/facebook/Session$Builder;
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v0, p1}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V
    //         :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         new-instance v1, Lcom/facebook/Session$OpenRequest;
    //         invoke-direct {v1, p0}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/support/v4/app/Fragment;)V
    //         invoke-virtual {v1, p2}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         invoke-virtual {v1, p4}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         sget-object v2, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v2, p5}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->openForPublish(Lcom/facebook/Session$OpenRequest;)V
    //         :cond_2
    //         :goto_0
    //         return-void
    //         :cond_3
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    //         goto :goto_0
    */

    protected fun closeSession() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->close()V
    //         :cond_0
    //         return-void
    */

    protected fun closeSessionAndClearTokenInformation() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->closeAndClearTokenInformation()V
    //         :cond_0
    //         return-void
    */

    protected fun getAccessToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    protected fun getExpirationDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getExpirationDate()Ljava/util/Date;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    protected fun getSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun getSessionPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    protected fun getSessionState(): com.facebook.SessionState { return TODO("body: ()Lcom/facebook/SessionState;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    protected fun isSessionOpen(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    public fun onActivityCreated(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
    //         new-instance v0, Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/widget/FacebookFragment$DefaultSessionStatusCallback;
    //         const/4 v3, 0x0
    //         invoke-direct {v2, p0, v3}, Lcom/facebook/widget/FacebookFragment$DefaultSessionStatusCallback;-><init>(Lcom/facebook/widget/FacebookFragment;Lcom/facebook/widget/FacebookFragment$1;)V
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/internal/SessionTracker;-><init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;)V
    //         iput-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         return-void
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->stopTracking()V
    //         return-void
    */

    protected fun onSessionStateChange(p0: com.facebook.SessionState, p1: Exception) { /* TODO(body): (Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun openSession() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0, v0}, Lcom/facebook/widget/FacebookFragment;->openSessionForRead(Ljava/lang/String;Ljava/util/List;)V
    //         return-void
    */

    protected fun openSessionForPublish(p0: String, p1: java.util.List) { /* TODO(body): (Ljava/lang/String;Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;
    //         const v1, 0xface
    //         invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/widget/FacebookFragment;->openSessionForPublish(Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;I)V
    //         return-void
    */

    protected fun openSessionForPublish(p0: String, p1: java.util.List, p2: com.facebook.SessionLoginBehavior, p3: Int) { /* TODO(body): (Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;I)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/SessionLoginBehavior;",
    //                 "I)V"
    //             }
    //         .end annotation
    //         sget-object v5, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move v4, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/FacebookFragment;->openSession(Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;ILcom/facebook/internal/SessionAuthorizationType;)V
    //         return-void
    */

    protected fun openSessionForRead(p0: String, p1: java.util.List) { /* TODO(body): (Ljava/lang/String;Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;
    //         const v1, 0xface
    //         invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/widget/FacebookFragment;->openSessionForRead(Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;I)V
    //         return-void
    */

    protected fun openSessionForRead(p0: String, p1: java.util.List, p2: com.facebook.SessionLoginBehavior, p3: Int) { /* TODO(body): (Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;I)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/SessionLoginBehavior;",
    //                 "I)V"
    //             }
    //         .end annotation
    //         sget-object v5, Lcom/facebook/internal/SessionAuthorizationType;->READ:Lcom/facebook/internal/SessionAuthorizationType;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move v4, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/FacebookFragment;->openSession(Ljava/lang/String;Ljava/util/List;Lcom/facebook/SessionLoginBehavior;ILcom/facebook/internal/SessionAuthorizationType;)V
    //         return-void
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookFragment;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V
    //         :cond_0
    //         return-void
    */

}
