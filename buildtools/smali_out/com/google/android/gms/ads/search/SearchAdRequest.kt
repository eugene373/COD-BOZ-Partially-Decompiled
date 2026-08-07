package com.google.android.gms.ads.search

// Auto-emitted from smali.
// 27 fields, 23 methods.

class SearchAdRequest {
    private val ld: com.google.android.gms.internal.bg
    private val xl: Int
    private val xm: Int
    private val xn: Int
    private val xo: Int
    private val xp: Int
    private val xq: Int
    private val xr: Int
    private val xs: Int
    private val xt: String
    private val xu: Int
    private val xv: String
    private val xw: Int
    private val xx: Int
    private val xy: String

    private constructor(builder: com.google.android.gms.ads.search.SearchAdRequest.Builder)

    constructor(x0: com.google.android.gms.ads.search.SearchAdRequest.Builder, x1: com.google.android.gms.ads.search.SearchAdRequest.1)

    fun V(): com.google.android.gms.internal.bg { return TODO("body: ()Lcom/google/android/gms/internal/bg;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         return-object v0
    */

    public fun getAnchorTextColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xl:I
    //         return v0
    */

    public fun getBackgroundColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xm:I
    //         return v0
    */

    public fun getBackgroundGradientBottom(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xn:I
    //         return v0
    */

    public fun getBackgroundGradientTop(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xo:I
    //         return v0
    */

    public fun getBorderColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xp:I
    //         return v0
    */

    public fun getBorderThickness(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xq:I
    //         return v0
    */

    public fun getBorderType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xr:I
    //         return v0
    */

    public fun getCallButtonColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xs:I
    //         return v0
    */

    public fun getCustomChannels(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xt:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCustomEventExtrasBundle(p0: Class): android.os.Bundle { return TODO("body: (Ljava/lang/Class;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)",
    //                 "Landroid/os/Bundle;"
    //             }
    //         .end annotation
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescriptionTextColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xu:I
    //         return v0
    */

    public fun getFontFace(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xv:Ljava/lang/String;
    //         return-object v0
    */

    public fun getHeaderTextColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xw:I
    //         return v0
    */

    public fun getHeaderTextSize(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xx:I
    //         return v0
    */

    public fun getLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getLocation()Landroid/location/Location;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getNetworkExtras(p0: Class): com.google.android.gms.ads.mediation.NetworkExtras { return TODO("body: (Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         .local p1, "networkExtrasClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->getNetworkExtras(Ljava/lang/Class;)Lcom/google/android/gms/ads/mediation/NetworkExtras;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getNetworkExtrasBundle(p0: Class): android.os.Bundle { return TODO("body: (Ljava/lang/Class;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)",
    //                 "Landroid/os/Bundle;"
    //             }
    //         .end annotation
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getQuery(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->xy:Ljava/lang/String;
    //         return-object v0
    */

    public fun isTestDevice(context: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->isTestDevice(Landroid/content/Context;)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    @JvmField public val BORDER_TYPE_DASHED: Int = 0x1
    @JvmField public val BORDER_TYPE_DOTTED: Int = 0x2
    @JvmField public val BORDER_TYPE_NONE: Int = 0x0
    @JvmField public val BORDER_TYPE_SOLID: Int = 0x3
    @JvmField public val CALL_BUTTON_COLOR_DARK: Int = 0x2
    @JvmField public val CALL_BUTTON_COLOR_LIGHT: Int = 0x0
    @JvmField public val CALL_BUTTON_COLOR_MEDIUM: Int = 0x1
    @JvmField public val DEVICE_ID_EMULATOR: String = null!!
    @JvmField public val ERROR_CODE_INTERNAL_ERROR: Int = 0x0
    @JvmField public val ERROR_CODE_INVALID_REQUEST: Int = 0x1
    @JvmField public val ERROR_CODE_NETWORK_ERROR: Int = 0x2
    @JvmField public val ERROR_CODE_NO_FILL: Int = 0x3
    }
}
