package com.google.android.gms.internal

// Auto-emitted from smali.
// 16 fields, 5 methods.

class bj: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val backgroundColor: Int
    public val oH: Int
    public val oI: Int
    public val oJ: Int
    public val oK: Int
    public val oL: Int
    public val oM: Int
    public val oN: Int
    public val oO: String
    public val oP: Int
    public val oQ: String
    public val oR: Int
    public val oS: Int
    public val oT: String
    public val versionCode: Int

    constructor(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Int, p13: Int, p14: String)

    public constructor(p0: com.google.android.gms.ads.search.SearchAdRequest)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/bk;->a(Lcom/google/android/gms/internal/bj;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.bk = null!!
    }
}
