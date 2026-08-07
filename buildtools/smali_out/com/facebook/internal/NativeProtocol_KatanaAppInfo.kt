package com.facebook.internal

// Auto-emitted from smali source: NativeProtocol.java.
// 1 fields, 3 methods.

open class NativeProtocol_KatanaAppInfo: com.facebook.internal.NativeProtocol.NativeAppInfo() {
    private constructor()

    constructor(p0: com.facebook.internal.NativeProtocol.1)

    protected fun getPackage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.facebook.katana"
    //         return-object v0
    */

    companion object {
    val KATANA_PACKAGE: String = "com.facebook.katana"
    }
}
