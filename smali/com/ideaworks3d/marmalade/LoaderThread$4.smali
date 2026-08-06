.class Lcom/ideaworks3d/marmalade/LoaderThread$4;
.super Ljava/lang/Object;
.source "LoaderThread.java"

# interfaces
.implements Ljava/lang/Runnable;


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
    .line 532
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 535
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$1200(Lcom/ideaworks3d/marmalade/LoaderThread;)Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$1100(Lcom/ideaworks3d/marmalade/LoaderThread;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->createView(Z)V

    .line 536
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$1300(Lcom/ideaworks3d/marmalade/LoaderThread;)Ljava/lang/Runnable;

    move-result-object v1

    monitor-enter v1

    .line 538
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$1300(Lcom/ideaworks3d/marmalade/LoaderThread;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 539
    monitor-exit v1

    .line 540
    return-void

    .line 539
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
