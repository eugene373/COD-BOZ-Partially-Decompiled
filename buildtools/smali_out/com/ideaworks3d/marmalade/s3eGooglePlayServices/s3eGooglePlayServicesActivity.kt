package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServicesActivity.java.
// 10 fields, 37 methods.

open class s3eGooglePlayServicesActivity: com.ideaworks3d.marmalade.s3eGooglePlayServices.BaseGameActivity() {
    public constructor()

    public fun incrementAchievement(p0: String, p1: Int, p2: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IZ)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         if-nez p3, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/games/achievement/Achievements;->increment(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V
    //         :goto_0
    //         const/4 v0, 0x1
    //         :goto_1
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/games/achievement/Achievements;->incrementImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun loadAchievements(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v1, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v2
    //         invoke-interface {v1, v2, v0}, Lcom/google/android/gms/games/achievement/Achievements;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun loadCurrentPlayerLeaderboardScore(p0: String, p1: Int, p2: Int): Boolean { return TODO("body: (Ljava/lang/String;II)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->loadCurrentPlayerLeaderboardScore(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;II)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun loadPlayerCenteredScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IIIZ)Z") }
    /*
    //         .locals 7
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         move-object v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move v6, p5
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->loadPlayerCenteredScores(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun loadTopScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IIIZ)Z") }
    /*
    //         .locals 7
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         move-object v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move v6, p5
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->loadTopScores(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$7;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$7;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "onCreate called"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         sput-object p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->singleton:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         invoke-super {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->onCreate(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun onSignInFailed() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "onSignInFailed called"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->hasSignInError()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_SIGNING_IN:I
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V
    //         :cond_0
    //         return-void
    */

    public fun onSignInSucceeded() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "onSignInSucceeded called begin"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayMatchMakingSubscribeOnInvitation()Z
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_SignInCallback()V
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "onSignInSucceeded called end"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun onSignOut() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "onSignOut called"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_SignOutCallback()V
    //         return-void
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->onStart()V
    //         return-void
    */

    public fun revealAchievement(p0: String, p1: Boolean): Boolean { return TODO("body: (Ljava/lang/String;Z)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         if-nez p2, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->reveal(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    //         :goto_0
    //         const/4 v0, 0x1
    //         :goto_1
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->revealImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun showAchievements(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showAchievements"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Lcom/google/android/gms/games/achievement/Achievements;->getAchievementsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;
    //         move-result-object v1
    //         const/16 v2, 0x1389
    //         invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "Achivements not available"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun showAllLeaderboards(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showLeaderboards"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->getAllLeaderboardsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;
    //         move-result-object v1
    //         const/16 v2, 0x1389
    //         invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "Leaderboards not available"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun showLeaderboard(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showLeaderboards"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v2
    //         invoke-interface {v1, v2, p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->getLeaderboardIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v1
    //         const/16 v2, 0x1389
    //         invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "Leaderboards not available"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun showMatchMakingInvitePlayersDialog(p0: Int, p1: Int, p2: Int): Boolean { return TODO("body: (III)Z") }
    /*
    //         .locals 4
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showMatchMakingInvitePlayersDialog"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->getSelectOpponentsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;II)Landroid/content/Intent;
    //         move-result-object v0
    //         const-string v1, "s3eGooglePlayGamesActivity"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "showMatchMakingInvitePlayersDialog intent = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v1
    //         invoke-virtual {v1, v0, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showMatchMakingInvitePlayersDialog not available"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun showMatchMakingInvitingListDialog(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 4
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showMatchMakingInvitingListDialog"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Invitations:Lcom/google/android/gms/games/multiplayer/Invitations;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/games/multiplayer/Invitations;->getInvitationInboxIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;
    //         move-result-object v0
    //         const-string v1, "s3eGooglePlayGamesActivity"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "showMatchMakingInvitingListDialog intent = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v1
    //         invoke-virtual {v1, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "s3eGooglePlayGamesActivity"
    //         const-string v1, "showMatchMakingInvitingListDialog not available"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun startActivityForResult_transfer(p0: android.content.Intent, p1: Int) { /* TODO(body): (Landroid/content/Intent;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         return-void
    */

    public fun submitScore(p0: String, p1: Int, p2: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IZ)Z") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         if-nez p3, :cond_1
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         int-to-long v2, p2
    //         invoke-interface {v0, v1, p1, v2, v3}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->submitScore(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)V
    //         :goto_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         int-to-long v2, p2
    //         invoke-interface {v0, v1, p1, v2, v3}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->submitScoreImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$8;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$8;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         goto :goto_1
    */

    public fun unlockAchievement(p0: String, p1: Boolean): Boolean { return TODO("body: (Ljava/lang/String;Z)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         if-nez p2, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->unlock(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    //         :goto_0
    //         const/4 v0, 0x1
    //         :goto_1
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->unlockImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$2;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$2;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    companion object {
    private val RC_RESOLVE: Int = 0x1388
    private val RC_UNUSED: Int = 0x1389
    private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_ACHIEVEMENTS: Int
    private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_CURRENT_PLAYER_LEADERBOARD_SCORE: Int
    private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_PLAYER_CENTERED_SCORES: Int
    private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_TOP_SCORES: Int
    private var S3EGOOGLEPLAYSERVICES_ERROR_SIGNING_IN: Int
    private var S3EGOOGLEPLAYSERVICES_ERROR_SUBMIT_SCORE: Int
    private val TAG: String = "s3eGooglePlayGamesActivity"
    @JvmField public var singleton: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity

    public external @JvmStatic fun native_AchievementRevealedCallback(p0: String)

    public external @JvmStatic fun native_AchievementUnlockedCallback(p0: String)

    public external @JvmStatic fun native_AchievementsLoadedCallback(p0: Array<com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayAchievement>)

    public external @JvmStatic fun native_CurrentPlayerLeaderboardScoreLoadedCallback(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayLeaderboardScore)

    public external @JvmStatic fun native_ErrorCallback(p0: Int)

    public external @JvmStatic fun native_MatchMakingGameStart(p0: Int)

    public external @JvmStatic fun native_PlayerCenteredScoresLoadedCallback(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayLeaderboard)

    public external @JvmStatic fun native_ScoreSubmittedCallback(p0: String)

    public external @JvmStatic fun native_SignInCallback()

    public external @JvmStatic fun native_SignOutCallback()

    public external @JvmStatic fun native_TopScoresLoadedCallback(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayLeaderboard)

    }
}
