package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

class db {
    companion object {
    public @JvmStatic fun a(p0: com.google.ads.AdRequest.ErrorCode): Int { return TODO("body: (Lcom/google/ads/AdRequest$ErrorCode;)I") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/internal/db$1;->qL:[I
    //         invoke-virtual {p0}, Lcom/google/ads/AdRequest$ErrorCode;->ordinal()I
    //         move-result v1
    //         aget v0, v0, v1
    //         packed-switch v0, :pswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :pswitch_2
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x2
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public @JvmStatic fun b(p0: com.google.android.gms.internal.ay): com.google.ads.AdSize { return TODO("body: (Lcom/google/android/gms/internal/ay;)Lcom/google/ads/AdSize;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const/4 v1, 0x6
    //         new-array v1, v1, [Lcom/google/ads/AdSize;
    //         sget-object v2, Lcom/google/ads/AdSize;->SMART_BANNER:Lcom/google/ads/AdSize;
    //         aput-object v2, v1, v0
    //         const/4 v2, 0x1
    //         sget-object v3, Lcom/google/ads/AdSize;->BANNER:Lcom/google/ads/AdSize;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         sget-object v3, Lcom/google/ads/AdSize;->IAB_MRECT:Lcom/google/ads/AdSize;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         sget-object v3, Lcom/google/ads/AdSize;->IAB_BANNER:Lcom/google/ads/AdSize;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x4
    //         sget-object v3, Lcom/google/ads/AdSize;->IAB_LEADERBOARD:Lcom/google/ads/AdSize;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x5
    //         sget-object v3, Lcom/google/ads/AdSize;->IAB_WIDE_SKYSCRAPER:Lcom/google/ads/AdSize;
    //         aput-object v3, v1, v2
    //         :goto_0
    //         array-length v2, v1
    //         if-ge v0, v2, :cond_1
    //         aget-object v2, v1, v0
    //         invoke-virtual {v2}, Lcom/google/ads/AdSize;->getWidth()I
    //         move-result v2
    //         iget v3, p0, Lcom/google/android/gms/internal/ay;->width:I
    //         if-ne v2, v3, :cond_0
    //         aget-object v2, v1, v0
    //         invoke-virtual {v2}, Lcom/google/ads/AdSize;->getHeight()I
    //         move-result v2
    //         iget v3, p0, Lcom/google/android/gms/internal/ay;->height:I
    //         if-ne v2, v3, :cond_0
    //         aget-object v0, v1, v0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/ads/AdSize;
    //         iget v1, p0, Lcom/google/android/gms/internal/ay;->width:I
    //         iget v2, p0, Lcom/google/android/gms/internal/ay;->height:I
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ay;->of:Ljava/lang/String;
    //         invoke-static {v1, v2, v3}, Lcom/google/android/gms/ads/a;->a(IILjava/lang/String;)Lcom/google/android/gms/ads/AdSize;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/ads/AdSize;-><init>(Lcom/google/android/gms/ads/AdSize;)V
    //         goto :goto_1
    */

    public @JvmStatic fun d(p0: com.google.android.gms.internal.av): com.google.ads.mediation.MediationAdRequest { return TODO("body: (Lcom/google/android/gms/internal/av;)Lcom/google/ads/mediation/MediationAdRequest;") }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/av;->nV:Ljava/util/List;
    //         if-eqz v0, :cond_0
    //         new-instance v3, Ljava/util/HashSet;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/av;->nV:Ljava/util/List;
    //         invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         :goto_0
    //         new-instance v0, Lcom/google/ads/mediation/MediationAdRequest;
    //         new-instance v1, Ljava/util/Date;
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/av;->nT:J
    //         invoke-direct {v1, v4, v5}, Ljava/util/Date;-><init>(J)V
    //         iget v2, p0, Lcom/google/android/gms/internal/av;->nU:I
    //         invoke-static {v2}, Lcom/google/android/gms/internal/db;->k(I)Lcom/google/ads/AdRequest$Gender;
    //         move-result-object v2
    //         iget-boolean v4, p0, Lcom/google/android/gms/internal/av;->nW:Z
    //         iget-object v5, p0, Lcom/google/android/gms/internal/av;->ob:Landroid/location/Location;
    //         invoke-direct/range {v0 .. v5}, Lcom/google/ads/mediation/MediationAdRequest;-><init>(Ljava/util/Date;Lcom/google/ads/AdRequest$Gender;Ljava/util/Set;ZLandroid/location/Location;)V
    //         return-object v0
    //         :cond_0
    //         const/4 v3, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun k(p0: Int): com.google.ads.AdRequest.Gender { return TODO("body: (I)Lcom/google/ads/AdRequest$Gender;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         sget-object v0, Lcom/google/ads/AdRequest$Gender;->UNKNOWN:Lcom/google/ads/AdRequest$Gender;
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         sget-object v0, Lcom/google/ads/AdRequest$Gender;->FEMALE:Lcom/google/ads/AdRequest$Gender;
    //         goto :goto_0
    //         :pswitch_1
    //         sget-object v0, Lcom/google/ads/AdRequest$Gender;->MALE:Lcom/google/ads/AdRequest$Gender;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    }
}
