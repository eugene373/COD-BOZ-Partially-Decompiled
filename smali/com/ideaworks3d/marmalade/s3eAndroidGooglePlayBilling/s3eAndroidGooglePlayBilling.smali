.class Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;
.super Ljava/lang/Object;
.source "s3eAndroidGooglePlayBilling.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;,
        Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "s3eAndroidGooglePlayBilling"

.field public static mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

.field public static final mPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

.field public static m_SendRequest:Z


# instance fields
.field mConsumeFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;

.field mGotInventoryListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;

.field mGotSkusListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;

.field private s3eAndroidGooglePlayBillingAvailable:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    sput-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z

    .line 103
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$2;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$2;-><init>()V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    .line 167
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$3;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$3;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mGotSkusListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;

    .line 193
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$4;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$4;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mGotInventoryListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;

    .line 223
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$5;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$5;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mConsumeFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;

    .line 270
    return-void
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    return v0
.end method

.method static synthetic access$002(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;Z)Z
    .locals 0

    .prologue
    .line 36
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    return p1
.end method

.method static synthetic access$100(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    .locals 0

    .prologue
    .line 36
    invoke-static {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_PURCHASE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V

    return-void
.end method

.method static synthetic access$200(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    .locals 0

    .prologue
    .line 36
    invoke-static {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_LIST_PRODUCTS_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    return-void
.end method

.method static synthetic access$300(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    .locals 0

    .prologue
    .line 36
    invoke-static {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_RESTORE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    return-void
.end method

.method static synthetic access$400(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V
    .locals 0

    .prologue
    .line 36
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_CONSUME_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V

    return-void
.end method

.method public static native native_CONSUME_CALLBACK(ILjava/lang/String;)V
.end method

.method public static native native_LIST_PRODUCTS_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;)V
.end method

.method public static native native_PURCHASE_CALLBACK(ILjava/lang/String;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
.end method

.method public static native native_RESTORE_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
.end method

.method private static safe_native_CONSUME_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V
    .locals 3

    .prologue
    .line 358
    :try_start_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v0

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_CONSUME_CALLBACK(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 365
    :goto_0
    return-void

    .line 361
    :catch_0
    move-exception v0

    .line 363
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No native handlers installed for native_LIST_PRODUCTS_CALLBACK, we received "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static safe_native_LIST_PRODUCTS_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    .locals 5

    .prologue
    .line 314
    if-eqz p1, :cond_1

    .line 316
    :try_start_0
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;->getAllSkus()Ljava/util/List;

    move-result-object v2

    .line 317
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;

    .line 318
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 319
    new-instance v4, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;

    invoke-direct {v4, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;)V

    aput-object v4, v3, v1

    .line 318
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 320
    :cond_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v0

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_LIST_PRODUCTS_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;)V

    .line 329
    :goto_1
    return-void

    .line 323
    :cond_1
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v0

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_LIST_PRODUCTS_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 325
    :catch_0
    move-exception v0

    .line 327
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No native handlers installed for native_LIST_PRODUCTS_CALLBACK, we received "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private static safe_native_PURCHASE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    .locals 3

    .prologue
    .line 298
    const/4 v0, 0x0

    .line 299
    if-eqz p1, :cond_0

    .line 300
    :try_start_0
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;

    invoke-direct {v0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V

    .line 301
    :cond_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_PURCHASE_CALLBACK(ILjava/lang/String;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    :goto_0
    return-void

    .line 303
    :catch_0
    move-exception v0

    .line 305
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No native handlers installed for safe_native_PURCHASE_CALLBACK, we received "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static safe_native_RESTORE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    .locals 5

    .prologue
    .line 336
    if-eqz p1, :cond_1

    .line 338
    :try_start_0
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;->getAllPurchases()Ljava/util/List;

    move-result-object v2

    .line 339
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;

    .line 340
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 341
    new-instance v4, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;

    invoke-direct {v4, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V

    aput-object v4, v3, v1

    .line 340
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 342
    :cond_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v0

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_RESTORE_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V

    .line 351
    :goto_1
    return-void

    .line 345
    :cond_1
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v0

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->native_RESTORE_CALLBACK(ILjava/lang/String;[Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 347
    :catch_0
    move-exception v0

    .line 349
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No native handlers installed for native_LIST_PRODUCTS_CALLBACK, we received "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getResponse()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method


# virtual methods
.method public s3eAndroidGooglePlayBillingConsumeItem(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 210
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eAndroidGooglePlayBillingConsumeItem called for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    if-nez v0, :cond_0

    .line 212
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    const/4 v1, 0x3

    const-string v2, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 213
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_CONSUME_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V

    .line 220
    :goto_0
    return-void

    .line 217
    :cond_0
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;

    invoke-direct {v0, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;-><init>(Ljava/lang/String;)V

    .line 219
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mConsumeFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;

    invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->consumeAsync(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;)V

    goto :goto_0
.end method

.method public s3eAndroidGooglePlayBillingIsSupported()I
    .locals 1

    .prologue
    .line 99
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public s3eAndroidGooglePlayBillingRequestProductInformation([Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 146
    const-string v1, "s3eAndroidGooglePlayBilling"

    const-string v2, "s3eAndroidGooglePlayBillingRequestProductInformation called for:"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    if-eqz p1, :cond_0

    .line 148
    const-string v1, "s3eAndroidGooglePlayBilling"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inApp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    :cond_0
    if-eqz p2, :cond_1

    .line 150
    const-string v1, "s3eAndroidGooglePlayBilling"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "subs: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    :cond_1
    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    if-nez v1, :cond_2

    .line 152
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    const/4 v2, 0x3

    const-string v3, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"

    invoke-direct {v1, v2, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 153
    invoke-static {v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_LIST_PRODUCTS_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    .line 164
    :goto_0
    return-void

    .line 158
    :cond_2
    if-eqz p1, :cond_4

    .line 159
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 160
    :goto_1
    if-eqz p2, :cond_3

    .line 161
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 163
    :cond_3
    sget-object v2, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mGotSkusListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;

    invoke-virtual {v2, v1, v0, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->querySkusAsync(Ljava/util/List;Ljava/util/List;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;)V

    goto :goto_0

    :cond_4
    move-object v1, v0

    goto :goto_1
.end method

.method public s3eAndroidGooglePlayBillingRequestPurchase(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 122
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eAndroidGooglePlayBillingRequestPurchase called for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    if-nez v0, :cond_0

    .line 124
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    const/4 v1, 0x3

    const-string v2, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 125
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_PURCHASE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V

    .line 137
    :goto_0
    return-void

    .line 128
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z

    .line 129
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v1

    const-class v2, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    const-string v1, "productID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    const-string v1, "inApp"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 132
    const-string v1, "developerPayLoad"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 136
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public s3eAndroidGooglePlayBillingRestoreTransactions()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 182
    const-string v0, "s3eAndroidGooglePlayBilling"

    const-string v1, "s3eAndroidGooglePlayBillingRestoreTransactions called."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    if-nez v0, :cond_0

    .line 184
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    const/4 v1, 0x3

    const-string v2, "Android Market Billing is not available, did you call s3eAndroidGooglePlayBillingStart?"

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 185
    invoke-static {v0, v3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->safe_native_RESTORE_CALLBACK(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    .line 190
    :goto_0
    return-void

    .line 189
    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mGotInventoryListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;

    invoke-virtual {v0, v1, v3, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;)V

    goto :goto_0
.end method

.method public s3eAndroidGooglePlayBillingStart(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 47
    const-string v1, "s3eAndroidGooglePlayBilling"

    const-string v2, "s3eAndroidGooglePlayBillingStart called."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    if-nez p1, :cond_0

    .line 50
    const-string v1, "s3eAndroidGooglePlayBilling"

    const-string v2, "ERROR: No public key sent."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    :goto_0
    return v0

    .line 55
    :cond_0
    const-string v1, "s3eAndroidGooglePlayBilling"

    const-string v2, "Creating IAB helper."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    .line 57
    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->enableDebugLogging(Z)V

    .line 60
    const-string v0, "s3eAndroidGooglePlayBilling"

    const-string v1, "Starting setup."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$1;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)V

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->startSetup(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabSetupFinishedListener;)V

    .line 77
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public s3eAndroidGooglePlayBillingStop()V
    .locals 2

    .prologue
    .line 83
    const-string v0, "s3eAndroidGooglePlayBilling"

    const-string v1, "s3eAndroidGooglePlayBillingStop called."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    if-eqz v0, :cond_0

    .line 86
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->dispose()V

    .line 92
    :goto_0
    const/4 v0, 0x0

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->s3eAndroidGooglePlayBillingAvailable:Z

    .line 94
    return-void

    .line 90
    :cond_0
    const-string v0, "s3eAndroidGooglePlayBilling"

    const-string v1, "s3eAndroidGooglePlayBillingStop called without having been successfully started."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
