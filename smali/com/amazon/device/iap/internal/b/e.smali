.class public Lcom/amazon/device/iap/internal/b/e;
.super Ljava/lang/Object;
.source "KiwiRequest.java"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/amazon/device/iap/model/RequestId;

.field private final c:Lcom/amazon/device/iap/internal/b/h;

.field private d:Lcom/amazon/device/iap/internal/b/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/amazon/device/iap/internal/b/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/internal/b/e;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/amazon/device/iap/model/RequestId;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/e;->b:Lcom/amazon/device/iap/model/RequestId;

    .line 27
    new-instance v0, Lcom/amazon/device/iap/internal/b/h;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/b/h;-><init>()V

    iput-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->c:Lcom/amazon/device/iap/internal/b/h;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;

    .line 29
    return-void
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/amazon/device/iap/internal/b/e;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 102
    return-void
.end method

.method protected a(Lcom/amazon/device/iap/internal/b/i;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;

    .line 33
    return-void
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/amazon/device/iap/internal/b/e;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V

    .line 37
    return-void
.end method

.method protected a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V
    .locals 3

    .prologue
    .line 40
    const-string v0, "response"

    invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;

    move-result-object v0

    .line 43
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amazon/device/iap/internal/d;->a()Lcom/amazon/device/iap/PurchasingListener;

    move-result-object v1

    .line 44
    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 45
    :cond_0
    sget-object v0, Lcom/amazon/device/iap/internal/b/e;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PurchasingListener is not set. Dropping response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    :goto_0
    return-void

    .line 49
    :cond_1
    new-instance v2, Lcom/amazon/device/iap/internal/b/e$1;

    invoke-direct {v2, p0, p1, v1, p2}, Lcom/amazon/device/iap/internal/b/e$1;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/Object;Lcom/amazon/device/iap/PurchasingListener;Lcom/amazon/device/iap/internal/b/i;)V

    .line 82
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public b()V
    .locals 0

    .prologue
    .line 105
    return-void
.end method

.method public c()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->b:Lcom/amazon/device/iap/model/RequestId;

    return-object v0
.end method

.method public d()Lcom/amazon/device/iap/internal/b/h;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->c:Lcom/amazon/device/iap/internal/b/h;

    return-object v0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V

    .line 99
    :goto_0
    return-void

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/e;->a()V

    goto :goto_0
.end method
