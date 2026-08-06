.class public final Lcom/google/android/gms/games/PlayerLevelInfo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/games/PlayerLevelInfoCreator;


# instance fields
.field private final BR:I

.field private final VU:J

.field private final VV:J

.field private final VW:Lcom/google/android/gms/games/PlayerLevel;

.field private final VX:Lcom/google/android/gms/games/PlayerLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/PlayerLevelInfoCreator;

    invoke-direct {v0}, Lcom/google/android/gms/games/PlayerLevelInfoCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/PlayerLevelInfo;->CREATOR:Lcom/google/android/gms/games/PlayerLevelInfoCreator;

    return-void
.end method

.method constructor <init>(IJJLcom/google/android/gms/games/PlayerLevel;Lcom/google/android/gms/games/PlayerLevel;)V
    .locals 2
    .param p1, "versionCode"    # I
    .param p2, "currentXpTotal"    # J
    .param p4, "lastLevelUpTimestamp"    # J
    .param p6, "currentLevel"    # Lcom/google/android/gms/games/PlayerLevel;
    .param p7, "nextLevel"    # Lcom/google/android/gms/games/PlayerLevel;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->I(Z)V

    invoke-static {p6}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p7}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput p1, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->BR:I

    iput-wide p2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J

    iput-wide p4, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J

    iput-object p6, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;

    iput-object p7, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(JJLcom/google/android/gms/games/PlayerLevel;Lcom/google/android/gms/games/PlayerLevel;)V
    .locals 9
    .param p1, "currentXpTotal"    # J
    .param p3, "lastLevelUpTimestamp"    # J
    .param p5, "currentLevel"    # Lcom/google/android/gms/games/PlayerLevel;
    .param p6, "nextLevel"    # Lcom/google/android/gms/games/PlayerLevel;

    .prologue
    const/4 v1, 0x1

    move-object v0, p0

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/games/PlayerLevelInfo;-><init>(IJJLcom/google/android/gms/games/PlayerLevel;Lcom/google/android/gms/games/PlayerLevel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/PlayerLevelInfo;

    if-nez v2, :cond_1

    move v0, v1

    .end local p1    # "obj":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_1
    if-eq p1, p0, :cond_0

    check-cast p1, Lcom/google/android/gms/games/PlayerLevelInfo;

    .end local p1    # "obj":Ljava/lang/Object;
    iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v4, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v4, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;

    iget-object v3, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;

    iget-object v3, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public getCurrentLevel()Lcom/google/android/gms/games/PlayerLevel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;

    return-object v0
.end method

.method public getCurrentXpTotal()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J

    return-wide v0
.end method

.method public getLastLevelUpTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J

    return-wide v0
.end method

.method public getNextLevel()Lcom/google/android/gms/games/PlayerLevel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->BR:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isMaxLevel()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;

    iget-object v1, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/games/PlayerLevel;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/PlayerLevelInfoCreator;->a(Lcom/google/android/gms/games/PlayerLevelInfo;Landroid/os/Parcel;I)V

    return-void
.end method
