.class abstract Lcom/amazon/device/iap/internal/b/e/b;
.super Lcom/amazon/device/iap/internal/b/i;
.source "GetUserIdCommandBase.java"


# static fields
.field protected static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    sput-object v0, Lcom/amazon/device/iap/internal/b/e/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 17
    const-string v0, "get_userId"

    invoke-direct {p0, p1, v0, p2}, Lcom/amazon/device/iap/internal/b/i;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    return-void
.end method
