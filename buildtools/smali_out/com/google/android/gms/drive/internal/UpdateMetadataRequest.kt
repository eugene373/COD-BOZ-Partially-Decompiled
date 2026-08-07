package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class UpdateMetadataRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Od: com.google.android.gms.drive.DriveId
    val Oe: com.google.android.gms.drive.metadata.internal.MetadataBundle

    constructor(versionCode: Int, id: com.google.android.gms.drive.DriveId, metadataChangeSet: com.google.android.gms.drive.metadata.internal.MetadataBundle)

    public constructor(id: com.google.android.gms.drive.DriveId, metadataChangeSet: com.google.android.gms.drive.metadata.internal.MetadataBundle)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/bd;->a(Lcom/google/android/gms/drive/internal/UpdateMetadataRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
