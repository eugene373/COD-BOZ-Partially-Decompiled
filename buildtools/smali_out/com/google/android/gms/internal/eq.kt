package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

class eq: com.google.android.gms.internal.el.a() {
    private val oD: com.google.android.gms.ads.purchase.PlayStorePurchaseListener

    public constructor(p0: com.google.android.gms.ads.purchase.PlayStorePurchaseListener)

    public fun a(p0: com.google.android.gms.internal.ek) { /* TODO(body): (Lcom/google/android/gms/internal/ek;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eq;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         new-instance v1, Lcom/google/android/gms/internal/eo;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/internal/eo;-><init>(Lcom/google/android/gms/internal/ek;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;->onInAppPurchaseFinished(Lcom/google/android/gms/ads/purchase/InAppPurchaseResult;)V
    //         return-void
    */

    public fun isValidPurchase(productId: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/eq;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;->isValidPurchase(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

}
