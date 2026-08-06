.class abstract Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadOwnerCoverPhotoUrisImpl;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/PlayersImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "LoadOwnerCoverPhotoUrisImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl",
        "<",
        "Lcom/google/android/gms/games/Players$LoadOwnerCoverPhotoUrisResult;",
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
.method public ac(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Players$LoadOwnerCoverPhotoUrisResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadOwnerCoverPhotoUrisImpl$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadOwnerCoverPhotoUrisImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadOwnerCoverPhotoUrisImpl;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadOwnerCoverPhotoUrisImpl;->ac(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Players$LoadOwnerCoverPhotoUrisResult;

    move-result-object v0

    return-object v0
.end method
