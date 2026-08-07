package com.amazon.device.iap.internal.b.d

// Auto-emitted from smali source: PurchaseUpdatesCommandV1.java.
// 2 fields, 3 methods.

class d: com.amazon.device.iap.internal.b.d.b() {
    public constructor(p0: com.amazon.device.iap.internal.b.e)

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean { return TODO("body: (Lcom/amazon/venezia/command/SuccessResult;)Z") }
    /*
    //         .locals 11
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;
    //         move-result-object v5
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/d/d;->b:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "data: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "userId"
    //         invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v1, "requestId"
    //         invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v1, "marketplace"
    //         invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         new-instance v6, Ljava/util/ArrayList;
    //         invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
    //         const-string v2, "receipts"
    //         invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         new-instance v7, Lorg/json/JSONArray;
    //         invoke-direct {v7, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    //         move v2, v3
    //         :goto_0
    //         invoke-virtual {v7}, Lorg/json/JSONArray;->length()I
    //         move-result v4
    //         if-ge v2, v4, :cond_1
    //         :try_start_0
    //         invoke-virtual {v7, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         const/4 v8, 0x0
    //         invoke-static {v4, v0, v8}, Lcom/amazon/device/iap/internal/util/a;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v4
    //         invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         sget-object v8, Lcom/amazon/device/iap/model/ProductType;->ENTITLED:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v9
    //         if-ne v8, v9, :cond_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/c;->a()Lcom/amazon/device/iap/internal/c/c;
    //         move-result-object v8
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/model/Receipt;->getSku()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v8, v0, v9, v4}, Lcom/amazon/device/iap/internal/c/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Lcom/amazon/device/iap/internal/b/a; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/amazon/device/iap/internal/b/d; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v4
    //         sget-object v8, Lcom/amazon/device/iap/internal/b/d/d;->b:Ljava/lang/String;
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v10, "fail to parse receipt, requestId:"
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/a;->a()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v8, v4}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :catch_1
    //         move-exception v4
    //         sget-object v8, Lcom/amazon/device/iap/internal/b/d/d;->b:Ljava/lang/String;
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v10, "fail to verify receipt, requestId:"
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/d;->a()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v8, v4}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :catch_2
    //         move-exception v4
    //         sget-object v8, Lcom/amazon/device/iap/internal/b/d/d;->b:Ljava/lang/String;
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v10, "fail to verify receipt, requestId:"
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v8, v4}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_1
    //         const-string v2, "revocations"
    //         invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         new-instance v4, Lorg/json/JSONArray;
    //         invoke-direct {v4, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    //         :goto_2
    //         invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         if-ge v3, v2, :cond_2
    //         :try_start_1
    //         invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/c;->a()Lcom/amazon/device/iap/internal/c/c;
    //         move-result-object v7
    //         invoke-virtual {v7, v0, v2}, Lcom/amazon/device/iap/internal/c/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v7
    //         new-instance v8, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         invoke-direct {v8}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;-><init>()V
    //         invoke-virtual {v8, v2}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setSku(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v2
    //         sget-object v8, Lcom/amazon/device/iap/model/ProductType;->ENTITLED:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v2, v8}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setProductType(Lcom/amazon/device/iap/model/ProductType;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v2
    //         const/4 v8, 0x0
    //         invoke-virtual {v2, v8}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setPurchaseDate(Ljava/util/Date;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v2
    //         sget-object v8, Lcom/amazon/device/iap/internal/b/d/d;->c:Ljava/util/Date;
    //         invoke-virtual {v2, v8}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setCancelDate(Ljava/util/Date;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v7}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setReceiptId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->build()Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v2
    //         invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3
    //         :goto_3
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_2
    //         :catch_3
    //         move-exception v2
    //         sget-object v2, Lcom/amazon/device/iap/internal/b/d/d;->b:Ljava/lang/String;
    //         new-instance v7, Ljava/lang/StringBuilder;
    //         invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v8, "fail to parse JSON["
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         const-string v8, "] in \""
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         const-string v8, "\""
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-static {v2, v7}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_3
    //         :cond_2
    //         const-string v2, "cursor"
    //         invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         const-string v3, "hasMore"
    //         invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         const-string v4, "true"
    //         invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v3
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/d;->b()Lcom/amazon/device/iap/internal/b/e;
    //         move-result-object v4
    //         new-instance v5, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v5}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v5, v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v0
    //         new-instance v1, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         invoke-direct {v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;-><init>()V
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/e;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v5
    //         invoke-virtual {v1, v5}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v1
    //         sget-object v5, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-virtual {v1, v5}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v6}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setReceipts(Ljava/util/List;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setHasMore(Z)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         move-result-object v0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/c/a;->a()Lcom/amazon/device/iap/internal/c/a;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v3}, Lcom/amazon/device/iap/internal/c/a;->b(Ljava/lang/String;)Ljava/util/Set;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;
    //         move-result-object v3
    //         invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/Object;)V
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         const-string v1, "newCursor"
    //         invoke-virtual {v0, v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    private val b: String = null!!
    private val c: java.util.Date = null!!
    }
}
