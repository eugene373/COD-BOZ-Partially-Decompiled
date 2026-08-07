package com.google.android.gms.analytics.ecommerce

// Auto-emitted from smali.
// 1 fields, 14 methods.

open class Product {
    var BK: java.util.Map

    public constructor()

    public fun aq(p0: String): java.util.Map { return TODO("body: (Ljava/lang/String;)Ljava/util/Map;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ecommerce/Product;->BK:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    fun put(name: String, value: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "Name should be non-null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ecommerce/Product;->BK:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun setBrand(value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         const-string v0, "br"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCategory(value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         const-string v0, "ca"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCouponCode(value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         const-string v0, "cc"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCustomDimension(index: Int, value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (ILjava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/n;->D(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCustomMetric(index: Int, value: Int): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (II)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/n;->E(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setId(value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         const-string v0, "id"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setName(value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         const-string v0, "nm"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setPosition(value: Int): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (I)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 2
    //         const-string v0, "ps"
    //         invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setPrice(value: Double): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (D)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 3
    //         const-string v0, "pr"
    //         invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setQuantity(value: Int): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (I)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 2
    //         const-string v0, "qt"
    //         invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setVariant(value: String): com.google.android.gms.analytics.ecommerce.Product { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;") }
    /*
    //         .locals 1
    //         const-string v0, "va"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/Product;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

}
