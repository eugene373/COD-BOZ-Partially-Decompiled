package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloadProgressInfo.java.
// 5 fields, 5 methods.

open class DownloadProgressInfo: android.os.Parcelable {
    public var mCurrentSpeed: Float
    public var mOverallProgress: Long
    public var mOverallTotal: Long
    public var mTimeRemaining: Long

    public constructor(p0: Long, p1: Long, p2: Long, p3: Float)

    public constructor(p0: android.os.Parcel)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-wide v0, p0, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-wide v0, p0, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mTimeRemaining:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mCurrentSpeed:F
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
