.class abstract Lcom/amazon/device/iap/internal/b/b/a;
.super Lcom/amazon/device/iap/internal/b/i;
.source "PurchaseItemCommandBase.java"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field protected a:Lcom/amazon/android/framework/task/TaskManager;
    .annotation runtime Lcom/amazon/android/framework/resource/Resource;
    .end annotation
.end field

.field protected b:Lcom/amazon/android/framework/context/ContextManager;
    .annotation runtime Lcom/amazon/android/framework/resource/Resource;
    .end annotation
.end field

.field protected final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/amazon/device/iap/internal/b/b/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 39
    const-string v0, "purchase_item"

    invoke-direct {p0, p1, v0, p2}, Lcom/amazon/device/iap/internal/b/i;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iput-object p3, p0, Lcom/amazon/device/iap/internal/b/b/a;->c:Ljava/lang/String;

    .line 41
    const-string v0, "sku"

    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b/a;->c:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/amazon/device/iap/internal/b/b/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/amazon/device/iap/internal/b/b/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/amazon/venezia/command/SuccessResult;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;,
            Lcom/amazon/android/framework/exception/KiwiException;
        }
    .end annotation

    .prologue
    .line 50
    invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;

    move-result-object v0

    .line 51
    sget-object v1, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string v1, "purchaseItemIntent"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 53
    sget-object v0, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;

    const-string v1, "did not find intent"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x0

    .line 79
    :goto_0
    return v0

    .line 57
    :cond_0
    sget-object v1, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;

    const-string v2, "found intent"

    invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v1, "purchaseItemIntent"

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    .line 59
    iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b/a;->a:Lcom/amazon/android/framework/task/TaskManager;

    sget-object v2, Lcom/amazon/android/framework/task/pipeline/TaskPipelineId;->FOREGROUND:Lcom/amazon/android/framework/task/pipeline/TaskPipelineId;

    new-instance v3, Lcom/amazon/device/iap/internal/b/b/a$1;

    invoke-direct {v3, p0, v0}, Lcom/amazon/device/iap/internal/b/b/a$1;-><init>(Lcom/amazon/device/iap/internal/b/b/a;Landroid/content/Intent;)V

    invoke-interface {v1, v2, v3}, Lcom/amazon/android/framework/task/TaskManager;->enqueueAtFront(Lcom/amazon/android/framework/task/pipeline/TaskPipelineId;Lcom/amazon/android/framework/task/Task;)V

    .line 79
    const/4 v0, 0x1

    goto :goto_0
.end method
