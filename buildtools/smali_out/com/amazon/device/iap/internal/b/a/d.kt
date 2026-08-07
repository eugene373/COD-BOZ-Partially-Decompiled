package com.amazon.device.iap.internal.b.a

// Auto-emitted from smali source: PurchaseResponseRequest.java.
// 0 fields, 3 methods.

class d: com.amazon.device.iap.internal.b.e() {
    public constructor(p0: com.amazon.device.iap.model.RequestId)

    public fun a() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v2
    //         if-eqz v2, :cond_3
    //         const/4 v1, 0x1
    //         :goto_1
    //         new-instance v3, Lcom/amazon/device/iap/internal/b/f/c;
    //         invoke-direct {v3, p0, v1}, Lcom/amazon/device/iap/internal/b/f/c;-><init>(Lcom/amazon/device/iap/internal/b/e;Z)V
    //         if-eqz v1, :cond_2
    //         sget-object v1, Lcom/amazon/device/iap/model/ProductType;->ENTITLED:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v4
    //         if-eq v1, v4, :cond_1
    //         sget-object v1, Lcom/amazon/device/iap/model/ProductType;->SUBSCRIPTION:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v2
    //         if-ne v1, v2, :cond_2
    //         :cond_1
    //         new-instance v1, Lcom/amazon/device/iap/internal/b/f/b;
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, p0, v2}, Lcom/amazon/device/iap/internal/b/f/b;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V
    //         invoke-virtual {v3, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V
    //         :cond_2
    //         invoke-virtual {p0, v0, v3}, Lcom/amazon/device/iap/internal/b/a/d;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V
    //         goto :goto_0
    //         :cond_3
    //         const/4 v1, 0x0
    //         goto :goto_1
    */

    public fun b() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;-><init>()V
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseResponse;
    //         move-result-object v0
    //         :cond_0
    //         new-instance v1, Lcom/amazon/device/iap/internal/b/f/c;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, p0, v2}, Lcom/amazon/device/iap/internal/b/f/c;-><init>(Lcom/amazon/device/iap/internal/b/e;Z)V
    //         invoke-virtual {p0, v0, v1}, Lcom/amazon/device/iap/internal/b/a/d;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V
    //         return-void
    */

}
