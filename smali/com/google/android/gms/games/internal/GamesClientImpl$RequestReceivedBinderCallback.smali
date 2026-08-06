.class final Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;
.super Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "RequestReceivedBinderCallback"
.end annotation


# instance fields
.field final synthetic WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final XA:Lcom/google/android/gms/games/request/OnRequestReceivedListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V
    .locals 0
    .param p2, "listener"    # Lcom/google/android/gms/games/request/OnRequestReceivedListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->XA:Lcom/google/android/gms/games/request/OnRequestReceivedListener;

    return-void
.end method


# virtual methods
.method public o(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 5

    new-instance v1, Lcom/google/android/gms/games/request/GameRequestBuffer;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/request/GameRequestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/request/GameRequestBuffer;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/request/GameRequestBuffer;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/request/GameRequest;

    invoke-interface {v0}, Lcom/google/android/gms/games/request/GameRequest;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/request/GameRequest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/request/GameRequestBuffer;->release()V

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedCallback;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    iget-object v4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->XA:Lcom/google/android/gms/games/request/OnRequestReceivedListener;

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/request/OnRequestReceivedListener;Lcom/google/android/gms/games/request/GameRequest;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/request/GameRequestBuffer;->release()V

    throw v0
.end method

.method public onRequestRemoved(Ljava/lang/String;)V
    .locals 4
    .param p1, "requestId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestRemovedCallback;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;->XA:Lcom/google/android/gms/games/request/OnRequestReceivedListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestRemovedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/request/OnRequestReceivedListener;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V

    return-void
.end method
