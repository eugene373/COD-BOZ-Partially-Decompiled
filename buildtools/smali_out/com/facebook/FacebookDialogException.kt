package com.facebook

// Auto-emitted from smali source: FacebookDialogException.java.
// 3 fields, 3 methods.

open class FacebookDialogException: com.facebook.FacebookException() {
    private var errorCode: Int
    private var failingUrl: String

    public constructor(p0: String, p1: Int, p2: String)

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/FacebookDialogException;->errorCode:I
    //         return v0
    */

    public fun getFailingUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/FacebookDialogException;->failingUrl:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    val serialVersionUID: Long = 0x1L
    }
}
