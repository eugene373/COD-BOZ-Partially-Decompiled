.class public Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
.super Ljava/lang/Object;
.source "SamsungIapHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;,
        Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;,
        Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;,
        Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    }
.end annotation


# static fields
.field private static final FLAG_INCLUDE_STOPPED_PACKAGES:I = 0x20

.field private static final HONEYCOMB_MR1:I = 0xc

.field public static final IAP_ERROR_ALREADY_PURCHASED:I = -0x3eb

.field public static final IAP_ERROR_COMMON:I = -0x3ea

.field public static final IAP_ERROR_CONFIRM_INBOX:I = -0x3ee

.field public static final IAP_ERROR_INITIALIZATION:I = -0x3e8

.field public static final IAP_ERROR_NEED_APP_UPGRADE:I = -0x3e9

.field public static final IAP_ERROR_NONE:I = 0x0

.field public static final IAP_ERROR_PRODUCT_DOES_NOT_EXIST:I = -0x3ed

.field public static final IAP_ERROR_WHILE_RUNNING:I = -0x3ec

.field public static final IAP_MODE_COMMERCIAL:I = 0x0

.field public static final IAP_MODE_TEST_FAIL:I = -0x1

.field public static final IAP_MODE_TEST_SUCCESS:I = 0x1

.field public static final IAP_PACKAGE_NAME:Ljava/lang/String; = "com.sec.android.iap"

.field public static final IAP_PAYMENT_IS_CANCELED:I = 0x1

.field public static final IAP_RESPONSE_RESULT_OK:I = 0x0

.field public static final IAP_RESPONSE_RESULT_UNAVAILABLE:I = 0x2

.field public static final IAP_SERVICE_NAME:Ljava/lang/String; = "com.sec.android.iap.service.iapService"

.field public static final IAP_SIGNATURE_HASHCODE:I = 0x7a7eaf4b

.field public static final ITEM_TYPE_ALL:Ljava/lang/String; = "10"

.field public static final ITEM_TYPE_CONSUMABLE:Ljava/lang/String; = "00"

.field public static final ITEM_TYPE_NON_CONSUMABLE:Ljava/lang/String; = "01"

.field public static final ITEM_TYPE_SUBSCRIPTION:Ljava/lang/String; = "02"

.field public static final KEY_NAME_ERROR_STRING:Ljava/lang/String; = "ERROR_STRING"

.field public static final KEY_NAME_IAP_UPGRADE_URL:Ljava/lang/String; = "IAP_UPGRADE_URL"

.field public static final KEY_NAME_ITEM_GROUP_ID:Ljava/lang/String; = "ITEM_GROUP_ID"

.field public static final KEY_NAME_ITEM_ID:Ljava/lang/String; = "ITEM_ID"

.field public static final KEY_NAME_RESULT_LIST:Ljava/lang/String; = "RESULT_LIST"

.field public static final KEY_NAME_RESULT_OBJECT:Ljava/lang/String; = "RESULT_OBJECT"

.field public static final KEY_NAME_STATUS_CODE:Ljava/lang/String; = "STATUS_CODE"

.field public static final KEY_NAME_THIRD_PARTY_NAME:Ljava/lang/String; = "THIRD_PARTY_NAME"

.field public static final REQUEST_CODE_IS_ACCOUNT_CERTIFICATION:I = 0x2

.field public static final REQUEST_CODE_IS_IAP_PAYMENT:I = 0x1

.field private static final STATE_BINDING:I = 0x1

.field private static final STATE_READY:I = 0x2

.field private static final STATE_TERM:I = 0x0

.field private static final TAG:Ljava/lang/String;

.field private static final VERIFY_URL:Ljava/lang/String; = "https://iap.samsungapps.com/iap/appsItemVerifyIAPReceipt.as?protocolVersion=2.0"

.field private static mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

.field public static mShowProgressDialog:Z


# instance fields
.field private mContext:Landroid/content/Context;

.field private mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

.field private mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

.field private mIapConnector:Lcom/sec/android/iap/IAPConnector;

.field private mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

.field private mMode:I

.field private mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

.field private mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;

.field private mOnInitIapListener:Lcom/sec/android/iap/lib/listener/OnInitIapListener;

.field private mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;

.field private mServiceConn:Landroid/content/ServiceConnection;

