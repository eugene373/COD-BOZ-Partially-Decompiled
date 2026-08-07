package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatKitKat.java.
// 3 fields, 4 methods.

open class NotificationCompatKitKat_Builder: android.support.v4.app.NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationBuilderWithActions {
    private var b: android.app.Notification.Builder
    private var mActionExtrasList: java.util.List
    private var mExtras: android.os.Bundle

    public constructor(context: android.content.Context, n: android.app.Notification, contentTitle: CharSequence, contentText: CharSequence, contentInfo: CharSequence, tickerView: android.widget.RemoteViews, number: Int, contentIntent: android.app.PendingIntent, fullScreenIntent: android.app.PendingIntent, largeIcon: android.graphics.Bitmap, progressMax: Int, progress: Int, progressIndeterminate: Boolean, showWhen: Boolean, useChronometer: Boolean, priority: Int, subText: CharSequence, localOnly: Boolean, extras: java.util.ArrayList, groupKey: android.os.Bundle, groupSummary: String, sortKey: Boolean, p22: String)

    public fun addAction(action: android.support.v4.app.NotificationCompatBase.Action) { /* TODO(body): (Landroid/support/v4/app/NotificationCompatBase$Action;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->mActionExtrasList:Ljava/util/List;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->b:Landroid/app/Notification$Builder;
    //         invoke-static {v1, p1}, Landroid/support/v4/app/NotificationCompatJellybean;->writeActionAndGetExtras(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun build(): android.app.Notification { return TODO("body: ()Landroid/app/Notification;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->mActionExtrasList:Ljava/util/List;
    //         invoke-static {v1}, Landroid/support/v4/app/NotificationCompatJellybean;->buildActionExtrasMap(Ljava/util/List;)Landroid/util/SparseArray;
    //         move-result-object v0
    //         .local v0, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->mExtras:Landroid/os/Bundle;
    //         const-string v2, "android.support.actionExtras"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->b:Landroid/app/Notification$Builder;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->b:Landroid/app/Notification$Builder;
    //         invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
    //         move-result-object v1
    //         return-object v1
    */

    public fun getBuilder(): android.app.Notification.Builder { return TODO("body: ()Landroid/app/Notification$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->b:Landroid/app/Notification$Builder;
    //         return-object v0
    */

}
