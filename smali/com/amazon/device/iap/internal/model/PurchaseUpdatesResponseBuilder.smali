.class public Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
.super Ljava/lang/Object;
.source "PurchaseUpdatesResponseBuilder.java"


# instance fields
.field private hasMore:Z

.field private receipts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/amazon/device/iap/model/Receipt;",
            ">;"
        }
    .end annotation
.end field

.field private requestId:Lcom/amazon/device/iap/model/RequestId;

.field private requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

.field private userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    .locals 1

    .prologue
    .line 39
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;-><init>(Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;)V

    return-object v0
.end method

.method public getReceipts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/amazon/device/iap/model/Receipt;",
            ">;"
        }
    .end annotation

    .prologue
    .line 25
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->receipts:Ljava/util/List;

    return-object v0
.end method

.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;

    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;

    return-object v0
.end method

.method public hasMore()Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->hasMore:Z

    return v0
.end method

.method public setHasMore(Z)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    .locals 0

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->hasMore:Z

    .line 64
    return-object p0
.end method

.method public setReceipts(Ljava/util/List;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/amazon/device/iap/model/Receipt;",
            ">;)",
            "Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;"
        }
    .end annotation

    .prologue
    .line 58
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->receipts:Ljava/util/List;

    .line 59
    return-object p0
.end method

.method public setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 44
    return-object p0
.end method

.method public setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    .line 49
    return-object p0
.end method

.method public setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 54
    return-object p0
.end method
