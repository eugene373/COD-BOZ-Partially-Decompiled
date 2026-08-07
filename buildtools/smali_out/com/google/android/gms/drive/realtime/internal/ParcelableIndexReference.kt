package com.google.android.gms.drive.realtime.internal

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class ParcelableIndexReference: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Rp: String
    val Rq: Boolean
    val mIndex: Int

    constructor(versionCode: Int, objectId: String, index: Int, canBeDeleted: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/q;->a(Lcom/google/android/gms/drive/realtime/internal/ParcelableIndexReference;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
