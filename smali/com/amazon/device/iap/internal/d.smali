.class public Lcom/amazon/device/iap/internal/d;
.super Ljava/lang/Object;
.source "PurchasingManager.java"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Lcom/amazon/device/iap/internal/d;


# instance fields
.field private final d:Lcom/amazon/device/iap/internal/c;

.field private e:Landroid/content/Context;

.field private f:Lcom/amazon/device/iap/PurchasingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/amazon/device/iap/internal/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;

    .line 18
    const-string v0, "sku"

    sput-object v0, Lcom/amazon/device/iap/internal/d;->b:Ljava/lang/String;

    .line 19
    new-instance v0, Lcom/amazon/device/iap/internal/d;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/d;-><init>()V

    sput-object v0, Lcom/amazon/device/iap/internal/d;->c:Lcom/amazon/device/iap/internal/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {}, Lcom/amazon/device/iap/internal/e;->b()Lcom/amazon/device/iap/internal/c;

    move-result-object v0

    iput-object v0, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    .line 27
    return-void
.end method

.method public static d()Lcom/amazon/device/iap/internal/d;
    .locals 1

    .prologue
    .line 137
    sget-object v0, Lcom/amazon/device/iap/internal/d;->c:Lcom/amazon/device/iap/internal/d;

    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 50
    iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->f:Lcom/amazon/device/iap/PurchasingListener;

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must register a PurchasingListener before invoking this operation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/amazon/device/iap/PurchasingListener;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->f:Lcom/amazon/device/iap/PurchasingListener;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    .locals 2

    .prologue
    .line 76
    sget-object v0, Lcom/amazon/device/iap/internal/d;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V

    .line 80
    new-instance v0, Lcom/amazon/device/iap/model/RequestId;

    invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V

    .line 81
    iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    invoke-interface {v1, v0, p1}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V

    .line 82
    return-object v0
.end method

.method public a(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/amazon/device/iap/model/RequestId;"
        }
    .end annotation

    .prologue
    const/16 v3, 0x64

    .line 86
    const-string v0, "skus"

    invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    const-string v0, "skus"

    invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/util/Collection;Ljava/lang/String;)V

    .line 88
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Empty SKU values are not allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v3, :cond_2

    .line 94
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " SKUs were provided, but no more than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " SKUs are allowed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_2
    invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V

    .line 101
    new-instance v0, Lcom/amazon/device/iap/model/RequestId;

    invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V

    .line 103
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 104
    iget-object v2, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    invoke-interface {v2, v0, v1}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V

    .line 105
    return-object v0
.end method

.method public a(Z)Lcom/amazon/device/iap/model/RequestId;
    .locals 2

    .prologue
    .line 109
    invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V

    .line 111
    new-instance v0, Lcom/amazon/device/iap/model/RequestId;

    invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V

    .line 112
    iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    invoke-interface {v1, v0, p1}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Z)V

    .line 113
    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 130
    :try_start_0
    iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    invoke-interface {v0, p1, p2}, Lcom/amazon/device/iap/internal/c;->a(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :goto_0
    return-void

    .line 131
    :catch_0
    move-exception v0

    .line 132
    sget-object v1, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error in onReceive: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V
    .locals 3

    .prologue
    .line 56
    sget-object v0, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PurchasingListener registered: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    sget-object v0, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PurchasingListener Context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Neither PurchasingListener or its Context can be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/amazon/device/iap/internal/d;->e:Landroid/content/Context;

    .line 64
    iput-object p2, p0, Lcom/amazon/device/iap/internal/d;->f:Lcom/amazon/device/iap/PurchasingListener;

    .line 65
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
    .locals 2

    .prologue
    .line 117
    invoke-static {p1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Empty receiptId is not allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_0
    const-string v0, "fulfillmentResult"

    invoke-static {p2, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V

    .line 124
    new-instance v0, Lcom/amazon/device/iap/model/RequestId;

    invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V

    .line 125
    iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    invoke-interface {v1, v0, p1, p2}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V

    .line 126
    return-void
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->e:Landroid/content/Context;

    return-object v0
.end method

.method public c()Lcom/amazon/device/iap/model/RequestId;
    .locals 2

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V

    .line 70
    new-instance v0, Lcom/amazon/device/iap/model/RequestId;

    invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V

    .line 71
    iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;

    invoke-interface {v1, v0}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;)V

    .line 72
    return-object v0
.end method
