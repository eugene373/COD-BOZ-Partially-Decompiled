package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class eo: com.google.android.gms.ads.purchase.InAppPurchaseResult {
    private val sL: com.google.android.gms.internal.ek

    public constructor(p0: com.google.android.gms.internal.ek)

    public fun finishPurchase() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eo;->sL:Lcom/google/android/gms/internal/ek;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ek;->finishPurchase()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward finishPurchase to InAppPurchaseResult"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun getProductId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eo;->sL:Lcom/google/android/gms/internal/ek;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ek;->getProductId()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward getProductId to InAppPurchaseResult"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getPurchaseData(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eo;->sL:Lcom/google/android/gms/internal/ek;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ek;->getPurchaseData()Landroid/content/Intent;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward getPurchaseData to InAppPurchaseResult"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getResultCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eo;->sL:Lcom/google/android/gms/internal/ek;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ek;->getResultCode()I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward getPurchaseData to InAppPurchaseResult"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isVerified(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eo;->sL:Lcom/google/android/gms/internal/ek;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ek;->isVerified()Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward isVerified to InAppPurchaseResult"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
