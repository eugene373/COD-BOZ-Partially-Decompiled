package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 19 methods.

open class ij_c: com.google.android.gms.internal.io.a() {
    val GQ: com.google.android.gms.internal.ij
    private var GR: java.util.concurrent.atomic.AtomicBoolean

    private constructor(p0: com.google.android.gms.internal.ij)

    constructor(p0: com.google.android.gms.internal.ij, p1: com.google.android.gms.internal.ij.1)

    private fun ag(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fJ()Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->j(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->j(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-result-object v0
    //         new-instance v2, Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         const/4 v2, 0x0
    //         invoke-static {v0, v2}, Lcom/google/android/gms/internal/ij;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/common/api/BaseImplementation$b;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         const/4 v0, 0x1
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         monitor-exit v1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun c(p0: Long, p1: Int) { /* TODO(body): (JI)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->i(Lcom/google/android/gms/internal/ij;)Ljava/util/Map;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->i(Lcom/google/android/gms/internal/ij;)Ljava/util/Map;
    //         move-result-object v0
    //         invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_0
    //         new-instance v1, Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v1, p3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
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

    public fun a(p0: com.google.android.gms.cast.ApplicationMetadata, p1: String, p2: String, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 8
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {p1}, Lcom/google/android/gms/cast/ApplicationMetadata;->getApplicationId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0, p3}, Lcom/google/android/gms/internal/ij;->b(Lcom/google/android/gms/internal/ij;Ljava/lang/String;)Ljava/lang/String;
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fI()Ljava/lang/Object;
    //         move-result-object v6
    //         monitor-enter v6
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-result-object v7
    //         new-instance v0, Lcom/google/android/gms/internal/ij$a;
    //         new-instance v1, Lcom/google/android/gms/common/api/Status;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p3
    //         move v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ij$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V
    //         invoke-interface {v7, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/common/api/BaseImplementation$b;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         :cond_1
    //         monitor-exit v6
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v6
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun a(p0: String, p1: Double, p2: Boolean) { /* TODO(body): (Ljava/lang/String;DZ)V */ }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fH()Lcom/google/android/gms/internal/ip;
    //         move-result-object v0
    //         const-string v1, "Deprecated callback: \"onStatusreceived\""
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         return-void
    */

    public fun a(p0: String, p1: Long) { /* TODO(body): (Ljava/lang/String;J)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         invoke-direct {p0, p2, p3, v0}, Lcom/google/android/gms/internal/ij$c;->c(JI)V
    //         goto :goto_0
    */

    public fun a(p0: String, p1: Long, p2: Int) { /* TODO(body): (Ljava/lang/String;JI)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/internal/ij$c;->c(JI)V
    //         goto :goto_0
    */

    public fun ac(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ij$c;->fK()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fH()Lcom/google/android/gms/internal/ip;
    //         move-result-object v0
    //         const-string v1, "ICastDeviceControllerListener.onDisconnected: %d"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         const/4 v1, 0x2
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ij;->aA(I)V
    //         goto :goto_0
    */

    public fun ad(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fI()Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-result-object v0
    //         new-instance v2, Lcom/google/android/gms/internal/ij$a;
    //         new-instance v3, Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ij$a;-><init>(Lcom/google/android/gms/common/api/Status;)V
    //         invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         const/4 v2, 0x0
    //         invoke-static {v0, v2}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/common/api/BaseImplementation$b;)Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         :cond_1
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun ae(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ij$c;->ag(I)Z
    //         goto :goto_0
    */

    public fun af(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ij$c;->ag(I)Z
    //         goto :goto_0
    */

    public fun b(p0: com.google.android.gms.internal.ig) { /* TODO(body): (Lcom/google/android/gms/internal/ig;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fH()Lcom/google/android/gms/internal/ip;
    //         move-result-object v0
    //         const-string v1, "onApplicationStatusChanged"
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->f(Lcom/google/android/gms/internal/ij;)Landroid/os/Handler;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/ij$c$3;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ij$c$3;-><init>(Lcom/google/android/gms/internal/ij$c;Lcom/google/android/gms/internal/ig;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    public fun b(p0: com.google.android.gms.internal.il) { /* TODO(body): (Lcom/google/android/gms/internal/il;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fH()Lcom/google/android/gms/internal/ip;
    //         move-result-object v0
    //         const-string v1, "onDeviceStatusChanged"
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->f(Lcom/google/android/gms/internal/ij;)Landroid/os/Handler;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/ij$c$2;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ij$c$2;-><init>(Lcom/google/android/gms/internal/ij$c;Lcom/google/android/gms/internal/il;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    public fun b(p0: String, p1: ByteArray) { /* TODO(body): (Ljava/lang/String;[B)V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fH()Lcom/google/android/gms/internal/ip;
    //         move-result-object v0
    //         const-string v1, "IGNORING: Receive (type=binary, ns=%s) <%d bytes>"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         const/4 v3, 0x1
    //         array-length v4, p2
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    */

    public fun fK(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ij;->c(Lcom/google/android/gms/internal/ij;)V
    //         goto :goto_0
    */

    public fun fL(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         return v0
    */

    public fun k(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/ij;->fH()Lcom/google/android/gms/internal/ip;
    //         move-result-object v0
    //         const-string v1, "Receive (type=text, ns=%s) %s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         const/4 v3, 0x1
    //         aput-object p2, v2, v3
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->f(Lcom/google/android/gms/internal/ij;)Landroid/os/Handler;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/ij$c$4;
    //         invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ij$c$4;-><init>(Lcom/google/android/gms/internal/ij$c;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    public fun onApplicationDisconnected(statusCode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GR:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/ij;->b(Lcom/google/android/gms/internal/ij;Ljava/lang/String;)Ljava/lang/String;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ij$c;->ag(I)Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->e(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/cast/Cast$Listener;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$c;->GQ:Lcom/google/android/gms/internal/ij;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ij;->f(Lcom/google/android/gms/internal/ij;)Landroid/os/Handler;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/ij$c$1;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ij$c$1;-><init>(Lcom/google/android/gms/internal/ij$c;I)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

}
