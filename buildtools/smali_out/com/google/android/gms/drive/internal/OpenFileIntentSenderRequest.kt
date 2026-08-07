package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 5 fields, 5 methods.

open class OpenFileIntentSenderRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Nw: String
    val Nx: Array<String>
    val Ny: com.google.android.gms.drive.DriveId

    constructor(versionCode: Int, title: String, mimeTypes: Array<String>, startFolder: com.google.android.gms.drive.DriveId)

    public constructor(title: String, mimeTypes: Array<String>, startFolder: com.google.android.gms.drive.DriveId)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/aw;->a(Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
