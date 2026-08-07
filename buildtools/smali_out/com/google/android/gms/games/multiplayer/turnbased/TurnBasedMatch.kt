package com.google.android.gms.games.multiplayer.turnbased

// Auto-emitted from smali.
// 11 fields, 28 methods.

interface TurnBasedMatch: android.os.Parcelable, com.google.android.gms.common.data.Freezable, com.google.android.gms.games.multiplayer.Participatable {
    public fun canRematch(): Boolean

    public fun getAutoMatchCriteria(): android.os.Bundle

    public fun getAvailableAutoMatchSlots(): Int

    public fun getCreationTimestamp(): Long

    public fun getCreatorId(): String

    public fun getData(): ByteArray

    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getDescriptionParticipant(): com.google.android.gms.games.multiplayer.Participant

    public fun getDescriptionParticipantId(): String

    public fun getGame(): com.google.android.gms.games.Game

    public fun getLastUpdatedTimestamp(): Long

    public fun getLastUpdaterId(): String

    public fun getMatchId(): String

    public fun getMatchNumber(): Int

    public fun getParticipant(p0: String): com.google.android.gms.games.multiplayer.Participant

    public fun getParticipantId(p0: String): String

    public fun getParticipantIds(): java.util.ArrayList

    public fun getParticipantStatus(p0: String): Int

    public fun getPendingParticipantId(): String

    public fun getPreviousMatchData(): ByteArray

    public fun getRematchId(): String

    public fun getStatus(): Int

    public fun getTurnStatus(): Int

    public fun getVariant(): Int

    public fun getVersion(): Int

    public fun isLocallyModified(): Boolean

    companion object {
    @JvmField public val MATCH_STATUS_ACTIVE: Int = 0x1
    @JvmField public val MATCH_STATUS_AUTO_MATCHING: Int = 0x0
    @JvmField public val MATCH_STATUS_CANCELED: Int = 0x4
    @JvmField public val MATCH_STATUS_COMPLETE: Int = 0x2
    @JvmField public val MATCH_STATUS_EXPIRED: Int = 0x3
    @JvmField public val MATCH_TURN_STATUS_ALL: IntArray = null!!
    @JvmField public val MATCH_TURN_STATUS_COMPLETE: Int = 0x3
    @JvmField public val MATCH_TURN_STATUS_INVITED: Int = 0x0
    @JvmField public val MATCH_TURN_STATUS_MY_TURN: Int = 0x1
    @JvmField public val MATCH_TURN_STATUS_THEIR_TURN: Int = 0x2
    @JvmField public val MATCH_VARIANT_DEFAULT: Int = 0
    }
}
