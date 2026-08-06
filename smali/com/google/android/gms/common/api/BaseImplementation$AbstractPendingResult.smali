.class public abstract Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/BaseImplementation$b;
.implements Lcom/google/android/gms/common/api/PendingResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/BaseImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractPendingResult"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/Result;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/BaseImplementation$b",
        "<TR;>;",
        "Lcom/google/android/gms/common/api/PendingResult",
        "<TR;>;"
    }
.end annotation


# instance fields
.field private final Ir:Ljava/lang/Object;

.field private final Is:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/PendingResult$a;",
            ">;"
        }
    .end annotation
.end field

.field private It:Lcom/google/android/gms/common/api/ResultCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/ResultCallback",
            "<TR;>;"
        }
    .end annotation
.end field

.field private volatile Iu:Lcom/google/android/gms/common/api/Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private volatile Iv:Z

.field private Iw:Z

.field private Ix:Z

.field private Iy:Lcom/google/android/gms/common/internal/j;

.field protected mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler",
            "<TR;>;"
        }
    .end annotation
.end field

.field private final mg:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Is:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 2
    .param p1, "looper"    # Landroid/os/Looper;

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;, "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult<TR;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Is:Ljava/util/ArrayList;

    new-instance v0, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler",
            "<TR;>;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;, "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult<TR;>;"
    .local p1, "callbackHandler":Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;, "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler<TR;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Is:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gi()V

    return-void
.end method

.method private c(Lcom/google/android/gms/common/api/Result;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iu:Lcom/google/android/gms/common/api/Result;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iy:Lcom/google/android/gms/common/internal/j;

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iu:Lcom/google/android/gms/common/api/Result;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/Result;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->It:Lcom/google/android/gms/common/api/ResultCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->removeTimeoutMessages()V

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iw:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    iget-object v2, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->It:Lcom/google/android/gms/common/api/ResultCallback;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gf()Lcom/google/android/gms/common/api/Result;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->sendResultCallback(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Is:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/PendingResult$a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult$a;->n(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Is:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private gf()Lcom/google/android/gms/common/api/Result;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Result has already been consumed."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    const-string v2, "Result is not ready."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iu:Lcom/google/android/gms/common/api/Result;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gg()V

    monitor-exit v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private gh()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jw:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->b(Lcom/google/android/gms/common/api/Result;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ix:Z

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private gi()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jy:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->b(Lcom/google/android/gms/common/api/Result;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ix:Z

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler",
            "<TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    return-void
.end method

.method public final a(Lcom/google/android/gms/common/api/PendingResult$a;)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Result has already been consumed."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iu:Lcom/google/android/gms/common/api/Result;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/Result;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/PendingResult$a;->n(Lcom/google/android/gms/common/api/Status;)V

    :goto_1
    monitor-exit v1

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Is:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final a(Lcom/google/android/gms/common/internal/j;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iy:Lcom/google/android/gms/common/internal/j;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final await()Lcom/google/android/gms/common/api/Result;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v0, v3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "await must not be called on the UI thread"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v0, :cond_1

    :goto_1
    const-string v0, "Result has already been consumed"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    const-string v1, "Result is not ready."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gf()Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gh()V

    goto :goto_2
.end method

.method public final await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;
    .locals 7
    .param p1, "time"    # J
    .param p3, "units"    # Ljava/util/concurrent/TimeUnit;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TR;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;, "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult<TR;>;"
    const/4 v2, 0x1

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    cmp-long v0, p1, v4

    if-lez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v0, v3, :cond_2

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "await must not be called on the UI thread when time is greater than zero."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v0, :cond_3

    :goto_1
    const-string v0, "Result has already been consumed."

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gi()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    const-string v1, "Result is not ready."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gf()Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    return-object v0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v2, v1

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gh()V

    goto :goto_2
.end method

.method public final b(Lcom/google/android/gms/common/api/Result;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-boolean v2, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ix:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iw:Z

    if-eqz v2, :cond_1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/common/api/BaseImplementation;->a(Lcom/google/android/gms/common/api/Result;)V

    monitor-exit v3

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v2

    if-nez v2, :cond_2

    move v2, v0

    :goto_1
    const-string v4, "Results have already been set"

    invoke-static {v2, v4}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v2, :cond_3

    :goto_2
    const-string v1, "Result has already been consumed"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->c(Lcom/google/android/gms/common/api/Result;)V

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move v2, v1

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/Result;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method protected abstract c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            ")TR;"
        }
    .end annotation
.end method

.method public cancel()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iw:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-eqz v0, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iy:Lcom/google/android/gms/common/internal/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iy:Lcom/google/android/gms/common/internal/j;

    invoke-interface {v0}, Lcom/google/android/gms/common/internal/j;->cancel()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iu:Lcom/google/android/gms/common/api/Result;

    invoke-static {v0}, Lcom/google/android/gms/common/api/BaseImplementation;->a(Lcom/google/android/gms/common/api/Result;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->It:Lcom/google/android/gms/common/api/ResultCallback;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iw:Z

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jz:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->c(Lcom/google/android/gms/common/api/Result;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method protected gg()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    iput-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iu:Lcom/google/android/gms/common/api/Result;

    iput-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->It:Lcom/google/android/gms/common/api/ResultCallback;

    return-void
.end method

.method public isCanceled()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iw:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final isReady()Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mg:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/ResultCallback",
            "<TR;>;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;, "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult<TR;>;"
    .local p1, "callback":Lcom/google/android/gms/common/api/ResultCallback;, "Lcom/google/android/gms/common/api/ResultCallback<TR;>;"
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Result has already been consumed."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_1

    monitor-exit v1

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gf()Lcom/google/android/gms/common/api/Result;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->sendResultCallback(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V

    :goto_2
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->It:Lcom/google/android/gms/common/api/ResultCallback;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2
.end method

.method public final setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;JLjava/util/concurrent/TimeUnit;)V
    .locals 4
    .param p2, "time"    # J
    .param p4, "units"    # Ljava/util/concurrent/TimeUnit;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/ResultCallback",
            "<TR;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;, "Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult<TR;>;"
    .local p1, "callback":Lcom/google/android/gms/common/api/ResultCallback;, "Lcom/google/android/gms/common/api/ResultCallback<TR;>;"
    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Iv:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Result has already been consumed."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    if-eqz v0, :cond_1

    :goto_1
    const-string v0, "CallbackHandler has not been set before calling setResultCallback."

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->Ir:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_2

    monitor-exit v1

    :goto_2
    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->isReady()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gf()Lcom/google/android/gms/common/api/Result;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->sendResultCallback(Lcom/google/android/gms/common/api/ResultCallback;Lcom/google/android/gms/common/api/Result;)V

    :goto_3
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->It:Lcom/google/android/gms/common/api/ResultCallback;

    iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v0, p0, v2, v3}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;->sendTimeoutResultCallback(Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3
.end method
