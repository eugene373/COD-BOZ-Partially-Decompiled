package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 6 methods.

class au: com.google.android.gms.dynamic.g() {
    private constructor()

    private fun b(p0: android.content.Context, p1: com.google.android.gms.internal.ay, p2: String, p3: com.google.android.gms.internal.cs): com.google.android.gms.internal.bd { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/bd;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         :try_start_0
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/au;->L(Landroid/content/Context;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/be;
    //         const v5, 0x5e2978
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/be;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/ct;I)Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/bd$a;->f(Landroid/os/IBinder;)Lcom/google/android/gms/internal/bd;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/dynamic/g$a; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not create remote AdManager."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         move-object v0, v6
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const-string v1, "Could not create remote AdManager."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         move-object v0, v6
    //         goto :goto_0
    */

    protected fun c(p0: android.os.IBinder): com.google.android.gms.internal.be { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/be;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/be$a;->g(Landroid/os/IBinder;)Lcom/google/android/gms/internal/be;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun d(p0: android.os.IBinder): Object { return TODO("body: (Landroid/os/IBinder;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/au;->c(Landroid/os/IBinder;)Lcom/google/android/gms/internal/be;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val nS: com.google.android.gms.internal.au = null!!

    public @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.ay, p2: String, p3: com.google.android.gms.internal.cs): com.google.android.gms.internal.bd { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/bd;") }
    /*
    //         .locals 6
    //         const v1, 0x5e2978
    //         invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/au;->nS:Lcom/google/android/gms/internal/au;
    //         invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/au;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/bd;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const-string v0, "Using AdManager from the client jar."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         new-instance v5, Lcom/google/android/gms/internal/gt;
    //         const/4 v0, 0x1
    //         invoke-direct {v5, v1, v1, v0}, Lcom/google/android/gms/internal/gt;-><init>(IIZ)V
    //         new-instance v0, Lcom/google/android/gms/internal/u;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/u;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/ct;Lcom/google/android/gms/internal/gt;)V
    //         :cond_1
    //         return-object v0
    */

    }
}
