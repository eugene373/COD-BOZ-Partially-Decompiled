.class abstract Lcom/amazon/device/iap/internal/b/c/c;
.super Lcom/amazon/device/iap/internal/b/i;
.source "GetItemDataCommandBase.java"


# instance fields
.field protected final a:Ljava/util/Set;
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
.method constructor <init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amazon/device/iap/internal/b/e;",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 15
    const-string v0, "getItem_data"

    invoke-direct {p0, p1, v0, p2}, Lcom/amazon/device/iap/internal/b/i;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iput-object p3, p0, Lcom/amazon/device/iap/internal/b/c/c;->a:Ljava/util/Set;

    .line 17
    const-string v0, "skus"

    invoke-virtual {p0, v0, p3}, Lcom/amazon/device/iap/internal/b/c/c;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    return-void
.end method
