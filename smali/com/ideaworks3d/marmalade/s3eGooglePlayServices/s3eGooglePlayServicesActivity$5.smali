.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;
.super Ljava/lang/Object;
.source "s3eGooglePlayServicesActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadCurrentPlayerLeaderboardScore(Ljava/lang/String;II)Z
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
        "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .prologue
    .line 273
    check-cast p1, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;->onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;)V
    .locals 6

    .prologue
    .line 276
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 278
    invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;->getScore()Lcom/google/android/gms/games/leaderboard/LeaderboardScore;

    move-result-object v0

    .line 279
    if-nez v0, :cond_0

    .line 281
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$100()I

    move-result v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V

    .line 299
    :goto_0
    return-void

    .line 285
    :cond_0
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;

    invoke-direct {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;-><init>()V

    .line 286
    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayRank()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->rank:Ljava/lang/String;

    .line 287
    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getRawScore()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->score:J

    .line 288
    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayScore()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->displayScore:Ljava/lang/String;

    .line 289
    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolderDisplayName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->name:Ljava/lang/String;

    .line 290
    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolder()Lcom/google/android/gms/games/Player;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->playerID:Ljava/lang/String;

    .line 291
    invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getTimestampMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    long-to-int v0, v2

    iput v0, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->timestamp:I

    .line 292
    invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_CurrentPlayerLeaderboardScoreLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;)V

    goto :goto_0

    .line 297
    :cond_1
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$100()I

    move-result v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V

    goto :goto_0
.end method
