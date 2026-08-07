package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 1 fields, 12 methods.

interface SnapshotMetadata: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getCoverImageAspectRatio(): Float

    public fun getCoverImageUri(): android.net.Uri

    public fun getCoverImageUrl(): String

    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getGame(): com.google.android.gms.games.Game

    public fun getLastModifiedTimestamp(): Long

    public fun getOwner(): com.google.android.gms.games.Player

    public fun getPlayedTime(): Long

    public fun getSnapshotId(): String

    public fun getTitle(): String

    public fun getUniqueName(): String

    companion object {
    @JvmField public val PLAYED_TIME_UNKNOWN: Long = 0L
    }
}
