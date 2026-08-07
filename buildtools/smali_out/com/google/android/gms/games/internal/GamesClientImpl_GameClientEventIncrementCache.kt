package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class GamesClientImpl_GameClientEventIncrementCache: com.google.android.gms.games.internal.events.EventIncrementCache() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl

    public constructor(p0: com.google.android.gms.games.internal.GamesClientImpl)

    protected fun q(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->n(Ljava/lang/String;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "GamesClientImpl"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unable to increment event "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " by "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " because the games client is no longer connected"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "GamesClientImpl"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

}
