package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 5 methods.

open class oz: com.google.android.gms.dynamic.g() {
    protected constructor()

    protected fun bQ(p0: android.os.IBinder): com.google.android.gms.internal.ou { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/ou;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ou$a;->bM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ou;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun d(p0: android.os.IBinder): Object { return TODO("body: (Landroid/os/IBinder;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oz;->bQ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ou;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private var aux: com.google.android.gms.internal.oz

    public @JvmStatic fun a(p0: android.app.Activity, p1: com.google.android.gms.dynamic.c, p2: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p3: com.google.android.gms.internal.os): com.google.android.gms.internal.or { return TODO("body: (Landroid/app/Activity;Lcom/google/android/gms/dynamic/c;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/os;)Lcom/google/android/gms/internal/or;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v1, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V
    //         throw v1
    //         :cond_0
    //         :try_start_0
    //         invoke-static {}, Lcom/google/android/gms/internal/oz;->pP()Lcom/google/android/gms/internal/oz;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/oz;->L(Landroid/content/Context;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ou;
    //         invoke-static {p0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ou;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/c;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/os;)Lcom/google/android/gms/internal/or;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/dynamic/g$a; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private @JvmStatic fun pP(): com.google.android.gms.internal.oz { return TODO("body: ()Lcom/google/android/gms/internal/oz;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/oz;->aux:Lcom/google/android/gms/internal/oz;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/oz;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/oz;-><init>()V
    //         sput-object v0, Lcom/google/android/gms/internal/oz;->aux:Lcom/google/android/gms/internal/oz;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/oz;->aux:Lcom/google/android/gms/internal/oz;
    //         return-object v0
    */

    }
}
