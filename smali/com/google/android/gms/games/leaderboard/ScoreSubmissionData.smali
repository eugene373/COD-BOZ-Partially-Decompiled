.class public final Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;
    }
.end annotation


# static fields
.field private static final abs:[Ljava/lang/String;


# instance fields
.field private HF:I

.field private VK:Ljava/lang/String;

.field private abY:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;",
            ">;"
        }
    .end annotation
.end field

.field private abu:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "leaderboardId"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "playerId"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "timeSpan"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "hasResult"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "rawScore"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "formattedScore"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "newBest"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "scoreTag"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abs:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 9
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->HF:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getCount()I

    move-result v7

    const/4 v0, 0x3

    if-ne v7, v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->K(Z)V

    move v0, v1

    :goto_1
    if-ge v0, v7, :cond_3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/data/DataHolder;->ar(I)I

    move-result v8

    if-nez v0, :cond_0

    const-string v1, "leaderboardId"

    invoke-virtual {p1, v1, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abu:Ljava/lang/String;

    const-string v1, "playerId"

    invoke-virtual {p1, v1, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->VK:Ljava/lang/String;

    :cond_0
    const-string v1, "hasResult"

    invoke-virtual {p1, v1, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->d(Ljava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;

    const-string v2, "rawScore"

    invoke-virtual {p1, v2, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->a(Ljava/lang/String;II)J

    move-result-wide v2

    const-string v4, "formattedScore"

    invoke-virtual {p1, v4, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v4

    const-string v5, "scoreTag"

    invoke-virtual {p1, v5, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "newBest"

    invoke-virtual {p1, v6, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->d(Ljava/lang/String;II)Z

    move-result v6

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "timeSpan"

    invoke-virtual {p1, v2, v0, v8}, Lcom/google/android/gms/common/data/DataHolder;->b(Ljava/lang/String;II)I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->a(Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;I)V

    :cond_1
    add-int/lit8 v1, v0, 0x1

    move v0, v1

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private a(Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getLeaderboardId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abu:Ljava/lang/String;

    return-object v0
.end method

.method public getPlayerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->VK:Ljava/lang/String;

    return-object v0
.end method

.method public getScoreResult(I)Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;
    .locals 2
    .param p1, "timeSpan"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "PlayerId"

    iget-object v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->VK:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "StatusCode"

    iget v2, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->HF:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v0, 0x3

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->abY:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;

    const-string v3, "TimesSpan"

    invoke-static {v1}, Lcom/google/android/gms/games/internal/constants/TimeSpan;->dH(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    const-string v3, "Result"

    if-nez v0, :cond_0

    const-string v0, "null"

    :goto_1
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
