package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 2 fields, 2 methods.

open class AuthorizationClient_Anon3: com.facebook.Request.Callback {
    val this$0: com.facebook.AuthorizationClient
    val val$fbids: java.util.ArrayList

    constructor(p0: com.facebook.AuthorizationClient, p1: java.util.ArrayList)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         const-class v0, Lcom/facebook/model/GraphUser;
    //         invoke-virtual {p1, v0}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphUser;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$3;->val$fbids:Ljava/util/ArrayList;
    //         invoke-interface {v0}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

}
