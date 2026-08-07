package com.facebook.widget

// Auto-emitted from smali source: UserSettingsFragment.java.
// 2 fields, 2 methods.

open class UserSettingsFragment_Anon1: com.facebook.Request.GraphUserCallback {
    val this$0: com.facebook.widget.UserSettingsFragment
    val val$currentSession: com.facebook.Session

    constructor(p0: com.facebook.widget.UserSettingsFragment, p1: com.facebook.Session)

    public fun onCompleted(p0: com.facebook.model.GraphUser, p1: com.facebook.Response) { /* TODO(body): (Lcom/facebook/model/GraphUser;Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment$1;->val$currentSession:Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/widget/UserSettingsFragment$1;->this$0:Lcom/facebook/widget/UserSettingsFragment;
    //         invoke-virtual {v1}, Lcom/facebook/widget/UserSettingsFragment;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment$1;->this$0:Lcom/facebook/widget/UserSettingsFragment;
    //         invoke-static {v0, p1}, Lcom/facebook/widget/UserSettingsFragment;->access$002(Lcom/facebook/widget/UserSettingsFragment;Lcom/facebook/model/GraphUser;)Lcom/facebook/model/GraphUser;
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment$1;->this$0:Lcom/facebook/widget/UserSettingsFragment;
    //         invoke-static {v0}, Lcom/facebook/widget/UserSettingsFragment;->access$100(Lcom/facebook/widget/UserSettingsFragment;)V
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/UserSettingsFragment$1;->this$0:Lcom/facebook/widget/UserSettingsFragment;
    //         invoke-static {v0}, Lcom/facebook/widget/UserSettingsFragment;->access$200(Lcom/facebook/widget/UserSettingsFragment;)Lcom/facebook/widget/LoginButton;
    //         move-result-object v0
    //         invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/LoginButton;->handleError(Ljava/lang/Exception;)V
    //         :cond_1
    //         return-void
    */

}
