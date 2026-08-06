.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$GameBadgesColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GameBadgesColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "badge_game_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "badge_type"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "badge_title"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "badge_description"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "badge_icon_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "badge_icon_image_uri"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$GameBadgesColumns;->XV:[Ljava/lang/String;

    return-void
.end method
