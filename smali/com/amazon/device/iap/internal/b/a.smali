.class public Lcom/amazon/device/iap/internal/b/a;
.super Ljava/lang/RuntimeException;
.source "ReceiptParsingException.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 17
    iput-object p1, p0, Lcom/amazon/device/iap/internal/b/a;->a:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/amazon/device/iap/internal/b/a;->b:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/amazon/device/iap/internal/b/a;->a:Ljava/lang/String;

    return-object v0
.end method
