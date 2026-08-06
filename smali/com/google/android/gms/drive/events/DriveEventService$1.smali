.class Lcom/google/android/gms/drive/events/DriveEventService$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/events/DriveEventService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic NY:Ljava/util/concurrent/CountDownLatch;

.field final synthetic NZ:Lcom/google/android/gms/drive/events/DriveEventService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/events/DriveEventService;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;

    iput-object p2, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NY:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->prepare()V

    iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;

    new-instance v1, Lcom/google/android/gms/drive/events/DriveEventService$a;

    iget-object v2, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;

    invoke-direct {v1, v2}, Lcom/google/android/gms/drive/events/DriveEventService$a;-><init>(Lcom/google/android/gms/drive/events/DriveEventService;)V

    iput-object v1, v0, Lcom/google/android/gms/drive/events/DriveEventService;->NW:Lcom/google/android/gms/drive/events/DriveEventService$a;

    iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NY:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    const-string v0, "DriveEventService"

    const-string v1, "Bound and starting loop"

    invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Looper;->loop()V

    const-string v0, "DriveEventService"

    const-string v1, "Finished loop"

    invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->n(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;

    invoke-static {v0}, Lcom/google/android/gms/drive/events/DriveEventService;->b(Lcom/google/android/gms/drive/events/DriveEventService;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->NZ:Lcom/google/android/gms/drive/events/DriveEventService;

    invoke-static {v1}, Lcom/google/android/gms/drive/events/DriveEventService;->b(Lcom/google/android/gms/drive/events/DriveEventService;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method
