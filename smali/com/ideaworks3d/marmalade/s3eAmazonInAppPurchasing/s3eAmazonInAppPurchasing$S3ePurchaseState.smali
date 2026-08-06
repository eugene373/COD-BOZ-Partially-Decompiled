.class public final enum Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
.super Ljava/lang/Enum;
.source "s3eAmazonInAppPurchasing.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "S3ePurchaseState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

.field public static final enum ALREADY_PURCHASED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

.field public static final enum FAILED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

.field public static final enum INVALID_SKU:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

.field public static final enum PENDING:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

.field public static final enum SUCCESSFUL:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 69
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->PENDING:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    .line 70
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    const-string v1, "ALREADY_PURCHASED"

    invoke-direct {v0, v1, v3}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->ALREADY_PURCHASED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    .line 71
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v4}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->FAILED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    .line 72
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    const-string v1, "INVALID_SKU"

    invoke-direct {v0, v1, v5}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->INVALID_SKU:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    .line 73
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    const-string v1, "SUCCESSFUL"

    invoke-direct {v0, v1, v6}, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->SUCCESSFUL:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    .line 67
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->PENDING:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->ALREADY_PURCHASED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->FAILED:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->INVALID_SKU:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->SUCCESSFUL:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->$VALUES:[Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

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
    .line 67
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    .locals 1

    .prologue
    .line 67
    const-class v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    return-object v0
.end method

.method public static values()[Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->$VALUES:[Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    invoke-virtual {v0}, [Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

    return-object v0
.end method
