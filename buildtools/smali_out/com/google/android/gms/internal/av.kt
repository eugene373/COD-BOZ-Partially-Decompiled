package com.google.android.gms.internal

// Auto-emitted from smali.
// 14 fields, 4 methods.

class av: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val extras: android.os.Bundle
    public val nT: Long
    public val nU: Int
    public val nV: java.util.List
    public val nW: Boolean
    public val nX: Int
    public val nY: Boolean
    public val nZ: String
    public val oa: com.google.android.gms.internal.bj
    public val ob: android.location.Location
    public val oc: String
    public val od: android.os.Bundle
    public val versionCode: Int

    public constructor(p0: Int, p1: Long, p2: android.os.Bundle, p3: Int, p4: java.util.List, p5: Boolean, p6: Int, p7: Boolean, p8: String, p9: com.google.android.gms.internal.bj, p10: android.location.Location, p11: String, p12: android.os.Bundle)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/aw;->a(Lcom/google/android/gms/internal/av;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.aw = null!!
    }
}
