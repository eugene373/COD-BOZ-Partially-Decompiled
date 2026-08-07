package com.google.android.gms.games.quest

// Auto-emitted from smali.
// 13 fields, 10 methods.

interface Quests {
    public fun accept(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun claim(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String): com.google.android.gms.common.api.PendingResult

    public fun getQuestIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): android.content.Intent

    public fun getQuestsIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: IntArray): android.content.Intent

    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient, p1: IntArray, p2: Int, p3: Boolean): com.google.android.gms.common.api.PendingResult

    public fun loadByIds(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean, p2: Array<String>): com.google.android.gms.common.api.PendingResult

    public fun registerQuestUpdateListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.quest.QuestUpdateListener)

    public fun showStateChangedPopup(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun unregisterQuestUpdateListener(p0: com.google.android.gms.common.api.GoogleApiClient)

    companion object {
    @JvmField public val EXTRA_QUEST: String = "quest"
    @JvmField public val SELECT_ACCEPTED: Int = 0x3
    @JvmField public val SELECT_COMPLETED: Int = 0x4
    @JvmField public val SELECT_COMPLETED_UNCLAIMED: Int = 0x65
    @JvmField public val SELECT_ENDING_SOON: Int = 0x66
    @JvmField public val SELECT_EXPIRED: Int = 0x5
    @JvmField public val SELECT_FAILED: Int = 0x6
    @JvmField public val SELECT_OPEN: Int = 0x2
    @JvmField public val SELECT_RECENTLY_FAILED: Int = 0x67
    @JvmField public val SELECT_UPCOMING: Int = 0x1
    @JvmField public val SORT_ORDER_ENDING_SOON_FIRST: Int = 0x1
    @JvmField public val SORT_ORDER_RECENTLY_UPDATED_FIRST: Int = 0
    @JvmField public val adb: IntArray = null!!
    }
}
