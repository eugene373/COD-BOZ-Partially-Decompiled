.class public final Lcom/amazon/device/iap/internal/b/c/d;
.super Lcom/amazon/device/iap/internal/b/e;
.source "GetProductDataRequest.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amazon/device/iap/model/RequestId;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/b/e;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    .line 16
    new-instance v0, Lcom/amazon/device/iap/internal/b/c/a;

    invoke-direct {v0, p0, p2}, Lcom/amazon/device/iap/internal/b/c/a;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/util/Set;)V

    .line 17
    new-instance v1, Lcom/amazon/device/iap/internal/b/c/b;

    invoke-direct {v1, p0, p2}, Lcom/amazon/device/iap/internal/b/c/b;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V

    .line 18
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/c/d;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 19
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/c/d;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/ProductDataResponse;

    .line 24
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/c/d;->a(Ljava/lang/Object;)V

    .line 25
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/c/d;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/ProductDataResponse;

    .line 30
    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/c/d;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;

    move-result-object v0

    sget-object v1, Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/ProductDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/ProductDataResponseBuilder;->build()Lcom/amazon/device/iap/model/ProductDataResponse;

    move-result-object v0

    .line 36
    :cond_0
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/c/d;->a(Ljava/lang/Object;)V

    .line 37
    return-void
.end method
