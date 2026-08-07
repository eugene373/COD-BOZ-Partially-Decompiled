package com.facebook

// Auto-emitted from smali source: Request.java.
// 1 fields, 2 methods.

class Request_Anon3: com.facebook.Request.Callback {
    val val$callback: com.facebook.Request.GraphPlaceListCallback

    constructor(p0: com.facebook.Request.GraphPlaceListCallback)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Request$3;->val$callback:Lcom/facebook/Request$GraphPlaceListCallback;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Request$3;->val$callback:Lcom/facebook/Request$GraphPlaceListCallback;
    //         const-class v1, Lcom/facebook/model/GraphPlace;
    //         invoke-static {p1, v1}, Lcom/facebook/Request;->access$000(Lcom/facebook/Response;Ljava/lang/Class;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1}, Lcom/facebook/Request$GraphPlaceListCallback;->onCompleted(Ljava/util/List;Lcom/facebook/Response;)V
    //         :cond_0
    //         return-void
    */

}
