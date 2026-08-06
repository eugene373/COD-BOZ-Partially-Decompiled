.class Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;
.super Lcom/google/android/gms/games/internal/events/EventIncrementCache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GameClientEventIncrementCache"
.end annotation


# instance fields
.field final synthetic WC:Lcom/google/android/gms/games/internal/GamesClientImpl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 2

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;-><init>(Landroid/os/Looper;I)V

    return-void
.end method


# virtual methods
.method protected q(Ljava/lang/String;I)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->n(Ljava/lang/String;I)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "GamesClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to increment event "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because the games client is no longer connected"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
