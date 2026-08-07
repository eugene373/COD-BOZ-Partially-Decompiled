package com.google.android.gms.games

// Auto-emitted from smali.
// 7 fields, 2 methods.

interface Notifications {
    public fun clear(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int)

    public fun clearAll(p0: com.google.android.gms.common.api.GoogleApiClient)

    companion object {
    @JvmField public val NOTIFICATION_TYPES_ALL: Int = 0x1f
    @JvmField public val NOTIFICATION_TYPES_MULTIPLAYER: Int = 0x3
    @JvmField public val NOTIFICATION_TYPE_INVITATION: Int = 0x1
    @JvmField public val NOTIFICATION_TYPE_LEVEL_UP: Int = 0x10
    @JvmField public val NOTIFICATION_TYPE_MATCH_UPDATE: Int = 0x2
    @JvmField public val NOTIFICATION_TYPE_QUEST: Int = 0x8
    @JvmField public val NOTIFICATION_TYPE_REQUEST: Int = 0x4
    }
}
