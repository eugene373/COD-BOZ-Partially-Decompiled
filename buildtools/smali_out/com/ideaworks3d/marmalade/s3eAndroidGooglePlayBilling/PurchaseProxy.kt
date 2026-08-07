package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling

// Auto-emitted from smali source: PurchaseProxy.java.
// 3 fields, 5 methods.

open class PurchaseProxy: android.app.Activity() {
    public var mProxyPurchaseFinishedListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnIabPurchaseFinishedListener

    public constructor()

    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "PurchaseProxy"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onActivityResult("
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ","
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ","
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->handleActivityResult(IILandroid/content/Intent;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "PurchaseProxy"
    //         const-string v1, "onActivityResult forwarded by PurchaseProxy. Closing down."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         const/16 v3, 0xc4b
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         sget-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         const-string v1, "productID"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v1, "developerPayLoad"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         const-string v1, "inApp"
    //         const/4 v4, 0x1
    //         invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         const-string v0, "PurchaseProxy"
    //         const-string v1, "PurchaseProxy Activity has been restarted with Helper in flight - notifying IabHelper"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->SetPurchaseListener(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;)V
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->launchSubscriptionPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "PurchaseProxy"
    //         const-string v1, "Proxy OnPause"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0}, Landroid/app/Activity;->onPause()V
    //         return-void
    */

    protected fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "PurchaseProxy"
    //         const-string v1, "Proxy onResume"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0}, Landroid/app/Activity;->onResume()V
    //         return-void
    */

    companion object {
    val RC_REQUEST: Int = 0xc4b
    private val TAG: String = "PurchaseProxy"
    }
}
