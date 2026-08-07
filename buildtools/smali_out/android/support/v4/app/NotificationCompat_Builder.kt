package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 30 fields, 48 methods.

open class NotificationCompat_Builder {
    var mActions: java.util.ArrayList
    var mCategory: String
    var mColor: Int
    var mContentInfo: CharSequence
    var mContentIntent: android.app.PendingIntent
    var mContentText: CharSequence
    var mContentTitle: CharSequence
    var mContext: android.content.Context
    var mExtras: android.os.Bundle
    var mFullScreenIntent: android.app.PendingIntent
    var mGroupKey: String
    var mGroupSummary: Boolean
    var mLargeIcon: android.graphics.Bitmap
    var mLocalOnly: Boolean
    var mNotification: android.app.Notification
    var mNumber: Int
    public var mPeople: java.util.ArrayList
    var mPriority: Int
    var mProgress: Int
    var mProgressIndeterminate: Boolean
    var mProgressMax: Int
    var mPublicVersion: android.app.Notification
    var mShowWhen: Boolean
    var mSortKey: String
    var mStyle: android.support.v4.app.NotificationCompat.Style
    var mSubText: CharSequence
    var mTickerView: android.widget.RemoteViews
    var mUseChronometer: Boolean
    var mVisibility: Int

    public constructor(context: android.content.Context)

    private fun setFlag(mask: Int, value: Boolean) { /* TODO(body): (IZ)V */ }
    /*
    //         .locals 3
    //         if-eqz p2, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/2addr v1, p1
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         xor-int/lit8 v2, p1, -0x1
    //         and-int/2addr v1, v2
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         goto :goto_0
    */

