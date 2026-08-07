package com.google.android.gms.drive.realtime.internal.event

// Auto-emitted from smali.
// 7 fields, 4 methods.

open class ValuesAddedDetails: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val RN: String
    val RO: Int
    val Rr: Int
    val Rs: Int
    val mIndex: Int

    constructor(versionCode: Int, index: Int, valueIndex: Int, valueCount: Int, movedFromId: String, movedFromIndex: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/event/h;->a(Lcom/google/android/gms/drive/realtime/internal/event/ValuesAddedDetails;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
