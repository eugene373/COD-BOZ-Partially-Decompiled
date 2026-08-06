.class final Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;
.super Lcom/google/android/gms/common/api/a;

# interfaces
.implements Lcom/google/android/gms/games/request/Requests$UpdateRequestsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "UpdateRequestsResultImpl"
.end annotation


# instance fields
.field private final XU:Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-static {p1}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->V(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;->XU:Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;

    return-void
.end method


# virtual methods
.method public getRequestIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;->XU:Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->getRequestIds()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getRequestOutcome(Ljava/lang/String;)I
    .locals 1
    .param p1, "requestId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;->XU:Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->getRequestOutcome(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
