package com.facebook

// Auto-emitted from smali source: Session.java.
// 1 fields, 2 methods.

open class Session_Anon3: com.facebook.AuthorizationClient.OnCompletedListener {
    val this$0: com.facebook.Session

    constructor(p0: com.facebook.Session)

    public fun onCompleted(p0: com.facebook.AuthorizationClient.Result) { /* TODO(body): (Lcom/facebook/AuthorizationClient$Result;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->code:Lcom/facebook/AuthorizationClient$Result$Code;
    //         sget-object v1, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget-object v1, p0, Lcom/facebook/Session$3;->this$0:Lcom/facebook/Session;
    //         invoke-static {v1, v0, p1}, Lcom/facebook/Session;->access$1100(Lcom/facebook/Session;ILcom/facebook/AuthorizationClient$Result;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

}
