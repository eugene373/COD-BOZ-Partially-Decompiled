package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadNotification.java.
// 14 fields, 9 methods.

open class DownloadNotification: com.android.vending.expansion.downloader.IDownloaderClient {
    private var mClientProxy: com.android.vending.expansion.downloader.IDownloaderClient
    private var mContentIntent: android.app.PendingIntent
    private val mContext: android.content.Context
    private var mCurrentNotification: android.app.Notification
    private var mCurrentText: String
    private var mCurrentTitle: String
    val mCustomNotification: com.android.vending.expansion.downloader.impl.DownloadNotification.ICustomNotification
    private var mLabel: CharSequence
    private var mNotification: android.app.Notification
    private val mNotificationManager: android.app.NotificationManager
    private var mProgressInfo: com.android.vending.expansion.downloader.DownloadProgressInfo
    private var mState: Int

    constructor(p0: android.content.Context, p1: CharSequence)

    public fun getClientIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun onDownloadProgress(p0: com.android.vending.expansion.downloader.DownloadProgressInfo) { /* TODO(body): (Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V */ }
    /*
    //         .locals 5
    //         const v4, 0x1080081
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         invoke-interface {v0, p1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    //         :cond_0
    //         iget-wide v0, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-gtz v0, :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentTitle:Ljava/lang/String;
    //         iput-object v1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;
    //         iput v4, v0, Landroid/app/Notification;->icon:I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotification:Landroid/app/Notification;
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         :goto_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotificationManager:Landroid/app/NotificationManager;
    //         sget v1, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->NOTIFICATION_ID:I
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallProgress:J
    //         invoke-interface {v0, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setCurrentBytes(J)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mOverallTotal:J
    //         invoke-interface {v0, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTotalBytes(J)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         invoke-interface {v0, v4}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setIcon(I)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setPendingIntent(Landroid/app/PendingIntent;)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ": "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTicker(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTitle(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;->mTimeRemaining:J
    //         invoke-interface {v0, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->setTimeRemaining(J)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCustomNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;->updateNotification(Landroid/content/Context;)Landroid/app/Notification;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         goto :goto_0
    */

    public fun onDownloadStateChanged(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 7
    //         const v3, 0x1080082
    //         const v2, 0x108008a
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         invoke-interface {v4, p1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V
    //         :cond_0
    //         iget v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I
    //         if-eq p1, v4, :cond_1
    //         iput p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I
    //         if-eq p1, v1, :cond_1
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;
    //         if-nez v4, :cond_2
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         packed-switch p1, :pswitch_data_0
    //         :pswitch_0
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         move v0, v1
    //         move v1, v2
    //         :goto_1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;
    //         invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentTitle:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mLabel:Ljava/lang/CharSequence;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ": "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         iput v1, v2, Landroid/app/Notification;->icon:I
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContext:Landroid/content/Context;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentTitle:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v1, v2, v3, v4, v5}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/lit8 v1, v1, 0x2
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         :goto_2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mNotificationManager:Landroid/app/NotificationManager;
    //         sget v1, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->NOTIFICATION_ID:I
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v1, "Starting..."
    //         iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         move v1, v2
    //         goto :goto_1
    //         :pswitch_2
    //         const v0, 0x1080081
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         move v6, v1
    //         move v1, v0
    //         move v0, v6
    //         goto :goto_1
    //         :pswitch_3
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         move v0, v1
    //         move v1, v3
    //         goto :goto_1
    //         :pswitch_4
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         move v1, v3
    //         goto :goto_1
    //         :pswitch_5
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloaderStringResourceIDFromState(I)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentText:Ljava/lang/String;
    //         move v1, v2
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         and-int/lit8 v1, v1, -0x3
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mCurrentNotification:Landroid/app/Notification;
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/lit8 v1, v1, 0x10
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         goto :goto_2
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_3
    //             :pswitch_2
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_5
    //             :pswitch_5
    //             :pswitch_5
    //             :pswitch_5
    //             :pswitch_5
    //         .end packed-switch
    */

    public fun onServiceConnected(p0: android.os.Messenger) { /* TODO(body): (Landroid/os/Messenger;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun resendState() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V
    //         :cond_0
    //         return-void
    */

    public fun setClientIntent(p0: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mContentIntent:Landroid/app/PendingIntent;
    //         return-void
    */

    public fun setMessenger(p0: android.os.Messenger) { /* TODO(body): (Landroid/os/Messenger;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;->CreateProxy(Landroid/os/Messenger;)Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mProgressInfo:Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    //         :cond_0
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I
    //         const/4 v1, -0x1
    //         if-eq v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mClientProxy:Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->mState:I
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V
    //         :cond_1
    //         return-void
    */

    companion object {
    val LOGTAG: String = "DownloadNotification"
    val NOTIFICATION_ID: Int = 0
    }
}
