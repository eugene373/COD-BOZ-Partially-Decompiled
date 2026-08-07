package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 3 fields, 13 methods.

interface Snapshots {
    public fun commitAndClose(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.snapshot.Snapshot, p2: com.google.android.gms.games.snapshot.SnapshotMetadataChange): com.google.android.gms.common.api.PendingResult

    public fun delete(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.snapshot.SnapshotMetadata): com.google.android.gms.common.api.PendingResult

    public fun discardAndClose(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.snapshot.Snapshot)

    public fun getMaxCoverImageSize(p0: com.google.android.gms.common.api.GoogleApiClient): Int

    public fun getMaxDataSize(p0: com.google.android.gms.common.api.GoogleApiClient): Int

    public fun getSelectSnapshotIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Boolean, p3: Boolean, p4: Int): android.content.Intent

    public fun getSnapshotFromBundle(p0: android.os.Bundle): com.google.android.gms.games.snapshot.SnapshotMetadata

    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean): com.google.android.gms.common.api.PendingResult

    public fun open(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.snapshot.SnapshotMetadata): com.google.android.gms.common.api.PendingResult

    public fun open(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Boolean): com.google.android.gms.common.api.PendingResult

    public fun resolveConflict(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: com.google.android.gms.games.snapshot.Snapshot): com.google.android.gms.common.api.PendingResult

    public fun resolveConflict(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String, p3: com.google.android.gms.games.snapshot.SnapshotMetadataChange, p4: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult

    public fun resolveConflict(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String, p3: com.google.android.gms.games.snapshot.SnapshotMetadataChange, p4: com.google.android.gms.games.snapshot.SnapshotContents): com.google.android.gms.common.api.PendingResult

    companion object {
    @JvmField public val DISPLAY_LIMIT_NONE: Int = 0
    @JvmField public val EXTRA_SNAPSHOT_METADATA: String = "com.google.android.gms.games.SNAPSHOT_METADATA"
    @JvmField public val EXTRA_SNAPSHOT_NEW: String = "com.google.android.gms.games.SNAPSHOT_NEW"
    }
}
