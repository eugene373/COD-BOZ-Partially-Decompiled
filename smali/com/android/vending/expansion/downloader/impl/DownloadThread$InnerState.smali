.class Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;
.super Ljava/lang/Object;
.source "DownloadThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloadThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InnerState"
.end annotation


# instance fields
.field public mBytesNotified:I

.field public mBytesSoFar:I

.field public mBytesThisSession:I

.field public mContinuingDownload:Z

.field public mHeaderContentDisposition:Ljava/lang/String;

.field public mHeaderContentLength:Ljava/lang/String;

.field public mHeaderContentLocation:Ljava/lang/String;

.field public mHeaderETag:Ljava/lang/String;

.field public mTimeLastNotification:J


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    .line 102
    iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I

    .line 104
    iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z

    .line 108
    iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesNotified:I

    .line 109
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mTimeLastNotification:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread$1;)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;-><init>()V

    return-void
.end method
