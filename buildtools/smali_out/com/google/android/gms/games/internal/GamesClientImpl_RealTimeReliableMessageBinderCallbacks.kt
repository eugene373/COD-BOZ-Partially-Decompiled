package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 2 methods.

class GamesClientImpl_RealTimeReliableMessageBinderCallbacks: com.google.android.gms.games.internal.AbstractGamesCallbacks() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl
    val Xz: com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback

    public constructor(messageSentCallbacks: com.google.android.gms.games.internal.GamesClientImpl, p1: com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)

    public fun b(p0: Int, p1: Int, p2: String) { /* TODO(body): (IILjava/lang/String;)V */ }
    /*
    //         .locals 7
    //         iget-object v6, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;->Xz:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;
    //         move v3, p1
    //         move v4, p2
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;IILjava/lang/String;)V
    //         invoke-virtual {v6, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

}
