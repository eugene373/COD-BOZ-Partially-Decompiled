package com.google.android.gms.internal

// Auto-emitted from smali.
// 12 fields, 25 methods.

class bh {
    private var nR: com.google.android.gms.ads.AdListener
    private var oA: String
    private var oB: android.view.ViewGroup
    private var oC: com.google.android.gms.ads.purchase.InAppPurchaseListener
    private var oD: com.google.android.gms.ads.purchase.PlayStorePurchaseListener
    private var oE: com.google.android.gms.ads.doubleclick.b
    private var oi: com.google.android.gms.ads.doubleclick.AppEventListener
    private var oj: Array<com.google.android.gms.ads.AdSize>
    private var ok: String
    private val ox: com.google.android.gms.internal.cs
    private val oy: com.google.android.gms.internal.ax
    private var oz: com.google.android.gms.internal.bd

    public constructor(p0: android.view.ViewGroup)

    public constructor(p0: android.view.ViewGroup, p1: android.util.AttributeSet, p2: Boolean)

    constructor(p0: android.view.ViewGroup, p1: android.util.AttributeSet, p2: Boolean, p3: com.google.android.gms.internal.ax)

    constructor(p0: android.view.ViewGroup, p1: android.util.AttributeSet, p2: Boolean, p3: com.google.android.gms.internal.ax, p4: com.google.android.gms.internal.bd)

    private fun bh() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->X()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to get an ad frame."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    private fun bi() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "The ad size and ad unit ID must be set before loadAd is called."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;
    //         invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/ay;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ay;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/bh;->ox:Lcom/google/android/gms/internal/cs;
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/bd;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/at;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/ads/AdListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bc;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/ba;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ba;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bf;)V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/em;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/em;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/eh;)V
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/eq;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/eq;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oA:Ljava/lang/String;
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oE:Lcom/google/android/gms/ads/doubleclick/b;
    //         if-eqz v0, :cond_6
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v2, Lcom/google/android/gms/internal/ew;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/bh;->oE:Lcom/google/android/gms/ads/doubleclick/b;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;
    //         check-cast v0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;
    //         invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ew;-><init>(Lcom/google/android/gms/ads/doubleclick/b;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V
    //         invoke-interface {v1, v2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/et;)V
    //         :cond_6
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/bh;->bh()V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.bg) { /* TODO(body): (Lcom/google/android/gms/internal/bg;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/bh;->bi()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oy:Lcom/google/android/gms/internal/ax;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;
    //         invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ax;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bg;)Lcom/google/android/gms/internal/av;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/av;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ox:Lcom/google/android/gms/internal/cs;
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

    public fun a(p0: Array<com.google.android.gms.ads.AdSize>) { /* TODO(body): ([Lcom/google/android/gms/ads/AdSize;)V */ }
    /*
    //         .locals 4
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         new-instance v1, Lcom/google/android/gms/internal/ay;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;
    //         invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ay;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/ay;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;
    //         invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to set the ad size."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->destroy()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to destroy AdView."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun getAdListener(): com.google.android.gms.ads.AdListener { return TODO("body: ()Lcom/google/android/gms/ads/AdListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;
    //         return-object v0
    */

    public fun getAdSize(): com.google.android.gms.ads.AdSize { return TODO("body: ()Lcom/google/android/gms/ads/AdSize;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ay;->bc()Lcom/google/android/gms/ads/AdSize;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to get the current AdSize."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         const/4 v1, 0x0
    //         aget-object v0, v0, v1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getAdSizes(): Array<com.google.android.gms.ads.AdSize> { return TODO("body: ()[Lcom/google/android/gms/ads/AdSize;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         return-object v0
    */

    public fun getAdUnitId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAppEventListener(): com.google.android.gms.ads.doubleclick.AppEventListener { return TODO("body: ()Lcom/google/android/gms/ads/doubleclick/AppEventListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         return-object v0
    */

    public fun getInAppPurchaseListener(): com.google.android.gms.ads.purchase.InAppPurchaseListener { return TODO("body: ()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         return-object v0
    */

    public fun getMediationAdapterClassName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
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

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->pause()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to call pause."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun recordManualImpression() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->aj()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to record impression."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun resume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->resume()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Failed to call resume."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun setAdListener(adListener: com.google.android.gms.ads.AdListener) { /* TODO(body): (Lcom/google/android/gms/ads/AdListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
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

    public fun setAdSizes(adSizes: Array<com.google.android.gms.ads.AdSize>) { /* TODO(body): ([Lcom/google/android/gms/ads/AdSize;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "The ad size can only be set once on AdView."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/bh;->a([Lcom/google/android/gms/ads/AdSize;)V
    //         return-void
    */

    public fun setAdUnitId(adUnitId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "The ad unit ID can only be set once on AdView."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;
    //         return-void
    */

    public fun setAppEventListener(appEventListener: com.google.android.gms.ads.doubleclick.AppEventListener) { /* TODO(body): (Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Play store purchase parameter has already been set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "InAppPurchaseListener has already been set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    //         iput-object p2, p0, Lcom/google/android/gms/internal/bh;->oA:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;
    //         if-eqz p1, :cond_2
    //         new-instance v0, Lcom/google/android/gms/internal/eq;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/internal/eq;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V
    //         :goto_0
    //         invoke-interface {v1, v0, p2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V
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
    //         const-string v1, "Failed to set the play store purchase parameter."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    */

}
