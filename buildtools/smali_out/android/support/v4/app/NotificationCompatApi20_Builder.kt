package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatApi20.java.
// 2 fields, 4 methods.

open class NotificationCompatApi20_Builder: android.support.v4.app.NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationBuilderWithActions {
    private var b: android.app.Notification.Builder
    private var mExtras: android.os.Bundle

    public constructor(context: android.content.Context, n: android.app.Notification, contentTitle: CharSequence, contentText: CharSequence, contentInfo: CharSequence, tickerView: android.widget.RemoteViews, number: Int, contentIntent: android.app.PendingIntent, fullScreenIntent: android.app.PendingIntent, largeIcon: android.graphics.Bitmap, progressMax: Int, progress: Int, progressIndeterminate: Boolean, showWhen: Boolean, useChronometer: Boolean, priority: Int, subText: CharSequence, localOnly: Boolean, extras: java.util.ArrayList, groupKey: android.os.Bundle, groupSummary: String, sortKey: Boolean, p22: String)

    public fun addAction(action: android.support.v4.app.NotificationCompatBase.Action) { /* TODO(body): (Landroid/support/v4/app/NotificationCompatBase$Action;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;
    //         invoke-static {v0, p1}, Landroid/support/v4/app/NotificationCompatApi20;->addAction(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)V
    //         return-void
    */

    public fun build(): android.app.Notification { return TODO("body: ()Landroid/app/Notification;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->mExtras:Landroid/os/Bundle;
    //         invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;
    //         invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getBuilder(): android.app.Notification.Builder { return TODO("body: ()Landroid/app/Notification$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;
    //         return-object v0
    */

}
