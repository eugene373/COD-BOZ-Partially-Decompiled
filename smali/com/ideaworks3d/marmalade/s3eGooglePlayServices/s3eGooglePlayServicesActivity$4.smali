.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;
.super Ljava/lang/Object;
.source "s3eGooglePlayServicesActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->revealAchievement(Ljava/lang/String;Z)Z
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
    .line 232
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;->this$0:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .prologue
    .line 232
    check-cast p1, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;

    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$4;->onResult(Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;)V
    .locals 1

    .prologue
    .line 236
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_0

    .line 238
    invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getAchievementId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_AchievementRevealedCallback(Ljava/lang/String;)V

    .line 240
    :cond_0
    return-void
.end method
