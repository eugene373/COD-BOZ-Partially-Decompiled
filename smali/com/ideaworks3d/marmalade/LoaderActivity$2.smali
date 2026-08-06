.class Lcom/ideaworks3d/marmalade/LoaderActivity$2;
.super Ljava/lang/Object;
.source "LoaderActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/LoaderActivity;->ExecuteIntent(Landroid/content/Intent;)Landroid/content/Intent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

.field final synthetic val$i:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 373
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$2;->val$i:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 378
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$2;->val$i:Landroid/content/Intent;

    const v2, 0x1e240

    invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 384
    :goto_0
    return-void

    .line 380
    :catch_0
    move-exception v0

    .line 382
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not start activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    goto :goto_0
.end method
