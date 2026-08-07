package com.google.android.gms.games.quest

// Auto-emitted from smali.
// 4 fields, 6 methods.

interface Milestone: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getCompletionRewardData(): ByteArray

    public fun getCurrentProgress(): Long

    public fun getEventId(): String

    public fun getMilestoneId(): String

    public fun getState(): Int

    public fun getTargetProgress(): Long

    companion object {
    @JvmField public val STATE_CLAIMED: Int = 0x4
    @JvmField public val STATE_COMPLETED_NOT_CLAIMED: Int = 0x3
    @JvmField public val STATE_NOT_COMPLETED: Int = 0x2
    @JvmField public val STATE_NOT_STARTED: Int = 0x1
    }
}
