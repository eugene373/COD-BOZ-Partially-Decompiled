package com.google.ads.mediation.customevent

// Auto-emitted from smali.
// 2 fields, 7 methods.

class CustomEventAdapter_a: com.google.ads.mediation.customevent.CustomEventBannerListener {
    private val q: com.google.ads.mediation.customevent.CustomEventAdapter
    private val r: com.google.ads.mediation.MediationBannerListener

    public constructor(p0: com.google.ads.mediation.customevent.CustomEventAdapter, p1: com.google.ads.mediation.MediationBannerListener)

    public fun onClick() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->r:Lcom/google/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationBannerListener;->onClick(Lcom/google/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onDismissScreen() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->r:Lcom/google/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationBannerListener;->onDismissScreen(Lcom/google/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onFailedToReceiveAd() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->r:Lcom/google/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         sget-object v2, Lcom/google/ads/AdRequest$ErrorCode;->NO_FILL:Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-interface {v0, v1, v2}, Lcom/google/ads/mediation/MediationBannerListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationBannerAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V
    //         return-void
    */

    public fun onLeaveApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->r:Lcom/google/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationBannerListener;->onLeaveApplication(Lcom/google/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onPresentScreen() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onFailedToReceiveAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->r:Lcom/google/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationBannerListener;->onPresentScreen(Lcom/google/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onReceivedAd(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onReceivedAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-static {v0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->r:Lcom/google/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->q:Lcom/google/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/ads/mediation/MediationBannerListener;->onReceivedAd(Lcom/google/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

}
