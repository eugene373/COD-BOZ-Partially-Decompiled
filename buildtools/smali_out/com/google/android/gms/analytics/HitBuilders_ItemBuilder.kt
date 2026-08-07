package com.google.android.gms.analytics

// Auto-emitted from smali.
// 0 fields, 9 methods.

open class HitBuilders_ItemBuilder: com.google.android.gms.analytics.HitBuilders.HitBuilder() {
    public constructor()

    public fun build(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->build()Ljava/util/Map;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setCategory(category: String): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&iv"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setCurrencyCode(currencyCode: String): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&cu"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setName(name: String): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&in"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setPrice(price: Double): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (D)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 3
    //         const-string v0, "&ip"
    //         invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setQuantity(quantity: Long): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (J)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 3
    //         const-string v0, "&iq"
    //         invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setSku(sku: String): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&ic"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setTransactionId(transactionid: String): com.google.android.gms.analytics.HitBuilders.ItemBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&ti"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

}
