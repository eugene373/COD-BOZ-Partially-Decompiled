package com.amazon.device.iap.internal.model

// Auto-emitted from smali source: ProductDataResponseBuilder.java.
// 4 fields, 10 methods.

open class ProductDataResponseBuilder {
    private var productData: java.util.Map
    private var requestId: com.amazon.device.iap.model.RequestId
    private var requestStatus: com.amazon.device.iap.model.ProductDataResponse.RequestStatus
    private var unavailableSkus: java.util.Set

    public constructor()

    public fun build(): com.amazon.device.iap.model.ProductDataResponse { return TODO("body: ()Lcom/amazon/device/iap/model/ProductDataResponse;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/amazon/device/iap/model/ProductDataResponse;
    //         invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/ProductDataResponse;-><init>(Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;)V
    //         return-object v0
    */

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
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->productData:Ljava/util/Map;
    //         return-object v0
    */

    public fun getRequestId(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun getRequestStatus(): com.amazon.device.iap.model.ProductDataResponse.RequestStatus { return TODO("body: ()Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
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
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->unavailableSkus:Ljava/util/Set;
    //         return-object v0
    */

    public fun setProductData(p0: java.util.Map): com.amazon.device.iap.internal.model.ProductDataResponseBuilder { return TODO("body: (Ljava/util/Map;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/amazon/device/iap/model/Product;",
    //                 ">;)",
    //                 "Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->productData:Ljava/util/Map;
    //         return-object p0
    */

    public fun setRequestId(p0: com.amazon.device.iap.model.RequestId): com.amazon.device.iap.internal.model.ProductDataResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;
    //         return-object p0
    */

    public fun setRequestStatus(p0: com.amazon.device.iap.model.ProductDataResponse.RequestStatus): com.amazon.device.iap.internal.model.ProductDataResponseBuilder { return TODO("body: (Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         return-object p0
    */

    public fun setUnavailableSkus(p0: java.util.Set): com.amazon.device.iap.internal.model.ProductDataResponseBuilder { return TODO("body: (Ljava/util/Set;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->unavailableSkus:Ljava/util/Set;
    //         return-object p0
    */

}
