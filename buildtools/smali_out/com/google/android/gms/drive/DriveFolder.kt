package com.google.android.gms.drive

// Auto-emitted from smali.
// 1 fields, 6 methods.

interface DriveFolder: com.google.android.gms.drive.DriveResource {
    public fun createFile(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult

    public fun createFile(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.DriveContents): com.google.android.gms.common.api.PendingResult

    public fun createFile(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.DriveContents, p3: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult

    public fun createFolder(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult

    public fun listChildren(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun queryChildren(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.query.Query): com.google.android.gms.common.api.PendingResult

    companion object {
    @JvmField public val MIME_TYPE: String = "application/vnd.google-apps.folder"
    }
}
