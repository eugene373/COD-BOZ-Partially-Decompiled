.class Lcom/ideaworks3d/marmalade/s3eTest$3;
.super Ljava/lang/Object;
.source "s3eTest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eTest;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eTest;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eTest$3;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 43
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onResume()V

    .line 44
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$3;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eTest;->access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 45
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$3;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$202(Lcom/ideaworks3d/marmalade/s3eTest;Z)Z

    .line 46
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$3;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eTest;->access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 47
    monitor-exit v1

    .line 48
    return-void

    .line 47
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
