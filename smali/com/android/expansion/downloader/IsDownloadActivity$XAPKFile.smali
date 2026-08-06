.class Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;
.super Ljava/lang/Object;
.source "IsDownloadActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/expansion/downloader/IsDownloadActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "XAPKFile"
.end annotation


# instance fields
.field public final mFileSize:J

.field public final mFileVersion:I

.field public final mIsMain:Z


# direct methods
.method constructor <init>(ZIJ)V
    .locals 1

    .prologue
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-boolean p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mIsMain:Z

    .line 96
    iput p2, p0, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileVersion:I

    .line 97
    iput-wide p3, p0, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileSize:J

    .line 98
    return-void
.end method
