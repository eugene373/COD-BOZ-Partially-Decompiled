package com.google.android.gms.ads

// Auto-emitted from smali.
// 1 fields, 13 methods.

class AdRequest_Builder {
    private val le: com.google.android.gms.internal.bg.a

    public constructor()

    public fun addCustomEventExtrasBundle(customEventExtras: Class, p1: android.os.Bundle): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bg$a;->b(Ljava/lang/Class;Landroid/os/Bundle;)V
    //         return-object p0
    */

    public fun addKeyword(keyword: String): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->r(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun addNetworkExtras(networkExtras: com.google.android.gms.ads.mediation.NetworkExtras): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Lcom/google/android/gms/ads/mediation/NetworkExtras;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Lcom/google/android/gms/ads/mediation/NetworkExtras;)V
    //         return-object p0
    */

    public fun addNetworkExtrasBundle(networkExtras: Class, p1: android.os.Bundle): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/MediationAdapter;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bg$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)V
    //         return-object p0
    */

    public fun addTestDevice(deviceId: String): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->s(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun build(): com.google.android.gms.ads.AdRequest { return TODO("body: ()Lcom/google/android/gms/ads/AdRequest;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/ads/AdRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/AdRequest;-><init>(Lcom/google/android/gms/ads/AdRequest$Builder;Lcom/google/android/gms/ads/AdRequest$1;)V
    //         return-object v0
    */

    public fun setBirthday(birthday: java.util.Date): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Ljava/util/Date;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Ljava/util/Date;)V
    //         return-object p0
    */

    public fun setContentUrl(contentUrl: String): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 6
    //         const/16 v5, 0x200
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const-string v0, "Content URL must be non-null."
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "Content URL must be non-empty."
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-gt v0, v5, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Content URL must not exceed %d in length.  Provided length was %d."
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/Object;
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v4, v1
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->t(Ljava/lang/String;)V
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    */

    public fun setGender(gender: Int): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->g(I)V
    //         return-object p0
    */

    public fun setLocation(location: android.location.Location): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Landroid/location/Location;)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Landroid/location/Location;)V
    //         return-object p0
    */

    public fun tagForChildDirectedTreatment(tagForChildDirectedTreatment: Boolean): com.google.android.gms.ads.AdRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/ads/AdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->h(Z)V
    //         return-object p0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.ads.AdRequest.Builder): com.google.android.gms.internal.bg.a { return TODO("body: (Lcom/google/android/gms/ads/AdRequest$Builder;)Lcom/google/android/gms/internal/bg$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         return-object v0
    */

    }
}
