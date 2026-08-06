.class public final Lcom/amazon/device/iap/internal/b/d/a;
.super Lcom/amazon/device/iap/internal/b/e;
.source "GetPurchaseUpdatesRequest.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/model/RequestId;Z)V
    .locals 3

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/b/e;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    .line 23
    new-instance v0, Lcom/amazon/device/iap/internal/b/e/c;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/internal/b/e/c;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    .line 24
    new-instance v1, Lcom/amazon/device/iap/internal/b/d/c;

    invoke-direct {v1, p0, p2}, Lcom/amazon/device/iap/internal/b/d/c;-><init>(Lcom/amazon/device/iap/internal/b/e;Z)V

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 26
    new-instance v1, Lcom/amazon/device/iap/internal/b/e/d;

    invoke-direct {v1, p0}, Lcom/amazon/device/iap/internal/b/e/d;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    .line 27
    new-instance v2, Lcom/amazon/device/iap/internal/b/d/d;

    invoke-direct {v2, p0}, Lcom/amazon/device/iap/internal/b/d/d;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 28
    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V

    .line 30
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/d/a;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 31
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/a;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    .line 37
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 38
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 39
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getReceipts()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazon/device/iap/model/Receipt;

    .line 40
    invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 41
    invoke-virtual {v1}, Lcom/amazon/device/iap/model/Receipt;->getReceiptId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, Lcom/amazon/device/iap/internal/b/g/a;

    sget-object v3, Lcom/amazon/device/iap/internal/model/a;->a:Lcom/amazon/device/iap/internal/model/a;

    invoke-virtual {v3}, Lcom/amazon/device/iap/internal/model/a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Lcom/amazon/device/iap/internal/b/g/a;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/util/Set;Ljava/lang/String;)V

    .line 48
    :cond_2
    invoke-virtual {p0, v0, v1}, Lcom/amazon/device/iap/internal/b/d/a;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V

    .line 49
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/a;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    .line 55
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    if-nez v1, :cond_1

    .line 56
    :cond_0
    new-instance v0, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/a;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;

    move-result-object v0

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/PurchaseUpdatesResponseBuilder;->build()Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    move-result-object v0

    .line 63
    :goto_0
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/d/a;->a(Ljava/lang/Object;)V

    .line 64
    return-void

    .line 61
    :cond_1
    check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    goto :goto_0
.end method
