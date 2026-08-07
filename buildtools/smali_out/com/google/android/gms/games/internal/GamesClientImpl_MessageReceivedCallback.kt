package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

class GamesClientImpl_MessageReceivedCallback: com.google.android.gms.common.internal.e.b() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl
    private val Xk: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage

    constructor(listener: com.google.android.gms.games.internal.GamesClientImpl, message: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener, p2: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage)

    public fun a(p0: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;->Xk:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;->onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    //         :cond_0
    //         return-void
    */

    public fun g(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;->a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V
    //         return-void
    */

    protected fun gT() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
