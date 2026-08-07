package com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing

// Auto-emitted from smali source: s3eAmazonInAppPurchasingObserver.java.
// 3 fields, 22 methods.

open class s3eAmazonInAppPurchasingObserver: com.amazon.device.iap.PurchasingListener {
    private val baseActivity: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasing

    public constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasing)

    private fun getSharedPreferencesEditor(): android.content.SharedPreferences.Editor { return TODO("body: ()Landroid/content/SharedPreferences$Editor;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->getSharedPreferencesForCurrentUser()Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         return-object v0
    */

    private fun getSharedPreferencesForCurrentUser(): android.content.SharedPreferences { return TODO("body: ()Landroid/content/SharedPreferences;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->baseActivity:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->getSharedPreferencesForCurrentUser()Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onProductDataResponse(p0: com.amazon.device.iap.model.ProductDataResponse) { /* TODO(body): (Lcom/amazon/device/iap/model/ProductDataResponse;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "Amazon-IAP"
    //         const-string v1, "onProductDataResponse received"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "productDataRequestStatus "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/ProductDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "productDataRequestId "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/ProductDataResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Lcom/amazon/device/iap/model/ProductDataResponse;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    public fun onPurchaseResponse(p0: com.amazon.device.iap.model.PurchaseResponse) { /* TODO(body): (Lcom/amazon/device/iap/model/PurchaseResponse;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "Amazon-IAP"
    //         const-string v1, "onPurchaseResponse received"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "PurchaseRequestStatus:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/PurchaseResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Lcom/amazon/device/iap/model/PurchaseResponse;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    public fun onPurchaseUpdatesResponse(p0: com.amazon.device.iap.model.PurchaseUpdatesResponse) { /* TODO(body): (Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onPurchaseUpdatesRecived received: Response -"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "PurchaseUpdatesRequestStatus:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "RequestID:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    public fun onUserDataResponse(p0: com.amazon.device.iap.model.UserDataResponse) { /* TODO(body): (Lcom/amazon/device/iap/model/UserDataResponse;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onUserDataResponse received: Response - "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "RequestId: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "Amazon-IAP"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "IdRequestStatus: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Lcom/amazon/device/iap/model/UserDataResponse;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    companion object {
    private val START_DATE: String = "startDate"
    private val TAG: String = "Amazon-IAP"

    private external @JvmStatic fun native_entitledCallback(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasing.S3ePurchaseReceipt)

    private external @JvmStatic fun native_entitledFinishedCallback()

    private external @JvmStatic fun native_itemDataCallback(p0: com.amazon.device.iap.model.Product)

    private external @JvmStatic fun native_itemDataFinishedCallback()

    private external @JvmStatic fun native_purchaseCallback(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasing.S3ePurchaseReceipt)

    private external @JvmStatic fun native_revokedCallback(p0: String)

    private external @JvmStatic fun native_unavailableSkuCallback(p0: String)

    }
}
