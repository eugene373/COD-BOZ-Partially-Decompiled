package com.amazon.device.iap.model

// Auto-emitted from smali source: Receipt.java.
// 11 fields, 12 methods.

class Receipt {
    private val cancelDate: java.util.Date
    private val productType: com.amazon.device.iap.model.ProductType
    private val purchaseDate: java.util.Date
    private val receiptId: String
    private val sku: String

    public constructor(p0: com.amazon.device.iap.internal.model.ReceiptBuilder)

    public fun equals(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-nez p1, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         if-eq v2, v3, :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         check-cast p1, Lcom/amazon/device/iap/model/Receipt;
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         if-nez v2, :cond_4
    //         iget-object v2, p1, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         if-eqz v2, :cond_5
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         iget-object v3, p1, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_5
    //         move v0, v1
    //         goto :goto_0
    //         :cond_5
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         iget-object v3, p1, Lcom/amazon/device/iap/model/Receipt;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         if-eq v2, v3, :cond_6
    //         move v0, v1
    //         goto :goto_0
    //         :cond_6
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         if-nez v2, :cond_7
    //         iget-object v2, p1, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         if-eqz v2, :cond_8
    //         move v0, v1
    //         goto :goto_0
    //         :cond_7
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         iget-object v3, p1, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_8
    //         move v0, v1
    //         goto :goto_0
    //         :cond_8
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         if-nez v2, :cond_9
    //         iget-object v2, p1, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         if-eqz v2, :cond_a
    //         move v0, v1
    //         goto :goto_0
    //         :cond_9
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_a
    //         move v0, v1
    //         goto :goto_0
    //         :cond_a
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         if-nez v2, :cond_b
    //         iget-object v2, p1, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         if-eqz v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_b
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getCancelDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         return-object v0
    */

    public fun getProductType(): com.amazon.device.iap.model.ProductType { return TODO("body: ()Lcom/amazon/device/iap/model/ProductType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         return-object v0
    */

    public fun getPurchaseDate(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         return-object v0
    */

    public fun getReceiptId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSku(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         add-int/lit8 v0, v0, 0x1f
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         if-nez v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_2
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v2, v0, 0x1f
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         if-nez v0, :cond_3
    //         move v0, v1
    //         :goto_3
    //         add-int/2addr v0, v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         if-nez v2, :cond_4
    //         :goto_4
    //         add-int/2addr v0, v1
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         invoke-virtual {v0}, Ljava/util/Date;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductType;->hashCode()I
    //         move-result v0
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         invoke-virtual {v0}, Ljava/util/Date;->hashCode()I
    //         move-result v0
    //         goto :goto_2
    //         :cond_3
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_3
    //         :cond_4
    //         iget-object v1, p0, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
    //         move-result v1
    //         goto :goto_4
    */

    public fun isCanceled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "receiptId"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->receiptId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "sku"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->sku:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "itemType"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "purchaseDate"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->purchaseDate:Ljava/util/Date;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "endDate"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Receipt;->cancelDate:Ljava/util/Date;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/model/Receipt;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v1
    //         const/4 v2, 0x4
    //         invoke-virtual {v1, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    companion object {
    private val CANCEL_DATE: String = "endDate"
    private val DATE_CANCELED: java.util.Date = null!!
    private val PRODUCT_TYPE: String = "itemType"
    private val PURCHASE_DATE: String = "purchaseDate"
    private val RECEIPT_ID: String = "receiptId"
    private val SKU: String = "sku"
    }
}
