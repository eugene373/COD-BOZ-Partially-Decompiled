.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;
.super Ljava/lang/Object;
.source "s3eGooglePlayServicesActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->incrementAchievement(Ljava/lang/String;IZ)Z
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
        "Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .prologue
    .line 206
    check-cast p1, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;->onResult(Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;)V
    .locals 2

    .prologue
    .line 210
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    const/16 v1, 0xbbb

    if-ne v0, v1, :cond_1

    .line 212
    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getAchievementId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_AchievementUnlockedCallback(Ljava/lang/String;)V

    .line 214
    :cond_1
    return-void
.end method
