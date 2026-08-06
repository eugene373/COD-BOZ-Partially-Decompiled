.class public Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
.super Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;
.source "s3eGooglePlayServicesActivity.java"


# static fields
.field private static final RC_RESOLVE:I = 0x1388

.field private static final RC_UNUSED:I = 0x1389

.field private static S3EGOOGLEPLAYSERVICES_ERROR_LOAD_ACHIEVEMENTS:I = 0x0

.field private static S3EGOOGLEPLAYSERVICES_ERROR_LOAD_CURRENT_PLAYER_LEADERBOARD_SCORE:I = 0x0

.field private static S3EGOOGLEPLAYSERVICES_ERROR_LOAD_PLAYER_CENTERED_SCORES:I = 0x0

.field private static S3EGOOGLEPLAYSERVICES_ERROR_LOAD_TOP_SCORES:I = 0x0

.field private static S3EGOOGLEPLAYSERVICES_ERROR_SIGNING_IN:I = 0x0

.field private static S3EGOOGLEPLAYSERVICES_ERROR_SUBMIT_SCORE:I = 0x0

.field private static final TAG:Ljava/lang/String; = "s3eGooglePlayGamesActivity"

.field public static singleton:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->singleton:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    .line 55
    const/4 v0, 0x0

    sput v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_ACHIEVEMENTS:I

    .line 56
    const/4 v0, 0x1

    sput v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_CURRENT_PLAYER_LEADERBOARD_SCORE:I

    .line 57
    const/4 v0, 0x2

    sput v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_PLAYER_CENTERED_SCORES:I

    .line 58
    const/4 v0, 0x3

    sput v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_TOP_SCORES:I

    .line 59
    const/4 v0, 0x4

    sput v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_SUBMIT_SCORE:I

    .line 60
    const/4 v0, 0x5

    sput v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_SIGNING_IN:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    .prologue
    .line 47
    sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_ACHIEVEMENTS:I

    return v0
.end method

.method static synthetic access$100()I
    .locals 1

    .prologue
    .line 47
    sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_CURRENT_PLAYER_LEADERBOARD_SCORE:I

    return v0
.end method

.method static synthetic access$200()I
    .locals 1

    .prologue
    .line 47
    sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_PLAYER_CENTERED_SCORES:I

    return v0
.end method

.method static synthetic access$300()I
    .locals 1

    .prologue
    .line 47
    sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_LOAD_TOP_SCORES:I

    return v0
.end method

.method static synthetic access$400()I
    .locals 1

    .prologue
    .line 47
    sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_SUBMIT_SCORE:I

    return v0
.end method

.method public static native native_AchievementRevealedCallback(Ljava/lang/String;)V
.end method

.method public static native native_AchievementUnlockedCallback(Ljava/lang/String;)V
.end method

.method public static native native_AchievementsLoadedCallback([Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;)V
.end method

.method public static native native_CurrentPlayerLeaderboardScoreLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboardScore;)V
.end method

.method public static native native_ErrorCallback(I)V
.end method

.method public static native native_MatchMakingGameStart(I)V
.end method

.method public static native native_PlayerCenteredScoresLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;)V
.end method

.method public static native native_ScoreSubmittedCallback(Ljava/lang/String;)V
.end method

.method public static native native_SignInCallback()V
.end method

.method public static native native_SignOutCallback()V
.end method

.method public static native native_TopScoresLoadedCallback(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayLeaderboard;)V
.end method


