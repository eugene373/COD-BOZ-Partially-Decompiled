.class public Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
.super Ljava/lang/Object;
.source "s3eAmazonInAppPurchasingObserver.java"

# interfaces
.implements Lcom/amazon/device/iap/PurchasingListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;,
        Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;,
        Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;,
        Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;,
        Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;
    }
.end annotation


# static fields
.field private static final START_DATE:Ljava/lang/String; = "startDate"

.field private static final TAG:Ljava/lang/String; = "Amazon-IAP"


# instance fields
.field private final baseActivity:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->baseActivity:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;

    .line 66
    return-void
.end method

.method static synthetic access$1000(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
    .locals 0

    .prologue
    .line 44
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->native_entitledCallback(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V

    return-void
.end method

.method static synthetic access$1100()V
    .locals 0

    .prologue
    .line 44
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->native_entitledFinishedCallback()V

    return-void
.end method

.method static synthetic access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->baseActivity:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;

    return-object v0
.end method

.method static synthetic access$500(Lcom/amazon/device/iap/model/Product;)V
    .locals 0

    .prologue
    .line 44
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->native_itemDataCallback(Lcom/amazon/device/iap/model/Product;)V

    return-void
.end method

.method static synthetic access$600()V
    .locals 0

    .prologue
    .line 44
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->native_itemDataFinishedCallback()V

    return-void
.end method

.method static synthetic access$700(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
    .locals 0

    .prologue
    .line 44
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->native_purchaseCallback(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V

    return-void
.end method

.method static synthetic access$800(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$900(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->native_revokedCallback(Ljava/lang/String;)V

    return-void
.end method

.method private getSharedPreferencesEditor()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .prologue
    .line 145
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->getSharedPreferencesForCurrentUser()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method private getSharedPreferencesForCurrentUser()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->baseActivity:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->getSharedPreferencesForCurrentUser()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 140
    return-object v0
.end method

.method private static native native_entitledCallback(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
.end method

.method private static native native_entitledFinishedCallback()V
.end method

.method private static native native_itemDataCallback(Lcom/amazon/device/iap/model/Product;)V
.end method

.method private static native native_itemDataFinishedCallback()V
.end method

.method private static native native_purchaseCallback(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;)V
.end method

.method private static native native_revokedCallback(Ljava/lang/String;)V
.end method

.method private static native native_unavailableSkuCallback(Ljava/lang/String;)V
.end method


# virtual methods
.method public onProductDataResponse(Lcom/amazon/device/iap/model/ProductDataResponse;)V
    .locals 3

    .prologue
    .line 97
    const-string v0, "Amazon-IAP"

    const-string v1, "onProductDataResponse received"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "productDataRequestStatus "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/ProductDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "productDataRequestId "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/ProductDataResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/amazon/device/iap/model/ProductDataResponse;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 101
    return-void
.end method

.method public onPurchaseResponse(Lcom/amazon/device/iap/model/PurchaseResponse;)V
    .locals 3

    .prologue
    .line 114
    const-string v0, "Amazon-IAP"

    const-string v1, "onPurchaseResponse received"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PurchaseRequestStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/PurchaseResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/amazon/device/iap/model/PurchaseResponse;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 117
    return-void
.end method

.method public onPurchaseUpdatesResponse(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V
    .locals 3

    .prologue
    .line 131
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPurchaseUpdatesRecived received: Response -"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PurchaseUpdatesRequestStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RequestID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$PurchaseUpdatesAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 135
    return-void
.end method

.method public onUserDataResponse(Lcom/amazon/device/iap/model/UserDataResponse;)V
    .locals 3

    .prologue
    .line 79
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUserDataResponse received: Response - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RequestId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    const-string v0, "Amazon-IAP"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IdRequestStatus: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/amazon/device/iap/model/UserDataResponse;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 83
    return-void
.end method
