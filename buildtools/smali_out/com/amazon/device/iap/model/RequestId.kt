package com.amazon.device.iap.model

// Auto-emitted from smali source: RequestId.java.
// 3 fields, 12 methods.

class RequestId: android.os.Parcelable {
    private val encodedId: String

    public constructor()

    private constructor(p0: android.os.Parcel)

    constructor(p0: android.os.Parcel, p1: com.amazon.device.iap.model.RequestId.1)

    private constructor(p0: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         if-eq v0, v1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
    //         check-cast p1, Lcom/amazon/device/iap/model/RequestId;
    //         iget-object v1, p1, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         add-int/lit8 v0, v0, 0x1f
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         goto :goto_0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "encodedId"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
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
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
    //         return-object v0
    */

    public fun writeToParcel(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/RequestId;->encodedId:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    private val ENCODED_ID: String = "encodedId"

    public @JvmStatic fun fromString(p0: String): com.amazon.device.iap.model.RequestId { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/RequestId;-><init>(Ljava/lang/String;)V
    //         return-object v0
    */

    }
}
