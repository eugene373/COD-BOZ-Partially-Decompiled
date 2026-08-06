.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$AchievementDefinitionsColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AchievementDefinitionsColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "game_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "external_achievement_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "type"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "name"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "description"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "unlocked_icon_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "unlocked_icon_image_uri"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "unlocked_icon_image_url"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "revealed_icon_image_id"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "revealed_icon_image_uri"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "revealed_icon_image_url"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "total_steps"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "formatted_total_steps"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "initial_state"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "sorting_rank"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "definition_xp_value"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$AchievementDefinitionsColumns;->XV:[Ljava/lang/String;

    return-void
.end method
