package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServicesActivity.java.
// 1 fields, 3 methods.

open class s3eGooglePlayServicesActivity_Anon8: com.google.android.gms.common.api.ResultCallback {
    val this$0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity

    constructor(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity)

    public fun onResult(p0: com.google.android.gms.common.api.Result) { /* TODO(body): (Lcom/google/android/gms/common/api/Result;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/games/leaderboard/Leaderboards$SubmitScoreResult;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$8;->onResult(Lcom/google/android/gms/games/leaderboard/Leaderboards$SubmitScoreResult;)V
    //         return-void
    */

    public fun onResult(p0: com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult) { /* TODO(body): (Lcom/google/android/gms/games/leaderboard/Leaderboards$SubmitScoreResult;)V */ }
    /*
    //         .locals 1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$SubmitScoreResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards$SubmitScoreResult;->getScoreData()Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/leaderboard/ScoreSubmissionData;->getLeaderboardId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ScoreSubmittedCallback(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$400()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V
    //         goto :goto_0
    */

}
