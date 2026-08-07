package com.google.android.gms.drive

// Auto-emitted from smali.
// 7 fields, 4 methods.

open class StorageStats: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val NB: Long
    val NC: Long
    val ND: Long
    val NE: Long
    val NF: Int

    constructor(versionCode: Int, metadataSizeBytes: Long, cachedContentsSizeBytes: Long, pinnedItemsSizeBytes: Long, totalSizeBytes: Long, numPinnedItems: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/g;->a(Lcom/google/android/gms/drive/StorageStats;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
