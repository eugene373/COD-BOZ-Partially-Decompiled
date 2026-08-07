package com.google.android.gms.games

// Auto-emitted from smali.
// 21 fields, 11 methods.

class Games {
    private constructor()

    companion object {
    @JvmField public val API: com.google.android.gms.common.api.Api = null!!
    @JvmField public val Achievements: com.google.android.gms.games.achievement.Achievements = null!!
    val CU: com.google.android.gms.common.api.Api.c = null!!
    private val CV: com.google.android.gms.common.api.Api.b = null!!
    @JvmField public val EXTRA_PLAYER_IDS: String = "players"
    @JvmField public val Events: com.google.android.gms.games.event.Events = null!!
    @JvmField public val GamesMetadata: com.google.android.gms.games.GamesMetadata = null!!
    @JvmField public val Invitations: com.google.android.gms.games.multiplayer.Invitations = null!!
    @JvmField public val Leaderboards: com.google.android.gms.games.leaderboard.Leaderboards = null!!
    @JvmField public val Notifications: com.google.android.gms.games.Notifications = null!!
    @JvmField public val Players: com.google.android.gms.games.Players = null!!
    @JvmField public val Quests: com.google.android.gms.games.quest.Quests = null!!
    @JvmField public val RealTimeMultiplayer: com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer = null!!
    @JvmField public val Requests: com.google.android.gms.games.request.Requests = null!!
    @JvmField public val SCOPE_GAMES: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val Snapshots: com.google.android.gms.games.snapshot.Snapshots = null!!
    @JvmField public val TurnBasedMultiplayer: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer = null!!
    @JvmField public val VA: com.google.android.gms.common.api.Api = null!!
    @JvmField public val VB: com.google.android.gms.games.multiplayer.Multiplayer = null!!
    @JvmField public val VC: com.google.android.gms.games.internal.game.Acls = null!!
    @JvmField public val Vz: com.google.android.gms.common.api.Scope = null!!

    public @JvmStatic fun c(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.games.internal.GamesClientImpl { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;") }
    /*
    //         .locals 2
    //         if-eqz p0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "GoogleApiClient parameter is required."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-interface {p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         const-string v1, "GoogleApiClient must be connected."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->d(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun d(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.games.internal.GamesClientImpl { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/games/Games;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         if-eqz v0, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         const-string v2, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature."
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         return-object v0
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun getAppId(apiClient: com.google.android.gms.common.api.GoogleApiClient): String { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kp()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getCurrentAccountName(apiClient: com.google.android.gms.common.api.GoogleApiClient): String { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->ka()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getSdkVariant(apiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->ko()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getSettingsIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kn()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun setGravityForPopups(apiClient: com.google.android.gms.common.api.GoogleApiClient, gravity: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->dB(I)V
    //         return-void
    */

    public @JvmStatic fun setViewForPopups(apiClient: com.google.android.gms.common.api.GoogleApiClient, gamesContentView: android.view.View) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {p0}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->k(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun signOut(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/Games$2;
    //         invoke-direct {v0}, Lcom/google/android/gms/games/Games$2;-><init>()V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
