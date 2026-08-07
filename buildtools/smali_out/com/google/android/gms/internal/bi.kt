package com.google.android.gms.internal

// Auto-emitted from smali.
// 12 fields, 18 methods.

open class bi {
    private val mContext: android.content.Context
    private var nR: com.google.android.gms.ads.AdListener
    private var oA: String
    private var oC: com.google.android.gms.ads.purchase.InAppPurchaseListener
    private var oD: com.google.android.gms.ads.purchase.PlayStorePurchaseListener
    private var oF: com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
    private var oG: com.google.android.gms.ads.doubleclick.c
    private var oi: com.google.android.gms.ads.doubleclick.AppEventListener
    private var ok: String
    private val ox: com.google.android.gms.internal.cs
    private val oy: com.google.android.gms.internal.ax
    private var oz: com.google.android.gms.internal.bd

    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: com.google.android.gms.ads.doubleclick.PublisherInterstitialAd)

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.ax, p2: com.google.android.gms.ads.doubleclick.PublisherInterstitialAd)

    private fun v(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->ok:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/bi;->w(Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->mContext:Landroid/content/Context;
    //         new-instance v1, Lcom/google/android/gms/internal/ay;
    //         invoke-direct {v1}, Lcom/google/android/gms/internal/ay;-><init>()V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->ok:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/bi;->ox:Lcom/google/android/gms/internal/cs;
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/bd;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->nR:Lcom/google/android/gms/ads/AdListener;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/at;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->nR:Lcom/google/android/gms/ads/AdListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/ads/AdListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bc;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/ba;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ba;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bf;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/em;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/em;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/eh;)V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/eq;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/eq;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->oA:Ljava/lang/String;
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oG:Lcom/google/android/gms/ads/doubleclick/c;
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/ex;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->oG:Lcom/google/android/gms/ads/doubleclick/c;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/bi;->oF:Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ex;-><init>(Lcom/google/android/gms/ads/doubleclick/c;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/eu;)V
    //         :cond_5
    //         return-void
    */

    private fun w(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "The ad unit ID must be set on InterstitialAd before "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " is called."
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.bg) { /* TODO(body): (Lcom/google/android/gms/internal/bg;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-nez v0, :cond_0
    //         const-string v0, "loadAd"
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bi;->v(Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oy:Lcom/google/android/gms/internal/ax;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bi;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ax;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bg;)Lcom/google/android/gms/internal/av;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/av;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->ox:Lcom/google/android/gms/internal/cs;
    //         invoke-virtual {p1}, Lcom/google/android/gms/internal/bg;->be()Ljava/util/Map;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cs;->d(Ljava/util/Map;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to load ad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun getAdListener(): com.google.android.gms.ads.AdListener { return TODO("body: ()Lcom/google/android/gms/ads/AdListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->nR:Lcom/google/android/gms/ads/AdListener;
    //         return-object v0
    */

    public fun getAdUnitId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->ok:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAppEventListener(): com.google.android.gms.ads.doubleclick.AppEventListener { return TODO("body: ()Lcom/google/android/gms/ads/doubleclick/AppEventListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         return-object v0
    */

    public fun getInAppPurchaseListener(): com.google.android.gms.ads.purchase.InAppPurchaseListener { return TODO("body: ()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         return-object v0
    */

    public fun getMediationAdapterClassName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->getMediationAdapterClassName()Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to get the mediation adapter class name."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isLoaded(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v1}, Lcom/google/android/gms/internal/bd;->isReady()Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "Failed to check if ad is ready."
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun setAdListener(adListener: com.google.android.gms.ads.AdListener) { /* TODO(body): (Lcom/google/android/gms/ads/AdListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bi;->nR:Lcom/google/android/gms/ads/AdListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz p1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/at;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/ads/AdListener;)V
    //         :goto_0
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bc;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to set the AdListener."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    */

    public fun setAdUnitId(adUnitId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->ok:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "The ad unit ID can only be set once on InterstitialAd."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bi;->ok:Ljava/lang/String;
    //         return-void
    */

    public fun setAppEventListener(appEventListener: com.google.android.gms.ads.doubleclick.AppEventListener) { /* TODO(body): (Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bi;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz p1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/ba;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ba;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    //         :goto_0
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bf;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to set the AppEventListener."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    */

    public fun setInAppPurchaseListener(inAppPurchaseListener: com.google.android.gms.ads.purchase.InAppPurchaseListener) { /* TODO(body): (Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Play store purchase parameter has already been set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bi;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz p1, :cond_2
    //         new-instance v0, Lcom/google/android/gms/internal/em;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/internal/em;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    //         :goto_0
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/eh;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_1
    //         return-void
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to set the InAppPurchaseListener."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    */

    public fun setPlayStorePurchaseParams(playStorePurchaseListener: com.google.android.gms.ads.purchase.PlayStorePurchaseListener, publicKey: String) { /* TODO(body): (Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bi;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz p1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/eq;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/internal/eq;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V
    //         :goto_0
    //         invoke-interface {v1, v0, p2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to set the play store purchase parameter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    */

    public fun show() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         const-string v0, "show"
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bi;->w(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bi;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->showInterstitial()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to show interstitial."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

}
