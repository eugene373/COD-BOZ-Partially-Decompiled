.class final Lcom/google/android/gms/games/internal/GamesClientImpl$InitiateMatchResultImpl;
.super Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchResult;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$InitiateMatchResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InitiateMatchResultImpl"
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchResult;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method
