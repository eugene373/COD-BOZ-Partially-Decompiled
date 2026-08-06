.class public final Lcom/google/android/gms/internal/fg$b;
.super Lcom/google/android/gms/internal/fg;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final mw:Ljava/lang/Object;

.field private final tu:Lcom/google/android/gms/internal/ff$a;

.field private final tv:Lcom/google/android/gms/internal/fh;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ff$a;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/fg;-><init>(Lcom/google/android/gms/internal/fi;Lcom/google/android/gms/internal/ff$a;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fg$b;->mw:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/fg$b;->tu:Lcom/google/android/gms/internal/ff$a;

    new-instance v0, Lcom/google/android/gms/internal/fh;

    iget-object v1, p2, Lcom/google/android/gms/internal/fi;->lD:Lcom/google/android/gms/internal/gt;

    iget v1, v1, Lcom/google/android/gms/internal/gt;->wF:I

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/fh;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;

    iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->connect()V

    return-void
.end method


# virtual methods
.method public cC()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/fg$b;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->disconnect()V

    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public cD()Lcom/google/android/gms/internal/fm;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/fg$b;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->cE()Lcom/google/android/gms/internal/fm;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    monitor-exit v1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/fg$b;->start()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tu:Lcom/google/android/gms/internal/ff$a;

    new-instance v1, Lcom/google/android/gms/internal/fk;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ff$a;->a(Lcom/google/android/gms/internal/fk;)V

    return-void
.end method

.method public onDisconnected()V
    .locals 1

    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    return-void
.end method
