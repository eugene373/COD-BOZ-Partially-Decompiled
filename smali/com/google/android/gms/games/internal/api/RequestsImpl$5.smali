.class Lcom/google/android/gms/games/internal/api/RequestsImpl$5;
.super Lcom/google/android/gms/games/internal/api/RequestsImpl$SendRequestImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/RequestsImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Yi:Ljava/lang/String;

.field final synthetic ZD:[Ljava/lang/String;

.field final synthetic ZE:I

.field final synthetic ZF:[B

.field final synthetic ZG:I


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 7

    iget-object v2, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->Yi:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->ZD:[Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->ZE:I

    iget-object v5, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->ZF:[B

    iget v6, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$5;->ZG:I

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;[Ljava/lang/String;I[BI)V

    return-void
.end method
