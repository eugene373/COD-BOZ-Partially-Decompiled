package com.amazon.device.iap.internal.model

// Auto-emitted from smali source: UserDataResponseBuilder.java.
// 3 fields, 8 methods.

open class UserDataResponseBuilder {
    private var requestId: com.amazon.device.iap.model.RequestId
    private var requestStatus: com.amazon.device.iap.model.UserDataResponse.RequestStatus
    private var userData: com.amazon.device.iap.model.UserData

    public constructor()

    public fun build(): com.amazon.device.iap.model.UserDataResponse { return TODO("body: ()Lcom/amazon/device/iap/model/UserDataResponse;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/amazon/device/iap/model/UserDataResponse;
    //         invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/UserDataResponse;-><init>(Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;)V
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.UserDataResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         return-object v0
    */

    public fun getUserData(): com.amazon.device.iap.model.UserData { return TODO("body: ()Lcom/amazon/device/iap/model/UserData;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object v0
    */

    public fun setRequestId(p0: com.amazon.device.iap.model.RequestId): com.amazon.device.iap.internal.model.UserDataResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object p0
    */

    public fun setRequestStatus(p0: com.amazon.device.iap.model.UserDataResponse.RequestStatus): com.amazon.device.iap.internal.model.UserDataResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         return-object p0
    */

    public fun setUserData(p0: com.amazon.device.iap.model.UserData): com.amazon.device.iap.internal.model.UserDataResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object p0
    */

}
