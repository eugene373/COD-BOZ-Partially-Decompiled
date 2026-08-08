package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServicesActivity.java.
// 1 fields, 3 methods.

open class s3eGooglePlayServicesActivity_Anon7() {
    val thisRef0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity? = null

    constructor(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity) : this()

    public fun onResult(p0: com.google.android.gms.common.api.Result) { /* TODO(body): (Lcom/google/android/gms/common/api/Result;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$7;->onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;)V
    //         return-void
    */

    public fun onResult(p0: com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult) { /* TODO(body): (Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;)V */ }
    /*
    //         .locals 10
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         if-nez v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getScores()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->getCount()I
    //         move-result v1
    //         if-lez v1, :cond_1
    //         new-instance v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;
    //         invoke-direct {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;-><init>()V
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getLeaderboard()Lcom/google/android/gms/games/leaderboard/Leaderboard;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/Leaderboard;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->name:Ljava/lang/String;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getLeaderboard()Lcom/google/android/gms/games/leaderboard/Leaderboard;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/Leaderboard;->getLeaderboardId()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->id:Ljava/lang/String;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getLeaderboard()Lcom/google/android/gms/games/leaderboard/Leaderboard;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/Leaderboard;->getScoreOrder()I
    //         move-result v0
    //         iput v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->scoreOrder:I
    //         new-array v0, v1, [Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;
    //         iput-object v0, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->scores:[Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;->getScores()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    //         move-result-object v3
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v1, :cond_0
    //         invoke-virtual {v3, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->get(I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //         move-result-object v4
    //         new-instance v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;
    //         invoke-direct {v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;-><init>()V
    //         invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayRank()Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->rank:Ljava/lang/String;
    //         invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getRawScore()J
    //         move-result-wide v6
    //         iput-wide v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->score:J
    //         invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayScore()Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->displayScore:Ljava/lang/String;
    //         invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolderDisplayName()Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->name:Ljava/lang/String;
    //         invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolder()Lcom/google/android/gms/games/Player;
    //         move-result-object v6
    //         invoke-interface {v6}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v6
    //         iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->playerID:Ljava/lang/String;
    //         invoke-interface {v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getTimestampMillis()J
    //         move-result-wide v6
    //         const-wide/16 v8, 0x3e8
    //         div-long/2addr v6, v8
    //         long-to-int v4, v6
    //         iput v4, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->timestamp:I
    //         iget-object v4, v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;->scores:[Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;
    //         aput-object v5, v4, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_TopScoresLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;)V
    //         :cond_1
    //         :goto_1
    //         return-void
    //         :cond_2
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$300()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V
    //         goto :goto_1
    */

}