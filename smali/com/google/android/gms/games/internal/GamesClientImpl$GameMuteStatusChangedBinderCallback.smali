.class final Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;
.super Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "GameMuteStatusChangedBinderCallback"
.end annotation


# instance fields
.field private final De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic WC:Lcom/google/android/gms/games/internal/GamesClientImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "holder":Lcom/google/android/gms/common/api/BaseImplementation$b;, "Lcom/google/android/gms/common/api/BaseImplementation$b<Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;>;"
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/BaseImplementation$b;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;-><init>(ILjava/lang/String;Z)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    return-void
.end method
