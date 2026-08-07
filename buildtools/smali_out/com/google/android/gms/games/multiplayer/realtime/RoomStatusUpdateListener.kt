package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 0 fields, 12 methods.

interface RoomStatusUpdateListener {
    public fun onConnectedToRoom(p0: com.google.android.gms.games.multiplayer.realtime.Room)

    public fun onDisconnectedFromRoom(p0: com.google.android.gms.games.multiplayer.realtime.Room)

    public fun onP2PConnected(p0: String)

    public fun onP2PDisconnected(p0: String)

    public fun onPeerDeclined(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List)

    public fun onPeerInvitedToRoom(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List)

    public fun onPeerJoined(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List)

    public fun onPeerLeft(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List)

    public fun onPeersConnected(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List)

    public fun onPeersDisconnected(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List)

    public fun onRoomAutoMatching(p0: com.google.android.gms.games.multiplayer.realtime.Room)

    public fun onRoomConnecting(p0: com.google.android.gms.games.multiplayer.realtime.Room)

}
