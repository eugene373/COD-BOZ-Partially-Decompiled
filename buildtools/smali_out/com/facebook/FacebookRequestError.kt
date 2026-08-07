package com.facebook

// Auto-emitted from smali source: FacebookRequestError.java.
// 48 fields, 23 methods.

class FacebookRequestError {
    private val batchRequestResult: Object
    private val category: com.facebook.FacebookRequestError.Category
    private val connection: java.net.HttpURLConnection
    private val errorCode: Int
    private val errorIsTransient: Boolean
    private val errorMessage: String
    private val errorType: String
    private val errorUserMessage: String
    private val errorUserTitle: String
    private val exception: com.facebook.FacebookException
    private val requestResult: org.json.JSONObject
    private val requestResultBody: org.json.JSONObject
    private val requestStatusCode: Int
    private val shouldNotifyUser: Boolean
    private val subErrorCode: Int
    private val userActionMessageId: Int

    private constructor(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Boolean, p8: org.json.JSONObject, p9: org.json.JSONObject, p10: Object, p11: java.net.HttpURLConnection)

    private constructor(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Boolean, p8: org.json.JSONObject, p9: org.json.JSONObject, p10: Object, p11: java.net.HttpURLConnection, p12: com.facebook.FacebookException)

    public constructor(p0: Int, p1: String, p2: String)

    constructor(p0: java.net.HttpURLConnection, p1: Exception)