    public fun addAction(icon: Int, title: CharSequence, intent: android.app.PendingIntent): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
    //         new-instance v1, Landroid/support/v4/app/NotificationCompat$Action;
    //         invoke-direct {v1, p1, p2, p3}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addAction(action: android.support.v4.app.NotificationCompat.Action): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Action;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addExtras(extras: android.os.Bundle): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         if-nez v0, :cond_1
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun addPerson(uri: String): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPeople:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun build(): android.app.Notification { return TODO("body: ()Landroid/app/Notification;") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         move-result-object v0
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
    //         move-result-object v0
    //         return-object v0
    */

    public fun extend(extender: android.support.v4.app.NotificationCompat.Extender): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         invoke-interface {p1, p0}, Landroid/support/v4/app/NotificationCompat$Extender;->extend(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;
    //         return-object p0
    */

    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getNotification(): android.app.Notification { return TODO("body: ()Landroid/app/Notification;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         move-result-object v0
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setAutoCancel(autoCancel: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         const/16 v0, 0x10
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setCategory(category: String): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mCategory:Ljava/lang/String;
    //         return-object p0
    */

    public fun setColor(argb: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mColor:I
    //         return-object p0
    */

    public fun setContent(views: android.widget.RemoteViews): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput-object p1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
    //         return-object p0
    */

    public fun setContentInfo(info: CharSequence): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setContentIntent(intent: android.app.PendingIntent): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
    //         return-object p0
    */

    public fun setContentText(text: CharSequence): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setContentTitle(title: CharSequence): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setDefaults(defaults: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p1, v0, Landroid/app/Notification;->defaults:I
    //         and-int/lit8 v0, p1, 0x4
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/lit8 v1, v1, 0x1
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         :cond_0
    //         return-object p0
    */

    public fun setDeleteIntent(intent: android.app.PendingIntent): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;
    //         return-object p0
    */

    public fun setExtras(extras: android.os.Bundle): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         return-object p0
    */

    public fun setFullScreenIntent(intent: android.app.PendingIntent, highPriority: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/app/PendingIntent;Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;
    //         const/16 v0, 0x80
    //         invoke-direct {p0, v0, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setGroup(groupKey: String): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;
    //         return-object p0
    */

    public fun setGroupSummary(isGroupSummary: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupSummary:Z
    //         return-object p0
    */

    public fun setLargeIcon(icon: android.graphics.Bitmap): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;
    //         return-object p0
    */

    public fun setLights(argb: Int, onMs: Int, offMs: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (III)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p1, v3, Landroid/app/Notification;->ledARGB:I
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p2, v3, Landroid/app/Notification;->ledOnMS:I
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p3, v3, Landroid/app/Notification;->ledOffMS:I
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget v3, v3, Landroid/app/Notification;->ledOnMS:I
    //         if-eqz v3, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget v3, v3, Landroid/app/Notification;->ledOffMS:I
    //         if-eqz v3, :cond_0
    //         move v0, v1
    //         .local v0, "showLights":Z
    //         :goto_0
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iget v4, v4, Landroid/app/Notification;->flags:I
    //         and-int/lit8 v4, v4, -0x2
    //         if-eqz v0, :cond_1
    //         :goto_1
    //         or-int/2addr v1, v4
    //         iput v1, v3, Landroid/app/Notification;->flags:I
    //         return-object p0
    //         .end local v0    # "showLights":Z
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         .restart local v0    # "showLights":Z
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    public fun setLocalOnly(b: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z
    //         return-object p0
    */

    public fun setNumber(number: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I
    //         return-object p0
    */

    public fun setOngoing(ongoing: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x2
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setOnlyAlertOnce(onlyAlertOnce: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         const/16 v0, 0x8
    //         invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V
    //         return-object p0
    */

    public fun setPriority(pri: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
    //         return-object p0
    */

    public fun setProgress(max: Int, progress: Int, indeterminate: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (IIZ)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I
    //         iput p2, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I
    //         iput-boolean p3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z
    //         return-object p0
    */

    public fun setPublicVersion(n: android.app.Notification): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/app/Notification;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPublicVersion:Landroid/app/Notification;
    //         return-object p0
    */

    public fun setShowWhen(show: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mShowWhen:Z
    //         return-object p0
    */

    public fun setSmallIcon(icon: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p1, v0, Landroid/app/Notification;->icon:I
    //         return-object p0
    */

    public fun setSmallIcon(icon: Int, level: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (II)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p1, v0, Landroid/app/Notification;->icon:I
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p2, v0, Landroid/app/Notification;->iconLevel:I
    //         return-object p0
    */

    public fun setSortKey(sortKey: String): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;
    //         return-object p0
    */

    public fun setSound(sound: android.net.Uri): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/net/Uri;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         const/4 v1, -0x1
    //         iput v1, v0, Landroid/app/Notification;->audioStreamType:I
    //         return-object p0
    */

    public fun setSound(sound: android.net.Uri, streamType: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/net/Uri;I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput p2, v0, Landroid/app/Notification;->audioStreamType:I
    //         return-object p0
    */

    public fun setStyle(style: android.support.v4.app.NotificationCompat.Style): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
    //         if-eq v0, p1, :cond_0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
    //         invoke-virtual {v0, p0}, Landroid/support/v4/app/NotificationCompat$Style;->setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V
    //         :cond_0
    //         return-object p0
    */

    public fun setSubText(text: CharSequence): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setTicker(tickerText: CharSequence): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v1
    //         iput-object v1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setTicker(tickerText: CharSequence, views: android.widget.RemoteViews): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v1
    //         iput-object v1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
    //         iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;
    //         return-object p0
    */

    public fun setUsesChronometer(b: Boolean): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (Z)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z
    //         return-object p0
    */

    public fun setVibrate(pattern: LongArray): android.support.v4.app.NotificationCompat.Builder { return TODO("body: ([J)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput-object p1, v0, Landroid/app/Notification;->vibrate:[J
    //         return-object p0
    */

    public fun setVisibility(visibility: Int): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (I)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mVisibility:I
    //         return-object p0
    */

    public fun setWhen(when: Long): android.support.v4.app.NotificationCompat.Builder { return TODO("body: (J)Landroid/support/v4/app/NotificationCompat$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         iput-wide p1, v0, Landroid/app/Notification;->when:J
    //         return-object p0
    */

    companion object {
    private val MAX_CHARSEQUENCE_LENGTH: Int = 0x1400

    protected @JvmStatic fun limitCharSequenceLength(cs: CharSequence): CharSequence { return TODO("body: (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         const/16 v1, 0x1400
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         invoke-interface {p0}, Ljava/lang/CharSequence;->length()I
    //         move-result v0
    //         if-le v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;
    //         move-result-object p0
    //         goto :goto_0
    */

    }
}
