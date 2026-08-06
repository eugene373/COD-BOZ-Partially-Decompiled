.class final Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardMetadataResultImpl;
.super Lcom/google/android/gms/common/api/a;

# interfaces
.implements Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LeaderboardMetadataResultImpl"
.end annotation


# instance fields
.field private final WP:Lcom/google/android/gms/games/leaderboard/LeaderboardBuffer;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/leaderboard/LeaderboardBuffer;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardMetadataResultImpl;->WP:Lcom/google/android/gms/games/leaderboard/LeaderboardBuffer;

    return-void
.end method


# virtual methods
.method public getLeaderboards()Lcom/google/android/gms/games/leaderboard/LeaderboardBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardMetadataResultImpl;->WP:Lcom/google/android/gms/games/leaderboard/LeaderboardBuffer;

    return-object v0
.end method