# virtual methods
.method public incrementAchievement(Ljava/lang/String;IZ)Z
    .locals 2

    .prologue
    .line 197
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    if-nez p3, :cond_0

    .line 201
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/games/achievement/Achievements;->increment(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V

    .line 217
    :goto_0
    const/4 v0, 0x1

    .line 219
    :goto_1
    return v0

    .line 205
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/games/achievement/Achievements;->incrementImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 206
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 219
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public loadAchievements()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 127
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v1

    if-nez v1, :cond_0

    .line 167
    :goto_0
    return v0

    .line 129
    :cond_0
    sget-object v1, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/games/achievement/Achievements;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 130
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    .line 167
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public loadCurrentPlayerLeaderboardScore(Ljava/lang/String;II)Z
    .locals 2

    .prologue
    .line 269
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    const/4 v0, 0x0

    .line 301
    :goto_0
    return v0

    .line 271
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->loadCurrentPlayerLeaderboardScore(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;II)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 272
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$5;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    .line 301
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public loadPlayerCenteredScores(Ljava/lang/String;IIIZ)Z
    .locals 7

    .prologue
    .line 305
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 306
    const/4 v0, 0x0

    .line 344
    :goto_0
    return v0

    .line 307
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->loadPlayerCenteredScores(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 308
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$6;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    .line 344
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public loadTopScores(Ljava/lang/String;IIIZ)Z
    .locals 7

    .prologue
    .line 348
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 349
    const/4 v0, 0x0

    .line 387
    :goto_0
    return v0

    .line 350
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->loadTopScores(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;IIIZ)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 351
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$7;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$7;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    .line 387
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 78
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "onCreate called"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    sput-object p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->singleton:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    .line 80
    invoke-super {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->onCreate(Landroid/os/Bundle;)V

    .line 81
    return-void
.end method

.method public onSignInFailed()V
    .locals 2

    .prologue
    .line 97
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "onSignInFailed called"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->hasSignInError()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    sget v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->S3EGOOGLEPLAYSERVICES_ERROR_SIGNING_IN:I

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V

    .line 102
    :cond_0
    return-void
.end method

.method public onSignInSucceeded()V
    .locals 2

    .prologue
    .line 107
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "onSignInSucceeded called begin"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayMatchMakingSubscribeOnInvitation()Z

    .line 109
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_SignInCallback()V

    .line 110
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "onSignInSucceeded called end"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    return-void
.end method

.method public onSignOut()V
    .locals 2

    .prologue
    .line 116
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "onSignOut called"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_SignOutCallback()V

    .line 118
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 86
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->onStart()V

    .line 87
    return-void
.end method

.method public revealAchievement(Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 223
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    if-nez p2, :cond_0

    .line 227
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->reveal(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V

    .line 243
    :goto_0
    const/4 v0, 0x1

    .line 245
    :goto_1
    return v0

    .line 231
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->revealImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 232
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 245
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public showAchievements()Z
    .locals 3

    .prologue
    .line 249
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showAchievements"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/games/achievement/Achievements;->getAchievementsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x1389

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 259
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 256
    :cond_0
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "Achivements not available"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public showAllLeaderboards()Z
    .locals 3

    .prologue
    .line 419
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showLeaderboards"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 420
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 422
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->getAllLeaderboardsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x1389

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 429
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 426
    :cond_0
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "Leaderboards not available"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 427
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public showLeaderboard(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 433
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showLeaderboards"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 434
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->getLeaderboardIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x1389

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 443
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 440
    :cond_0
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "Leaderboards not available"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 441
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public showMatchMakingInvitePlayersDialog(III)Z
    .locals 4

    .prologue
    .line 456
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showMatchMakingInvitePlayersDialog"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 457
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->getSelectOpponentsIntent(Lcom/google/android/gms/common/api/GoogleApiClient;II)Landroid/content/Intent;

    move-result-object v0

    .line 460
    const-string v1, "s3eGooglePlayGamesActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showMatchMakingInvitePlayersDialog intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 461
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 468
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 465
    :cond_0
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showMatchMakingInvitePlayersDialog not available"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 466
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public showMatchMakingInvitingListDialog(I)Z
    .locals 4

    .prologue
    .line 473
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showMatchMakingInvitingListDialog"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 474
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    sget-object v0, Lcom/google/android/gms/games/Games;->Invitations:Lcom/google/android/gms/games/multiplayer/Invitations;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/multiplayer/Invitations;->getInvitationInboxIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v0

    .line 477
    const-string v1, "s3eGooglePlayGamesActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showMatchMakingInvitingListDialog intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 478
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 485
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 482
    :cond_0
    const-string v0, "s3eGooglePlayGamesActivity"

    const-string v1, "showMatchMakingInvitingListDialog not available"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 483
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public startActivityForResult_transfer(Landroid/content/Intent;I)V
    .locals 1

    .prologue
    .line 448
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 449
    return-void
.end method

.method public submitScore(Ljava/lang/String;IZ)Z
    .locals 4

    .prologue
    .line 391
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 392
    const/4 v0, 0x0

    .line 415
    :goto_0
    return v0

    .line 393
    :cond_0
    if-nez p3, :cond_1

    .line 395
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    int-to-long v2, p2

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->submitScore(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)V

    .line 415
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 399
    :cond_1
    sget-object v0, Lcom/google/android/gms/games/Games;->Leaderboards:Lcom/google/android/gms/games/leaderboard/Leaderboards;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    int-to-long v2, p2

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/google/android/gms/games/leaderboard/Leaderboards;->submitScoreImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;J)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 400
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$8;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$8;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_1
.end method

.method public unlockAchievement(Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 171
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    if-nez p2, :cond_0

    .line 175
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->unlock(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V

    .line 191
    :goto_0
    const/4 v0, 0x1

    .line 193
    :goto_1
    return v0

    .line 179
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Achievements:Lcom/google/android/gms/games/achievement/Achievements;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/games/achievement/Achievements;->unlockImmediate(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    .line 180
    new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$2;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$2;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 193
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
