package com.google.android.gms.analytics.ecommerce

// Auto-emitted from smali.
// 10 fields, 13 methods.

open class ProductAction {
    var BK: java.util.Map

    public constructor(action: String)

    public fun build(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/HashMap;
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->BK:Ljava/util/Map;
    //         invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
    //         return-object v0
    */

    fun put(name: String, value: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "Name should be non-null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->BK:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun setCheckoutOptions(value: String): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 1
    //         const-string v0, "&col"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCheckoutStep(value: Int): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (I)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 2
    //         const-string v0, "&cos"
    //         invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setProductActionList(value: String): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 1
    //         const-string v0, "&pal"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setProductListSource(value: String): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 1
    //         const-string v0, "&pls"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTransactionAffiliation(value: String): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 1
    //         const-string v0, "&ta"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTransactionCouponCode(value: String): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 1
    //         const-string v0, "&tcc"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTransactionId(value: String): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 1
    //         const-string v0, "&ti"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTransactionRevenue(value: Double): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (D)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 3
    //         const-string v0, "&tr"
    //         invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTransactionShipping(value: Double): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (D)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 3
    //         const-string v0, "&ts"
    //         invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTransactionTax(value: Double): com.google.android.gms.analytics.ecommerce.ProductAction { return TODO("body: (D)Lcom/google/android/gms/analytics/ecommerce/ProductAction;") }
    /*
    //         .locals 3
    //         const-string v0, "&tt"
    //         invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/ecommerce/ProductAction;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    companion object {
    @JvmField public val ACTION_ADD: String = "add"
    @JvmField public val ACTION_CHECKOUT: String = "checkout"
    @JvmField public val ACTION_CHECKOUT_OPTION: String = "checkout_option"
    @JvmField public val ACTION_CHECKOUT_OPTIONS: String = "checkout_options"
    @JvmField public val ACTION_CLICK: String = "click"
    @JvmField public val ACTION_DETAIL: String = "detail"
    @JvmField public val ACTION_PURCHASE: String = "purchase"
    @JvmField public val ACTION_REFUND: String = "refund"
    @JvmField public val ACTION_REMOVE: String = "remove"
    }
}
