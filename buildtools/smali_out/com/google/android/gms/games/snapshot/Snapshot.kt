package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 0 fields, 6 methods.

interface Snapshot: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getContents(): com.google.android.gms.drive.Contents

    public fun getMetadata(): com.google.android.gms.games.snapshot.SnapshotMetadata

    public fun getSnapshotContents(): com.google.android.gms.games.snapshot.SnapshotContents

    public fun modifyBytes(p0: Int, p1: ByteArray, p2: Int, p3: Int): Boolean

    public fun readFully(): ByteArray

    public fun writeBytes(p0: ByteArray): Boolean

}
