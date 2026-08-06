.class public final Lcom/amazon/device/iap/internal/b/f/b;
.super Lcom/amazon/device/iap/internal/b/f/a;
.source "ResponseReceivedCommandV1.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 19
    const-string v0, "1.0"

    invoke-direct {p0, p1, v0}, Lcom/amazon/device/iap/internal/b/f/a;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/f/b;->getCommandData()Ljava/util/Map;

    move-result-object v0

    const-string v1, "requestId"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    return-void
.end method
