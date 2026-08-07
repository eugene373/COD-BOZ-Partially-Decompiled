package com.facebook.android

// Auto-emitted from smali source: DialogError.java.
// 3 fields, 3 methods.

open class DialogError: Throwable() {
    private var mErrorCode: Int
    private var mFailingUrl: String

    public constructor(p0: String, p1: Int, p2: String)

    public fun getErrorCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget v0, p0, Lcom/facebook/android/DialogError;->mErrorCode:I
    //         return v0
    */

    public fun getFailingUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/android/DialogError;->mFailingUrl:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
