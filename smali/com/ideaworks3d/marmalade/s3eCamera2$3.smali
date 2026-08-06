.class Lcom/ideaworks3d/marmalade/s3eCamera2$3;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "s3eCamera2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eCamera2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eCamera2;)V
    .locals 0

    .prologue
    .line 291
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$3;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    .prologue
    .line 305
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 306
    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    .prologue
    .line 310
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 311
    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    .prologue
    .line 295
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$000()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 297
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$3;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;

    invoke-static {v0, p1}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$102(Lcom/ideaworks3d/marmalade/s3eCamera2;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CameraDevice;

    .line 298
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eCamera2$3;->this$0:Lcom/ideaworks3d/marmalade/s3eCamera2;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$600(Lcom/ideaworks3d/marmalade/s3eCamera2;)V

    .line 299
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eCamera2;->access$700()Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 300
    monitor-exit v1

    .line 301
    return-void

    .line 300
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
