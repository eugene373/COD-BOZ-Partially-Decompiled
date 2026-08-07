package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

class GamesClientImpl_LoadMatchesResultImpl: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult {
    private val CM: com.google.android.gms.common.api.Status
    private val WX: com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse

    constructor(status: com.google.android.gms.common.api.Status, matchData: android.os.Bundle)

    public fun getMatches(): com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadMatchesResultImpl;->WX:Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadMatchesResultImpl;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadMatchesResultImpl;->WX:Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->close()V
    //         return-void
    */

}
