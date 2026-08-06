.class abstract Lcom/amazon/device/iap/internal/b/d/b;
.super Lcom/amazon/device/iap/internal/b/i;
.source "PurchaseUpdatesCommandBase.java"


# instance fields
.field protected final a:Z


# direct methods
.method constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 20
    const-string v0, "purchase_updates"

    invoke-direct {p0, p1, v0, p2}, Lcom/amazon/device/iap/internal/b/i;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iput-boolean p3, p0, Lcom/amazon/device/iap/internal/b/d/b;->a:Z

    .line 23
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
    .line 27
    invoke-super {p0}, Lcom/amazon/device/iap/internal/b/i;->preExecution()V

    .line 29
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/d/b;->b()Lcom/amazon/device/iap/internal/b/e;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 31
    iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/d/b;->a:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 32
    :goto_0
    const-string v1, "cursor"

    invoke-virtual {p0, v1, v0}, Lcom/amazon/device/iap/internal/b/d/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    return-void

    .line 31
    :cond_0
    invoke-static {v0}, Lcom/amazon/device/iap/internal/util/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
