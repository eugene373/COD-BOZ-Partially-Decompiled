.class public Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;
.super Landroid/content/BroadcastReceiver;
.source "s3eAndroidMarketBillingReceiver.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;
    }
.end annotation


# static fields
.field public static final S3E_ANDROIDMARKETBILLING_SECURITY_INVALID_NONCE:I = 0x20

.field public static final S3E_ANDROIDMARKETBILLING_SECURITY_INVALID_SIGNATURE:I = 0x2

.field public static final S3E_ANDROIDMARKETBILLING_SECURITY_NO_NONCE:I = 0x10

.field public static final S3E_ANDROIDMARKETBILLING_SECURITY_NO_SIGNATURE:I = 0x1

.field public static final S3E_ANDROIDMARKETBILLING_SECURITY_UNCHECKED_SIGNATURE:I = 0x4

.field public static final S3E_ANDROIDMARKETBILLING_SECURITY_VALID:I = 0x0

.field public static final TAG:Ljava/lang/String; = "s3eAndroidMarketBilling"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 200
    return-void
.end method

.method private static native native_onInAppNotifyCallback(Ljava/lang/String;)V
.end method

.method private static native native_onPurchaseStateChangedCallback([Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;I)V
.end method

.method private static native native_onResponseCodeCallback(JI)V
.end method


# virtual methods
.method public onInAppNotify(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 82
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 83
    const-string v1, "notification_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    const-string v1, "s3eAndroidMarketBilling"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got In-App Notify: ID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    const-string v1, "s3eAndroidMarketBilling"

    const-string v2, "Enqueuing native callback..."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    :try_start_0
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->native_onInAppNotifyCallback(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :goto_0
    return-void

    .line 90
    :catch_0
    move-exception v0

    .line 92
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Failed to send App Notify callback"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Application is either not running or s3eAndroidMarketBilling extension was not initialised"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public onPurchaseStateChanged(Landroid/content/Intent;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 99
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 100
    const-string v1, "inapp_signed_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 101
    const-string v1, "inapp_signature"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 102
    const-string v1, "s3eAndroidMarketBilling"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got purchase state change: JSON="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\nSignature:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    if-nez v3, :cond_0

    .line 106
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Discarded"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    :goto_0
    return-void

    .line 112
    :cond_0
    if-eqz v0, :cond_1

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 114
    :cond_1
    const/4 v1, 0x1

    .line 152
    :goto_1
    :try_start_0
    new-instance v0, Lorg/json/JSONTokener;

    invoke-direct {v0, v3}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 153
    const-string v3, "nonce"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 154
    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-nez v3, :cond_5

    .line 156
    or-int/lit8 v1, v1, 0x10

    .line 163
    :cond_2
    :goto_2
    const-string v3, "s3eAndroidMarketBilling"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Security issues: 0x"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    const-string v3, "orders"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    new-array v3, v3, [Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;

    .line 167
    :goto_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v2, v4, :cond_6

    .line 169
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 170
    new-instance v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;

    invoke-direct {v5}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;-><init>()V

    .line 171
    const-string v6, "notificationId"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_NotificationID:Ljava/lang/String;

    .line 172
    const-string v6, "orderId"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_OrderID:Ljava/lang/String;

    .line 173
    const-string v6, "packageName"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_PackageName:Ljava/lang/String;

    .line 174
    const-string v6, "productId"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_ProductID:Ljava/lang/String;

    .line 175
    const-string v6, "purchaseTime"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_PurchaseTime:J

    .line 176
    const-string v6, "purchaseState"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    iput v6, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_PurchaseState:I

    .line 177
    const-string v6, "developerPayload"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;->m_DeveloperPayload:Ljava/lang/String;

    .line 178
    aput-object v5, v3, v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_3

    .line 167
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 118
    :cond_3
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_pubKey:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 121
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "No public key supplied. Won\'t verify signature."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    const/4 v1, 0x4

    goto/16 :goto_1

    .line 126
    :cond_4
    const-string v1, "s3eAndroidMarketBilling"

    const-string v4, "Verifying signature..."

    invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_pubKey:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 130
    :try_start_1
    const-string v4, "RSA"

    invoke-static {v4}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v4

    new-instance v5, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v5, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v4, v5}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v1

    .line 132
    const-string v4, "SHA1withRSA"

    invoke-static {v4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v4

    .line 133
    invoke-virtual {v4, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 134
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/security/Signature;->update([B)V

    .line 135
    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/security/Signature;->verify([B)Z

    move-result v0

    if-nez v0, :cond_7

    .line 137
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Signature is invalid"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_4

    .line 138
    const/4 v1, 0x2

    .line 141
    :goto_4
    :try_start_2
    const-string v0, "s3eAndroidMarketBilling"

    const-string v4, "Signature is valid"

    invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    .line 143
    :catch_0
    move-exception v0

    .line 145
    :goto_5
    or-int/lit8 v1, v1, 0x4

    .line 146
    const-string v4, "s3eAndroidMarketBilling"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "GeneralSecurityException:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 158
    :cond_5
    :try_start_3
    invoke-static {v4, v5}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->checkNonce(J)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_3

    move-result v3

    if-nez v3, :cond_2

    .line 160
    or-int/lit8 v1, v1, 0x20

    goto/16 :goto_2

    .line 182
    :cond_6
    :try_start_4
    invoke-static {v3, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->native_onPurchaseStateChangedCallback([Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;I)V
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_0

    .line 184
    :catch_1
    move-exception v0

    .line 186
    :try_start_5
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Failed to send Purchase State Changed callback"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Application is either not running or s3eAndroidMarketBilling extension was not initialised"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_3

    goto/16 :goto_0

    .line 190
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 194
    :catch_3
    move-exception v0

    .line 196
    const-string v1, "s3eAndroidMarketBilling"

    invoke-virtual {v0}, Ljava/lang/ClassCastException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 143
    :catch_4
    move-exception v0

    move v1, v2

    goto :goto_5

    :cond_7
    move v1, v2

    goto :goto_4
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 39
    const-string v0, "s3eAndroidMarketBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got intent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 41
    const-string v1, "com.android.vending.billing.RESPONSE_CODE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 43
    invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->onResponseCode(Landroid/content/Intent;)V

    .line 54
    :cond_0
    :goto_0
    return-void

    .line 45
    :cond_1
    const-string v1, "com.android.vending.billing.IN_APP_NOTIFY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 47
    invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->onInAppNotify(Landroid/content/Intent;)V

    goto :goto_0

    .line 49
    :cond_2
    const-string v1, "com.android.vending.billing.PURCHASE_STATE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->onPurchaseStateChanged(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onResponseCode(Landroid/content/Intent;)V
    .locals 6

    .prologue
    .line 64
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 65
    const-string v1, "request_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 66
    const-string v1, "response_code"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 67
    const-string v1, "s3eAndroidMarketBilling"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got response code intent: reqId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", respCode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    const-string v1, "s3eAndroidMarketBilling"

    const-string v4, "Enqueuing native callback..."

    invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    :try_start_0
    invoke-static {v2, v3, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;->native_onResponseCodeCallback(JI)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :goto_0
    return-void

    .line 73
    :catch_0
    move-exception v0

    .line 75
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Failed to send Responce Code callback"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "Application is either not running or s3eAndroidMarketBilling extension was not initialised"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
