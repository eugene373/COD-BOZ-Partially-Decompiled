.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$InvitationsColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "InvitationsColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "game_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "external_invitation_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "external_inviter_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "creation_timestamp"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "last_modified_timestamp"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "description"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "type"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "variant"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "has_automatch_criteria"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "automatch_min_players"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "automatch_max_players"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "inviter_in_circles"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$InvitationsColumns;->XV:[Ljava/lang/String;

    return-void
.end method
