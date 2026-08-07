package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 9 methods.

open class le: com.google.android.gms.fitness.BleApi {
    public constructor()

    public fun claimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, bleDevice: com.google.android.gms.fitness.data.BleDevice): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/BleDevice;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    public fun claimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, deviceAddress: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    public fun listClaimedBleDevices(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-static {v1}, Lcom/google/android/gms/fitness/result/BleDevicesResult;->D(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/BleDevicesResult;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    public fun startBleScan(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.StartBleScanRequest): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/StartBleScanRequest;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    public fun stopBleScan(client: com.google.android.gms.common.api.GoogleApiClient, callback: com.google.android.gms.fitness.request.BleScanCallback): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/BleScanCallback;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    public fun unclaimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, bleDevice: com.google.android.gms.fitness.data.BleDevice): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/BleDevice;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    public fun unclaimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, deviceAddress: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/internal/le;->Ue:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         return-object v0
    */

    companion object {
    private val Ue: com.google.android.gms.common.api.Status = null!!
    }
}
