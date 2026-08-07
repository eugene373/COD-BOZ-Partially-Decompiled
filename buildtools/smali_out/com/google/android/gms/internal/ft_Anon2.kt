package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class ft_Anon2: com.google.android.gms.internal.by {
    val uu: com.google.android.gms.internal.ft

    constructor(p0: com.google.android.gms.internal.ft)

    public fun a(p0: com.google.android.gms.internal.gv, p1: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/gv;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ft$2;->uu:Lcom/google/android/gms/internal/ft;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ft;->a(Lcom/google/android/gms/internal/ft;)Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ft$2;->uu:Lcom/google/android/gms/internal/ft;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/ft;)Lcom/google/android/gms/internal/gk;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gk;->isDone()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v2, Lcom/google/android/gms/internal/fv;
    //         const/4 v0, -0x2
    //         invoke-direct {v2, v0, p2}, Lcom/google/android/gms/internal/fv;-><init>(ILjava/util/Map;)V
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/fv;->getUrl()Ljava/lang/String;
    //         move-result-object v3
    //         if-nez v3, :cond_1
    //         const-string v0, "URL missing in loadAdUrl GMSG."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         const-string v0, "%40mediation_adapters%40"
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v4
    //         const-string v0, "check_adapters"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/ft$2;->uu:Lcom/google/android/gms/internal/ft;
    //         invoke-static {v5}, Lcom/google/android/gms/internal/ft;->c(Lcom/google/android/gms/internal/ft;)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v0, v5}, Lcom/google/android/gms/internal/gf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v4, "%40mediation_adapters%40"
    //         invoke-virtual {v3, v4, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/fv;->setUrl(Ljava/lang/String;)V
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Ad request URL modified to "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ft$2;->uu:Lcom/google/android/gms/internal/ft;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ft;->b(Lcom/google/android/gms/internal/ft;)Lcom/google/android/gms/internal/gk;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/gk;->a(Ljava/lang/Object;)V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    */

}
