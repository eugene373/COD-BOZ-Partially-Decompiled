package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 4 fields, 19 methods.

class GamesClientImpl_RoomBinderCallbacks: com.google.android.gms.games.internal.AbstractGamesCallbacks() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl
    private val XH: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    private val XI: com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    private val XJ: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener

    public constructor(roomCallbacks: com.google.android.gms.games.internal.GamesClientImpl, p1: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener)

    public constructor(roomCallbacks: com.google.android.gms.games.internal.GamesClientImpl, roomStatusCallbacks: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, realTimeMessageReceivedCallbacks: com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener, p3: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener)

    public fun A(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$DisconnectedFromRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$DisconnectedFromRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.data.DataHolder, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerInvitedToRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerInvitedToRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.data.DataHolder, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerJoinedRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerJoinedRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun c(p0: com.google.android.gms.common.data.DataHolder, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerLeftRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerLeftRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun d(p0: com.google.android.gms.common.data.DataHolder, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDeclinedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDeclinedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun e(p0: com.google.android.gms.common.data.DataHolder, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerConnectedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerConnectedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun f(p0: com.google.android.gms.common.data.DataHolder, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDisconnectedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDisconnectedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun onLeftRoom(statusCode: Int, externalRoomId: String) { /* TODO(body): (ILjava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XH:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    //         invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;ILjava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun onP2PConnected(participantId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PConnectedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PConnectedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun onP2PDisconnected(participantId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PDisconnectedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$P2PDisconnectedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun onRealTimeMessageReceived(message: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XJ:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun u(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomCreatedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XH:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomCreatedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun v(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$JoinedRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XH:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$JoinedRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun w(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectingCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectingCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun x(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomAutoMatchingCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomAutoMatchingCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun y(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XH:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

    public fun z(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ConnectedToRoomCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;->XI:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ConnectedToRoomCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

}
