package com.sec.android.iap.lib.vo

// Auto-emitted from smali source: PurchaseVo.java.
// 6 fields, 13 methods.

open class PurchaseVo: com.sec.android.iap.lib.vo.BaseVo() {
    private var mJsonString: String
    private var mPaymentId: String
    private var mPurchaseDate: String
    private var mPurchaseId: String
    private var mVerifyUrl: String

    public constructor(_jsonString: String)

    public fun dump(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-super {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->dump()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "dump":Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v2, "PaymentID    : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/PurchaseVo;->getPaymentId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "PurchaseId   : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/PurchaseVo;->getPurchaseId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "PurchaseDate : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/PurchaseVo;->getPurchaseDate()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\n"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "VerifyUrl    : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/PurchaseVo;->getVerifyUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getJsonString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mJsonString:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPaymentId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mPaymentId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPurchaseDate(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mPurchaseDate:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPurchaseId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mPurchaseId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVerifyUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mVerifyUrl:Ljava/lang/String;
    //         return-object v0
    */

    public fun setJsonString(_jsonString: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mJsonString:Ljava/lang/String;
    //         return-void
    */

    public fun setPaymentId(_paymentId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mPaymentId:Ljava/lang/String;
    //         return-void
    */

    public fun setPurchaseDate(_purchaseDate: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mPurchaseDate:Ljava/lang/String;
    //         return-void
    */

    public fun setPurchaseId(_purchaseId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mPurchaseId:Ljava/lang/String;
    //         return-void
    */

    public fun setVerifyUrl(_verifyUrl: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/vo/PurchaseVo;->mVerifyUrl:Ljava/lang/String;
    //         return-void
    */

    companion object {
    private val TAG: String = null!!
    }
}
