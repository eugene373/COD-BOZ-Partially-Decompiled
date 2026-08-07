package com.facebook.internal

// Auto-emitted from smali source: NativeProtocol.java.
// 1 fields, 3 methods.

open class NativeProtocol_MessengerAppInfo: com.facebook.internal.NativeProtocol.NativeAppInfo() {
    private constructor()

    constructor(p0: com.facebook.internal.NativeProtocol.1)

    protected fun getPackage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.facebook.orca"
    //         return-object v0
    */

    companion object {
    val MESSENGER_PACKAGE: String = "com.facebook.orca"
    }
}
