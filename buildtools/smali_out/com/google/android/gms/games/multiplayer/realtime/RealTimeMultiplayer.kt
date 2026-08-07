package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 1 fields, 13 methods.

interface RealTimeMultiplayer {
    public fun create(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.realtime.RoomConfig)

    public fun declineInvitation(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun dismissInvitation(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun getSelectOpponentsIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Int): android.content.Intent

    public fun getSelectOpponentsIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Int, p3: Boolean): android.content.Intent

    public fun getSocketForParticipant(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String): com.google.android.gms.games.multiplayer.realtime.RealTimeSocket

    public fun getWaitingRoomIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.realtime.Room, p2: Int): android.content.Intent

    public fun join(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.realtime.RoomConfig)

    public fun leave(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, p2: String)

    public fun sendReliableMessage(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback, p2: ByteArray, p3: String, p4: String): Int

    public fun sendUnreliableMessage(p0: com.google.android.gms.common.api.GoogleApiClient, p1: ByteArray, p2: String, p3: String): Int

    public fun sendUnreliableMessage(p0: com.google.android.gms.common.api.GoogleApiClient, p1: ByteArray, p2: String, p3: java.util.List): Int

    public fun sendUnreliableMessageToOthers(p0: com.google.android.gms.common.api.GoogleApiClient, p1: ByteArray, p2: String): Int

    companion object {
    @JvmField public val REAL_TIME_MESSAGE_FAILED: Int = 0
    }
}
