.class public final Lcom/google/android/gms/internal/co;
.super Lcom/google/android/gms/internal/cv$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final mw:Ljava/lang/Object;

.field private qm:Lcom/google/android/gms/internal/cq$a;

.field private qn:Lcom/google/android/gms/internal/cn;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/cv$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/cn;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/cq$a;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdClicked()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cn;->ae()V

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

.method public onAdClosed()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cn;->af()V

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

.method public onAdFailedToLoad(I)V
    .locals 3
    .param p1, "error"    # I

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/cq$a;->j(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    :cond_0
    monitor-exit v1

    return-void

    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdLeftApplication()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cn;->ag()V

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

.method public onAdLoaded()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/cq$a;->j(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/co;->qm:Lcom/google/android/gms/internal/cq$a;

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cn;->ai()V

    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onAdOpened()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/co;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/co;->qn:Lcom/google/android/gms/internal/cn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cn;->ah()V

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
