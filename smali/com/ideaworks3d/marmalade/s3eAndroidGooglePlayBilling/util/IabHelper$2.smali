.class Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->queryInventoryAsync(ZLjava/util/List;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

.field final synthetic val$handler:Landroid/os/Handler;

.field final synthetic val$listener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;

.field final synthetic val$moreSkus:Ljava/util/List;

.field final synthetic val$querySkuDetails:Z


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;ZLjava/util/List;Landroid/os/Handler;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;)V
    .locals 0

    .prologue
    .line 614
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iput-boolean p2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$querySkuDetails:Z

    iput-object p3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$moreSkus:Ljava/util/List;

    iput-object p4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$handler:Landroid/os/Handler;

    iput-object p5, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$listener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryInventoryFinishedListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 616
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    const/4 v0, 0x0

    const-string v2, "Inventory refresh successful."

    invoke-direct {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 617
    const/4 v0, 0x0

    .line 619
    :try_start_0
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$querySkuDetails:Z

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$moreSkus:Ljava/util/List;

    invoke-virtual {v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->queryInventory(ZLjava/util/List;)Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;
    :try_end_0
    .catch Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 625
    :goto_0
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->flagEndAsync()V

    .line 629
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;->val$handler:Landroid/os/Handler;

    new-instance v3, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2$1;

    invoke-direct {v3, p0, v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$2;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 634
    return-void

    .line 621
    :catch_0
    move-exception v1

    .line 622
    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException;->getResult()Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    move-result-object v1

    goto :goto_0
.end method
