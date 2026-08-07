package com.google.ads.mediation.customevent

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class CustomEventAdapter_b: com.google.ads.mediation.customevent.CustomEventInterstitialListener {
    private val q: com.google.ads.mediation.customevent.CustomEventAdapter
    private val s: com.google.ads.mediation.MediationInterstitialListener
    val t: com.google.ads.mediation.customevent.CustomEventAdapter

    public constructor(p0: com.google.ads.mediation.customevent.CustomEventAdapter, p1: com.google.ads.mediation.customevent.CustomEventAdapter, p2: com.google.ads.mediation.MediationInterstitialListener)

    public fun onDismissScreen() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onDismissScreen."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->s:Lcom/google/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationInterstitialListener;->onDismissScreen(Lcom/google/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onFailedToReceiveAd() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->s:Lcom/google/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         sget-object v2, Lcom/google/ads/AdRequest$ErrorCode;->NO_FILL:Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-interface {v0, v1, v2}, Lcom/google/ads/mediation/MediationInterstitialListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationInterstitialAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V
    //         return-void
    */

    public fun onLeaveApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onLeaveApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->s:Lcom/google/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationInterstitialListener;->onLeaveApplication(Lcom/google/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onPresentScreen() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onPresentScreen."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->s:Lcom/google/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationInterstitialListener;->onPresentScreen(Lcom/google/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

    public fun onReceivedAd() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onReceivedAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->s:Lcom/google/ads/mediation/MediationInterstitialListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->t:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationInterstitialListener;->onReceivedAd(Lcom/google/ads/mediation/MediationInterstitialAdapter;)V
    //         return-void
    */

}
