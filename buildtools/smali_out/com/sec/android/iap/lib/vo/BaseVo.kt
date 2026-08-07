package com.sec.android.iap.lib.vo

// Auto-emitted from smali source: BaseVo.java.
// 8 fields, 20 methods.

open class BaseVo {
    private var mCurrencyUnit: String
    private var mItemDesc: String
    private var mItemDownloadUrl: String
    private var mItemId: String
    private var mItemImageUrl: String
    private var mItemName: String
    private var mItemPrice: Double
    private var mItemPriceString: String

    public constructor()

    public constructor(_jsonString: String)

    public fun dump(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         .local v0, "dump":Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const-string v2, "ItemId          : "
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemName        : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemPrice       : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemPrice()D
    //         move-result-wide v2
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemPriceString : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemPriceString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "CurrencyUnit    : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getCurrencyUnit()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemDesc        : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemDesc()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemImageUrl    : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemDownloadUrl : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemDownloadUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrencyUnit(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mCurrencyUnit:Ljava/lang/String;
    //         return-object v0
    */

    protected fun getDateString(_timeMills: Long): String { return TODO("body: (J)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const-string v2, ""
    //         .local v2, "result":Ljava/lang/String;
    //         const-string v0, "yyyy.MM.dd hh:mm:ss"
    //         .local v0, "dateFormat":Ljava/lang/String;
    //         :try_start_0
    //         invoke-static {v0, p1, p2}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v2
    //         :goto_0
    //         return-object v2
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    //         const-string v2, ""
    //         goto :goto_0
    */

    public fun getItemDesc(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDesc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemDownloadUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDownloadUrl:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemImageUrl:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemPrice(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPrice:Ljava/lang/Double;
    //         invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getItemPriceString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPriceString:Ljava/lang/String;
    //         return-object v0
    */

    public fun setCurrencyUnit(_currencyUnit: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mCurrencyUnit:Ljava/lang/String;
    //         return-void
    */

    public fun setItemDesc(_itemDesc: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDesc:Ljava/lang/String;
    //         return-void
    */

    public fun setItemDownloadUrl(_itemDownloadUrl: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDownloadUrl:Ljava/lang/String;
    //         return-void
    */

    public fun setItemId(_itemId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemId:Ljava/lang/String;
    //         return-void
    */

    public fun setItemImageUrl(_itemImageUrl: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemImageUrl:Ljava/lang/String;
    //         return-void
    */

    public fun setItemName(_itemName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemName:Ljava/lang/String;
    //         return-void
    */

    public fun setItemPrice(_itemPrice: Double) { /* TODO(body): (Ljava/lang/Double;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPrice:Ljava/lang/Double;
    //         return-void
    */

    public fun setItemPriceString(_itemPriceString: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPriceString:Ljava/lang/String;
    //         return-void
    */

}
