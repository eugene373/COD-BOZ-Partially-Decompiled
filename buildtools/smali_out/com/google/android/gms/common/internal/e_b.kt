package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class e_b {
    val LF: com.google.android.gms.common.internal.e
    private var LG: Boolean
    private var mListener: Object

    public constructor(p0: com.google.android.gms.common.internal.e, p1: Object)

    protected fun g(p0: Object)

    protected fun gT()

    public fun gU() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         monitor-enter p0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$b;->mListener:Ljava/lang/Object;
    //         iget-boolean v1, p0, Lcom/google/android/gms/common/internal/e$b;->LG:Z
    //         if-eqz v1, :cond_0
    //         const-string v1, "GmsClient"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Callback proxy "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " being reused. This is not safe."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         :try_start_1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/e$b;->g(Ljava/lang/Object;)V
    //         :try_end_1
    //         .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    //         :goto_0
    //         monitor-enter p0
    //         const/4 v0, 0x1
    //         :try_start_2
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/internal/e$b;->LG:Z
    //         monitor-exit p0
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e$b;->unregister()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit p0
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e$b;->gT()V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e$b;->gT()V
    //         goto :goto_0
    //         :catchall_1
    //         move-exception v0
    //         :try_start_4
    //         monitor-exit p0
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_1
    //         throw v0
    */

    public fun gV() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         monitor-enter p0
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iput-object v0, p0, Lcom/google/android/gms/common/internal/e$b;->mListener:Ljava/lang/Object;
    //         monitor-exit p0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun unregister() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e$b;->gV()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$b;->LF:Lcom/google/android/gms/common/internal/e;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/e;->b(Lcom/google/android/gms/common/internal/e;)Ljava/util/ArrayList;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$b;->LF:Lcom/google/android/gms/common/internal/e;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/e;->b(Lcom/google/android/gms/common/internal/e;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
