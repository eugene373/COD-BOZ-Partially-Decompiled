package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 11 fields, 12 methods.

open class a {
    private var anM: Long
    private var anN: Long
    private var anO: Long
    private var anP: com.google.android.gms.tagmanager.a.a
    private var mClosed: Boolean
    private val mContext: android.content.Context
    private val wf: Thread
    private var xB: com.google.android.gms.ads.identifier.AdvertisingIdClient.Info
    private val yD: com.google.android.gms.internal.ju

    private constructor(p0: android.content.Context)

    constructor(p0: android.content.Context, p1: com.google.android.gms.tagmanager.a.a, p2: com.google.android.gms.internal.ju)

    private fun nK() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/16 v0, 0xa
    //         invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V
    //         :goto_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/a;->mClosed:Z
    //         if-nez v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->anP:Lcom/google/android/gms/tagmanager/a$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/tagmanager/a$a;->nM()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/a;->anM:J
    //         invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "sleep interrupted in AdvertiserDataPoller thread; continuing"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->U(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    private fun nL() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->yD:Lcom/google/android/gms/internal/ju;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ju;->currentTimeMillis()J
    //         move-result-wide v0
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/a;->anO:J
    //         sub-long/2addr v0, v2
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/a;->anN:J
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/a;->interrupt()V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->yD:Lcom/google/android/gms/internal/ju;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ju;->currentTimeMillis()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/tagmanager/a;->anO:J
    //         goto :goto_0
    */

    fun interrupt() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->wf:Ljava/lang/Thread;
    //         invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    //         return-void
    */

    public fun isLimitAdTrackingEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->nL()V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun nJ(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->nL()V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->xB:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->wf:Ljava/lang/Thread;
    //         invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    //         return-void
    */

    companion object {
    private var anQ: com.google.android.gms.tagmanager.a
    private var xz: Object

    @JvmStatic fun W(p0: android.content.Context): com.google.android.gms.tagmanager.a { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/tagmanager/a;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/tagmanager/a;->anQ:Lcom/google/android/gms/tagmanager/a;
    //         if-nez v0, :cond_1
    //         sget-object v1, Lcom/google/android/gms/tagmanager/a;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/a;->anQ:Lcom/google/android/gms/tagmanager/a;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/tagmanager/a;->anQ:Lcom/google/android/gms/tagmanager/a;
    //         sget-object v0, Lcom/google/android/gms/tagmanager/a;->anQ:Lcom/google/android/gms/tagmanager/a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/a;->start()V
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/a;->anQ:Lcom/google/android/gms/tagmanager/a;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.a): android.content.Context { return TODO("body: (Lcom/google/android/gms/tagmanager/a;)Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.tagmanager.a) { /* TODO(body): (Lcom/google/android/gms/tagmanager/a;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->nK()V
    //         return-void
    */

    }
}
