.class Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$5;
.super Ljava/lang/Object;
.source "s3eAndroidGooglePlayBilling.java"

# interfaces
.implements Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabHelper$OnConsumeFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling$5;->this$0:Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConsumeFinished(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/Purchase;Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V
    .locals 3

    .prologue
    .line 225
    const-string v0, "s3eAndroidGooglePlayBilling"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Consumption finished. Purchase: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/s3eAndroidGooglePlayBilling;->access$400(Lcom/ideaworks3d/marmalade/s3eAndroidGooglePlayBilling/util/IabResult;)V

    .line 227
    return-void
.end method
