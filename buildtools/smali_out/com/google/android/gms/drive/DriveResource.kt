package com.google.android.gms.drive

// Auto-emitted from smali.
// 0 fields, 11 methods.

interface DriveResource {
    public fun addChangeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.events.ChangeListener): com.google.android.gms.common.api.PendingResult

    public fun addChangeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.events.DriveEvent.Listener): com.google.android.gms.common.api.PendingResult

    public fun addChangeSubscription(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun getDriveId(): com.google.android.gms.drive.DriveId

    public fun getMetadata(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun listParents(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun removeChangeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.events.ChangeListener): com.google.android.gms.common.api.PendingResult

    public fun removeChangeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.events.DriveEvent.Listener): com.google.android.gms.common.api.PendingResult

    public fun removeChangeSubscription(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun setParents(p0: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.Set): com.google.android.gms.common.api.PendingResult

    public fun updateMetadata(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult

}
