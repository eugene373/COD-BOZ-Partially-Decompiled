package com.google.android.gms.common.api

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class b_b: android.os.Handler() {
    val Jq: com.google.android.gms.common.api.b

    constructor(p0: com.google.android.gms.common.api.b, p1: android.os.Looper)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 2
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/b;)Ljava/util/concurrent/locks/Lock;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/b;->isConnecting()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/b;->e(Lcom/google/android/gms/common/api/b;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/b;)Ljava/util/concurrent/locks/Lock;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/b;->h(Lcom/google/android/gms/common/api/b;)I
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/b;->connect()V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/b;)Ljava/util/concurrent/locks/Lock;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b$b;->Jq:Lcom/google/android/gms/common/api/b;
    //         invoke-static {v1}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/b;)Ljava/util/concurrent/locks/Lock;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    //         :cond_2
    //         const-string v0, "GoogleApiClientImpl"
    //         const-string v1, "Don\'t know how to handle this message."
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

}
