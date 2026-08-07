package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 61 fields, 17 methods.

open class NotificationCompat {
    public constructor()

    companion object {
    @JvmField public val CATEGORY_ALARM: String = "alarm"
    @JvmField public val CATEGORY_CALL: String = "call"
    @JvmField public val CATEGORY_EMAIL: String = "email"
    @JvmField public val CATEGORY_ERROR: String = "err"
    @JvmField public val CATEGORY_EVENT: String = "event"
    @JvmField public val CATEGORY_MESSAGE: String = "msg"
    @JvmField public val CATEGORY_PROGRESS: String = "progress"
    @JvmField public val CATEGORY_PROMO: String = "promo"
    @JvmField public val CATEGORY_RECOMMENDATION: String = "recommendation"
    @JvmField public val CATEGORY_SERVICE: String = "service"
    @JvmField public val CATEGORY_SOCIAL: String = "social"
    @JvmField public val CATEGORY_STATUS: String = "status"
    @JvmField public val CATEGORY_SYSTEM: String = "sys"
    @JvmField public val CATEGORY_TRANSPORT: String = "transport"
    @JvmField public val COLOR_DEFAULT: Int = 0x0
    @JvmField public val DEFAULT_ALL: Int = 0
    @JvmField public val DEFAULT_LIGHTS: Int = 0x4
    @JvmField public val DEFAULT_SOUND: Int = 0x1
    @JvmField public val DEFAULT_VIBRATE: Int = 0x2
    @JvmField public val EXTRA_BACKGROUND_IMAGE_URI: String = "android.backgroundImageUri"
    @JvmField public val EXTRA_BIG_TEXT: String = "android.bigText"
    @JvmField public val EXTRA_COMPACT_ACTIONS: String = "android.compactActions"
    @JvmField public val EXTRA_INFO_TEXT: String = "android.infoText"
    @JvmField public val EXTRA_LARGE_ICON: String = "android.largeIcon"
    @JvmField public val EXTRA_LARGE_ICON_BIG: String = "android.largeIcon.big"
    @JvmField public val EXTRA_MEDIA_SESSION: String = "android.mediaSession"
    @JvmField public val EXTRA_PEOPLE: String = "android.people"
    @JvmField public val EXTRA_PICTURE: String = "android.picture"
    @JvmField public val EXTRA_PROGRESS: String = "android.progress"
    @JvmField public val EXTRA_PROGRESS_INDETERMINATE: String = "android.progressIndeterminate"
    @JvmField public val EXTRA_PROGRESS_MAX: String = "android.progressMax"
    @JvmField public val EXTRA_SHOW_CHRONOMETER: String = "android.showChronometer"
    @JvmField public val EXTRA_SHOW_WHEN: String = "android.showWhen"
    @JvmField public val EXTRA_SMALL_ICON: String = "android.icon"
    @JvmField public val EXTRA_SUB_TEXT: String = "android.subText"
    @JvmField public val EXTRA_SUMMARY_TEXT: String = "android.summaryText"
    @JvmField public val EXTRA_TEMPLATE: String = "android.template"
    @JvmField public val EXTRA_TEXT: String = "android.text"
    @JvmField public val EXTRA_TEXT_LINES: String = "android.textLines"
    @JvmField public val EXTRA_TITLE: String = "android.title"
    @JvmField public val EXTRA_TITLE_BIG: String = "android.title.big"
    @JvmField public val FLAG_AUTO_CANCEL: Int = 0x10
    @JvmField public val FLAG_FOREGROUND_SERVICE: Int = 0x40
    @JvmField public val FLAG_GROUP_SUMMARY: Int = 0x200
    @JvmField public val FLAG_HIGH_PRIORITY: Int = 0x80
    @JvmField public val FLAG_INSISTENT: Int = 0x4
    @JvmField public val FLAG_LOCAL_ONLY: Int = 0x100
    @JvmField public val FLAG_NO_CLEAR: Int = 0x20
    @JvmField public val FLAG_ONGOING_EVENT: Int = 0x2
    @JvmField public val FLAG_ONLY_ALERT_ONCE: Int = 0x8
    @JvmField public val FLAG_SHOW_LIGHTS: Int = 0x1
    private val IMPL: android.support.v4.app.NotificationCompat.NotificationCompatImpl = null!!
    @JvmField public val PRIORITY_DEFAULT: Int = 0x0
    @JvmField public val PRIORITY_HIGH: Int = 0x1
    @JvmField public val PRIORITY_LOW: Int = 0
    @JvmField public val PRIORITY_MAX: Int = 0x2
    @JvmField public val PRIORITY_MIN: Int = 0
    @JvmField public val STREAM_DEFAULT: Int = 0
    @JvmField public val VISIBILITY_PRIVATE: Int = 0x0
    @JvmField public val VISIBILITY_PUBLIC: Int = 0x1
    @JvmField public val VISIBILITY_SECRET: Int = 0

    private @JvmStatic fun addActionsToBuilder(builder: android.support.v4.app.NotificationBuilderWithActions, p1: java.util.ArrayList) { /* TODO(body): (Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 3
    //         .local p1, "actions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/NotificationCompat$Action;>;"
    //         invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         .local v1, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/NotificationCompat$Action;
    //         .local v0, "action":Landroid/support/v4/app/NotificationCompat$Action;
    //         invoke-interface {p0, v0}, Landroid/support/v4/app/NotificationBuilderWithActions;->addAction(Landroid/support/v4/app/NotificationCompatBase$Action;)V
    //         goto :goto_0
    //         .end local v0    # "action":Landroid/support/v4/app/NotificationCompat$Action;
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun addStyleToBuilderJellybean(builder: android.support.v4.app.NotificationBuilderWithBuilderAccessor, style: android.support.v4.app.NotificationCompat.Style) { /* TODO(body): (Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V */ }
    /*
    //         .locals 10
    //         if-eqz p1, :cond_0
    //         instance-of v0, p1, Landroid/support/v4/app/NotificationCompat$BigTextStyle;
    //         if-eqz v0, :cond_1
    //         move-object v8, p1
    //         check-cast v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;
    //         .local v8, "bigTextStyle":Landroid/support/v4/app/NotificationCompat$BigTextStyle;
    //         iget-object v0, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigContentTitle:Ljava/lang/CharSequence;
    //         iget-boolean v1, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryTextSet:Z
    //         iget-object v2, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryText:Ljava/lang/CharSequence;
    //         iget-object v3, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigText:Ljava/lang/CharSequence;
    //         invoke-static {p0, v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompatJellybean;->addBigTextStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V
    //         .end local v8    # "bigTextStyle":Landroid/support/v4/app/NotificationCompat$BigTextStyle;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         instance-of v0, p1, Landroid/support/v4/app/NotificationCompat$InboxStyle;
    //         if-eqz v0, :cond_2
    //         move-object v9, p1
    //         check-cast v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;
    //         .local v9, "inboxStyle":Landroid/support/v4/app/NotificationCompat$InboxStyle;
    //         iget-object v0, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mBigContentTitle:Ljava/lang/CharSequence;
    //         iget-boolean v1, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryTextSet:Z
    //         iget-object v2, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryText:Ljava/lang/CharSequence;
    //         iget-object v3, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
    //         invoke-static {p0, v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompatJellybean;->addInboxStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V
    //         goto :goto_0
    //         .end local v9    # "inboxStyle":Landroid/support/v4/app/NotificationCompat$InboxStyle;
    //         :cond_2
    //         instance-of v0, p1, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    //         if-eqz v0, :cond_0
    //         move-object v7, p1
    //         check-cast v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    //         .local v7, "bigPictureStyle":Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    //         iget-object v1, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigContentTitle:Ljava/lang/CharSequence;
    //         iget-boolean v2, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryTextSet:Z
    //         iget-object v3, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryText:Ljava/lang/CharSequence;
    //         iget-object v4, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mPicture:Landroid/graphics/Bitmap;
    //         iget-object v5, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIcon:Landroid/graphics/Bitmap;
    //         iget-boolean v6, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIconSet:Z
    //         move-object v0, p0
    //         invoke-static/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompatJellybean;->addBigPictureStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V
    //         goto :goto_0
    */

    public @JvmStatic fun getAction(notif: android.app.Notification, actionIndex: Int): android.support.v4.app.NotificationCompat.Action { return TODO("body: (Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getActionCount(notif: android.app.Notification): Int { return TODO("body: (Landroid/app/Notification;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getActionCount(Landroid/app/Notification;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getCategory(notif: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getCategory(Landroid/app/Notification;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getExtras(notif: android.app.Notification): android.os.Bundle { return TODO("body: (Landroid/app/Notification;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getGroup(notif: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getGroup(Landroid/app/Notification;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getLocalOnly(notif: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getLocalOnly(Landroid/app/Notification;)Z
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getNotificationArrayFromBundle(bundle: android.os.Bundle, key: String): Array<android.app.Notification> { return TODO("body: (Landroid/os/Bundle;Ljava/lang/String;)[Landroid/app/Notification;") }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
    //         move-result-object v0
    //         .local v0, "array":[Landroid/os/Parcelable;
    //         instance-of v3, v0, [Landroid/app/Notification;
    //         if-nez v3, :cond_0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         check-cast v0, [Landroid/app/Notification;
    //         .end local v0    # "array":[Landroid/os/Parcelable;
    //         check-cast v0, [Landroid/app/Notification;
    //         move-object v2, v0
    //         :goto_0
    //         return-object v2
    //         .restart local v0    # "array":[Landroid/os/Parcelable;
    //         :cond_1
    //         array-length v3, v0
    //         new-array v2, v3, [Landroid/app/Notification;
    //         .local v2, "typedArray":[Landroid/app/Notification;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_1
    //         array-length v3, v0
    //         if-ge v1, v3, :cond_2
    //         aget-object v3, v0, v1
    //         check-cast v3, Landroid/app/Notification;
    //         aput-object v3, v2, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {p0, p1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         goto :goto_0
    */

    public @JvmStatic fun getSortKey(notif: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isGroupSummary(notif: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->isGroupSummary(Landroid/app/Notification;)Z
    //         move-result v0
    //         return v0
    */

    }
}
