package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatSideChannelService.java.
// 0 fields, 7 methods.

open class NotificationCompatSideChannelService: android.app.Service() {
    public constructor()

    private fun checkPermission(callingUid: Int, packageName: String) { /* TODO(body): (ILjava/lang/String;)V */ }
    /*
    //         .locals 7
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatSideChannelService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v2, v0
    //         .local v2, "len$":I
    //         const/4 v1, 0x0
    //         .local v1, "i$":I
    //         :goto_0
    //         if-ge v1, v2, :cond_1
    //         aget-object v3, v0, v1
    //         .local v3, "validPackage":Ljava/lang/String;
    //         invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         return-void
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v3    # "validPackage":Ljava/lang/String;
    //         :cond_1
    //         new-instance v4, Ljava/lang/SecurityException;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "NotificationSideChannelService: Uid "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v6, " is not authorized for package "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-direct {v4, v5}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
    //         throw v4
    */

    public fun cancel(p0: String, p1: Int, p2: String)

    public fun cancelAll(p0: String)

    public fun notify(p0: String, p1: Int, p2: String, p3: android.app.Notification)

    public fun onBind(intent: android.content.Intent): android.os.IBinder { return TODO("body: (Landroid/content/Intent;)Landroid/os/IBinder;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x13
    //         if-le v1, v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         new-instance v1, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;
    //         invoke-direct {v1, p0, v0}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;-><init>(Landroid/support/v4/app/NotificationCompatSideChannelService;Landroid/support/v4/app/NotificationCompatSideChannelService$1;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

}
