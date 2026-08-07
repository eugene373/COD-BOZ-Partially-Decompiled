package com.google.android.gms.drive

// Auto-emitted from smali.
// 3 fields, 5 methods.

interface DriveFile: com.google.android.gms.drive.DriveResource {
    public fun commitAndCloseContents(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult

    public fun commitAndCloseContents(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.Contents, p2: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult

    public fun discardContents(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult

    public fun open(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: com.google.android.gms.drive.DriveFile.DownloadProgressListener): com.google.android.gms.common.api.PendingResult

    public fun openContents(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: com.google.android.gms.drive.DriveFile.DownloadProgressListener): com.google.android.gms.common.api.PendingResult

    companion object {
    @JvmField public val MODE_READ_ONLY: Int = 0x10000000
    @JvmField public val MODE_READ_WRITE: Int = 0x30000000
    @JvmField public val MODE_WRITE_ONLY: Int = 0x20000000
    }
}
