package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 9 fields, 12 methods.

interface LeaderboardVariant: com.google.android.gms.common.data.Freezable {
    public fun getCollection(): Int

    public fun getDisplayPlayerRank(): String

    public fun getDisplayPlayerScore(): String

    public fun getNumScores(): Long

    public fun getPlayerRank(): Long

    public fun getPlayerScoreTag(): String

    public fun getRawPlayerScore(): Long

    public fun getTimeSpan(): Int

    public fun hasPlayerInfo(): Boolean

    public fun lD(): String

    public fun lE(): String

    public fun lF(): String

    companion object {
    @JvmField public val COLLECTION_PUBLIC: Int = 0x0
    @JvmField public val COLLECTION_SOCIAL: Int = 0x1
    @JvmField public val NUM_SCORES_UNKNOWN: Int = 0
    @JvmField public val NUM_TIME_SPANS: Int = 0x3
    @JvmField public val PLAYER_RANK_UNKNOWN: Int = 0
    @JvmField public val PLAYER_SCORE_UNKNOWN: Int = 0
    @JvmField public val TIME_SPAN_ALL_TIME: Int = 0x2
    @JvmField public val TIME_SPAN_DAILY: Int = 0x0
    @JvmField public val TIME_SPAN_WEEKLY: Int = 0x1
    }
}
