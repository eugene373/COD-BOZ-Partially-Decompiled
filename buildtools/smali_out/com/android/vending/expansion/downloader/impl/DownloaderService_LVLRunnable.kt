package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloaderService.java.
// 2 fields, 2 methods.

open class DownloaderService_LVLRunnable: Runnable {
    val mContext: android.content.Context
    val this$0: com.android.vending.expansion.downloader.impl.DownloaderService

    constructor(p0: com.android.vending.expansion.downloader.impl.DownloaderService, p1: android.content.Context, p2: android.app.PendingIntent)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         move-result-object v0
    //         const/4 v1, 0x2
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const-string v1, "android_id"
    //         invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/android/vending/licensing/APKExpansionPolicy;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         new-instance v3, Lcom/android/vending/licensing/AESObfuscator;
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getSALT()[B
    //         move-result-object v4
    //         iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-direct {v3, v4, v5, v0}, Lcom/android/vending/licensing/AESObfuscator;-><init>([BLjava/lang/String;Ljava/lang/String;)V
    //         invoke-direct {v1, v2, v3}, Lcom/android/vending/licensing/APKExpansionPolicy;-><init>(Landroid/content/Context;Lcom/android/vending/licensing/Obfuscator;)V
    //         invoke-virtual {v1}, Lcom/android/vending/licensing/APKExpansionPolicy;->resetPolicy()V
    //         new-instance v0, Lcom/android/vending/licensing/LicenseChecker;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPublicKey()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v0, v2, v1, v3}, Lcom/android/vending/licensing/LicenseChecker;-><init>(Landroid/content/Context;Lcom/android/vending/licensing/Policy;Ljava/lang/String;)V
    //         new-instance v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;
    //         invoke-direct {v2, p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;Lcom/android/vending/licensing/APKExpansionPolicy;)V
    //         invoke-virtual {v0, v2}, Lcom/android/vending/licensing/LicenseChecker;->checkAccess(Lcom/android/vending/licensing/LicenseCheckerCallback;)V
    //         return-void
    */

}
