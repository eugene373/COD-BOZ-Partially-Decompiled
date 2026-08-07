package com.google.android.gms.ads.search

// Auto-emitted from smali.
// 15 fields, 36 methods.

class SearchAdRequest_Builder {
    private val le: com.google.android.gms.internal.bg.a
    private var xl: Int
    private var xm: Int
    private var xn: Int
    private var xo: Int
    private var xp: Int
    private var xq: Int
    private var xr: Int
    private var xs: Int
    private var xt: String
    private var xu: Int
    private var xv: String
    private var xw: Int
    private var xx: Int
    private var xy: String

    public constructor()

    public fun addCustomEventExtrasBundle(customEventExtras: Class, p1: android.os.Bundle): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bg$a;->b(Ljava/lang/Class;Landroid/os/Bundle;)V
    //         return-object p0
    */

    public fun addNetworkExtras(networkExtras: com.google.android.gms.ads.mediation.NetworkExtras): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Lcom/google/android/gms/ads/mediation/NetworkExtras;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Lcom/google/android/gms/ads/mediation/NetworkExtras;)V
    //         return-object p0
    */

    public fun addNetworkExtrasBundle(networkExtras: Class, p1: android.os.Bundle): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/MediationAdapter;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bg$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)V
    //         return-object p0
    */

    public fun addTestDevice(deviceId: String): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->s(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun build(): com.google.android.gms.ads.search.SearchAdRequest { return TODO("body: ()Lcom/google/android/gms/ads/search/SearchAdRequest;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/ads/search/SearchAdRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/search/SearchAdRequest;-><init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;Lcom/google/android/gms/ads/search/SearchAdRequest$1;)V
    //         return-object v0
    */

    public fun setAnchorTextColor(anchorTextColor: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xl:I
    //         return-object p0
    */

    public fun setBackgroundColor(backgroundColor: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xm:I
    //         invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xn:I
    //         invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xo:I
    //         return-object p0
    */

    public fun setBackgroundGradient(top: Int, bottom: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (II)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xm:I
    //         iput p2, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xn:I
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xo:I
    //         return-object p0
    */

    public fun setBorderColor(borderColor: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xp:I
    //         return-object p0
    */

    public fun setBorderThickness(borderThickness: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xq:I
    //         return-object p0
    */

    public fun setBorderType(borderType: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xr:I
    //         return-object p0
    */

    public fun setCallButtonColor(callButtonColor: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xs:I
    //         return-object p0
    */

    public fun setCustomChannels(channelIds: String): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xt:Ljava/lang/String;
    //         return-object p0
    */

    public fun setDescriptionTextColor(descriptionTextColor: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xu:I
    //         return-object p0
    */

    public fun setFontFace(fontFace: String): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xv:Ljava/lang/String;
    //         return-object p0
    */

    public fun setHeaderTextColor(headerTextColor: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xw:I
    //         return-object p0
    */

    public fun setHeaderTextSize(headerTextSize: Int): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xx:I
    //         return-object p0
    */

    public fun setLocation(location: android.location.Location): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Landroid/location/Location;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Landroid/location/Location;)V
    //         return-object p0
    */

    public fun setQuery(query: String): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xy:Ljava/lang/String;
    //         return-object p0
    */

    public fun tagForChildDirectedTreatment(tagForChildDirectedTreatment: Boolean): com.google.android.gms.ads.search.SearchAdRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->h(Z)V
    //         return-object p0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xl:I
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xm:I
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xn:I
    //         return v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xo:I
    //         return v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xp:I
    //         return v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xq:I
    //         return v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xr:I
    //         return v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xs:I
    //         return v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): String { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xt:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun j(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xu:I
    //         return v0
    */

    @JvmStatic fun k(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): String { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xv:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun l(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xw:I
    //         return v0
    */

    @JvmStatic fun m(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xx:I
    //         return v0
    */

    @JvmStatic fun n(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): String { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xy:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun o(p0: com.google.android.gms.ads.search.SearchAdRequest.Builder): com.google.android.gms.internal.bg.a { return TODO("body: (Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Lcom/google/android/gms/internal/bg$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;
    //         return-object v0
    */

    }
}
