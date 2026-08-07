package com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing

// Auto-emitted from smali source: s3eAmazonInAppPurchasingObserver.java.
// 1 fields, 4 methods.

open class s3eAmazonInAppPurchasingObserver_PurchaseUpdatesAsyncTask: android.os.AsyncTask() {
    val this$0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver

    private constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver)

    constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver, p1: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver.1)

    protected fun doInBackground(p0: Array<com.amazon.device.iap.model.PurchaseUpdatesResponse>): Boolean { return TODO("body: ([Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)Ljava/lang/Boolean;") }
    /*
    //         .locals 10
    //         const-wide/16 v8, 0x0
    //         const/4 v6, 0x0
    //         aget-object v1, p1, v6
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$800(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Landroid/content/SharedPreferences$Editor;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->getCurrentUser()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "Amazon-IAP"
    //         const-string v1, "purchaseResponse user Id is not the same as the stored user Id"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_1
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/Receipt;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->isCanceled()Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         const-string v3, "Amazon-IAP"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Revoked Sku:"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getSku()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getSku()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$900(Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         move-result-object v0
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;->$SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus:[I
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->ordinal()I
    //         move-result v0
    //         aget v0, v2, v0
    //         packed-switch v0, :pswitch_data_0
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/Receipt;
    //         new-instance v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;
    //         invoke-direct {v3}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;-><init>()V
    //         sget-object v4, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->SUCCESSFUL:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         iput-object v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_state:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getSku()Ljava/lang/String;
    //         move-result-object v4
    //         iput-object v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_sku:Ljava/lang/String;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v4
    //         iput-object v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_type:Lcom/amazon/device/iap/model/ProductType;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;
    //         move-result-object v4
    //         iput-object v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_purchaseToken:Ljava/lang/String;
    //         sget-object v4, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;->$SwitchMap$com$amazon$device$iap$model$ProductType:[I
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;
    //         move-result-object v5
    //         invoke-virtual {v5}, Lcom/amazon/device/iap/model/ProductType;->ordinal()I
    //         move-result v5
    //         aget v4, v4, v5
    //         packed-switch v4, :pswitch_data_1
    //         goto :goto_2
    //         :pswitch_1
    //         iput-wide v8, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionStartUTC:J
    //         iput-wide v8, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$1000(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
    //         goto :goto_2
    //         :pswitch_2
    //         :try_start_0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getPurchaseDate()Ljava/util/Date;
    //         move-result-object v4
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/Receipt;->getCancelDate()Ljava/util/Date;
    //         move-result-object v0
    //         invoke-virtual {v4}, Ljava/util/Date;->getTime()J
    //         move-result-wide v4
    //         iput-wide v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionStartUTC:J
    //         if-eqz v0, :cond_3
    //         invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    //         move-result-wide v4
    //         iput-wide v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         :goto_3
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$1000(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
    //         :try_end_0
    //         .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_2
    //         :catch_0
    //         move-exception v0
    //         const-string v3, "Amazon-IAP"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "SUBSCRIPTION Exception thrown:"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_2
    //         :cond_3
    //         const-wide/16 v4, 0x0
    //         :try_start_1
    //         iput-wide v4, v3, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;->m_subscriptionEndUTC:J
    //         :try_end_1
    //         .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_3
    //         :cond_4
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$1100()V
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->hasMore()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-static {v6}, Lcom/amazon/device/iap/PurchasingService;->getPurchaseUpdates(Z)Lcom/amazon/device/iap/model/RequestId;
    //         :cond_5
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         :pswitch_3
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto/16 :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_3
    //         .end packed-switch
    //         :pswitch_data_1
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;->doInBackground([Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

}
