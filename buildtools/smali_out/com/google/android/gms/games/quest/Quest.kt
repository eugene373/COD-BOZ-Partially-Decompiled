package com.google.android.gms.games.quest

// Auto-emitted from smali.
// 9 fields, 21 methods.

interface Quest: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getAcceptedTimestamp(): Long

    public fun getBannerImageUri(): android.net.Uri

    public fun getBannerImageUrl(): String

    public fun getCurrentMilestone(): com.google.android.gms.games.quest.Milestone

    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getEndTimestamp(): Long

    public fun getGame(): com.google.android.gms.games.Game

    public fun getIconImageUri(): android.net.Uri

    public fun getIconImageUrl(): String

    public fun getLastUpdatedTimestamp(): Long

    public fun getName(): String

    public fun getName(p0: android.database.CharArrayBuffer)

    public fun getQuestId(): String

    public fun getStartTimestamp(): Long

    public fun getState(): Int

    public fun getType(): Int

    public fun isEndingSoon(): Boolean

    public fun lJ(): java.util.List

    public fun lK(): Long

    companion object {
    @JvmField public val QUEST_STATE_ALL: IntArray = null!!
    @JvmField public val QUEST_STATE_NON_TERMINAL: Array<String> = null!!
    @JvmField public val STATE_ACCEPTED: Int = 0x3
    @JvmField public val STATE_COMPLETED: Int = 0x4
    @JvmField public val STATE_EXPIRED: Int = 0x5
    @JvmField public val STATE_FAILED: Int = 0x6
    @JvmField public val STATE_OPEN: Int = 0x2
    @JvmField public val STATE_UPCOMING: Int = 0x1
    @JvmField public val UNSET_QUEST_TIMESTAMP: Long = 0L
    }
}
