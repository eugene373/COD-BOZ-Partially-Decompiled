package com.sec.android.iap.lib.vo

// Auto-emitted from smali source: ErrorVo.java.
// 3 fields, 7 methods.

open class ErrorVo {
    private var mErrorCode: Int
    private var mErrorString: String
    private var mExtraString: String

    public constructor()

    public fun dump(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, ""
    //         .local v0, "dump":Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const-string v2, "ErrorCode    : "
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ErrorString  : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ExtraString  : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getExtraString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/sec/android/iap/lib/vo/ErrorVo;->mErrorCode:I
    //         return v0
    */

    public fun getErrorString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/ErrorVo;->mErrorString:Ljava/lang/String;
    //         return-object v0
    */

    public fun getExtraString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/ErrorVo;->mExtraString:Ljava/lang/String;
    //         return-object v0
    */

    public fun setError(_errorCode: Int, _errorString: String) { /* TODO(body): (ILjava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/sec/android/iap/lib/vo/ErrorVo;->mErrorCode:I
    //         iput-object p2, p0, Lcom/sec/android/iap/lib/vo/ErrorVo;->mErrorString:Ljava/lang/String;
    //         return-void
    */

    public fun setExtraString(_extraString: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/ErrorVo;->mExtraString:Ljava/lang/String;
    //         return-void
    */

}
