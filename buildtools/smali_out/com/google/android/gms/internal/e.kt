package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

open class e: com.google.android.gms.internal.m {
    constructor()

    public fun a(p0: ByteArray, p1: Boolean): String { return TODO("body: ([BZ)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         if-eqz p2, :cond_0
    //         const/16 v0, 0xb
    //         :goto_0
    //         invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x2
    //         goto :goto_0
    */

    public fun a(p0: String, p1: Boolean): ByteArray { return TODO("body: (Ljava/lang/String;Z)[B") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         if-eqz p2, :cond_0
    //         const/16 v0, 0xb
    //         :goto_0
    //         invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x2
    //         goto :goto_0
    */

}
