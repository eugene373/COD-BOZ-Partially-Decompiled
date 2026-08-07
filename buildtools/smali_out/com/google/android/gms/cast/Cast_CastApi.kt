package com.google.android.gms.cast

// Auto-emitted from smali.
// 0 fields, 19 methods.

interface Cast_CastApi {
    public fun getApplicationMetadata(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.cast.ApplicationMetadata

    public fun getApplicationStatus(p0: com.google.android.gms.common.api.GoogleApiClient): String

    public fun getVolume(p0: com.google.android.gms.common.api.GoogleApiClient): Double

    public fun isMute(p0: com.google.android.gms.common.api.GoogleApiClient): Boolean

    public fun joinApplication(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun joinApplication(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun joinApplication(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String): com.google.android.gms.common.api.PendingResult

    public fun launchApplication(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun launchApplication(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: com.google.android.gms.cast.LaunchOptions): com.google.android.gms.common.api.PendingResult

    public fun launchApplication(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Boolean): com.google.android.gms.common.api.PendingResult

    public fun leaveApplication(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun removeMessageReceivedCallbacks(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun requestStatus(p0: com.google.android.gms.common.api.GoogleApiClient)

    public fun sendMessage(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String): com.google.android.gms.common.api.PendingResult

    public fun setMessageReceivedCallbacks(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: com.google.android.gms.cast.Cast.MessageReceivedCallback)

    public fun setMute(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean)

    public fun setVolume(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Double)

    public fun stopApplication(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun stopApplication(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

}
