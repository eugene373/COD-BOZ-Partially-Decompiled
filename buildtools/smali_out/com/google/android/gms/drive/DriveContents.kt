package com.google.android.gms.drive

// Auto-emitted from smali.
// 0 fields, 10 methods.

interface DriveContents {
    public fun commit(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult

    public fun commit(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult

    public fun discard(p0: com.google.android.gms.common.api.GoogleApiClient)

    public fun getContents(): com.google.android.gms.drive.Contents

    public fun getDriveId(): com.google.android.gms.drive.DriveId

    public fun getInputStream(): java.io.InputStream

    public fun getMode(): Int

    public fun getOutputStream(): java.io.OutputStream

    public fun getParcelFileDescriptor(): android.os.ParcelFileDescriptor

    public fun reopenForWrite(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

}
