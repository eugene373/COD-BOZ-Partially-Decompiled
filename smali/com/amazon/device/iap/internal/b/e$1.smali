.class Lcom/amazon/device/iap/internal/b/e$1;
.super Ljava/lang/Object;
.source "KiwiRequest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/device/iap/internal/b/e;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/amazon/device/iap/PurchasingListener;

.field final synthetic c:Lcom/amazon/device/iap/internal/b/i;

.field final synthetic d:Lcom/amazon/device/iap/internal/b/e;


# direct methods
.method constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/Object;Lcom/amazon/device/iap/PurchasingListener;Lcom/amazon/device/iap/internal/b/i;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;

    iput-object p2, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iput-object p4, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 52
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    const-string v1, "notifyListenerResult"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/ProductDataResponse;

    if-eqz v0, :cond_2

    .line 55
    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/ProductDataResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onProductDataResponse(Lcom/amazon/device/iap/model/ProductDataResponse;)V

    .line 71
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v0

    const-string v1, "notifyListenerResult"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_1
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Z)Lcom/amazon/device/iap/internal/b/i;

    .line 77
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V

    .line 80
    :cond_1
    return-void

    .line 56
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/UserDataResponse;

    if-eqz v0, :cond_3

    .line 57
    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/UserDataResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onUserDataResponse(Lcom/amazon/device/iap/model/UserDataResponse;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 72
    :catch_0
    move-exception v0

    .line 73
    invoke-static {}, Lcom/amazon/device/iap/internal/b/e;->f()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error in sendResponse: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 58
    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    if-eqz v0, :cond_4

    .line 59
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    .line 60
    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onPurchaseUpdatesResponse(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V

    .line 61
    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;

    move-result-object v1

    const-string v2, "newCursor"

    invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 62
    if-eqz v1, :cond_0

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 63
    invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    if-eqz v0, :cond_5

    .line 67
    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onPurchaseResponse(Lcom/amazon/device/iap/model/PurchaseResponse;)V

    goto/16 :goto_0

    .line 69
    :cond_5
    invoke-static {}, Lcom/amazon/device/iap/internal/b/e;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown response type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0
.end method
