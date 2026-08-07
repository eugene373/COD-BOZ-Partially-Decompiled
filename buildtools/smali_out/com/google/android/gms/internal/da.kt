package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 13 methods.

class da: com.google.ads.mediation.MediationBannerListener, com.google.ads.mediation.MediationInterstitialListener {
    private val qF: com.google.android.gms.internal.cv

    public constructor(p0: com.google.android.gms.internal.cv)

    public fun onClick(p0: com.google.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationBannerAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationBannerAdapter;, "Lcom/google/ads/mediation/MediationBannerAdapter<**>;"
    //         const-string v0, "Adapter called onClick."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onClick must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$1;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$1;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClicked()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClicked."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onDismissScreen(p0: com.google.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationBannerAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationBannerAdapter;, "Lcom/google/ads/mediation/MediationBannerAdapter<**>;"
    //         const-string v0, "Adapter called onDismissScreen."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onDismissScreen must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$4;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$4;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClosed()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClosed."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onDismissScreen(p0: com.google.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationInterstitialAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;"
    //         const-string v0, "Adapter called onDismissScreen."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onDismissScreen must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$9;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$9;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdClosed()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdClosed."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onFailedToReceiveAd(errorCode: com.google.ads.mediation.MediationBannerAdapter, p1: com.google.ads.AdRequest.ErrorCode) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationBannerAdapter;, "Lcom/google/ads/mediation/MediationBannerAdapter<**>;"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Adapter called onFailedToReceiveAd with error. "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onFailedToReceiveAd must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$5;
    //         invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/da$5;-><init>(Lcom/google/android/gms/internal/da;Lcom/google/ads/AdRequest$ErrorCode;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-static {p2}, Lcom/google/android/gms/internal/db;->a(Lcom/google/ads/AdRequest$ErrorCode;)I
    //         move-result v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cv;->onAdFailedToLoad(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdFailedToLoad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onFailedToReceiveAd(errorCode: com.google.ads.mediation.MediationInterstitialAdapter, p1: com.google.ads.AdRequest.ErrorCode) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Adapter called onFailedToReceiveAd with error "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onFailedToReceiveAd must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$10;
    //         invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/da$10;-><init>(Lcom/google/android/gms/internal/da;Lcom/google/ads/AdRequest$ErrorCode;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-static {p2}, Lcom/google/android/gms/internal/db;->a(Lcom/google/ads/AdRequest$ErrorCode;)I
    //         move-result v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cv;->onAdFailedToLoad(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdFailedToLoad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onLeaveApplication(p0: com.google.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationBannerAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationBannerAdapter;, "Lcom/google/ads/mediation/MediationBannerAdapter<**>;"
    //         const-string v0, "Adapter called onLeaveApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onLeaveApplication must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$6;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$6;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLeftApplication()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLeftApplication."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onLeaveApplication(p0: com.google.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationInterstitialAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;"
    //         const-string v0, "Adapter called onLeaveApplication."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onLeaveApplication must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$11;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$11;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLeftApplication()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLeftApplication."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onPresentScreen(p0: com.google.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationBannerAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationBannerAdapter;, "Lcom/google/ads/mediation/MediationBannerAdapter<**>;"
    //         const-string v0, "Adapter called onPresentScreen."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onPresentScreen must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$7;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$7;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdOpened()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdOpened."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onPresentScreen(p0: com.google.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationInterstitialAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;"
    //         const-string v0, "Adapter called onPresentScreen."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onPresentScreen must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$2;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$2;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdOpened()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdOpened."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onReceivedAd(p0: com.google.ads.mediation.MediationBannerAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationBannerAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationBannerAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationBannerAdapter;, "Lcom/google/ads/mediation/MediationBannerAdapter<**>;"
    //         const-string v0, "Adapter called onReceivedAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onReceivedAd must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$8;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$8;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLoaded()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLoaded."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun onReceivedAd(p0: com.google.ads.mediation.MediationInterstitialAdapter) { /* TODO(body): (Lcom/google/ads/mediation/MediationInterstitialAdapter;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/ads/mediation/MediationInterstitialAdapter",
    //                 "<**>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/da;, "Lcom/google/android/gms/internal/da<TNETWORK_EXTRAS;TSERVER_PARAMETERS;>;"
    //         .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;"
    //         const-string v0, "Adapter called onReceivedAd."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "onReceivedAd must be called on the main UI thread."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v1, Lcom/google/android/gms/internal/da$3;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/da$3;-><init>(Lcom/google/android/gms/internal/da;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/cv;->onAdLoaded()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not call onAdLoaded."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.da): com.google.android.gms.internal.cv { return TODO("body: (Lcom/google/android/gms/internal/da;)Lcom/google/android/gms/internal/cv;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/da;->qF:Lcom/google/android/gms/internal/cv;
    //         return-object v0
    */

    }
}
