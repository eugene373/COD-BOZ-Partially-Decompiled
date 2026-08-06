.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$PlayersColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PlayersColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x1d

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "external_player_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "profile_icon_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "profile_hi_res_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "profile_icon_image_uri"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "profile_icon_image_url"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "profile_hi_res_image_uri"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "profile_hi_res_image_url"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "profile_name"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "last_updated"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "is_in_circles"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "has_all_public_acls"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "is_profile_visible"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "current_xp_total"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "current_level"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "current_level_min_xp"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "current_level_max_xp"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "next_level"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "next_level_max_xp"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "last_level_up_timestamp"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "player_title"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "most_recent_external_game_id"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "most_recent_game_name"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "most_recent_activity_timestamp"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "most_recent_game_icon_id"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "most_recent_game_icon_uri"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "most_recent_game_hi_res_id"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "most_recent_game_hi_res_uri"

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "most_recent_game_featured_id"

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    const-string v2, "most_recent_game_featured_uri"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$PlayersColumns;->XV:[Ljava/lang/String;

    return-void
.end method
