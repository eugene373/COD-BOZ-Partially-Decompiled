.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$MatchesColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MatchesColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x18

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "game_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "external_match_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "creator_external"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "creation_timestamp"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "last_updater_external"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "last_updated_timestamp"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "pending_participant_external"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "data"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "status"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "description"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "version"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "variant"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "notification_text"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "user_match_status"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "has_automatch_criteria"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "automatch_min_players"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "automatch_max_players"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "automatch_bit_mask"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "automatch_wait_estimate_sec"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "rematch_id"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "match_number"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "previous_match_data"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "upsync_required"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "description_participant_id"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$MatchesColumns;->XV:[Ljava/lang/String;

    return-void
.end method
