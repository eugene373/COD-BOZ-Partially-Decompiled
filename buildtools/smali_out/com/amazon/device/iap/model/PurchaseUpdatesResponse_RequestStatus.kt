package com.amazon.device.iap.model

// Auto-emitted from smali source: PurchaseUpdatesResponse.java.
// 4 fields, 4 methods.

enum class PurchaseUpdatesResponse_RequestStatus {
    FAILED,
    NOT_SUPPORTED,
    SUCCESSFUL,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus> { return TODO("body: ()[Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->$VALUES:[Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         invoke-virtual {v0}, [Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         return-object v0
    */

    }
}
