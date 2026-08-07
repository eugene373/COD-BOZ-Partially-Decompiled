package com.amazon.device.iap.internal.a

// Auto-emitted from smali source: SandboxRequestHandler.java.
// 1 fields, 23 methods.

class c: com.amazon.device.iap.internal.c {
    public constructor()

    private fun a(p0: String): android.content.Intent { return TODO("body: (Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         new-instance v1, Landroid/content/ComponentName;
    //         const-string v2, "com.amazon.sdktestclient"
    //         const-string v3, "com.amazon.sdktestclient.command.CommandBroker"
    //         invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         return-object v0
    */

    private fun a(p0: String, p1: org.json.JSONObject): com.amazon.device.iap.model.Product { return TODO("body: (Ljava/lang/String;Lorg/json/JSONObject;)Lcom/amazon/device/iap/model/Product;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const-string v0, "itemType"
    //         invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/amazon/device/iap/model/ProductType;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v0
    //         const-string v1, "priceJson"
    //         invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v2, "currency"
    //         invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;
    //         move-result-object v2
    //         new-instance v3, Ljava/math/BigDecimal;
    //         const-string v4, "value"
    //         invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v3, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2}, Ljava/util/Currency;->getSymbol()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "title"
    //         invoke-virtual {p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "description"
    //         invoke-virtual {p2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "smallIconUrl"
    //         invoke-virtual {p2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         new-instance v5, Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         invoke-direct {v5}, Lcom/amazon/device/iap/internal/model/ProductBuilder;-><init>()V
    //         invoke-virtual {v5, p1}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->setSku(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->setProductType(Lcom/amazon/device/iap/model/ProductType;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v3}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->setDescription(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->setPrice(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v4}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->setSmallIconUrl(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->setTitle(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ProductBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/ProductBuilder;->build()Lcom/amazon/device/iap/model/Product;
    //         move-result-object v0
    //         return-object v0
    */

    private fun a(p0: org.json.JSONObject): com.amazon.device.iap.model.Receipt { return TODO("body: (Lorg/json/JSONObject;)Lcom/amazon/device/iap/model/Receipt;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/text/ParseException;
    //             }
    //         .end annotation
    //         const-string v0, "receiptId"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v0, "sku"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "itemType"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/amazon/device/iap/model/ProductType;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v3
    //         const-string v0, "purchaseDate"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         sget-object v4, Lcom/amazon/device/iap/internal/a/b;->a:Ljava/text/DateFormat;
    //         invoke-virtual {v4, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    //         move-result-object v4
    //         const-string v0, "cancelDate"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v5
    //         if-nez v5, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         new-instance v5, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         invoke-direct {v5}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;-><init>()V
    //         invoke-virtual {v5, v1}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setReceiptId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setSku(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setProductType(Lcom/amazon/device/iap/model/ProductType;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setPurchaseDate(Ljava/util/Date;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->setCancelDate(Ljava/util/Date;)Lcom/amazon/device/iap/internal/model/ReceiptBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/ReceiptBuilder;->build()Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         sget-object v5, Lcom/amazon/device/iap/internal/a/b;->a:Ljava/text/DateFormat;
    //         invoke-virtual {v5, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun a(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/a/c;->b(Landroid/content/Intent;)Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         move-result-object v1
    //         sget-object v2, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         if-ne v1, v2, :cond_0
    //         new-instance v1, Lorg/json/JSONObject;
    //         const-string v2, "purchaseUpdatesOutput"
    //         invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v2, "offset"
    //         invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         sget-object v2, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Offset for PurchaseUpdatesResponse:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2, v1}, Lcom/amazon/device/iap/internal/util/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
    //         return-void
    */

    private fun a(p0: String, p1: String, p2: Boolean) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 6
    //         :try_start_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-static {p2}, Lcom/amazon/device/iap/internal/util/b;->a(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         sget-object v2, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "send PurchaseUpdates with user id:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ";reset flag:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ", local cursor:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ", parsed from old requestId:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         new-instance v3, Lorg/json/JSONObject;
    //         invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    //         const-string v4, "requestId"
    //         invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v4, "offset"
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x0
    //         :cond_0
    //         invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "sdkVersion"
    //         const-string v4, "2.0.61.0"
    //         invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "packageName"
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "purchaseUpdatesInput"
    //         invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.amazon.testclient.iap.purchaseUpdates"
    //         invoke-direct {p0, v0}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         const/high16 v3, 0x10000000
    //         invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "Error in sendPurchaseUpdatesRequest."
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun a(p0: String, p1: Boolean, p2: Boolean) { /* TODO(body): (Ljava/lang/String;ZZ)V */ }
    /*
    //         .locals 5
    //         :try_start_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    //         const-string v3, "requestId"
    //         invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "packageName"
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "sdkVersion"
    //         const-string v4, "2.0.61.0"
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "isPurchaseUpdates"
    //         invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         const-string v3, "reset"
    //         invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         const-string v3, "userInput"
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "com.amazon.testclient.iap.appUserId"
    //         invoke-direct {p0, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const/high16 v3, 0x10000000
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "Error in sendGetUserDataRequest."
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun b(p0: android.content.Intent): com.amazon.device.iap.model.PurchaseUpdatesResponse { return TODO("body: (Landroid/content/Intent;)Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;") }
    /*
    //         .locals 12
    //         const/4 v6, 0x0
    //         const/4 v1, 0x0
    //         sget-object v2, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         :try_start_0
    //         new-instance v7, Lorg/json/JSONObject;
    //         const-string v0, "purchaseUpdatesOutput"
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v0, "requestId"
    //         invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    //         move-result-object v5
    //         :try_start_1
    //         const-string v0, "status"
    //         invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         move-result-object v2
    //         const-string v0, "isMore"
    //         invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    //         move-result v3
    //         :try_start_2
    //         const-string v0, "userId"
    //         invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v4, "marketplace"
    //         invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         new-instance v8, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v8}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v8, v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v4}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    //         move-result-object v4
    //         :try_start_3
    //         sget-object v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         if-ne v2, v0, :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         :try_end_3
    //         .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    //         :try_start_4
    //         const-string v1, "receipts"
    //         invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :goto_0
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v7
    //         if-ge v6, v7, :cond_1
    //         invoke-virtual {v1, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
    //         :try_end_4
    //         .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    //         move-result-object v7
    //         :try_start_5
    //         invoke-direct {p0, v7}, Lcom/amazon/device/iap/internal/a/c;->a(Lorg/json/JSONObject;)Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v8
    //         invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_5
    //         .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    //         :goto_1
    //         add-int/lit8 v6, v6, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v8
    //         :try_start_6
    //         sget-object v8, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v10, "Failed to parse receipt from json:"
    //         invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-static {v8, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_6
    //         .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    //         goto :goto_1
    //         :catch_1
    //         move-exception v1
    //         move-object v11, v1
    //         move-object v1, v2
    //         move v2, v3
    //         move-object v3, v4
    //         move-object v4, v5
    //         move-object v5, v11
    //         :goto_2
    //         sget-object v6, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v7, "Error parsing purchase updates output"
    //         invoke-static {v6, v7, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :goto_3
    //         new-instance v5, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         invoke-direct {v5}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;-><init>()V
    //         invoke-virtual {v5, v4}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setReceipts(Ljava/util/List;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setHasMore(Z)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         move-object v0, v1
    //         :cond_1
    //         move-object v1, v2
    //         move v2, v3
    //         move-object v3, v4
    //         move-object v4, v5
    //         goto :goto_3
    //         :catch_2
    //         move-exception v0
    //         move-object v5, v0
    //         move-object v3, v1
    //         move-object v4, v1
    //         move-object v0, v1
    //         move-object v1, v2
    //         move v2, v6
    //         goto :goto_2
    //         :catch_3
    //         move-exception v0
    //         move-object v3, v1
    //         move-object v4, v5
    //         move-object v5, v0
    //         move-object v0, v1
    //         move-object v1, v2
    //         move v2, v6
    //         goto :goto_2
    //         :catch_4
    //         move-exception v0
    //         move-object v4, v5
    //         move-object v5, v0
    //         move-object v0, v1
    //         move v11, v3
    //         move-object v3, v1
    //         move-object v1, v2
    //         move v2, v11
    //         goto :goto_2
    //         :catch_5
    //         move-exception v0
    //         move-object v11, v0
    //         move-object v0, v1
    //         move-object v1, v2
    //         move v2, v3
    //         move-object v3, v4
    //         move-object v4, v5
    //         move-object v5, v11
    //         goto :goto_2
    */

    private fun c(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/a/c;->d(Landroid/content/Intent;)Lcom/amazon/device/iap/model/ProductDataResponse;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
    //         return-void
    */

    private fun d(p0: android.content.Intent): com.amazon.device.iap.model.ProductDataResponse { return TODO("body: (Landroid/content/Intent;)Lcom/amazon/device/iap/model/ProductDataResponse;") }
    /*
    //         .locals 9
    //         const/4 v0, 0x0
    //         sget-object v3, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         :try_start_0
    //         new-instance v5, Lorg/json/JSONObject;
    //         const-string v1, "itemDataOutput"
    //         invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "requestId"
    //         invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v4
    //         :try_start_1
    //         const-string v1, "status"
    //         invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         move-result-object v3
    //         sget-object v1, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         if-eq v3, v1, :cond_2
    //         new-instance v2, Ljava/util/LinkedHashSet;
    //         invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    //         :try_start_2
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    //         :try_start_3
    //         const-string v0, "unavailableSkus"
    //         invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v6
    //         if-eqz v6, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {v6}, Lorg/json/JSONArray;->length()I
    //         move-result v7
    //         if-ge v0, v7, :cond_0
    //         invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    //         move-result-object v7
    //         invoke-interface {v2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "items"
    //         invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v5
    //         if-eqz v5, :cond_1
    //         invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
    //         move-result-object v6
    //         :goto_1
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v7
    //         invoke-direct {p0, v0, v7}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/amazon/device/iap/model/Product;
    //         move-result-object v7
    //         invoke-interface {v1, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_3
    //         .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         move-object v8, v0
    //         move-object v0, v1
    //         move-object v1, v3
    //         move-object v3, v4
    //         move-object v4, v8
    //         :goto_2
    //         sget-object v5, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v6, "Error parsing item data output"
    //         invoke-static {v5, v6, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :goto_3
    //         new-instance v4, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;
    //         invoke-direct {v4}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;-><init>()V
    //         invoke-virtual {v4, v3}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->setProductData(Ljava/util/Map;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->setUnavailableSkus(Ljava/util/Set;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->build()Lcom/amazon/device/iap/model/ProductDataResponse;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         move-object v0, v1
    //         move-object v1, v2
    //         :goto_4
    //         move-object v2, v1
    //         move-object v1, v3
    //         move-object v3, v4
    //         goto :goto_3
    //         :catch_1
    //         move-exception v1
    //         move-object v4, v1
    //         move-object v2, v0
    //         move-object v1, v3
    //         move-object v3, v0
    //         goto :goto_2
    //         :catch_2
    //         move-exception v1
    //         move-object v2, v0
    //         move-object v8, v3
    //         move-object v3, v4
    //         move-object v4, v1
    //         move-object v1, v8
    //         goto :goto_2
    //         :catch_3
    //         move-exception v1
    //         move-object v8, v1
    //         move-object v1, v3
    //         move-object v3, v4
    //         move-object v4, v8
    //         goto :goto_2
    //         :cond_2
    //         move-object v1, v0
    //         goto :goto_4
    */

    private fun e(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/a/c;->f(Landroid/content/Intent;)Lcom/amazon/device/iap/model/UserDataResponse;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v3
    //         const-string v0, "userInput"
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         const/4 v1, 0x0
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         if-eqz v3, :cond_0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         invoke-virtual {p0, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
    //         :goto_1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v5, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v6, Ljava/lang/StringBuilder;
    //         invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v7, "Unable to parse request data: "
    //         invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v6
    //         invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v5, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "isPurchaseUpdates"
    //         invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         invoke-virtual {p0, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v1
    //         if-eqz v1, :cond_3
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         :cond_3
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "No Userid found in userDataResponse"
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;-><init>()V
    //         invoke-virtual {v0, v3}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setReceipts(Ljava/util/List;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v8}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setHasMore(Z)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
    //         goto :goto_1
    //         :cond_4
    //         sget-object v1, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "sendGetPurchaseUpdates with user id"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v5
    //         invoke-virtual {v5}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v1, "reset"
    //         const/4 v4, 0x1
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {p0, v1, v2, v0}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;Ljava/lang/String;Z)V
    //         goto/16 :goto_1
    */

    private fun f(p0: android.content.Intent): com.amazon.device.iap.model.UserDataResponse { return TODO("body: (Landroid/content/Intent;)Lcom/amazon/device/iap/model/UserDataResponse;") }
    /*
    //         .locals 7
    //         const/4 v0, 0x0
    //         sget-object v3, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         :try_start_0
    //         new-instance v4, Lorg/json/JSONObject;
    //         const-string v1, "userOutput"
    //         invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v4, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "requestId"
    //         invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v2
    //         :try_start_1
    //         const-string v1, "status"
    //         invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         move-result-object v1
    //         :try_start_2
    //         sget-object v3, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         if-ne v1, v3, :cond_0
    //         const-string v3, "userId"
    //         invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v5, "marketplace"
    //         invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         new-instance v5, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v5}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v5, v3}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v4}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    //         move-result-object v0
    //         :cond_0
    //         move-object v6, v1
    //         move-object v1, v0
    //         move-object v0, v6
    //         :goto_0
    //         new-instance v3, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         invoke-direct {v3}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;-><init>()V
    //         invoke-virtual {v3, v2}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->build()Lcom/amazon/device/iap/model/UserDataResponse;
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         move-object v2, v0
    //         move-object v6, v3
    //         move-object v3, v1
    //         move-object v1, v6
    //         :goto_1
    //         sget-object v4, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v5, "Error parsing userid output"
    //         invoke-static {v4, v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         move-object v6, v1
    //         move-object v1, v0
    //         move-object v0, v6
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         move-object v6, v1
    //         move-object v1, v3
    //         move-object v3, v6
    //         goto :goto_1
    //         :catch_2
    //         move-exception v3
    //         goto :goto_1
    */

    private fun g(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/a/c;->h(Landroid/content/Intent;)Lcom/amazon/device/iap/model/PurchaseResponse;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
    //         return-void
    */

    private fun h(p0: android.content.Intent): com.amazon.device.iap.model.PurchaseResponse { return TODO("body: (Landroid/content/Intent;)Lcom/amazon/device/iap/model/PurchaseResponse;") }
    /*
    //         .locals 8
    //         const/4 v0, 0x0
    //         sget-object v4, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         :try_start_0
    //         new-instance v5, Lorg/json/JSONObject;
    //         const-string v1, "purchaseOutput"
    //         invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "requestId"
    //         invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v3
    //         :try_start_1
    //         const-string v1, "userId"
    //         invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "marketplace"
    //         invoke-virtual {v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v6, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v6}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v6, v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         move-result-object v2
    //         :try_start_2
    //         const-string v1, "purchaseStatus"
    //         invoke-virtual {v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->safeValueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    //         move-result-object v1
    //         :try_start_3
    //         const-string v4, "receipt"
    //         invoke-virtual {v5, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v4
    //         if-eqz v4, :cond_0
    //         invoke-direct {p0, v4}, Lcom/amazon/device/iap/internal/a/c;->a(Lorg/json/JSONObject;)Lcom/amazon/device/iap/model/Receipt;
    //         :try_end_3
    //         .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         new-instance v4, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         invoke-direct {v4}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;-><init>()V
    //         invoke-virtual {v4, v3}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setReceipt(Lcom/amazon/device/iap/model/Receipt;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseResponse;
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         move-object v2, v0
    //         move-object v3, v0
    //         move-object v7, v1
    //         move-object v1, v4
    //         move-object v4, v7
    //         :goto_1
    //         sget-object v5, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v6, "Error parsing purchase output"
    //         invoke-static {v5, v6, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         move-object v2, v0
    //         move-object v7, v4
    //         move-object v4, v1
    //         move-object v1, v7
    //         goto :goto_1
    //         :catch_2
    //         move-exception v1
    //         move-object v7, v1
    //         move-object v1, v4
    //         move-object v4, v7
    //         goto :goto_1
    //         :catch_3
    //         move-exception v4
    //         goto :goto_1
    */

    public fun a(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "handleResponse"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Landroid/content/ComponentName;
    //         const-string v1, "com.amazon.sdktestclient"
    //         const-string v2, "com.amazon.sdktestclient.command.CommandBroker"
    //         invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         :try_start_0
    //         invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "responseType"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "com.amazon.testclient.iap.purchase"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-direct {p0, p2}, Lcom/amazon/device/iap/internal/a/c;->g(Landroid/content/Intent;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v1, "com.amazon.testclient.iap.appUserId"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-direct {p0, p2}, Lcom/amazon/device/iap/internal/a/c;->e(Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v2, "Error handling response."
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         :cond_2
    //         :try_start_1
    //         const-string v1, "com.amazon.testclient.iap.itemData"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         invoke-direct {p0, p2}, Lcom/amazon/device/iap/internal/a/c;->c(Landroid/content/Intent;)V
    //         goto :goto_0
    //         :cond_3
    //         const-string v1, "com.amazon.testclient.iap.purchaseUpdates"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, p2}, Lcom/amazon/device/iap/internal/a/c;->a(Landroid/content/Intent;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "sendGetUserDataRequest"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0, v0, v2, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;ZZ)V
    //         return-void
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: String) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "sendPurchaseRequest"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    //         const-string v3, "sku"
    //         invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "requestId"
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "packageName"
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "sdkVersion"
    //         const-string v4, "2.0.61.0"
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "purchaseInput"
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "com.amazon.testclient.iap.purchase"
    //         invoke-direct {p0, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const/high16 v3, 0x10000000
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "Error in sendPurchaseRequest."
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: String, p2: com.amazon.device.iap.model.FulfillmentResult) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V */ }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "sendNotifyPurchaseFulfilled"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    //         const-string v3, "requestId"
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "packageName"
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "receiptId"
    //         invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "fulfillmentResult"
    //         invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "sdkVersion"
    //         const-string v4, "2.0.61.0"
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "purchaseFulfilledInput"
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "com.amazon.testclient.iap.purchaseFulfilled"
    //         invoke-direct {p0, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const/high16 v3, 0x10000000
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "Error in sendNotifyPurchaseFulfilled."
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: java.util.Set) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/amazon/device/iap/model/RequestId;",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "sendItemDataRequest"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    //         new-instance v3, Lorg/json/JSONArray;
    //         invoke-direct {v3, p2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    //         const-string v4, "requestId"
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v4, "packageName"
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v4, "skus"
    //         invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "sdkVersion"
    //         const-string v4, "2.0.61.0"
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "itemDataInput"
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "com.amazon.testclient.iap.itemData"
    //         invoke-direct {p0, v2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const/high16 v3, 0x10000000
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         const-string v1, "Error in sendItemDataRequest."
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: Boolean) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Z)V */ }
    /*
    //         .locals 3
    //         if-nez p1, :cond_0
    //         new-instance p1, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {p1}, Lcom/amazon/device/iap/model/RequestId;-><init>()V
    //         :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "sendPurchaseUpdatesRequest/sendGetUserData first:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v0, v1, p2}, Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/String;ZZ)V
    //         return-void
    */

    protected fun a(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "response"
    //         invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/d;->a()Lcom/amazon/device/iap/PurchasingListener;
    //         move-result-object v1
    //         if-eqz v0, :cond_0
    //         if-nez v1, :cond_1
    //         :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "PurchasingListener is not set. Dropping response: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v2, Lcom/amazon/device/iap/internal/a/c$1;
    //         invoke-direct {v2, p0, p1, v1}, Lcom/amazon/device/iap/internal/a/c$1;-><init>(Lcom/amazon/device/iap/internal/a/c;Ljava/lang/Object;Lcom/amazon/device/iap/PurchasingListener;)V
    //         new-instance v1, Landroid/os/Handler;
    //         invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    companion object {
    private val a: String = null!!

    @JvmStatic fun a(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/a/c;->a:Ljava/lang/String;
    //         return-object v0
    */

    }
}
