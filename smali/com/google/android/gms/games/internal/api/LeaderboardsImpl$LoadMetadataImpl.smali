.class abstract Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/LeaderboardsImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "LoadMetadataImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl",
        "<",
        "Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$1;

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public U(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl;->U(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;

    move-result-object v0

    return-object v0
.end method
