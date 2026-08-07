package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 1 fields, 2 methods.

class f_a: android.os.Handler() {
    val LR: com.google.android.gms.common.internal.f

    public constructor(p0: com.google.android.gms.common.internal.f, p1: android.os.Looper)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 3
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f$a;->LR:Lcom/google/android/gms/common/internal/f;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->a(Lcom/google/android/gms/common/internal/f;)Ljava/util/ArrayList;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f$a;->LR:Lcom/google/android/gms/common/internal/f;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->b(Lcom/google/android/gms/common/internal/f;)Lcom/google/android/gms/common/internal/f$b;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/common/internal/f$b;->gq()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f$a;->LR:Lcom/google/android/gms/common/internal/f;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->b(Lcom/google/android/gms/common/internal/f;)Lcom/google/android/gms/common/internal/f$b;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/common/internal/f$b;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f$a;->LR:Lcom/google/android/gms/common/internal/f;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->a(Lcom/google/android/gms/common/internal/f;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f$a;->LR:Lcom/google/android/gms/common/internal/f;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->b(Lcom/google/android/gms/common/internal/f;)Lcom/google/android/gms/common/internal/f$b;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/common/internal/f$b;->fC()Landroid/os/Bundle;
    //         move-result-object v2
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    //         invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;->onConnected(Landroid/os/Bundle;)V
    //         :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         const-string v0, "GmsClientEvents"
    //         const-string v1, "Don\'t know how to handle this message."
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

}
