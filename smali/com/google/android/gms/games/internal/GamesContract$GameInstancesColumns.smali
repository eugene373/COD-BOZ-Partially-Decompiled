.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$GameInstancesColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GameInstancesColumns"
.end annotation


# static fields
.field public static final XV:[Ljava/lang/String;

.field public static final XW:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "instance_game_id"

    aput-object v1, v0, v3

    const-string v1, "real_time_support"

    aput-object v1, v0, v4

    const-string v1, "turn_based_support"

    aput-object v1, v0, v5

    const-string v1, "platform_type"

    aput-object v1, v0, v6

    const-string v1, "instance_display_name"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "package_name"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "piracy_check"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "installed"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "preferred"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$GameInstancesColumns;->XV:[Ljava/lang/String;

    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "installed"

    aput-object v1, v0, v3

    const-string v1, "package_name"

    aput-object v1, v0, v4

    const-string v1, "real_time_support"

    aput-object v1, v0, v5

    const-string v1, "turn_based_support"

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$GameInstancesColumns;->XW:[Ljava/lang/String;

    return-void
.end method
