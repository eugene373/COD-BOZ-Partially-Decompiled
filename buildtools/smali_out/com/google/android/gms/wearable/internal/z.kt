package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class z: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val avB: android.os.ParcelFileDescriptor
    public val statusCode: Int
    public val versionCode: Int

    constructor(p0: Int, p1: Int, p2: android.os.ParcelFileDescriptor)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         or-int/lit8 v0, p2, 0x1
    //         invoke-static {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/aa;->a(Lcom/google/android/gms/wearable/internal/z;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
