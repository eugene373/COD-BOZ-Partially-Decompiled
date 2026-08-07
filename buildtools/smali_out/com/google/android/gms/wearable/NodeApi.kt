package com.google.android.gms.wearable

// Auto-emitted from smali.
// 0 fields, 4 methods.

interface NodeApi {
    public fun addListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.NodeApi.NodeListener): com.google.android.gms.common.api.PendingResult

    public fun getConnectedNodes(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun getLocalNode(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun removeListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.NodeApi.NodeListener): com.google.android.gms.common.api.PendingResult

}
