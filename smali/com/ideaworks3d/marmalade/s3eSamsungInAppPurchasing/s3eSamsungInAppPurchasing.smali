.class Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;
.super Ljava/lang/Object;
.source "s3eSamsungInAppPurchasing.java"

# interfaces
.implements Lcom/sec/android/iap/lib/listener/OnPaymentListener;
.implements Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
.implements Lcom/sec/android/iap/lib/listener/OnGetItemListener;


# static fields
.field private static S3E_SAMSUNGINAPPPURCHASING_RESULT_ERROR:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_RESULT_OK:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_CANCELLED:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORALREADYPURCHASED:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORINITIALIZATION:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORNEEDAPPUPGRADE:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORWHILERUNNING:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_FINISHED:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_PRODUCTDOESNOTEXIST:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_STATUS_SUCCESSFUL:I = 0x0

.field private static S3E_SAMSUNGINAPPPURCHASING_UNAVAILABLE:I = 0x0

.field public static final TAG:Ljava/lang/String; = "s3eSamsunInAppPurchasing"

.field private static mGroupID:Ljava/lang/String;

.field private static mMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 74
    sput v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_RESULT_OK:I

    .line 75
    const/4 v0, -0x1

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_RESULT_ERROR:I

    .line 76
    const/4 v0, -0x2

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_UNAVAILABLE:I

    .line 78
    sput v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_SUCCESSFUL:I

    .line 79
    const/4 v0, 0x1

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_CANCELLED:I

    .line 80
    const/4 v0, 0x2

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORINITIALIZATION:I

    .line 81
    const/4 v0, 0x3

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORNEEDAPPUPGRADE:I

    .line 82
    const/4 v0, 0x4

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORALREADYPURCHASED:I

    .line 83
    const/4 v0, 0x5

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORWHILERUNNING:I

    .line 84
    const/4 v0, 0x6

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PRODUCTDOESNOTEXIST:I

    .line 85
    const/4 v0, 0x7

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR:I

    .line 86
    const/16 v0, 0x8

    sput v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_FINISHED:I

    .line 97
    sput v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V
.end method

.method private static native native_itemDataCallback(ILcom/sec/android/iap/lib/vo/ItemVo;)V
.end method

.method private static native native_purchaseFinishedCallback(ILcom/sec/android/iap/lib/vo/PurchaseVo;)V
.end method

.method private static native native_sdkAvailableCallback()V
.end method

