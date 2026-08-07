package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 1 fields, 4 methods.

class LeaderboardScoreBuffer: com.google.android.gms.common.data.DataBuffer() {
    private val aby: com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader

    public constructor(dataHolder: com.google.android.gms.common.data.DataHolder)

    public fun get(position: Int): com.google.android.gms.games.leaderboard.LeaderboardScore { return TODO("body: (I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;
    //         iget-object v1, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         return-object v0
    */

    public fun get(x0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->get(I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //         move-result-object v0
    //         return-object v0
    */

    public fun lA(): com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->aby:Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;
    //         return-object v0
    */

}
