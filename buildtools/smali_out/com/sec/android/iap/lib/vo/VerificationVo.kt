package com.sec.android.iap.lib.vo

// Auto-emitted from smali source: VerificationVo.java.
// 8 fields, 17 methods.

open class VerificationVo {
    private var mItemDesc: String
    private var mItemId: String
    private var mItemName: String
    private var mPaymentAmount: String
    private var mPaymentId: String
    private var mPurchaseDate: String
    private var mStatus: String

    public constructor(_jsonString: String)

    public fun dump(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         .local v0, "dump":Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const-string v2, "ItemId        : "
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getItemId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemName      : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getItemName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ItemDesc      : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getItemDesc()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "PurchaseDate  : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getPurchaseDate()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "PaymentId     : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getPaymentId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "PaymentAmount : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getPaymentAmount()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "Status        : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getStatus()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getItemDesc(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemDesc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getItemName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPaymentAmount(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentAmount:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPaymentId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPurchaseDate(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPurchaseDate:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStatus(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mStatus:Ljava/lang/String;
    //         return-object v0
    */

    public fun setItemDesc(_itemDesc: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemDesc:Ljava/lang/String;
    //         return-void
    */

    public fun setItemId(_itemId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemId:Ljava/lang/String;
    //         return-void
    */

    public fun setItemName(_itemName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemName:Ljava/lang/String;
    //         return-void
    */

    public fun setPaymentAmount(_paymentAmount: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentAmount:Ljava/lang/String;
    //         return-void
    */

    public fun setPaymentId(_paymentId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentId:Ljava/lang/String;
    //         return-void
    */

    public fun setPurchaseDate(_purchaseDate: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPurchaseDate:Ljava/lang/String;
    //         return-void
    */

    public fun setStatus(_status: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mStatus:Ljava/lang/String;
    //         return-void
    */

    companion object {
    private val TAG: String = null!!
    }
}
