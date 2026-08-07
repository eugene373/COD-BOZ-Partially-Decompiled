package com.google.android.gms.games.achievement

// Auto-emitted from smali.
// 5 fields, 20 methods.

interface Achievement: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getAchievementId(): String

    public fun getCurrentSteps(): Int

    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getFormattedCurrentSteps(): String

    public fun getFormattedCurrentSteps(p0: android.database.CharArrayBuffer)

    public fun getFormattedTotalSteps(): String

    public fun getFormattedTotalSteps(p0: android.database.CharArrayBuffer)

    public fun getLastUpdatedTimestamp(): Long

    public fun getName(): String

    public fun getName(p0: android.database.CharArrayBuffer)

    public fun getPlayer(): com.google.android.gms.games.Player

    public fun getRevealedImageUri(): android.net.Uri

    public fun getRevealedImageUrl(): String

    public fun getState(): Int

    public fun getTotalSteps(): Int

    public fun getType(): Int

    public fun getUnlockedImageUri(): android.net.Uri

    public fun getUnlockedImageUrl(): String

    public fun getXpValue(): Long

    companion object {
    @JvmField public val STATE_HIDDEN: Int = 0x2
    @JvmField public val STATE_REVEALED: Int = 0x1
    @JvmField public val STATE_UNLOCKED: Int = 0x0
    @JvmField public val TYPE_INCREMENTAL: Int = 0x1
    @JvmField public val TYPE_STANDARD: Int = 0
    }
}
