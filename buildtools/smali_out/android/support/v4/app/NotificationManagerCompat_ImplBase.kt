package android.support.v4.app

// Auto-emitted from smali source: NotificationManagerCompat.java.
// 0 fields, 4 methods.

open class NotificationManagerCompat_ImplBase: android.support.v4.app.NotificationManagerCompat.Impl {
    constructor()

    public fun cancelNotification(notificationManager: android.app.NotificationManager, tag: String, id: Int) { /* TODO(body): (Landroid/app/NotificationManager;Ljava/lang/String;I)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1, p3}, Landroid/app/NotificationManager;->cancel(I)V
    //         return-void
    */

    public fun getSideChannelBindFlags(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun postNotification(notificationManager: android.app.NotificationManager, tag: String, id: Int, notification: android.app.Notification) { /* TODO(body): (Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1, p3, p4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    //         return-void
    */

}
