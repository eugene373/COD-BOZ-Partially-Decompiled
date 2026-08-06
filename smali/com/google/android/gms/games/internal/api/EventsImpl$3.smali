.class Lcom/google/android/gms/games/internal/api/EventsImpl$3;
.super Lcom/google/android/gms/games/internal/api/EventsImpl$UpdateImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/api/EventsImpl;->increment(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Yp:Lcom/google/android/gms/games/internal/api/EventsImpl;

.field final synthetic Yq:Ljava/lang/String;

.field final synthetic Yr:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/api/EventsImpl;Ljava/lang/String;I)V
    .locals 1

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$3;->Yp:Lcom/google/android/gms/games/internal/api/EventsImpl;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$3;->Yq:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$3;->Yr:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/games/internal/api/EventsImpl$UpdateImpl;-><init>(Lcom/google/android/gms/games/internal/api/EventsImpl$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/EventsImpl$3;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$3;->Yq:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$3;->Yr:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->n(Ljava/lang/String;I)V

    return-void
.end method
