.class public Lcom/android/expansion/downloader/IsDownloadActivity;
.super Landroid/app/Activity;
.source "IsDownloadActivity.java"

# interfaces
.implements Lcom/android/vending/expansion/downloader/IDownloaderClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "LVLDownloader"

.field private static final SMOOTHING_FACTOR:F = 0.005f

.field private static final xAPKS:[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;


# instance fields
.field private mAverageSpeed:Landroid/widget/TextView;

.field private mCancelValidation:Z

.field private mCellMessage:Landroid/view/View;

.field private mDashboard:Landroid/view/View;

.field private mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

.field private mPB:Landroid/widget/ProgressBar;

.field private mPauseButton:Landroid/widget/Button;

.field private mProgressFraction:Landroid/widget/TextView;

.field private mProgressPercent:Landroid/widget/TextView;

.field private mRemoteService:Lcom/android/vending/expansion/downloader/IDownloaderService;

.field private mState:I

.field private mStatePaused:Z

.field private mStatusText:Landroid/widget/TextView;

.field private mTimeRemaining:Landroid/widget/TextView;

.field private mWiFiSettingsButton:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 109
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;

    new-instance v1, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;

    const/4 v2, 0x3

    const-wide/32 v4, 0x28ff050d

    invoke-direct {v1, v6, v2, v4, v5}, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;-><init>(ZIJ)V

    aput-object v1, v0, v3

    new-instance v1, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;

    const/4 v2, 0x4

    const-wide/32 v4, 0x7d35c

    invoke-direct {v1, v3, v2, v4, v5}, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;-><init>(ZIJ)V

    aput-object v1, v0, v6

    sput-object v0, Lcom/android/expansion/downloader/IsDownloadActivity;->xAPKS:[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDashboard:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$100(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCellMessage:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$200(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mStatusText:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$300(Lcom/android/expansion/downloader/IsDownloadActivity;)Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCancelValidation:Z

    return v0
.end method

.method static synthetic access$302(Lcom/android/expansion/downloader/IsDownloadActivity;Z)Z
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCancelValidation:Z

    return p1
.end method

.method static synthetic access$400(Lcom/android/expansion/downloader/IsDownloadActivity;)Landroid/widget/Button;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPauseButton:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$500()[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/android/expansion/downloader/IsDownloadActivity;->xAPKS:[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;

    return-object v0
.end method

.method private initializeDownloadUI()V
    .locals 1

    .prologue
    .line 321
    const-class v0, Lcom/ideaworks3d/studio/IsDownloaderService;

    .line 322
    invoke-static {p0, v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;->CreateStub(Lcom/android/vending/expansion/downloader/IDownloaderClient;Ljava/lang/Class;)Lcom/android/vending/expansion/downloader/IStub;

    move-result-object v0

    iput-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

    .line 367
    return-void
.end method

.method private setButtonPausedState(Z)V
    .locals 2

    .prologue
    .line 79
    iput-boolean p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mStatePaused:Z

    .line 80
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPauseButton:Landroid/widget/Button;

    const-string v1, "text_button_pause"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 81
    return-void
.end method

.method private setState(I)V
    .locals 2

    .prologue
    .line 72
    iget v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mState:I

    if-eq v0, p1, :cond_0

    .line 73
    iput p1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mState:I

    .line 74
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mStatusText:Landroid/widget/TextView;

    invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    :cond_0
    return-void
.end method


# virtual methods
.method expansionFilesDelivered()Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 136
    sget-object v2, Lcom/android/expansion/downloader/IsDownloadActivity;->xAPKS:[Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v4, v2, v1

    .line 137
    iget-boolean v5, v4, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mIsMain:Z

    iget v6, v4, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileVersion:I

    invoke-static {p0, v5, v6}, Lcom/android/vending/expansion/downloader/Helpers;->getExpansionAPKFileName(Landroid/content/Context;ZI)Ljava/lang/String;

    move-result-object v5

    .line 138
    iget-wide v6, v4, Lcom/android/expansion/downloader/IsDownloadActivity$XAPKFile;->mFileSize:J

    invoke-static {p0, v5, v6, v7, v0}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z

    move-result v4

    if-nez v4, :cond_0

    .line 141
    :goto_1
    return v0

    .line 136
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 141
    :cond_1
    const/4 v0, 0x1

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 376
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 381
    invoke-direct {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->initializeDownloadUI()V

    .line 388
    invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->expansionFilesDelivered()Z

    move-result v0

    if-nez v0, :cond_2

    .line 392
    :try_start_0
    invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 393
    new-instance v1, Landroid/content/Intent;

    .line 395
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 396
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 398
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 400
    invoke-virtual {v0}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 401
    invoke-virtual {v0}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 402
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 423
    :catch_0
    move-exception v0

    .line 424
    const-string v1, "LVLDownloader"

    const-string v2, "Cannot find own package! MAYDAY!"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 425
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 432
    :cond_0
    :goto_1
    return-void

    .line 408
    :cond_1
    const/4 v0, 0x0

    const/high16 v2, 0x8000000

    :try_start_1
    invoke-static {p0, v0, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 413
    const-class v1, Lcom/ideaworks3d/studio/IsDownloaderService;

    invoke-static {p0, v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I

    move-result v0

    .line 416
    if-eqz v0, :cond_0

    .line 419
    invoke-direct {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->initializeDownloadUI()V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 429
    :cond_2
    invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->validateXAPKZipFiles()V

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 570
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCancelValidation:Z

    .line 571
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 572
    return-void
.end method

.method public onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    .locals 6

    .prologue
    const/16 v4, 0x8

    .line 554
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mAverageSpeed:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "%1$s KB/s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mCurrentSpeed:F

    invoke-static {v2}, Lcom/android/vending/expansion/downloader/Helpers;->getSpeedString(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 555
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mTimeRemaining:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Time remaining: %1$s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mTimeRemaining:J

    invoke-static {v2, v3}, Lcom/android/vending/expansion/downloader/Helpers;->getTimeRemaining(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 557
    iget-wide v0, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    iput-wide v0, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    .line 558
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPB:Landroid/widget/ProgressBar;

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    shr-long/2addr v2, v4

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 559
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPB:Landroid/widget/ProgressBar;

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J

    shr-long/2addr v2, v4

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 560
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mProgressPercent:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    iget-wide v4, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 563
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mProgressFraction:Landroid/widget/TextView;

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J

    iget-wide v4, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    .line 564
    invoke-static {v2, v3, v4, v5}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloadProgressString(JJ)Ljava/lang/String;

    move-result-object v1

    .line 563
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 566
    return-void
.end method

.method public onDownloadStateChanged(I)V
    .locals 7

    .prologue
    const/16 v2, 0x8

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 475
    invoke-direct {p0, p1}, Lcom/android/expansion/downloader/IsDownloadActivity;->setState(I)V

    .line 480
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    move v3, v0

    move v4, v0

    move v5, v1

    .line 535
    :goto_0
    if-eqz v0, :cond_2

    move v0, v1

    .line 536
    :goto_1
    iget-object v6, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDashboard:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eq v6, v0, :cond_0

    .line 537
    iget-object v6, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDashboard:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 539
    :cond_0
    if-eqz v5, :cond_3

    .line 540
    :goto_2
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCellMessage:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 541
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mCellMessage:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 544
    :cond_1
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mPB:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 545
    invoke-direct {p0, v4}, Lcom/android/expansion/downloader/IsDownloadActivity;->setButtonPausedState(Z)V

    .line 546
    :goto_3
    return-void

    :pswitch_1
    move v3, v0

    move v4, v1

    move v5, v1

    .line 486
    goto :goto_0

    :pswitch_2
    move v3, v0

    move v4, v1

    move v5, v1

    .line 492
    goto :goto_0

    :pswitch_3
    move v3, v1

    move v4, v1

    move v5, v1

    .line 497
    goto :goto_0

    :pswitch_4
    move v3, v1

    move v4, v0

    move v5, v1

    move v0, v1

    .line 506
    goto :goto_0

    :pswitch_5
    move v3, v1

    move v4, v0

    move v5, v0

    move v0, v1

    .line 513
    goto :goto_0

    :pswitch_6
    move v3, v1

    move v4, v0

    move v5, v1

    .line 518
    goto :goto_0

    :pswitch_7
    move v3, v1

    move v4, v0

    move v5, v1

    .line 523
    goto :goto_0

    .line 528
    :pswitch_8
    invoke-virtual {p0}, Lcom/android/expansion/downloader/IsDownloadActivity;->validateXAPKZipFiles()V

    goto :goto_3

    :cond_2
    move v0, v2

    .line 535
    goto :goto_1

    :cond_3
    move v1, v2

    .line 539
    goto :goto_2

    .line 480
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_8
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_7
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public onServiceConnected(Landroid/os/Messenger;)V
    .locals 2

    .prologue
    .line 464
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller;->CreateProxy(Landroid/os/Messenger;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mRemoteService:Lcom/android/vending/expansion/downloader/IDownloaderService;

    .line 465
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mRemoteService:Lcom/android/vending/expansion/downloader/IDownloaderService;

    iget-object v1, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

    invoke-interface {v1}, Lcom/android/vending/expansion/downloader/IStub;->getMessenger()Landroid/os/Messenger;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderService;->onClientUpdated(Landroid/os/Messenger;)V

    .line 466
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

    invoke-interface {v0, p0}, Lcom/android/vending/expansion/downloader/IStub;->connect(Landroid/content/Context;)V

    .line 442
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 443
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 450
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/android/expansion/downloader/IsDownloadActivity;->mDownloaderClientStub:Lcom/android/vending/expansion/downloader/IStub;

    invoke-interface {v0, p0}, Lcom/android/vending/expansion/downloader/IStub;->disconnect(Landroid/content/Context;)V

    .line 453
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 454
    return-void
.end method

.method validateXAPKZipFiles()V
    .locals 4

    .prologue
    .line 162
    new-instance v0, Lcom/android/expansion/downloader/IsDownloadActivity$1;

    invoke-direct {v0, p0}, Lcom/android/expansion/downloader/IsDownloadActivity$1;-><init>(Lcom/android/expansion/downloader/IsDownloadActivity;)V

    .line 313
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 314
    return-void
.end method
