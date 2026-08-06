.class public final Lcom/amazon/device/iap/internal/b/a/d;
.super Lcom/amazon/device/iap/internal/b/e;
.source "PurchaseResponseRequest.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/model/RequestId;)V
    .locals 2

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/b/e;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    .line 18
    new-instance v0, Lcom/amazon/device/iap/internal/b/a/a;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/internal/b/a/a;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    .line 19
    new-instance v1, Lcom/amazon/device/iap/internal/b/a/b;

    invoke-direct {v1, p0}, Lcom/amazon/device/iap/internal/b/a/b;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V

    .line 20
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/a/d;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 21
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    .line 26
    if-nez v0, :cond_0

    .line 46
    :goto_0
    return-void

    .line 30
    :cond_0
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseResponse;->getReceipt()Lcom/amazon/device/iap/model/Receipt;

    move-result-object v2

    .line 31
    if-eqz v2, :cond_3

    const/4 v1, 0x1

    .line 32
    :goto_1
    new-instance v3, Lcom/amazon/device/iap/internal/b/f/c;

    invoke-direct {v3, p0, v1}, Lcom/amazon/device/iap/internal/b/f/c;-><init>(Lcom/amazon/device/iap/internal/b/e;Z)V

    .line 41
    if-eqz v1, :cond_2

    sget-object v1, Lcom/amazon/device/iap/model/ProductType;->ENTITLED:Lcom/amazon/device/iap/model/ProductType;

    invoke-virtual {v2}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;

    move-result-object v4

    if-eq v1, v4, :cond_1

    sget-object v1, Lcom/amazon/device/iap/model/ProductType;->SUBSCRIPTION:Lcom/amazon/device/iap/model/ProductType;

    invoke-virtual {v2}, Lcom/amazon/device/iap/model/Receipt;->getProductType()Lcom/amazon/device/iap/model/ProductType;

    move-result-object v2

    if-ne v1, v2, :cond_2

    .line 43
    :cond_1
    new-instance v1, Lcom/amazon/device/iap/internal/b/f/b;

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazon/device/iap/model/RequestId;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/amazon/device/iap/internal/b/f/b;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V

    .line 45
    :cond_2
    invoke-virtual {p0, v0, v3}, Lcom/amazon/device/iap/internal/b/a/d;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V

    goto :goto_0

    .line 31
    :cond_3
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public b()V
    .locals 3

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    .line 51
    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/a/d;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;

    move-result-object v0

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseResponse;

    move-result-object v0

    .line 57
    :cond_0
    new-instance v1, Lcom/amazon/device/iap/internal/b/f/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/amazon/device/iap/internal/b/f/c;-><init>(Lcom/amazon/device/iap/internal/b/e;Z)V

    .line 58
    invoke-virtual {p0, v0, v1}, Lcom/amazon/device/iap/internal/b/a/d;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V

    .line 59
    return-void
.end method
