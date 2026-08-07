package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 7 fields, 5 methods.

open class CreateFileIntentSenderRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Nw: String
    val Ny: com.google.android.gms.drive.DriveId
    val Ol: com.google.android.gms.drive.metadata.internal.MetadataBundle
    val Om: Integer
    val uQ: Int

    constructor(versionCode: Int, metadata: com.google.android.gms.drive.metadata.internal.MetadataBundle, requestId: Int, title: String, startFolder: com.google.android.gms.drive.DriveId, fileType: Integer)

    public constructor(metadata: com.google.android.gms.drive.metadata.internal.MetadataBundle, requestId: Int, title: String, startFolder: com.google.android.gms.drive.DriveId, fileType: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/i;->a(Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
