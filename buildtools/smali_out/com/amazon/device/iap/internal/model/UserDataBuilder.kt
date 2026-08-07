package com.amazon.device.iap.internal.model

// Auto-emitted from smali source: UserDataBuilder.java.
// 2 fields, 6 methods.

open class UserDataBuilder {
    private var marketplace: String
    private var userId: String

    public constructor()

    public fun build(): com.amazon.device.iap.model.UserData { return TODO("body: ()Lcom/amazon/device/iap/model/UserData;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/amazon/device/iap/model/UserData;
    //         invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/UserData;-><init>(Lcom/amazon/device/iap/internal/model/UserDataBuilder;)V
    //         return-object v0
    */

    public fun getMarketplace(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->marketplace:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUserId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->userId:Ljava/lang/String;
    //         return-object v0
    */

    public fun setMarketplace(p0: String): com.amazon.device.iap.internal.model.UserDataBuilder { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->marketplace:Ljava/lang/String;
    //         return-object p0
    */

    public fun setUserId(p0: String): com.amazon.device.iap.internal.model.UserDataBuilder { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->userId:Ljava/lang/String;
    //         return-object p0
    */

}
