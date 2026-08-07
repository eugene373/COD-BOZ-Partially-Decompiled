package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class OnDownloadProgressResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Pp: Long
    val Pq: Long

    constructor(versionCode: Int, bytesLoaded: Long, bytesExpected: Long)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun if(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->Pp:J
    //         return-wide v0
    */

    public fun ig(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->Pq:J
    //         return-wide v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/aj;->a(Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
