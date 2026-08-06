.class public Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;
.super Ljava/lang/Object;
.source "s3eAndroidGooglePlayBilling.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "S3eBillingPurchase"
.end annotation


# instance fields
.field public m_DeveloperPayload:Ljava/lang/String;

.field public m_JSON:Ljava/lang/String;

.field public m_OrderID:Ljava/lang/String;

.field public m_PackageID:Ljava/lang/String;

.field public m_ProductId:Ljava/lang/String;

.field public m_PurchaseState:I

.field public m_PurchaseTime:J

.field public m_PurchaseToken:Ljava/lang/String;

.field public m_Signature:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    .locals 2

    .prologue
    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 258
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_OrderID:Ljava/lang/String;

    .line 259
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_PackageID:Ljava/lang/String;

    .line 260
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getSku()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_ProductId:Ljava/lang/String;

    .line 261
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getPurchaseTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_PurchaseTime:J

    .line 262
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getPurchaseState()I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_PurchaseState:I

    .line 263
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_PurchaseToken:Ljava/lang/String;

    .line 264
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getDeveloperPayload()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_DeveloperPayload:Ljava/lang/String;

    .line 265
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getOriginalJson()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_JSON:Ljava/lang/String;

    .line 266
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;->getSignature()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingPurchase;->m_Signature:Ljava/lang/String;

    .line 267
    return-void
.end method
