package com.google.android.gms.games.request

// Auto-emitted from smali.
// 11 fields, 13 methods.

interface Requests {
    public fun acceptRequest(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun acceptRequests(p0: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List): com.google.android.gms.common.api.PendingResult

    public fun dismissRequest(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun dismissRequests(p0: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List): com.google.android.gms.common.api.PendingResult

    public fun getGameRequestsFromBundle(p0: android.os.Bundle): java.util.ArrayList

    public fun getGameRequestsFromInboxResponse(p0: android.content.Intent): java.util.ArrayList

    public fun getInboxIntent(p0: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent

    public fun getMaxLifetimeDays(p0: com.google.android.gms.common.api.GoogleApiClient): Int

    public fun getMaxPayloadSize(p0: com.google.android.gms.common.api.GoogleApiClient): Int

    public fun getSendIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: ByteArray, p3: Int, p4: android.graphics.Bitmap, p5: String): android.content.Intent

    public fun loadRequests(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Int, p3: Int): com.google.android.gms.common.api.PendingResult

    public fun registerRequestListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.request.OnRequestReceivedListener)

    public fun unregisterRequestListener(p0: com.google.android.gms.common.api.GoogleApiClient)

    companion object {
    @JvmField public val EXTRA_REQUESTS: String = "requests"
    @JvmField public val REQUEST_DEFAULT_LIFETIME_DAYS: Int = 0
    @JvmField public val REQUEST_DIRECTION_INBOUND: Int = 0x0
    @JvmField public val REQUEST_DIRECTION_OUTBOUND: Int = 0x1
    @JvmField public val REQUEST_UPDATE_OUTCOME_FAIL: Int = 0x1
    @JvmField public val REQUEST_UPDATE_OUTCOME_RETRY: Int = 0x2
    @JvmField public val REQUEST_UPDATE_OUTCOME_SUCCESS: Int = 0x0
    @JvmField public val REQUEST_UPDATE_TYPE_ACCEPT: Int = 0x0
    @JvmField public val REQUEST_UPDATE_TYPE_DISMISS: Int = 0x1
    @JvmField public val SORT_ORDER_EXPIRING_SOON_FIRST: Int = 0x0
    @JvmField public val SORT_ORDER_SOCIAL_AGGREGATION: Int = 0x1
    }
}
