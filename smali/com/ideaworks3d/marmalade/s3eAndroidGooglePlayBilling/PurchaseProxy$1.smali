.class Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy$1;
.super Ljava/lang/Object;
.source "PurchaseProxy.java"

# interfaces
.implements Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy$1;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onIabPurchaseFinished(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V
    .locals 2

    .prologue
    .line 101
    const-string v0, "PurchaseProxy"

    const-string v1, "onIabPurchaseFinished"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    invoke-interface {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;->onIabPurchaseFinished(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;)V

    .line 104
    const-string v0, "PurchaseProxy"

    const-string v1, "PurchaseProxy Activity - Closing Activity"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy$1;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->finish()V

    .line 106
    return-void
.end method
