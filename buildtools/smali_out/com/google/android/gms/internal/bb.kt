package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

class bb {
    private val oj: Array<com.google.android.gms.ads.AdSize>
    private val ok: String

    public constructor(p0: android.content.Context, p1: android.util.AttributeSet)

    public fun f(p0: Boolean): Array<com.google.android.gms.ads.AdSize> { return TODO("body: (Z)[Lcom/google/android/gms/ads/AdSize;") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bb;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         array-length v0, v0
    //         const/4 v1, 0x1
    //         if-eq v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "The adSizes XML attribute is only allowed on PublisherAdViews."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bb;->oj:[Lcom/google/android/gms/ads/AdSize;
    //         return-object v0
    */

    public fun getAdUnitId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bb;->ok:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    private @JvmStatic fun q(p0: String): Array<com.google.android.gms.ads.AdSize> { return TODO("body: (Ljava/lang/String;)[Lcom/google/android/gms/ads/AdSize;") }
    /*
    //         .locals 10
    //         const/4 v9, 0x1
    //         const/4 v1, 0x0
    //         const-string v0, "\\s*,\\s*"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v4
    //         array-length v0, v4
    //         new-array v5, v0, [Lcom/google/android/gms/ads/AdSize;
    //         move v0, v1
    //         :goto_0
    //         array-length v2, v4
    //         if-ge v0, v2, :cond_a
    //         aget-object v2, v4, v0
    //         invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v6
    //         const-string v2, "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"
    //         invoke-virtual {v6, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const-string v2, "[xX]"
    //         invoke-virtual {v6, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v7
    //         aget-object v2, v7, v1
    //         invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v7, v1
    //         aget-object v2, v7, v9
    //         invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v7, v9
    //         :try_start_0
    //         const-string v2, "FULL_WIDTH"
    //         const/4 v3, 0x0
    //         aget-object v3, v7, v3
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         const/4 v2, -0x1
    //         move v3, v2
    //         :goto_1
    //         const-string v2, "AUTO_HEIGHT"
    //         const/4 v8, 0x1
    //         aget-object v8, v7, v8
    //         invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         const/4 v2, -0x2
    //         :goto_2
    //         new-instance v6, Lcom/google/android/gms/ads/AdSize;
    //         invoke-direct {v6, v3, v2}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V
    //         aput-object v6, v5, v0
    //         :goto_3
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const/4 v2, 0x0
    //         :try_start_1
    //         aget-object v2, v7, v2
    //         invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v2
    //         move v3, v2
    //         goto :goto_1
    //         :cond_1
    //         const/4 v2, 0x1
    //         aget-object v2, v7, v2
    //         invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         :try_end_1
    //         .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    //         move-result v2
    //         goto :goto_2
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not parse XML attribute \"adSize\": "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         const-string v2, "BANNER"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto :goto_3
    //         :cond_3
    //         const-string v2, "LARGE_BANNER"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->LARGE_BANNER:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto :goto_3
    //         :cond_4
    //         const-string v2, "FULL_BANNER"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->FULL_BANNER:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto :goto_3
    //         :cond_5
    //         const-string v2, "LEADERBOARD"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_6
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->LEADERBOARD:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto :goto_3
    //         :cond_6
    //         const-string v2, "MEDIUM_RECTANGLE"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->MEDIUM_RECTANGLE:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto :goto_3
    //         :cond_7
    //         const-string v2, "SMART_BANNER"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_8
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto :goto_3
    //         :cond_8
    //         const-string v2, "WIDE_SKYSCRAPER"
    //         invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_9
    //         sget-object v2, Lcom/google/android/gms/ads/AdSize;->WIDE_SKYSCRAPER:Lcom/google/android/gms/ads/AdSize;
    //         aput-object v2, v5, v0
    //         goto/16 :goto_3
    //         :cond_9
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not parse XML attribute \"adSize\": "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_a
    //         array-length v0, v5
    //         if-nez v0, :cond_b
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not parse XML attribute \"adSize\": "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_b
    //         return-object v5
    */

    }
}
