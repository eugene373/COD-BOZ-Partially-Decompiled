package com.facebook

// Auto-emitted from smali source: Request.java.
// 1 fields, 2 methods.

class Request_Anon1: com.facebook.Request.Callback {
    val val$callback: com.facebook.Request.GraphUserCallback

    constructor(p0: com.facebook.Request.GraphUserCallback)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Request$1;->val$callback:Lcom/facebook/Request$GraphUserCallback;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/Request$1;->val$callback:Lcom/facebook/Request$GraphUserCallback;
    //         const-class v0, Lcom/facebook/model/GraphUser;
    //         invoke-virtual {p1, v0}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphUser;
    //         invoke-interface {v1, v0, p1}, Lcom/facebook/Request$GraphUserCallback;->onCompleted(Lcom/facebook/model/GraphUser;Lcom/facebook/Response;)V
    //         :cond_0
    //         return-void
    */

}
