package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 25 methods.

class TurnBasedMultiplayerImpl: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer {
    public constructor()

    public fun acceptInvitation(apiClient: com.google.android.gms.common.api.GoogleApiClient, invitationId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun cancelMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$8;
    //         invoke-direct {v0, p0, p2, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$8;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun createMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, config: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun declineInvitation(apiClient: com.google.android.gms.common.api.GoogleApiClient, invitationId: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->p(Ljava/lang/String;I)V
    //         return-void
    */

    public fun dismissInvitation(apiClient: com.google.android.gms.common.api.GoogleApiClient, invitationId: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->o(Ljava/lang/String;I)V
    //         return-void
    */

    public fun dismissMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->by(Ljava/lang/String;)V
    //         return-void
    */

    public fun finishMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         move-object v0, v1
    //         check-cast v0, [Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         invoke-virtual {p0, p1, p2, v1, v0}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;->finishMatch(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun finishMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String, matchData: ByteArray, p3: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLjava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .local p4, "results":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/games/multiplayer/ParticipantResult;>;"
    //         if-nez p4, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;->finishMatch(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p4}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v0, v0, [Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         invoke-interface {p4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         goto :goto_0
    */

    public fun finishMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String, matchData: ByteArray, results: Array<com.google.android.gms.games.multiplayer.ParticipantResult>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$5;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$5;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInboxIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kg()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMaxMatchDataSize(apiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kq()I
    //         move-result v0
    //         return v0
    */

    public fun getSelectOpponentsIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, minPlayers: Int, maxPlayers: Int): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;II)Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, p2, p3, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(IIZ)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSelectOpponentsIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, minPlayers: Int, maxPlayers: Int, allowAutomatch: Boolean): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;IIZ)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2, p3, p4}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(IIZ)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun leaveMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$6;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$6;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun leaveMatchDuringTurn(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String, pendingParticipantId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$7;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$7;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadMatch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$10;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$10;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadMatchesByStatus(apiClient: com.google.android.gms.common.api.GoogleApiClient, invitationSortOrder: Int, matchTurnStatuses: IntArray): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I[I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$9;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$9;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;I[I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadMatchesByStatus(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchTurnStatuses: IntArray): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;[I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;->loadMatchesByStatus(Lcom/google/android/gms/common/api/GoogleApiClient;I[I)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun registerMatchUpdateListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;)V
    //         return-void
    */

    public fun rematch(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun takeTurn(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String, matchData: ByteArray, pendingParticipantId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLjava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         check-cast v5, [Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;->takeTurn(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun takeTurn(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String, matchData: ByteArray, pendingParticipantId: String, p4: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLjava/lang/String;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         .local p5, "results":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/games/multiplayer/ParticipantResult;>;"
    //         if-nez p5, :cond_0
    //         const/4 v5, 0x0
    //         :goto_0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;->takeTurn(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p5}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v0, v0, [Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         invoke-interface {p5, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         move-object v5, v0
    //         goto :goto_0
    */

    public fun takeTurn(apiClient: com.google.android.gms.common.api.GoogleApiClient, matchId: String, matchData: ByteArray, pendingParticipantId: String, results: Array<com.google.android.gms.games.multiplayer.ParticipantResult>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$4;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$4;-><init>(Lcom/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unregisterMatchUpdateListener(apiClient: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kj()V
    //         return-void
    */

}
