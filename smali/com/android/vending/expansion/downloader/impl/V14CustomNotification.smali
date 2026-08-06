.class public Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;
.super Ljava/lang/Object;
.source "V14CustomNotification.java"

# interfaces
.implements Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;


# instance fields
.field mCurrentKB:J

.field mIcon:I

.field mPendingIntent:Landroid/app/PendingIntent;

.field mTicker:Ljava/lang/CharSequence;

.field mTimeRemaining:J

.field mTitle:Ljava/lang/CharSequence;

.field mTotalKB:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, -0x1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTotalKB:J

    .line 31
    iput-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mCurrentKB:J

    return-void
.end method


# virtual methods
.method public setCurrentBytes(J)V
    .locals 1

    .prologue
    .line 52
    iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mCurrentKB:J

    .line 53
    return-void
.end method

.method public setIcon(I)V
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mIcon:I

    .line 38
    return-void
.end method

.method public setPendingIntent(Landroid/app/PendingIntent;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;

    .line 89
    return-void
.end method

.method setProgress(Landroid/app/Notification$Builder;)V
    .locals 0

    .prologue
    .line 57
    return-void
.end method

.method public setTicker(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTicker:Ljava/lang/CharSequence;

    .line 94
    return-void
.end method

.method public setTimeRemaining(J)V
    .locals 1

    .prologue
    .line 98
    iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTimeRemaining:J

    .line 99
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTitle:Ljava/lang/CharSequence;

    .line 43
    return-void
.end method

.method public setTotalBytes(J)V
    .locals 1

    .prologue
    .line 47
    iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTotalKB:J

    .line 48
    return-void
.end method

.method public updateNotification(Landroid/content/Context;)Landroid/app/Notification;
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 61
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 62
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTitle:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 68
    iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mCurrentKB:J

    iget-wide v4, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTotalKB:J

    invoke-static {v2, v3, v4, v5}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloadProgressString(JJ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 71
    iget v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mIcon:I

    if-eqz v1, :cond_0

    .line 72
    iget v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mIcon:I

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 78
    :cond_0
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 79
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTicker:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 80
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 81
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 83
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method
