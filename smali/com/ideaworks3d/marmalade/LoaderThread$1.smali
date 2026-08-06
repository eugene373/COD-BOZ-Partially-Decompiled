.class Lcom/ideaworks3d/marmalade/LoaderThread$1;
.super Landroid/content/BroadcastReceiver;
.source "LoaderThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderThread;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V
    .locals 0

    .prologue
    .line 463
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 467
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    const-string v2, "level"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$602(Lcom/ideaworks3d/marmalade/LoaderThread;I)I

    .line 468
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$700(Lcom/ideaworks3d/marmalade/LoaderThread;)Z

    move-result v1

    .line 469
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    const-string v3, "plugged"

    invoke-virtual {p2, v3, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$702(Lcom/ideaworks3d/marmalade/LoaderThread;Z)Z

    .line 470
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$700(Lcom/ideaworks3d/marmalade/LoaderThread;)Z

    move-result v0

    if-eq v1, v0, :cond_1

    .line 473
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$1;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$700(Lcom/ideaworks3d/marmalade/LoaderThread;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$800(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V

    .line 475
    :cond_1
    return-void
.end method
