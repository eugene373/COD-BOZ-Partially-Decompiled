package com.amazon.device.iap.internal.b.g

// Auto-emitted from smali source: NotifyFulfillmentRequest.java.
// 2 fields, 3 methods.

class b: com.amazon.device.iap.internal.b.e() {
    private val a: String
    private val b: com.amazon.device.iap.model.FulfillmentResult

    public constructor(p0: com.amazon.device.iap.model.RequestId, p1: String, p2: com.amazon.device.iap.model.FulfillmentResult)

    public fun a() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun b() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/model/FulfillmentResult;->FULFILLED:Lcom/amazon/device/iap/model/FulfillmentResult;
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/g/b;->b:Lcom/amazon/device/iap/model/FulfillmentResult;
    //         if-eq v0, v1, :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/model/FulfillmentResult;->UNAVAILABLE:Lcom/amazon/device/iap/model/FulfillmentResult;
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/g/b;->b:Lcom/amazon/device/iap/model/FulfillmentResult;
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/a;->a()Lcom/amazon/device/iap/internal/c/a;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/g/b;->a:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/c/a;->c(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         new-instance v1, Lcom/amazon/device/iap/internal/b/f/b;
    //         invoke-direct {v1, p0, v0}, Lcom/amazon/device/iap/internal/b/f/b;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/a;->a()Lcom/amazon/device/iap/internal/c/a;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/g/b;->a:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/c/a;->a(Ljava/lang/String;)V
    //         :cond_1
    //         return-void
    */

}
