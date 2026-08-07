package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

class jf_a: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val Mw: String
    val Mx: Int
    val versionCode: Int

    constructor(p0: Int, p1: String, p2: Int)

    constructor(p0: String, p1: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jf$a;->CREATOR:Lcom/google/android/gms/internal/jh;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jf$a;->CREATOR:Lcom/google/android/gms/internal/jh;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jh;->a(Lcom/google/android/gms/internal/jf$a;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jh = null!!
    }
}
