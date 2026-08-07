package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling

// Auto-emitted from smali source: s3eAndroidGooglePlayBilling.java.
// 1 fields, 2 methods.

open class s3eAndroidGooglePlayBilling_Anon1: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnIabSetupFinishedListener {
    val this$0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling

    constructor(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling)

    public fun onIabSetupFinished(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabResult) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "Setup finished."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->isSuccess()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Problem setting up in-app billing: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$1;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;
    //         const/4 v1, 0x1
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->access$002(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;Z)Z
    //         goto :goto_0
    */

}
