package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class r: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val avx: com.google.android.gms.wearable.c
    public val statusCode: Int
    public val versionCode: Int

    constructor(p0: Int, p1: Int, p2: com.google.android.gms.wearable.c)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/s;->a(Lcom/google/android/gms/wearable/internal/r;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
