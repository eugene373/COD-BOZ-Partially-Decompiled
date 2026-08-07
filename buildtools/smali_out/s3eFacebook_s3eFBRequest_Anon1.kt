// Auto-emitted from smali source: s3eFacebook.java.
// 1 fields, 2 methods.

open class s3eFacebook_s3eFBRequest_Anon1: com.facebook.Request.Callback {
    val this$1: s3eFacebook.s3eFBRequest

    constructor(p0: s3eFacebook.s3eFBRequest)

    public fun onCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         const/4 v3, 0x0
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Request.Callback onCompleted:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iput-boolean v4, v0, Ls3eFacebook$s3eFBRequest;->m_Complete:Z
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getRawResponse()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseString:Ljava/lang/String;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iput v3, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseType:I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         const/4 v1, 0x0
    //         iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;
    //         :goto_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {v0, v1, v4}, Ls3eFacebook;->nativeRequestCallback(Ljava/lang/Object;Z)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v1
    //         invoke-interface {v1}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         const/4 v1, 0x3
    //         iput v1, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseType:I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iget-object v1, v1, Ls3eFacebook$s3eFBRequest;->m_Response:Lorg/json/JSONObject;
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ResponseString:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_1
    //         if-eqz p1, :cond_2
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorCode()I
    //         move-result v1
    //         iput v1, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorString:Ljava/lang/String;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeRequestCallback(Ljava/lang/Object;Z)V
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iput v4, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorCode:I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         const-string v1, "null response."
    //         iput-object v1, v0, Ls3eFacebook$s3eFBRequest;->m_ErrorString:Ljava/lang/String;
    //         iget-object v0, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         iget-object v0, v0, Ls3eFacebook$s3eFBRequest;->this$0:Ls3eFacebook;
    //         iget-object v1, p0, Ls3eFacebook$s3eFBRequest$1;->this$1:Ls3eFacebook$s3eFBRequest;
    //         invoke-virtual {v0, v1, v3}, Ls3eFacebook;->nativeRequestCallback(Ljava/lang/Object;Z)V
    //         goto :goto_1
    */

}
