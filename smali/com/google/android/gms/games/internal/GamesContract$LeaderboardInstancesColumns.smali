.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$LeaderboardInstancesColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "LeaderboardInstancesColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "leaderboard_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "timespan"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "collection"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "player_raw_score"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "player_display_score"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "player_rank"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "player_display_rank"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "player_score_tag"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "total_scores"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "top_page_token_next"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "window_page_token_prev"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "window_page_token_next"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$LeaderboardInstancesColumns;->XV:[Ljava/lang/String;

    return-void
.end method
