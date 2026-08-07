package com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling

// Auto-emitted from smali source: s3eAndroidGooglePlayBilling.java.
// 8 fields, 23 methods.

open class s3eAndroidGooglePlayBilling {
    var mConsumeFinishedListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnConsumeFinishedListener
    var mGotInventoryListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.QueryInventoryFinishedListener
    var mGotSkusListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.QueryProductsFinishedListener
    private var s3eAndroidGooglePlayBillingAvailable: Boolean

    constructor()

    public fun s3eAndroidGooglePlayBillingConsumeItem(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eAndroidGooglePlayBillingConsumeItem called for: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         const/4 v1, 0x3
    //         const-string v2, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"
    //         invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_CONSUME_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;
    //         invoke-direct {v0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;-><init>(Ljava/lang/String;)V
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mConsumeFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;
    //         invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->consumeAsync(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;)V
    //         goto :goto_0
    */

    public fun s3eAndroidGooglePlayBillingIsSupported(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun s3eAndroidGooglePlayBillingRequestProductInformation(p0: Array<String>, p1: Array<String>) { /* TODO(body): ([Ljava/lang/String;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const-string v1, "s3eAndroidGooglePlayBilling"
    //         const-string v2, "s3eAndroidGooglePlayBillingRequestProductInformation called for:"
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz p1, :cond_0
    //         const-string v1, "s3eAndroidGooglePlayBilling"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "inApp: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         if-eqz p2, :cond_1
    //         const-string v1, "s3eAndroidGooglePlayBilling"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "subs: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_1
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z
    //         if-nez v1, :cond_2
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         const/4 v2, 0x3
    //         const-string v3, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"
    //         invoke-direct {v1, v2, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V
    //         invoke-static {v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_LIST_PRODUCTS_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    //         :goto_0
    //         return-void
    //         :cond_2
    //         if-eqz p1, :cond_4
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         :goto_1
    //         if-eqz p2, :cond_3
    //         invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         :cond_3
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mGotSkusListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;
    //         invoke-virtual {v2, v1, v0, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->querySkusAsync(Ljava/util/List;Ljava/util/List;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;)V
    //         goto :goto_0
    //         :cond_4
    //         move-object v1, v0
    //         goto :goto_1
    */

    public fun s3eAndroidGooglePlayBillingRequestPurchase(p0: String, p1: Boolean, p2: String) { /* TODO(body): (Ljava/lang/String;ZLjava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eAndroidGooglePlayBillingRequestPurchase called for: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         const/4 v1, 0x3
    //         const-string v2, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"
    //         invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_PURCHASE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v1
    //         const-class v2, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;
    //         invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         const-string v1, "productID"
    //         invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "inApp"
    //         invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         const-string v1, "developerPayLoad"
    //         invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivity(Landroid/content/Intent;)V
    //         goto :goto_0
    */

    public fun s3eAndroidGooglePlayBillingRestoreTransactions() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "s3eAndroidGooglePlayBillingRestoreTransactions called."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;
    //         const/4 v1, 0x3
    //         const-string v2, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"
    //         invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V
    //         invoke-static {v0, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_RESTORE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mGotInventoryListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;
    //         invoke-virtual {v0, v1, v3, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;)V
    //         goto :goto_0
    */

    public fun s3eAndroidGooglePlayBillingStart(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         const-string v1, "s3eAndroidGooglePlayBilling"
    //         const-string v2, "s3eAndroidGooglePlayBillingStart called."
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         if-nez p1, :cond_0
    //         const-string v1, "s3eAndroidGooglePlayBilling"
    //         const-string v2, "ERROR: No public key sent."
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v1, "s3eAndroidGooglePlayBilling"
    //         const-string v2, "Creating IAB helper."
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         move-result-object v2
    //         invoke-direct {v1, v2, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    //         sput-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->enableDebugLogging(Z)V
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "Starting setup."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$1;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->startSetup(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabSetupFinishedListener;)V
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun s3eAndroidGooglePlayBillingStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "s3eAndroidGooglePlayBillingStop called."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->dispose()V
    //         :goto_0
    //         const/4 v0, 0x0
    //         sput-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z
    //         return-void
    //         :cond_0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         const-string v1, "s3eAndroidGooglePlayBillingStop called without having been successfully started."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    companion object {
    private val TAG: String = "s3eAndroidGooglePlayBilling"
    @JvmField public var mHelper: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper
    @JvmField public val mPurchaseFinishedListener: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabHelper.OnIabPurchaseFinishedListener = null!!
    @JvmField public var m_SendRequest: Boolean

    public external @JvmStatic fun native_CONSUME_CALLBACK(p0: Int, p1: String)

    public external @JvmStatic fun native_LIST_PRODUCTS_CALLBACK(p0: Int, p1: String, p2: Array<com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling.S3eBillingItemInfo>)

    public external @JvmStatic fun native_PURCHASE_CALLBACK(p0: Int, p1: String, p2: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling.S3eBillingPurchase)

    public external @JvmStatic fun native_RESTORE_CALLBACK(p0: Int, p1: String, p2: Array<com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.s3eAndroidGooglePlayBilling.S3eBillingPurchase>)

    private @JvmStatic fun safe_native_CONSUME_CALLBACK(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabResult) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_CONSUME_CALLBACK(ILjava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No native handlers installed for native_LIST_PRODUCTS_CALLBACK, we received "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    private @JvmStatic fun safe_native_LIST_PRODUCTS_CALLBACK(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabResult, p1: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.Inventory) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V */ }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_1
    //         :try_start_0
    //         invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;->getAllSkus()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v3, v0, [Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_0
    //         new-instance v4, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;
    //         invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;
    //         invoke-direct {v4, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;)V
    //         aput-object v4, v3, v1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_LIST_PRODUCTS_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;)V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_LIST_PRODUCTS_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;)V
    //         :try_end_0
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No native handlers installed for native_LIST_PRODUCTS_CALLBACK, we received "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    */

    private @JvmStatic fun safe_native_PURCHASE_CALLBACK(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabResult, p1: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.Purchase) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_0
    //         :try_start_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;
    //         invoke-direct {v0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_PURCHASE_CALLBACK(ILjava/lang/String;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
    //         :try_end_0
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No native handlers installed for safe_native_PURCHASE_CALLBACK, we received "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    private @JvmStatic fun safe_native_RESTORE_CALLBACK(p0: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.IabResult, p1: com.ideaworks3d.marmalade.s3eAndroidGooglePlayBilling.util.Inventory) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V */ }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_1
    //         :try_start_0
    //         invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;->getAllPurchases()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v3, v0, [Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_0
    //         new-instance v4, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;
    //         invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;
    //         invoke-direct {v4, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    //         aput-object v4, v3, v1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_RESTORE_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_RESTORE_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
    //         :try_end_0
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidGooglePlayBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No native handlers installed for native_LIST_PRODUCTS_CALLBACK, we received "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    */

    }
}
