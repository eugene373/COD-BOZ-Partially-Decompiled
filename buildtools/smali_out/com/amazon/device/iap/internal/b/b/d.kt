package com.amazon.device.iap.internal.b.b

// Auto-emitted from smali source: PurchaseRequest.java.
// 0 fields, 3 methods.

class d: com.amazon.device.iap.internal.b.e() {
    public constructor(p0: com.amazon.device.iap.model.RequestId, p1: String)

    public fun a() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun b() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/d;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;-><init>()V
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/d;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseResponse;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/b/d;->a(Ljava/lang/Object;)V
    //         return-void
    */

}