.field private mState:I

.field private mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->TAG:Ljava/lang/String;

    .line 192
    const/4 v0, 0x0

    sput-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 207
    const/4 v0, 0x0

    sput-boolean v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mShowProgressDialog:Z

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "_context"    # Landroid/content/Context;
    .param p2, "_mode"    # I

    .prologue
    const/4 v1, 0x0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    const/4 v0, 0x1

    iput v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I

    .line 157
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    .line 159
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    .line 160
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 164
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    .line 165
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnInitIapListener:Lcom/sec/android/iap/lib/listener/OnInitIapListener;

    .line 170
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    .line 171
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    .line 176
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    .line 177
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    .line 187
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    .line 190
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    .line 196
    const/4 v0, 0x0

    iput v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I

    .line 226
    invoke-direct {p0, p1, p2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->_setContextAndMode(Landroid/content/Context;I)V

    .line 227
    return-void
.end method

.method private _setContextAndMode(Landroid/content/Context;I)V
    .locals 1
    .param p1, "_context"    # Landroid/content/Context;
    .param p2, "_mode"    # I

    .prologue
    .line 250
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    .line 251
    iput p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I

    .line 252
    return-void
.end method

.method static synthetic access$0(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)I
    .locals 1

    .prologue
    .line 196
    iget v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I

    return v0
.end method

.method static synthetic access$1()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Lcom/sec/android/iap/lib/listener/OnInitIapListener;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnInitIapListener:Lcom/sec/android/iap/lib/listener/OnInitIapListener;

    return-object v0
.end method

.method static synthetic access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V
    .locals 0

    .prologue
    .line 196
    iput p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I

    return-void
.end method

.method static synthetic access$4(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/IAPConnector;)V
    .locals 0

    .prologue
    .line 159
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    return-void
.end method

.method static synthetic access$5(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Landroid/content/ServiceConnection;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    return-void
.end method

.method static synthetic access$6(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Lcom/sec/android/iap/IAPConnector;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    return-object v0
.end method

.method static synthetic access$7(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    .locals 1
    .param p0, "_context"    # Landroid/content/Context;
    .param p1, "_mode"    # I

    .prologue
    .line 236
    sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    if-nez v0, :cond_0

    .line 238
    new-instance v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-direct {v0, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 245
    :goto_0
    sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    return-object v0

    .line 242
    :cond_0
    sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-direct {v0, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->_setContextAndMode(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method private stopTasksIfNotFinished()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1617
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    if-eqz v0, :cond_0

    .line 1619
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 1621
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->cancel(Z)Z

    .line 1625
    :cond_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    if-eqz v0, :cond_1

    .line 1627
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_1

    .line 1629
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->cancel(Z)Z

    .line 1633
    :cond_1
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    if-eqz v0, :cond_2

    .line 1635
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_2

    .line 1637
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->cancel(Z)Z

    .line 1641
    :cond_2
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    if-eqz v0, :cond_3

    .line 1643
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_3

    .line 1645
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->cancel(Z)Z

    .line 1648
    :cond_3
    return-void
.end method


# virtual methods
.method public bindIapService(Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V
    .locals 4
    .param p1, "_listener"    # Lcom/sec/android/iap/lib/listener/OnIapBindListener;

    .prologue
    const/4 v3, 0x1

    .line 297
    iget v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I

    if-lt v1, v3, :cond_1

    .line 299
    if-eqz p1, :cond_0

    .line 301
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lcom/sec/android/iap/lib/listener/OnIapBindListener;->onBindIapFinished(I)V

    .line 356
    :cond_0
    :goto_0
    return-void

    .line 310
    :cond_1
    new-instance v1, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;

    invoke-direct {v1, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V

    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 348
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.sec.android.iap.service.iapService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 352
    .local v0, "serviceIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    .line 353
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 352
    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0
.end method

.method public dispose()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1662
    invoke-direct {p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->stopTasksIfNotFinished()V

    .line 1664
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    .line 1666
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 1669
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I

    .line 1670
    iput-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;

    .line 1671
    iput-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    .line 1672
    return-void
.end method

.method public getItemInboxList(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V
    .locals 4
    .param p1, "_itemGroupId"    # Ljava/lang/String;
    .param p2, "_startNum"    # I
    .param p3, "_endNum"    # I
    .param p4, "_startDate"    # Ljava/lang/String;
    .param p5, "_endDate"    # Ljava/lang/String;
    .param p6, "_onGetInboxListener"    # Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    .prologue
    .line 1079
    if-nez p6, :cond_0

    .line 1081
    :try_start_0
    new-instance v2, Ljava/lang/Exception;

    const-string v3, "OnGetInboxListener is null"

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1098
    :catch_0
    move-exception v0

    .line 1100
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1102
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void

    .line 1084
    :cond_0
    :try_start_1
    invoke-virtual {p0, p6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnGetInboxListener(Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V

    .line 1086
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    const-class v3, Lcom/sec/android/iap/lib/activity/InboxActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1087
    .local v1, "intent":Landroid/content/Intent;
    const-string v2, "ItemGroupId"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1088
    const-string v2, "IapMode"

    iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1089
    const-string v2, "StartNum"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1090
    const-string v2, "EndNum"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1091
    const-string v2, "StartDate"

    invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1092
    const-string v2, "EndDate"

    invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1094
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1096
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public getItemList(Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;
    .locals 9
    .param p1, "_itemGroupId"    # Ljava/lang/String;
    .param p2, "_startNum"    # I
    .param p3, "_endNum"    # I
    .param p4, "_itemType"    # Ljava/lang/String;

    .prologue
    .line 911
    const/4 v8, 0x0

    .line 915
    .local v8, "itemList":Landroid/os/Bundle;
    :try_start_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    iget v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I

    .line 916
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    .line 915
    invoke-interface/range {v0 .. v6}, Lcom/sec/android/iap/IAPConnector;->getItemList(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 927
    :goto_0
    return-object v8

    .line 922
    :catch_0
    move-exception v7

    .line 924
    .local v7, "e":Landroid/os/RemoteException;
    invoke-virtual {v7}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method public getItemList(Ljava/lang/String;IILjava/lang/String;ILcom/sec/android/iap/lib/listener/OnGetItemListener;)V
    .locals 4
    .param p1, "_itemGroupId"    # Ljava/lang/String;
    .param p2, "_startNum"    # I
    .param p3, "_endNum"    # I
    .param p4, "_itemType"    # Ljava/lang/String;
    .param p5, "_mode"    # I
    .param p6, "_onGetItemListener"    # Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    .prologue
    .line 617
    if-nez p6, :cond_0

    .line 619
    :try_start_0
    new-instance v2, Ljava/lang/Exception;

    const-string v3, "OnGetItemListener is null"

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 635
    :catch_0
    move-exception v0

    .line 637
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 639
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void

    .line 622
    :cond_0
    :try_start_1
    invoke-virtual {p0, p6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnGetItemListener(Lcom/sec/android/iap/lib/listener/OnGetItemListener;)V

    .line 624
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    const-class v3, Lcom/sec/android/iap/lib/activity/ItemActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 625
    .local v1, "intent":Landroid/content/Intent;
    const-string v2, "ItemGroupId"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 626
    const-string v2, "StartNum"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 627
    const-string v2, "EndNum"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 628
    const-string v2, "ItemType"

    invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 629
    const-string v2, "IapMode"

    invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 631
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 633
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public getItemsInbox(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 9
    .param p1, "_itemGroupId"    # Ljava/lang/String;
    .param p2, "_startNum"    # I
    .param p3, "_endNum"    # I
    .param p4, "_startDate"    # Ljava/lang/String;
    .param p5, "_endDate"    # Ljava/lang/String;

    .prologue
    .line 1333
    const/4 v8, 0x0

    .line 1337
    .local v8, "purchaseItemList":Landroid/os/Bundle;
    :try_start_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    .line 1338
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 1337
    invoke-interface/range {v0 .. v6}, Lcom/sec/android/iap/IAPConnector;->getItemsInbox(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 1350
    :goto_0
    return-object v8

    .line 1345
    :catch_0
    move-exception v7

    .line 1347
    .local v7, "e":Landroid/os/RemoteException;
    invoke-virtual {v7}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method public getOnGetInboxListener()Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    .locals 1

    .prologue
    .line 1310
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    return-object v0
.end method

.method public getOnGetItemListener()Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    return-object v0
.end method

.method public getOnPaymentListener()Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    .locals 1

    .prologue
    .line 1040
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    return-object v0
.end method

.method public init(Lcom/sec/android/iap/lib/vo/ErrorVo;)V
    .locals 4
    .param p1, "_errorVo"    # Lcom/sec/android/iap/lib/vo/ErrorVo;

    .prologue
    .line 555
    :try_start_0
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;

    iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I

    invoke-interface {v2, v3}, Lcom/sec/android/iap/IAPConnector;->init(I)Landroid/os/Bundle;

    move-result-object v0

    .line 557
    .local v0, "bundle":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 559
    const-string v2, "STATUS_CODE"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 560
    const-string v3, "ERROR_STRING"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 559
    invoke-virtual {p1, v2, v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 561
    const-string v2, "IAP_UPGRADE_URL"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setExtraString(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 568
    .end local v0    # "bundle":Landroid/os/Bundle;
    :cond_0
    :goto_0
    return-void

    .line 564
    :catch_0
    move-exception v1

    .line 566
    .local v1, "e":Landroid/os/RemoteException;
    invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method public installIapPackage(Lcom/sec/android/iap/lib/activity/BaseActivity;)V
    .locals 7
    .param p1, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;

    .prologue
    const/4 v4, 0x1

    .line 1690
    new-instance v5, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;

    invoke-direct {v5, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)V

    .line 1723
    .local v5, "OkBtnRunnable":Ljava/lang/Runnable;
    new-instance v6, Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-direct {v6}, Lcom/sec/android/iap/lib/vo/ErrorVo;-><init>()V

    .line 1724
    .local v6, "errorVo":Lcom/sec/android/iap/lib/vo/ErrorVo;
    invoke-virtual {p1, v6}, Lcom/sec/android/iap/lib/activity/BaseActivity;->setErrorVo(Lcom/sec/android/iap/lib/vo/ErrorVo;)V

    .line 1727
    const-string v0, "string"

    const-string v1, "IDS_SAPPS_POP_PAYMENT_CANCELLED"

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1726
    invoke-virtual {v6, v4, v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 1733
    const-string v0, "string"

    const-string v1, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1734
    const-string v0, "string"

    const-string v1, "IDS_SAPPS_POP_TO_PURCHASE_ITEMS_YOU_NEED_TO_INSTALL_SAMSUNG_IN_APP_PURCHASE_INSTALL_Q"

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    .line 1732
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 1738
    return-void
.end method

.method public isInstalledIapPackage(Landroid/content/Context;)Z
    .locals 4
    .param p1, "_context"    # Landroid/content/Context;

    .prologue
    .line 1747
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 1751
    .local v1, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    const-string v2, "com.sec.android.iap"

    .line 1752
    const/16 v3, 0x80

    .line 1751
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1753
    const/4 v2, 0x1

    .line 1758
    :goto_0
    return v2

    .line 1755
    :catch_0
    move-exception v0

    .line 1757
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 1758
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public isValidIapPackage(Landroid/content/Context;)Z
    .locals 6
    .param p1, "_context"    # Landroid/content/Context;

    .prologue
    .line 1769
    const/4 v1, 0x1

    .line 1773
    .local v1, "result":Z
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 1774
    const-string v4, "com.sec.android.iap"

    .line 1775
    const/16 v5, 0x40

    .line 1773
    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 1775
    iget-object v2, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 1777
    .local v2, "sigs":[Landroid/content/pm/Signature;
    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-virtual {v3}, Landroid/content/pm/Signature;->hashCode()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    const v4, 0x7a7eaf4b

    if-eq v3, v4, :cond_0

    .line 1779
    const/4 v1, 0x0

    .line 1788
    .end local v2    # "sigs":[Landroid/content/pm/Signature;
    :cond_0
    :goto_0
    return v1

    .line 1782
    :catch_0
    move-exception v0

    .line 1784
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1785
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public removeAllListener()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1652
    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    .line 1653
    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    .line 1654
    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    .line 1655
    return-void
.end method

.method public safeGetItemInboxTask(Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 9
    .param p1, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;
    .param p2, "_itemGroupId"    # Ljava/lang/String;
    .param p3, "_startNum"    # I
    .param p4, "_endNum"    # I
    .param p5, "_startDate"    # Ljava/lang/String;
    .param p6, "_endDate"    # Ljava/lang/String;

    .prologue
    .line 1119
    :try_start_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    if-eqz v0, :cond_0

    .line 1120
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 1122
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->cancel(Z)Z

    .line 1125
    :cond_0
    new-instance v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 1130
    invoke-direct/range {v0 .. v7}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 1125
    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    .line 1131
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1142
    :goto_0
    return-void

    .line 1133
    :catch_0
    move-exception v8

    .line 1135
    .local v8, "e":Ljava/lang/Exception;
    if-eqz p1, :cond_1

    .line 1137
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V

    .line 1140
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public safeGetItemList(Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;)V
    .locals 8
    .param p1, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;
    .param p2, "_itemGroupId"    # Ljava/lang/String;
    .param p3, "_startNum"    # I
    .param p4, "_endNum"    # I
    .param p5, "_itemType"    # Ljava/lang/String;

    .prologue
    .line 655
    :try_start_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    if-eqz v0, :cond_0

    .line 656
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 658
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->cancel(Z)Z

    .line 661
    :cond_0
    new-instance v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    .line 665
    invoke-direct/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;)V

    .line 661
    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    .line 666
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 677
    :goto_0
    return-void

    .line 668
    :catch_0
    move-exception v7

    .line 670
    .local v7, "e":Ljava/lang/Exception;
    if-eqz p1, :cond_1

    .line 672
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V

    .line 675
    :cond_1
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public safeInitIap(Lcom/sec/android/iap/lib/activity/BaseActivity;)V
    .locals 3
    .param p1, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;

    .prologue
    .line 368
    :try_start_0
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    if-eqz v1, :cond_0

    .line 369
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v1

    sget-object v2, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v1, v2, :cond_0

    .line 371
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->cancel(Z)Z

    .line 374
    :cond_0
    new-instance v1, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    invoke-direct {v1, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;)V

    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    .line 375
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 386
    :goto_0
    return-void

    .line 377
    :catch_0
    move-exception v0

    .line 379
    .local v0, "e":Ljava/lang/Exception;
    if-eqz p1, :cond_1

    .line 381
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V

    .line 384
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public setOnGetInboxListener(Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V
    .locals 0
    .param p1, "_onGetInboxListener"    # Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    .prologue
    .line 1305
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    .line 1306
    return-void
.end method

.method public setOnGetItemListener(Lcom/sec/android/iap/lib/listener/OnGetItemListener;)V
    .locals 0
    .param p1, "_onGetItemListener"    # Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    .prologue
    .line 886
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    .line 887
    return-void
.end method

.method public setOnInitIapListener(Lcom/sec/android/iap/lib/listener/OnInitIapListener;)V
    .locals 0
    .param p1, "_onInitIapListener"    # Lcom/sec/android/iap/lib/listener/OnInitIapListener;

    .prologue
    .line 544
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnInitIapListener:Lcom/sec/android/iap/lib/listener/OnInitIapListener;

    .line 545
    return-void
.end method

.method public setOnPaymentListener(Lcom/sec/android/iap/lib/listener/OnPaymentListener;)V
    .locals 0
    .param p1, "_onPaymentListener"    # Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    .prologue
    .line 1035
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    .line 1036
    return-void
.end method

.method public showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    .locals 4
    .param p1, "_activity"    # Landroid/app/Activity;
    .param p2, "_title"    # Ljava/lang/String;
    .param p3, "_message"    # Ljava/lang/String;
    .param p4, "_finishActivity"    # Z
    .param p5, "_onClickRunable"    # Ljava/lang/Runnable;

    .prologue
    .line 1805
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1807
    .local v0, "alert":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1808
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1810
    const v2, 0x104000a

    .line 1811
    new-instance v3, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;

    invoke-direct {v3, p0, p5, p4, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Ljava/lang/Runnable;ZLandroid/app/Activity;)V

    .line 1810
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1830
    if-eqz p4, :cond_0

    .line 1832
    new-instance v2, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;

    invoke-direct {v2, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 1844
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1850
    :goto_0
    return-void

    .line 1846
    :catch_0
    move-exception v1

    .line 1848
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public startAccountActivity(Landroid/app/Activity;)V
    .locals 4
    .param p1, "_activity"    # Landroid/app/Activity;

    .prologue
    .line 274
    new-instance v0, Landroid/content/ComponentName;

    const-string v2, "com.sec.android.iap"

    .line 275
    const-string v3, "com.sec.android.iap.activity.AccountActivity"

    .line 274
    invoke-direct {v0, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .local v0, "com":Landroid/content/ComponentName;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 278
    .local v1, "intent":Landroid/content/Intent;
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 281
    const/4 v2, 0x2

    .line 280
    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 282
    return-void
.end method

.method public startPayment(Ljava/lang/String;Ljava/lang/String;ZLcom/sec/android/iap/lib/listener/OnPaymentListener;)V
    .locals 4
    .param p1, "_itemGroupId"    # Ljava/lang/String;
    .param p2, "_itemId"    # Ljava/lang/String;
    .param p3, "_showSuccessDialog"    # Z
    .param p4, "_onPaymentListener"    # Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    .prologue
    .line 963
    if-nez p4, :cond_0

    .line 965
    :try_start_0
    new-instance v2, Ljava/lang/Exception;

    const-string v3, "OnPaymentListener is null"

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 980
    :catch_0
    move-exception v0

    .line 982
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 984
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void

    .line 968
    :cond_0
    :try_start_1
    invoke-virtual {p0, p4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnPaymentListener(Lcom/sec/android/iap/lib/listener/OnPaymentListener;)V

    .line 970
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    const-class v3, Lcom/sec/android/iap/lib/activity/PaymentActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 971
    .local v1, "intent":Landroid/content/Intent;
    const-string v2, "ItemGroupId"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 972
    const-string v2, "ItemId"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 973
    const-string v2, "ShowSuccessDialog"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 974
    const-string v2, "IapMode"

    iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 976
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 978
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public startPaymentActivity(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "_activity"    # Landroid/app/Activity;
    .param p2, "_requestCode"    # I
    .param p3, "_itemGroupId"    # Ljava/lang/String;
    .param p4, "_itemId"    # Ljava/lang/String;

    .prologue
    .line 1003
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1004
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v4, "THIRD_PARTY_NAME"

    .line 1005
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 1004
    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1007
    const-string v4, "ITEM_GROUP_ID"

    invoke-virtual {v0, v4, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1009
    const-string v4, "ITEM_ID"

    invoke-virtual {v0, v4, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1011
    new-instance v1, Landroid/content/ComponentName;

    const-string v4, "com.sec.android.iap"

    .line 1012
    const-string v5, "com.sec.android.iap.activity.PaymentMethodListActivity"

    .line 1011
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1014
    .local v1, "com":Landroid/content/ComponentName;
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.MAIN"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1015
    .local v3, "intent":Landroid/content/Intent;
    const-string v4, "android.intent.category.LAUNCHER"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1016
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1018
    invoke-virtual {v3, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1020
    invoke-virtual {p1, v3, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1026
    .end local v0    # "bundle":Landroid/os/Bundle;
    .end local v1    # "com":Landroid/content/ComponentName;
    .end local v3    # "intent":Landroid/content/Intent;
    :goto_0
    return-void

    .line 1022
    :catch_0
    move-exception v2

    .line 1024
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public verifyPurchaseResult(Lcom/sec/android/iap/lib/activity/BaseActivity;Lcom/sec/android/iap/lib/vo/PurchaseVo;Z)V
    .locals 3
    .param p1, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;
    .param p2, "_purchaseVO"    # Lcom/sec/android/iap/lib/vo/PurchaseVo;
    .param p3, "_showSuccessDialog"    # Z

    .prologue
    .line 1371
    :try_start_0
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    if-eqz v1, :cond_0

    .line 1372
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v1

    sget-object v2, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v1, v2, :cond_0

    .line 1374
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->cancel(Z)Z

    .line 1377
    :cond_0
    new-instance v1, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    .line 1380
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Lcom/sec/android/iap/lib/vo/PurchaseVo;Z)V

    .line 1377
    iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    .line 1381
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1396
    :goto_0
    return-void

    .line 1383
    :catch_0
    move-exception v0

    .line 1385
    .local v0, "e":Ljava/lang/Exception;
    if-eqz p1, :cond_1

    .line 1390
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V

    .line 1394
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
