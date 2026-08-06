.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;
.super Ljava/lang/Object;
.source "s3eGooglePlayServicesActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadAchievements()Z
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
        "Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .prologue
    .line 130
    check-cast p1, Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$1;->onResult(Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;)V
    .locals 10

    .prologue
    .line 133
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_3

    .line 135
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;->getAchievements()Lcom/google/android/gms/games/achievement/AchievementBuffer;

    move-result-object v1

    .line 136
    invoke-virtual {v1}, Lcom/google/android/gms/games/achievement/AchievementBuffer;->getCount()I

    move-result v2

    .line 137
    if-lez v2, :cond_2

    .line 139
    new-array v3, v2, [Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;

    .line 140
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    .line 142
    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/achievement/AchievementBuffer;->get(I)Lcom/google/android/gms/games/achievement/Achievement;

    move-result-object v4

    .line 143
    new-instance v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;

    invoke-direct {v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;-><init>()V

    .line 144
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getAchievementId()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->id:Ljava/lang/String;

    .line 145
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->name:Ljava/lang/String;

    .line 146
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->description:Ljava/lang/String;

    .line 147
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v6

    iput v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->type:I

    .line 148
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I

    move-result v6

    iput v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->status:I

    .line 149
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    .line 151
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getCurrentSteps()I

    move-result v6

    iput v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->currentSteps:I

    .line 152
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getTotalSteps()I

    move-result v6

    iput v6, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->totalSteps:I

    .line 154
    :cond_0
    invoke-interface {v4}, Lcom/google/android/gms/games/achievement/Achievement;->getLastUpdatedTimestamp()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    long-to-int v4, v6

    iput v4, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->lastUpdate:I

    .line 155
    aput-object v5, v3, v0

    .line 156
    const-string v4, "s3eGooglePlayGamesActivity"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " status is "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v5, v5, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;->status:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 158
    :cond_1
    invoke-static {v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_AchievementsLoadedCallback([Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayAchievement;)V

    .line 165
    :cond_2
    :goto_1
    return-void

    .line 163
    :cond_3
    invoke-static {}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->access$000()I

    move-result v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_ErrorCallback(I)V

    goto :goto_1
.end method
