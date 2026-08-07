package com.google.android.gms.fitness

// Auto-emitted from smali.
// 0 fields, 3 methods.

interface HistoryApi {
    public fun deleteData(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.DataDeleteRequest): com.google.android.gms.common.api.PendingResult

    public fun insertData(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.DataSet): com.google.android.gms.common.api.PendingResult

    public fun readData(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.DataReadRequest): com.google.android.gms.common.api.PendingResult

}
