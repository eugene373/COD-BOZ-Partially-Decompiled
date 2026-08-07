package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class ep: com.google.android.gms.ads.purchase.InAppPurchase {
    private val sx: com.google.android.gms.internal.eg

    public constructor(p0: com.google.android.gms.internal.eg)

    public fun getProductId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ep;->sx:Lcom/google/android/gms/internal/eg;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/eg;->getProductId()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward getProductId to InAppPurchase"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun recordPlayBillingResolution(billingResponseCode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ep;->sx:Lcom/google/android/gms/internal/eg;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/eg;->recordPlayBillingResolution(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward recordPlayBillingResolution to InAppPurchase"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun recordResolution(resolution: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ep;->sx:Lcom/google/android/gms/internal/eg;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/eg;->recordResolution(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward recordResolution to InAppPurchase"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

}
