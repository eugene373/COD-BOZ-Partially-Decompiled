package android.support.v4.app

// Auto-emitted from smali source: NotificationCompatSideChannelService.java.
// 1 fields, 5 methods.

open class NotificationCompatSideChannelService_NotificationSideChannelStub: android.support.v4.app.INotificationSideChannel.Stub() {
    val this$0: android.support.v4.app.NotificationCompatSideChannelService

    private constructor(p0: android.support.v4.app.NotificationCompatSideChannelService)

    constructor(x0: android.support.v4.app.NotificationCompatSideChannelService, x1: android.support.v4.app.NotificationCompatSideChannelService.1)

    public fun cancel(packageName: String, id: Int, tag: String) { /* TODO(body): (Ljava/lang/String;ILjava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->this$0:Landroid/support/v4/app/NotificationCompatSideChannelService;
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->getCallingUid()I
    //         move-result v3
    //         invoke-static {v2, v3, p1}, Landroid/support/v4/app/NotificationCompatSideChannelService;->access$100(Landroid/support/v4/app/NotificationCompatSideChannelService;ILjava/lang/String;)V
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->clearCallingIdentity()J
    //         move-result-wide v0
    //         .local v0, "idToken":J
    //         :try_start_0
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->this$0:Landroid/support/v4/app/NotificationCompatSideChannelService;
    //         invoke-virtual {v2, p1, p2, p3}, Landroid/support/v4/app/NotificationCompatSideChannelService;->cancel(Ljava/lang/String;ILjava/lang/String;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {v0, v1}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->restoreCallingIdentity(J)V
    //         return-void
    //         :catchall_0
    //         move-exception v2
    //         invoke-static {v0, v1}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->restoreCallingIdentity(J)V
    //         throw v2
    */

    public fun cancelAll(packageName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->this$0:Landroid/support/v4/app/NotificationCompatSideChannelService;
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->getCallingUid()I
    //         move-result v3
    //         invoke-static {v2, v3, p1}, Landroid/support/v4/app/NotificationCompatSideChannelService;->access$100(Landroid/support/v4/app/NotificationCompatSideChannelService;ILjava/lang/String;)V
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->clearCallingIdentity()J
    //         move-result-wide v0
    //         .local v0, "idToken":J
    //         :try_start_0
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->this$0:Landroid/support/v4/app/NotificationCompatSideChannelService;
    //         invoke-virtual {v2, p1}, Landroid/support/v4/app/NotificationCompatSideChannelService;->cancelAll(Ljava/lang/String;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {v0, v1}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->restoreCallingIdentity(J)V
    //         return-void
    //         :catchall_0
    //         move-exception v2
    //         invoke-static {v0, v1}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->restoreCallingIdentity(J)V
    //         throw v2
    */

    public fun notify(packageName: String, id: Int, tag: String, notification: android.app.Notification) { /* TODO(body): (Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->this$0:Landroid/support/v4/app/NotificationCompatSideChannelService;
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->getCallingUid()I
    //         move-result v3
    //         invoke-static {v2, v3, p1}, Landroid/support/v4/app/NotificationCompatSideChannelService;->access$100(Landroid/support/v4/app/NotificationCompatSideChannelService;ILjava/lang/String;)V
    //         invoke-static {}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->clearCallingIdentity()J
    //         move-result-wide v0
    //         .local v0, "idToken":J
    //         :try_start_0
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->this$0:Landroid/support/v4/app/NotificationCompatSideChannelService;
    //         invoke-virtual {v2, p1, p2, p3, p4}, Landroid/support/v4/app/NotificationCompatSideChannelService;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {v0, v1}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->restoreCallingIdentity(J)V
    //         return-void
    //         :catchall_0
    //         move-exception v2
    //         invoke-static {v0, v1}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;->restoreCallingIdentity(J)V
    //         throw v2
    */

}
