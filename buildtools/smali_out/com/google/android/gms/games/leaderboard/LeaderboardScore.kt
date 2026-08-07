package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 1 fields, 15 methods.

interface LeaderboardScore: com.google.android.gms.common.data.Freezable {
    public fun getDisplayRank(): String

    public fun getDisplayRank(p0: android.database.CharArrayBuffer)

    public fun getDisplayScore(): String

    public fun getDisplayScore(p0: android.database.CharArrayBuffer)

    public fun getRank(): Long

    public fun getRawScore(): Long

    public fun getScoreHolder(): com.google.android.gms.games.Player

    public fun getScoreHolderDisplayName(): String

    public fun getScoreHolderDisplayName(p0: android.database.CharArrayBuffer)

    public fun getScoreHolderHiResImageUri(): android.net.Uri

    public fun getScoreHolderHiResImageUrl(): String

    public fun getScoreHolderIconImageUri(): android.net.Uri

    public fun getScoreHolderIconImageUrl(): String

    public fun getScoreTag(): String

    public fun getTimestampMillis(): Long

    companion object {
    @JvmField public val LEADERBOARD_RANK_UNKNOWN: Int = 0
    }
}
