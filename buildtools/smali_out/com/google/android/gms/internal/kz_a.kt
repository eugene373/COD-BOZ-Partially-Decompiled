package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 3 methods.

open class kz_a: com.google.android.gms.internal.km.a() {
    private val De: com.google.android.gms.common.api.BaseImplementation.b
    private var TL: Int
    private var TM: com.google.android.gms.fitness.result.DataReadResult

    private constructor(p0: com.google.android.gms.common.api.BaseImplementation.b)

    constructor(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.internal.kz.1)

    public fun a(p0: com.google.android.gms.fitness.result.DataReadResult) { /* TODO(body): (Lcom/google/android/gms/fitness/result/DataReadResult;)V */ }
    /*
    //         .locals 2
    //         monitor-enter p0
    //         :try_start_0
    //         const-string v0, "Fitness"
    //         const-string v1, "Received batch result"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/kz$a;->TM:Lcom/google/android/gms/fitness/result/DataReadResult;
    //         if-nez v0, :cond_1
    //         iput-object p1, p0, Lcom/google/android/gms/internal/kz$a;->TM:Lcom/google/android/gms/fitness/result/DataReadResult;
    //         :goto_0
    //         iget v0, p0, Lcom/google/android/gms/internal/kz$a;->TL:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/kz$a;->TL:I
    //         iget v0, p0, Lcom/google/android/gms/internal/kz$a;->TL:I
    //         iget-object v1, p0, Lcom/google/android/gms/internal/kz$a;->TM:Lcom/google/android/gms/fitness/result/DataReadResult;
    //         invoke-virtual {v1}, Lcom/google/android/gms/fitness/result/DataReadResult;->jH()I
    //         move-result v1
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/kz$a;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/kz$a;->TM:Lcom/google/android/gms/fitness/result/DataReadResult;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         :cond_0
    //         monitor-exit p0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/kz$a;->TM:Lcom/google/android/gms/fitness/result/DataReadResult;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/result/DataReadResult;->b(Lcom/google/android/gms/fitness/result/DataReadResult;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
