package com.google.android.gms.drive

// Auto-emitted from smali.
// 0 fields, 12 methods.

interface DriveApi {
    public fun discardContents(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult

    public fun fetchDriveId(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun getAppFolder(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.drive.DriveFolder

    public fun getFile(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveId): com.google.android.gms.drive.DriveFile

    public fun getFolder(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveId): com.google.android.gms.drive.DriveFolder

    public fun getRootFolder(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.drive.DriveFolder

    public fun newContents(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun newCreateFileActivityBuilder(): com.google.android.gms.drive.CreateFileActivityBuilder

    public fun newDriveContents(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun newOpenFileActivityBuilder(): com.google.android.gms.drive.OpenFileActivityBuilder

    public fun query(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.query.Query): com.google.android.gms.common.api.PendingResult

    public fun requestSync(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

}
