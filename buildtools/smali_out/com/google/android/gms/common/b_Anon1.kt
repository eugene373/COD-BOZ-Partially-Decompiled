package com.google.android.gms.common

// Auto-emitted from smali.
// 0 fields, 3 methods.

class b_Anon1: java.util.Comparator {
    constructor()

    public fun c(p0: ByteArray, p1: ByteArray): Int { return TODO("body: ([B[B)I") }
    /*
    //         .locals 4
    //         array-length v0, p1
    //         array-length v1, p2
    //         invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v1, :cond_1
    //         aget-byte v2, p1, v0
    //         and-int/lit16 v2, v2, 0xff
    //         aget-byte v3, p2, v0
    //         and-int/lit16 v3, v3, 0xff
    //         if-eq v2, v3, :cond_0
    //         sub-int v0, v2, v3
    //         :goto_1
    //         return v0
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         array-length v0, p1
    //         array-length v1, p2
    //         sub-int/2addr v0, v1
    //         goto :goto_1
    */

    public fun compare(x0: Object, x1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, [B
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         check-cast p2, [B
    //         .end local p2    # "x1":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/b$1;->c([B[B)I
    //         move-result v0
    //         return v0
    */

}
