package com.google.ads.mediation.admob

// Auto-emitted from smali.
// 2 fields, 6 methods.

class AdMobAdapter_a: com.google.android.gms.ads.AdListener() {
    private val k: com.google.ads.mediation.admob.AdMobAdapter
    private val l: com.google.android.gms.ads.mediation.MediationBannerListener

    public constructor(p0: com.google.ads.mediation.admob.AdMobAdapter, p1: com.google.android.gms.ads.mediation.MediationBannerListener)

    public fun onAdClosed() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdClosed(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdFailedToLoad(errorCode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;I)V
    //         return-void
    */

    public fun onAdLeftApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdLeftApplication(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdLoaded() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdLoaded(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdOpened() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdClicked(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$a;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdOpened(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

}
