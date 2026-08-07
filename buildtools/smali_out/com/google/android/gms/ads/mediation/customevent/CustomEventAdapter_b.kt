package com.google.android.gms.ads.mediation.customevent

// Auto-emitted from smali.
// 3 fields, 7 methods.

open class CustomEventAdapter_b: com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener {
    private val m: com.google.android.gms.ads.mediation.MediationInterstitialListener
    private val xh: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter
    val xi: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter

    public constructor(p0: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter, p1: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter, p2: com.google.android.gms.ads.mediation.MediationInterstitialListener)

    public fun onAdClicked() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdClicked."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdClicked(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdClosed() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdClosed."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdClosed(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdFailedToLoad(errorCode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;I)V
    //         return-void
    */

    public fun onAdLeftApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdLeftApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdLeftApplication(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdLoaded() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onReceivedAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->xi:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdLoaded(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onAdOpened() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdOpened."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->m:Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdOpened(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

}
