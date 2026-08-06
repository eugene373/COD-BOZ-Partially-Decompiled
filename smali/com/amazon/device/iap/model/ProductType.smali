.class public final enum Lcom/amazon/device/iap/model/ProductType;
.super Ljava/lang/Enum;
.source "ProductType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/amazon/device/iap/model/ProductType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazon/device/iap/model/ProductType;

.field public static final enum CONSUMABLE:Lcom/amazon/device/iap/model/ProductType;

.field public static final enum ENTITLED:Lcom/amazon/device/iap/model/ProductType;

.field public static final enum SUBSCRIPTION:Lcom/amazon/device/iap/model/ProductType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lcom/amazon/device/iap/model/ProductType;

    const-string v1, "CONSUMABLE"

    invoke-direct {v0, v1, v2}, Lcom/amazon/device/iap/model/ProductType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/ProductType;->CONSUMABLE:Lcom/amazon/device/iap/model/ProductType;

    .line 18
    new-instance v0, Lcom/amazon/device/iap/model/ProductType;

    const-string v1, "ENTITLED"

    invoke-direct {v0, v1, v3}, Lcom/amazon/device/iap/model/ProductType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/ProductType;->ENTITLED:Lcom/amazon/device/iap/model/ProductType;

    .line 24
    new-instance v0, Lcom/amazon/device/iap/model/ProductType;

    const-string v1, "SUBSCRIPTION"

    invoke-direct {v0, v1, v4}, Lcom/amazon/device/iap/model/ProductType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/ProductType;->SUBSCRIPTION:Lcom/amazon/device/iap/model/ProductType;

    .line 7
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/amazon/device/iap/model/ProductType;

    sget-object v1, Lcom/amazon/device/iap/model/ProductType;->CONSUMABLE:Lcom/amazon/device/iap/model/ProductType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/amazon/device/iap/model/ProductType;->ENTITLED:Lcom/amazon/device/iap/model/ProductType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/amazon/device/iap/model/ProductType;->SUBSCRIPTION:Lcom/amazon/device/iap/model/ProductType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/amazon/device/iap/model/ProductType;->$VALUES:[Lcom/amazon/device/iap/model/ProductType;

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
    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/ProductType;
    .locals 1

    .prologue
    .line 7
    const-class v0, Lcom/amazon/device/iap/model/ProductType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/ProductType;

    return-object v0
.end method

.method public static values()[Lcom/amazon/device/iap/model/ProductType;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/amazon/device/iap/model/ProductType;->$VALUES:[Lcom/amazon/device/iap/model/ProductType;

    invoke-virtual {v0}, [Lcom/amazon/device/iap/model/ProductType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazon/device/iap/model/ProductType;

    return-object v0
.end method
