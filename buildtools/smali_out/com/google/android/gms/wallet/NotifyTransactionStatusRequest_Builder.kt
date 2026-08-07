package com.google.android.gms.wallet

// Auto-emitted from smali.
// 1 fields, 6 methods.

class NotifyTransactionStatusRequest_Builder {
    val atC: com.google.android.gms.wallet.NotifyTransactionStatusRequest

    private constructor(p0: com.google.android.gms.wallet.NotifyTransactionStatusRequest)

    constructor(x0: com.google.android.gms.wallet.NotifyTransactionStatusRequest, x1: com.google.android.gms.wallet.NotifyTransactionStatusRequest.1)

    public fun build(): com.google.android.gms.wallet.NotifyTransactionStatusRequest { return TODO("body: ()Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->asB:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "googleTransactionId is required"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         iget v0, v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->status:I
    //         if-lt v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         iget v0, v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->status:I
    //         const/16 v3, 0x8
    //         if-gt v0, v3, :cond_1
    //         :goto_1
    //         const-string v0, "status is an unrecognized value"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    public fun setDetailedReason(detailedReason: String): com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->atB:Ljava/lang/String;
    //         return-object p0
    */

    public fun setGoogleTransactionId(googleTransactionId: String): com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->asB:Ljava/lang/String;
    //         return-object p0
    */

    public fun setStatus(status: Int): com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;->atC:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         iput p1, v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->status:I
    //         return-object p0
    */

}
