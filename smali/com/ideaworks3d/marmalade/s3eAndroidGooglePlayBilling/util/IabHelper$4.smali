.class Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->querySkusAsync(Ljava/util/List;Ljava/util/List;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

.field final synthetic val$handler:Landroid/os/Handler;

.field final synthetic val$inAppSkus:Ljava/util/List;

.field final synthetic val$listener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;

.field final synthetic val$subSkus:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;Ljava/util/List;Ljava/util/List;Landroid/os/Handler;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;)V
    .locals 0

    .prologue
    .line 1058
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iput-object p2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$inAppSkus:Ljava/util/List;

    iput-object p3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$subSkus:Ljava/util/List;

    iput-object p4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$handler:Landroid/os/Handler;

    iput-object p5, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$listener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 1060
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    const/4 v0, 0x0

    const-string v2, "Sku details retrieved successfully."

    invoke-direct {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;-><init>(ILjava/lang/String;)V

    .line 1061
    const/4 v0, 0x0

    .line 1063
    :try_start_0
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$inAppSkus:Ljava/util/List;

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$subSkus:Ljava/util/List;

    invoke-virtual {v2, v3, v4}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->querySkus(Ljava/util/List;Ljava/util/List;)Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;
    :try_end_0
    .catch Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1069
    :goto_0
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper;->flagEndAsync()V

    .line 1073
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$handler:Landroid/os/Handler;

    new-instance v3, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;

    invoke-direct {v3, p0, v1, v0}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;-><init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1078
    return-void

    .line 1065
    :catch_0
    move-exception v1

    .line 1066
    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabException;->getResult()Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    move-result-object v1

    goto :goto_0
.end method
