package com.google.android.gms.drive

// Auto-emitted from smali.
// 3 fields, 4 methods.

open class DrivePreferences: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Nm: Boolean

    constructor(versionCode: Int, syncOverWifiOnly: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/d;->a(Lcom/google/android/gms/drive/DrivePreferences;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
