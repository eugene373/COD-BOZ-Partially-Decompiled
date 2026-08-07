package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class SetResourceParentsRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val PA: java.util.List
    val Pz: com.google.android.gms.drive.DriveId

    constructor(versionCode: Int, targetId: com.google.android.gms.drive.DriveId, p2: java.util.List)

    public constructor(targetId: com.google.android.gms.drive.DriveId, p1: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ba;->a(Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
