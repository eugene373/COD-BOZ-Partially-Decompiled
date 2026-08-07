package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class GamesClientImpl_AbstractRoomCallback: com.google.android.gms.common.internal.e.d() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl

    constructor(listener: com.google.android.gms.games.internal.GamesClientImpl, dataHolder: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, p2: com.google.android.gms.common.data.DataHolder)

    protected fun a(p0: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, p1: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$AbstractRoomCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-static {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/multiplayer/realtime/Room;
    //         move-result-object v0
    //         invoke-virtual {p2}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I
    //         move-result v1
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AbstractRoomCallback;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, p1: com.google.android.gms.games.multiplayer.realtime.Room, p2: Int)

    protected fun a(p0: Object, p1: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$AbstractRoomCallback;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-void
    */

}
