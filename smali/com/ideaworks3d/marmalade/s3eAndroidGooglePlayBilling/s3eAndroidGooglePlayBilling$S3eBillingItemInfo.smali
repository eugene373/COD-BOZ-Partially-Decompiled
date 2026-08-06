.class public Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;
.super Ljava/lang/Object;
.source "s3eAndroidGooglePlayBilling.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "S3eBillingItemInfo"
.end annotation


# instance fields
.field public m_CurrencyCode:Ljava/lang/String;

.field public m_Description:Ljava/lang/String;

.field public m_Price:Ljava/lang/String;

.field public m_PriceMicros:Ljava/lang/String;

.field public m_ProductID:Ljava/lang/String;

.field public m_Title:Ljava/lang/String;

.field public m_Type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;)V
    .locals 1

    .prologue
    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 281
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_ProductID:Ljava/lang/String;

    .line 282
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_Type:Ljava/lang/String;

    .line 283
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getPrice()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_Price:Ljava/lang/String;

    .line 284
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_Title:Ljava/lang/String;

    .line 285
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getDescription()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_Description:Ljava/lang/String;

    .line 286
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getCurrencyCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_CurrencyCode:Ljava/lang/String;

    .line 287
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/SkuDetails;->getPriceMicros()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$S3eBillingItemInfo;->m_PriceMicros:Ljava/lang/String;

    .line 288
    return-void
.end method
