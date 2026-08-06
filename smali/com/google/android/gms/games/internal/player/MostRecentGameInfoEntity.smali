.class public final Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntityCreator;


# instance fields
.field private final BR:I

.field private final aaM:Ljava/lang/String;

.field private final aaN:Ljava/lang/String;

.field private final aaO:J

.field private final aaP:Landroid/net/Uri;

.field private final aaQ:Landroid/net/Uri;

.field private final aaR:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntityCreator;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntityCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->CREATOR:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntityCreator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;JLandroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "gameId"    # Ljava/lang/String;
    .param p3, "gameName"    # Ljava/lang/String;
    .param p4, "activityTimestampMillis"    # J
    .param p6, "gameIconImageUri"    # Landroid/net/Uri;
    .param p7, "gameHiResIconImageUri"    # Landroid/net/Uri;
    .param p8, "gameFeaturedImageUri"    # Landroid/net/Uri;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->BR:I

    iput-object p2, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaM:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaN:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaO:J

    iput-object p6, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaP:Landroid/net/Uri;

    iput-object p7, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaQ:Landroid/net/Uri;

    iput-object p8, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaR:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;)V
    .locals 2
    .param p1, "info"    # Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->BR:I

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lp()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaM:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lq()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaN:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lr()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaO:J

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->ls()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaP:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lt()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaQ:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lu()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaR:Landroid/net/Uri;

    return-void
.end method

.method static a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;)I
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lp()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lq()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lr()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->ls()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lt()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lu()Landroid/net/Uri;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lp()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lp()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lq()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lq()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lr()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lr()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->ls()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->ls()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lt()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lt()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lu()Landroid/net/Uri;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lu()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method static b(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "GameId"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "GameName"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lq()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "ActivityTimestampMillis"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lr()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "GameIconUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->ls()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "GameHiResUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lt()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    const-string v1, "GameFeaturedUri"

    invoke-interface {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;->lu()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->lv()Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;

    move-result-object v0

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->BR:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;)I

    move-result v0

    return v0
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public lp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaM:Ljava/lang/String;

    return-object v0
.end method

.method public lq()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaN:Ljava/lang/String;

    return-object v0
.end method

.method public lr()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaO:J

    return-wide v0
.end method

.method public ls()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaP:Landroid/net/Uri;

    return-object v0
.end method

.method public lt()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaQ:Landroid/net/Uri;

    return-object v0
.end method

.method public lu()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->aaR:Landroid/net/Uri;

    return-object v0
.end method

.method public lv()Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->b(Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntityCreator;->a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Landroid/os/Parcel;I)V

    return-void
.end method
