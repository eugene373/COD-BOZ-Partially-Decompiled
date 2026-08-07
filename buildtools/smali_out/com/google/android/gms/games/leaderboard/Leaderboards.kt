package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 0 fields, 14 methods.

interface Leaderboards {
    public fun getAllLeaderboardsIntent(p0: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent

    public fun getLeaderboardIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): android.content.Intent

    public fun loadCurrentPlayerLeaderboardScore(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int, p3: Int): com.google.android.gms.common.api.PendingResult

    public fun loadLeaderboardMetadata(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Boolean): com.google.android.gms.common.api.PendingResult

    public fun loadLeaderboardMetadata(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean): com.google.android.gms.common.api.PendingResult

    public fun loadMoreScores(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer, p2: Int, p3: Int): com.google.android.gms.common.api.PendingResult

    public fun loadPlayerCenteredScores(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int, p3: Int, p4: Int): com.google.android.gms.common.api.PendingResult

    public fun loadPlayerCenteredScores(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean): com.google.android.gms.common.api.PendingResult

    public fun loadTopScores(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int, p3: Int, p4: Int): com.google.android.gms.common.api.PendingResult

    public fun loadTopScores(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean): com.google.android.gms.common.api.PendingResult

    public fun submitScore(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Long)

    public fun submitScore(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Long, p3: String)

    public fun submitScoreImmediate(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Long): com.google.android.gms.common.api.PendingResult

    public fun submitScoreImmediate(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Long, p3: String): com.google.android.gms.common.api.PendingResult

}
