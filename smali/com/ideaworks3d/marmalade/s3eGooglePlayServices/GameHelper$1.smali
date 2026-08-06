.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;
.super Ljava/lang/Object;
.source "GameHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onStart(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;)V
    .locals 0

    .prologue
    .line 409
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 412
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V

    .line 413
    return-void
.end method
