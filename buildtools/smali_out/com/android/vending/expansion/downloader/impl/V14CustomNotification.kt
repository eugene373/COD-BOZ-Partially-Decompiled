package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: V14CustomNotification.java.
// 7 fields, 10 methods.

open class V14CustomNotification: com.android.vending.expansion.downloader.impl.DownloadNotification.ICustomNotification {
    var mCurrentKB: Long
    var mIcon: Int
    var mPendingIntent: android.app.PendingIntent
    var mTicker: CharSequence
    var mTimeRemaining: Long
    var mTitle: CharSequence
    var mTotalKB: Long

    public constructor()

    public fun setCurrentBytes(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mCurrentKB:J
    //         return-void
    */

    public fun setIcon(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mIcon:I
    //         return-void
    */

    public fun setPendingIntent(p0: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-void
    */

    fun setProgress(p0: android.app.Notification.Builder) { /* TODO(body): (Landroid/app/Notification$Builder;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setTicker(p0: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTicker:Ljava/lang/CharSequence;
    //         return-void
    */

    public fun setTimeRemaining(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTimeRemaining:J
    //         return-void
    */

    public fun setTitle(p0: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTitle:Ljava/lang/CharSequence;
    //         return-void
    */

    public fun setTotalBytes(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTotalKB:J
    //         return-void
    */

    public fun updateNotification(p0: android.content.Context): android.app.Notification { return TODO("body: (Landroid/content/Context;)Landroid/app/Notification;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         new-instance v0, Landroid/app/Notification$Builder;
    //         invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTitle:Ljava/lang/CharSequence;
    //         invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mCurrentKB:J
    //         iget-wide v4, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTotalKB:J
    //         invoke-static {v2, v3, v4, v5}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloadProgressString(JJ)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mIcon:I
    //         if-eqz v1, :cond_0
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mIcon:I
    //         invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;
    //         :cond_0
    //         invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mTicker:Ljava/lang/CharSequence;
    //         invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
    //         invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;
    //         invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;
    //         move-result-object v0
    //         return-object v0
    */

}
