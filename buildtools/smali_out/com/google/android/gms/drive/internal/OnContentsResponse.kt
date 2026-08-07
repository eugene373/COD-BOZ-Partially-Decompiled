package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class OnContentsResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Ox: com.google.android.gms.drive.Contents
    val Po: Boolean

    constructor(versionCode: Int, contents: com.google.android.gms.drive.Contents, outOfDate: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun id(): com.google.android.gms.drive.Contents { return TODO("body: ()Lcom/google/android/gms/drive/Contents;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->Ox:Lcom/google/android/gms/drive/Contents;
    //         return-object v0
    */

    public fun ie(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/OnContentsResponse;->Po:Z
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ai;->a(Lcom/google/android/gms/drive/internal/OnContentsResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
