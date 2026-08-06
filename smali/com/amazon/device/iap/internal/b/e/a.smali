.class public final Lcom/amazon/device/iap/internal/b/e/a;
.super Lcom/amazon/device/iap/internal/b/e;
.source "GetUserDataRequest.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/model/RequestId;)V
    .locals 2

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/amazon/device/iap/internal/b/e;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    .line 15
    new-instance v0, Lcom/amazon/device/iap/internal/b/e/c;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/internal/b/e/c;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    .line 16
    new-instance v1, Lcom/amazon/device/iap/internal/b/e/d;

    invoke-direct {v1, p0}, Lcom/amazon/device/iap/internal/b/e/d;-><init>(Lcom/amazon/device/iap/internal/b/e;)V

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->b(Lcom/amazon/device/iap/internal/b/i;)V

    .line 17
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/e/a;->a(Lcom/amazon/device/iap/internal/b/i;)V

    .line 18
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/e/a;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/UserDataResponse;

    .line 23
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/e/a;->a(Ljava/lang/Object;)V

    .line 24
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/e/a;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/UserDataResponse;

    .line 29
    if-nez v0, :cond_0

    .line 30
    new-instance v0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/e/a;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;

    move-result-object v0

    sget-object v1, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->build()Lcom/amazon/device/iap/model/UserDataResponse;

    move-result-object v0

    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Lcom/amazon/device/iap/internal/b/e/a;->a(Ljava/lang/Object;)V

    .line 36
    return-void
.end method
