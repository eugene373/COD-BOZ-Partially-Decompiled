package com.google.android.gms.ads

// Auto-emitted from smali.
// 1 fields, 19 methods.

class AdView: android.view.ViewGroup() {
    private val li: com.google.android.gms.internal.bh

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet, defStyle: Int)

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->destroy()V
    //         return-void
    */

    public fun getAdListener(): com.google.android.gms.ads.AdListener { return TODO("body: ()Lcom/google/android/gms/ads/AdListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->getAdListener()Lcom/google/android/gms/ads/AdListener;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAdSize(): com.google.android.gms.ads.AdSize { return TODO("body: ()Lcom/google/android/gms/ads/AdSize;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->getAdSize()Lcom/google/android/gms/ads/AdSize;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAdUnitId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->getAdUnitId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInAppPurchaseListener(): com.google.android.gms.ads.purchase.InAppPurchaseListener { return TODO("body: ()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMediationAdapterClassName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->getMediationAdapterClassName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadAd(adRequest: com.google.android.gms.ads.AdRequest) { /* TODO(body): (Lcom/google/android/gms/ads/AdRequest;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->V()Lcom/google/android/gms/internal/bg;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bh;->a(Lcom/google/android/gms/internal/bg;)V
    //         return-void
    */

    protected fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/AdView;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
    //         move-result v1
    //         const/16 v2, 0x8
    //         if-eq v1, v2, :cond_0
    //         invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v2
    //         sub-int v3, p4, p2
    //         sub-int/2addr v3, v1
    //         div-int/lit8 v3, v3, 0x2
    //         sub-int v4, p5, p3
    //         sub-int/2addr v4, v2
    //         div-int/lit8 v4, v4, 0x2
    //         add-int/2addr v1, v3
    //         add-int/2addr v2, v4
    //         invoke-virtual {v0, v3, v4, v1, v2}, Landroid/view/View;->layout(IIII)V
    //         :cond_0
    //         return-void
    */

    protected fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/AdView;->getChildAt(I)Landroid/view/View;
    //         move-result-object v2
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getAdSize()Lcom/google/android/gms/ads/AdSize;
    //         move-result-object v3
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
    //         move-result v1
    //         const/16 v4, 0x8
    //         if-eq v1, v4, :cond_0
    //         invoke-virtual {p0, v2, p1, p2}, Lcom/google/android/gms/ads/AdView;->measureChild(Landroid/view/View;II)V
    //         invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
    //         move-result v1
    //         invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v0
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getSuggestedMinimumWidth()I
    //         move-result v2
    //         invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
    //         move-result v1
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getSuggestedMinimumHeight()I
    //         move-result v2
    //         invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         invoke-static {v1, p1}, Landroid/view/View;->resolveSize(II)I
    //         move-result v1
    //         invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I
    //         move-result v0
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/ads/AdView;->setMeasuredDimension(II)V
    //         return-void
    //         :cond_0
    //         if-eqz v3, :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/AdSize;->getWidthInPixels(Landroid/content/Context;)I
    //         move-result v1
    //         invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         move v1, v0
    //         goto :goto_0
    */

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->pause()V
    //         return-void
    */

    public fun resume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bh;->resume()V
    //         return-void
    */

    public fun setAdListener(adListener: com.google.android.gms.ads.AdListener) { /* TODO(body): (Lcom/google/android/gms/ads/AdListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bh;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    //         return-void
    */

    public fun setAdSize(adSize: com.google.android.gms.ads.AdSize) { /* TODO(body): (Lcom/google/android/gms/ads/AdSize;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Lcom/google/android/gms/ads/AdSize;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bh;->setAdSizes([Lcom/google/android/gms/ads/AdSize;)V
    //         return-void
    */

    public fun setAdUnitId(adUnitId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bh;->setAdUnitId(Ljava/lang/String;)V
    //         return-void
    */

    public fun setInAppPurchaseListener(inAppPurchaseListener: com.google.android.gms.ads.purchase.InAppPurchaseListener) { /* TODO(body): (Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bh;->setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    //         return-void
    */

    public fun setPlayStorePurchaseParams(playStorePurchaseListener: com.google.android.gms.ads.purchase.PlayStorePurchaseListener, publicKey: String) { /* TODO(body): (Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdView;->li:Lcom/google/android/gms/internal/bh;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bh;->setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    //         return-void
    */

}
