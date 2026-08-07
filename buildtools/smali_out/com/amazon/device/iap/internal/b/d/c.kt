package com.amazon.device.iap.internal.b.d

// Auto-emitted from smali source: PurchaseUpdatesCommandV2.java.
// 1 fields, 4 methods.

class c: com.amazon.device.iap.internal.b.d.b() {
    public constructor(p0: com.amazon.device.iap.internal.b.e, p1: Boolean)

    private fun a(p0: String, p1: String, p2: String): java.util.List { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/amazon/device/iap/model/Receipt;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         new-instance v3, Lorg/json/JSONArray;
    //         invoke-direct {v3, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    //         move-result v1
    //         if-ge v0, v1, :cond_0
    //         :try_start_0
    //         invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-static {v1, p1, p3}, Lcom/amazon/device/iap/internal/util/a;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v1
    //         invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Lcom/amazon/device/iap/internal/b/a; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/amazon/device/iap/internal/b/d; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    //         :goto_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         sget-object v4, Lcom/amazon/device/iap/internal/b/d/c;->b:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "fail to parse receipt, requestId:"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/a;->a()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v4, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :catch_1
    //         move-exception v1
    //         sget-object v4, Lcom/amazon/device/iap/internal/b/d/c;->b:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "fail to verify receipt, requestId:"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/d;->a()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v4, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :catch_2
    //         move-exception v1
    //         sget-object v4, Lcom/amazon/device/iap/internal/b/d/c;->b:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "fail to verify receipt, requestId:"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v4, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_0
    //         return-object v2
    */

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean { return TODO("body: (Lcom/amazon/venezia/command/SuccessResult;)Z") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;
    //         move-result-object v4
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/d/c;->b:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "data: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "userId"
    //         invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v1, "marketplace"
    //         invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v2, "requestId"
    //         invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         const-string v3, "receipts"
    //         invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         invoke-direct {p0, v0, v3, v2}, Lcom/amazon/device/iap/internal/b/d/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v5
    //         const-string v2, "cursor"
    //         invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         const-string v3, "hasMore"
    //         invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v3
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/c;->b()Lcom/amazon/device/iap/internal/b/e;
    //         move-result-object v4
    //         new-instance v6, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v6}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v6, v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v0
    //         new-instance v1, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         invoke-direct {v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;-><init>()V
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/e;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v6
    //         invoke-virtual {v1, v6}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v1
    //         sget-object v6, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-virtual {v1, v6}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v5}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setReceipts(Ljava/util/List;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setHasMore(Z)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         move-result-object v0
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v1
    //         const-string v3, "newCursor"
    //         invoke-virtual {v1, v3, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-virtual {v4}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/Object;)V
    //         const/4 v0, 0x1
    //         return v0
    */

    companion object {
    private val b: String = null!!
    }
}
