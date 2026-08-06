.class public Lcom/android/vending/expansion/downloader/impl/DownloadThread;
.super Ljava/lang/Object;
.source "DownloadThread.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;,
        Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
        Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;,
        Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

.field private mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

.field private final mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;

.field private mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

.field private mUserAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Lcom/android/vending/expansion/downloader/impl/DownloaderService;Lcom/android/vending/expansion/downloader/impl/DownloadNotification;)V
    .locals 2

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;

    .line 60
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    .line 61
    iput-object p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    .line 62
    iput-object p3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;

    .line 63
    invoke-static {p2}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDB(Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "APKXDL (Linux; U; Android "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 65
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 67
    invoke-virtual {p2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mUserAgent:Ljava/lang/String;

    .line 68
    return-void
.end method

.method private addRequestHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/client/methods/HttpGet;)V
    .locals 3

    .prologue
    .line 810
    iget-boolean v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z

    if-eqz v0, :cond_1

    .line 811
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 812
    const-string v0, "If-Match"

    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 814
    :cond_0
    const-string v0, "Range"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 816
    :cond_1
    return-void
.end method

.method private cannotResume(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)Z
    .locals 1

    .prologue
    .line 546
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    if-lez v0, :cond_0

    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private checkConnectivity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    const/16 v2, 0xc3

    .line 315
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getNetworkAvailabilityState(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 331
    :pswitch_0
    return-void

    .line 319
    :pswitch_1
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const-string v1, "waiting for network to return"

    invoke-direct {v0, p0, v2, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 322
    :pswitch_2
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0xc4

    const-string v2, "waiting for wifi or for download over cellular to be authorized"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 326
    :pswitch_3
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const-string v1, "roaming is not allowed"

    invoke-direct {v0, p0, v2, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 329
    :pswitch_4
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0xc5

    const-string v2, "waiting for wifi"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 315
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private checkPausedOrCanceled(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 446
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getControl()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 447
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getStatus()I

    move-result v0

    .line 448
    packed-switch v0, :pswitch_data_0

    .line 454
    :cond_0
    return-void

    .line 450
    :pswitch_0
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-virtual {v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getStatus()I

    move-result v1

    const-string v2, "download paused"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 448
    nop

    :pswitch_data_0
    .packed-switch 0xc1
        :pswitch_0
    .end packed-switch
.end method

.method private cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V
    .locals 2

    .prologue
    .line 387
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    .line 388
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isStatusError(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    new-instance v0, Ljava/io/File;

    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 390
    const/4 v0, 0x0

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    .line 392
    :cond_0
    return-void
.end method

.method private closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    .locals 1

    .prologue
    .line 429
    :try_start_0
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;

    if-eqz v0, :cond_0

    .line 430
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 431
    const/4 v0, 0x0

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 439
    :cond_0
    :goto_0
    return-void

    .line 433
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private executeDownload(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
        }
    .end annotation

    .prologue
    .line 285
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread$1;)V

    .line 286
    const/16 v1, 0x1000

    new-array v1, v1, [B

    .line 288
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkPausedOrCanceled(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    .line 290
    invoke-direct {p0, p1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->setupDestinationFile(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V

    .line 291
    invoke-direct {p0, v0, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->addRequestHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/client/methods/HttpGet;)V

    .line 295
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkConnectivity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    .line 297
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V

    .line 298
    invoke-direct {p0, p1, p2, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->sendRequest(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 299
    invoke-direct {p0, p1, v0, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleExceptionalStatus(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V

    .line 305
    invoke-direct {p0, p1, v0, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->processResponseHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V

    .line 306
    invoke-direct {p0, p1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->openResponseEntity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)Ljava/io/InputStream;

    move-result-object v2

    .line 307
    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V

    .line 308
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->transferData(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)V

    .line 309
    return-void
.end method

.method private finalizeDestinationFile(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 364
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->syncDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    .line 365
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    .line 366
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 367
    iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 368
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 369
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 370
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v4, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    const-wide/16 v6, -0x1

    cmp-long v1, v4, v6

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v4, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v6, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    cmp-long v1, v4, v6

    if-nez v1, :cond_0

    .line 371
    invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 372
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1ec

    const-string v2, "unable to finalize destination file"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 376
    :cond_0
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1e7

    const-string v2, "file delivered with incorrect size. probably due to network not browser configured"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 380
    :cond_1
    return-void
.end method

.method private getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 871
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getNetworkAvailabilityState(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 872
    const/16 v0, 0xc3

    .line 878
    :goto_0
    return v0

    .line 873
    :cond_0
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    .line 874
    iput-boolean v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z

    .line 875
    const/16 v0, 0xc2

    goto :goto_0

    .line 877
    :cond_1
    const-string v0, "LVLDL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reached max retries for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 878
    const/16 v0, 0x1ef

    goto :goto_0
.end method

.method private handleEndOfStream(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 525
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    int-to-long v2, v1

    iput-wide v2, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J

    .line 530
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z

    .line 532
    iget-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;

    .line 533
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    .line 534
    :goto_0
    if-eqz v0, :cond_2

    .line 535
    invoke-direct {p0, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cannotResume(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 536
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1e9

    const-string v2, "mismatched content length"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 533
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 539
    :cond_1
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I

    move-result v1

    const-string v2, "closed socket before end of file"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 543
    :cond_2
    return-void
.end method

.method private handleExceptionalStatus(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
        }
    .end annotation

    .prologue
    .line 730
    invoke-interface {p3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    .line 731
    const/16 v0, 0x1f7

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    const/4 v2, 0x5

    if-ge v0, v2, :cond_0

    .line 732
    invoke-direct {p0, p1, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleServiceUnavailable(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)V

    .line 734
    :cond_0
    const/16 v0, 0x12d

    if-eq v1, v0, :cond_1

    const/16 v0, 0x12e

    if-eq v1, v0, :cond_1

    const/16 v0, 0x12f

    if-eq v1, v0, :cond_1

    const/16 v0, 0x133

    if-ne v1, v0, :cond_2

    .line 735
    :cond_1
    invoke-direct {p0, p1, p3, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleRedirect(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;I)V

    .line 738
    :cond_2
    iget-boolean v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z

    if-eqz v0, :cond_3

    const/16 v0, 0xce

    .line 740
    :goto_0
    if-eq v1, v0, :cond_4

    .line 741
    invoke-direct {p0, p1, p2, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleOtherStatus(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;I)V

    .line 746
    :goto_1
    return-void

    .line 738
    :cond_3
    const/16 v0, 0xc8

    goto :goto_0

    .line 744
    :cond_4
    const/4 v0, 0x0

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    goto :goto_1
.end method

.method private handleOtherStatus(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 754
    invoke-static {p3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isStatusError(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, p3

    .line 763
    :goto_0
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "http error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v0, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v1

    .line 756
    :cond_0
    const/16 v0, 0x12c

    if-lt p3, v0, :cond_1

    const/16 v0, 0x190

    if-ge p3, v0, :cond_1

    .line 757
    const/16 v0, 0x1ed

    goto :goto_0

    .line 758
    :cond_1
    iget-boolean v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z

    if-eqz v0, :cond_2

    const/16 v0, 0xc8

    if-ne p3, v0, :cond_2

    .line 759
    const/16 v0, 0x1e9

    goto :goto_0

    .line 761
    :cond_2
    const/16 v0, 0x1ee

    goto :goto_0
.end method

.method private handleRedirect(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
        }
    .end annotation

    .prologue
    .line 774
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    .line 775
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1f1

    const-string v2, "too many redirects"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 777
    :cond_0
    const-string v0, "Location"

    invoke-interface {p2, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 778
    if-nez v0, :cond_1

    .line 779
    return-void

    .line 787
    :cond_1
    :try_start_0
    new-instance v1, Ljava/net/URI;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/net/URI;

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/net/URI;->resolve(Ljava/net/URI;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 796
    iget v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    .line 797
    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRequestUri:Ljava/lang/String;

    .line 798
    const/16 v1, 0x12d

    if-eq p3, v1, :cond_2

    const/16 v1, 0x12f

    if-ne p3, v1, :cond_3

    .line 801
    :cond_2
    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mNewUri:Ljava/lang/String;

    .line 803
    :cond_3
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;Lcom/android/vending/expansion/downloader/impl/DownloadThread$1;)V

    throw v0

    .line 788
    :catch_0
    move-exception v0

    .line 793
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1ef

    const-string v2, "Couldn\'t resolve redirect URI"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0
.end method

.method private handleServiceUnavailable(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    const v2, 0x15180

    const/16 v1, 0x1e

    .line 826
    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z

    .line 827
    const-string v0, "Retry-After"

    invoke-interface {p2, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 828
    if-eqz v0, :cond_0

    .line 833
    :try_start_0
    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    .line 834
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    if-gez v0, :cond_1

    .line 835
    const/4 v0, 0x0

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 849
    :cond_0
    :goto_0
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0xc2

    const-string v2, "got 503 Service Unavailable, will retry later"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 837
    :cond_1
    :try_start_1
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    if-ge v0, v1, :cond_3

    .line 838
    const/16 v0, 0x1e

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    .line 842
    :cond_2
    :goto_1
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    sget-object v1, Lcom/android/vending/expansion/downloader/Helpers;->sRandom:Ljava/util/Random;

    const/16 v2, 0x1f

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    .line 843
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    mul-int/lit16 v0, v0, 0x3e8

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    goto :goto_0

    .line 845
    :catch_0
    move-exception v0

    goto :goto_0

    .line 839
    :cond_3
    iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    if-le v0, v2, :cond_2

    .line 840
    const v0, 0x15180

    iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private static final isLocalHost(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 175
    if-nez p0, :cond_1

    .line 197
    :cond_0
    :goto_0
    return v0

    .line 180
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    .line 181
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 182
    if-eqz v1, :cond_0

    .line 187
    const-string v2, "localhost"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "127.0.0.1"

    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "[::1]"

    .line 189
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    .line 190
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 193
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private logNetworkState()V
    .locals 4

    .prologue
    .line 595
    const-string v1, "LVLDL"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Net "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    .line 597
    invoke-virtual {v0, v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getNetworkAvailabilityState(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    const-string v0, "Up"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 595
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 600
    return-void

    .line 597
    :cond_0
    const-string v0, "Down"

    goto :goto_0
.end method

.method private notifyDownloadCompleted(IZIIZLjava/lang/String;)V
    .locals 1

    .prologue
    .line 939
    invoke-direct/range {p0 .. p6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->updateDownloadDatabase(IZIIZLjava/lang/String;)V

    .line 941
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isStatusCompleted(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 944
    :cond_0
    return-void
.end method

.method private openResponseEntity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)Ljava/io/InputStream;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 585
    :try_start_0
    invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 586
    :catch_0
    move-exception v0

    .line 587
    invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->logNetworkState()V

    .line 588
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "while getting entity: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 589
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private processResponseHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 608
    iget-boolean v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z

    if-eqz v0, :cond_0

    .line 641
    :goto_0
    return-void

    .line 613
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->readResponseHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V

    .line 616
    :try_start_0
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v1, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->generateSaveFile(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    :try_end_0
    .catch Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError; {:try_start_0 .. :try_end_0} :catch_0

    .line 621
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 638
    :cond_1
    :goto_1
    invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->updateDatabaseFromHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V

    .line 640
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkConnectivity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    goto :goto_0

    .line 617
    :catch_0
    move-exception v0

    .line 618
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    iget v2, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;->mStatus:I

    iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;->mMessage:Ljava/lang/String;

    invoke-direct {v1, p0, v2, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v1

    .line 622
    :catch_1
    move-exception v0

    .line 624
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-static {v2}, Lcom/android/vending/expansion/downloader/Helpers;->getSaveFilePath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 626
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 627
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 629
    :catch_2
    move-exception v1

    .line 630
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v2, 0x1ec

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "while opening destination file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 631
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private readFromResponse(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 560
    :try_start_0
    invoke-virtual {p4, p3}, Ljava/io/InputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 561
    :catch_0
    move-exception v0

    .line 562
    invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->logNetworkState()V

    .line 563
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    int-to-long v2, v2

    iput-wide v2, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J

    .line 564
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    invoke-virtual {v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z

    .line 565
    invoke-direct {p0, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cannotResume(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 566
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "while reading response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", can\'t resume interrupted download with no ETag"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 568
    new-instance v2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v3, 0x1e9

    invoke-direct {v2, p0, v3, v1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 571
    :cond_0
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "while reading response: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 572
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private readResponseHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 657
    const-string v0, "Content-Disposition"

    invoke-interface {p3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 658
    if-eqz v0, :cond_0

    .line 659
    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentDisposition:Ljava/lang/String;

    .line 661
    :cond_0
    const-string v0, "Content-Location"

    invoke-interface {p3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 662
    if-eqz v0, :cond_1

    .line 663
    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLocation:Ljava/lang/String;

    .line 665
    :cond_1
    const-string v0, "ETag"

    invoke-interface {p3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 666
    if-eqz v0, :cond_2

    .line 667
    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;

    .line 669
    :cond_2
    const/4 v0, 0x0

    .line 670
    const-string v1, "Transfer-Encoding"

    invoke-interface {p3, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 671
    if-eqz v1, :cond_3

    .line 672
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 675
    :cond_3
    const-string v1, "Content-Type"

    invoke-interface {p3, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 676
    if-eqz v1, :cond_4

    .line 677
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 678
    const-string v2, "application/vnd.android.obb"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 679
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1e7

    const-string v2, "file delivered with incorrect Mime type"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 684
    :cond_4
    if-nez v0, :cond_5

    .line 685
    const-string v1, "Content-Length"

    invoke-interface {p3, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 686
    if-eqz v1, :cond_5

    .line 687
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;

    .line 689
    iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 690
    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v4, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    cmp-long v1, v2, v4

    if-eqz v1, :cond_5

    .line 696
    const-string v1, "LVLDL"

    const-string v2, "Incorrect file size delivered."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 715
    :cond_5
    iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;

    if-nez v1, :cond_7

    if-eqz v0, :cond_6

    const-string v1, "chunked"

    .line 717
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    const/4 v0, 0x1

    .line 718
    :goto_0
    if-eqz v0, :cond_8

    .line 719
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1ef

    const-string v2, "can\'t know size of download, giving up"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 717
    :cond_7
    const/4 v0, 0x0

    goto :goto_0

    .line 722
    :cond_8
    return-void
.end method

.method private reportProgress(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    .locals 6

    .prologue
    .line 460
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 461
    iget v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    iget v3, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesNotified:I

    sub-int/2addr v2, v3

    const/16 v3, 0x1000

    if-le v2, v3, :cond_0

    iget-wide v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mTimeLastNotification:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 466
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v3, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    int-to-long v4, v3

    iput-wide v4, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J

    .line 467
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    invoke-virtual {v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownloadCurrentBytes(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)V

    .line 469
    iget v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    iput v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesNotified:I

    .line 470
    iput-wide v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mTimeLastNotification:J

    .line 472
    iget v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I

    int-to-long v0, v0

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    iget-wide v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J

    add-long/2addr v0, v2

    .line 481
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-virtual {v2, v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->notifyUpdateBytes(J)V

    .line 483
    :cond_0
    return-void
.end method

.method private sendRequest(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)Lorg/apache/http/HttpResponse;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 859
    :try_start_0
    invoke-virtual {p2, p3}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 860
    :catch_0
    move-exception v0

    .line 861
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v2, 0x1ef

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "while trying to execute request: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 862
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 863
    :catch_1
    move-exception v0

    .line 864
    invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->logNetworkState()V

    .line 865
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "while trying to execute request: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 866
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private setupDestinationFile(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    const/16 v7, 0x1ec

    const/4 v6, 0x1

    .line 888
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 890
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/Helpers;->isFilenameValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 892
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const-string v1, "found invalid internal destination filename"

    invoke-direct {v0, p0, v7, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 896
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 897
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 898
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    .line 899
    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-nez v1, :cond_3

    .line 902
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 903
    const/4 v0, 0x0

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    .line 927
    :cond_1
    :goto_0
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;

    if-eqz v0, :cond_2

    .line 928
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    .line 930
    :cond_2
    return-void

    .line 904
    :cond_3
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v1, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 906
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 907
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1e9

    const-string v2, "Trying to resume a download that can\'t be resumed"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 912
    :cond_4
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 917
    long-to-int v0, v2

    iput v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    .line 918
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    .line 919
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-wide v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;

    .line 921
    :cond_5
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;

    iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;

    .line 922
    iput-boolean v6, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z

    goto :goto_0

    .line 913
    :catch_0
    move-exception v0

    .line 914
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "while opening destination for resuming: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 915
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v7, v2, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private syncDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    .locals 5

    .prologue
    .line 398
    const/4 v2, 0x0

    .line 400
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/SyncFailedException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 401
    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_13
    .catch Ljava/io/SyncFailedException; {:try_start_1 .. :try_end_1} :catch_12
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_11
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_10
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 411
    if-eqz v1, :cond_0

    .line 413
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 421
    :cond_0
    :goto_0
    return-void

    .line 414
    :catch_0
    move-exception v0

    .line 415
    const-string v1, "LVLDL"

    const-string v2, "IOException while closing synced file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 416
    :catch_1
    move-exception v0

    .line 417
    const-string v1, "LVLDL"

    const-string v2, "exception while closing file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 402
    :catch_2
    move-exception v0

    move-object v1, v2

    .line 403
    :goto_1
    :try_start_3
    const-string v2, "LVLDL"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "file "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " not found: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 411
    if-eqz v1, :cond_0

    .line 413
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_0

    .line 414
    :catch_3
    move-exception v0

    .line 415
    const-string v1, "LVLDL"

    const-string v2, "IOException while closing synced file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 416
    :catch_4
    move-exception v0

    .line 417
    const-string v1, "LVLDL"

    const-string v2, "exception while closing file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 404
    :catch_5
    move-exception v0

    .line 405
    :goto_2
    :try_start_5
    const-string v1, "LVLDL"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "file "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " sync failed: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 411
    if-eqz v2, :cond_0

    .line 413
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_7

    goto :goto_0

    .line 414
    :catch_6
    move-exception v0

    .line 415
    const-string v1, "LVLDL"

    const-string v2, "IOException while closing synced file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 416
    :catch_7
    move-exception v0

    .line 417
    const-string v1, "LVLDL"

    const-string v2, "exception while closing file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 406
    :catch_8
    move-exception v0

    .line 407
    :goto_3
    :try_start_7
    const-string v1, "LVLDL"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOException trying to sync "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 411
    if-eqz v2, :cond_0

    .line 413
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_a

    goto/16 :goto_0

    .line 414
    :catch_9
    move-exception v0

    .line 415
    const-string v1, "LVLDL"

    const-string v2, "IOException while closing synced file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 416
    :catch_a
    move-exception v0

    .line 417
    const-string v1, "LVLDL"

    const-string v2, "exception while closing file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 408
    :catch_b
    move-exception v0

    .line 409
    :goto_4
    :try_start_9
    const-string v1, "LVLDL"

    const-string v3, "exception while syncing file: "

    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 411
    if-eqz v2, :cond_0

    .line 413
    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_c
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_d

    goto/16 :goto_0

    .line 414
    :catch_c
    move-exception v0

    .line 415
    const-string v1, "LVLDL"

    const-string v2, "IOException while closing synced file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 416
    :catch_d
    move-exception v0

    .line 417
    const-string v1, "LVLDL"

    const-string v2, "exception while closing file: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 411
    :catchall_0
    move-exception v0

    :goto_5
    if-eqz v2, :cond_1

    .line 413
    :try_start_b
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_f

    .line 418
    :cond_1
    :goto_6
    throw v0

    .line 414
    :catch_e
    move-exception v1

    .line 415
    const-string v2, "LVLDL"

    const-string v3, "IOException while closing synced file: "

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    .line 416
    :catch_f
    move-exception v1

    .line 417
    const-string v2, "LVLDL"

    const-string v3, "exception while closing file: "

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_6

    .line 411
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_5

    .line 408
    :catch_10
    move-exception v0

    move-object v2, v1

    goto :goto_4

    .line 406
    :catch_11
    move-exception v0

    move-object v2, v1

    goto/16 :goto_3

    .line 404
    :catch_12
    move-exception v0

    move-object v2, v1

    goto/16 :goto_2

    .line 402
    :catch_13
    move-exception v0

    goto/16 :goto_1
.end method

.method private transferData(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 343
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->readFromResponse(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)I

    move-result v0

    .line 344
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 345
    invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleEndOfStream(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V

    .line 346
    return-void

    .line 349
    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z

    .line 350
    invoke-direct {p0, p1, p3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->writeDataToDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;[BI)V

    .line 351
    iget v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    add-int/2addr v1, v0

    iput v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I

    .line 352
    iget v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I

    add-int/2addr v0, v1

    iput v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I

    .line 353
    invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->reportProgress(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V

    .line 355
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkPausedOrCanceled(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V

    goto :goto_0
.end method

.method private updateDatabaseFromHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    .locals 2

    .prologue
    .line 648
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;

    iput-object v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;

    .line 649
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z

    .line 650
    return-void
.end method

.method private updateDownloadDatabase(IZIIZLjava/lang/String;)V
    .locals 4

    .prologue
    .line 949
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iput p1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I

    .line 950
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iput p3, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I

    .line 951
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iput p4, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRedirectCount:I

    .line 952
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J

    .line 953
    if-nez p2, :cond_0

    .line 954
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    const/4 v1, 0x0

    iput v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    .line 960
    :goto_0
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z

    .line 961
    return-void

    .line 955
    :cond_0
    if-eqz p5, :cond_1

    .line 956
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    const/4 v1, 0x1

    iput v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    goto :goto_0

    .line 958
    :cond_1
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I

    goto :goto_0
.end method

.method private userAgent()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method private writeDataToDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;[BI)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
        }
    .end annotation

    .prologue
    .line 495
    :try_start_0
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;

    if-nez v0, :cond_0

    .line 496
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;

    .line 498
    :cond_0
    iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1, p3}, Ljava/io/FileOutputStream;->write([BII)V

    .line 500
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 501
    return-void

    .line 502
    :catch_0
    move-exception v0

    .line 503
    invoke-static {}, Lcom/android/vending/expansion/downloader/Helpers;->isExternalMediaMounted()Z

    move-result v1

    if-nez v1, :cond_1

    .line 504
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v1, 0x1f3

    const-string v2, "external media not mounted while writing destination file"

    invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V

    throw v0

    .line 508
    :cond_1
    iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    .line 509
    invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getFilesystemRoot(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getAvailableBytes(Ljava/io/File;)J

    move-result-wide v2

    .line 510
    int-to-long v4, p3

    cmp-long v1, v2, v4

    if-gez v1, :cond_2

    .line 511
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v2, 0x1f2

    const-string v3, "insufficient space while writing destination file"

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 514
    :cond_2
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;

    const/16 v2, 0x1ec

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "while writing destination file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 515
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public getPreferredHttpHost(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/HttpHost;
    .locals 4

    .prologue
    .line 164
    invoke-static {p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->isLocalHost(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isWiFi()Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    invoke-static {p1}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 166
    if-eqz v1, :cond_0

    .line 167
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-static {p1}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I

    move-result v2

    const-string v3, "http"

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 171
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public run()V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/16 v1, 0x1eb

    const/4 v2, 0x1

    .line 204
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 206
    new-instance v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;

    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-direct {v6, v0, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Lcom/android/vending/expansion/downloader/impl/DownloaderService;)V

    .line 212
    :try_start_0
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;

    const-string v3, "power"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 213
    const/4 v3, 0x1

    const-string v5, "LVLDL"

    invoke-virtual {v0, v3, v5}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 214
    :try_start_1
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 221
    invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->userAgent()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;

    invoke-static {v0, v5}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->newInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;

    move-result-object v4

    .line 223
    const/4 v0, 0x0

    .line 224
    :goto_0
    if-nez v0, :cond_4

    .line 232
    invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v5

    iget-object v7, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;

    iget-object v8, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRequestUri:Ljava/lang/String;

    .line 233
    invoke-virtual {p0, v7, v8}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getPreferredHttpHost(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/HttpHost;

    move-result-object v7

    .line 232
    invoke-static {v5, v7}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 234
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    iget-object v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRequestUri:Ljava/lang/String;

    invoke-direct {v5, v7}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 236
    :try_start_2
    invoke-direct {p0, v6, v4, v5}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->executeDownload(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)V
    :try_end_2
    .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    :try_start_3
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    move v0, v2

    .line 243
    goto :goto_0

    .line 238
    :catch_0
    move-exception v7

    .line 241
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V
    :try_end_3
    .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    .line 252
    :catch_1
    move-exception v0

    move-object v2, v3

    .line 254
    :goto_1
    :try_start_4
    const-string v3, "LVLDL"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Aborting request for download "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v7, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v7, v7, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ": "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 255
    invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 254
    invoke-static {v3, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->printStackTrace()V

    .line 257
    iget v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->mFinalStatus:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 265
    if-eqz v2, :cond_0

    .line 266
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 269
    :cond_0
    if-eqz v4, :cond_1

    .line 270
    invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V

    .line 273
    :cond_1
    invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V

    .line 274
    iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z

    iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z

    iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V

    .line 277
    :goto_2
    return-void

    .line 241
    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 242
    throw v0
    :try_end_5
    .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 259
    :catch_2
    move-exception v0

    .line 261
    :goto_3
    :try_start_6
    const-string v2, "LVLDL"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Exception for "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v7, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;

    iget-object v7, v7, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ": "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 265
    if-eqz v3, :cond_2

    .line 266
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 269
    :cond_2
    if-eqz v4, :cond_3

    .line 270
    invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V

    .line 273
    :cond_3
    invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V

    .line 274
    iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z

    iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z

    iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V

    goto :goto_2

    .line 250
    :cond_4
    :try_start_7
    invoke-direct {p0, v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->finalizeDestinationFile(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    :try_end_7
    .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 251
    const/16 v1, 0xc8

    .line 265
    if-eqz v3, :cond_5

    .line 266
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 269
    :cond_5
    if-eqz v4, :cond_6

    .line 270
    invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V

    .line 273
    :cond_6
    invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V

    .line 274
    iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z

    iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z

    iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V

    goto :goto_2

    .line 265
    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v3, v4

    :goto_4
    if-eqz v3, :cond_7

    .line 266
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 269
    :cond_7
    if-eqz v4, :cond_8

    .line 270
    invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V

    .line 273
    :cond_8
    invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V

    .line 274
    iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z

    iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I

    iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I

    iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z

    iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V

    throw v7

    .line 265
    :catchall_2
    move-exception v0

    move-object v7, v0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v7, v0

    move-object v3, v2

    goto :goto_4

    .line 259
    :catch_3
    move-exception v0

    move-object v3, v4

    goto/16 :goto_3

    .line 252
    :catch_4
    move-exception v0

    move-object v2, v4

    goto/16 :goto_1
.end method
