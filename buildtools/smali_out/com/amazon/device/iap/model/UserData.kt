package com.amazon.device.iap.model

// Auto-emitted from smali source: UserData.java.
// 5 fields, 10 methods.

class UserData: android.os.Parcelable {
    private val marketplace: String
    private val userId: String

    private constructor(p0: android.os.Parcel)

    constructor(p0: android.os.Parcel, p1: com.amazon.device.iap.model.UserData.1)

    public constructor(p0: com.amazon.device.iap.internal.model.UserDataBuilder)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMarketplace(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/UserData;->marketplace:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUserId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/UserData;->userId:Ljava/lang/String;
    //         return-object v0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "userId"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/UserData;->userId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "marketplace"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/UserData;->marketplace:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/model/UserData;->toJSON()Lorg/json/JSONObject;
    //         move-result-object v1
    //         const/4 v2, 0x4
    //         invoke-virtual {v1, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun writeToParcel(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/UserData;->userId:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/UserData;->marketplace:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    private val MARKETPLACE: String = "marketplace"
    private val USER_ID: String = "userId"
    }
}
