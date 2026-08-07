package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 2 fields, 7 methods.

interface Invitation: android.os.Parcelable, com.google.android.gms.common.data.Freezable, com.google.android.gms.games.multiplayer.Participatable {
    public fun getAvailableAutoMatchSlots(): Int

    public fun getCreationTimestamp(): Long

    public fun getGame(): com.google.android.gms.games.Game

    public fun getInvitationId(): String

    public fun getInvitationType(): Int

    public fun getInviter(): com.google.android.gms.games.multiplayer.Participant

    public fun getVariant(): Int

    companion object {
    @JvmField public val INVITATION_TYPE_REAL_TIME: Int = 0x0
    @JvmField public val INVITATION_TYPE_TURN_BASED: Int = 0x1
    }
}
