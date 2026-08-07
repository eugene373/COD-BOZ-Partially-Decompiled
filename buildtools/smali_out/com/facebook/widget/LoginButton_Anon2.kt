package com.facebook.widget

// Auto-emitted from smali source: LoginButton.java.
// 2 fields, 2 methods.

open class LoginButton_Anon2: com.facebook.Request.GraphUserCallback {
    val this$0: com.facebook.widget.LoginButton
    val val$currentSession: com.facebook.Session

    constructor(p0: com.facebook.widget.LoginButton, p1: com.facebook.Session)

    public fun onCompleted(p0: com.facebook.model.GraphUser, p1: com.facebook.Response) { /* TODO(body): (Lcom/facebook/model/GraphUser;Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$2;->val$currentSession:Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$2;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$2;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0, p1}, Lcom/facebook/widget/LoginButton;->access$502(Lcom/facebook/widget/LoginButton;Lcom/facebook/model/GraphUser;)Lcom/facebook/model/GraphUser;
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$2;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$600(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$2;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$600(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton$2;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v1}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;->onUserInfoFetched(Lcom/facebook/model/GraphUser;)V
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$2;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/LoginButton;->handleError(Ljava/lang/Exception;)V
    //         :cond_1
    //         return-void
    */

}
