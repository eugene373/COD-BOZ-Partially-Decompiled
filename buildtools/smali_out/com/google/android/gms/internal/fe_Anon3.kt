package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class fe_Anon3: Runnable {
    val tr: com.google.android.gms.internal.fe

    constructor(p0: com.google.android.gms.internal.fe)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fe;->a(Lcom/google/android/gms/internal/fe;)Ljava/lang/Object;
    //         move-result-object v6
    //         monitor-enter v6
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fe;->c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v0
    //         iget v0, v0, Lcom/google/android/gms/internal/fk;->errorCode:I
    //         const/4 v1, -0x2
    //         if-eq v0, v1, :cond_0
    //         monitor-exit v6
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fe;->d(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/gv;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/gw$a;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fe;->c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v0
    //         iget v0, v0, Lcom/google/android/gms/internal/fk;->errorCode:I
    //         const/4 v1, -0x3
    //         if-ne v0, v1, :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Loading URL in WebView: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/fe;->c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v1
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fe;->d(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/gv;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/fe;->c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v1
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->loadUrl(Ljava/lang/String;)V
    //         :goto_1
    //         monitor-exit v6
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v6
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         const-string v0, "Loading HTML in WebView."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fe;->d(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/gv;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/fe;->c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v1
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gj;->L(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fe$3;->tr:Lcom/google/android/gms/internal/fe;
    //         invoke-static {v2}, Lcom/google/android/gms/internal/fe;->c(Lcom/google/android/gms/internal/fe;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v2
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fk;->tG:Ljava/lang/String;
    //         const-string v3, "text/html"
    //         const-string v4, "UTF-8"
    //         const/4 v5, 0x0
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/gv;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    */

}
