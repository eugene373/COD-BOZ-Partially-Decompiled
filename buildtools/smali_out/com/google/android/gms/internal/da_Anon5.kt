package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 2 methods.

open class da_Anon5: Runnable {
    val qI: com.google.android.gms.internal.da
    val qJ: com.google.ads.AdRequest.ErrorCode

    constructor(p0: com.google.android.gms.internal.da, p1: com.google.ads.AdRequest.ErrorCode)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da$5;->qI:Lcom/google/android/gms/internal/da;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/da;->a(Lcom/google/android/gms/internal/da;)Lcom/google/android/gms/internal/cv;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/da$5;->qJ:Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/db;->a(Lcom/google/ads/AdRequest$ErrorCode;)I
    //         move-result v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cv;->onAdFailedToLoad(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdFailedToLoad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

}
