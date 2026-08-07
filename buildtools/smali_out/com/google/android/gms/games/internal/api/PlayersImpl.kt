package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 10 methods.

class PlayersImpl: com.google.android.gms.games.Players {
    public constructor()

    public fun getCurrentPlayer(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.games.Player { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kc()Lcom/google/android/gms/games/Player;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrentPlayerId(apiClient: com.google.android.gms.common.api.GoogleApiClient): String { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kb()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPlayerSearchIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->km()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadConnectedPlayers(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$7;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/PlayersImpl$7;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadInvitablePlayers(apiClient: com.google.android.gms.common.api.GoogleApiClient, pageSize: Int, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;IZ)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$3;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/PlayersImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl;IZ)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadMoreInvitablePlayers(apiClient: com.google.android.gms.common.api.GoogleApiClient, pageSize: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/PlayersImpl$4;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadMoreRecentlyPlayedWithPlayers(apiClient: com.google.android.gms.common.api.GoogleApiClient, pageSize: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$6;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/PlayersImpl$6;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadPlayer(apiClient: com.google.android.gms.common.api.GoogleApiClient, playerId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/PlayersImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadRecentlyPlayedWithPlayers(apiClient: com.google.android.gms.common.api.GoogleApiClient, pageSize: Int, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;IZ)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$5;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/PlayersImpl$5;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl;IZ)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
