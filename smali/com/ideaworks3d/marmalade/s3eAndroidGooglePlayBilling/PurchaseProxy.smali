.class public Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;
.super Landroid/app/Activity;
.source "PurchaseProxy.java"


# static fields
.field static final RC_REQUEST:I = 0xc4b

.field private static final TAG:Ljava/lang/String; = "PurchaseProxy"


# instance fields
.field public mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 97
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy$1;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 82
    const-string v0, "PurchaseProxy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->handleActivityResult(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 94
    :goto_0
    return-void

    .line 92
    :cond_0
    const-string v0, "PurchaseProxy"

    const-string v1, "onActivityResult forwarded by PurchaseProxy. Closing down."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/16 v3, 0xc4b

    .line 57
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    sget-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z

    if-eqz v0, :cond_0

    .line 61
    const/4 v0, 0x0

    sput-boolean v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->m_SendRequest:Z

    .line 63
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 64
    const-string v1, "productID"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 65
    const-string v1, "developerPayLoad"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 66
    const-string v1, "inApp"

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->launchPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    .line 75
    :cond_0
    :goto_0
    const-string v0, "PurchaseProxy"

    const-string v1, "PurchaseProxy Activity has been restarted with Helper in flight - notifying IabHelper"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->SetPurchaseListener(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;)V

    .line 78
    return-void

    .line 71
    :cond_1
    sget-object v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->mHelper:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/PurchaseProxy;->mProxyPurchaseFinishedListener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->launchSubscriptionPurchaseFlow(Landroid/app/Activity;Ljava/lang/String;ILcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnIabPurchaseFinishedListener;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 37
    const-string v0, "PurchaseProxy"

    const-string v1, "Proxy OnPause"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 39
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 43
    const-string v0, "PurchaseProxy"

    const-string v1, "Proxy onResume"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 45
    return-void
.end method
