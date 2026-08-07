package com.google.android.gms.wearable

// Auto-emitted from smali.
// 2 fields, 2 methods.

open class WearableListenerService_a_Anon1: Runnable {
    val avg: com.google.android.gms.common.data.DataHolder
    val avh: com.google.android.gms.wearable.WearableListenerService.a

    constructor(p0: com.google.android.gms.wearable.WearableListenerService.a, p1: com.google.android.gms.common.data.DataHolder)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v1, Lcom/google/android/gms/wearable/DataEventBuffer;
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$a$1;->avg:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/wearable/DataEventBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$a$1;->avh:Lcom/google/android/gms/wearable/WearableListenerService$a;
    //         iget-object v0, v0, Lcom/google/android/gms/wearable/WearableListenerService$a;->avf:Lcom/google/android/gms/wearable/WearableListenerService;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/wearable/DataEventBuffer;->release()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Lcom/google/android/gms/wearable/DataEventBuffer;->release()V
    //         throw v0
    */

}
