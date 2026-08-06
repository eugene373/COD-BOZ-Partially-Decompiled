.class Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;
.super Landroid/os/AsyncTask;
.source "s3eAmazonInAppPurchasingObserver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "UserDataAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Lcom/amazon/device/iap/model/UserDataResponse;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;


# direct methods
.method private constructor <init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$1;)V
    .locals 0

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;-><init>(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/amazon/device/iap/model/UserDataResponse;)Ljava/lang/Boolean;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 157
    aget-object v0, p1, v3

    .line 159
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserDataResponse;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    move-result-object v1

    sget-object v2, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    if-ne v1, v2, :cond_0

    .line 161
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserDataResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;

    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->this$0:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;->access$400(Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;->setCurrentUser(Ljava/lang/String;)V

    .line 165
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 169
    :goto_0
    return-object v0

    .line 168
    :cond_0
    const-string v0, "Amazon-IAP"

    const-string v1, "onUserDataResponse: Unable to get user ID."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 152
    check-cast p1, [Lcom/amazon/device/iap/model/UserDataResponse;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasingObserver$UserDataAsyncTask;->doInBackground([Lcom/amazon/device/iap/model/UserDataResponse;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
