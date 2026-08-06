.class public final enum Lcom/amazon/device/iap/internal/model/a;
.super Ljava/lang/Enum;
.source "InternalFulfillmentResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/amazon/device/iap/internal/model/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/amazon/device/iap/internal/model/a;

.field public static final enum b:Lcom/amazon/device/iap/internal/model/a;

.field private static final synthetic c:[Lcom/amazon/device/iap/internal/model/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 9
    new-instance v0, Lcom/amazon/device/iap/internal/model/a;

    const-string v1, "DELIVERED"

    invoke-direct {v0, v1, v2}, Lcom/amazon/device/iap/internal/model/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/internal/model/a;->a:Lcom/amazon/device/iap/internal/model/a;

    .line 16
    new-instance v0, Lcom/amazon/device/iap/internal/model/a;

    const-string v1, "DELIVERY_ATTEMPTED"

    invoke-direct {v0, v1, v3}, Lcom/amazon/device/iap/internal/model/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/internal/model/a;->b:Lcom/amazon/device/iap/internal/model/a;

    .line 3
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/amazon/device/iap/internal/model/a;

    sget-object v1, Lcom/amazon/device/iap/internal/model/a;->a:Lcom/amazon/device/iap/internal/model/a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/amazon/device/iap/internal/model/a;->b:Lcom/amazon/device/iap/internal/model/a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/amazon/device/iap/internal/model/a;->c:[Lcom/amazon/device/iap/internal/model/a;

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
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method
