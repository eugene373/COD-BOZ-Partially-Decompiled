package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 7 methods.

class en: com.google.android.gms.dynamic.g() {
    private constructor()

    private fun f(p0: android.app.Activity): com.google.android.gms.internal.ei { return TODO("body: (Landroid/app/Activity;)Lcom/google/android/gms/internal/ei;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         :try_start_0
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/en;->L(Landroid/content/Context;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ej;
    //         invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ej;->b(Lcom/google/android/gms/dynamic/d;)Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ei$a;->u(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ei;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/dynamic/g$a; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "Could not create remote InAppPurchaseManager."
    //         invoke-static {v2, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const-string v2, "Could not create remote InAppPurchaseManager."
    //         invoke-static {v2, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    protected fun d(p0: android.os.IBinder): Object { return TODO("body: (Landroid/os/IBinder;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/en;->y(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ej;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun y(p0: android.os.IBinder): com.google.android.gms.internal.ej { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/ej;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ej$a;->v(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ej;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val sK: com.google.android.gms.internal.en = null!!

    private @JvmStatic fun c(p0: android.app.Activity): Boolean { return TODO("body: (Landroid/app/Activity;)Z") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/internal/en$a;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         const-string v1, "com.google.android.gms.ads.internal.purchase.useClientJar"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/en$a;
    //         const-string v1, "InAppPurchaseManager requires the useClientJar flag in intent extras."
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/en$a;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v1, "com.google.android.gms.ads.internal.purchase.useClientJar"
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun e(p0: android.app.Activity): com.google.android.gms.internal.ei { return TODO("body: (Landroid/app/Activity;)Lcom/google/android/gms/internal/ei;") }
    /*
    //         .locals 1
    //         :try_start_0
    //         invoke-static {p0}, Lcom/google/android/gms/internal/en;->c(Landroid/app/Activity;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "Using AdOverlay from the client jar."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         new-instance v0, Lcom/google/android/gms/internal/dz;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/dz;-><init>(Landroid/app/Activity;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/en;->sK:Lcom/google/android/gms/internal/en;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/en;->f(Landroid/app/Activity;)Lcom/google/android/gms/internal/ei;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/internal/en$a; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/en$a;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
