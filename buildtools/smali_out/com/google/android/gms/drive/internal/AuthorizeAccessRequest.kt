package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class AuthorizeAccessRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val MW: com.google.android.gms.drive.DriveId
    val Ob: Long

    constructor(versionCode: Int, appId: Long, driveId: com.google.android.gms.drive.DriveId)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/b;->a(Lcom/google/android/gms/drive/internal/AuthorizeAccessRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
