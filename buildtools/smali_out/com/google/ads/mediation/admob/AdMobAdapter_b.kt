package com.google.ads.mediation.admob

// Auto-emitted from smali.
// 2 fields, 6 methods.

class AdMobAdapter_b: com.google.android.gms.ads.AdListener() {
    private val k: com.google.ads.mediation.admob.AdMobAdapter
    private val m: com.google.android.gms.ads.mediation.MediationInterstitialListener

    public constructor(p0: com.google.ads.mediation.admob.AdMobAdapter, p1: com.google.android.gms.ads.mediation.MediationInterstitialListener)

    public fun onAdClosed() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdClosed(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdFailedToLoad(errorCode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;I)V
    //         return-void
    */

    public fun onAdLeftApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdLeftApplication(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdLoaded() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdLoaded(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdOpened() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter$b;->k:Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdOpened(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

}
