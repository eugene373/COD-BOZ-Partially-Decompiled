package com.google.android.gms.ads.mediation.customevent

// Auto-emitted from smali.
// 2 fields, 7 methods.

class CustomEventAdapter_a: com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener {
    private val l: com.google.android.gms.ads.mediation.MediationBannerListener
    private val xh: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter

    public constructor(p0: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter, p1: com.google.android.gms.ads.mediation.MediationBannerListener)

    public fun onAdClicked() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdClicked."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdClicked(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdClosed() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdClosed."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdClosed(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdFailedToLoad(errorCode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdFailedToLoad."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;I)V
    //         return-void
    */

    public fun onAdLeftApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdLeftApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdLeftApplication(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdLoaded(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdLoaded."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->a(Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdLoaded(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

    public fun onAdOpened() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "Custom event adapter called onAdOpened."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->l:Lcom/google/android/gms/ads/mediation/MediationBannerListener;
    //         iget-object v1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;->xh:Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdOpened(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V
    //         return-void
    */

}
