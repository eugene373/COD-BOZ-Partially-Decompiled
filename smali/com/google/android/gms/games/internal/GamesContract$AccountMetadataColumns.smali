.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$AccountMetadataColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AccountMetadataColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "account_name"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "external_player_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "match_sync_token"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "last_package_scan_timestamp"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "quest_sync_token"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "quest_sync_metadata_token"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "request_sync_token"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "xp_sync_token"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "cover_photo_image_id"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "cover_photo_image_uri"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "cover_photo_image_url"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$AccountMetadataColumns;->XV:[Ljava/lang/String;

    return-void
.end method
