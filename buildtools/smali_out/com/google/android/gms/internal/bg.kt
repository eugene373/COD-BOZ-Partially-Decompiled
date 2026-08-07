package com.google.android.gms.internal

// Auto-emitted from smali.
// 13 fields, 18 methods.

class bg {
    private val d: java.util.Date
    private val f: java.util.Set
    private val h: android.location.Location
    private val ol: String
    private val om: Int
    private val on: Boolean
    private val oo: android.os.Bundle
    private val op: java.util.Map
    private val oq: String
    private val or: com.google.android.gms.ads.search.SearchAdRequest
    private val os: Int
    private val ot: java.util.Set

    public constructor(p0: com.google.android.gms.internal.bg.a)

    public constructor(p0: com.google.android.gms.internal.bg.a, p1: com.google.android.gms.ads.search.SearchAdRequest)

    public fun bd(): com.google.android.gms.ads.search.SearchAdRequest { return TODO("body: ()Lcom/google/android/gms/ads/search/SearchAdRequest;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->or:Lcom/google/android/gms/ads/search/SearchAdRequest;
    //         return-object v0
    */

    public fun be(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
    //                 ">;",
    //                 "Lcom/google/android/gms/ads/mediation/NetworkExtras;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->op:Ljava/util/Map;
    //         return-object v0
    */

    public fun bf(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->oo:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun bg(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/bg;->os:I
    //         return v0
    */

    public fun getBirthday(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->d:Ljava/util/Date;
    //         return-object v0
    */

    public fun getContentUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->ol:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCustomEventExtrasBundle(p0: Class): android.os.Bundle { return TODO("body: (Ljava/lang/Class;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
    //                 ">;)",
    //                 "Landroid/os/Bundle;"
    //             }
    //         .end annotation
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->oo:Landroid/os/Bundle;
    //         const-string v1, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getGender(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/bg;->om:I
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->f:Ljava/util/Set;
    //         return-object v0
    */

    public fun getLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->h:Landroid/location/Location;
    //         return-object v0
    */

    public fun getManualImpressionsEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/bg;->on:Z
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->op:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/ads/mediation/NetworkExtras;
    //         return-object v0
    */

    public fun getNetworkExtrasBundle(p0: Class): android.os.Bundle { return TODO("body: (Ljava/lang/Class;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
    //                 ">;)",
    //                 "Landroid/os/Bundle;"
    //             }
    //         .end annotation
    //         .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/MediationAdapter;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->oo:Landroid/os/Bundle;
    //         invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPublisherProvidedId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->oq:Ljava/lang/String;
    //         return-object v0
    */

    public fun isTestDevice(context: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg;->ot:Ljava/util/Set;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/gr;->v(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    @JvmField public val DEVICE_ID_EMULATOR: String = null!!
    }
}
