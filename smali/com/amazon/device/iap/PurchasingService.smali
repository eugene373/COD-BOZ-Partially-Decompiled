.class public final Lcom/amazon/device/iap/PurchasingService;
.super Ljava/lang/Object;
.source "PurchasingService.java"


# static fields
.field public static final IS_SANDBOX_MODE:Z

.field public static final SDK_VERSION:Ljava/lang/String; = "2.0.61.0"

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/amazon/device/iap/PurchasingService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/PurchasingService;->TAG:Ljava/lang/String;

    .line 35
    invoke-static {}, Lcom/amazon/device/iap/internal/e;->a()Z

    move-result v0

    sput-boolean v0, Lcom/amazon/device/iap/PurchasingService;->IS_SANDBOX_MODE:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    sget-object v0, Lcom/amazon/device/iap/PurchasingService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In-App Purchasing SDK initializing. SDK Version 2.0.61.0, IS_SANDBOX_MODE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-boolean v2, Lcom/amazon/device/iap/PurchasingService;->IS_SANDBOX_MODE:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    return-void
.end method

.method public static getProductData(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;
    .locals 1
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
    .line 107
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/amazon/device/iap/internal/d;->a(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    return-object v0
.end method

.method public static getPurchaseUpdates(Z)Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 128
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/amazon/device/iap/internal/d;->a(Z)Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    return-object v0
.end method

.method public static getUserData()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 71
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->c()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    return-object v0
.end method

.method public static notifyFulfillment(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
    .locals 1

    .prologue
    .line 141
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/amazon/device/iap/internal/d;->a(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V

    .line 142
    return-void
.end method

.method public static purchase(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 88
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/amazon/device/iap/internal/d;->a(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    return-object v0
.end method

.method public static registerListener(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V
    .locals 1

    .prologue
    .line 62
    invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/amazon/device/iap/internal/d;->a(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V

    .line 63
    return-void
.end method
