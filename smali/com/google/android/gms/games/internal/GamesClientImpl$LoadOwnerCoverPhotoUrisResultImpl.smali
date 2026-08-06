.class final Lcom/google/android/gms/games/internal/GamesClientImpl$LoadOwnerCoverPhotoUrisResultImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/Players$LoadOwnerCoverPhotoUrisResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LoadOwnerCoverPhotoUrisResultImpl"
.end annotation


# instance fields
.field private final CM:Lcom/google/android/gms/common/api/Status;

.field private final Nh:Landroid/os/Bundle;


# direct methods
.method constructor <init>(ILandroid/os/Bundle;)V
    .locals 1
    .param p1, "statusCode"    # I
    .param p2, "bundle"    # Landroid/os/Bundle;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadOwnerCoverPhotoUrisResultImpl;->CM:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadOwnerCoverPhotoUrisResultImpl;->Nh:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadOwnerCoverPhotoUrisResultImpl;->CM:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
