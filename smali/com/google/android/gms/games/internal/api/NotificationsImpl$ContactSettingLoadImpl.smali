.class abstract Lcom/google/android/gms/games/internal/api/NotificationsImpl$ContactSettingLoadImpl;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/NotificationsImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "ContactSettingLoadImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl",
        "<",
        "Lcom/google/android/gms/games/Notifications$ContactSettingLoadResult;",
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
.method public aa(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Notifications$ContactSettingLoadResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/api/NotificationsImpl$ContactSettingLoadImpl$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/api/NotificationsImpl$ContactSettingLoadImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/NotificationsImpl$ContactSettingLoadImpl;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/NotificationsImpl$ContactSettingLoadImpl;->aa(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Notifications$ContactSettingLoadResult;

    move-result-object v0

    return-object v0
.end method
