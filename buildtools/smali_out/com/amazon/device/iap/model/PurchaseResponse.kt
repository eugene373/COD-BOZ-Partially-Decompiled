package com.amazon.device.iap.model

// Auto-emitted from smali source: PurchaseResponse.java.
// 9 fields, 7 methods.

class PurchaseResponse {
    private val receipt: com.amazon.device.iap.model.Receipt
    private val requestId: com.amazon.device.iap.model.RequestId
    private val requestStatus: com.amazon.device.iap.model.PurchaseResponse.RequestStatus
    private val userData: com.amazon.device.iap.model.UserData

    public constructor(p0: com.amazon.device.iap.internal.model.PurchaseResponseBuilder)

    public fun getReceipt(): com.amazon.device.iap.model.Receipt { return TODO("body: ()Lcom/amazon/device/iap/model/Receipt;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->receipt:Lcom/amazon/device/iap/model/Receipt;
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.PurchaseResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         return-object v0
    */

    public fun getUserData(): com.amazon.device.iap.model.UserData { return TODO("body: ()Lcom/amazon/device/iap/model/UserData;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object v0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         const-string v0, "requestId"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "requestStatus"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "userData"
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "receipt"
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         return-object v1
    //         :cond_0
    //         const-string v0, ""
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, ""
    //         goto :goto_1
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v1, "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)"
    //         const/4 v0, 0x5
    //         new-array v2, v0, [Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v2, v0
    //         const/4 v0, 0x1
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         aput-object v3, v2, v0
    //         const/4 v3, 0x2
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         aput-object v0, v2, v3
    //         const/4 v0, 0x3
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->userData:Lcom/amazon/device/iap/model/UserData;
    //         aput-object v3, v2, v0
    //         const/4 v0, 0x4
    //         iget-object v3, p0, Lcom/amazon/device/iap/model/PurchaseResponse;->receipt:Lcom/amazon/device/iap/model/Receipt;
    //         aput-object v3, v2, v0
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "null"
    //         goto :goto_0
    */

    companion object {
    private val RECEIPT: String = "receipt"
    private val REQUEST_ID: String = "requestId"
    private val REQUEST_STATUS: String = "requestStatus"
    private val TO_STRING_FORMAT: String = "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)"
    private val USER_DATA: String = "userData"
    }
}
