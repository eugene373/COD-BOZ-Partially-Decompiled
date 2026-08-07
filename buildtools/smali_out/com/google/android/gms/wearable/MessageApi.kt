package com.google.android.gms.wearable

// Auto-emitted from smali.
// 1 fields, 3 methods.

interface MessageApi {
    public fun addListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.MessageApi.MessageListener): com.google.android.gms.common.api.PendingResult

    public fun removeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.MessageApi.MessageListener): com.google.android.gms.common.api.PendingResult

    public fun sendMessage(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String, p3: ByteArray): com.google.android.gms.common.api.PendingResult

    companion object {
    @JvmField public val UNKNOWN_REQUEST_ID: Int = 0
    }
}
