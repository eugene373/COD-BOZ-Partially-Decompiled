package com.amazon.device.iap.model

// Auto-emitted from smali source: FulfillmentResult.java.
// 3 fields, 4 methods.

enum class FulfillmentResult {
    FULFILLED,
    UNAVAILABLE,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.amazon.device.iap.model.FulfillmentResult { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/FulfillmentResult;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/amazon/device/iap/model/FulfillmentResult;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/FulfillmentResult;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.amazon.device.iap.model.FulfillmentResult> { return TODO("body: ()[Lcom/amazon/device/iap/model/FulfillmentResult;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/model/FulfillmentResult;->$VALUES:[Lcom/amazon/device/iap/model/FulfillmentResult;
    //         invoke-virtual {v0}, [Lcom/amazon/device/iap/model/FulfillmentResult;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/amazon/device/iap/model/FulfillmentResult;
    //         return-object v0
    */

    }
}
