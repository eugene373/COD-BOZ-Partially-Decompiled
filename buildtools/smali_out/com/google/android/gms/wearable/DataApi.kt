package com.google.android.gms.wearable

// Auto-emitted from smali.
// 0 fields, 9 methods.

interface DataApi {
    public fun addListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.DataApi.DataListener): com.google.android.gms.common.api.PendingResult

    public fun deleteDataItems(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.net.Uri): com.google.android.gms.common.api.PendingResult

    public fun getDataItem(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.net.Uri): com.google.android.gms.common.api.PendingResult

    public fun getDataItems(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun getDataItems(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.net.Uri): com.google.android.gms.common.api.PendingResult

    public fun getFdForAsset(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.Asset): com.google.android.gms.common.api.PendingResult

    public fun getFdForAsset(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.DataItemAsset): com.google.android.gms.common.api.PendingResult

    public fun putDataItem(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.PutDataRequest): com.google.android.gms.common.api.PendingResult

    public fun removeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.DataApi.DataListener): com.google.android.gms.common.api.PendingResult

}
