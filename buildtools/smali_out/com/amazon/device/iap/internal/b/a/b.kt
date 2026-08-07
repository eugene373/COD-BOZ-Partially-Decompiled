package com.amazon.device.iap.internal.b.a

// Auto-emitted from smali source: PurchaseResponseCommandV1.java.
// 1 fields, 4 methods.

class b: com.amazon.device.iap.internal.b.a.c() {
    public constructor(p0: com.amazon.device.iap.internal.b.e)

    private fun a(p0: String, p1: String, p2: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         if-eqz p1, :cond_0
    //         if-eqz p2, :cond_0
    //         if-nez p3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "orderStatus"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->safeValueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         move-result-object v1
    //         sget-object v2, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         if-ne v1, v2, :cond_0
    //         invoke-static {v0, p2, p1}, Lcom/amazon/device/iap/internal/util/a;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/a;->a()Lcom/amazon/device/iap/internal/c/a;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, p1, p2, v0, p3}, Lcom/amazon/device/iap/internal/c/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/b/a/b;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Error in savePendingReceipt: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean { return TODO("body: (Lcom/amazon/venezia/command/SuccessResult;)Z") }
    /*
    //         .locals 10
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;
    //         move-result-object v3
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/a/b;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "data: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/b;->getCommandData()Ljava/util/Map;
    //         move-result-object v0
    //         const-string v1, "requestId"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v1, "userId"
    //         invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v2, "marketplace"
    //         invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         const-string v4, "receipt"
    //         invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/b;->a()Lcom/amazon/device/iap/internal/c/b;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Lcom/amazon/device/iap/internal/c/b;->a(Ljava/lang/String;)Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/b;->b()Lcom/amazon/device/iap/internal/b/e;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->b()V
    //         move v0, v6
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-static {v3}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         sget-object v3, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {p0, v1, v2, v0, v3}, Lcom/amazon/device/iap/internal/b/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)V
    //         move v0, v5
    //         goto :goto_0
    //         :cond_2
    //         const/4 v4, 0x0
    //         new-instance v7, Lorg/json/JSONObject;
    //         invoke-direct {v7, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v8, "orderStatus"
    //         invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v8
    //         invoke-static {v8}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->safeValueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         move-result-object v8
    //         sget-object v9, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         if-ne v8, v9, :cond_4
    //         :try_start_0
    //         invoke-static {v7, v1, v0}, Lcom/amazon/device/iap/internal/util/a;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/device/iap/model/Receipt;
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v4
    //         sget-object v5, Lcom/amazon/device/iap/model/ProductType;->CONSUMABLE:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v7
    //         if-ne v5, v7, :cond_3
    //         invoke-direct {p0, v0, v1, v3}, Lcom/amazon/device/iap/internal/b/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_3
    //         move-object v0, v4
    //         :goto_1
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/b;->b()Lcom/amazon/device/iap/internal/b/e;
    //         move-result-object v3
    //         new-instance v4, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v4}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v4, v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v1
    //         new-instance v2, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         invoke-direct {v2}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;-><init>()V
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/internal/b/e;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v4
    //         invoke-virtual {v2, v4}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v8}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setReceipt(Lcom/amazon/device/iap/model/Receipt;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseResponse;
    //         move-result-object v0
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/Object;)V
    //         move v0, v6
    //         goto :goto_0
    //         :catch_0
    //         move-exception v3
    //         sget-object v3, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {p0, v1, v2, v0, v3}, Lcom/amazon/device/iap/internal/b/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)V
    //         move v0, v5
    //         goto :goto_0
    //         :cond_4
    //         move-object v0, v4
    //         goto :goto_1
    */

    companion object {
    private val a: String = null!!
    }
}
