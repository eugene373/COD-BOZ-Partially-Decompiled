package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 5 fields, 2 methods.

open class AuthorizationClient_Anon5: com.facebook.RequestBatch.Callback {
    val this$0: com.facebook.AuthorizationClient
    val val$declinedPermissions: java.util.ArrayList
    val val$fbids: java.util.ArrayList
    val val$grantedPermissions: java.util.ArrayList
    val val$pendingResult: com.facebook.AuthorizationClient.Result

    constructor(p0: com.facebook.AuthorizationClient, p1: java.util.ArrayList, p2: com.facebook.AuthorizationClient.Result, p3: java.util.ArrayList, p4: java.util.ArrayList)

    public fun onBatchCompleted(p0: com.facebook.RequestBatch) { /* TODO(body): (Lcom/facebook/RequestBatch;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->val$fbids:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->val$fbids:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->val$fbids:Ljava/util/ArrayList;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->val$fbids:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$5;->val$fbids:Ljava/util/ArrayList;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->val$pendingResult:Lcom/facebook/AuthorizationClient$Result;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient$Result;->token:Lcom/facebook/AccessToken;
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$5;->val$grantedPermissions:Ljava/util/ArrayList;
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient$5;->val$declinedPermissions:Ljava/util/ArrayList;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/AccessToken;->createFromTokenWithRefreshedPermissions(Lcom/facebook/AccessToken;Ljava/util/List;Ljava/util/List;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v1, v1, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         invoke-static {v1, v0}, Lcom/facebook/AuthorizationClient$Result;->createTokenResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AccessToken;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         :goto_0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-virtual {v1, v0}, Lcom/facebook/AuthorizationClient;->complete(Lcom/facebook/AuthorizationClient$Result;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->access$000(Lcom/facebook/AuthorizationClient;)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v0, v0, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v1, "User logged in as different Facebook user."
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :try_start_2
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v2, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         iget-object v2, v2, Lcom/facebook/AuthorizationClient;->pendingRequest:Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //         const-string v3, "Caught exception"
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v3, v0}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Lcom/facebook/AuthorizationClient;->complete(Lcom/facebook/AuthorizationClient$Result;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-static {v0}, Lcom/facebook/AuthorizationClient;->access$000(Lcom/facebook/AuthorizationClient;)V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$5;->this$0:Lcom/facebook/AuthorizationClient;
    //         invoke-static {v1}, Lcom/facebook/AuthorizationClient;->access$000(Lcom/facebook/AuthorizationClient;)V
    //         throw v0
    */

}
