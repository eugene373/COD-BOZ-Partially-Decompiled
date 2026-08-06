.class public final Lcom/google/android/gms/internal/cf$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mw:Ljava/lang/Object;

.field private final pN:Lcom/google/android/gms/internal/cf$b;

.field private final pO:Lcom/google/android/gms/internal/cg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cf$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/cf$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/cf$b;Z)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cf$b;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/cf$a;->mw:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/cf$a;->pN:Lcom/google/android/gms/internal/cf$b;

    new-instance v0, Lcom/google/android/gms/internal/cg;

    const v1, 0x5e2978

    invoke-direct {v0, p1, p0, p0, v1}, Lcom/google/android/gms/internal/cg;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->connect()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onConnected(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/bn;->bs()Landroid/os/Bundle;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/cf$a;->mw:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->bC()Lcom/google/android/gms/internal/ch;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/ch;->bD()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cg;->isConnected()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cg;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cg;->disconnect()V

    :cond_1
    :goto_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pN:Lcom/google/android/gms/internal/cf$b;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/cf$b;->a(Landroid/os/Bundle;)V

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    const-string v3, "Error when get Gservice values"

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->isConnected()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->disconnect()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v0, v1

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_4
    const-string v3, "Error when get Gservice values"

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->isConnected()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->disconnect()V

    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cg;->isConnected()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cg;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/cf$a;->pO:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cg;->disconnect()V

    :cond_5
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :cond_6
    move-object v0, v1

    goto :goto_1

    :cond_7
    move-object v0, v1

    goto :goto_0
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/cf$a;->pN:Lcom/google/android/gms/internal/cf$b;

    invoke-static {}, Lcom/google/android/gms/internal/bn;->bs()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/cf$b;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDisconnected()V
    .locals 1

    const-string v0, "Disconnected from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    return-void
.end method
