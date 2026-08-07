package com.google.android.gms.fitness

// Auto-emitted from smali.
// 0 fields, 7 methods.

interface RecordingApi {
    public fun listSubscriptions(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun listSubscriptions(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.DataType): com.google.android.gms.common.api.PendingResult

    public fun subscribe(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.common.api.PendingResult

    public fun subscribe(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.DataType): com.google.android.gms.common.api.PendingResult

    public fun unsubscribe(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.common.api.PendingResult

    public fun unsubscribe(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.DataType): com.google.android.gms.common.api.PendingResult

    public fun unsubscribe(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.Subscription): com.google.android.gms.common.api.PendingResult

}
