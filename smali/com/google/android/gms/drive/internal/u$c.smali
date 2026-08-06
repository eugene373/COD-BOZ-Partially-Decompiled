.class Lcom/google/android/gms/drive/internal/u$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/DriveFolder$DriveFileResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final CM:Lcom/google/android/gms/common/api/Status;

.field private final OY:Lcom/google/android/gms/drive/DriveFile;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveFile;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/u$c;->CM:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/u$c;->OY:Lcom/google/android/gms/drive/DriveFile;

    return-void
.end method


# virtual methods
.method public getDriveFile()Lcom/google/android/gms/drive/DriveFile;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$c;->OY:Lcom/google/android/gms/drive/DriveFile;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$c;->CM:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
