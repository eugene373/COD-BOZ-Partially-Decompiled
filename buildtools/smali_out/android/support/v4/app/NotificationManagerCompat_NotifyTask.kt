package android.support.v4.app

// Auto-emitted from smali source: NotificationManagerCompat.java.
// 4 fields, 3 methods.

open class NotificationManagerCompat_NotifyTask: android.support.v4.app.NotificationManagerCompat.Task {
    val id: Int
    val notif: android.app.Notification
    val packageName: String
    val tag: String

    public constructor(packageName: String, id: Int, tag: String, notif: android.app.Notification)

    public fun send(service: android.support.v4.app.INotificationSideChannel) { /* TODO(body): (Landroid/support/v4/app/INotificationSideChannel;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;
    //         iget v1, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->notif:Landroid/app/Notification;
    //         invoke-interface {p1, v0, v1, v2, v3}, Landroid/support/v4/app/INotificationSideChannel;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const-string v1, "NotifyTask["
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         .local v0, "sb":Ljava/lang/StringBuilder;
    //         const-string v1, "packageName:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, ", id:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         const-string v1, ", tag:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

}
