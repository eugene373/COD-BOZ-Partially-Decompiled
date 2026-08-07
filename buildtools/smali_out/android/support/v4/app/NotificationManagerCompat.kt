package android.support.v4.app

// Auto-emitted from smali source: NotificationManagerCompat.java.
// 16 fields, 12 methods.

open class NotificationManagerCompat {
    private val mContext: android.content.Context
    private val mNotificationManager: android.app.NotificationManager

    private constructor(context: android.content.Context)

    private fun pushSideChannelQueue(task: android.support.v4.app.NotificationManagerCompat.Task) { /* TODO(body): (Landroid/support/v4/app/NotificationManagerCompat$Task;)V */ }
    /*
    //         .locals 3
    //         sget-object v1, Landroid/support/v4/app/NotificationManagerCompat;->sLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->queueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun cancel(id: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0, p1}, Landroid/support/v4/app/NotificationManagerCompat;->cancel(Ljava/lang/String;I)V
    //         return-void
    */

    public fun cancel(tag: String, id: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x13
    //         if-gt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p2, p1}, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    //         invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    //         :cond_0
    //         return-void
    */

    public fun cancelAll() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
    //         invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x13
    //         if-gt v0, v1, :cond_0
    //         new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;-><init>(Ljava/lang/String;)V
    //         invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    //         :cond_0
    //         return-void
    */

    public fun notify(id: Int, notification: android.app.Notification) { /* TODO(body): (ILandroid/app/Notification;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
    //         return-void
    */

    public fun notify(tag: String, id: Int, notification: android.app.Notification) { /* TODO(body): (Ljava/lang/String;ILandroid/app/Notification;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p3}, Landroid/support/v4/app/NotificationManagerCompat;->useSideChannelForNotification(Landroid/app/Notification;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p2, p1, p3}, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    //         invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    //         sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
    //         invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val ACTION_BIND_SIDE_CHANNEL: String = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
    @JvmField public val EXTRA_USE_SIDE_CHANNEL: String = "android.support.useSideChannel"
    private val IMPL: android.support.v4.app.NotificationManagerCompat.Impl = null!!
    val MAX_SIDE_CHANNEL_SDK_VERSION: Int = 0x13
    private val SETTING_ENABLED_NOTIFICATION_LISTENERS: String = "enabled_notification_listeners"
    private val SIDE_CHANNEL_BIND_FLAGS: Int = 0
    private val SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS: Int = 0x3e8
    private val SIDE_CHANNEL_RETRY_MAX_COUNT: Int = 0x6
    private val TAG: String = "NotifManCompat"
    private var sEnabledNotificationListenerPackages: java.util.Set
    private var sEnabledNotificationListeners: String
    private val sEnabledNotificationListenersLock: Object = null!!
    private val sLock: Object = null!!
    private var sSideChannelManager: android.support.v4.app.NotificationManagerCompat.SideChannelManager

    public @JvmStatic fun from(context: android.content.Context): android.support.v4.app.NotificationManagerCompat { return TODO("body: (Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/app/NotificationManagerCompat;
    //         invoke-direct {v0, p0}, Landroid/support/v4/app/NotificationManagerCompat;-><init>(Landroid/content/Context;)V
    //         return-object v0
    */

    public @JvmStatic fun getEnabledListenerPackages(context: android.content.Context): java.util.Set { return TODO("body: (Landroid/content/Context;)Ljava/util/Set;") }
    /*
    //         .locals 10
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v8
    //         const-string v9, "enabled_notification_listeners"
    //         invoke-static {v8, v9}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         .local v4, "enabledNotificationListeners":Ljava/lang/String;
    //         if-eqz v4, :cond_2
    //         sget-object v8, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListeners:Ljava/lang/String;
    //         invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v8
    //         if-nez v8, :cond_2
    //         const-string v8, ":"
    //         invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "components":[Ljava/lang/String;
    //         new-instance v7, Ljava/util/HashSet;
    //         array-length v8, v3
    //         invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(I)V
    //         .local v7, "packageNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    //         move-object v0, v3
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v6, v0
    //         .local v6, "len$":I
    //         const/4 v5, 0x0
    //         .local v5, "i$":I
    //         :goto_0
    //         if-ge v5, v6, :cond_1
    //         aget-object v1, v0, v5
    //         .local v1, "component":Ljava/lang/String;
    //         invoke-static {v1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;
    //         move-result-object v2
    //         .local v2, "componentName":Landroid/content/ComponentName;
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
    //         move-result-object v8
    //         invoke-interface {v7, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_0
    //         .end local v1    # "component":Ljava/lang/String;
    //         .end local v2    # "componentName":Landroid/content/ComponentName;
    //         :cond_1
    //         sget-object v9, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenersLock:Ljava/lang/Object;
    //         monitor-enter v9
    //         :try_start_0
    //         sput-object v7, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;
    //         sput-object v4, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListeners:Ljava/lang/String;
    //         monitor-exit v9
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .end local v0    # "arr$":[Ljava/lang/String;
    //         .end local v3    # "components":[Ljava/lang/String;
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .end local v7    # "packageNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    //         :cond_2
    //         sget-object v8, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;
    //         return-object v8
    //         .restart local v0    # "arr$":[Ljava/lang/String;
    //         .restart local v3    # "components":[Ljava/lang/String;
    //         .restart local v5    # "i$":I
    //         .restart local v6    # "len$":I
    //         .restart local v7    # "packageNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    //         :catchall_0
    //         move-exception v8
    //         :try_start_1
    //         monitor-exit v9
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v8
    */

    private @JvmStatic fun useSideChannelForNotification(notification: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompat;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "extras":Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         const-string v1, "android.support.useSideChannel"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    }
}
