package com.google.android.gms.ads.doubleclick

// Auto-emitted from smali.
// 9 fields, 15 methods.

class PublisherAdRequest {
    private val ld: com.google.android.gms.internal.bg

    private constructor(builder: com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder)

    constructor(x0: com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder, x1: com.google.android.gms.ads.doubleclick.PublisherAdRequest.1)

    public fun V(): com.google.android.gms.internal.bg { return TODO("body: ()Lcom/google/android/gms/internal/bg;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         return-object v0
    */

    public fun getBirthday(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getBirthday()Ljava/util/Date;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getContentUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getContentUrl()Ljava/lang/String;
    //         move-result-object v0
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
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->getCustomEventExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getGender(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getGender()I
    //         move-result v0
    //         return v0
    */

    public fun getKeywords(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getKeywords()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getLocation()Landroid/location/Location;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getManualImpressionsEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getManualImpressionsEnabled()Z
    //         move-result v0
    //         return v0
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
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
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
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPublisherProvidedId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bg;->getPublisherProvidedId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isTestDevice(context: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->ld:Lcom/google/android/gms/internal/bg;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg;->isTestDevice(Landroid/content/Context;)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    @JvmField public val DEVICE_ID_EMULATOR: String = null!!
    @JvmField public val ERROR_CODE_INTERNAL_ERROR: Int = 0x0
    @JvmField public val ERROR_CODE_INVALID_REQUEST: Int = 0x1
    @JvmField public val ERROR_CODE_NETWORK_ERROR: Int = 0x2
    @JvmField public val ERROR_CODE_NO_FILL: Int = 0x3
    @JvmField public val GENDER_FEMALE: Int = 0x2
    @JvmField public val GENDER_MALE: Int = 0x1
    @JvmField public val GENDER_UNKNOWN: Int = 0
    }
}
