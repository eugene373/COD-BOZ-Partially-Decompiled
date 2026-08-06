.class public final Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private Tr:Ljava/lang/String;

.field private adk:Landroid/net/Uri;

.field private adm:Ljava/lang/Long;

.field private adn:Lcom/google/android/gms/common/data/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;
    .locals 5

    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;

    iget-object v1, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->Tr:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;

    iget-object v3, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adn:Lcom/google/android/gms/common/data/a;

    iget-object v4, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;-><init>(Ljava/lang/String;Ljava/lang/Long;Lcom/google/android/gms/common/data/a;Landroid/net/Uri;)V

    return-object v0
.end method

.method public fromMetadata(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    .locals 5
    .param p1, "metadata"    # Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    .prologue
    const/4 v4, 0x0

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getDescription()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->Tr:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getPlayedTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-object v4, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getCoverImageUri()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;

    iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;

    if-eqz v0, :cond_1

    iput-object v4, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adn:Lcom/google/android/gms/common/data/a;

    :cond_1
    return-object p0
.end method

.method public setCoverImage(Landroid/graphics/Bitmap;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    .locals 1
    .param p1, "coverImage"    # Landroid/graphics/Bitmap;

    .prologue
    new-instance v0, Lcom/google/android/gms/common/data/a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/data/a;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adn:Lcom/google/android/gms/common/data/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;

    return-object p0
.end method

.method public setDescription(Ljava/lang/String;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    .locals 0
    .param p1, "description"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->Tr:Ljava/lang/String;

    return-object p0
.end method

.method public setPlayedTimeMillis(J)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    .locals 1
    .param p1, "playedTimeMillis"    # J

    .prologue
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;

    return-object p0
.end method
