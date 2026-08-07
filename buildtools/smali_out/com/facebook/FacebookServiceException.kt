package com.facebook

// Auto-emitted from smali source: FacebookServiceException.java.
// 2 fields, 3 methods.

open class FacebookServiceException: com.facebook.FacebookException() {
    private val error: com.facebook.FacebookRequestError

    public constructor(p0: com.facebook.FacebookRequestError, p1: String)

    public fun getRequestError(): com.facebook.FacebookRequestError { return TODO("body: ()Lcom/facebook/FacebookRequestError;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookServiceException;->error:Lcom/facebook/FacebookRequestError;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{FacebookServiceException: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "httpResponseCode: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/FacebookServiceException;->error:Lcom/facebook/FacebookRequestError;
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getRequestStatusCode()I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", facebookErrorCode: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/FacebookServiceException;->error:Lcom/facebook/FacebookRequestError;
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorCode()I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", facebookErrorType: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/FacebookServiceException;->error:Lcom/facebook/FacebookRequestError;
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorType()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", message: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/FacebookServiceException;->error:Lcom/facebook/FacebookRequestError;
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorMessage()Ljava/lang/String;
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
    private val serialVersionUID: Long = 0x1L
    }
}
