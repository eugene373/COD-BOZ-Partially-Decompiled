.class public final Lcom/google/android/gms/games/request/GameRequestSummaryBuffer;
.super Lcom/google/android/gms/common/data/DataBuffer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/DataBuffer",
        "<",
        "Lcom/google/android/gms/games/request/GameRequestSummary;",
        ">;"
    }
.end annotation


# virtual methods
.method public dW(I)Lcom/google/android/gms/games/request/GameRequestSummary;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/request/GameRequestSummaryRef;

    iget-object v1, p0, Lcom/google/android/gms/games/request/GameRequestSummaryBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/games/request/GameRequestSummaryRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method

.method public synthetic get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/request/GameRequestSummaryBuffer;->dW(I)Lcom/google/android/gms/games/request/GameRequestSummary;

    move-result-object v0

    return-object v0
.end method
