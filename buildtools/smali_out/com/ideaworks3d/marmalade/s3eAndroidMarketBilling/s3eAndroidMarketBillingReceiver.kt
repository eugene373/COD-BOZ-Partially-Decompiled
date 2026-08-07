package com.ideaworks3d.marmalade.s3eAndroidMarketBilling

// Auto-emitted from smali source: s3eAndroidMarketBillingReceiver.java.
// 7 fields, 8 methods.

open class s3eAndroidMarketBillingReceiver: android.content.BroadcastReceiver() {
    public constructor()

    public fun onInAppNotify(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "notification_id"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "s3eAndroidMarketBilling"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Got In-App Notify: ID="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v1, "s3eAndroidMarketBilling"
    //         const-string v2, "Enqueuing native callback..."
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_start_0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->native_onInAppNotifyCallback(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Failed to send App Notify callback"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Application is either not running or s3eAndroidMarketBilling extension was not initialised"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun onPurchaseStateChanged(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 8
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "inapp_signed_data"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v1, "inapp_signature"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "s3eAndroidMarketBilling"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Got purchase state change: JSON="
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, "\nSignature:"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-nez v3, :cond_0
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Discarded"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         const-string v1, ""
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         :cond_1
    //         const/4 v1, 0x1
    //         :goto_1
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONTokener;
    //         invoke-direct {v0, v3}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lorg/json/JSONObject;
    //         const-string v3, "nonce"
    //         invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         const-wide/16 v6, 0x0
    //         cmp-long v3, v4, v6
    //         if-nez v3, :cond_5
    //         or-int/lit8 v1, v1, 0x10
    //         :cond_2
    //         :goto_2
    //         const-string v3, "s3eAndroidMarketBilling"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Security issues: 0x"
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v3, "orders"
    //         invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v3
    //         new-array v3, v3, [Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;
    //         :goto_3
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v4
    //         if-ge v2, v4, :cond_6
    //         invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         new-instance v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;
    //         invoke-direct {v5}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;-><init>()V
    //         const-string v6, "notificationId"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_NotificationID:Ljava/lang/String;
    //         const-string v6, "orderId"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_OrderID:Ljava/lang/String;
    //         const-string v6, "packageName"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_PackageName:Ljava/lang/String;
    //         const-string v6, "productId"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_ProductID:Ljava/lang/String;
    //         const-string v6, "purchaseTime"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J
    //         move-result-wide v6
    //         iput-wide v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_PurchaseTime:J
    //         const-string v6, "purchaseState"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    //         move-result v6
    //         iput v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_PurchaseState:I
    //         const-string v6, "developerPayload"
    //         invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         iput-object v4, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_DeveloperPayload:Ljava/lang/String;
    //         aput-object v5, v3, v2
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_3
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_3
    //         :cond_3
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_pubKey:Ljava/lang/String;
    //         if-nez v1, :cond_4
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "No public key supplied. Won\'t verify signature."
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v1, 0x4
    //         goto/16 :goto_1
    //         :cond_4
    //         const-string v1, "s3eAndroidMarketBilling"
    //         const-string v4, "Verifying signature..."
    //         invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_pubKey:Ljava/lang/String;
    //         invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    //         move-result-object v1
    //         :try_start_1
    //         const-string v4, "RSA"
    //         invoke-static {v4}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;
    //         move-result-object v4
    //         new-instance v5, Ljava/security/spec/X509EncodedKeySpec;
    //         invoke-direct {v5, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
    //         invoke-virtual {v4, v5}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //         move-result-object v1
    //         const-string v4, "SHA1withRSA"
    //         invoke-static {v4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
    //         move-result-object v4
    //         invoke-virtual {v4, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    //         invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v1
    //         invoke-virtual {v4, v1}, Ljava/security/Signature;->update([B)V
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/security/Signature;->verify([B)Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Signature is invalid"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_1
    //         .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_4
    //         const/4 v1, 0x2
    //         :goto_4
    //         :try_start_2
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v4, "Signature is valid"
    //         invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_2
    //         .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_0
    //         goto/16 :goto_1
    //         :catch_0
    //         move-exception v0
    //         :goto_5
    //         or-int/lit8 v1, v1, 0x4
    //         const-string v4, "s3eAndroidMarketBilling"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "GeneralSecurityException:"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         goto/16 :goto_1
    //         :cond_5
    //         :try_start_3
    //         invoke-static {v4, v5}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->checkNonce(J)Z
    //         :try_end_3
    //         .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    //         .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_3
    //         move-result v3
    //         if-nez v3, :cond_2
    //         or-int/lit8 v1, v1, 0x20
    //         goto/16 :goto_2
    //         :cond_6
    //         :try_start_4
    //         invoke-static {v3, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->native_onPurchaseStateChangedCallback([Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;I)V
    //         :try_end_4
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_1
    //         .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2
    //         .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_3
    //         goto/16 :goto_0
    //         :catch_1
    //         move-exception v0
    //         :try_start_5
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Failed to send Purchase State Changed callback"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Application is either not running or s3eAndroidMarketBilling extension was not initialised"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_5
    //         .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
    //         .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_3
    //         goto/16 :goto_0
    //         :catch_2
    //         move-exception v0
    //         goto/16 :goto_0
    //         :catch_3
    //         move-exception v0
    //         const-string v1, "s3eAndroidMarketBilling"
    //         invoke-virtual {v0}, Ljava/lang/ClassCastException;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         goto/16 :goto_0
    //         :catch_4
    //         move-exception v0
    //         move v1, v2
    //         goto :goto_5
    //         :cond_7
    //         move v1, v2
    //         goto :goto_4
    */

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eAndroidMarketBilling"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Got intent "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "com.android.vending.billing.RESPONSE_CODE"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->onResponseCode(Landroid/content/Intent;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v1, "com.android.vending.billing.IN_APP_NOTIFY"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->onInAppNotify(Landroid/content/Intent;)V
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "com.android.vending.billing.PURCHASE_STATE_CHANGED"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->onPurchaseStateChanged(Landroid/content/Intent;)V
    //         goto :goto_0
    */

    public fun onResponseCode(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 6
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "request_id"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         const-string v1, "response_code"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         const-string v1, "s3eAndroidMarketBilling"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Got response code intent: reqId="
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ", respCode="
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v1, "s3eAndroidMarketBilling"
    //         const-string v4, "Enqueuing native callback..."
    //         invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_start_0
    //         invoke-static {v2, v3, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->native_onResponseCodeCallback(JI)V
    //         :try_end_0
    //         .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Failed to send Responce Code callback"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eAndroidMarketBilling"
    //         const-string v1, "Application is either not running or s3eAndroidMarketBilling extension was not initialised"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    companion object {
    @JvmField public val S3E_ANDROIDMARKETBILLING_SECURITY_INVALID_NONCE: Int = 0x20
    @JvmField public val S3E_ANDROIDMARKETBILLING_SECURITY_INVALID_SIGNATURE: Int = 0x2
    @JvmField public val S3E_ANDROIDMARKETBILLING_SECURITY_NO_NONCE: Int = 0x10
    @JvmField public val S3E_ANDROIDMARKETBILLING_SECURITY_NO_SIGNATURE: Int = 0x1
    @JvmField public val S3E_ANDROIDMARKETBILLING_SECURITY_UNCHECKED_SIGNATURE: Int = 0x4
    @JvmField public val S3E_ANDROIDMARKETBILLING_SECURITY_VALID: Int = 0x0
    @JvmField public val TAG: String = "s3eAndroidMarketBilling"

    private external @JvmStatic fun native_onInAppNotifyCallback(p0: String)

    private external @JvmStatic fun native_onPurchaseStateChangedCallback(p0: Array<com.ideaworks3d.marmalade.s3eAndroidMarketBilling.s3eAndroidMarketBillingReceiver.Order>, p1: Int)

    private external @JvmStatic fun native_onResponseCodeCallback(p0: Long, p1: Int)

    }
}
