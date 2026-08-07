package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 5 methods.

class gt: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val versionCode: Int
    public var wD: String
    public var wE: Int
    public var wF: Int
    public var wG: Boolean

    public constructor(p0: Int, p1: Int, p2: Boolean)

    constructor(p0: Int, p1: String, p2: Int, p3: Int, p4: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/gu;->a(Lcom/google/android/gms/internal/gt;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.gu = null!!
    }
}
