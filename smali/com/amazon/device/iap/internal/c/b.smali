.class public Lcom/amazon/device/iap/internal/c/b;
.super Ljava/lang/Object;
.source "PurchaseRequestTracker.java"


# static fields
.field private static final b:Lcom/amazon/device/iap/internal/c/b;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    new-instance v0, Lcom/amazon/device/iap/internal/c/b;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/c/b;-><init>()V

    sput-object v0, Lcom/amazon/device/iap/internal/c/b;->b:Lcom/amazon/device/iap/internal/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lcom/amazon/device/iap/internal/c/b;->a:Ljava/util/Set;

    return-void
.end method

.method public static a()Lcom/amazon/device/iap/internal/c/b;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/amazon/device/iap/internal/c/b;->b:Lcom/amazon/device/iap/internal/c/b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 22
    invoke-static {p1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/amazon/device/iap/internal/c/b;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 25
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 35
    invoke-static {p1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/amazon/device/iap/internal/c/b;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 38
    :cond_0
    return-void
.end method
