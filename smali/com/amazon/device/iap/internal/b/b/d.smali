.class public final Lcom/amazon/device/iap/internal/b/b/d;
.super Lcom/amazon/device/iap/internal/b/e;
.source "PurchaseRequest.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/b/e;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    .line 14
    new-instance v0, Lcom/amazon/device/iap/internal/b/b/c;

    invoke-direct {v0, p0, p2}, Lcom/amazon/device/iap/internal/b/b/c;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V

    .line 15
    new-instance v1, Lcom/amazon/device/iap/internal/b/b/b;

    invoke-direct {v1, p0, p2}, Lcom/amazon/device/iap/internal/b/b/b;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V

    .line 16
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/b/d;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 17
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 21
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/d;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    .line 26
    if-nez v0, :cond_0

    .line 27
    new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/d;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;

    move-result-object v0

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseResponse;

    move-result-object v0

    .line 32
    :cond_0
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/b/d;->a(Ljava/lang/Object;)V

    .line 33
    return-void
.end method
