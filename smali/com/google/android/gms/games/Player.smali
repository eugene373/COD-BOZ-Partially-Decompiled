.class public interface abstract Lcom/google/android/gms/games/Player;
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
        "Lcom/google/android/gms/games/Player;",
        ">;"
    }
.end annotation


# static fields
.field public static final CURRENT_XP_UNKNOWN:J = -0x1L

.field public static final TIMESTAMP_UNKNOWN:J = -0x1L


# virtual methods
.method public abstract getDisplayName()Ljava/lang/String;
.end method

.method public abstract getDisplayName(Landroid/database/CharArrayBuffer;)V
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

.method public abstract getLastPlayedWithTimestamp()J
.end method

.method public abstract getLevelInfo()Lcom/google/android/gms/games/PlayerLevelInfo;
.end method

.method public abstract getPlayerId()Ljava/lang/String;
.end method

.method public abstract getRetrievedTimestamp()J
.end method

.method public abstract getTitle()Ljava/lang/String;
.end method

.method public abstract getTitle(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract hasHiResImage()Z
.end method

.method public abstract hasIconImage()Z
.end method

.method public abstract isProfileVisible()Z
.end method

.method public abstract jU()I
.end method

.method public abstract jV()Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;
.end method
