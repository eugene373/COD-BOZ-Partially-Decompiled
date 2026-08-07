package com.ideaworks3d.marmalade.s3eAndroidMarketBilling

// Auto-emitted from smali source: s3eAndroidMarketBilling.java.
// 15 fields, 16 methods.

open class s3eAndroidMarketBilling: android.app.Service(), android.content.ServiceConnection {
    public var m_Service: com.android.vending.billing.IMarketBillingService

    public constructor()

    protected fun extractReqId(p0: android.os.Bundle, p1: LongArray): Int { return TODO("body: (Landroid/os/Bundle;[J)I") }
    /*
    //         .locals 4
    //         const-string v0, "s3eAndroidMarketBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Returning "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "RESPONSE_CODE"
    //         invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", outReq="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "REQUEST_ID"
    //         invoke-virtual {p1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         const-string v1, "REQUEST_ID"
    //         invoke-virtual {p1, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         aput-wide v2, p2, v0
    //         const-string v0, "RESPONSE_CODE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    fun makeRequestBundle(p0: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "BILLING_REQUEST"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "API_VERSION"
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v1, "PACKAGE_NAME"
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun onBind(p0: android.content.Intent): android.os.IBinder { return TODO("body: (Landroid/content/Intent;)Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onServiceConnected(p0: android.content.ComponentName, p1: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p2}, Lcom/android/vending/billing/IMarketBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IMarketBillingService;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         return-void
    */

    public fun onServiceDisconnected(p0: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         return-void
    */

    public fun s3eAndroidMarketBillingConfirmNotifications(p0: Array<String>, p1: LongArray): Int { return TODO("body: ([Ljava/lang/String;[J)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eAndroidMarketBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eAndroidMarketBillingConfirmNotifications("
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "={"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         aget-object v2, p1, v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "...})"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "CONFIRM_NOTIFICATIONS"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "NOTIFY_IDS"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x6
    //         goto :goto_0
    */

    public fun s3eAndroidMarketBillingGetPurchaseInformation(p0: Array<String>, p1: LongArray): Int { return TODO("body: ([Ljava/lang/String;[J)I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eAndroidMarketBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eAndroidMarketBillingGetPurchaseInformation("
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "={"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         aget-object v2, p1, v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "...})"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "GET_PURCHASE_INFORMATION"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->putNonce(Landroid/os/Bundle;)V
    //         const-string v1, "NOTIFY_IDS"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x6
    //         goto :goto_0
    */

    public fun s3eAndroidMarketBillingIsSupported(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "s3eAndroidMarketBillingIsSupported service is not registered"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "CHECK_BILLING_SUPPORTED"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "RESPONSE_CODE"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "s3eAndroidMarketBillingIsSupported Remote Exception"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x6
    //         goto :goto_0
    */

    public fun s3eAndroidMarketBillingRequestPurchase(p0: String, p1: String, p2: LongArray): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;[J)I") }
    /*
    //         .locals 9
    //         const/4 v7, 0x6
    //         const-string v1, "s3eAndroidMarketBilling"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "s3eAndroidMarketBillingRequestPurchase("
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ","
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ")"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x2
    //         :goto_0
    //         return v1
    //         :cond_0
    //         :try_start_0
    //         const-string v1, "REQUEST_PURCHASE"
    //         invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v1
    //         const-string v2, "ITEM_ID"
    //         invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "DEVELOPER_PAYLOAD"
    //         invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         invoke-interface {v2, v1}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v8
    //         const-string v1, "PURCHASE_INTENT"
    //         invoke-virtual {v8, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         move-object v0, v1
    //         check-cast v0, Landroid/app/PendingIntent;
    //         move-object v2, v0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
    //         move-result-object v2
    //         new-instance v3, Landroid/content/Intent;
    //         invoke-direct {v3}, Landroid/content/Intent;-><init>()V
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         invoke-virtual/range {v1 .. v6}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;III)V
    //         invoke-virtual {p0, v8, p3}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    //         :try_end_0
    //         .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         move v1, v7
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         move v1, v7
    //         goto :goto_0
    */

    public fun s3eAndroidMarketBillingRestoreTransactions(p0: LongArray): Int { return TODO("body: ([J)I") }
    /*
    //         .locals 2
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "s3eAndroidMarketBillingRestoreTransactions"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "RESTORE_TRANSACTIONS"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->putNonce(Landroid/os/Bundle;)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;
    //         invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x6
    //         goto :goto_0
    */

    public fun s3eAndroidMarketBillingSetPublicKey(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v1, "s3eAndroidMarketBilling"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eAndroidMarketBillingSetPublicKey(got key="
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ")"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         sput-object p1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_pubKey:Ljava/lang/String;
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun s3eAndroidMarketBillingUnbind() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         :try_start_0
    //         invoke-virtual {p0, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->unbindService(Landroid/content/ServiceConnection;)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_CANCELLED: Int = 0x1
    @JvmField public val S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_PURCHASED: Int = 0x0
    @JvmField public val S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_REFUNDED: Int = 0x2
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_BILLING_UNAVAILABLE: Int = 0x3
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_DEVELOPER_ERROR: Int = 0x5
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_ERROR: Int = 0x6
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_ITEM_UNAVAILABLE: Int = 0x4
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_OK: Int = 0x0
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_SERVICE_UNAVAILABLE: Int = 0x2
    @JvmField public val S3E_ANDROIDMARKETBILLING_RESULT_USER_CANCELED: Int = 0x1
    @JvmField public val TAG: String = "s3eAndroidMarketBilling"
    private val m_Nonces: java.util.HashSet = null!!
    private val m_SecureRandom: java.security.SecureRandom = null!!
    var m_pubKey: String

    @JvmStatic fun checkNonce(p0: Long): Boolean { return TODO("body: (J)Z") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;
    //         invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;
    //         invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    //         return v0
    */

    @JvmStatic fun putNonce(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_SecureRandom:Ljava/security/SecureRandom;
    //         invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J
    //         move-result-wide v0
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         const-string v2, "NONCE"
    //         invoke-virtual {p0, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-void
    */

    }
}
