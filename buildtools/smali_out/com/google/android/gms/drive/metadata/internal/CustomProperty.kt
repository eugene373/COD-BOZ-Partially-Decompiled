package com.google.android.gms.drive.metadata.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class CustomProperty: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val PJ: com.google.android.gms.drive.metadata.CustomPropertyKey
    val mValue: String

    constructor(versionCode: Int, key: com.google.android.gms.drive.metadata.CustomPropertyKey, value: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/c;->a(Lcom/google/android/gms/drive/metadata/internal/CustomProperty;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
