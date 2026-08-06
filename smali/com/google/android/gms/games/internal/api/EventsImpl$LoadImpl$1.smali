.class Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/event/Events$LoadEventsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl;->O(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/event/Events$LoadEventsResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic CW:Lcom/google/android/gms/common/api/Status;

.field final synthetic Ys:Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl$1;->Ys:Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl$1;->CW:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEvents()Lcom/google/android/gms/games/event/EventBuffer;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/event/EventBuffer;

    const/16 v1, 0xe

    invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/event/EventBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl$1;->CW:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method
