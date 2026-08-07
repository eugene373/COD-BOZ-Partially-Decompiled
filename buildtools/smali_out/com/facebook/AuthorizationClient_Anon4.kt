package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 3 fields, 2 methods.

open class AuthorizationClient_Anon4: com.facebook.Request.Callback {
    val this$0: com.facebook.AuthorizationClient
    val val$declinedPermissions: java.util.ArrayList
    val val$grantedPermissions: java.util.ArrayList

    constructor(p0: com.facebook.AuthorizationClient, p1: java.util.ArrayList, p2: java.util.ArrayList)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         invoke-static {p1}, Lcom/facebook/Session;->handlePermissionResponse(Lcom/facebook/Response;)Lcom/facebook/Session$PermissionsPair;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$4;->val$grantedPermissions:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Lcom/facebook/Session$PermissionsPair;->getGrantedPermissions()Ljava/util/List;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$4;->val$declinedPermissions:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Lcom/facebook/Session$PermissionsPair;->getDeclinedPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
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
