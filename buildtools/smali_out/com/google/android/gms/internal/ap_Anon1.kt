package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ap_Anon1: java.util.Comparator {
    val nO: com.google.android.gms.internal.ap

    constructor(p0: com.google.android.gms.internal.ap)

    public fun compare(x0: Object, x1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Ljava/lang/String;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         check-cast p2, Ljava/lang/String;
    //         .end local p2    # "x1":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ap$1;->compare(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun compare(s1: String, s2: String): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p2}, Ljava/lang/String;->length()I
    //         move-result v0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v1
    //         sub-int/2addr v0, v1
    //         return v0
    */

}
