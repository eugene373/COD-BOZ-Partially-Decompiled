package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 13 methods.

class cy: com.google.android.gms.ads.mediation.MediationBannerListener, com.google.android.gms.ads.mediation.MediationInterstitialListener {
    private val qF: com.google.android.gms.internal.cv

    public constructor(p0: com.google.android.gms.internal.cv)

    public fun onAdClicked(adapter: com.google.android.gms.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdClicked must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdClicked."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClicked()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClicked."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdClicked(adapter: com.google.android.gms.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdClicked must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdClicked."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClicked()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClicked."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdClosed(adapter: com.google.android.gms.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdClosed must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdClosed."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClosed()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClosed."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdClosed(adapter: com.google.android.gms.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdClosed must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdClosed."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClosed()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClosed."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdFailedToLoad(adapter: com.google.android.gms.ads.mediation.MediationBannerAdapter, errorCode: Int) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;I)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdFailedToLoad must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Adapter called onAdFailedToLoad with error. "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0, p2}, Lcom/google/android/gms/internal/cv;->onAdFailedToLoad(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdFailedToLoad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdFailedToLoad(adapter: com.google.android.gms.ads.mediation.MediationInterstitialAdapter, errorCode: Int) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;I)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdFailedToLoad must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Adapter called onAdFailedToLoad with error "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0, p2}, Lcom/google/android/gms/internal/cv;->onAdFailedToLoad(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdFailedToLoad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdLeftApplication(adapter: com.google.android.gms.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdLeftApplication must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdLeftApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLeftApplication()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLeftApplication."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdLeftApplication(adapter: com.google.android.gms.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdLeftApplication must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdLeftApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLeftApplication()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLeftApplication."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdLoaded(adapter: com.google.android.gms.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdLoaded must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdLoaded."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLoaded()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLoaded."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdLoaded(adapter: com.google.android.gms.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdLoaded must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdLoaded."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLoaded()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLoaded."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdOpened(adapter: com.google.android.gms.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdOpened must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdOpened."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdOpened()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdOpened."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onAdOpened(adapter: com.google.android.gms.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onAdOpened must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->aT(Ljava/lang/String;)V
    //         const-string v0, "Adapter called onAdOpened."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cy;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdOpened()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdOpened."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

}
