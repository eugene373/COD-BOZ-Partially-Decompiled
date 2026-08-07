package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatJellybean.java.
// 23 fields, 21 methods.

open class NotificationCompatJellybean {
    constructor()

    companion object {
    val EXTRA_ACTION_EXTRAS: String = "android.support.actionExtras"
    val EXTRA_GROUP_KEY: String = "android.support.groupKey"
    val EXTRA_GROUP_SUMMARY: String = "android.support.isGroupSummary"
    val EXTRA_LOCAL_ONLY: String = "android.support.localOnly"
    val EXTRA_REMOTE_INPUTS: String = "android.support.remoteInputs"
    val EXTRA_SORT_KEY: String = "android.support.sortKey"
    val EXTRA_USE_SIDE_CHANNEL: String = "android.support.useSideChannel"
    private val KEY_ACTION_INTENT: String = "actionIntent"
    private val KEY_EXTRAS: String = "extras"
    private val KEY_ICON: String = "icon"
    private val KEY_REMOTE_INPUTS: String = "remoteInputs"
    private val KEY_TITLE: String = "title"
    @JvmField public val TAG: String = "NotificationCompat"
    private var sActionClass: Class
    private var sActionIconField: java.lang.reflect.Field
    private var sActionIntentField: java.lang.reflect.Field
    private var sActionTitleField: java.lang.reflect.Field
    private var sActionsAccessFailed: Boolean
    private var sActionsField: java.lang.reflect.Field
    private val sActionsLock: Object = null!!
    private var sExtrasField: java.lang.reflect.Field
    private var sExtrasFieldAccessFailed: Boolean
    private val sExtrasLock: Object = null!!

    public @JvmStatic fun addBigPictureStyle(b: android.support.v4.app.NotificationBuilderWithBuilderAccessor, bigContentTitle: CharSequence, useSummary: Boolean, summaryText: CharSequence, bigPicture: android.graphics.Bitmap, bigLargeIcon: android.graphics.Bitmap, bigLargeIconSet: Boolean) { /* TODO(body): (Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V */ }
    /*
    //         .locals 3
    //         new-instance v1, Landroid/app/Notification$BigPictureStyle;
    //         invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V
    //         invoke-virtual {v1, p1}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
    //         move-result-object v1
    //         invoke-virtual {v1, p4}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;
    //         move-result-object v0
    //         .local v0, "style":Landroid/app/Notification$BigPictureStyle;
    //         if-eqz p6, :cond_0
    //         invoke-virtual {v0, p5}, Landroid/app/Notification$BigPictureStyle;->bigLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;
    //         :cond_0
    //         if-eqz p2, :cond_1
    //         invoke-virtual {v0, p3}, Landroid/app/Notification$BigPictureStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
    //         :cond_1
    //         return-void
    */

    public @JvmStatic fun addBigTextStyle(b: android.support.v4.app.NotificationBuilderWithBuilderAccessor, bigContentTitle: CharSequence, useSummary: Boolean, summaryText: CharSequence, bigText: CharSequence) { /* TODO(body): (Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 3
    //         new-instance v1, Landroid/app/Notification$BigTextStyle;
    //         invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V
    //         invoke-virtual {v1, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
    //         move-result-object v1
    //         invoke-virtual {v1, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
    //         move-result-object v0
    //         .local v0, "style":Landroid/app/Notification$BigTextStyle;
    //         if-eqz p2, :cond_0
    //         invoke-virtual {v0, p3}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun addInboxStyle(b: android.support.v4.app.NotificationBuilderWithBuilderAccessor, bigContentTitle: CharSequence, useSummary: Boolean, summaryText: CharSequence, p4: java.util.ArrayList) { /* TODO(body): (Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 5
    //         .local p4, "texts":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/CharSequence;>;"
    //         new-instance v3, Landroid/app/Notification$InboxStyle;
    //         invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;
    //         move-result-object v4
    //         invoke-direct {v3, v4}, Landroid/app/Notification$InboxStyle;-><init>(Landroid/app/Notification$Builder;)V
    //         invoke-virtual {v3, p1}, Landroid/app/Notification$InboxStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
    //         move-result-object v1
    //         .local v1, "style":Landroid/app/Notification$InboxStyle;
    //         if-eqz p2, :cond_0
    //         invoke-virtual {v1, p3}, Landroid/app/Notification$InboxStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
    //         :cond_0
    //         invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         .local v0, "i$":Ljava/util/Iterator;
    //         :goto_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/CharSequence;
    //         .local v2, "text":Ljava/lang/CharSequence;
    //         invoke-virtual {v1, v2}, Landroid/app/Notification$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
    //         goto :goto_0
    //         .end local v2    # "text":Ljava/lang/CharSequence;
    //         :cond_1
    //         return-void
    */

    public @JvmStatic fun buildActionExtrasMap(p0: java.util.List): android.util.SparseArray { return TODO("body: (Ljava/util/List;)Landroid/util/SparseArray;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/os/Bundle;",
    //                 ">;)",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/os/Bundle;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .local p0, "actionExtrasList":Ljava/util/List;, "Ljava/util/List<Landroid/os/Bundle;>;"
    //         const/4 v1, 0x0
    //         .local v1, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v2
    //         .local v2, "count":I
    //         :goto_0
    //         if-ge v3, v2, :cond_2
    //         invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         .local v0, "actionExtras":Landroid/os/Bundle;
    //         if-eqz v0, :cond_1
    //         if-nez v1, :cond_0
    //         new-instance v1, Landroid/util/SparseArray;
    //         .end local v1    # "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V
    //         .restart local v1    # "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         :cond_0
    //         invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    //         :cond_1
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v0    # "actionExtras":Landroid/os/Bundle;
    //         :cond_2
    //         return-object v1
    */

    private @JvmStatic fun ensureActionReflectionReadyLocked(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         sget-boolean v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
    //         if-eqz v3, :cond_0
    //         :goto_0
    //         return v2
    //         :cond_0
    //         :try_start_0
    //         sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
    //         if-nez v3, :cond_1
    //         const-string v3, "android.app.Notification$Action"
    //         invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v3
    //         sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
    //         sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
    //         const-string v4, "icon"
    //         invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v3
    //         sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIconField:Ljava/lang/reflect/Field;
    //         sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
    //         const-string v4, "title"
    //         invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v3
    //         sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionTitleField:Ljava/lang/reflect/Field;
    //         sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
    //         const-string v4, "actionIntent"
    //         invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v3
    //         sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIntentField:Ljava/lang/reflect/Field;
    //         const-class v3, Landroid/app/Notification;
    //         const-string v4, "actions"
    //         invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v3
    //         sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
    //         sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
    //         const/4 v4, 0x1
    //         invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    //         :cond_1
    //         :goto_1
    //         sget-boolean v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
    //         if-nez v3, :cond_2
    //         :goto_2
    //         move v2, v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/ClassNotFoundException;
    //         const-string v3, "NotificationCompat"
    //         const-string v4, "Unable to access notification actions"
    //         invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
    //         goto :goto_1
    //         .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    //         :catch_1
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/NoSuchFieldException;
    //         const-string v3, "NotificationCompat"
    //         const-string v4, "Unable to access notification actions"
    //         invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
    //         goto :goto_1
    //         .end local v0    # "e":Ljava/lang/NoSuchFieldException;
    //         :cond_2
    //         move v1, v2
    //         goto :goto_2
    */

    public @JvmStatic fun getAction(notif: android.app.Notification, actionIndex: Int, factory: android.support.v4.app.NotificationCompatBase.Action.Factory, remoteInputFactory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): android.support.v4.app.NotificationCompatBase.Action { return TODO("body: (Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;") }
    /*
    //         .locals 11
    //         sget-object v10, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
    //         monitor-enter v10
    //         :try_start_0
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;
    //         move-result-object v0
    //         aget-object v7, v0, p1
    //         .local v7, "actionObject":Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         .local v5, "actionExtras":Landroid/os/Bundle;
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v9
    //         .local v9, "extras":Landroid/os/Bundle;
    //         if-eqz v9, :cond_0
    //         const-string v0, "android.support.actionExtras"
    //         invoke-virtual {v9, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
    //         move-result-object v6
    //         .local v6, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         if-eqz v6, :cond_0
    //         invoke-virtual {v6, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
    //         move-result-object v5
    //         .end local v5    # "actionExtras":Landroid/os/Bundle;
    //         check-cast v5, Landroid/os/Bundle;
    //         .end local v6    # "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         .restart local v5    # "actionExtras":Landroid/os/Bundle;
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIconField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    //         move-result v2
    //         sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionTitleField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/CharSequence;
    //         sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIntentField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v4
    //         check-cast v4, Landroid/app/PendingIntent;
    //         move-object v0, p2
    //         move-object v1, p3
    //         invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatJellybean;->readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         :try_start_1
    //         monitor-exit v10
    //         .end local v5    # "actionExtras":Landroid/os/Bundle;
    //         .end local v7    # "actionObject":Ljava/lang/Object;
    //         .end local v9    # "extras":Landroid/os/Bundle;
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v8
    //         .local v8, "e":Ljava/lang/IllegalAccessException;
    //         const-string v0, "NotificationCompat"
    //         const-string v1, "Unable to access notification actions"
    //         invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/4 v0, 0x1
    //         sput-boolean v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
    //         monitor-exit v10
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         .end local v8    # "e":Ljava/lang/IllegalAccessException;
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v10
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getActionCount(notif: android.app.Notification): Int { return TODO("body: (Landroid/app/Notification;)I") }
    /*
    //         .locals 3
    //         sget-object v2, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "actionObjects":[Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         array-length v1, v0
    //         :goto_0
    //         monitor-exit v2
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         .end local v0    # "actionObjects":[Ljava/lang/Object;
    //         :catchall_0
    //         move-exception v1
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v1
    */

    private @JvmStatic fun getActionFromBundle(bundle: android.os.Bundle, actionFactory: android.support.v4.app.NotificationCompatBase.Action.Factory, remoteInputFactory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): android.support.v4.app.NotificationCompatBase.Action { return TODO("body: (Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;") }
    /*
    //         .locals 6
    //         const-string v0, "icon"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         const-string v0, "title"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v2
    //         const-string v0, "actionIntent"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v3
    //         check-cast v3, Landroid/app/PendingIntent;
    //         const-string v0, "extras"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v4
    //         const-string v0, "remoteInputs"
    //         invoke-static {p0, v0}, Landroid/support/v4/app/BundleUtil;->getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v0, p2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v5
    //         move-object v0, p1
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun getActionObjectsLocked(notif: android.app.Notification): Array<Object> { return TODO("body: (Landroid/app/Notification;)[Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatJellybean;->ensureActionReflectionReadyLocked()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-object v1, v2
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         :try_start_1
    //         sget-object v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, [Ljava/lang/Object;
    //         check-cast v1, [Ljava/lang/Object;
    //         :try_end_1
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         monitor-exit v3
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         monitor-exit v3
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v1
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/IllegalAccessException;
    //         :try_start_3
    //         const-string v1, "NotificationCompat"
    //         const-string v4, "Unable to access notification actions"
    //         invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/4 v1, 0x1
    //         sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
    //         monitor-exit v3
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         move-object v1, v2
    //         goto :goto_0
    */

    public @JvmStatic fun getActionsFromParcelableArrayList(actionFactory: java.util.ArrayList, remoteInputFactory: android.support.v4.app.NotificationCompatBase.Action.Factory, p2: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): Array<android.support.v4.app.NotificationCompatBase.Action> { return TODO("body: (Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;") }
    /*
    //         .locals 3
    //         .local p0, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    //         if-nez p0, :cond_1
    //         const/4 v0, 0x0
    //         :cond_0
    //         return-object v0
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         invoke-interface {p1, v2}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v0
    //         .local v0, "actions":[Landroid/support/v4/app/NotificationCompatBase$Action;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         array-length v2, v0
    //         if-ge v1, v2, :cond_0
    //         invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/os/Bundle;
    //         invoke-static {v2, p1, p2}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionFromBundle(Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    */

    private @JvmStatic fun getBundleForAction(action: android.support.v4.app.NotificationCompatBase.Action): android.os.Bundle { return TODO("body: (Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         .local v0, "bundle":Landroid/os/Bundle;
    //         const-string v1, "icon"
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v1, "title"
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         const-string v1, "actionIntent"
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const-string v1, "extras"
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         const-string v1, "remoteInputs"
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         return-object v0
    */

    public @JvmStatic fun getExtras(notif: android.app.Notification): android.os.Bundle { return TODO("body: (Landroid/app/Notification;)Landroid/os/Bundle;") }
    /*
    //         .locals 7
    //         const/4 v3, 0x0
    //         sget-object v4, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasLock:Ljava/lang/Object;
    //         monitor-enter v4
    //         :try_start_0
    //         sget-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
    //         if-eqz v5, :cond_0
    //         monitor-exit v4
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-object v1, v3
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         :try_start_1
    //         sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
    //         if-nez v5, :cond_2
    //         const-class v5, Landroid/app/Notification;
    //         const-string v6, "extras"
    //         invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v2
    //         .local v2, "extrasField":Ljava/lang/reflect/Field;
    //         const-class v5, Landroid/os/Bundle;
    //         invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
    //         move-result-object v6
    //         invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v5
    //         if-nez v5, :cond_1
    //         const-string v5, "NotificationCompat"
    //         const-string v6, "Notification.extras field is not of type Bundle"
    //         invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v5, 0x1
    //         sput-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
    //         :try_end_1
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         monitor-exit v4
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         move-object v1, v3
    //         goto :goto_0
    //         :cond_1
    //         const/4 v5, 0x1
    //         :try_start_3
    //         invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    //         sput-object v2, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
    //         .end local v2    # "extrasField":Ljava/lang/reflect/Field;
    //         :cond_2
    //         sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Landroid/os/Bundle;
    //         .local v1, "extras":Landroid/os/Bundle;
    //         if-nez v1, :cond_3
    //         new-instance v1, Landroid/os/Bundle;
    //         .end local v1    # "extras":Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         .restart local v1    # "extras":Landroid/os/Bundle;
    //         sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
    //         invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    //         :try_end_3
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_0
    //         .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_1
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         :cond_3
    //         :try_start_4
    //         monitor-exit v4
    //         goto :goto_0
    //         .end local v1    # "extras":Landroid/os/Bundle;
    //         :catchall_0
    //         move-exception v3
    //         monitor-exit v4
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         throw v3
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/IllegalAccessException;
    //         :try_start_5
    //         const-string v5, "NotificationCompat"
    //         const-string v6, "Unable to access notification extras"
    //         invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         .end local v0    # "e":Ljava/lang/IllegalAccessException;
    //         :goto_1
    //         const/4 v5, 0x1
    //         sput-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
    //         monitor-exit v4
    //         move-object v1, v3
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/NoSuchFieldException;
    //         const-string v5, "NotificationCompat"
    //         const-string v6, "Unable to access notification extras"
    //         invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         goto :goto_1
    */

    public @JvmStatic fun getGroup(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "android.support.groupKey"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getLocalOnly(notif: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "android.support.localOnly"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getParcelableArrayListForActions(actions: Array<android.support.v4.app.NotificationCompatBase.Action>): java.util.ArrayList { return TODO("body: ([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;") }
    /*
    //         .locals 6
    //         if-nez p0, :cond_1
    //         const/4 v4, 0x0
    //         :cond_0
    //         return-object v4
    //         :cond_1
    //         new-instance v4, Ljava/util/ArrayList;
    //         array-length v5, p0
    //         invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V
    //         .local v4, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    //         move-object v1, p0
    //         .local v1, "arr$":[Landroid/support/v4/app/NotificationCompatBase$Action;
    //         array-length v3, v1
    //         .local v3, "len$":I
    //         const/4 v2, 0x0
    //         .local v2, "i$":I
    //         :goto_0
    //         if-ge v2, v3, :cond_0
    //         aget-object v0, v1, v2
    //         .local v0, "action":Landroid/support/v4/app/NotificationCompatBase$Action;
    //         invoke-static {v0}, Landroid/support/v4/app/NotificationCompatJellybean;->getBundleForAction(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun getSortKey(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "android.support.sortKey"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isGroupSummary(n: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "android.support.isGroupSummary"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun readAction(factory: android.support.v4.app.NotificationCompatBase.Action.Factory, remoteInputFactory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory, icon: Int, title: CharSequence, actionIntent: android.app.PendingIntent, extras: android.os.Bundle): android.support.v4.app.NotificationCompatBase.Action { return TODO("body: (Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         .local v5, "remoteInputs":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         if-eqz p5, :cond_0
    //         const-string v0, "android.support.remoteInputs"
    //         invoke-static {p5, v0}, Landroid/support/v4/app/BundleUtil;->getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v0, p1}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v5
    //         :cond_0
    //         move-object v0, p0
    //         move v1, p2
    //         move-object v2, p3
    //         move-object v3, p4
    //         move-object v4, p5
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun writeActionAndGetExtras(builder: android.app.Notification.Builder, action: android.support.v4.app.NotificationCompatBase.Action): android.os.Bundle { return TODO("body: (Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I
    //         move-result v1
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;
    //         move-result-object v2
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;
    //         move-result-object v3
    //         invoke-virtual {p0, v1, v2, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         .local v0, "actionExtras":Landroid/os/Bundle;
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "android.support.remoteInputs"
    //         invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         :cond_0
    //         return-object v0
    */

    }
}
