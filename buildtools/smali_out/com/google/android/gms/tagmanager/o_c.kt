package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class o_c: com.google.android.gms.tagmanager.bg {
    val aoB: com.google.android.gms.tagmanager.o

    private constructor(p0: com.google.android.gms.tagmanager.o)

    constructor(p0: com.google.android.gms.tagmanager.o, p1: com.google.android.gms.tagmanager.o.1)

    public fun a(p0: com.google.android.gms.tagmanager.bg.a) { /* TODO(body): (Lcom/google/android/gms/tagmanager/bg$a;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/o;->f(Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/tagmanager/n;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v1}, Lcom/google/android/gms/tagmanager/o;->f(Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/tagmanager/n;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/o;->b(Lcom/google/android/gms/common/api/Result;)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         const-wide/32 v2, 0x36ee80
    //         invoke-static {v0, v2, v3}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;J)V
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         sget-object v2, Lcom/google/android/gms/common/api/Status;->Jy:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/tagmanager/o;->aE(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/o;->b(Lcom/google/android/gms/common/api/Result;)V
    //         goto :goto_0
    */

    public fun b(p0: com.google.android.gms.internal.c.j) { /* TODO(body): (Lcom/google/android/gms/internal/c$j;)V */ }
    /*
    //         .locals 5
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p1, Lcom/google/android/gms/internal/c$j;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/o;->c(Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/internal/c$j;
    //         move-result-object v0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/c$j;->gs:Lcom/google/android/gms/internal/c$f;
    //         if-nez v0, :cond_0
    //         const-string v0, "Current resource is null; network resource is also null"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         const-wide/32 v2, 0x36ee80
    //         invoke-static {v0, v2, v3}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;J)V
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/o;->c(Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/internal/c$j;
    //         move-result-object v0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/c$j;->gs:Lcom/google/android/gms/internal/c$f;
    //         iput-object v0, p1, Lcom/google/android/gms/internal/c$j;->gs:Lcom/google/android/gms/internal/c$f;
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/internal/ju;
    //         move-result-object v2
    //         invoke-interface {v2}, Lcom/google/android/gms/internal/ju;->currentTimeMillis()J
    //         move-result-wide v2
    //         const/4 v4, 0x0
    //         invoke-static {v0, p1, v2, v3, v4}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/internal/c$j;JZ)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "setting refresh time to current time: "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/o;->d(Lcom/google/android/gms/tagmanager/o;)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/o;->e(Lcom/google/android/gms/tagmanager/o;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o$c;->aoB:Lcom/google/android/gms/tagmanager/o;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/internal/c$j;)V
    //         :cond_2
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun l(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/internal/c$j;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/o$c;->b(Lcom/google/android/gms/internal/c$j;)V
    //         return-void
    */

    public fun ob() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
