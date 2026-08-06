.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$NotificationsColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "NotificationsColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "notification_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "game_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "external_sub_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "type"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "ticker"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "title"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "text"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "coalesced_text"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "timestamp"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "acknowledged"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "alert_level"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$NotificationsColumns;->XV:[Ljava/lang/String;

    return-void
.end method
