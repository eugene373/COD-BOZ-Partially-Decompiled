package com.google.android.gms.ads.mediation.customevent

// Auto-emitted from smali.
// 3 fields, 11 methods.

class CustomEventAdapter: com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter {
    private var n: android.view.View
    private var xf: com.google.android.gms.ads.mediation.customevent.CustomEventBanner
    private var xg: com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial

    public constructor()

    private fun a(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->n:Landroid/view/View;
    //         return-void
    */

    public fun getBannerView(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->n:Landroid/view/View;
    //         return-object v0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;->onDestroy()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;->onDestroy()V
    //         :cond_1
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;->onPause()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;->onPause()V
    //         :cond_1
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;->onResume()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;->onResume()V
    //         :cond_1
    //         return-void
    */

    public fun requestBannerAd(context: android.content.Context, listener: com.google.android.gms.ads.mediation.MediationBannerListener, serverParameters: android.os.Bundle, adSize: com.google.android.gms.ads.AdSize, mediationAdRequest: com.google.android.gms.ads.mediation.MediationAdRequest, customEventExtras: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationBannerListener;Landroid/os/Bundle;Lcom/google/android/gms/ads/AdSize;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         const-string v0, "class_name"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         iput-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-interface {p2, p0, v0}, Lcom/google/android/gms/ads/mediation/MediationBannerListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-nez p6, :cond_1
    //         const/4 v6, 0x0
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xf:Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;
    //         new-instance v2, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;
    //         invoke-direct {v2, p0, p2}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$a;-><init>(Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Lcom/google/android/gms/ads/mediation/MediationBannerListener;)V
    //         const-string v1, "parameter"
    //         invoke-virtual {p3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p1
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventBanner;->requestBannerAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/customevent/CustomEventBannerListener;Ljava/lang/String;Lcom/google/android/gms/ads/AdSize;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "class_name"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p6, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v6
    //         goto :goto_1
    */

    public fun requestInterstitialAd(context: android.content.Context, listener: com.google.android.gms.ads.mediation.MediationInterstitialListener, serverParameters: android.os.Bundle, mediationAdRequest: com.google.android.gms.ads.mediation.MediationAdRequest, customEventExtras: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;Landroid/os/Bundle;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         const-string v0, "class_name"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->a(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         iput-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-interface {p2, p0, v0}, Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-nez p5, :cond_1
    //         const/4 v5, 0x0
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         new-instance v2, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;
    //         invoke-direct {v2, p0, p0, p2}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter$b;-><init>(Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;)V
    //         const-string v1, "parameter"
    //         invoke-virtual {p3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p1
    //         move-object v4, p4
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;->requestInterstitialAd(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitialListener;Ljava/lang/String;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "class_name"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p5, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v5
    //         goto :goto_1
    */

    public fun showInterstitial() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->xg:Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;
    //         invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventInterstitial;->showInterstitial()V
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

    @JvmStatic fun a(p0: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter, p1: android.view.View) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/ads/mediation/customevent/CustomEventAdapter;->a(Landroid/view/View;)V
    //         return-void
    */

    }
}
