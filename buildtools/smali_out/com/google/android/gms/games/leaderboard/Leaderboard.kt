package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 2 fields, 8 methods.

interface Leaderboard: com.google.android.gms.common.data.Freezable {
    public fun getDisplayName(): String

    public fun getDisplayName(p0: android.database.CharArrayBuffer)

    public fun getGame(): com.google.android.gms.games.Game

    public fun getIconImageUri(): android.net.Uri

    public fun getIconImageUrl(): String

    public fun getLeaderboardId(): String

    public fun getScoreOrder(): Int

    public fun getVariants(): java.util.ArrayList

    companion object {
    @JvmField public val SCORE_ORDER_LARGER_IS_BETTER: Int = 0x1
    @JvmField public val SCORE_ORDER_SMALLER_IS_BETTER: Int = 0
    }
}
