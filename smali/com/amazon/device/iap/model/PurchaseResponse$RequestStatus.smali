.class public final enum Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
.super Ljava/lang/Enum;
.source "PurchaseResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amazon/device/iap/model/PurchaseResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RequestStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field public static final enum ALREADY_PURCHASED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field public static final enum FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field public static final enum INVALID_SKU:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field public static final enum NOT_SUPPORTED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field public static final enum SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 33
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    const-string v1, "SUCCESSFUL"

    invoke-direct {v0, v1, v2}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 39
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v3}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 45
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    const-string v1, "INVALID_SKU"

    invoke-direct {v0, v1, v4}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->INVALID_SKU:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 54
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    const-string v1, "ALREADY_PURCHASED"

    invoke-direct {v0, v1, v5}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->ALREADY_PURCHASED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 59
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    const-string v1, "NOT_SUPPORTED"

    invoke-direct {v0, v1, v6}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->NOT_SUPPORTED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 28
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->INVALID_SKU:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->ALREADY_PURCHASED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->NOT_SUPPORTED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    aput-object v1, v0, v6

    sput-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->$VALUES:[Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static safeValueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    .locals 1

    .prologue
    .line 62
    invoke-static {p0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const/4 v0, 0x0

    .line 68
    :goto_0
    return-object v0

    .line 65
    :cond_0
    const-string v0, "ALREADY_ENTITLED"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    sget-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->ALREADY_PURCHASED:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    move-result-object v0

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    return-object v0
.end method

.method public static values()[Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->$VALUES:[Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    invoke-virtual {v0}, [Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    return-object v0
.end method
