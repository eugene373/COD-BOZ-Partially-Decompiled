package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 7 fields, 5 methods.

open class AuthorizationClient_Result: java.io.Serializable {
    val code: com.facebook.AuthorizationClient.Result.Code
    val errorCode: String
    val errorMessage: String
    var loggingExtras: java.util.Map
    val request: com.facebook.AuthorizationClient.AuthorizationRequest
    val token: com.facebook.AccessToken

    private constructor(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: com.facebook.AuthorizationClient.Result.Code, p2: com.facebook.AccessToken, p3: String, p4: String)

    companion object {
    private val serialVersionUID: Long = 0x1L

    @JvmStatic fun createCancelResult(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: String): com.facebook.AuthorizationClient.Result { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         new-instance v0, Lcom/facebook/AuthorizationClient$Result;
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;
    //         move-object v1, p0
    //         move-object v4, p1
    //         move-object v5, v3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AuthorizationClient$Result;-><init>(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AuthorizationClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    @JvmStatic fun createErrorResult(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: String, p2: String): com.facebook.AuthorizationClient.Result { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1, p2, v0}, Lcom/facebook/AuthorizationClient$Result;->createErrorResult(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun createErrorResult(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: String, p2: String, p3: String): com.facebook.AuthorizationClient.Result { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result;") }
    /*
    //         .locals 6
    //         const-string v0, ": "
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/String;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         const/4 v2, 0x1
    //         aput-object p2, v1, v2
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->asListNoNulls([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v4
    //         new-instance v0, Lcom/facebook/AuthorizationClient$Result;
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;
    //         const/4 v3, 0x0
    //         move-object v1, p0
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AuthorizationClient$Result;-><init>(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AuthorizationClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    @JvmStatic fun createTokenResult(p0: com.facebook.AuthorizationClient.AuthorizationRequest, p1: com.facebook.AccessToken): com.facebook.AuthorizationClient.Result { return TODO("body: (Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AccessToken;)Lcom/facebook/AuthorizationClient$Result;") }
    /*
    //         .locals 6
    //         const/4 v4, 0x0
    //         new-instance v0, Lcom/facebook/AuthorizationClient$Result;
    //         sget-object v2, Lcom/facebook/AuthorizationClient$Result$Code;->SUCCESS:Lcom/facebook/AuthorizationClient$Result$Code;
    //         move-object v1, p0
    //         move-object v3, p1
    //         move-object v5, v4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AuthorizationClient$Result;-><init>(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Lcom/facebook/AuthorizationClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    }
}
