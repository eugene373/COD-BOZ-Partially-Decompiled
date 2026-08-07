package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 2 methods.

open class dx_Anon1: Runnable {
    val sr: com.google.android.gms.internal.ea
    val ss: android.content.Intent
    val st: com.google.android.gms.internal.dx

    constructor(p0: com.google.android.gms.internal.dx, p1: com.google.android.gms.internal.ea, p2: android.content.Intent)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx$1;->st:Lcom/google/android/gms/internal/dx;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/dx;->a(Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/ee;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx$1;->sr:Lcom/google/android/gms/internal/ea;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/ea;->sB:Ljava/lang/String;
    //         const/4 v2, -0x1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/dx$1;->ss:Landroid/content/Intent;
    //         invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ee;->a(Ljava/lang/String;ILandroid/content/Intent;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx$1;->st:Lcom/google/android/gms/internal/dx;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/dx;->c(Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/el;
    //         move-result-object v7
    //         new-instance v0, Lcom/google/android/gms/internal/eb;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx$1;->st:Lcom/google/android/gms/internal/dx;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/dx;->b(Lcom/google/android/gms/internal/dx;)Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dx$1;->sr:Lcom/google/android/gms/internal/ea;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/ea;->sC:Ljava/lang/String;
    //         const/4 v3, 0x1
    //         const/4 v4, -0x1
    //         iget-object v5, p0, Lcom/google/android/gms/internal/dx$1;->ss:Landroid/content/Intent;
    //         iget-object v6, p0, Lcom/google/android/gms/internal/dx$1;->sr:Lcom/google/android/gms/internal/ea;
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/eb;-><init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/internal/ea;)V
    //         invoke-interface {v7, v0}, Lcom/google/android/gms/internal/el;->a(Lcom/google/android/gms/internal/ek;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx$1;->st:Lcom/google/android/gms/internal/dx;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/dx;->c(Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/el;
    //         move-result-object v7
    //         new-instance v0, Lcom/google/android/gms/internal/eb;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx$1;->st:Lcom/google/android/gms/internal/dx;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/dx;->b(Lcom/google/android/gms/internal/dx;)Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dx$1;->sr:Lcom/google/android/gms/internal/ea;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/ea;->sC:Ljava/lang/String;
    //         const/4 v3, 0x0
    //         const/4 v4, -0x1
    //         iget-object v5, p0, Lcom/google/android/gms/internal/dx$1;->ss:Landroid/content/Intent;
    //         iget-object v6, p0, Lcom/google/android/gms/internal/dx$1;->sr:Lcom/google/android/gms/internal/ea;
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/eb;-><init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/internal/ea;)V
    //         invoke-interface {v7, v0}, Lcom/google/android/gms/internal/el;->a(Lcom/google/android/gms/internal/ek;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "Fail to verify and dispatch pending transaction"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_0
    */

}
