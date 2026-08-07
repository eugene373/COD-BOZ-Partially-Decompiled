package com.google.android.gms.drive

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class RealtimeDocumentSyncRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val NA: java.util.List
    val Nz: java.util.List

    constructor(versionCode: Int, p1: java.util.List, p2: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/f;->a(Lcom/google/android/gms/drive/RealtimeDocumentSyncRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
