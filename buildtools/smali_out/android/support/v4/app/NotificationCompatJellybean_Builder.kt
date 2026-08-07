package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatJellybean.java.
// 3 fields, 4 methods.

open class NotificationCompatJellybean_Builder: android.support.v4.app.NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationBuilderWithActions {
    private var b: android.app.Notification.Builder
    private var mActionExtrasList: java.util.List
    private val mExtras: android.os.Bundle

    public constructor(context: android.content.Context, n: android.app.Notification, contentTitle: CharSequence, contentText: CharSequence, contentInfo: CharSequence, tickerView: android.widget.RemoteViews, number: Int, contentIntent: android.app.PendingIntent, fullScreenIntent: android.app.PendingIntent, largeIcon: android.graphics.Bitmap, progressMax: Int, progress: Int, progressIndeterminate: Boolean, useChronometer: Boolean, priority: Int, subText: CharSequence, localOnly: Boolean, extras: android.os.Bundle, groupKey: String, groupSummary: Boolean, sortKey: String)

    public fun addAction(action: android.support.v4.app.NotificationCompatBase.Action) { /* TODO(body): (Landroid/support/v4/app/NotificationCompatBase$Action;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
    //         invoke-static {v1, p1}, Landroid/support/v4/app/NotificationCompatJellybean;->writeActionAndGetExtras(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun build(): android.app.Notification { return TODO("body: ()Landroid/app/Notification;") }
    /*
    //         .locals 8
    //         iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
    //         invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
    //         move-result-object v5
    //         .local v5, "notif":Landroid/app/Notification;
    //         invoke-static {v5}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v1
    //         .local v1, "extras":Landroid/os/Bundle;
    //         new-instance v4, Landroid/os/Bundle;
    //         iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-direct {v4, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         .local v4, "mergeBundle":Landroid/os/Bundle;
    //         iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-virtual {v6}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v6
    //         invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         .local v2, "i$":Ljava/util/Iterator;
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v6
    //         if-eqz v6, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/String;
    //         .local v3, "key":Ljava/lang/String;
    //         invoke-virtual {v1, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v6
    //         if-eqz v6, :cond_0
    //         invoke-virtual {v4, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         goto :goto_0
    //         .end local v3    # "key":Ljava/lang/String;
    //         :cond_1
    //         invoke-virtual {v1, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;
    //         invoke-static {v6}, Landroid/support/v4/app/NotificationCompatJellybean;->buildActionExtrasMap(Ljava/util/List;)Landroid/util/SparseArray;
    //         move-result-object v0
    //         .local v0, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         if-eqz v0, :cond_2
    //         invoke-static {v5}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v6
    //         const-string v7, "android.support.actionExtras"
    //         invoke-virtual {v6, v7, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
    //         :cond_2
    //         return-object v5
    */

    public fun getBuilder(): android.app.Notification.Builder { return TODO("body: ()Landroid/app/Notification$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
    //         return-object v0
    */

}
