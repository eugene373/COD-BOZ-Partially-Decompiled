package com.google.android.gms.internal

// Auto-emitted from smali.
// 11 fields, 24 methods.

class bg_a {
    private var d: java.util.Date
    private var h: android.location.Location
    private var ol: String
    private var om: Int
    private var on: Boolean
    private val oo: android.os.Bundle
    private var oq: String
    private var os: Int
    private val ou: java.util.HashSet
    private val ov: java.util.HashMap
    private val ow: java.util.HashSet

    public constructor()

    public fun a(p0: android.location.Location) { /* TODO(body): (Landroid/location/Location;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bg$a;->h:Landroid/location/Location;
    //         return-void
    */

    public fun a(p0: com.google.android.gms.ads.mediation.NetworkExtras) { /* TODO(body): (Lcom/google/android/gms/ads/mediation/NetworkExtras;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         instance-of v0, p1, Lcom/google/android/gms/ads/mediation/admob/AdMobExtras;
    //         if-eqz v0, :cond_0
    //         const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;
    //         check-cast p1, Lcom/google/android/gms/ads/mediation/admob/AdMobExtras;
    //         invoke-virtual {p1}, Lcom/google/android/gms/ads/mediation/admob/AdMobExtras;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/bg$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ov:Ljava/util/HashMap;
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun a(p0: Class, p1: android.os.Bundle) { /* TODO(body): (Ljava/lang/Class;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
    //                 ">;",
    //                 "Landroid/os/Bundle;",
    //                 ")V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->oo:Landroid/os/Bundle;
    //         invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun a(p0: java.util.Date) { /* TODO(body): (Ljava/util/Date;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bg$a;->d:Ljava/util/Date;
    //         return-void
    */

    public fun b(p0: Class, p1: android.os.Bundle) { /* TODO(body): (Ljava/lang/Class;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<+",
    //                 "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
    //                 ">;",
    //                 "Landroid/os/Bundle;",
    //                 ")V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->oo:Landroid/os/Bundle;
    //         const-string v1, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->oo:Landroid/os/Bundle;
    //         const-string v1, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->oo:Landroid/os/Bundle;
    //         const-string v1, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun g(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/internal/bg$a;->om:I
    //         return-void
    */

    public fun g(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/bg$a;->on:Z
    //         return-void
    */

    public fun h(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput v0, p0, Lcom/google/android/gms/internal/bg$a;->os:I
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun r(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ou:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun s(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ow:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun t(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bg$a;->ol:Ljava/lang/String;
    //         return-void
    */

    public fun u(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bg$a;->oq:Ljava/lang/String;
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.bg.a): java.util.Date { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->d:Ljava/util/Date;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.bg.a): String { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ol:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.internal.bg.a): Int { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/bg$a;->om:I
    //         return v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.internal.bg.a): java.util.HashSet { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Ljava/util/HashSet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ou:Ljava/util/HashSet;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.internal.bg.a): android.location.Location { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->h:Landroid/location/Location;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.internal.bg.a): Boolean { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/bg$a;->on:Z
    //         return v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.internal.bg.a): android.os.Bundle { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->oo:Landroid/os/Bundle;
    //         return-object v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.internal.bg.a): java.util.HashMap { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ov:Ljava/util/HashMap;
    //         return-object v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.internal.bg.a): String { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->oq:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun j(p0: com.google.android.gms.internal.bg.a): Int { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/bg$a;->os:I
    //         return v0
    */

    @JvmStatic fun k(p0: com.google.android.gms.internal.bg.a): java.util.HashSet { return TODO("body: (Lcom/google/android/gms/internal/bg$a;)Ljava/util/HashSet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bg$a;->ow:Ljava/util/HashSet;
    //         return-object v0
    */

    }
}
