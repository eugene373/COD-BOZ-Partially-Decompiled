package com.google.android.gms.internal

// Auto-emitted from smali.
// 11 fields, 15 methods.

class cp: com.google.android.gms.internal.cq.a {
    private val lq: com.google.android.gms.internal.ct
    private val mContext: android.content.Context
    private val ml: com.google.android.gms.internal.av
    private val mw: Object
    private val qo: String
    private val qp: Long
    private val qq: com.google.android.gms.internal.cl
    private val qr: com.google.android.gms.internal.ay
    private val qs: com.google.android.gms.internal.gt
    private var qt: com.google.android.gms.internal.cu
    private var qu: Int

    public constructor(p0: android.content.Context, p1: String, p2: com.google.android.gms.internal.ct, p3: com.google.android.gms.internal.cm, p4: com.google.android.gms.internal.cl, p5: com.google.android.gms.internal.av, p6: com.google.android.gms.internal.ay, p7: com.google.android.gms.internal.gt)

    private fun a(p0: Long, p1: Long, p2: Long, p3: Long) { /* TODO(body): (JJJJ)V */ }
    /*
    //         .locals 3
    //         :goto_0
    //         iget v0, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         const/4 v1, -0x2
    //         if-eq v0, v1, :cond_0
    //         return-void
    //         :cond_0
    //         invoke-direct/range {p0 .. p8}, Lcom/google/android/gms/internal/cp;->b(JJJJ)V
    //         goto :goto_0
    */

    private fun a(p0: com.google.android.gms.internal.co) { /* TODO(body): (Lcom/google/android/gms/internal/co;)V */ }
    /*
    //         .locals 7
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qs:Lcom/google/android/gms/internal/gt;
    //         iget v0, v0, Lcom/google/android/gms/internal/gt;->wF:I
    //         const v1, 0x3e8fa0
    //         if-ge v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qr:Lcom/google/android/gms/internal/ay;
    //         iget-boolean v0, v0, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cp;->ml:Lcom/google/android/gms/internal/av;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/cl;->qc:Ljava/lang/String;
    //         invoke-interface {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/cu;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/av;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cp;->qr:Lcom/google/android/gms/internal/ay;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/cp;->ml:Lcom/google/android/gms/internal/av;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v4, v4, Lcom/google/android/gms/internal/cl;->qc:Ljava/lang/String;
    //         move-object v5, p1
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/cu;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/av;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not request ad from mediation adapter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x5
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/cp;->j(I)V
    //         goto :goto_0
    //         :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qr:Lcom/google/android/gms/internal/ay;
    //         iget-boolean v0, v0, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cp;->ml:Lcom/google/android/gms/internal/av;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/cl;->qc:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v4, v4, Lcom/google/android/gms/internal/cl;->pW:Ljava/lang/String;
    //         move-object v5, p1
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/cu;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/av;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mContext:Landroid/content/Context;
    //         invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cp;->qr:Lcom/google/android/gms/internal/ay;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/cp;->ml:Lcom/google/android/gms/internal/av;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v4, v4, Lcom/google/android/gms/internal/cl;->qc:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v5, v5, Lcom/google/android/gms/internal/cl;->pW:Ljava/lang/String;
    //         move-object v6, p1
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/cu;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/av;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/cv;)V
    //         :try_end_1
    //         .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    private fun b(p0: Long, p1: Long, p2: Long, p3: Long) { /* TODO(body): (JJJJ)V */ }
    /*
    //         .locals 7
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         sub-long v2, v0, p1
    //         sub-long v2, p3, v2
    //         sub-long/2addr v0, p5
    //         sub-long v0, p7, v0
    //         const-wide/16 v4, 0x0
    //         cmp-long v4, v2, v4
    //         if-lez v4, :cond_0
    //         const-wide/16 v4, 0x0
    //         cmp-long v4, v0, v4
    //         if-gtz v4, :cond_1
    //         :cond_0
    //         const-string v0, "Timed out waiting for adapter."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         const/4 v0, 0x3
    //         iput v0, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         :goto_0
    //         return-void
    //         :cond_1
    //         :try_start_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J
    //         move-result-wide v0
    //         invoke-virtual {v4, v0, v1}, Ljava/lang/Object;->wait(J)V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         goto :goto_0
    */

    private fun bE(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/cl;->qa:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->lq:Lcom/google/android/gms/internal/ct;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/cl;->qa:Ljava/lang/String;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ct;->y(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.ads.mediation.customevent.CustomEventAdapter"
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "Fail to determine the custom event\'s version, assuming the old one."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :cond_1
    //         const-string v0, "com.google.ads.mediation.customevent.CustomEventAdapter"
    //         goto :goto_0
    */

    private fun bF(): com.google.android.gms.internal.cu { return TODO("body: ()Lcom/google/android/gms/internal/cu;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Instantiating mediation adapter: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->qo:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->lq:Lcom/google/android/gms/internal/ct;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->qo:Ljava/lang/String;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ct;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/cu;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not instantiate mediation adapter: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cp;->qo:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun b(p0: Long, p1: Long): com.google.android.gms.internal.cq { return TODO("body: (JJ)Lcom/google/android/gms/internal/cq;") }
    /*
    //         .locals 13
    //         iget-object v10, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         monitor-enter v10
    //         :try_start_0
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v2
    //         new-instance v11, Lcom/google/android/gms/internal/co;
    //         invoke-direct {v11}, Lcom/google/android/gms/internal/co;-><init>()V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/cp$1;
    //         invoke-direct {v1, p0, v11}, Lcom/google/android/gms/internal/cp$1;-><init>(Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/co;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/cp;->qp:J
    //         move-object v1, p0
    //         move-wide v6, p1
    //         move-wide/from16 v8, p3
    //         invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/cp;->a(JJJJ)V
    //         new-instance v0, Lcom/google/android/gms/internal/cq;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->qq:Lcom/google/android/gms/internal/cl;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/cp;->qo:Ljava/lang/String;
    //         iget v5, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         move-object v4, v11
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/cq;-><init>(Lcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/co;I)V
    //         monitor-exit v10
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v10
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cu;->destroy()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         :goto_0
    //         const/4 v0, -0x1
    //         :try_start_1
    //         iput v0, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    //         monitor-exit v1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "Could not destroy mediation adapter."
    //         invoke-static {v2, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun j(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput p1, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notify()V
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
    @JvmStatic fun a(p0: com.google.android.gms.internal.cp, p1: com.google.android.gms.internal.cu): com.google.android.gms.internal.cu { return TODO("body: (Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/cu;)Lcom/google/android/gms/internal/cu;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.cp): Object { return TODO("body: (Lcom/google/android/gms/internal/cp;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->mw:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.cp, p1: com.google.android.gms.internal.co) { /* TODO(body): (Lcom/google/android/gms/internal/cp;Lcom/google/android/gms/internal/co;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/cp;->a(Lcom/google/android/gms/internal/co;)V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.cp): Int { return TODO("body: (Lcom/google/android/gms/internal/cp;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/cp;->qu:I
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.internal.cp): com.google.android.gms.internal.cu { return TODO("body: (Lcom/google/android/gms/internal/cp;)Lcom/google/android/gms/internal/cu;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/cp;->bF()Lcom/google/android/gms/internal/cu;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.internal.cp): com.google.android.gms.internal.cu { return TODO("body: (Lcom/google/android/gms/internal/cp;)Lcom/google/android/gms/internal/cu;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cp;->qt:Lcom/google/android/gms/internal/cu;
    //         return-object v0
    */

    }
}
