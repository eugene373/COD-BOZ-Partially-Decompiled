.class Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;
.super Ljava/lang/Object;
.source "IabHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;

.field final synthetic val$inv_f:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;

.field final synthetic val$result_f:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V
    .locals 0

    .prologue
    .line 1073
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;->this$1:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;

    iput-object p2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;->val$result_f:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    iput-object p3, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;->val$inv_f:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1075
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;->this$1:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4;->val$listener:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;->val$result_f:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$4$1;->val$inv_f:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;

    invoke-interface {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$QueryProductsFinishedListener;->onQuerySkusFinished(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Inventory;)V

    .line 1076
    return-void
.end method
