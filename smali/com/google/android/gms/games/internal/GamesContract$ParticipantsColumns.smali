.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$ParticipantsColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ParticipantsColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "match_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "invitation_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "external_participant_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "player_id"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "default_display_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "default_display_image_url"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "default_display_hi_res_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "default_display_hi_res_image_url"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "default_display_name"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "player_status"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "client_address"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "result_type"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "placing"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "connected"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "capabilities"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$ParticipantsColumns;->XV:[Ljava/lang/String;

    return-void
.end method
