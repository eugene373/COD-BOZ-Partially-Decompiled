package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 7 fields, 13 methods.

interface Participant: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getCapabilities(): Int

    public fun getDisplayName(): String

    public fun getDisplayName(p0: android.database.CharArrayBuffer)

    public fun getHiResImageUri(): android.net.Uri

    public fun getHiResImageUrl(): String

    public fun getIconImageUri(): android.net.Uri

    public fun getIconImageUrl(): String

    public fun getParticipantId(): String

    public fun getPlayer(): com.google.android.gms.games.Player

    public fun getResult(): com.google.android.gms.games.multiplayer.ParticipantResult

    public fun getStatus(): Int

    public fun isConnectedToRoom(): Boolean

    public fun jX(): String

    companion object {
    @JvmField public val STATUS_DECLINED: Int = 0x3
    @JvmField public val STATUS_FINISHED: Int = 0x5
    @JvmField public val STATUS_INVITED: Int = 0x1
    @JvmField public val STATUS_JOINED: Int = 0x2
    @JvmField public val STATUS_LEFT: Int = 0x4
    @JvmField public val STATUS_NOT_INVITED_YET: Int = 0x0
    @JvmField public val STATUS_UNRESPONSIVE: Int = 0x6
    }
}
