.class Lcom/ideaworks3d/marmalade/LoaderView$4;
.super Ljava/lang/Object;
.source "LoaderView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderView;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$100(Lcom/ideaworks3d/marmalade/LoaderView;)Ljava/lang/Runnable;

    move-result-object v1

    monitor-enter v1

    .line 250
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$200(Lcom/ideaworks3d/marmalade/LoaderView;)V

    .line 251
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$4;->this$0:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->access$100(Lcom/ideaworks3d/marmalade/LoaderView;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 252
    monitor-exit v1

    .line 253
    return-void

    .line 252
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
