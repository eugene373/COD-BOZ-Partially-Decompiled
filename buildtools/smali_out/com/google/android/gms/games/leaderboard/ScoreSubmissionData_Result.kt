package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 4 fields, 2 methods.

class ScoreSubmissionData_Result {
    public val formattedScore: String
    public val newBest: Boolean
    public val rawScore: Long
    public val scoreTag: String

    public constructor(rawScore: Long, formattedScore: String, scoreTag: String, newBest: Boolean)

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "RawScore"
    //         iget-wide v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;->rawScore:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "FormattedScore"
    //         iget-object v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;->formattedScore:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ScoreTag"
    //         iget-object v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;->scoreTag:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "NewBest"
    //         iget-boolean v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;->newBest:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
