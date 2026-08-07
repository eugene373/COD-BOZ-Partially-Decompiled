package com.amazon.device.iap.internal.model

// Auto-emitted from smali source: PurchaseUpdatesResponseBuilder.java.
// 5 fields, 12 methods.

open class PurchaseUpdatesResponseBuilder {
    private var hasMore: Boolean
    private var receipts: java.util.List
    private var requestId: com.amazon.device.iap.model.RequestId
    private var requestStatus: com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus
    private var userData: com.amazon.device.iap.model.UserData

    public constructor()

    public fun build(): com.amazon.device.iap.model.PurchaseUpdatesResponse { return TODO("body: ()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;-><init>(Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;)V
    //         return-object v0
    */

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
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->receipts:Ljava/util/List;
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         return-object v0
    */

    public fun getUserData(): com.amazon.device.iap.model.UserData { return TODO("body: ()Lcom/amazon/device/iap/model/UserData;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object v0
    */

    public fun hasMore(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->hasMore:Z
    //         return v0
    */

    public fun setHasMore(p0: Boolean): com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder { return TODO("body: (Z)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->hasMore:Z
    //         return-object p0
    */

    public fun setReceipts(p0: java.util.List): com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder { return TODO("body: (Ljava/util/List;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/amazon/device/iap/model/Receipt;",
    //                 ">;)",
    //                 "Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->receipts:Ljava/util/List;
    //         return-object p0
    */

    public fun setRequestId(p0: com.amazon.device.iap.model.RequestId): com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object p0
    */

    public fun setRequestStatus(p0: com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus): com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         return-object p0
    */

    public fun setUserData(p0: com.amazon.device.iap.model.UserData): com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;
    //         return-object p0
    */

}
