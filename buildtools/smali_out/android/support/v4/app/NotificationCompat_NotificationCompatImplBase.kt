package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 0 fields, 14 methods.

open class NotificationCompat_NotificationCompatImplBase: android.support.v4.app.NotificationCompat.NotificationCompatImpl {
    constructor()

    public fun build(b: android.support.v4.app.NotificationCompat.Builder): android.app.Notification { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;") }
    /*
    //         .locals 5
    //         iget-object v0, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         .local v0, "result":Landroid/app/Notification;
    //         iget-object v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
    //         iget-object v2, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
    //         iget-object v3, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
    //         iget-object v4, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //         iget v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
    //         if-lez v1, :cond_0
    //         iget v1, v0, Landroid/app/Notification;->flags:I
    //         or-int/lit16 v1, v1, 0x80
    //         iput v1, v0, Landroid/app/Notification;->flags:I
    //         :cond_0
    //         return-object v0
    */

    public fun getAction(n: android.app.Notification, actionIndex: Int): android.support.v4.app.NotificationCompat.Action { return TODO("body: (Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getActionCount(n: android.app.Notification): Int { return TODO("body: (Landroid/app/Notification;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getActionsFromParcelableArrayList(p0: java.util.ArrayList): Array<android.support.v4.app.NotificationCompat.Action> { return TODO("body: (Ljava/util/ArrayList;)[Landroid/support/v4/app/NotificationCompat$Action;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Landroid/os/Parcelable;",
    //                 ">;)[",
    //                 "Landroid/support/v4/app/NotificationCompat$Action;"
    //             }
    //         .end annotation
    //         .local p1, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getBundleForUnreadConversation(uc: android.support.v4.app.NotificationCompatBase.UnreadConversation): android.os.Bundle { return TODO("body: (Landroid/support/v4/app/NotificationCompatBase$UnreadConversation;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getCategory(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getExtras(n: android.app.Notification): android.os.Bundle { return TODO("body: (Landroid/app/Notification;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getGroup(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getLocalOnly(n: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getParcelableArrayListForActions(actions: Array<android.support.v4.app.NotificationCompat.Action>): java.util.ArrayList { return TODO("body: ([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getSortKey(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getUnreadConversationFromBundle(b: android.os.Bundle, factory: android.support.v4.app.NotificationCompatBase.UnreadConversation.Factory, remoteInputFactory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): android.support.v4.app.NotificationCompatBase.UnreadConversation { return TODO("body: (Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$UnreadConversation$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$UnreadConversation;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun isGroupSummary(n: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

}
