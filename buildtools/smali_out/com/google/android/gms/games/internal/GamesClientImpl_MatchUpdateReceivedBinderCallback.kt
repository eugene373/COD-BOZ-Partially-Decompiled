package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class GamesClientImpl_MatchUpdateReceivedBinderCallback: com.google.android.gms.games.internal.AbstractGamesCallbacks() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl
    private val Xi: com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener

    constructor(listener: com.google.android.gms.games.internal.GamesClientImpl, p1: com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener)

    public fun onTurnBasedMatchRemoved(matchId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchRemovedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;->Xi:Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchRemovedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun t(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 5
    //         new-instance v1, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->getCount()I
    //         move-result v2
    //         if-lez v2, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;->freeze()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->release()V
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedCallback;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;->Xi:Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;
    //         invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;)V
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         :cond_1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->release()V
    //         throw v0
    */

}
