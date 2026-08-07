package com.amazon.device.iap

// Auto-emitted from smali source: PurchasingService.java.
// 3 fields, 8 methods.

class PurchasingService {
    private constructor()

    companion object {
    @JvmField public val IS_SANDBOX_MODE: Boolean = false
    @JvmField public val SDK_VERSION: String = "2.0.61.0"
    private val TAG: String = null!!

    public @JvmStatic fun getProductData(p0: java.util.Set): com.amazon.device.iap.model.RequestId { return TODO("body: (Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/amazon/device/iap/model/RequestId;"
    //             }
    //         .end annotation
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/amazon/device/iap/internal/d;->a(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getPurchaseUpdates(p0: Boolean): com.amazon.device.iap.model.RequestId { return TODO("body: (Z)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/amazon/device/iap/internal/d;->a(Z)Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getUserData(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun notifyFulfillment(p0: String, p1: com.amazon.device.iap.model.FulfillmentResult) { /* TODO(body): (Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0, p0, p1}, Lcom/amazon/device/iap/internal/d;->a(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
    //         return-void
    */

    public @JvmStatic fun purchase(p0: String): com.amazon.device.iap.model.RequestId { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/amazon/device/iap/internal/d;->a(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun registerListener(p0: android.content.Context, p1: com.amazon.device.iap.PurchasingListener) { /* TODO(body): (Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0, p0, p1}, Lcom/amazon/device/iap/internal/d;->a(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V
    //         return-void
    */

    }
}
