package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 6 methods.

open class fn: com.google.android.gms.internal.gg() {
    private val mw: Object
    private val sZ: com.google.android.gms.internal.fk
    private val tU: com.google.android.gms.internal.fo
    private var tV: java.util.concurrent.Future
    private val tm: com.google.android.gms.internal.fd.a
    private val tn: com.google.android.gms.internal.fz.a

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.u, p2: com.google.android.gms.internal.ai, p3: com.google.android.gms.internal.fz.a, p4: com.google.android.gms.internal.fd.a)

    constructor(p0: com.google.android.gms.internal.fz.a, p1: com.google.android.gms.internal.fd.a, p2: com.google.android.gms.internal.fo)

    private fun r(p0: Int): com.google.android.gms.internal.fz { return TODO("body: (I)Lcom/google/android/gms/internal/fz;") }
    /*
    //         .locals 31
    //         new-instance v2, Lcom/google/android/gms/internal/fz;
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/google/android/gms/internal/fn;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v7, 0x0
    //         const/4 v8, 0x0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->sZ:Lcom/google/android/gms/internal/fk;
    //         iget v9, v6, Lcom/google/android/gms/internal/fk;->orientation:I
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->sZ:Lcom/google/android/gms/internal/fk;
    //         iget-wide v10, v6, Lcom/google/android/gms/internal/fk;->qj:J
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v6, v6, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;
    //         iget-object v12, v6, Lcom/google/android/gms/internal/fi;->tA:Ljava/lang/String;
    //         const/4 v13, 0x0
    //         const/4 v14, 0x0
    //         const/4 v15, 0x0
    //         const/16 v16, 0x0
    //         const/16 v17, 0x0
    //         const/16 v18, 0x0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->sZ:Lcom/google/android/gms/internal/fk;
    //         iget-wide v0, v6, Lcom/google/android/gms/internal/fk;->tJ:J
    //         move-wide/from16 v19, v0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v0, v6, Lcom/google/android/gms/internal/fz$a;->lH:Lcom/google/android/gms/internal/ay;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->sZ:Lcom/google/android/gms/internal/fk;
    //         iget-wide v0, v6, Lcom/google/android/gms/internal/fk;->tH:J
    //         move-wide/from16 v22, v0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-wide v0, v6, Lcom/google/android/gms/internal/fz$a;->vs:J
    //         move-wide/from16 v24, v0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->sZ:Lcom/google/android/gms/internal/fk;
    //         iget-wide v0, v6, Lcom/google/android/gms/internal/fk;->tM:J
    //         move-wide/from16 v26, v0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->sZ:Lcom/google/android/gms/internal/fk;
    //         iget-object v0, v6, Lcom/google/android/gms/internal/fk;->tN:Ljava/lang/String;
    //         move-object/from16 v28, v0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/google/android/gms/internal/fn;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v0, v6, Lcom/google/android/gms/internal/fz$a;->vp:Lorg/json/JSONObject;
    //         move-object/from16 v29, v0
    //         const/16 v30, 0x0
    //         move/from16 v6, p1
    //         invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/internal/fz;-><init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gv;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/co;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bq$a;)V
    //         return-object v2
    */

    public fun co() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v3, -0x1
    //         const/4 v2, -0x2
    //         const/4 v1, 0x0
    //         :try_start_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/fn;->mw:Ljava/lang/Object;
    //         monitor-enter v4
    //         :try_end_0
    //         .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fn;->tU:Lcom/google/android/gms/internal/fo;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gi;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/fn;->tV:Ljava/util/concurrent/Future;
    //         monitor-exit v4
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fn;->tV:Ljava/util/concurrent/Future;
    //         const-wide/32 v4, 0xea60
    //         sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-interface {v0, v4, v5, v6}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/fz;
    //         :try_end_2
    //         .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    //         .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    //         move v1, v2
    //         :goto_0
    //         if-eqz v0, :cond_0
    //         :goto_1
    //         sget-object v1, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v2, Lcom/google/android/gms/internal/fn$1;
    //         invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/fn$1;-><init>(Lcom/google/android/gms/internal/fn;Lcom/google/android/gms/internal/fz;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v4
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         :try_start_4
    //         throw v0
    //         :try_end_4
    //         .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    //         .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2
    //         .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "Timed out waiting for native ad."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x2
    //         move-object v7, v1
    //         move v1, v0
    //         move-object v0, v7
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const/4 v0, 0x0
    //         move-object v7, v1
    //         move v1, v0
    //         move-object v0, v7
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         move-object v0, v1
    //         move v1, v3
    //         goto :goto_0
    //         :catch_3
    //         move-exception v0
    //         move-object v0, v1
    //         move v1, v3
    //         goto :goto_0
    //         :cond_0
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/fn;->r(I)Lcom/google/android/gms/internal/fz;
    //         move-result-object v0
    //         goto :goto_1
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fn;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fn;->tV:Ljava/util/concurrent/Future;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fn;->tV:Ljava/util/concurrent/Future;
    //         const/4 v2, 0x1
    //         invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.fn): com.google.android.gms.internal.fd.a { return TODO("body: (Lcom/google/android/gms/internal/fn;)Lcom/google/android/gms/internal/fd$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fn;->tm:Lcom/google/android/gms/internal/fd$a;
    //         return-object v0
    */

    }
}
