.class Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;
.super Landroid/os/AsyncTask;
.source "LoaderActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DelayedResumeTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;


# direct methods
.method private constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Lcom/ideaworks3d/marmalade/LoaderActivity$1;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .prologue
    .line 85
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    const-wide/16 v0, 0x12c

    :try_start_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 88
    monitor-exit p0

    .line 94
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 88
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 90
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 59
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$000(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$100(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onResume()V

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$200(Lcom/ideaworks3d/marmalade/LoaderActivity;)V

    goto :goto_0
.end method
