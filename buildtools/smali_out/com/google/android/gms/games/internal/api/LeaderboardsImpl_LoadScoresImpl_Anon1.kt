package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class LeaderboardsImpl_LoadScoresImpl_Anon1: com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult {
    val CW: com.google.android.gms.common.api.Status
    val YU: com.google.android.gms.games.internal.api.LeaderboardsImpl.LoadScoresImpl

    constructor(p0: com.google.android.gms.games.internal.api.LeaderboardsImpl.LoadScoresImpl, p1: com.google.android.gms.common.api.Status)

    public fun getLeaderboard(): com.google.android.gms.games.leaderboard.Leaderboard { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/Leaderboard;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getScores(): com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    //         const/16 v1, 0xe
    //         invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadScoresImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
