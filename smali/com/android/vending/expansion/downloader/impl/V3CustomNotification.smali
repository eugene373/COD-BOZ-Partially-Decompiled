.class public Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;
.super Ljava/lang/Object;
.source "V3CustomNotification.java"

# interfaces
.implements Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;


# instance fields
.field mCurrentBytes:J

.field mIcon:I

.field mNotification:Landroid/app/Notification;

.field mPendingIntent:Landroid/app/PendingIntent;

.field mTicker:Ljava/lang/CharSequence;

.field mTimeRemaining:J

.field mTitle:Ljava/lang/CharSequence;

.field mTotalBytes:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, -0x1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTotalBytes:J

    .line 34
    iput-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mCurrentBytes:J

    .line 37
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mNotification:Landroid/app/Notification;

    return-void
.end method


# virtual methods
.method public setCurrentBytes(J)V
    .locals 1

    .prologue
    .line 56
    iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mCurrentBytes:J

    .line 57
    return-void
.end method

.method public setIcon(I)V
    .locals 0

    .prologue
    .line 41
    iput p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mIcon:I

    .line 42
    return-void
.end method

.method public setPendingIntent(Landroid/app/PendingIntent;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;

    .line 104
    return-void
.end method

.method public setTicker(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTicker:Ljava/lang/CharSequence;

    .line 109
    return-void
.end method

.method public setTimeRemaining(J)V
    .locals 1

    .prologue
    .line 113
    iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTimeRemaining:J

    .line 114
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTitle:Ljava/lang/CharSequence;

    .line 47
    return-void
.end method

.method public setTotalBytes(J)V
    .locals 1

    .prologue
    .line 51
    iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTotalBytes:J

    .line 52
    return-void
.end method

.method public updateNotification(Landroid/content/Context;)Landroid/app/Notification;
    .locals 3

    .prologue
    .line 61
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mNotification:Landroid/app/Notification;

    .line 63
    iget v1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mIcon:I

    iput v1, v0, Landroid/app/Notification;->icon:I

    .line 65
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 67
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xa

    if-le v1, v2, :cond_0

    .line 68
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x8

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;

    iput-object v1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 98
    return-object v0
.end method
