package com.google.android.gms.drive.realtime.internal

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class BeginCompoundOperationRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Ri: Boolean
    val Rj: Boolean
    val mName: String

    constructor(versionCode: Int, isCreation: Boolean, name: String, isUndoable: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/a;->a(Lcom/google/android/gms/drive/realtime/internal/BeginCompoundOperationRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
