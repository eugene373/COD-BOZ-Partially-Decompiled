.class public final Lcom/amazon/device/iap/internal/b/c;
.super Ljava/lang/Object;
.source "KiwiRequestHandler.java"

# interfaces
.implements Lcom/amazon/device/iap/internal/c;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/amazon/device/iap/internal/b/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 64
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "handleResponse"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "response_type"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "Invalid response type: null"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    sget-object v1, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Found response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v1, "purchase_response"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const-string v0, "requestId"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/amazon/device/iap/internal/b/a/d;

    invoke-static {v0}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/amazon/device/iap/internal/b/a/d;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/a/d;->e()V

    goto :goto_0
.end method

.method public a(Lcom/amazon/device/iap/model/RequestId;)V
    .locals 2

    .prologue
    .line 31
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "sendGetUserData"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/amazon/device/iap/internal/b/e/a;

    invoke-direct {v0, p1}, Lcom/amazon/device/iap/internal/b/e/a;-><init>(Lcom/amazon/device/iap/model/RequestId;)V

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e/a;->e()V

    .line 33
    return-void
.end method

.method public a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 37
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "sendPurchaseRequest"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/amazon/device/iap/internal/b/b/d;

    invoke-direct {v0, p1, p2}, Lcom/amazon/device/iap/internal/b/b/d;-><init>(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/b/d;->e()V

    .line 40
    return-void
.end method

.method public a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
    .locals 2

    .prologue
    .line 58
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "sendNotifyFulfillment"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    new-instance v0, Lcom/amazon/device/iap/internal/b/g/b;

    invoke-direct {v0, p1, p2, p3}, Lcom/amazon/device/iap/internal/b/g/b;-><init>(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/g/b;->e()V

    .line 60
    return-void
.end method

.method public a(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V
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
    .line 44
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "sendGetProductDataRequest"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    new-instance v0, Lcom/amazon/device/iap/internal/b/c/d;

    invoke-direct {v0, p1, p2}, Lcom/amazon/device/iap/internal/b/c/d;-><init>(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/c/d;->e()V

    .line 46
    return-void
.end method

.method public a(Lcom/amazon/device/iap/model/RequestId;Z)V
    .locals 2

    .prologue
    .line 50
    sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;

    const-string v1, "sendGetPurchaseUpdates"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    new-instance v0, Lcom/amazon/device/iap/internal/b/d/a;

    invoke-direct {v0, p1, p2}, Lcom/amazon/device/iap/internal/b/d/a;-><init>(Lcom/amazon/device/iap/model/RequestId;Z)V

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/d/a;->e()V

    .line 52
    return-void
.end method
