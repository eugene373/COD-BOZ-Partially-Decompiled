.class Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver$Order;
.super Ljava/lang/Object;
.source "s3eAndroidMarketBillingReceiver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidMarketBilling/s3eAndroidMarketBillingReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Order"
.end annotation


# instance fields
.field public m_DeveloperPayload:Ljava/lang/String;

.field public m_NotificationID:Ljava/lang/String;

.field public m_OrderID:Ljava/lang/String;

.field public m_PackageName:Ljava/lang/String;

.field public m_ProductID:Ljava/lang/String;

.field public m_PurchaseState:I

.field public m_PurchaseTime:J


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
