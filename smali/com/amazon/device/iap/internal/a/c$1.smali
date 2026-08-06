.class Lcom/amazon/device/iap/internal/a/c$1;
.super Ljava/lang/Object;
.source "SandboxRequestHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/device/iap/internal/a/c;->a(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/amazon/device/iap/PurchasingListener;

.field final synthetic c:Lcom/amazon/device/iap/internal/a/c;


# direct methods
.method constructor <init>(Lcom/amazon/device/iap/internal/a/c;Ljava/lang/Object;Lcom/amazon/device/iap/PurchasingListener;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/amazon/device/iap/internal/a/c$1;->c:Lcom/amazon/device/iap/internal/a/c;

    iput-object p2, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/amazon/device/iap/internal/a/c$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 235
    :try_start_0
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/ProductDataResponse;

    if-eqz v0, :cond_0

    .line 236
    iget-object v1, p0, Lcom/amazon/device/iap/internal/a/c$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/ProductDataResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onProductDataResponse(Lcom/amazon/device/iap/model/ProductDataResponse;)V

    .line 249
    :goto_0
    return-void

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/UserDataResponse;

    if-eqz v0, :cond_1

    .line 238
    iget-object v1, p0, Lcom/amazon/device/iap/internal/a/c$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/UserDataResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onUserDataResponse(Lcom/amazon/device/iap/model/UserDataResponse;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 246
    :catch_0
    move-exception v0

    .line 247
    invoke-static {}, Lcom/amazon/device/iap/internal/a/c;->a()Ljava/lang/String;

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

    goto :goto_0

    .line 239
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    if-eqz v0, :cond_2

    .line 240
    iget-object v1, p0, Lcom/amazon/device/iap/internal/a/c$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onPurchaseUpdatesResponse(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V

    goto :goto_0

    .line 241
    :cond_2
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    if-eqz v0, :cond_3

    .line 242
    iget-object v1, p0, Lcom/amazon/device/iap/internal/a/c$1;->b:Lcom/amazon/device/iap/PurchasingListener;

    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onPurchaseResponse(Lcom/amazon/device/iap/model/PurchaseResponse;)V

    goto :goto_0

    .line 244
    :cond_3
    invoke-static {}, Lcom/amazon/device/iap/internal/a/c;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown response type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/amazon/device/iap/internal/a/c$1;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
