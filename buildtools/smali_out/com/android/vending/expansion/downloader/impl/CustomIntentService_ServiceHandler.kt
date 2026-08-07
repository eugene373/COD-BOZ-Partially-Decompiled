package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: CustomIntentService.java.
// 1 fields, 2 methods.

class CustomIntentService_ServiceHandler: android.os.Handler() {
    val this$0: com.android.vending.expansion.downloader.impl.CustomIntentService

    public constructor(p0: com.android.vending.expansion.downloader.impl.CustomIntentService, p1: android.os.Looper)

    public fun handleMessage(p0: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;->this$0:Lcom/android/vending/expansion/downloader/impl/CustomIntentService;
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Landroid/content/Intent;
    //         invoke-virtual {v1, v0}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->onHandleIntent(Landroid/content/Intent;)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;->this$0:Lcom/android/vending/expansion/downloader/impl/CustomIntentService;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->shouldStop()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "CancellableIntentService"
    //         const-string v1, "stopSelf"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/CustomIntentService$ServiceHandler;->this$0:Lcom/android/vending/expansion/downloader/impl/CustomIntentService;
    //         iget v1, p1, Landroid/os/Message;->arg1:I
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->stopSelf(I)V
    //         const-string v0, "CancellableIntentService"
    //         const-string v1, "afterStopSelf"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

}
