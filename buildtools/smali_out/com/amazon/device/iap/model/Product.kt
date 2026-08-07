package com.amazon.device.iap.model

// Auto-emitted from smali source: Product.java.
// 13 fields, 14 methods.

class Product: android.os.Parcelable {
    private val description: String
    private val price: String
    private val productType: com.amazon.device.iap.model.ProductType
    private val sku: String
    private val smallIconUrl: String
    private val title: String

    private constructor(p0: android.os.Parcel)

    constructor(p0: android.os.Parcel, p1: com.amazon.device.iap.model.Product.1)

    public constructor(p0: com.amazon.device.iap.internal.model.ProductBuilder)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->description:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPrice(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->price:Ljava/lang/String;
    //         return-object v0
    */

    public fun getProductType(): com.amazon.device.iap.model.ProductType { return TODO("body: ()Lcom/amazon/device/iap/model/ProductType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         return-object v0
    */

    public fun getSku(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->sku:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSmallIconUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->smallIconUrl:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->title:Ljava/lang/String;
    //         return-object v0
    */

    public fun toJSON(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "sku"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Product;->sku:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "productType"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Product;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "description"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Product;->description:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "price"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Product;->price:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "smallIconUrl"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Product;->smallIconUrl:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "title"
    //         iget-object v2, p0, Lcom/amazon/device/iap/model/Product;->title:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/model/Product;->toJSON()Lorg/json/JSONObject;
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
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->sku:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->productType:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductType;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->description:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->price:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->smallIconUrl:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/amazon/device/iap/model/Product;->title:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    private val DESCRIPTION: String = "description"
    private val PRICE: String = "price"
    private val PRODUCT_TYPE: String = "productType"
    private val SKU: String = "sku"
    private val SMALL_ICON_URL: String = "smallIconUrl"
    private val TITLE: String = "title"
    }
}
