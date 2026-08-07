package com.google.android.gms.fitness

// Auto-emitted from smali.
// 0 fields, 7 methods.

interface BleApi {
    public fun claimBleDevice(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.BleDevice): com.google.android.gms.common.api.PendingResult

    public fun claimBleDevice(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun listClaimedBleDevices(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun startBleScan(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.StartBleScanRequest): com.google.android.gms.common.api.PendingResult

    public fun stopBleScan(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.BleScanCallback): com.google.android.gms.common.api.PendingResult

    public fun unclaimBleDevice(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.BleDevice): com.google.android.gms.common.api.PendingResult

    public fun unclaimBleDevice(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

}
