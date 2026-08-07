package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 5 fields, 7 methods.

class ScoreSubmissionData {
    private var HF: Int
    private var VK: String
    private var abY: java.util.HashMap
    private var abu: String

    public constructor(dataHolder: com.google.android.gms.common.data.DataHolder)

    private fun a(p0: com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result, p1: Int) { /* TODO(body): (Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun getLeaderboardId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abu:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPlayerId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->VK:Ljava/lang/String;
    //         return-object v0
    */

    public fun getScoreResult(timeSpan: Int): com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result { return TODO("body: (I)Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PlayerId"
    //         iget-object v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->VK:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "StatusCode"
    //         iget v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->HF:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         const/4 v0, 0x3
    //         if-ge v1, v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;
    //         const-string v3, "TimesSpan"
    //         invoke-static {v1}, Lcom/google/android/gms/games/internal/constants/TimeSpan;->dH(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         const-string v3, "Result"
    //         if-nez v0, :cond_0
    //         const-string v0, "null"
    //         :goto_1
    //         invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_1
    //         invoke-virtual {v2}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val abs: Array<String> = null!!
    }
}
