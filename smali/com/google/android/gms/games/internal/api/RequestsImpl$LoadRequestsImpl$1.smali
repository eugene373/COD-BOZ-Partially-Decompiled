.class Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/request/Requests$LoadRequestsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl;->al(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/request/Requests$LoadRequestsResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic CW:Lcom/google/android/gms/common/api/Status;

.field final synthetic ZI:Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;->ZI:Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRequests(I)Lcom/google/android/gms/games/request/GameRequestBuffer;
    .locals 2
    .param p1, "type"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    new-instance v1, Lcom/google/android/gms/games/request/GameRequestBuffer;

    invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/request/GameRequestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v1
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method
