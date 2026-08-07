package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class jb: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    public val Mq: String
    public val Mr: Int

    public constructor(p0: Int, p1: String, p2: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/jb;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jc = null!!
    }
}
