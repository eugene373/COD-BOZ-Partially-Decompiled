.class Lcom/ideaworks3d/marmalade/LoaderThread$2;
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
    .line 478
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 482
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 483
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 484
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$900(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V

    .line 494
    :goto_0
    return-void

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$900(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V

    goto :goto_0
.end method
