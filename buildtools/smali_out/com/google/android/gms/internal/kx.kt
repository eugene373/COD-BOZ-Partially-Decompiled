package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 8 methods.

open class kx: com.google.android.gms.fitness.BleApi {
    public constructor()

    public fun claimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, bleDevice: com.google.android.gms.fitness.data.BleDevice): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/BleDevice;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/kx$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/kx$4;-><init>(Lcom/google/android/gms/internal/kx;Lcom/google/android/gms/fitness/data/BleDevice;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun claimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, deviceAddress: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/kx$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/kx$3;-><init>(Lcom/google/android/gms/internal/kx;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun listClaimedBleDevices(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/kx$6;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kx$6;-><init>(Lcom/google/android/gms/internal/kx;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun startBleScan(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.StartBleScanRequest): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/StartBleScanRequest;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/kx$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/kx$1;-><init>(Lcom/google/android/gms/internal/kx;Lcom/google/android/gms/fitness/request/StartBleScanRequest;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun stopBleScan(client: com.google.android.gms.common.api.GoogleApiClient, requestCallback: com.google.android.gms.fitness.request.BleScanCallback): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/BleScanCallback;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/kx$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/kx$2;-><init>(Lcom/google/android/gms/internal/kx;Lcom/google/android/gms/fitness/request/BleScanCallback;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unclaimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, bleDevice: com.google.android.gms.fitness.data.BleDevice): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/BleDevice;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/BleDevice;->getAddress()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/kx;->unclaimBleDevice(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unclaimBleDevice(client: com.google.android.gms.common.api.GoogleApiClient, deviceAddress: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/kx$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/kx$5;-><init>(Lcom/google/android/gms/internal/kx;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
