package com.amazon.device.iap.internal.b.d

// Auto-emitted from smali source: GetPurchaseUpdatesRequest.java.
// 0 fields, 3 methods.

class a: com.amazon.device.iap.internal.b.e() {
    public constructor(p0: com.amazon.device.iap.model.RequestId, p1: Boolean)

    public fun a() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/a;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v2
    //         if-lez v2, :cond_2
    //         new-instance v2, Ljava/util/HashSet;
    //         invoke-direct {v2}, Ljava/util/HashSet;-><init>()V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/amazon/device/iap/model/Receipt;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v4}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_1
    //         new-instance v1, Lcom/amazon/device/iap/internal/b/g/a;
    //         sget-object v3, Lcom/amazon/device/iap/internal/model/a;->a:Lcom/amazon/device/iap/internal/model/a;
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/internal/model/a;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3}, Lcom/amazon/device/iap/internal/b/g/a;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/util/Set;Ljava/lang/String;)V
    //         :cond_2
    //         invoke-virtual {p0, v0, v1}, Lcom/amazon/device/iap/internal/b/d/a;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V
    //         return-void
    */

    public fun b() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/a;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         instance-of v1, v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         if-nez v1, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;-><init>()V
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/a;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/d/a;->a(Ljava/lang/Object;)V
    //         return-void
    //         :cond_1
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         goto :goto_0
    */

}
