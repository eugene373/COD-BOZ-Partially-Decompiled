package com.amazon.device.iap.model

// Auto-emitted from smali source: PurchaseUpdatesResponse.java.
// 11 fields, 8 methods.

class PurchaseUpdatesResponse {
    private val hasMore: Boolean
    private val receipts: java.util.List
    private val requestId: com.amazon.device.iap.model.RequestId
    private val requestStatus: com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus
    private val userData: com.amazon.device.iap.model.UserData

    public constructor(p0: com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder)

    public fun getReceipts(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/amazon/device/iap/model/Receipt;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         return-object v0
    */

    public fun getUserData(): com.amazon.device.iap.model.UserData { return TODO("body: ()Lcom/amazon/device/iap/model/UserData;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object v0
    */

    public fun hasMore(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z
    //         return v0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         const-string v0, "REQUEST_ID"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "REQUEST_STATUS"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "USER_DATA"
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/Receipt;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_1
    //         :cond_0
    //         const-string v0, ""
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "RECEIPTS"
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "HAS_MORE"
    //         iget-boolean v2, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         return-object v1
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v1, "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")"
    //         const/4 v0, 0x6
    //         new-array v2, v0, [Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v2, v0
    //         const/4 v0, 0x1
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         aput-object v3, v2, v0
    //         const/4 v0, 0x2
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         aput-object v3, v2, v0
    //         const/4 v0, 0x3
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         aput-object v3, v2, v0
    //         const/4 v3, 0x4
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->receipts:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         aput-object v0, v2, v3
    //         const/4 v0, 0x5
    //         iget-boolean v3, p0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore:Z
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         aput-object v3, v2, v0
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "null"
    //         goto :goto_0
    */

    companion object {
    private val HAS_MORE: String = "HAS_MORE"
    private val RECEIPTS: String = "RECEIPTS"
    private val REQUEST_ID: String = "REQUEST_ID"
    private val REQUEST_STATUS: String = "REQUEST_STATUS"
    private val TO_STRING_FORMAT: String = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")"
    private val USER_DATA: String = "USER_DATA"
    }
}
