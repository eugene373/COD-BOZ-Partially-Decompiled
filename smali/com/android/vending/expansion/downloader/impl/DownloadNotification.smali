.class public Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
.super Ljava/lang/Object;
.source "DownloadNotification.java"

# interfaces
.implements Lcom/android/vending/expansion/downloader/IDownloaderClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    }
.end annotation


# static fields
.field static final LOGTAG:Ljava/lang/String; = "DownloadNotification"

.field static final NOTIFICATION_ID:I


# instance fields
.field private mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

.field private mContentIntent:Landroid/app/PendingIntent;

.field private final mContext:Landroid/content/Context;

.field private mCurrentNotification:Landroid/app/Notification;

.field private mCurrentText:Ljava/lang/String;

.field private mCurrentTitle:Ljava/lang/String;

.field final mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

.field private mLabel:Ljava/lang/CharSequence;

.field private mNotification:Landroid/app/Notification;

.field private final mNotificationManager:Landroid/app/NotificationManager;

.field private mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;

.field private mState:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 59
    const-string v0, "DownloadNotification"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sput v0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->NOTIFICATION_ID:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v0, -0x1

    iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I

    .line 215
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;

    .line 216
    iput-object p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;

    .line 217
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;

    const-string v1, "notification"

    .line 218
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotificationManager:Landroid/app/NotificationManager;

    .line 220
    invoke-static {}, Lcom/android/vending/expansion/downloader/impl/CustomNotificationFactory;->createCustomNotification()Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    .line 221
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;

    .line 222
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    .line 224
    return-void
.end method


# virtual methods
.method public getClientIntent()Landroid/app/PendingIntent;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    .locals 5

    .prologue
    const v4, 0x1080081

    .line 150
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;

    .line 151
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    invoke-interface {v0, p1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V

    .line 154
    :cond_0
    iget-wide v0, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 156
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentTitle:Ljava/lang/String;

    iput-object v1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 157
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;

    iput v4, v0, Landroid/app/Notification;->icon:I

    .line 158
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 159
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    .line 170
    :goto_0
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotificationManager:Landroid/app/NotificationManager;

    sget v1, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->NOTIFICATION_ID:I

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 171
    return-void

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J

    invoke-interface {v0, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setCurrentBytes(J)V

    .line 162
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J

    invoke-interface {v0, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTotalBytes(J)V

    .line 163
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    invoke-interface {v0, v4}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setIcon(I)V

    .line 164
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setPendingIntent(Landroid/app/PendingIntent;)V

    .line 165
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTicker(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTitle(Ljava/lang/CharSequence;)V

    .line 167
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mTimeRemaining:J

    invoke-interface {v0, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTimeRemaining(J)V

    .line 168
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->updateNotification(Landroid/content/Context;)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    goto :goto_0
.end method

.method public onDownloadStateChanged(I)V
    .locals 7

    .prologue
    const v3, 0x1080082

    const v2, 0x108008a

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 77
    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    if-eqz v4, :cond_0

    .line 78
    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    invoke-interface {v4, p1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V

    .line 80
    :cond_0
    iget v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I

    if-eq p1, v4, :cond_1

    .line 81
    iput p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I

    .line 82
    if-eq p1, v1, :cond_1

    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;

    if-nez v4, :cond_2

    .line 146
    :cond_1
    :goto_0
    return-void

    .line 90
    :cond_2
    packed-switch p1, :pswitch_data_0

    .line 129
    :pswitch_0
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    move v0, v1

    move v1, v2

    .line 133
    :goto_1
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentTitle:Ljava/lang/String;

    .line 134
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 135
    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    iput v1, v2, Landroid/app/Notification;->icon:I

    .line 136
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 138
    if-eqz v0, :cond_3

    .line 139
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 144
    :goto_2
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotificationManager:Landroid/app/NotificationManager;

    sget v1, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->NOTIFICATION_ID:I

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_0

    .line 93
    :pswitch_1
    const-string v1, "Starting..."

    iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    move v1, v2

    .line 95
    goto :goto_1

    .line 98
    :pswitch_2
    const v0, 0x1080081

    .line 99
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    move v6, v1

    move v1, v0

    move v0, v6

    .line 101
    goto :goto_1

    .line 106
    :pswitch_3
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    move v0, v1

    move v1, v3

    .line 108
    goto :goto_1

    .line 113
    :pswitch_4
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    move v1, v3

    .line 115
    goto :goto_1

    .line 123
    :pswitch_5
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;

    move v1, v2

    .line 125
    goto :goto_1

    .line 141
    :cond_3
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 v1, v1, -0x3

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 142
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Landroid/app/Notification;->flags:I

    goto :goto_2

    .line 90
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public onServiceConnected(Landroid/os/Messenger;)V
    .locals 0

    .prologue
    .line 228
    return-void
.end method

.method public resendState()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    iget v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V

    .line 73
    :cond_0
    return-void
.end method

.method public setClientIntent(Landroid/app/PendingIntent;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;

    .line 67
    return-void
.end method

.method public setMessenger(Landroid/os/Messenger;)V
    .locals 2

    .prologue
    .line 198
    invoke-static {p1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;->CreateProxy(Landroid/os/Messenger;)Lcom/android/vending/expansion/downloader/IDownloaderClient;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    .line 199
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V

    .line 202
    :cond_0
    iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 203
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;

    iget v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V

    .line 205
    :cond_1
    return-void
.end method
