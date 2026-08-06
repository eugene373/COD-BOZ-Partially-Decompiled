.class Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;
.super Landroid/app/Service;
.source "s3eAndroidMarketBilling.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# static fields
.field public static final S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_CANCELLED:I = 0x1

.field public static final S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_PURCHASED:I = 0x0

.field public static final S3E_ANDROIDMARKETBILLING_PURCHASE_STATE_REFUNDED:I = 0x2

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_BILLING_UNAVAILABLE:I = 0x3

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_DEVELOPER_ERROR:I = 0x5

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_ERROR:I = 0x6

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_ITEM_UNAVAILABLE:I = 0x4

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_OK:I = 0x0

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_SERVICE_UNAVAILABLE:I = 0x2

.field public static final S3E_ANDROIDMARKETBILLING_RESULT_USER_CANCELED:I = 0x1

.field public static final TAG:Ljava/lang/String; = "s3eAndroidMarketBilling"

.field private static final m_Nonces:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final m_SecureRandom:Ljava/security/SecureRandom;

.field static m_pubKey:Ljava/lang/String;


# instance fields
.field public m_Service:Lcom/android/vending/billing/IMarketBillingService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_SecureRandom:Ljava/security/SecureRandom;

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 88
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 89
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->attachBaseContext(Landroid/content/Context;)V

    .line 90
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.MarketBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 93
    return-void
.end method

.method static checkNonce(J)Z
    .locals 4

    .prologue
    .line 74
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 75
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 76
    return v0
.end method

.method static putNonce(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 65
    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_SecureRandom:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v0

    .line 67
    sget-object v2, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 68
    sget-object v2, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Nonces:Ljava/util/HashSet;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 69
    const-string v2, "NONCE"

    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 70
    return-void
.end method


# virtual methods
.method protected extractReqId(Landroid/os/Bundle;[J)I
    .locals 4

    .prologue
    .line 81
    const-string v0, "s3eAndroidMarketBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Returning "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "RESPONSE_CODE"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", outReq="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "REQUEST_ID"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    const/4 v0, 0x0

    const-string v1, "REQUEST_ID"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    aput-wide v2, p2, v0

    .line 84
    const-string v0, "RESPONSE_CODE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 53
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 54
    const-string v1, "BILLING_REQUEST"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v1, "API_VERSION"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 56
    const-string v1, "PACKAGE_NAME"

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 238
    const/4 v0, 0x0

    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .prologue
    .line 244
    invoke-static {p2}, Lcom/android/vending/billing/IMarketBillingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/billing/IMarketBillingService;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    .line 245
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .prologue
    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    .line 251
    return-void
.end method

.method public s3eAndroidMarketBillingConfirmNotifications([Ljava/lang/String;[J)I
    .locals 3

    .prologue
    .line 188
    const-string v0, "s3eAndroidMarketBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eAndroidMarketBillingConfirmNotifications("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "={"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "...})"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    if-nez v0, :cond_0

    .line 192
    const/4 v0, 0x2

    .line 203
    :goto_0
    return v0

    .line 196
    :cond_0
    :try_start_0
    const-string v0, "CONFIRM_NOTIFICATIONS"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 197
    const-string v1, "NOTIFY_IDS"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 198
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 199
    invoke-virtual {p0, v0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 201
    :catch_0
    move-exception v0

    .line 203
    const/4 v0, 0x6

    goto :goto_0
.end method

.method public s3eAndroidMarketBillingGetPurchaseInformation([Ljava/lang/String;[J)I
    .locals 3

    .prologue
    .line 164
    const-string v0, "s3eAndroidMarketBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eAndroidMarketBillingGetPurchaseInformation("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "={"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "...})"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    if-nez v0, :cond_0

    .line 169
    const/4 v0, 0x2

    .line 181
    :goto_0
    return v0

    .line 173
    :cond_0
    :try_start_0
    const-string v0, "GET_PURCHASE_INFORMATION"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 174
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->putNonce(Landroid/os/Bundle;)V

    .line 175
    const-string v1, "NOTIFY_IDS"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 176
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 177
    invoke-virtual {p0, v0, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 179
    :catch_0
    move-exception v0

    .line 181
    const/4 v0, 0x6

    goto :goto_0
.end method

.method public s3eAndroidMarketBillingIsSupported()I
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    if-nez v0, :cond_0

    .line 109
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "s3eAndroidMarketBillingIsSupported service is not registered"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    const/4 v0, 0x2

    .line 123
    :goto_0
    return v0

    .line 115
    :cond_0
    :try_start_0
    const-string v0, "CHECK_BILLING_SUPPORTED"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 117
    const-string v1, "RESPONSE_CODE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 120
    :catch_0
    move-exception v0

    .line 122
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "s3eAndroidMarketBillingIsSupported Remote Exception"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    const/4 v0, 0x6

    goto :goto_0
.end method

.method public s3eAndroidMarketBillingRequestPurchase(Ljava/lang/String;Ljava/lang/String;[J)I
    .locals 9

    .prologue
    const/4 v7, 0x6

    .line 132
    const-string v1, "s3eAndroidMarketBilling"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "s3eAndroidMarketBillingRequestPurchase("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    if-nez v1, :cond_0

    .line 136
    const/4 v1, 0x2

    .line 157
    :goto_0
    return v1

    .line 141
    :cond_0
    :try_start_0
    const-string v1, "REQUEST_PURCHASE"

    invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 142
    const-string v2, "ITEM_ID"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v2, "DEVELOPER_PAYLOAD"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    invoke-interface {v2, v1}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v8

    .line 146
    const-string v1, "PURCHASE_INTENT"

    invoke-virtual {v8, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Landroid/app/PendingIntent;

    move-object v2, v0

    .line 147
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;III)V

    .line 149
    invoke-virtual {p0, v8, p3}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    goto :goto_0

    .line 151
    :catch_0
    move-exception v1

    move v1, v7

    .line 153
    goto :goto_0

    .line 155
    :catch_1
    move-exception v1

    move v1, v7

    .line 157
    goto :goto_0
.end method

.method public s3eAndroidMarketBillingRestoreTransactions([J)I
    .locals 2

    .prologue
    .line 209
    const-string v0, "s3eAndroidMarketBilling"

    const-string v1, "s3eAndroidMarketBillingRestoreTransactions"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    if-nez v0, :cond_0

    .line 212
    const/4 v0, 0x2

    .line 223
    :goto_0
    return v0

    .line 216
    :cond_0
    :try_start_0
    const-string v0, "RESTORE_TRANSACTIONS"

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->makeRequestBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 217
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->putNonce(Landroid/os/Bundle;)V

    .line 218
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_Service:Lcom/android/vending/billing/IMarketBillingService;

    invoke-interface {v1, v0}, Lcom/android/vending/billing/IMarketBillingService;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 219
    invoke-virtual {p0, v0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->extractReqId(Landroid/os/Bundle;[J)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 221
    :catch_0
    move-exception v0

    .line 223
    const/4 v0, 0x6

    goto :goto_0
.end method

.method public s3eAndroidMarketBillingSetPublicKey(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 229
    const-string v1, "s3eAndroidMarketBilling"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eAndroidMarketBillingSetPublicKey(got key="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    sput-object p1, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->m_pubKey:Ljava/lang/String;

    .line 231
    return-void

    .line 229
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public s3eAndroidMarketBillingUnbind()V
    .locals 1

    .prologue
    .line 99
    :try_start_0
    invoke-virtual {p0, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBilling;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    :goto_0
    return-void

    .line 100
    :catch_0
    move-exception v0

    goto :goto_0
.end method
