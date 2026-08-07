package com.google.android.gms.ads

// Auto-emitted from smali.
// 12 fields, 12 methods.

class AdSize {
    private val lf: Int
    private val lg: Int
    private val lh: String

    public constructor(width: Int, height: Int)

    constructor(width: Int, height: Int, formatString: String)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/ads/AdSize;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/ads/AdSize;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/ads/AdSize;->lf:I
    //         iget v3, p1, Lcom/google/android/gms/ads/AdSize;->lf:I
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/ads/AdSize;->lg:I
    //         iget v3, p1, Lcom/google/android/gms/ads/AdSize;->lg:I
    //         if-ne v2, v3, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/ads/AdSize;->lh:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/ads/AdSize;->lh:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lg:I
    //         return v0
    */

    public fun getHeightInPixels(context: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lg:I
    //         const/4 v1, -0x2
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ay;->b(Landroid/util/DisplayMetrics;)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lg:I
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/gr;->a(Landroid/content/Context;I)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun getWidth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lf:I
    //         return v0
    */

    public fun getWidthInPixels(context: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lf:I
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ay;->a(Landroid/util/DisplayMetrics;)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lf:I
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/gr;->a(Landroid/content/Context;I)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdSize;->lh:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun isAutoHeight(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lg:I
    //         const/4 v1, -0x2
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isFullWidth(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/ads/AdSize;->lf:I
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_0
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
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdSize;->lh:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    @JvmField public val AUTO_HEIGHT: Int = 0
    @JvmField public val BANNER: com.google.android.gms.ads.AdSize = null!!
    @JvmField public val FULL_BANNER: com.google.android.gms.ads.AdSize = null!!
    @JvmField public val FULL_WIDTH: Int = 0
    @JvmField public val LARGE_BANNER: com.google.android.gms.ads.AdSize = null!!
    @JvmField public val LEADERBOARD: com.google.android.gms.ads.AdSize = null!!
    @JvmField public val MEDIUM_RECTANGLE: com.google.android.gms.ads.AdSize = null!!
    @JvmField public val SMART_BANNER: com.google.android.gms.ads.AdSize = null!!
    @JvmField public val WIDE_SKYSCRAPER: com.google.android.gms.ads.AdSize = null!!
    }
}
