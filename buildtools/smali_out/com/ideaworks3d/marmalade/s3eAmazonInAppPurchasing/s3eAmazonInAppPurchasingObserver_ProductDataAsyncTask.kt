package com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing

// Auto-emitted from smali source: s3eAmazonInAppPurchasingObserver.java.
// 1 fields, 4 methods.

open class s3eAmazonInAppPurchasingObserver_ProductDataAsyncTask: android.os.AsyncTask() {
    val this$0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver

    private constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver)

    constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver, p1: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver.1)

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Lcom/amazon/device/iap/model/ProductDataResponse;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;->doInBackground([Lcom/amazon/device/iap/model/ProductDataResponse;)Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(p0: Array<com.amazon.device.iap.model.ProductDataResponse>): Void { return TODO("body: ([Lcom/amazon/device/iap/model/ProductDataResponse;)Ljava/lang/Void;") }
    /*
    //         .locals 5
    //         const-string v0, "Amazon-IAP"
    //         const-string v1, "ProductDataAsyncTask:"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         aget-object v0, p1, v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         move-result-object v1
    //         sget-object v2, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;
    //         if-ne v1, v2, :cond_1
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductDataResponse;->getProductData()Ljava/util/Map;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/model/Product;
    //         const-string v3, "Amazon-IAP"
    //         const-string v4, "ProductDataAsyncTask: native_itemDataCallback"
    //         invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$500(Lcom/amazon/device/iap/model/Product;)V
    //         goto :goto_0
    //         :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$600()V
    //         :cond_1
    //         const/4 v0, 0x0
    //         return-object v0
    */

}
