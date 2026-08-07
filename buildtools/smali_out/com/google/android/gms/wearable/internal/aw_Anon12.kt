package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 3 fields, 2 methods.

open class aw_Anon12: com.google.android.gms.wearable.internal.a() {
    val avG: com.google.android.gms.wearable.MessageApi.MessageListener
    val avT: com.google.android.gms.wearable.internal.aw
    val avV: com.google.android.gms.common.api.BaseImplementation.b

    constructor(p0: com.google.android.gms.wearable.internal.aw, p1: com.google.android.gms.wearable.MessageApi.MessageListener, p2: com.google.android.gms.common.api.BaseImplementation.b)

    public fun a(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw$12;->avT:Lcom/google/android/gms/wearable/internal/aw;
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/internal/aw;->c(Lcom/google/android/gms/wearable/internal/aw;)Ljava/util/HashMap;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw$12;->avT:Lcom/google/android/gms/wearable/internal/aw;
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/internal/aw;->c(Lcom/google/android/gms/wearable/internal/aw;)Ljava/util/HashMap;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/aw$12;->avG:Lcom/google/android/gms/wearable/MessageApi$MessageListener;
    //         invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw$12;->avV:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

}
