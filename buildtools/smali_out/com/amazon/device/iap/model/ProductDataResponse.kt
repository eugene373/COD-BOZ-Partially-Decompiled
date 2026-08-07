package com.amazon.device.iap.model

// Auto-emitted from smali source: ProductDataResponse.java.
// 9 fields, 7 methods.

open class ProductDataResponse {
    private val productData: java.util.Map
    private val requestId: com.amazon.device.iap.model.RequestId
    private val requestStatus: com.amazon.device.iap.model.ProductDataResponse.RequestStatus
    private val unavailableSkus: java.util.Set

    public constructor(p0: com.amazon.device.iap.internal.model.ProductDataResponseBuilder)

    public fun getProductData(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/amazon/device/iap/model/Product;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->productData:Ljava/util/Map;
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.ProductDataResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestStatus:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         return-object v0
    */

    public fun getUnavailableSkus(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->unavailableSkus:Ljava/util/Set;
    //         return-object v0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    //         const-string v0, "requestId"
    //         iget-object v1, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "UNAVAILABLE_SKUS"
    //         iget-object v1, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->unavailableSkus:Ljava/util/Set;
    //         invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "requestStatus"
    //         iget-object v1, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestStatus:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         new-instance v3, Lorg/json/JSONObject;
    //         invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->productData:Ljava/util/Map;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->productData:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->productData:Ljava/util/Map;
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/amazon/device/iap/model/Product;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Product;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "productData"
    //         invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         return-object v2
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v1, "(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)"
    //         const/4 v0, 0x5
    //         new-array v2, v0, [Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v2, v0
    //         const/4 v0, 0x1
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         aput-object v3, v2, v0
    //         const/4 v3, 0x2
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->unavailableSkus:Ljava/util/Set;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->unavailableSkus:Ljava/util/Set;
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         aput-object v0, v2, v3
    //         const/4 v3, 0x3
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestStatus:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->requestStatus:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         aput-object v0, v2, v3
    //         const/4 v3, 0x4
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->productData:Ljava/util/Map;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/ProductDataResponse;->productData:Ljava/util/Map;
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_2
    //         aput-object v0, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "null"
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "null"
    //         goto :goto_1
    //         :cond_2
    //         const-string v0, "null"
    //         goto :goto_2
    */

    companion object {
    private val PRODUCT_DATA: String = "productData"
    private val REQUEST_ID: String = "requestId"
    private val REQUEST_STATUS: String = "requestStatus"
    private val TO_STRING_FORMAT: String = "(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)"
    private val UNAVAILABLE_SKUS: String = "UNAVAILABLE_SKUS"
    }
}