.method private static s3eGetStatus(I)I
    .locals 1

    .prologue
    .line 102
    sparse-switch p0, :sswitch_data_0

    .line 129
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR:I

    :goto_0
    return v0

    .line 105
    :sswitch_0
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_SUCCESSFUL:I

    goto :goto_0

    .line 108
    :sswitch_1
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_CANCELLED:I

    goto :goto_0

    .line 111
    :sswitch_2
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORINITIALIZATION:I

    goto :goto_0

    .line 114
    :sswitch_3
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORNEEDAPPUPGRADE:I

    goto :goto_0

    .line 117
    :sswitch_4
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR:I

    goto :goto_0

    .line 120
    :sswitch_5
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORALREADYPURCHASED:I

    goto :goto_0

    .line 123
    :sswitch_6
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORWHILERUNNING:I

    goto :goto_0

    .line 126
    :sswitch_7
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PRODUCTDOESNOTEXIST:I

    goto :goto_0

    .line 102
    :sswitch_data_0
    .sparse-switch
        -0x3ed -> :sswitch_7
        -0x3ec -> :sswitch_6
        -0x3eb -> :sswitch_5
        -0x3ea -> :sswitch_4
        -0x3e9 -> :sswitch_3
        -0x3e8 -> :sswitch_2
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public getActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 136
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 141
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public onGetItem(Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sec/android/iap/lib/vo/ErrorVo;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/ItemVo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 202
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "onGetItem..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    .line 204
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->s3eGetStatus(I)I

    move-result v2

    .line 206
    if-nez v0, :cond_0

    .line 208
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 210
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sec/android/iap/lib/vo/ItemVo;

    .line 213
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->printItemInfo(Lcom/sec/android/iap/lib/vo/BaseVo;)V

    .line 214
    invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_itemDataCallback(ILcom/sec/android/iap/lib/vo/ItemVo;)V

    .line 208
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 219
    :cond_0
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_itemDataCallback(ILcom/sec/android/iap/lib/vo/ItemVo;)V

    .line 220
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "Failed to retrieve the item list"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    :cond_1
    return-void
.end method

.method public onGetItemInbox(Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sec/android/iap/lib/vo/ErrorVo;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/InboxVo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 227
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "onGetItemInbox..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    .line 229
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->s3eGetStatus(I)I

    move-result v2

    .line 231
    if-nez v0, :cond_1

    .line 233
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 235
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sec/android/iap/lib/vo/InboxVo;

    .line 238
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->printPurchasedItemInfo(Lcom/sec/android/iap/lib/vo/InboxVo;)V

    .line 239
    invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V

    .line 233
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 241
    :cond_0
    sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_FINISHED:I

    invoke-static {v0, v3}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V

    .line 247
    :goto_1
    return-void

    .line 245
    :cond_1
    invoke-static {v2, v3}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V

    goto :goto_1
.end method

.method public onPayment(Lcom/sec/android/iap/lib/vo/ErrorVo;Lcom/sec/android/iap/lib/vo/PurchaseVo;)V
    .locals 2

    .prologue
    .line 251
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "onPayment... "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    .line 254
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->s3eGetStatus(I)I

    move-result v0

    invoke-static {v0, p2}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_purchaseFinishedCallback(ILcom/sec/android/iap/lib/vo/PurchaseVo;)V

    .line 255
    return-void
.end method

.method public printItemInfo(Lcom/sec/android/iap/lib/vo/BaseVo;)V
    .locals 3

    .prologue
    .line 262
    const-string v0, "s3eSamsunInAppPurchasing"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Item name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    const-string v0, "s3eSamsunInAppPurchasing"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Item Id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    const-string v0, "s3eSamsunInAppPurchasing"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Price: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemPriceString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    return-void
.end method

.method public printPurchasedItemInfo(Lcom/sec/android/iap/lib/vo/InboxVo;)V
    .locals 3

    .prologue
    .line 269
    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->printItemInfo(Lcom/sec/android/iap/lib/vo/BaseVo;)V

    .line 271
    const-string v0, "s3eSamsunInAppPurchasing"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Payment Id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/InboxVo;->getPaymentId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    const-string v0, "s3eSamsunInAppPurchasing"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Purchase Date: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/InboxVo;->getPurchaseDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    return-void
.end method

.method public s3eSamsungInAppPurchasingEnumerateEntitlements(II)I
    .locals 7

    .prologue
    .line 181
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 182
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 183
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    move-result-object v0

    .line 184
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;

    const-string v4, "20131031"

    move v2, p1

    move v3, p2

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemInboxList(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V

    .line 185
    const/4 v0, 0x0

    return v0
.end method

.method public s3eSamsungInAppPurchasingGetItemData(II)I
    .locals 7

    .prologue
    .line 174
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    move-result-object v0

    .line 175
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;

    const-string v4, "10"

    sget v5, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I

    move v2, p1

    move v3, p2

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemList(Ljava/lang/String;IILjava/lang/String;ILcom/sec/android/iap/lib/listener/OnGetItemListener;)V

    .line 176
    const/4 v0, 0x0

    return v0
.end method

.method public s3eSamsungInAppPurchasingInit(Ljava/lang/String;Z)I
    .locals 2

    .prologue
    .line 146
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "s3eSamsungInAppPurchasing... Initializing"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    sput-boolean p2, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mShowProgressDialog:Z

    .line 152
    sput-object p1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;

    .line 155
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/ResourceUtility;->mContext:Landroid/app/Activity;

    .line 157
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "s3eSamsungInAppPurchasing... Creating Plasma instance"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    const/4 v0, 0x0

    return v0
.end method

.method public s3eSamsungInAppPurchasingIsAvailable()Z
    .locals 1

    .prologue
    .line 169
    const/4 v0, 0x0

    return v0
.end method

.method public s3eSamsungInAppPurchasingPurchaseItem(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 190
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I

    invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    move-result-object v0

    .line 191
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startPayment(Ljava/lang/String;Ljava/lang/String;ZLcom/sec/android/iap/lib/listener/OnPaymentListener;)V

    .line 192
    return v2
.end method

.method public s3eSamsungInAppPurchasingSetDeveloperState(I)V
    .locals 0

    .prologue
    .line 197
    sput p1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I

    .line 198
    return-void
.end method

.method public s3eSamsungInAppPurchasingTerminate()V
    .locals 2

    .prologue
    .line 164
    const-string v0, "s3eSamsunInAppPurchasing"

    const-string v1, "s3eSamsungInAppPurchasingTerminate"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    return-void
.end method
