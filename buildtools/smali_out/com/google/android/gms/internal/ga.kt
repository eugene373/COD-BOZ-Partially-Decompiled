package com.google.android.gms.internal

// Auto-emitted from smali.
// 12 fields, 11 methods.

open class ga {
    private val mw: Object
    private var uC: Boolean
    private val vA: String
    private var vB: Long
    private var vC: Long
    private var vD: Long
    private var vE: Long
    private var vF: Long
    private var vG: Long
    private val vx: com.google.android.gms.internal.gb
    private val vy: java.util.LinkedList
    private val vz: String

    public constructor(p0: com.google.android.gms.internal.gb, p1: String, p2: String)

    public constructor(p0: String, p1: String)

    public fun cO() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const-wide/16 v4, -0x1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vC:J
    //         cmp-long v0, v2, v4
    //         if-nez v0, :cond_0
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/ga;->vC:J
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->cY()Lcom/google/android/gms/internal/gc;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gc;->cO()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cP() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/ga$a;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/ga$a;-><init>()V
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ga$a;->cT()V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ga;->vy:Ljava/util/LinkedList;
    //         invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vE:J
    //         const-wide/16 v4, 0x1
    //         add-long/2addr v2, v4
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/ga;->vE:J
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->cY()Lcom/google/android/gms/internal/gc;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gc;->cP()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
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

    public fun cQ() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const-wide/16 v4, -0x1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vy:Ljava/util/LinkedList;
    //         invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vy:Ljava/util/LinkedList;
    //         invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ga$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ga$a;->cR()J
    //         move-result-wide v2
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ga$a;->cS()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
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

    public fun e(p0: com.google.android.gms.internal.av) { /* TODO(body): (Lcom/google/android/gms/internal/av;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/ga;->vF:J
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->cY()Lcom/google/android/gms/internal/gc;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vF:J
    //         invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/internal/gc;->b(Lcom/google/android/gms/internal/av;J)V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun j(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-wide p1, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
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

    public fun k(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iput-wide p1, p0, Lcom/google/android/gms/internal/ga;->vB:J
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
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

    public fun t(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/ga;->vD:J
    //         if-nez p1, :cond_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vD:J
    //         iput-wide v2, p0, Lcom/google/android/gms/internal/ga;->vC:J
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
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

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "seq_num"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ga;->vz:Ljava/lang/String;
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "slotid"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ga;->vA:Ljava/lang/String;
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "ismediation"
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/ga;->uC:Z
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         const-string v0, "treq"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ga;->vF:J
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v0, "tresponse"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v0, "timp"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ga;->vC:J
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v0, "tload"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ga;->vD:J
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v0, "pcc"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ga;->vE:J
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v0, "tfetch"
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/ga;->vB:J
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vy:Ljava/util/LinkedList;
    //         invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ga$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ga$a;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         const-string v0, "tclick"
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-object v2
    */

    public fun u(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ga;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga;->vG:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v0, v2, v4
    //         if-eqz v0, :cond_0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/ga;->uC:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ga;->vx:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->a(Lcom/google/android/gms/internal/ga;)V
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

}
