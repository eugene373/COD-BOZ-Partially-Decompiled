package com.google.ads.mediation.admob

// Auto-emitted from smali.
// 2 fields, 9 methods.

class AdMobAdapter: com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter {
    private var i: com.google.android.gms.ads.AdView
    private var j: com.google.android.gms.ads.InterstitialAd

    public constructor()

    public fun getBannerView(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         return-object v0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->destroy()V
    //         iput-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         if-eqz v0, :cond_1
    //         iput-object v1, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         :cond_1
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V
    //         :cond_0
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V
    //         :cond_0
    //         return-void
    */

    public fun requestBannerAd(context: android.content.Context, bannerListener: com.google.android.gms.ads.mediation.MediationBannerListener, serverParameters: android.os.Bundle, adSize: com.google.android.gms.ads.AdSize, mediationAdRequest: com.google.android.gms.ads.mediation.MediationAdRequest, extras: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationBannerListener;Landroid/os/Bundle;Lcom/google/android/gms/ads/AdSize;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/ads/AdView;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         new-instance v1, Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {p4}, Lcom/google/android/gms/ads/AdSize;->getWidth()I
    //         move-result v2
    //         invoke-virtual {p4}, Lcom/google/android/gms/ads/AdSize;->getHeight()I
    //         move-result v3
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         const-string v1, "pubid"
    //         invoke-virtual {p3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         new-instance v1, Lcom/google/ads/mediation/admob/AdMobAdapter$a;
    //         invoke-direct {v1, p0, p2}, Lcom/google/ads/mediation/admob/AdMobAdapter$a;-><init>(Lcom/google/ads/mediation/admob/AdMobAdapter;Lcom/google/android/gms/ads/mediation/MediationBannerListener;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->i:Lcom/google/android/gms/ads/AdView;
    //         invoke-static {p1, p5, p6, p3}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    //         return-void
    */

    public fun requestInterstitialAd(context: android.content.Context, interstitialListener: com.google.android.gms.ads.mediation.MediationInterstitialListener, serverParameters: android.os.Bundle, mediationAdRequest: com.google.android.gms.ads.mediation.MediationAdRequest, extras: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;Landroid/os/Bundle;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/ads/InterstitialAd;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/ads/InterstitialAd;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         const-string v1, "pubid"
    //         invoke-virtual {p3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/InterstitialAd;->setAdUnitId(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         new-instance v1, Lcom/google/ads/mediation/admob/AdMobAdapter$b;
    //         invoke-direct {v1, p0, p2}, Lcom/google/ads/mediation/admob/AdMobAdapter$b;-><init>(Lcom/google/ads/mediation/admob/AdMobAdapter;Lcom/google/android/gms/ads/mediation/MediationInterstitialListener;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/InterstitialAd;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         invoke-static {p1, p4, p5, p3}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/InterstitialAd;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    //         return-void
    */

    public fun showInterstitial() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/mediation/admob/AdMobAdapter;->j:Lcom/google/android/gms/ads/InterstitialAd;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->show()V
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.ads.mediation.MediationAdRequest, p2: android.os.Bundle, p3: android.os.Bundle): com.google.android.gms.ads.AdRequest { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/ads/mediation/MediationAdRequest;Landroid/os/Bundle;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         new-instance v2, Lcom/google/android/gms/ads/AdRequest$Builder;
    //         invoke-direct {v2}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V
    //         invoke-interface {p1}, Lcom/google/android/gms/ads/mediation/MediationAdRequest;->getBirthday()Ljava/util/Date;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->setBirthday(Ljava/util/Date;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/ads/mediation/MediationAdRequest;->getGender()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->setGender(I)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/ads/mediation/MediationAdRequest;->getKeywords()Ljava/util/Set;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->addKeyword(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         goto :goto_0
    //         :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/ads/mediation/MediationAdRequest;->getLocation()Landroid/location/Location;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->setLocation(Landroid/location/Location;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         :cond_3
    //         invoke-interface {p1}, Lcom/google/android/gms/ads/mediation/MediationAdRequest;->isTesting()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-static {p0}, Lcom/google/android/gms/internal/gr;->v(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         :cond_4
    //         const-string v0, "tagForChildDirectedTreatment"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         const/4 v3, -0x1
    //         if-eq v0, v3, :cond_5
    //         const-string v0, "tagForChildDirectedTreatment"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         if-ne v0, v1, :cond_7
    //         move v0, v1
    //         :goto_1
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         :cond_5
    //         if-eqz p2, :cond_8
    //         :goto_2
    //         const-string v0, "gw"
    //         invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v0, "mad_hac"
    //         const-string v3, "mad_hac"
    //         invoke-virtual {p3, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "adJson"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_6
    //         const-string v0, "_ad"
    //         const-string v3, "adJson"
    //         invoke-virtual {p3, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_6
    //         const-string v0, "_noRefresh"
    //         invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         invoke-virtual {v2, v0, p2}, Lcom/google/android/gms/ads/AdRequest$Builder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest$Builder;
    //         invoke-virtual {v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;
    //         move-result-object v0
    //         return-object v0
    //         :cond_7
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :cond_8
    //         new-instance p2, Landroid/os/Bundle;
    //         invoke-direct {p2}, Landroid/os/Bundle;-><init>()V
    //         goto :goto_2
    */

    }
}
