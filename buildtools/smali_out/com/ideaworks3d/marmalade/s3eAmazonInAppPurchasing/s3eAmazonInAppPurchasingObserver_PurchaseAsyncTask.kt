package com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing

// Auto-emitted from smali source: s3eAmazonInAppPurchasingObserver.java.
// 1 fields, 4 methods.

open class s3eAmazonInAppPurchasingObserver_PurchaseAsyncTask: android.os.AsyncTask() {
    val this$0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver

    private constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver)

    constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver, p1: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver.1)

    protected fun doInBackground(p0: Array<com.amazon.device.iap.model.PurchaseResponse>): Boolean { return TODO("body: ([Lcom/amazon/device/iap/model/PurchaseResponse;)Ljava/lang/Boolean;") }
    /*
    //         .locals 10
    //         const/4 v3, 0x0
    //         const/4 v7, 0x1
    //         const-wide/16 v8, 0x0
    //         const-string v0, "Amazon-IAP"
    //         const-string v1, "AsyncTask<PurchaseResponse, Void, Boolean>"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         aget-object v2, p1, v3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->getCurrentUser()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/PurchaseResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/PurchaseResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "Amazon-IAP"
    //         const-string v3, "purchaseResponse user Id is not the same as the stored user Id"
    //         invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    //         move-result-object v0
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/PurchaseResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->setCurrentUser(Ljava/lang/String;)V
    //         invoke-static {v7}, Lcom/amazon/device/iap/PurchasingService;->getPurchaseUpdates(Z)Lcom/amazon/device/iap/model/RequestId;
    //         :cond_0
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/PurchaseResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v0
    //         const-string v3, "Amazon-IAP"
    //         const-string v4, "requestId = purchaseResponse.getRequestId()"
    //         invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    //         move-result-object v3
    //         iget-object v3, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->purchaseOrderMap:Ljava/util/Map;
    //         invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;
    //         const-string v3, "Amazon-IAP"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "order = "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/PurchaseResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         move-result-object v3
    //         const-string v4, "Amazon-IAP"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "status = "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v4, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;->$SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus:[I
    //         invoke-virtual {v3}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->ordinal()I
    //         move-result v3
    //         aget v3, v4, v3
    //         packed-switch v3, :pswitch_data_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$700(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
    //         :cond_1
    //         return-object v1
    //         :pswitch_0
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;
    //         move-result-object v1
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->SUCCESSFUL:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         iput-object v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_state:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getSku()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_sku:Ljava/lang/String;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v2
    //         iput-object v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_type:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_purchaseToken:Ljava/lang/String;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v2
    //         sget-object v3, Lcom/amazon/device/iap/model/ProductType;->SUBSCRIPTION:Lcom/amazon/device/iap/model/ProductType;
    //         if-ne v2, v3, :cond_3
    //         :try_start_0
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getPurchaseDate()Ljava/util/Date;
    //         move-result-object v2
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getCancelDate()Ljava/util/Date;
    //         move-result-object v1
    //         invoke-virtual {v2}, Ljava/util/Date;->getTime()J
    //         move-result-wide v2
    //         iput-wide v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionStartUTC:J
    //         if-eqz v1, :cond_2
    //         invoke-virtual {v1}, Ljava/util/Date;->getTime()J
    //         move-result-wide v2
    //         iput-wide v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         :try_end_0
    //         .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_2
    //         const-wide/16 v2, 0x0
    //         :try_start_1
    //         iput-wide v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         :try_end_1
    //         .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "Amazon-IAP"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "SUBSCRIPTION Exception thrown:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iput-wide v8, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionStartUTC:J
    //         iput-wide v8, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         goto :goto_1
    //         :cond_3
    //         iput-wide v8, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionStartUTC:J
    //         iput-wide v8, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         goto :goto_1
    //         :pswitch_1
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->ALREADY_PURCHASED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         iput-object v1, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_state:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         goto :goto_0
    //         :pswitch_2
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->FAILED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         iput-object v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_state:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         goto :goto_0
    //         :pswitch_3
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->INVALID_SKU:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         iput-object v2, v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_state:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //         .end packed-switch
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Lcom/amazon/device/iap/model/PurchaseResponse;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;->doInBackground([Lcom/amazon/device/iap/model/PurchaseResponse;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

}
