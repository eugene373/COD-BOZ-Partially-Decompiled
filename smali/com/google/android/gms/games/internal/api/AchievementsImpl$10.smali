.class Lcom/google/android/gms/games/internal/api/AchievementsImpl$10;
.super Lcom/google/android/gms/games/internal/api/AchievementsImpl$LoadImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/AchievementsImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Yf:Z

.field final synthetic Yh:Ljava/lang/String;

.field final synthetic Yi:Ljava/lang/String;


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$10;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$10;->Yh:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$10;->Yi:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$10;->Yf:Z

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
