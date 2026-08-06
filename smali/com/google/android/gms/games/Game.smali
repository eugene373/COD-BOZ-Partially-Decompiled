.class public interface abstract Lcom/google/android/gms/games/Game;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/google/android/gms/common/data/Freezable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lcom/google/android/gms/common/data/Freezable",
        "<",
        "Lcom/google/android/gms/games/Game;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract areSnapshotsEnabled()Z
.end method

.method public abstract getAchievementTotalCount()I
.end method

.method public abstract getApplicationId()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public abstract getDescription(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract getDeveloperName()Ljava/lang/String;
.end method

.method public abstract getDeveloperName(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract getDisplayName()Ljava/lang/String;
.end method

.method public abstract getDisplayName(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract getFeaturedImageUri()Landroid/net/Uri;
.end method

.method public abstract getFeaturedImageUrl()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getHiResImageUri()Landroid/net/Uri;
.end method

.method public abstract getHiResImageUrl()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getIconImageUri()Landroid/net/Uri;
.end method

.method public abstract getIconImageUrl()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getLeaderboardCount()I
.end method

.method public abstract getPrimaryCategory()Ljava/lang/String;
.end method

.method public abstract getSecondaryCategory()Ljava/lang/String;
.end method

.method public abstract getThemeColor()Ljava/lang/String;
.end method

.method public abstract isMuted()Z
.end method

.method public abstract isRealTimeMultiplayerEnabled()Z
.end method

.method public abstract isTurnBasedMultiplayerEnabled()Z
.end method

.method public abstract jO()Z
.end method

.method public abstract jP()Z
.end method

.method public abstract jQ()Z
.end method

.method public abstract jR()Ljava/lang/String;
.end method

.method public abstract jS()I
.end method
