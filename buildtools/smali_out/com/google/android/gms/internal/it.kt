package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 10 methods.

class it {
    private var Hv: Long
    private var Hw: Long
    private var Hx: Long
    private var Hy: com.google.android.gms.internal.is

    public constructor(p0: Long)

    private fun fU() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-wide/16 v0, -0x1
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/it;->Hy:Lcom/google/android/gms/internal/is;
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/it;->Hx:J
    //         return-void
    */

    public fun a(p0: Long, p1: com.google.android.gms.internal.is) { /* TODO(body): (JLcom/google/android/gms/internal/is;)V */ }
    /*
    //         .locals 7
    //         sget-object v1, Lcom/google/android/gms/internal/it;->Hz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/it;->Hy:Lcom/google/android/gms/internal/is;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         iput-wide p1, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         iput-object p3, p0, Lcom/google/android/gms/internal/it;->Hy:Lcom/google/android/gms/internal/is;
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v4
    //         iput-wide v4, p0, Lcom/google/android/gms/internal/it;->Hx:J
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/is;->n(J)V
    //         :cond_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun b(p0: Long, p1: Int, p2: org.json.JSONObject): Boolean { return TODO("body: (JILorg/json/JSONObject;)Z") }
    /*
    //         .locals 9
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const/4 v0, 0x0
    //         sget-object v3, Lcom/google/android/gms/internal/it;->Hz:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         const-wide/16 v6, -0x1
    //         cmp-long v4, v4, v6
    //         if-eqz v4, :cond_1
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         cmp-long v4, v4, p1
    //         if-nez v4, :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/it;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "request %d completed"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         iget-wide v6, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         invoke-virtual {v0, v2, v4}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/it;->Hy:Lcom/google/android/gms/internal/is;
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/it;->fU()V
    //         :goto_0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/is;->a(JILorg/json/JSONObject;)V
    //         :cond_0
    //         return v1
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v3
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_0
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         sget-object v1, Lcom/google/android/gms/internal/it;->Hz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/it;->fU()V
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

    public fun d(p0: Long, p1: Int): Boolean { return TODO("body: (JI)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/it;->b(JILorg/json/JSONObject;)Z
    //         move-result v0
    //         return v0
    */

    public fun e(p0: Long, p1: Int): Boolean { return TODO("body: (JI)Z") }
    /*
    //         .locals 11
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         const/4 v2, 0x0
    //         const-wide/16 v0, 0x0
    //         sget-object v5, Lcom/google/android/gms/internal/it;->Hz:Ljava/lang/Object;
    //         monitor-enter v5
    //         :try_start_0
    //         iget-wide v6, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         const-wide/16 v8, -0x1
    //         cmp-long v6, v6, v8
    //         if-eqz v6, :cond_1
    //         iget-wide v6, p0, Lcom/google/android/gms/internal/it;->Hx:J
    //         sub-long v6, p1, v6
    //         iget-wide v8, p0, Lcom/google/android/gms/internal/it;->Hv:J
    //         cmp-long v6, v6, v8
    //         if-ltz v6, :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/it;->Gr:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "request %d timed out"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         iget-wide v8, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v7
    //         aput-object v7, v2, v6
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         iget-object v2, p0, Lcom/google/android/gms/internal/it;->Hy:Lcom/google/android/gms/internal/is;
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/it;->fU()V
    //         :goto_0
    //         monitor-exit v5
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v2, :cond_0
    //         invoke-interface {v2, v0, v1, p3, v3}, Lcom/google/android/gms/internal/is;->a(JILorg/json/JSONObject;)V
    //         :cond_0
    //         return v4
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v5
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_1
    //         move v4, v2
    //         move-object v2, v3
    //         goto :goto_0
    */

    public fun fV(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         sget-object v1, Lcom/google/android/gms/internal/it;->Hz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun p(p0: Long): Boolean { return TODO("body: (J)Z") }
    /*
    //         .locals 7
    //         sget-object v1, Lcom/google/android/gms/internal/it;->Hz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/it;->Hw:J
    //         cmp-long v0, v2, p1
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    companion object {
    private val Gr: com.google.android.gms.internal.ip = null!!
    @JvmField public val Hz: Object = null!!
    }
}
