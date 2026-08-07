package android.support.v4.app

// Auto-emitted from smali source: NotificationManagerCompatEclair.java.
// 0 fields, 3 methods.

open class NotificationManagerCompatEclair {
    constructor()

    companion object {
    @JvmStatic fun cancelNotification(notificationManager: android.app.NotificationManager, tag: String, id: Int) { /* TODO(body): (Landroid/app/NotificationManager;Ljava/lang/String;I)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V
    //         return-void
    */

    public @JvmStatic fun postNotification(notificationManager: android.app.NotificationManager, tag: String, id: Int, notification: android.app.Notification) { /* TODO(body): (Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
    //         return-void
    */

    }
}
