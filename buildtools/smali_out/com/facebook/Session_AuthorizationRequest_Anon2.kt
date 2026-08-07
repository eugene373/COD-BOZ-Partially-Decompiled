package com.facebook

// Auto-emitted from smali source: Session.java.
// 2 fields, 3 methods.

open class Session_AuthorizationRequest_Anon2: com.facebook.Session.StartActivityDelegate {
    val this$0: com.facebook.Session.AuthorizationRequest
    val val$fragment: android.support.v4.app.Fragment

    constructor(p0: com.facebook.Session.AuthorizationRequest, p1: android.support.v4.app.Fragment)

    public fun getActivityContext(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest$2;->val$fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         return-object v0
    */

    public fun startActivityForResult(p0: android.content.Intent, p1: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest$2;->val$fragment:Landroid/support/v4/app/Fragment;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    //         return-void
    */

}
