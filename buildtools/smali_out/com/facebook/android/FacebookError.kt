package com.facebook.android

// Auto-emitted from smali source: FacebookError.java.
// 3 fields, 4 methods.

open class FacebookError: RuntimeException() {
    private var mErrorCode: Int
    private var mErrorType: String

    public constructor(p0: String)

    public constructor(p0: String, p1: String, p2: Int)

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I
    //         return v0
    */

    public fun getErrorType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/android/FacebookError;->mErrorType:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
