package com.google.android.gms.common.api

// Auto-emitted from smali.
// 24 fields, 42 methods.

class b: com.google.android.gms.common.api.GoogleApiClient {
    private val IH: android.os.Looper
    val IU: Int
    private val IV: java.util.concurrent.locks.Lock
    private val IW: java.util.concurrent.locks.Condition
    private val IX: com.google.android.gms.common.internal.f
    private val IY: Int
    val IZ: java.util.Queue
    private val Iz: com.google.android.gms.common.api.b.a
    private var Ja: com.google.android.gms.common.ConnectionResult
    private var Jb: Int
    private var Jc: Int
    private var Jd: Int
    private var Je: Boolean
    private var Jf: Int
    private var Jg: Long
    val Jh: android.os.Handler
    private val Ji: android.os.Bundle
    private val Jj: java.util.Map
    private val Jk: java.util.List
    private var Jl: Boolean
    private val Jm: java.util.Set
    val Jn: java.util.Set
    private val Jo: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    private val Jp: com.google.android.gms.common.internal.f.b

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: java.util.Map, p4: java.util.Set, p5: java.util.Set, p6: Int, p7: Int)

    private fun a(p0: com.google.android.gms.common.api.b.c) { /* TODO(body): (Lcom/google/android/gms/common/api/b$c;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<A::",
    //                 "Lcom/google/android/gms/common/api/Api$a;",
    //                 ">(",
    //                 "Lcom/google/android/gms/common/api/b$c",
    //                 "<TA;>;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/DeadObjectException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/b$c;->ge()Lcom/google/android/gms/common/api/Api$c;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "This task can not be executed or enqueued (it\'s probably a Batch or malformed)"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jn:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Iz:Lcom/google/android/gms/common/api/b$a;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/b$c;->a(Lcom/google/android/gms/common/api/b$a;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->go()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0x8
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/b$c;->m(Lcom/google/android/gms/common/api/Status;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         :try_start_1
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/b$c;->ge()Lcom/google/android/gms/common/api/Api$c;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/b$c;->b(Lcom/google/android/gms/common/api/Api$a;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    */

    private fun aj(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x3
    //         const/4 v3, 0x1
    //         const/4 v4, -0x1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         if-eq v0, v1, :cond_b
    //         if-ne p1, v4, :cond_5
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnecting()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IZ:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/b$c;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/b$c;->gj()I
    //         move-result v2
    //         if-eq v2, v3, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/b$c;->cancel()V
    //         invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IZ:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->clear()V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jn:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/b$c;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/b$c;->cancel()V
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jn:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jm:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/c;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/c;->clear()V
    //         goto :goto_2
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jm:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         if-nez v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IZ:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Je:Z
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         :goto_3
    //         return-void
    //         :cond_5
    //         :try_start_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnecting()Z
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v1
    //         const/4 v2, 0x3
    //         iput v2, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         if-eqz v0, :cond_7
    //         if-ne p1, v4, :cond_6
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IW:Ljava/util/concurrent/locks/Condition;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    //         :cond_7
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Jl:Z
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jj:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_8
    //         :goto_4
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_9
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/Api$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/Api$a;->isConnected()Z
    //         move-result v3
    //         if-eqz v3, :cond_8
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/Api$a;->disconnect()V
    //         goto :goto_4
    //         :cond_9
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Jl:Z
    //         const/4 v0, 0x4
    //         iput v0, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         if-eqz v1, :cond_b
    //         if-eq p1, v4, :cond_a
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->aB(I)V
    //         :cond_a
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Jl:Z
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :cond_b
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_3
    */

    private fun gm() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jf:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/common/api/b;->Jf:I
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jf:I
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         if-eqz v0, :cond_2
    //         iput-boolean v4, p0, Lcom/google/android/gms/common/api/b;->Je:Z
    //         const/4 v0, 0x3
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/b;->aj(I)V
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->go()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jh:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->Jh:Landroid/os/Handler;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
    //         move-result-object v1
    //         iget-wide v2, p0, Lcom/google/android/gms/common/api/b;->Jg:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    //         :goto_0
    //         iput-boolean v4, p0, Lcom/google/android/gms/common/api/b;->Jl:Z
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/f;->b(Lcom/google/android/gms/common/ConnectionResult;)V
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x2
    //         iput v0, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->gp()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IW:Ljava/util/concurrent/locks/Condition;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->gn()V
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Je:Z
    //         if-eqz v0, :cond_3
    //         iput-boolean v4, p0, Lcom/google/android/gms/common/api/b;->Je:Z
    //         const/4 v0, -0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/b;->aj(I)V
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ji:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         const/4 v0, 0x0
    //         :goto_2
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/common/internal/f;->d(Landroid/os/Bundle;)V
    //         goto :goto_1
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ji:Landroid/os/Bundle;
    //         goto :goto_2
    */

    private fun gn() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->go()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "GoogleApiClient is not connected yet."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IZ:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         if-nez v0, :cond_2
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IZ:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/b$c;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/b$c;)V
    //         :try_end_1
    //         .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         :try_start_2
    //         const-string v1, "GoogleApiClientImpl"
    //         const-string v2, "Service died while flushing queue"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         return-void
    */

    private fun go(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jd:I
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun gp() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iput v0, p0, Lcom/google/android/gms/common/api/b;->Jd:I
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jh:Landroid/os/Handler;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.common.api.Api.c): com.google.android.gms.common.api.Api.a { return TODO("body: (Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<C::",
    //                 "Lcom/google/android/gms/common/api/Api$a;",
    //                 ">(",
    //                 "Lcom/google/android/gms/common/api/Api$c",
    //                 "<TC;>;)TC;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jj:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/Api$a;
    //         const-string v1, "Appropriate Api was not requested."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object v0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.a): com.google.android.gms.common.api.BaseImplementation.a { return TODO("body: (Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<A::",
    //                 "Lcom/google/android/gms/common/api/Api$a;",
    //                 "R::",
    //                 "Lcom/google/android/gms/common/api/Result;",
    //                 "T:",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$a",
    //                 "<TR;TA;>;>(TT;)TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->getLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;-><init>(Landroid/os/Looper;)V
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$a;->a(Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/b;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         return-object p1
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IZ:Ljava/util/Queue;
    //         invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.common.api.Scope): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/Scope;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jk:Ljava/util/List;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Scope;->gs()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun b(p0: com.google.android.gms.common.api.BaseImplementation.a): com.google.android.gms.common.api.BaseImplementation.a { return TODO("body: (Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<A::",
    //                 "Lcom/google/android/gms/common/api/Api$a;",
    //                 "T:",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$a",
    //                 "<+",
    //                 "Lcom/google/android/gms/common/api/Result;",
    //                 "TA;>;>(TT;)TT;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->go()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v2, "GoogleApiClient is not connected yet."
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->gn()V
    //         :try_start_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/b;->a(Lcom/google/android/gms/common/api/b$c;)V
    //         :try_end_0
    //         .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         return-object p1
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/common/api/b;->aj(I)V
    //         goto :goto_1
    */

    public fun blockingConnect(): com.google.android.gms.common.ConnectionResult { return TODO("body: ()Lcom/google/android/gms/common/ConnectionResult;") }
    /*
    //         .locals 3
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "blockingConnect must not be called on the UI thread"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->connect()V
    //         :goto_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnecting()Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IW:Ljava/util/concurrent/locks/Condition;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         :try_start_2
    //         invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    //         new-instance v0, Lcom/google/android/gms/common/ConnectionResult;
    //         const/16 v1, 0xf
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         :goto_2
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         :try_start_3
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->HE:Lcom/google/android/gms/common/ConnectionResult;
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_2
    //         :cond_2
    //         :try_start_4
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_2
    //         :cond_3
    //         :try_start_5
    //         new-instance v0, Lcom/google/android/gms/common/ConnectionResult;
    //         const/16 v1, 0xd
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    */

    public fun blockingConnect(timeout: Long, unit: java.util.concurrent.TimeUnit): com.google.android.gms.common.ConnectionResult { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/ConnectionResult;") }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         if-eq v0, v1, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "blockingConnect must not be called on the UI thread"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->connect()V
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
    //         move-result-wide v0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnecting()Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         :try_start_1
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/b;->IW:Ljava/util/concurrent/locks/Condition;
    //         invoke-interface {v2, v0, v1}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J
    //         move-result-wide v0
    //         const-wide/16 v2, 0x0
    //         cmp-long v2, v0, v2
    //         if-gtz v2, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/ConnectionResult;
    //         const/16 v1, 0xe
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :try_start_2
    //         invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    //         new-instance v0, Lcom/google/android/gms/common/ConnectionResult;
    //         const/16 v1, 0xf
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_1
    //         :cond_2
    //         :try_start_3
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->HE:Lcom/google/android/gms/common/ConnectionResult;
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_1
    //         :cond_3
    //         :try_start_4
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_1
    //         :cond_4
    //         :try_start_5
    //         new-instance v0, Lcom/google/android/gms/common/ConnectionResult;
    //         const/16 v1, 0xd
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    */

    public fun c(p0: Object): com.google.android.gms.common.api.c { return TODO("body: (Ljava/lang/Object;)Lcom/google/android/gms/common/api/c;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<",
    //                 "L:Ljava/lang/Object;",
    //                 ">(T",
    //                 "L;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/c",
    //                 "<T",
    //                 "L;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const-string v0, "Listener must not be null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/common/api/c;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IH:Landroid/os/Looper;
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/api/c;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->Jm:Ljava/util/Set;
    //         invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    */

    public fun connect() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Je:Z
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->isConnecting()Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x1
    //         :try_start_1
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Jl:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ji:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jj:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->size()I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/common/api/b;->Jf:I
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Jj:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/Api$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/Api$a;->connect()V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         throw v0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    //         goto :goto_0
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->gp()V
    //         const/4 v0, -0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/b;->aj(I)V
    //         return-void
    */

    public fun getLooper(): android.os.Looper { return TODO("body: ()Landroid/os/Looper;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IH:Landroid/os/Looper;
    //         return-object v0
    */

    public fun isConnected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isConnecting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isConnectionCallbacksRegistered(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionFailedListenerRegistered(listener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    //         move-result v0
    //         return v0
    */

    public fun reconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->disconnect()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/b;->connect()V
    //         return-void
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun stopAutoManage(lifecycleActivity: android.support.v4.app.FragmentActivity) { /* TODO(body): (Landroid/support/v4/app/FragmentActivity;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->IY:I
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Called stopAutoManage but automatic lifecycle management is not enabled."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-static {p1}, Lcom/google/android/gms/common/api/d;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/google/android/gms/common/api/d;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/common/api/b;->IY:I
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/d;->al(I)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun unregisterConnectionCallbacks(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun unregisterConnectionFailedListener(listener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.common.api.b, p1: com.google.android.gms.common.ConnectionResult): com.google.android.gms.common.ConnectionResult { return TODO("body: (Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/ConnectionResult;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         return-object p1
    */

    private @JvmStatic fun a(p0: com.google.android.gms.common.api.Api.b, p1: Object, p2: android.content.Context, p3: android.os.Looper, p4: com.google.android.gms.common.internal.ClientSettings, p5: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p6: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Lcom/google/android/gms/common/api/Api$b;Ljava/lang/Object;Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<C::",
    //                 "Lcom/google/android/gms/common/api/Api$a;",
    //                 "O:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/common/api/Api$b",
    //                 "<TC;TO;>;",
    //                 "Ljava/lang/Object;",
    //                 "Landroid/content/Context;",
    //                 "Landroid/os/Looper;",
    //                 "Lcom/google/android/gms/common/internal/ClientSettings;",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;",
    //                 ")TC;"
    //             }
    //         .end annotation
    //         move-object v0, p0
    //         move-object v1, p2
    //         move-object v2, p3
    //         move-object v3, p4
    //         move-object v4, p1
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/common/api/Api$b;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.api.b): java.util.concurrent.locks.Lock { return TODO("body: (Lcom/google/android/gms/common/api/b;)Ljava/util/concurrent/locks/Lock;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->IV:Ljava/util/concurrent/locks/Lock;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.api.b, p1: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/b;I)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/b;->aj(I)V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.api.b): Int { return TODO("body: (Lcom/google/android/gms/common/api/b;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jc:I
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.api.b, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/common/api/b;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/common/api/b;->Jd:I
    //         return p1
    */

    @JvmStatic fun c(p0: com.google.android.gms.common.api.b, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/common/api/b;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/common/api/b;->Jb:I
    //         return p1
    */

    @JvmStatic fun c(p0: com.google.android.gms.common.api.b): android.os.Bundle { return TODO("body: (Lcom/google/android/gms/common/api/b;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ji:Landroid/os/Bundle;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.common.api.b) { /* TODO(body): (Lcom/google/android/gms/common/api/b;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->gm()V
    //         return-void
    */

    @JvmStatic fun e(p0: com.google.android.gms.common.api.b): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/b;)Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/common/api/b;->go()Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.common.api.b): Long { return TODO("body: (Lcom/google/android/gms/common/api/b;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/common/api/b;->Jg:J
    //         return-wide v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.common.api.b): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/b;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/api/b;->Jl:Z
    //         return v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.common.api.b): Int { return TODO("body: (Lcom/google/android/gms/common/api/b;)I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jd:I
    //         add-int/lit8 v1, v0, -0x1
    //         iput v1, p0, Lcom/google/android/gms/common/api/b;->Jd:I
    //         return v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.common.api.b): com.google.android.gms.common.ConnectionResult { return TODO("body: (Lcom/google/android/gms/common/api/b;)Lcom/google/android/gms/common/ConnectionResult;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/b;->Ja:Lcom/google/android/gms/common/ConnectionResult;
    //         return-object v0
    */

    @JvmStatic fun j(p0: com.google.android.gms.common.api.b): Int { return TODO("body: (Lcom/google/android/gms/common/api/b;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/api/b;->Jb:I
    //         return v0
    */

    }
}
