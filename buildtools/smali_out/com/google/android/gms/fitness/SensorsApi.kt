package com.google.android.gms.fitness

// Auto-emitted from smali.
// 0 fields, 5 methods.

interface SensorsApi {
    public fun add(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.SensorRequest, p2: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun add(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.SensorRequest, p2: com.google.android.gms.fitness.request.OnDataPointListener): com.google.android.gms.common.api.PendingResult

    public fun findDataSources(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.DataSourcesRequest): com.google.android.gms.common.api.PendingResult

    public fun remove(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun remove(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.OnDataPointListener): com.google.android.gms.common.api.PendingResult

}
