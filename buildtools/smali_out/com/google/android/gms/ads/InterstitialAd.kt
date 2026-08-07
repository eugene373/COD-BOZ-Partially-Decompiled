package com.google.android.gms.ads

// Auto-emitted from smali.
// 1 fields, 12 methods.

class InterstitialAd {
    private val lj: com.google.android.gms.internal.bi

    public constructor(context: android.content.Context)

    public fun getAdListener(): com.google.android.gms.ads.AdListener { return TODO("body: ()Lcom/google/android/gms/ads/AdListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bi;->getAdListener()Lcom/google/android/gms/ads/AdListener;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAdUnitId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bi;->getAdUnitId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInAppPurchaseListener(): com.google.android.gms.ads.purchase.InAppPurchaseListener { return TODO("body: ()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bi;->getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMediationAdapterClassName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bi;->getMediationAdapterClassName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isLoaded(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bi;->isLoaded()Z
    //         move-result v0
    //         return v0
    */

    public fun loadAd(adRequest: com.google.android.gms.ads.AdRequest) { /* TODO(body): (Lcom/google/android/gms/ads/AdRequest;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->V()Lcom/google/android/gms/internal/bg;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bi;->a(Lcom/google/android/gms/internal/bg;)V
    //         return-void
    */

    public fun setAdListener(adListener: com.google.android.gms.ads.AdListener) { /* TODO(body): (Lcom/google/android/gms/ads/AdListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bi;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    //         return-void
    */

    public fun setAdUnitId(adUnitId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bi;->setAdUnitId(Ljava/lang/String;)V
    //         return-void
    */

    public fun setInAppPurchaseListener(inAppPurchaseListener: com.google.android.gms.ads.purchase.InAppPurchaseListener) { /* TODO(body): (Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bi;->setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    //         return-void
    */

    public fun setPlayStorePurchaseParams(playStorePurchaseListener: com.google.android.gms.ads.purchase.PlayStorePurchaseListener, publicKey: String) { /* TODO(body): (Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bi;->setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    //         return-void
    */

    public fun show() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->lj:Lcom/google/android/gms/internal/bi;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bi;->show()V
    //         return-void
    */

}
