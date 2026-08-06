.class abstract Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadProfileSettingsResultImpl;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/PlayersImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "LoadProfileSettingsResultImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl",
        "<",
        "Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;-><init>()V

    return-void
.end method


# virtual methods
.method protected ae(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadProfileSettingsResultImpl$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadProfileSettingsResultImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadProfileSettingsResultImpl;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadProfileSettingsResultImpl;->ae(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;

    move-result-object v0

    return-object v0
.end method
