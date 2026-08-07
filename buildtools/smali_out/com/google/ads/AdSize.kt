package com.google.ads

// Auto-emitted from smali.
// 12 fields, 16 methods.

class AdSize {
    private val c: com.google.android.gms.ads.AdSize

    public constructor(width: Int, height: Int)

    private constructor(width: Int, height: Int, type: String)

    public constructor(adSize: com.google.android.gms.ads.AdSize)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/ads/AdSize;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         check-cast p1, Lcom/google/ads/AdSize;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         iget-object v1, p1, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdSize;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun findBestSize(options: Array<com.google.ads.AdSize>): com.google.ads.AdSize { return TODO("body: ([Lcom/google/ads/AdSize;)Lcom/google/ads/AdSize;") }
    /*
    //         .locals 11
    //         const/4 v3, 0x0
    //         const/high16 v10, 0x3f800000    # 1.0f
    //         if-nez p1, :cond_1
    //         :cond_0
    //         return-object v3
    //         :cond_1
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/google/ads/AdSize;->getWidth()I
    //         move-result v5
    //         invoke-virtual {p0}, Lcom/google/ads/AdSize;->getHeight()I
    //         move-result v6
    //         array-length v7, p1
    //         const/4 v0, 0x0
    //         move v4, v0
    //         :goto_0
    //         if-ge v4, v7, :cond_0
    //         aget-object v2, p1, v4
    //         invoke-virtual {v2}, Lcom/google/ads/AdSize;->getWidth()I
    //         move-result v0
    //         invoke-virtual {v2}, Lcom/google/ads/AdSize;->getHeight()I
    //         move-result v8
    //         invoke-virtual {p0, v0, v8}, Lcom/google/ads/AdSize;->isSizeAppropriate(II)Z
    //         move-result v9
    //         if-eqz v9, :cond_3
    //         mul-int/2addr v0, v8
    //         int-to-float v0, v0
    //         mul-int v8, v5, v6
    //         int-to-float v8, v8
    //         div-float/2addr v0, v8
    //         cmpl-float v8, v0, v10
    //         if-lez v8, :cond_2
    //         div-float v0, v10, v0
    //         :cond_2
    //         cmpl-float v8, v0, v1
    //         if-lez v8, :cond_3
    //         move-object v1, v2
    //         :goto_1
    //         add-int/lit8 v2, v4, 0x1
    //         move v4, v2
    //         move-object v3, v1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         move-object v1, v3
    //         goto :goto_1
    */

    public fun getHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->getHeight()I
    //         move-result v0
    //         return v0
    */

    public fun getHeightInPixels(context: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I
    //         move-result v0
    //         return v0
    */

    public fun getWidth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->getWidth()I
    //         move-result v0
    //         return v0
    */

    public fun getWidthInPixels(context: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/AdSize;->getWidthInPixels(Landroid/content/Context;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun isAutoHeight(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->isAutoHeight()Z
    //         move-result v0
    //         return v0
    */

    public fun isCustomAdSize(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isFullWidth(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->isFullWidth()Z
    //         move-result v0
    //         return v0
    */

    public fun isSizeAppropriate(width: Int, height: Int): Boolean { return TODO("body: (II)Z") }
    /*
    //         .locals 6
    //         const/high16 v5, 0x3fa00000    # 1.25f
    //         const v4, 0x3f4ccccd    # 0.8f
    //         invoke-virtual {p0}, Lcom/google/ads/AdSize;->getWidth()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/google/ads/AdSize;->getHeight()I
    //         move-result v1
    //         int-to-float v2, p1
    //         int-to-float v3, v0
    //         mul-float/2addr v3, v5
    //         cmpg-float v2, v2, v3
    //         if-gtz v2, :cond_0
    //         int-to-float v2, p1
    //         int-to-float v0, v0
    //         mul-float/2addr v0, v4
    //         cmpl-float v0, v2, v0
    //         if-ltz v0, :cond_0
    //         int-to-float v0, p2
    //         int-to-float v2, v1
    //         mul-float/2addr v2, v5
    //         cmpg-float v0, v0, v2
    //         if-gtz v0, :cond_0
    //         int-to-float v0, p2
    //         int-to-float v1, v1
    //         mul-float/2addr v1, v4
    //         cmpl-float v0, v0, v1
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdSize;->c:Lcom/google/android/gms/ads/AdSize;
    //         invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val AUTO_HEIGHT: Int = 0
    @JvmField public val BANNER: com.google.ads.AdSize = null!!
    @JvmField public val FULL_WIDTH: Int = 0
    @JvmField public val IAB_BANNER: com.google.ads.AdSize = null!!
    @JvmField public val IAB_LEADERBOARD: com.google.ads.AdSize = null!!
    @JvmField public val IAB_MRECT: com.google.ads.AdSize = null!!
    @JvmField public val IAB_WIDE_SKYSCRAPER: com.google.ads.AdSize = null!!
    @JvmField public val LANDSCAPE_AD_HEIGHT: Int = 0x20
    @JvmField public val LARGE_AD_HEIGHT: Int = 0x5a
    @JvmField public val PORTRAIT_AD_HEIGHT: Int = 0x32
    @JvmField public val SMART_BANNER: com.google.ads.AdSize = null!!
    }
}
