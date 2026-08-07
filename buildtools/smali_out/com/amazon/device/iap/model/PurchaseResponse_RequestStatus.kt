package com.amazon.device.iap.model

// Auto-emitted from smali source: PurchaseResponse.java.
// 6 fields, 5 methods.

enum class PurchaseResponse_RequestStatus {
    ALREADY_PURCHASED,
    FAILED,
    INVALID_SKU,
    NOT_SUPPORTED,
    SUCCESSFUL,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun safeValueOf(p0: String): com.amazon.device.iap.model.PurchaseResponse.RequestStatus { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "ALREADY_ENTITLED"
    //         invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->ALREADY_PURCHASED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun valueOf(p0: String): com.amazon.device.iap.model.PurchaseResponse.RequestStatus { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.amazon.device.iap.model.PurchaseResponse.RequestStatus> { return TODO("body: ()[Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->$VALUES:[Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         invoke-virtual {v0}, [Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         return-object v0
    */

    }
}
