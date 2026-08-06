.class public final Lcom/amazon/device/iap/internal/b/b/b;
.super Lcom/amazon/device/iap/internal/b/b/a;
.source "PurchaseItemCommandV1.java"


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 16
    const-string v0, "1.0"

    invoke-direct {p0, p1, v0, p2}, Lcom/amazon/device/iap/internal/b/b/a;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected preExecution()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/amazon/android/framework/exception/KiwiException;
        }
    .end annotation

    .prologue
    .line 21
    invoke-super {p0}, Lcom/amazon/device/iap/internal/b/b/a;->preExecution()V

    .line 22
    invoke-static {}, Lcom/amazon/device/iap/internal/c/b;->a()Lcom/amazon/device/iap/internal/c/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/c/b;->b(Ljava/lang/String;)V

    .line 23
    return-void
.end method
