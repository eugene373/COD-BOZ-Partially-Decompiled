package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServicesActivity.java.
// 1 fields, 3 methods.

open class s3eGooglePlayServicesActivity_Anon5: com.google.android.gms.common.api.ResultCallback {
    val this$0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity

    constructor(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity)

    public fun onResult(p0: com.google.android.gms.common.api.Result) { /* TODO(body): (Lcom/google/android/gms/common/api/Result;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;->onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;)V
    //         return-void
    */

    public fun onResult(p0: com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult) { /* TODO(body): (Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;)V */ }
    /*
    //         .locals 6
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;->getScore()Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$100()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;
    //         invoke-direct {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;-><init>()V
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayRank()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->rank:Ljava/lang/String;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getRawScore()J
    //         move-result-wide v2
    //         iput-wide v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->score:J
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getDisplayScore()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->displayScore:Ljava/lang/String;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolderDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->name:Ljava/lang/String;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getScoreHolder()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         invoke-interface {v2}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->playerID:Ljava/lang/String;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScore;->getTimestampMillis()J
    //         move-result-wide v2
    //         const-wide/16 v4, 0x3e8
    //         div-long/2addr v2, v4
    //         long-to-int v0, v2
    //         iput v0, v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;->timestamp:I
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_CurrentPlayerLeaderboardScoreLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;)V
    //         goto :goto_0
    //         :cond_1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$100()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V
    //         goto :goto_0
    */

}
