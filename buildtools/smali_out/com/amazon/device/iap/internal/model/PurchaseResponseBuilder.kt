package com.amazon.device.iap.internal.model

// Auto-emitted from smali source: PurchaseResponseBuilder.java.
// 4 fields, 10 methods.

open class PurchaseResponseBuilder {
    private var receipt: com.amazon.device.iap.model.Receipt
    private var requestId: com.amazon.device.iap.model.RequestId
    private var requestStatus: com.amazon.device.iap.model.PurchaseResponse.RequestStatus
    private var userData: com.amazon.device.iap.model.UserData

    public constructor()

    public fun build(): com.amazon.device.iap.model.PurchaseResponse { return TODO("body: ()Lcom/amazon/device/iap/model/PurchaseResponse;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse;
    //         invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/PurchaseResponse;-><init>(Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;)V
    //         return-object v0
    */

    public fun getReceipt(): com.amazon.device.iap.model.Receipt { return TODO("body: ()Lcom/amazon/device/iap/model/Receipt;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->receipt:Lcom/amazon/device/iap/model/Receipt;
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.PurchaseResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         return-object v0
    */

    public fun getUserData(): com.amazon.device.iap.model.UserData { return TODO("body: ()Lcom/amazon/device/iap/model/UserData;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object v0
    */

    public fun setReceipt(p0: com.amazon.device.iap.model.Receipt): com.amazon.device.iap.internal.model.PurchaseResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/Receipt;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->receipt:Lcom/amazon/device/iap/model/Receipt;
    //         return-object p0
    */

    public fun setRequestId(p0: com.amazon.device.iap.model.RequestId): com.amazon.device.iap.internal.model.PurchaseResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object p0
    */

    public fun setRequestStatus(p0: com.amazon.device.iap.model.PurchaseResponse.RequestStatus): com.amazon.device.iap.internal.model.PurchaseResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         return-object p0
    */

    public fun setUserData(p0: com.amazon.device.iap.model.UserData): com.amazon.device.iap.internal.model.PurchaseResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object p0
    */

}
