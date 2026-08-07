package com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing

// Auto-emitted from smali source: s3eAmazonInAppPurchasingObserver.java.
// 1 fields, 4 methods.

open class s3eAmazonInAppPurchasingObserver_UserDataAsyncTask: android.os.AsyncTask() {
    val this$0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver

    private constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver)

    constructor(p0: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver, p1: com.ideaworks3d.marmalade.s3eAmazonInAppPurchasing.s3eAmazonInAppPurchasingObserver.1)

    protected fun doInBackground(p0: Array<com.amazon.device.iap.model.UserDataResponse>): Boolean { return TODO("body: ([Lcom/amazon/device/iap/model/UserDataResponse;)Ljava/lang/Boolean;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         aget-object v0, p1, v3
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         move-result-object v1
    //         sget-object v2, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         if-ne v1, v2, :cond_0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->setCurrentUser(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "Amazon-IAP"
    //         const-string v1, "onUserDataResponse: Unable to get user ID."
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Lcom/amazon/device/iap/model/UserDataResponse;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->doInBackground([Lcom/amazon/device/iap/model/UserDataResponse;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

}
