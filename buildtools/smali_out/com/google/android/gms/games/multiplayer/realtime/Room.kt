package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 5 fields, 13 methods.

interface Room: android.os.Parcelable, com.google.android.gms.common.data.Freezable, com.google.android.gms.games.multiplayer.Participatable {
    public fun getAutoMatchCriteria(): android.os.Bundle

    public fun getAutoMatchWaitEstimateSeconds(): Int

    public fun getCreationTimestamp(): Long

    public fun getCreatorId(): String

    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getParticipant(p0: String): com.google.android.gms.games.multiplayer.Participant

    public fun getParticipantId(p0: String): String

    public fun getParticipantIds(): java.util.ArrayList

    public fun getParticipantStatus(p0: String): Int

    public fun getRoomId(): String

    public fun getStatus(): Int

    public fun getVariant(): Int

    companion object {
    @JvmField public val ROOM_STATUS_ACTIVE: Int = 0x3
    @JvmField public val ROOM_STATUS_AUTO_MATCHING: Int = 0x1
    @JvmField public val ROOM_STATUS_CONNECTING: Int = 0x2
    @JvmField public val ROOM_STATUS_INVITING: Int = 0x0
    @JvmField public val ROOM_VARIANT_DEFAULT: Int = 0
    }
}
