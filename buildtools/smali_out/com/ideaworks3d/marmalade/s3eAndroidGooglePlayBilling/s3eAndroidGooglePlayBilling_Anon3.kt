package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling

// Auto-emitted from smali source: s3eAndroidGooglePlayBilling.java.
// 1 fields, 2 methods.

open class s3eAndroidGooglePlayBilling_Anon3: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.QueryProductsFinishedListener {
    val this$0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling

    constructor(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling)

    public fun onQuerySkusFinished(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabResult, p1: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.Inventory) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "Query products finished."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->isFailure()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-static {p1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->access$200(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "Query products was successful."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {p1, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->access$200(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    //         goto :goto_0
    */

}
