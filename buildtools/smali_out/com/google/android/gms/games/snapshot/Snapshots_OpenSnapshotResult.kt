package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 0 fields, 5 methods.

interface Snapshots_OpenSnapshotResult: com.google.android.gms.common.api.Result {
    public fun getConflictId(): String

    public fun getConflictingSnapshot(): com.google.android.gms.games.snapshot.Snapshot

    public fun getResolutionContents(): com.google.android.gms.drive.Contents

    public fun getResolutionSnapshotContents(): com.google.android.gms.games.snapshot.SnapshotContents

    public fun getSnapshot(): com.google.android.gms.games.snapshot.Snapshot

}
