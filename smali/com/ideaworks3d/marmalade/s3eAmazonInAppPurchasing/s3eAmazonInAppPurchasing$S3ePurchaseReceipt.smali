.class public Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseReceipt;
.super Ljava/lang/Object;
.source "s3eAmazonInAppPurchasing.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "S3ePurchaseReceipt"
.end annotation


# instance fields
.field public m_purchaseToken:Ljava/lang/String;

.field public m_requestId:Lcom/amazon/device/iap/model/RequestId;

.field public m_sku:Ljava/lang/String;

.field public m_state:Lcom/ideaworks3d/marmalade/s3eAmazonInAppPurchasing/s3eAmazonInAppPurchasing$S3ePurchaseState;

.field public m_subscriptionEndUTC:J

.field public m_subscriptionStartUTC:J

.field public m_type:Lcom/amazon/device/iap/model/ProductType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
