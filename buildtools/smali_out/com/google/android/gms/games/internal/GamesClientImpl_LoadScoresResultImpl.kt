package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class GamesClientImpl_LoadScoresResultImpl: com.google.android.gms.common.api.a(), com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult {
    private val Xc: com.google.android.gms.games.leaderboard.LeaderboardEntity
    private val Xd: com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer

    constructor(leaderboard: com.google.android.gms.common.data.DataHolder, scores: com.google.android.gms.common.data.DataHolder)

    public fun getLeaderboard(): com.google.android.gms.games.leaderboard.Leaderboard { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/Leaderboard;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl;->Xc:Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;
    //         return-object v0
    */

    public fun getScores(): com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl;->Xd:Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    //         return-object v0
    */

}
