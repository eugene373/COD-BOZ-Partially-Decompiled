package com.facebook.widget

// Auto-emitted from smali source: LoginButton.java.
// 1 fields, 3 methods.

open class LoginButton_LoginButtonCallback: com.facebook.Session.StatusCallback {
    val this$0: com.facebook.widget.LoginButton

    private constructor(p0: com.facebook.widget.LoginButton)

    constructor(p0: com.facebook.widget.LoginButton, p1: com.facebook.widget.LoginButton.1)

    public fun call(p0: com.facebook.Session, p1: com.facebook.SessionState, p2: Exception) { /* TODO(body): (Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1700(Lcom/facebook/widget/LoginButton;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1800(Lcom/facebook/widget/LoginButton;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1900(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1900(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/Session$StatusCallback;
    //         move-result-object v0
    //         invoke-interface {v0, p1, p2, p3}, Lcom/facebook/Session$StatusCallback;->call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         if-eqz p3, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-virtual {v0, p3}, Lcom/facebook/widget/LoginButton;->handleError(Ljava/lang/Exception;)V
    //         goto :goto_0
    */

}
