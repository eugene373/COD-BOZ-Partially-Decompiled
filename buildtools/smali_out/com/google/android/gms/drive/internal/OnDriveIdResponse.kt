package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class OnDriveIdResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    var Od: com.google.android.gms.drive.DriveId

    constructor(versionCode: Int, driveId: com.google.android.gms.drive.DriveId)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnDriveIdResponse;->Od:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ak;->a(Lcom/google/android/gms/drive/internal/OnDriveIdResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
