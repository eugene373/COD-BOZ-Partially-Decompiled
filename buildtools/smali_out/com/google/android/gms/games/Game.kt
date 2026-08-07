package com.google.android.gms.games

// Auto-emitted from smali.
// 0 fields, 27 methods.

interface Game: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun areSnapshotsEnabled(): Boolean

    public fun getAchievementTotalCount(): Int

    public fun getApplicationId(): String

    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getDeveloperName(): String

    public fun getDeveloperName(p0: android.database.CharArrayBuffer)

    public fun getDisplayName(): String

    public fun getDisplayName(p0: android.database.CharArrayBuffer)

    public fun getFeaturedImageUri(): android.net.Uri

    public fun getFeaturedImageUrl(): String

    public fun getHiResImageUri(): android.net.Uri

    public fun getHiResImageUrl(): String

    public fun getIconImageUri(): android.net.Uri

    public fun getIconImageUrl(): String

    public fun getLeaderboardCount(): Int

    public fun getPrimaryCategory(): String

    public fun getSecondaryCategory(): String

    public fun getThemeColor(): String

    public fun isMuted(): Boolean

    public fun isRealTimeMultiplayerEnabled(): Boolean

    public fun isTurnBasedMultiplayerEnabled(): Boolean

    public fun jO(): Boolean

    public fun jP(): Boolean

    public fun jQ(): Boolean

    public fun jR(): String

    public fun jS(): Int

}
