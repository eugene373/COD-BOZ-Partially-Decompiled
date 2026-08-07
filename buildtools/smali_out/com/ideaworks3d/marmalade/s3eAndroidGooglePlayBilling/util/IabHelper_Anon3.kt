package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util

// Auto-emitted from smali source: IabHelper.java.
// 5 fields, 2 methods.

open class IabHelper_Anon3: Runnable {
    val this$0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper
    val val$handler: android.os.Handler
    val val$multiListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnConsumeMultiFinishedListener
    val val$purchases: java.util.List
    val val$singleListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnConsumeFinishedListener

    constructor(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper, p1: java.util.List, p2: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnConsumeFinishedListener, p3: android.os.Handler, p4: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnConsumeMultiFinishedListener)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->val$purchases:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;
    //         :try_start_0
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-virtual {v3, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->consume(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    //         new-instance v3, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         const/4 v4, 0x0
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Successful consume of sku "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getSku()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v3, v4, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException;->getResult()Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->flagEndAsync()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->val$singleListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->val$handler:Landroid/os/Handler;
    //         new-instance v2, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3$1;
    //         invoke-direct {v2, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;Ljava/util/List;)V
    //         invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->val$multiListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeMultiFinishedListener;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;->val$handler:Landroid/os/Handler;
    //         new-instance v2, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3$2;
    //         invoke-direct {v2, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3$2;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$3;Ljava/util/List;)V
    //         invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :cond_2
    //         return-void
    */

}
