package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatKitKat.java.
// 0 fields, 8 methods.

open class NotificationCompatKitKat {
    constructor()

    companion object {
    public @JvmStatic fun getAction(notif: android.app.Notification, actionIndex: Int, factory: android.support.v4.app.NotificationCompatBase.Action.Factory, remoteInputFactory: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): android.support.v4.app.NotificationCompatBase.Action { return TODO("body: (Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;") }
    /*
    //         .locals 8
    //         iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
    //         aget-object v6, v0, p1
    //         .local v6, "action":Landroid/app/Notification$Action;
    //         const/4 v5, 0x0
    //         .local v5, "actionExtras":Landroid/os/Bundle;
    //         iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    //         const-string v1, "android.support.actionExtras"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
    //         move-result-object v7
    //         .local v7, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    //         if-eqz v7, :cond_0
    //         invoke-virtual {v7, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
    //         move-result-object v5
    //         .end local v5    # "actionExtras":Landroid/os/Bundle;
    //         check-cast v5, Landroid/os/Bundle;
    //         .restart local v5    # "actionExtras":Landroid/os/Bundle;
    //         :cond_0
    //         iget v2, v6, Landroid/app/Notification$Action;->icon:I
    //         iget-object v3, v6, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;
    //         iget-object v4, v6, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;
    //         move-object v0, p2
    //         move-object v1, p3
    //         invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatJellybean;->readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getActionCount(notif: android.app.Notification): Int { return TODO("body: (Landroid/app/Notification;)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
    //         array-length v0, v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun getExtras(notif: android.app.Notification): android.os.Bundle { return TODO("body: (Landroid/app/Notification;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    //         return-object v0
    */

    public @JvmStatic fun getGroup(notif: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    //         const-string v1, "android.support.groupKey"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getLocalOnly(notif: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    //         const-string v1, "android.support.localOnly"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getSortKey(notif: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    //         const-string v1, "android.support.sortKey"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isGroupSummary(notif: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
    //         const-string v1, "android.support.isGroupSummary"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    }
}
