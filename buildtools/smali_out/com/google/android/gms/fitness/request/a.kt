package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class a: com.google.android.gms.fitness.request.l.a() {
    private val Uf: com.google.android.gms.fitness.request.BleScanCallback

    private constructor(p0: com.google.android.gms.fitness.request.BleScanCallback)

    constructor(p0: com.google.android.gms.fitness.request.BleScanCallback, p1: com.google.android.gms.fitness.request.a.1)

    public fun onDeviceFound(device: com.google.android.gms.fitness.data.BleDevice) { /* TODO(body): (Lcom/google/android/gms/fitness/data/BleDevice;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/a;->Uf:Lcom/google/android/gms/fitness/request/BleScanCallback;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/request/BleScanCallback;->onDeviceFound(Lcom/google/android/gms/fitness/data/BleDevice;)V
    //         return-void
    */

    public fun onScanStopped() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/a;->Uf:Lcom/google/android/gms/fitness/request/BleScanCallback;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/BleScanCallback;->onScanStopped()V
    //         return-void
    */

}
