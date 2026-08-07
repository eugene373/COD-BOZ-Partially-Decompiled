package com.google.android.gms.ads.purchase

// Auto-emitted from smali.
// 3 fields, 4 methods.

class InAppPurchaseActivity: android.app.Activity() {
    private var xk: com.google.android.gms.internal.ei

    public constructor()

    protected fun onActivityResult(requestCode: Int, resultCode: Int, data: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ei;->onActivityResult(IILandroid/content/Intent;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onActivityResult to in-app purchase manager:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-static {p0}, Lcom/google/android/gms/internal/en;->e(Landroid/app/Activity;)Lcom/google/android/gms/internal/ei;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         iget-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         if-nez v0, :cond_0
    //         const-string v0, "Could not create in-app purchase manager."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->finish()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ei;->onCreate()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onCreate to in-app purchase manager:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/purchase/InAppPurchaseActivity;->xk:Lcom/google/android/gms/internal/ei;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ei;->onDestroy()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onDestroy to in-app purchase manager:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CLASS_NAME: String = "com.google.android.gms.ads.purchase.InAppPurchaseActivity"
    @JvmField public val SIMPLE_CLASS_NAME: String = "InAppPurchaseActivity"
    }
}
