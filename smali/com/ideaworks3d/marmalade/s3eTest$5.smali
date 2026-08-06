.class Lcom/ideaworks3d/marmalade/s3eTest$5;
.super Ljava/lang/Object;
.source "s3eTest.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eTest;->PostSuspendResume(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eTest;

.field final synthetic val$iterations:I

.field final synthetic val$sleepTimeMS:I


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eTest;II)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    iput p2, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->val$iterations:I

    iput p3, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->val$sleepTimeMS:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 73
    :goto_0
    :try_start_0
    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->val$iterations:I

    if-ge v0, v1, :cond_1

    .line 75
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$202(Lcom/ideaworks3d/marmalade/s3eTest;Z)Z

    .line 76
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->PostSuspend()V

    .line 77
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->PostSetFocus(Z)V

    .line 78
    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->val$sleepTimeMS:I

    int-to-long v2, v1

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 79
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V

    .line 80
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->PostSetFocus(Z)V

    .line 81
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 82
    :goto_1
    :try_start_1
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$200(Lcom/ideaworks3d/marmalade/s3eTest;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 83
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 88
    :catch_0
    move-exception v0

    .line 93
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V

    .line 94
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    iput-object v4, v0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;

    .line 96
    :goto_2
    return-void

    .line 85
    :cond_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 93
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V

    .line 94
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    iput-object v4, v0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;

    goto :goto_2

    .line 93
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V

    .line 94
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;

    iput-object v4, v1, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;

    throw v0
.end method