    public fun getBatchRequestResult(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->batchRequestResult:Ljava/lang/Object;
    //         return-object v0
    */

    public fun getCategory(): com.facebook.FacebookRequestError.Category { return TODO("body: ()Lcom/facebook/FacebookRequestError$Category;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->category:Lcom/facebook/FacebookRequestError$Category;
    //         return-object v0
    */

    public fun getConnection(): java.net.HttpURLConnection { return TODO("body: ()Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->connection:Ljava/net/HttpURLConnection;
    //         return-object v0
    */

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/FacebookRequestError;->errorCode:I
    //         return v0
    */

    public fun getErrorIsTransient(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/FacebookRequestError;->errorIsTransient:Z
    //         return v0
    */

    public fun getErrorMessage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorMessage:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorMessage:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->exception:Lcom/facebook/FacebookException;
    //         invoke-virtual {v0}, Lcom/facebook/FacebookException;->getLocalizedMessage()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getErrorType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorType:Ljava/lang/String;
    //         return-object v0
    */

    public fun getErrorUserMessage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorUserMessage:Ljava/lang/String;
    //         return-object v0
    */

    public fun getErrorUserTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->errorUserTitle:Ljava/lang/String;
    //         return-object v0
    */

    public fun getException(): com.facebook.FacebookException { return TODO("body: ()Lcom/facebook/FacebookException;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->exception:Lcom/facebook/FacebookException;
    //         return-object v0
    */

    public fun getRequestResult(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->requestResult:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getRequestResultBody(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookRequestError;->requestResultBody:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getRequestStatusCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/FacebookRequestError;->requestStatusCode:I
    //         return v0
    */

    public fun getSubErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/FacebookRequestError;->subErrorCode:I
    //         return v0
    */

    public fun getUserActionMessageId(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/FacebookRequestError;->userActionMessageId:I
    //         return v0
    */

    public fun shouldNotifyUser(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/FacebookRequestError;->shouldNotifyUser:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const-string v1, "{HttpStatus: "
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         iget v1, p0, Lcom/facebook/FacebookRequestError;->requestStatusCode:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", errorCode: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/facebook/FacebookRequestError;->errorCode:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", errorType: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/FacebookRequestError;->errorType:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", errorMessage: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val BODY_KEY: String = "body"
    private val CODE_KEY: String = "code"
    private val EC_APP_NOT_INSTALLED: Int = 0x1ca
    private val EC_APP_TOO_MANY_CALLS: Int = 0x4
    private val EC_EXPIRED: Int = 0x1cf
    private val EC_INVALID_SESSION: Int = 0x66
    private val EC_INVALID_TOKEN: Int = 0xbe
    private val EC_PASSWORD_CHANGED: Int = 0x1cc
    private val EC_PERMISSION_DENIED: Int = 0xa
    private val EC_RANGE_PERMISSION: com.facebook.FacebookRequestError.Range = null!!
    private val EC_SERVICE_UNAVAILABLE: Int = 0x2
    private val EC_UNCONFIRMED_USER: Int = 0x1d0
    private val EC_UNKNOWN_ERROR: Int = 0x1
    private val EC_USER_CHECKPOINTED: Int = 0x1cb
    private val EC_USER_TOO_MANY_CALLS: Int = 0x11
    private val ERROR_CODE_FIELD_KEY: String = "code"
    private val ERROR_CODE_KEY: String = "error_code"
    private val ERROR_IS_TRANSIENT_KEY: String = "is_transient"
    private val ERROR_KEY: String = "error"
    private val ERROR_MESSAGE_FIELD_KEY: String = "message"
    private val ERROR_MSG_KEY: String = "error_msg"
    private val ERROR_REASON_KEY: String = "error_reason"
    private val ERROR_SUB_CODE_KEY: String = "error_subcode"
    private val ERROR_TYPE_FIELD_KEY: String = "type"
    private val ERROR_USER_MSG_KEY: String = "error_user_msg"
    private val ERROR_USER_TITLE_KEY: String = "error_user_title"
    private val HTTP_RANGE_CLIENT_ERROR: com.facebook.FacebookRequestError.Range = null!!
    private val HTTP_RANGE_SERVER_ERROR: com.facebook.FacebookRequestError.Range = null!!
    private val HTTP_RANGE_SUCCESS: com.facebook.FacebookRequestError.Range = null!!
    @JvmField public val INVALID_ERROR_CODE: Int = 0
    @JvmField public val INVALID_HTTP_STATUS_CODE: Int = 0
    private val INVALID_MESSAGE_ID: Int = 0

    @JvmStatic fun checkResponseAndCreateError(p0: org.json.JSONObject, p1: Object, p2: java.net.HttpURLConnection): com.facebook.FacebookRequestError { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;") }
    /*
    //         .locals 13
    //         :try_start_0
    //         const-string v0, "code"
    //         invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         const-string v0, "code"
    //         invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         const-string v0, "body"
    //         const-string v2, "FACEBOOK_NON_JSON_RESULT"
    //         invoke-static {p0, v0, v2}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v9
    //         if-eqz v9, :cond_3
    //         instance-of v0, v9, Lorg/json/JSONObject;
    //         if-eqz v0, :cond_3
    //         check-cast v9, Lorg/json/JSONObject;
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v7, 0x0
    //         const/4 v6, 0x0
    //         const/4 v8, 0x0
    //         const/4 v2, -0x1
    //         const/4 v3, -0x1
    //         const/4 v0, 0x0
    //         const-string v10, "error"
    //         invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v10
    //         if-eqz v10, :cond_1
    //         const-string v0, "error"
    //         const/4 v2, 0x0
    //         invoke-static {v9, v0, v2}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lorg/json/JSONObject;
    //         const-string v2, "type"
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         const-string v2, "message"
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         const-string v2, "code"
    //         const/4 v3, -0x1
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    //         move-result v2
    //         const-string v3, "error_subcode"
    //         const/4 v6, -0x1
    //         invoke-virtual {v0, v3, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    //         move-result v3
    //         const-string v6, "error_user_msg"
    //         const/4 v7, 0x0
    //         invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v7
    //         const-string v6, "error_user_title"
    //         const/4 v8, 0x0
    //         invoke-virtual {v0, v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         const-string v8, "is_transient"
    //         const/4 v10, 0x0
    //         invoke-virtual {v0, v8, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    //         move-result v8
    //         const/4 v0, 0x1
    //         :cond_0
    //         :goto_0
    //         if-eqz v0, :cond_3
    //         new-instance v0, Lcom/facebook/FacebookRequestError;
    //         move-object v10, p0
    //         move-object v11, p1
    //         move-object v12, p2
    //         invoke-direct/range {v0 .. v12}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         const-string v10, "error_code"
    //         invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v10
    //         if-nez v10, :cond_2
    //         const-string v10, "error_msg"
    //         invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v10
    //         if-nez v10, :cond_2
    //         const-string v10, "error_reason"
    //         invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v10
    //         if-eqz v10, :cond_0
    //         :cond_2
    //         const-string v0, "error_reason"
    //         const/4 v2, 0x0
    //         invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         const-string v0, "error_msg"
    //         const/4 v2, 0x0
    //         invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         const-string v0, "error_code"
    //         const/4 v2, -0x1
    //         invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    //         move-result v2
    //         const-string v0, "error_subcode"
    //         const/4 v3, -0x1
    //         invoke-virtual {v9, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    //         move-result v3
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_3
    //         sget-object v0, Lcom/facebook/FacebookRequestError;->HTTP_RANGE_SUCCESS:Lcom/facebook/FacebookRequestError$Range;
    //         invoke-virtual {v0, v1}, Lcom/facebook/FacebookRequestError$Range;->contains(I)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         new-instance v0, Lcom/facebook/FacebookRequestError;
    //         const/4 v2, -0x1
    //         const/4 v3, -0x1
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         const/4 v8, 0x0
    //         const-string v9, "body"
    //         invoke-virtual {p0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v9
    //         if-eqz v9, :cond_5
    //         const-string v9, "body"
    //         const-string v10, "FACEBOOK_NON_JSON_RESULT"
    //         invoke-static {p0, v9, v10}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v9
    //         check-cast v9, Lorg/json/JSONObject;
    //         :goto_2
    //         move-object v10, p0
    //         move-object v11, p1
    //         move-object v12, p2
    //         invoke-direct/range {v0 .. v12}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :cond_5
    //         const/4 v9, 0x0
    //         goto :goto_2
    */

    }
}
