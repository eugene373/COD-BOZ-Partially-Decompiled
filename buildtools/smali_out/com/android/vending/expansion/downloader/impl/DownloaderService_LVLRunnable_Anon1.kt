package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloaderService.java.
// 2 fields, 4 methods.

open class DownloaderService_LVLRunnable_Anon1: com.android.vending.licensing.LicenseCheckerCallback {
    val this$1: com.android.vending.expansion.downloader.impl.DownloaderService.LVLRunnable
    val val$aep: com.android.vending.licensing.APKExpansionPolicy

    constructor(p0: com.android.vending.expansion.downloader.impl.DownloaderService.LVLRunnable, p1: com.android.vending.licensing.APKExpansionPolicy)

    public fun allow(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 12
    //         const/16 v11, 0xc8
    //         const/4 v7, 0x0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->val$aep:Lcom/android/vending/licensing/APKExpansionPolicy;
    //         invoke-virtual {v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->getExpansionURLCount()I
    //         move-result v8
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDB(Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         move-result-object v1
    //         if-eqz v8, :cond_2
    //         move v2, v7
    //         move v6, v7
    //         :goto_0
    //         if-ge v2, v8, :cond_3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->val$aep:Lcom/android/vending/licensing/APKExpansionPolicy;
    //         invoke-virtual {v0, v2}, Lcom/android/vending/licensing/APKExpansionPolicy;->getExpansionFileName(I)Ljava/lang/String;
    //         move-result-object v3
    //         if-eqz v3, :cond_4
    //         new-instance v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v9, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->val$aep:Lcom/android/vending/licensing/APKExpansionPolicy;
    //         invoke-virtual {v0, v2}, Lcom/android/vending/licensing/APKExpansionPolicy;->getExpansionFileSize(I)J
    //         move-result-wide v4
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual/range {v0 .. v5}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->handleFileUpdated(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;ILjava/lang/String;J)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         or-int/lit8 v0, v6, -0x1
    //         invoke-virtual {v9}, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->resetDownload()V
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->val$aep:Lcom/android/vending/licensing/APKExpansionPolicy;
    //         invoke-virtual {v3, v2}, Lcom/android/vending/licensing/APKExpansionPolicy;->getExpansionURL(I)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         iput-wide v4, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         iput v0, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         invoke-virtual {v1, v9}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         :goto_1
    //         add-int/lit8 v2, v2, 0x1
    //         move v6, v0
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadInfoByFileName(Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         const-string v0, "LVLDL"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v10, "file "
    //         invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v10, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v10, " found. Not downloading."
    //         invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const/16 v0, 0xc8
    //         iput v0, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         iput-wide v4, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         iput-wide v4, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->val$aep:Lcom/android/vending/licensing/APKExpansionPolicy;
    //         invoke-virtual {v0, v2}, Lcom/android/vending/licensing/APKExpansionPolicy;->getExpansionURL(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, v9, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         invoke-virtual {v1, v9}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         move v0, v6
    //         goto :goto_1
    //         :cond_1
    //         iget v3, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         if-eq v3, v11, :cond_4
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->val$aep:Lcom/android/vending/licensing/APKExpansionPolicy;
    //         invoke-virtual {v3, v2}, Lcom/android/vending/licensing/APKExpansionPolicy;->getExpansionURL(I)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         or-int/lit8 v0, v6, -0x1
    //         goto :goto_1
    //         :cond_2
    //         move v6, v7
    //         :cond_3
    //         :try_start_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    //         invoke-virtual {v1, v0, v6}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateMetadata(II)Z
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v1, v1, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$000(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Landroid/app/PendingIntent;
    //         move-result-object v2
    //         invoke-static {v1, v2, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I
    //         :try_end_1
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         :goto_2
    //         invoke-static {v7}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         return-void
    //         :pswitch_0
    //         :try_start_2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         move-result-object v0
    //         const/4 v1, 0x5
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         :try_end_2
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_2
    //         :catch_0
    //         move-exception v0
    //         :try_start_3
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         const-string v1, "Error with getting information from package name"
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-static {v7}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         throw v0
    //         :pswitch_1
    //         :try_start_4
    //         const-string v0, "LVLDL"
    //         const-string v1, "In LVL checking loop!"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         move-result-object v0
    //         const/16 v1, 0xf
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         const-string v1, "Error with LVL checking and database integrity"
    //         invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_4
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         :cond_4
    //         move v0, v6
    //         goto/16 :goto_1
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun applicationError(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         move-result-object v0
    //         const/16 v1, 0x10
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         throw v0
    */

    public fun dontAllow(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         sparse-switch p1, :sswitch_data_0
    //         :goto_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         return-void
    //         :sswitch_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         move-result-object v0
    //         const/16 v1, 0xf
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V
    //         throw v0
    //         :sswitch_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;->this$1:Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         move-result-object v0
    //         const/16 v1, 0x10
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x123 -> :sswitch_1
    //             0x231 -> :sswitch_0
    //         .end sparse-switch
    */

}
