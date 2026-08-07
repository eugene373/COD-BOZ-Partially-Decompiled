package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 10 fields, 5 methods.

open class CreateFileRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Nn: String
    val Of: com.google.android.gms.drive.Contents
    val Ol: com.google.android.gms.drive.metadata.internal.MetadataBundle
    val Om: Integer
    val On: com.google.android.gms.drive.DriveId
    val Oo: Boolean
    val Op: Int
    val Oq: Int

    constructor(versionCode: Int, parentDriveId: com.google.android.gms.drive.DriveId, metadata: com.google.android.gms.drive.metadata.internal.MetadataBundle, contentsReference: com.google.android.gms.drive.Contents, fileType: Integer, sendEventOnCompletion: Boolean, trackingTag: String, createStrategy: Int, openContentsRequestId: Int)

    public constructor(parentDriveId: com.google.android.gms.drive.DriveId, metadata: com.google.android.gms.drive.metadata.internal.MetadataBundle, openContentsRequestId: Int, fileType: Int, executionOptions: com.google.android.gms.drive.ExecutionOptions)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/j;->a(Lcom/google/android/gms/drive/internal/CreateFileRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
