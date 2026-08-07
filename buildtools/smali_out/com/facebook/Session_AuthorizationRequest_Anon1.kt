package com.facebook

// Auto-emitted from smali source: Session.java.
// 2 fields, 3 methods.

open class Session_AuthorizationRequest_Anon1: com.facebook.Session.StartActivityDelegate {
    val this$0: com.facebook.Session.AuthorizationRequest
    val val$activity: android.app.Activity

    constructor(p0: com.facebook.Session.AuthorizationRequest, p1: android.app.Activity)

    public fun getActivityContext(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest$1;->val$activity:Landroid/app/Activity;
    //         return-object v0
    */

    public fun startActivityForResult(p0: android.content.Intent, p1: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest$1;->val$activity:Landroid/app/Activity;
    //         invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         return-void
    */

}
