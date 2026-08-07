package com.facebook

// Auto-emitted from smali source: Session.java.
// 1 fields, 2 methods.

open class Session_Anon2: com.facebook.Request.Callback {
    val this$0: com.facebook.Session

    constructor(p0: com.facebook.Session)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 5
    //         invoke-static {p1}, Lcom/facebook/Session;->handlePermissionResponse(Lcom/facebook/Response;)Lcom/facebook/Session$PermissionsPair;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/Session$2;->this$0:Lcom/facebook/Session;
    //         invoke-static {v1}, Lcom/facebook/Session;->access$200(Lcom/facebook/Session;)Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lcom/facebook/Session$2;->this$0:Lcom/facebook/Session;
    //         iget-object v3, p0, Lcom/facebook/Session$2;->this$0:Lcom/facebook/Session;
    //         invoke-static {v3}, Lcom/facebook/Session;->access$300(Lcom/facebook/Session;)Lcom/facebook/AccessToken;
    //         move-result-object v3
    //         invoke-virtual {v0}, Lcom/facebook/Session$PermissionsPair;->getGrantedPermissions()Ljava/util/List;
    //         move-result-object v4
    //         invoke-virtual {v0}, Lcom/facebook/Session$PermissionsPair;->getDeclinedPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v3, v4, v0}, Lcom/facebook/AccessToken;->createFromTokenWithRefreshedPermissions(Lcom/facebook/AccessToken;Ljava/util/List;Ljava/util/List;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Lcom/facebook/Session;->access$302(Lcom/facebook/Session;Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;
    //         iget-object v0, p0, Lcom/facebook/Session$2;->this$0:Lcom/facebook/Session;
    //         iget-object v2, p0, Lcom/facebook/Session$2;->this$0:Lcom/facebook/Session;
    //         invoke-static {v2}, Lcom/facebook/Session;->access$400(Lcom/facebook/Session;)Lcom/facebook/SessionState;
    //         move-result-object v2
    //         sget-object v3, Lcom/facebook/SessionState;->OPENED_TOKEN_UPDATED:Lcom/facebook/SessionState;
    //         const/4 v4, 0x0
    //         invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         monitor-exit v1
    //         :cond_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
