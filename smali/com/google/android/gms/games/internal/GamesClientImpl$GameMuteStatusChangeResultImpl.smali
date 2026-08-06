.class final Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "GameMuteStatusChangeResultImpl"
.end annotation


# instance fields
.field private final CM:Lcom/google/android/gms/common/api/Status;

.field private final WJ:Ljava/lang/String;

.field private final WK:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 1
    .param p1, "statusCode"    # I
    .param p2, "externalGameId"    # Ljava/lang/String;
    .param p3, "isMuted"    # Z

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;->CM:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;->WJ:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;->WK:Z

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;->CM:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
