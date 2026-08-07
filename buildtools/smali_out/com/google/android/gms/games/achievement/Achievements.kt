package com.google.android.gms.games.achievement

// Auto-emitted from smali.
// 0 fields, 10 methods.

interface Achievements {
    public fun getAchievementsIntent(p0: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent

    public fun increment(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int)

    public fun incrementImmediate(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int): com.google.android.gms.common.api.PendingResult

    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean): com.google.android.gms.common.api.PendingResult

    public fun reveal(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun revealImmediate(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun setSteps(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int)

    public fun setStepsImmediate(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: Int): com.google.android.gms.common.api.PendingResult

    public fun unlock(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun unlockImmediate(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

}
