.class final Lcom/google/android/gms/games/internal/GamesClientImpl$LoadGameInstancesResultImpl;
.super Lcom/google/android/gms/common/api/a;

# interfaces
.implements Lcom/google/android/gms/games/GamesMetadata$LoadGameInstancesResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LoadGameInstancesResultImpl"
.end annotation


# instance fields
.field private final WU:Lcom/google/android/gms/games/internal/game/GameInstanceBuffer;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/internal/game/GameInstanceBuffer;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/internal/game/GameInstanceBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadGameInstancesResultImpl;->WU:Lcom/google/android/gms/games/internal/game/GameInstanceBuffer;

    return-void
.end method
