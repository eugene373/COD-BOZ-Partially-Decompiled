package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util

// Auto-emitted from smali source: IabHelper.java.
// 5 fields, 2 methods.

open class IabHelper_Anon2: Runnable {
    val this$0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper
    val val$handler: android.os.Handler
    val val$listener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.QueryInventoryFinishedListener
    val val$moreSkus: java.util.List
    val val$querySkuDetails: Boolean

    constructor(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper, p1: Boolean, p2: java.util.List, p3: android.os.Handler, p4: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.QueryInventoryFinishedListener)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         const/4 v0, 0x0
    //         const-string v2, "Inventory refresh successful."
    //         invoke-direct {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         iget-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$querySkuDetails:Z
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$moreSkus:Ljava/util/List;
    //         invoke-virtual {v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->queryInventory(ZLjava/util/List;)Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;
    //         :try_end_0
    //         .catch Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->flagEndAsync()V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$handler:Landroid/os/Handler;
    //         new-instance v3, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2$1;
    //         invoke-direct {v3, p0, v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    //         invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException;->getResult()Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         move-result-object v1
    //         goto :goto_0
    */

}
