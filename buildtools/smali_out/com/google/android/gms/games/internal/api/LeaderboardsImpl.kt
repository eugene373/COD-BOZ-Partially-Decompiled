package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 15 methods.

class LeaderboardsImpl: com.google.android.gms.games.leaderboard.Leaderboards {
    public constructor()

    public fun getAllLeaderboardsIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->ke()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLeaderboardIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->bx(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadCurrentPlayerLeaderboardScore(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, span: Int, leaderboardCollection: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;II)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$3;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Ljava/lang/String;II)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadLeaderboardMetadata(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$2;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Ljava/lang/String;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadLeaderboardMetadata(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadMoreScores(apiClient: com.google.android.gms.common.api.GoogleApiClient, buffer: com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer, maxResults: Int, pageDirection: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;II)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$6;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$6;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;II)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadPlayerCenteredScores(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, span: Int, leaderboardCollection: Int, maxResults: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;III)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;->loadPlayerCenteredScores(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadPlayerCenteredScores(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, span: Int, leaderboardCollection: Int, maxResults: Int, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$5;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         move v6, p6
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$5;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Ljava/lang/String;IIIZ)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadTopScores(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, span: Int, leaderboardCollection: Int, maxResults: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;III)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;->loadTopScores(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadTopScores(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, span: Int, leaderboardCollection: Int, maxResults: Int, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$4;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         move v6, p6
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$4;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Ljava/lang/String;IIIZ)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun submitScore(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, score: Long) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-wide v4, p3
    //         invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;->submitScore(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;JLjava/lang/String;)V
    //         return-void
    */

    public fun submitScore(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, score: Long, scoreTag: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;JLjava/lang/String;)V */ }
    /*
    //         .locals 7
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         move-object v3, p2
    //         move-wide v4, p3
    //         move-object v6, p5
    //         invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;JLjava/lang/String;)V
    //         return-void
    */

    public fun submitScoreImmediate(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, score: Long): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-wide v4, p3
    //         invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;->submitScoreImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;JLjava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun submitScoreImmediate(apiClient: com.google.android.gms.common.api.GoogleApiClient, leaderboardId: String, score: Long, scoreTag: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;JLjava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         new-instance v1, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$7;
    //         move-object v2, p0
    //         move-object v3, p2
    //         move-wide v4, p3
    //         move-object v6, p5
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$7;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;Ljava/lang/String;JLjava/lang/String;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
