package com.google.android.gms.internal

// Auto-emitted from smali.
// 23 fields, 8 methods.

class fk: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val errorCode: Int
    public val orientation: Int
    public val qf: java.util.List
    public val qg: java.util.List
    public val qj: Long
    public val rP: String
    public val tF: Boolean
    public val tG: String
    public val tH: Long
    public val tI: Boolean
    public val tJ: Long
    public val tK: java.util.List
    public val tL: String
    public val tM: Long
    public val tN: String
    public val tO: Boolean
    public val tP: String
    public val tQ: String
    public val tR: Boolean
    public val tS: Boolean
    public val tT: Boolean
    public val versionCode: Int

    public constructor(p0: Int)

    public constructor(p0: Int, p1: Long)

    constructor(p0: Int, p1: String, p2: String, p3: java.util.List, p4: Int, p5: java.util.List, p6: Long, p7: Boolean, p8: Long, p9: java.util.List, p10: Long, p11: Int, p12: String, p13: Long, p14: String, p15: Boolean, p16: String, p17: String, p18: Boolean, p19: Boolean, p20: Boolean, p21: Boolean)

    public constructor(p0: String, p1: String, p2: java.util.List, p3: java.util.List, p4: Long, p5: Boolean, p6: Long, p7: java.util.List, p8: Long, p9: Int, p10: String, p11: Long, p12: String, p13: String, p14: Boolean, p15: Boolean, p16: Boolean, p17: Boolean)

    public constructor(p0: String, p1: String, p2: java.util.List, p3: java.util.List, p4: Long, p5: Boolean, p6: Long, p7: java.util.List, p8: Long, p9: Int, p10: String, p11: Long, p12: String, p13: Boolean, p14: String, p15: String, p16: Boolean, p17: Boolean, p18: Boolean, p19: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/fl;->a(Lcom/google/android/gms/internal/fk;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.fl = null!!
    }
}
