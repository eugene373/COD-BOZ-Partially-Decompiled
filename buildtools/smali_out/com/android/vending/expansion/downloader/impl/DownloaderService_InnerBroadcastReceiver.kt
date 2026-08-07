package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloaderService.java.
// 2 fields, 2 methods.

open class DownloaderService_InnerBroadcastReceiver: android.content.BroadcastReceiver() {
    val mService: android.app.Service
    val this$0: com.android.vending.expansion.downloader.impl.DownloaderService

    constructor(p0: com.android.vending.expansion.downloader.impl.DownloaderService, p1: android.app.Service)

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->pollNetworkState()V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$300(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$400()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "LVLDL"
    //         const-string v1, "InnerBroadcastReceiver Called"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->mService:Landroid/app/Service;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         const-string v1, "EPI"
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$000(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Landroid/app/PendingIntent;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         :cond_0
    //         return-void
    */

}
