package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class fg: com.google.android.gms.internal.gg() {
    private val pQ: com.google.android.gms.internal.fi
    private val tu: com.google.android.gms.internal.ff.a

    public constructor(p0: com.google.android.gms.internal.fi, p1: com.google.android.gms.internal.ff.a)

    public fun cC()

    public fun cD(): com.google.android.gms.internal.fm

    public fun co() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fg;->cD()Lcom/google/android/gms/internal/fm;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fg;->cC()V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fg;->tu:Lcom/google/android/gms/internal/ff$a;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ff$a;->a(Lcom/google/android/gms/internal/fk;)V
    //         return-void
    //         :cond_1
    //         :try_start_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fg;->pQ:Lcom/google/android/gms/internal/fi;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/fg;->a(Lcom/google/android/gms/internal/fm;Lcom/google/android/gms/internal/fi;)Lcom/google/android/gms/internal/fk;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/fk;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fg;->cC()V
    //         throw v0
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fg;->cC()V
    //         return-void
    */

    companion object {
    private @JvmStatic fun a(p0: com.google.android.gms.internal.fm, p1: com.google.android.gms.internal.fi): com.google.android.gms.internal.fk { return TODO("body: (Lcom/google/android/gms/internal/fm;Lcom/google/android/gms/internal/fi;)Lcom/google/android/gms/internal/fk;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-interface {p0, p1}, Lcom/google/android/gms/internal/fm;->b(Lcom/google/android/gms/internal/fi;)Lcom/google/android/gms/internal/fk;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "Could not fetch ad response from ad request service."
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         const-string v2, "Could not fetch ad response from ad request service due to an Exception."
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :catch_2
    //         move-exception v1
    //         const-string v2, "Could not fetch ad response from ad request service due to an Exception."
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :catch_3
    //         move-exception v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gb;->e(Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    }
}
