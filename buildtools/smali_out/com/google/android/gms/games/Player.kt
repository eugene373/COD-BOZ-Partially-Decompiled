package com.google.android.gms.games

// Auto-emitted from smali.
// 2 fields, 17 methods.

interface Player: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getDisplayName(): String

    public fun getDisplayName(p0: android.database.CharArrayBuffer)

    public fun getHiResImageUri(): android.net.Uri

    public fun getHiResImageUrl(): String

    public fun getIconImageUri(): android.net.Uri

    public fun getIconImageUrl(): String

    public fun getLastPlayedWithTimestamp(): Long

    public fun getLevelInfo(): com.google.android.gms.games.PlayerLevelInfo

    public fun getPlayerId(): String

    public fun getRetrievedTimestamp(): Long

    public fun getTitle(): String

    public fun getTitle(p0: android.database.CharArrayBuffer)

    public fun hasHiResImage(): Boolean

    public fun hasIconImage(): Boolean

    public fun isProfileVisible(): Boolean

    public fun jU(): Int

    public fun jV(): com.google.android.gms.games.internal.player.MostRecentGameInfo

    companion object {
    @JvmField public val CURRENT_XP_UNKNOWN: Long = 0L
    @JvmField public val TIMESTAMP_UNKNOWN: Long = 0L
    }
}
