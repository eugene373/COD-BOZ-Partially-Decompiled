.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;
.super Ljava/lang/Object;
.source "s3eGooglePlayServicesActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadPlayerCenteredScores(Ljava/lang/String;IIIZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback",
        "<",
        "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .prologue
    .line 309
    check-cast p1, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;->onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;)V
    .locals 10

    .prologue
    .line 312
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_2

    .line 314
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getScores()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->getCount()I

    move-result v1

    .line 315
    if-lez v1, :cond_1

    .line 317
    new-instance v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;

    invoke-direct {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;-><init>()V

    .line 318
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getLeaderboard()Lcom/google/android/gms/games/leaderboard/Leaderboard;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/Leaderboard;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->name:Ljava/lang/String;

    .line 319
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getLeaderboard()Lcom/google/android/gms/games/leaderboard/Leaderboard;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/Leaderboard;->getLeaderboardId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->id:Ljava/lang/String;

    .line 320
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getLeaderboard()Lcom/google/android/gms/games/leaderboard/Leaderboard;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/Leaderboard;->getScoreOrder()I

    move-result v0

    iput v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->scoreOrder:I

    .line 321
    new-array v0, v1, [Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;

    iput-object v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->scores:[Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;

    .line 322
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getScores()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;

    move-result-object v3

    .line 323
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 325
    invoke-virtual {v3, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->get(I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;

    move-result-object v4

    .line 326
    new-instance v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;

    invoke-direct {v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;-><init>()V

    .line 327
    invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayRank()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->rank:Ljava/lang/String;

    .line 328
    invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getRawScore()J

    move-result-wide v6

    iput-wide v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->score:J

    .line 329
    invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayScore()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->displayScore:Ljava/lang/String;

    .line 330
    invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolderDisplayName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->name:Ljava/lang/String;

    .line 331
    invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolder()Lcom/google/android/gms/games/Player;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->playerID:Ljava/lang/String;

    .line 332
    invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getTimestampMillis()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    long-to-int v4, v6

    iput v4, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->timestamp:I

    .line 333
    iget-object v4, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->scores:[Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;

    aput-object v5, v4, v0

    .line 323
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 335
    :cond_0
    invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_PlayerCenteredScoresLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;)V

    .line 342
    :cond_1
    :goto_1
    return-void

    .line 340
    :cond_2
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$200()I

    move-result v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V

    goto :goto_1
.end method
