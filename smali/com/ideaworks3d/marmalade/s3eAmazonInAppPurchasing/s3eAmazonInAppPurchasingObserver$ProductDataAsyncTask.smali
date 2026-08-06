.class Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;
.super Landroid/os/AsyncTask;
.source "s3eAmazonInAppPurchasingObserver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ProductDataAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Lcom/amazon/device/iap/model/ProductDataResponse;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;


# direct methods
.method private constructor <init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V
    .locals 0

    .prologue
    .line 179
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 179
    check-cast p1, [Lcom/amazon/device/iap/model/ProductDataResponse;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$ProductDataAsyncTask;->doInBackground([Lcom/amazon/device/iap/model/ProductDataResponse;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Lcom/amazon/device/iap/model/ProductDataResponse;)Ljava/lang/Void;
    .locals 5

    .prologue
    .line 184
    const-string v0, "Amazon-IAP"

    const-string v1, "ProductDataAsyncTask:"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    const/4 v0, 0x0

    aget-object v0, p1, v0

    .line 188
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;

    move-result-object v1

    sget-object v2, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;

    if-ne v1, v2, :cond_1

    .line 191
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/ProductDataResponse;->getProductData()Ljava/util/Map;

    move-result-object v1

    .line 193
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 195
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/Product;

    .line 197
    const-string v3, "Amazon-IAP"

    const-string v4, "ProductDataAsyncTask: native_itemDataCallback"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$500(Lcom/amazon/device/iap/model/Product;)V

    goto :goto_0

    .line 203
    :cond_0
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$600()V

    .line 206
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
