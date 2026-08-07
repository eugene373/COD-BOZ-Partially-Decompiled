// Auto-emitted from smali source: s3eFacebook.java.
// 14 fields, 16 methods.

open class s3eFacebook_s3eFBRequest {
    var m_Complete: Boolean
    var m_ErrorCode: Int
    var m_ErrorString: String
    var m_Graph: String
    var m_HttpMethod: String
    var m_Method: String
    var m_Params: android.os.Bundle
    var m_Request: com.facebook.Request
    var m_Response: org.json.JSONObject
    var m_ResponseString: String
    var m_ResponseType: Int
    var m_URL: String
    var m_s3eSession: s3eFacebook.s3eFBSession
    val this$0: s3eFacebook

    constructor(p0: s3eFacebook, p1: s3eFacebook.s3eFBSession)

    fun AddParamLong(p0: String, p1: Long) { /* TODO(body): (Ljava/lang/String;J)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;
    //         invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    fun AddParamString(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    fun GetComplete(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Ls3eFacebook$s3eFBRequest;->m_Complete:Z
    //         return v0
    */

    fun GetError(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun GetErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I
    //         return v0
    */

    fun GetErrorString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_ErrorString:Ljava/lang/String;
    //         return-object v0
    */

    fun GetResponseAsNumber(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun GetResponseAsString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_ResponseString:Ljava/lang/String;
    //         return-object v0
    */

    fun GetResponseDictionaryItemAsString(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         :try_start_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;
    //         invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun GetResponseType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Ls3eFacebook$s3eFBRequest;->m_ResponseType:I
    //         return v0
    */

    fun ResponseDictionaryContainsItem(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         :try_start_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;
    //         invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun Send(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         new-instance v5, Ls3eFacebook$s3eFBRequest$1;
    //         invoke-direct {v5, p0}, Ls3eFacebook$s3eFBRequest$1;-><init>(Ls3eFacebook$s3eFBRequest;)V
    //         :try_start_0
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/HttpMethod;->valueOf(Ljava/lang/String;)Lcom/facebook/HttpMethod;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v4
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_URL:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "Calling request with url and http method"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/facebook/Request;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_s3eSession:Ls3eFacebook$s3eFBSession;
    //         iget-object v1, v1, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         iget-object v2, p0, Ls3eFacebook$s3eFBRequest;->m_URL:Ljava/lang/String;
    //         iget-object v3, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         iput-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Request:Lcom/facebook/Request;
    //         :goto_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Request:Lcom/facebook/Request;
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         const/4 v0, 0x0
    //         :goto_1
    //         return v0
    //         :catch_0
    //         move-exception v1
    //         const-string v1, "s3eFacebook"
    //         const-string v2, "Illegal http method."
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    //         :cond_0
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_Method:Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         const-string v1, "s3eFacebook"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Calling request with method: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Ls3eFacebook$s3eFBRequest;->m_Method:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v1, "s3eFacebook"
    //         const-string v2, "Request.newRestRequest no longer supported - return error"
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    //         :cond_1
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Calling request with graph: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Ls3eFacebook$s3eFBRequest;->m_Graph:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/facebook/Request;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest;->m_s3eSession:Ls3eFacebook$s3eFBSession;
    //         iget-object v1, v1, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         iget-object v2, p0, Ls3eFacebook$s3eFBRequest;->m_Graph:Ljava/lang/String;
    //         iget-object v3, p0, Ls3eFacebook$s3eFBRequest;->m_Params:Landroid/os/Bundle;
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         iput-object v0, p0, Ls3eFacebook$s3eFBRequest;->m_Request:Lcom/facebook/Request;
    //         goto :goto_0
    */

    fun SetGraph(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->m_Graph:Ljava/lang/String;
    //         iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;
    //         return-void
    */

    fun SetMethod(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->m_Method:Ljava/lang/String;
    //         iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;
    //         return-void
    */

    fun SetURL(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Ls3eFacebook$s3eFBRequest;->m_URL:Ljava/lang/String;
    //         iput-object p2, p0, Ls3eFacebook$s3eFBRequest;->m_HttpMethod:Ljava/lang/String;
    //         return-void
    */

}
