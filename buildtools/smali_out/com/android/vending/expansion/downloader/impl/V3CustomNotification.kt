package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: V3CustomNotification.java.
// 8 fields, 9 methods.

open class V3CustomNotification: com.android.vending.expansion.downloader.impl.DownloadNotification.ICustomNotification {
    var mCurrentBytes: Long
    var mIcon: Int
    var mNotification: android.app.Notification
    var mPendingIntent: android.app.PendingIntent
    var mTicker: CharSequence
    var mTimeRemaining: Long
    var mTitle: CharSequence
    var mTotalBytes: Long

    public constructor()

    public fun setCurrentBytes(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mCurrentBytes:J
    //         return-void
    */

    public fun setIcon(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mIcon:I
    //         return-void
    */

    public fun setPendingIntent(p0: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-void
    */

    public fun setTicker(p0: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTicker:Ljava/lang/CharSequence;
    //         return-void
    */

    public fun setTimeRemaining(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTimeRemaining:J
    //         return-void
    */

    public fun setTitle(p0: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTitle:Ljava/lang/CharSequence;
    //         return-void
    */

    public fun setTotalBytes(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mTotalBytes:J
    //         return-void
    */

    public fun updateNotification(p0: android.content.Context): android.app.Notification { return TODO("body: (Landroid/content/Context;)Landroid/app/Notification;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mNotification:Landroid/app/Notification;
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mIcon:I
    //         iput v1, v0, Landroid/app/Notification;->icon:I
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/lit8 v1, v1, 0x2
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0xa
    //         if-le v1, v2, :cond_0
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/lit8 v1, v1, 0x8
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         :cond_0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;->mPendingIntent:Landroid/app/PendingIntent;
    //         iput-object v1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

}
