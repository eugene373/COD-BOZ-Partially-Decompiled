package com.google.ads.mediation.customevent

// Auto-emitted from smali.
// 3 fields, 13 methods.

class CustomEventAdapter: com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.MediationInterstitialAdapter {
    private var n: android.view.View
    private var o: com.google.ads.mediation.customevent.CustomEventBanner
    private var p: com.google.ads.mediation.customevent.CustomEventInterstitial

    public constructor()

    private fun a(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->n:Landroid/view/View;
    //         return-void
    */

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->o:Lcom/google/ads/mediation/customevent/CustomEventBanner;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->o:Lcom/google/ads/mediation/customevent/CustomEventBanner;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/customevent/CustomEventBanner;->destroy()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->p:Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->p:Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/customevent/CustomEventInterstitial;->destroy()V
    //         :cond_1
    //         return-void
    */

    public fun getAdditionalParametersType(): Class { return TODO("body: ()Ljava/lang/Class;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/lang/Class",
    //                 "<",
    //                 "Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const-class v0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    //         return-object v0
    */

    public fun getBannerView(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->n:Landroid/view/View;
    //         return-object v0
    */

    public fun getServerParametersType(): Class { return TODO("body: ()Ljava/lang/Class;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/lang/Class",
    //                 "<",
    //                 "Lcom/google/ads/mediation/customevent/CustomEventServerParameters;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const-class v0, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;
    //         return-object v0
    */

    public fun requestBannerAd(x0: com.google.ads.mediation.MediationBannerListener, x1: android.app.Activity, x2: com.google.ads.mediation.MediationServerParameters, x3: com.google.ads.AdSize, x4: com.google.ads.mediation.MediationAdRequest, x5: com.google.ads.mediation.NetworkExtras) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V */ }
    /*
    //         .locals 7
    //         move-object v3, p3
    //         check-cast v3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;
    //         move-object v6, p6
    //         check-cast v6, Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/customevent/CustomEventServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;)V
    //         return-void
    */

    public fun requestBannerAd(listener: com.google.ads.mediation.MediationBannerListener, activity: android.app.Activity, serverParameters: com.google.ads.mediation.customevent.CustomEventServerParameters, adSize: com.google.ads.AdSize, mediationAdRequest: com.google.ads.mediation.MediationAdRequest, customEventExtras: com.google.android.gms.ads.mediation.customevent.CustomEventExtras) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/customevent/CustomEventServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;)V */ }
    /*
    //         .locals 8
    //         iget-object v0, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->className:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/ads/mediation/customevent/CustomEventBanner;
    //         iput-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->o:Lcom/google/ads/mediation/customevent/CustomEventBanner;
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->o:Lcom/google/ads/mediation/customevent/CustomEventBanner;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/ads/AdRequest$ErrorCode;->INTERNAL_ERROR:Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-interface {p1, p0, v0}, Lcom/google/ads/mediation/MediationBannerListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationBannerAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-nez p6, :cond_1
    //         const/4 v7, 0x0
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->o:Lcom/google/ads/mediation/customevent/CustomEventBanner;
    //         new-instance v1, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;
    //         invoke-direct {v1, p0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;-><init>(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/MediationBannerListener;)V
    //         iget-object v3, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->label:Ljava/lang/String;
    //         iget-object v4, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->parameter:Ljava/lang/String;
    //         move-object v2, p2
    //         move-object v5, p4
    //         move-object v6, p5
    //         invoke-interface/range {v0 .. v7}, Lcom/google/ads/mediation/customevent/CustomEventBanner;->requestBannerAd(Lcom/google/ads/mediation/customevent/CustomEventBannerListener;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->label:Ljava/lang/String;
    //         invoke-virtual {p6, v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;->getExtra(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v7
    //         goto :goto_1
    */

    public fun requestInterstitialAd(x0: com.google.ads.mediation.MediationInterstitialListener, x1: android.app.Activity, x2: com.google.ads.mediation.MediationServerParameters, x3: com.google.ads.mediation.MediationAdRequest, x4: com.google.ads.mediation.NetworkExtras) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V */ }
    /*
    //         .locals 6
    //         move-object v3, p3
    //         check-cast v3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;
    //         move-object v5, p5
    //         check-cast v5, Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v4, p4
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/customevent/CustomEventServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;)V
    //         return-void
    */

    public fun requestInterstitialAd(listener: com.google.ads.mediation.MediationInterstitialListener, activity: android.app.Activity, serverParameters: com.google.ads.mediation.customevent.CustomEventServerParameters, mediationAdRequest: com.google.ads.mediation.MediationAdRequest, customEventExtras: com.google.android.gms.ads.mediation.customevent.CustomEventExtras) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/customevent/CustomEventServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;)V */ }
    /*
    //         .locals 7
    //         iget-object v0, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->className:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         iput-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->p:Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->p:Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/ads/AdRequest$ErrorCode;->INTERNAL_ERROR:Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-interface {p1, p0, v0}, Lcom/google/ads/mediation/MediationInterstitialListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationInterstitialAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-nez p5, :cond_1
    //         const/4 v6, 0x0
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->p:Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         new-instance v1, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;
    //         invoke-direct {v1, p0, p0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;-><init>(Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/customevent/CustomEventAdapter;Lcom/google/ads/mediation/MediationInterstitialListener;)V
    //         iget-object v3, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->label:Ljava/lang/String;
    //         iget-object v4, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->parameter:Ljava/lang/String;
    //         move-object v2, p2
    //         move-object v5, p4
    //         invoke-interface/range {v0 .. v6}, Lcom/google/ads/mediation/customevent/CustomEventInterstitial;->requestInterstitialAd(Lcom/google/ads/mediation/customevent/CustomEventInterstitialListener;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/google/ads/mediation/MediationAdRequest;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p3, Lcom/google/ads/mediation/customevent/CustomEventServerParameters;->label:Ljava/lang/String;
    //         invoke-virtual {p5, v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventExtras;->getExtra(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v6
    //         goto :goto_1
    */

    public fun showInterstitial() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->p:Lcom/google/ads/mediation/customevent/CustomEventInterstitial;
    //         invoke-interface {v0}, Lcom/google/ads/mediation/customevent/CustomEventInterstitial;->showInterstitial()V
    //         return-void
    */

    companion object {
    private @JvmStatic fun a(p0: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/lang/String;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not instantiate custom event adapter: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ". "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    @JvmStatic fun a(p0: com.google.ads.mediation.customevent.CustomEventAdapter, p1: android.view.View) { /* TODO(body): (Lcom/google/ads/mediation/customevent/CustomEventAdapter;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/ads/mediation/customevent/CustomEventAdapter;->a(Landroid/view/View;)V
    //         return-void
    */

    }
}
