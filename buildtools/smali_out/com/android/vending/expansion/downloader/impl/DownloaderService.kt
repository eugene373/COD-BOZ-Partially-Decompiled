package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloaderService.java.
// 80 fields, 46 methods.

open class DownloaderService: com.android.vending.expansion.downloader.impl.CustomIntentService(), com.android.vending.expansion.downloader.IDownloaderService {
    private var mAlarmIntent: android.app.PendingIntent
    var mAverageDownloadSpeed: Float
    var mBytesAtSample: Long
    var mBytesSoFar: Long
    private var mClientMessenger: android.os.Messenger
    private var mConnReceiver: android.content.BroadcastReceiver
    private var mConnectivityManager: android.net.ConnectivityManager
    private var mControl: Int
    var mFileCount: Int
    private var mIsAtLeast3G: Boolean
    private var mIsAtLeast4G: Boolean
    private var mIsCellularConnection: Boolean
    private var mIsConnected: Boolean
    private var mIsFailover: Boolean
    private var mIsRoaming: Boolean
    var mMillisecondsAtSample: Long
    private var mNotification: com.android.vending.expansion.downloader.impl.DownloadNotification
    private var mPackageInfo: android.content.pm.PackageInfo
    private var mPendingIntent: android.app.PendingIntent
    private val mServiceMessenger: android.os.Messenger
    private val mServiceStub: com.android.vending.expansion.downloader.IStub
    private var mStateChanged: Boolean
    private var mStatus: Int
    var mTotalLength: Long
    private var mWifiManager: android.net.wifi.WifiManager

    public constructor()

    private fun cancelAlarms() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAlarmIntent:Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_0
    //         const-string v0, "alarm"
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/AlarmManager;
    //         if-nez v0, :cond_1
    //         const-string v0, "LVLDL"
    //         const-string v1, "couldn\'t get alarm manager"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAlarmIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAlarmIntent:Landroid/app/PendingIntent;
    //         goto :goto_0
    */

    private fun scheduleAlarm(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 7
    //         const/4 v5, 0x0
    //         const-string v0, "alarm"
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/AlarmManager;
    //         if-nez v0, :cond_0
    //         const-string v0, "LVLDL"
    //         const-string v1, "couldn\'t get alarm manager"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getAlarmReceiverClassName()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Landroid/content/Intent;
    //         const-string v3, "android.intent.action.DOWNLOAD_WAKEUP"
    //         invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v3, "EPI"
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const/high16 v1, 0x40000000    # 2.0f
    //         invoke-static {p0, v5, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAlarmIntent:Landroid/app/PendingIntent;
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         add-long/2addr v2, p1
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAlarmIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v5, v2, v3, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    //         goto :goto_0
    */

    private fun updateNetworkState(p0: android.net.NetworkInfo) { /* TODO(body): (Landroid/net/NetworkInfo;)V */ }
    /*
    //         .locals 8
    //         const/4 v6, -0x1
    //         const/4 v0, 0x0
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsConnected:Z
    //         iget-boolean v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsFailover:Z
    //         iget-boolean v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         iget-boolean v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsRoaming:Z
    //         iget-boolean v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         if-eqz p1, :cond_2
    //         invoke-virtual {p1}, Landroid/net/NetworkInfo;->isRoaming()Z
    //         move-result v6
    //         iput-boolean v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsRoaming:Z
    //         invoke-virtual {p1}, Landroid/net/NetworkInfo;->isFailover()Z
    //         move-result v6
    //         iput-boolean v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsFailover:Z
    //         invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z
    //         move-result v6
    //         iput-boolean v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsConnected:Z
    //         invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v6
    //         invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtype()I
    //         move-result v7
    //         invoke-direct {p0, v6, v7}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->updateNetworkType(II)V
    //         :goto_0
    //         iget-boolean v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mStateChanged:Z
    //         if-nez v6, :cond_0
    //         iget-boolean v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsConnected:Z
    //         if-ne v1, v6, :cond_0
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsFailover:Z
    //         if-ne v2, v1, :cond_0
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         if-ne v3, v1, :cond_0
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsRoaming:Z
    //         if-ne v4, v1, :cond_0
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         if-eq v5, v1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :cond_1
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mStateChanged:Z
    //         return-void
    //         :cond_2
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsRoaming:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsFailover:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsConnected:Z
    //         invoke-direct {p0, v6, v6}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->updateNetworkType(II)V
    //         goto :goto_0
    */

    private fun updateNetworkType(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         packed-switch p1, :pswitch_data_0
    //         :goto_0
    //         :pswitch_0
    //         return-void
    //         :pswitch_1
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast4G:Z
    //         goto :goto_0
    //         :pswitch_2
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast4G:Z
    //         goto :goto_0
    //         :pswitch_3
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         packed-switch p2, :pswitch_data_1
    //         :pswitch_4
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast4G:Z
    //         goto :goto_0
    //         :pswitch_5
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast4G:Z
    //         goto :goto_0
    //         :pswitch_6
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast4G:Z
    //         goto :goto_0
    //         :pswitch_7
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast3G:Z
    //         iput-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsAtLeast4G:Z
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_3
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    //         :pswitch_data_1
    //         .packed-switch 0x1
    //             :pswitch_5
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_6
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_6
    //             :pswitch_6
    //             :pswitch_5
    //             :pswitch_4
    //             :pswitch_7
    //             :pswitch_7
    //             :pswitch_7
    //         .end packed-switch
    */

    public fun generateSaveFile(p0: String, p1: Long): String { return TODO("body: (Ljava/lang/String;J)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->generateTempSaveFileName(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/io/File;
    //         invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/android/vending/expansion/downloader/Helpers;->isExternalMediaMounted()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         const-string v1, "LVLDL"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "External media not mounted: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;
    //         const/16 v1, 0x1f3
    //         const-string v2, "external media is not yet mounted"
    //         invoke-direct {v0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;-><init>(ILjava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {v1}, Ljava/io/File;->exists()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const-string v1, "LVLDL"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "File already exists: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;
    //         const/16 v1, 0x1e8
    //         const-string v2, "requested destination file already exists"
    //         invoke-direct {v0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;-><init>(ILjava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/Helpers;->getFilesystemRoot(Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getAvailableBytes(Ljava/io/File;)J
    //         move-result-wide v2
    //         cmp-long v1, v2, p2
    //         if-gez v1, :cond_2
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;
    //         const/16 v1, 0x1f2
    //         const-string v2, "insufficient space on external storage"
    //         invoke-direct {v0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;-><init>(ILjava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         return-object v0
    */

    public fun generateTempSaveFileName(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-static {p0}, Lcom/android/vending/expansion/downloader/Helpers;->getSaveFilePath(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ".tmp"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAlarmReceiverClassName(): String

    public fun getControl(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mControl:I
    //         return v0
    */

    public fun getLogMessageForNetworkError(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         const-string v0, "unknown error with network connectivity"
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         const-string v0, "download size exceeds recommended limit for mobile network"
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v0, "download size exceeds limit for mobile network"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "no network connection available"
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "download cannot use the current network connection because it is roaming"
    //         goto :goto_0
    //         :pswitch_4
    //         const-string v0, "download was requested to not use the current network type"
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x2
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_4
    //         .end packed-switch
    */

    public fun getNetworkAvailabilityState(p0: com.android.vending.expansion.downloader.impl.DownloadsDB): Int { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsConnected:Z
    //         if-eqz v1, :cond_3
    //         iget-boolean v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mFlags:I
    //         iget-boolean v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsRoaming:Z
    //         if-eqz v2, :cond_2
    //         const/4 v0, 0x5
    //         goto :goto_0
    //         :cond_2
    //         and-int/lit8 v1, v1, 0x1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x6
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, 0x2
    //         goto :goto_0
    */

    public fun getPublicKey(): String

    public fun getSALT(): ByteArray

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mStatus:I
    //         return v0
    */

    public fun handleFileUpdated(p0: com.android.vending.expansion.downloader.impl.DownloadsDB, p1: Int, p2: String, p3: Long): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadsDB;ILjava/lang/String;J)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadInfoByFileName(Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         if-eqz v2, :cond_1
    //         invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         invoke-static {p0, v2}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v3, Ljava/io/File;
    //         invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v3}, Ljava/io/File;->exists()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v3}, Ljava/io/File;->delete()Z
    //         :cond_1
    //         invoke-static {p0, p3, p4, p5, v0}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z
    //         move-result v2
    //         if-nez v2, :cond_2
    //         :goto_1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_1
    */

    public fun isWiFi(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsConnected:Z
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mIsCellularConnection:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun notifyUpdateBytes(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 9
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         const-wide/16 v2, 0x0
    //         iget-wide v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mMillisecondsAtSample:J
    //         cmp-long v2, v2, v4
    //         if-eqz v2, :cond_1
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mMillisecondsAtSample:J
    //         sub-long v2, v0, v2
    //         iget-wide v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesAtSample:J
    //         sub-long v4, p1, v4
    //         long-to-float v4, v4
    //         long-to-float v2, v2
    //         div-float v2, v4, v2
    //         const/4 v3, 0x0
    //         iget v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAverageDownloadSpeed:F
    //         cmpl-float v3, v3, v4
    //         if-eqz v3, :cond_0
    //         const v3, 0x3ba3d70a    # 0.005f
    //         mul-float/2addr v2, v3
    //         const v3, 0x3f7eb852    # 0.995f
    //         iget v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAverageDownloadSpeed:F
    //         mul-float/2addr v3, v4
    //         add-float/2addr v2, v3
    //         iput v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAverageDownloadSpeed:F
    //         :goto_0
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mTotalLength:J
    //         sub-long/2addr v2, p1
    //         long-to-float v2, v2
    //         iget v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAverageDownloadSpeed:F
    //         div-float/2addr v2, v3
    //         float-to-long v6, v2
    //         :goto_1
    //         iput-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mMillisecondsAtSample:J
    //         iput-wide p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesAtSample:J
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         new-instance v1, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mTotalLength:J
    //         iget v8, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAverageDownloadSpeed:F
    //         move-wide v4, p1
    //         invoke-direct/range {v1 .. v8}, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;-><init>(JJJF)V
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    //         return-void
    //         :cond_0
    //         iput v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mAverageDownloadSpeed:F
    //         goto :goto_0
    //         :cond_1
    //         const-wide/16 v6, -0x1
    //         goto :goto_1
    */

    public fun onBind(p0: android.content.Intent): android.os.IBinder { return TODO("body: (Landroid/content/Intent;)Landroid/os/IBinder;") }
    /*
    //         .locals 2
    //         const-string v0, "LVLDL"
    //         const-string v1, "Service Bound"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mServiceMessenger:Landroid/os/Messenger;
    //         invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onClientUpdated(p0: android.os.Messenger) { /* TODO(body): (Landroid/os/Messenger;)V */ }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mClientMessenger:Landroid/os/Messenger;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mClientMessenger:Landroid/os/Messenger;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->setMessenger(Landroid/os/Messenger;)V
    //         return-void
    */

    public fun onCreate() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-super {p0}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->onCreate()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPackageInfo:Landroid/content/pm/PackageInfo;
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         invoke-direct {v1, p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V
    //         iput-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
    //         goto :goto_0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnReceiver:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnReceiver:Landroid/content/BroadcastReceiver;
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mServiceStub:Lcom/android/vending/expansion/downloader/IStub;
    //         invoke-interface {v0, p0}, Lcom/android/vending/expansion/downloader/IStub;->disconnect(Landroid/content/Context;)V
    //         invoke-super {p0}, Lcom/android/vending/expansion/downloader/impl/CustomIntentService;->onDestroy()V
    //         return-void
    */

    protected fun onHandleIntent(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 13
    //         const/16 v12, 0xc8
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         :try_start_0
    //         invoke-static {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDB(Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         move-result-object v3
    //         const-string v0, "EPI"
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_0
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         invoke-virtual {v4, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->setClientIntent(Landroid/app/PendingIntent;)V
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPendingIntent:Landroid/app/PendingIntent;
    //         :goto_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPackageInfo:Landroid/content/pm/PackageInfo;
    //         invoke-static {v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isLVLCheckRequired(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;Landroid/content/pm/PackageInfo;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p0, p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->updateLVL(Landroid/content/Context;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPendingIntent:Landroid/app/PendingIntent;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v4}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->setClientIntent(Landroid/app/PendingIntent;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         throw v0
    //         :cond_1
    //         :try_start_2
    //         const-string v0, "LVLDL"
    //         const-string v1, "Downloader started in bad state without notification intent."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         goto :goto_1
    //         :cond_2
    //         :try_start_3
    //         invoke-virtual {v3}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloads()[Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         move-result-object v4
    //         const-wide/16 v6, 0x0
    //         iput-wide v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J
    //         const-wide/16 v6, 0x0
    //         iput-wide v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mTotalLength:J
    //         array-length v0, v4
    //         iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mFileCount:I
    //         array-length v5, v4
    //         move v0, v2
    //         :goto_2
    //         if-ge v0, v5, :cond_4
    //         aget-object v6, v4, v0
    //         iget v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         if-ne v7, v12, :cond_3
    //         iget-object v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         iget-wide v8, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         const/4 v10, 0x1
    //         invoke-static {p0, v7, v8, v9, v10}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z
    //         move-result v7
    //         if-nez v7, :cond_3
    //         const/4 v7, 0x0
    //         iput v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         const-wide/16 v8, 0x0
    //         iput-wide v8, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         :cond_3
    //         iget-wide v8, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mTotalLength:J
    //         iget-wide v10, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         add-long/2addr v8, v10
    //         iput-wide v8, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mTotalLength:J
    //         iget-wide v8, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J
    //         iget-wide v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         add-long/2addr v6, v8
    //         iput-wide v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_4
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->pollNetworkState()V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnReceiver:Landroid/content/BroadcastReceiver;
    //         if-nez v0, :cond_5
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;
    //         invoke-direct {v0, p0, p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloaderService;Landroid/app/Service;)V
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnReceiver:Landroid/content/BroadcastReceiver;
    //         new-instance v0, Landroid/content/IntentFilter;
    //         const-string v5, "android.net.conn.CONNECTIVITY_CHANGE"
    //         invoke-direct {v0, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
    //         const-string v5, "android.net.wifi.WIFI_STATE_CHANGED"
    //         invoke-virtual {v0, v5}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {p0, v5, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         :cond_5
    //         array-length v5, v4
    //         move v0, v2
    //         :goto_3
    //         if-ge v0, v5, :cond_9
    //         aget-object v6, v4, v0
    //         iget-wide v8, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         iget v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         if-eq v7, v12, :cond_6
    //         new-instance v7, Lcom/android/vending/expansion/downloader/impl/DownloadThread;
    //         iget-object v10, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         invoke-direct {v7, v6, p0, v10}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Lcom/android/vending/expansion/downloader/impl/DownloaderService;Lcom/android/vending/expansion/downloader/impl/DownloadNotification;)V
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->cancelAlarms()V
    //         const-wide/16 v10, 0x1388
    //         invoke-direct {p0, v10, v11}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->scheduleAlarm(J)V
    //         invoke-virtual {v7}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->run()V
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->cancelAlarms()V
    //         :cond_6
    //         invoke-virtual {v3, v6}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateFromDb(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         iget v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         sparse-switch v7, :sswitch_data_0
    //         const/16 v0, 0x13
    //         move v1, v2
    //         :goto_4
    //         if-eqz v1, :cond_8
    //         const-wide/32 v4, 0xea60
    //         invoke-direct {p0, v4, v5}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->scheduleAlarm(J)V
    //         :goto_5
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         invoke-virtual {v1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         goto/16 :goto_1
    //         :sswitch_0
    //         :try_start_4
    //         invoke-virtual {p0, p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->updateLVL(Landroid/content/Context;)V
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         goto/16 :goto_1
    //         :sswitch_1
    //         :try_start_5
    //         iget-wide v10, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J
    //         iget-wide v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         sub-long/2addr v6, v8
    //         add-long/2addr v6, v10
    //         iput-wide v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J
    //         iget-object v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPackageInfo:Landroid/content/pm/PackageInfo;
    //         iget v6, v6, Landroid/content/pm/PackageInfo;->versionCode:I
    //         const/4 v7, 0x0
    //         invoke-virtual {v3, v6, v7}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateMetadata(II)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_3
    //         :sswitch_2
    //         const/16 v0, 0xd
    //         const-wide/16 v4, 0x0
    //         iput-wide v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         invoke-virtual {v3, v6}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         goto :goto_4
    //         :sswitch_3
    //         const/4 v0, 0x7
    //         move v1, v2
    //         goto :goto_4
    //         :sswitch_4
    //         const/4 v0, 0x6
    //         goto :goto_4
    //         :sswitch_5
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mWifiManager:Landroid/net/wifi/WifiManager;
    //         if-eqz v0, :cond_7
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mWifiManager:Landroid/net/wifi/WifiManager;
    //         invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         const/16 v0, 0x8
    //         goto :goto_4
    //         :cond_7
    //         const/16 v0, 0x9
    //         goto :goto_4
    //         :sswitch_6
    //         const/16 v0, 0x12
    //         goto :goto_4
    //         :sswitch_7
    //         const/16 v0, 0x11
    //         goto :goto_4
    //         :sswitch_8
    //         const/16 v0, 0xe
    //         goto :goto_4
    //         :cond_8
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->cancelAlarms()V
    //         goto :goto_5
    //         :cond_9
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         const/4 v1, 0x5
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->setServiceRunning(Z)V
    //         goto/16 :goto_1
    //         :sswitch_data_0
    //         .sparse-switch
    //             0xc1 -> :sswitch_3
    //             0xc2 -> :sswitch_4
    //             0xc3 -> :sswitch_4
    //             0xc4 -> :sswitch_5
    //             0xc5 -> :sswitch_5
    //             0xc8 -> :sswitch_1
    //             0x193 -> :sswitch_0
    //             0x1e7 -> :sswitch_2
    //             0x1ea -> :sswitch_6
    //             0x1f2 -> :sswitch_7
    //             0x1f3 -> :sswitch_8
    //         .end sparse-switch
    */

    fun pollNetworkState() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnectivityManager:Landroid/net/ConnectivityManager;
    //         if-nez v0, :cond_0
    //         const-string v0, "connectivity"
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnectivityManager:Landroid/net/ConnectivityManager;
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mWifiManager:Landroid/net/wifi/WifiManager;
    //         if-nez v0, :cond_1
    //         const-string v0, "wifi"
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/wifi/WifiManager;
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mWifiManager:Landroid/net/wifi/WifiManager;
    //         :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnectivityManager:Landroid/net/ConnectivityManager;
    //         if-nez v0, :cond_2
    //         const-string v0, "LVLDL"
    //         const-string v1, "couldn\'t get connectivity manager to poll network state"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mConnectivityManager:Landroid/net/ConnectivityManager;
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->updateNetworkState(Landroid/net/NetworkInfo;)V
    //         goto :goto_0
    */

    public fun requestAbortDownload() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mControl:I
    //         const/16 v0, 0x1ea
    //         iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mStatus:I
    //         return-void
    */

    public fun requestContinueDownload() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mControl:I
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mControl:I
    //         :cond_0
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         const-string v1, "EPI"
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         return-void
    */

    public fun requestDownloadStatus() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->resendState()V
    //         return-void
    */

    public fun requestPauseDownload() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mControl:I
    //         const/16 v0, 0xc1
    //         iput v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mStatus:I
    //         return-void
    */

    public fun setDownloadFlags(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDB(Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateFlags(I)Z
    //         return-void
    */

    protected fun shouldStop(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDB(Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         move-result-object v0
    //         iget v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mStatus:I
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun updateLVL(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Handler;
    //         invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         new-instance v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mPendingIntent:Landroid/app/PendingIntent;
    //         invoke-direct {v2, p0, v0, v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloaderService;Landroid/content/Context;Landroid/app/PendingIntent;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    companion object {
    @JvmField public val ACTION_DOWNLOADS_CHANGED: String = "downloadsChanged"
    @JvmField public val ACTION_DOWNLOAD_COMPLETE: String = "lvldownloader.intent.action.DOWNLOAD_COMPLETE"
    @JvmField public val ACTION_DOWNLOAD_STATUS: String = "lvldownloader.intent.action.DOWNLOAD_STATUS"
    @JvmField public val CONTROL_PAUSED: Int = 0x1
    @JvmField public val CONTROL_RUN: Int = 0x0
    @JvmField public val DOWNLOAD_REQUIRED: Int = 0x2
    @JvmField public val EXTRA_FILE_NAME: String = "downloadId"
    @JvmField public val EXTRA_IS_WIFI_REQUIRED: String = "isWifiRequired"
    @JvmField public val EXTRA_MESSAGE_HANDLER: String = "EMH"
    @JvmField public val EXTRA_PACKAGE_NAME: String = "EPN"
    @JvmField public val EXTRA_PENDING_INTENT: String = "EPI"
    @JvmField public val EXTRA_STATUS_CURRENT_FILE_SIZE: String = "CFS"
    @JvmField public val EXTRA_STATUS_CURRENT_PROGRESS: String = "CFP"
    @JvmField public val EXTRA_STATUS_STATE: String = "ESS"
    @JvmField public val EXTRA_STATUS_TOTAL_PROGRESS: String = "TFP"
    @JvmField public val EXTRA_STATUS_TOTAL_SIZE: String = "ETS"
    private val LOG_TAG: String = "LVLDL"
    @JvmField public val LVL_CHECK_REQUIRED: Int = 0x1
    @JvmField public val NETWORK_CANNOT_USE_ROAMING: Int = 0x5
    @JvmField public val NETWORK_MOBILE: Int = 0x1
    @JvmField public val NETWORK_NO_CONNECTION: Int = 0x2
    @JvmField public val NETWORK_OK: Int = 0x1
    @JvmField public val NETWORK_RECOMMENDED_UNUSABLE_DUE_TO_SIZE: Int = 0x4
    @JvmField public val NETWORK_TYPE_DISALLOWED_BY_REQUESTOR: Int = 0x6
    @JvmField public val NETWORK_UNUSABLE_DUE_TO_SIZE: Int = 0x3
    @JvmField public val NETWORK_WIFI: Int = 0x2
    @JvmField public val NO_DOWNLOAD_REQUIRED: Int = 0x0
    private val SMOOTHING_FACTOR: Float = 0.0f
    @JvmField public val STATUS_CANCELED: Int = 0x1ea
    @JvmField public val STATUS_CANNOT_RESUME: Int = 0x1e9
    @JvmField public val STATUS_DEVICE_NOT_FOUND_ERROR: Int = 0x1f3
    @JvmField public val STATUS_FILE_ALREADY_EXISTS_ERROR: Int = 0x1e8
    @JvmField public val STATUS_FILE_DELIVERED_INCORRECTLY: Int = 0x1e7
    @JvmField public val STATUS_FILE_ERROR: Int = 0x1ec
    @JvmField public val STATUS_FORBIDDEN: Int = 0x193
    @JvmField public val STATUS_HTTP_DATA_ERROR: Int = 0x1ef
    @JvmField public val STATUS_HTTP_EXCEPTION: Int = 0x1f0
    @JvmField public val STATUS_INSUFFICIENT_SPACE_ERROR: Int = 0x1f2
    @JvmField public val STATUS_PAUSED_BY_APP: Int = 0xc1
    @JvmField public val STATUS_PENDING: Int = 0xbe
    @JvmField public val STATUS_QUEUED_FOR_WIFI: Int = 0xc5
    @JvmField public val STATUS_QUEUED_FOR_WIFI_OR_CELLULAR_PERMISSION: Int = 0xc4
    @JvmField public val STATUS_RUNNING: Int = 0xc0
    @JvmField public val STATUS_SUCCESS: Int = 0xc8
    @JvmField public val STATUS_TOO_MANY_REDIRECTS: Int = 0x1f1
    @JvmField public val STATUS_UNHANDLED_HTTP_CODE: Int = 0x1ee
    @JvmField public val STATUS_UNHANDLED_REDIRECT: Int = 0x1ed
    @JvmField public val STATUS_UNKNOWN_ERROR: Int = 0x1eb
    @JvmField public val STATUS_WAITING_FOR_NETWORK: Int = 0xc3
    @JvmField public val STATUS_WAITING_TO_RETRY: Int = 0xc2
    private val TEMP_EXT: String = ".tmp"
    @JvmField public val VISIBILITY_HIDDEN: Int = 0x2
    @JvmField public val VISIBILITY_VISIBLE: Int = 0x0
    @JvmField public val VISIBILITY_VISIBLE_NOTIFY_COMPLETED: Int = 0x1
    private var sIsRunning: Boolean

    private @JvmStatic fun isLVLCheckRequired(p0: com.android.vending.expansion.downloader.impl.DownloadsDB, p1: android.content.pm.PackageInfo): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadsDB;Landroid/content/pm/PackageInfo;)Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mVersionCode:I
    //         iget v1, p1, Landroid/content/pm/PackageInfo;->versionCode:I
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isStatusClientError(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0x190
    //         if-lt p0, v0, :cond_0
    //         const/16 v0, 0x1f4
    //         if-ge p0, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isStatusCompleted(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0xc8
    //         if-lt p0, v0, :cond_0
    //         const/16 v0, 0x12c
    //         if-lt p0, v0, :cond_1
    //         :cond_0
    //         const/16 v0, 0x190
    //         if-lt p0, v0, :cond_2
    //         const/16 v0, 0x258
    //         if-ge p0, v0, :cond_2
    //         :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isStatusError(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0x190
    //         if-lt p0, v0, :cond_0
    //         const/16 v0, 0x258
    //         if-ge p0, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isStatusInformational(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0x64
    //         if-lt p0, v0, :cond_0
    //         const/16 v0, 0xc8
    //         if-ge p0, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isStatusServerError(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0x1f4
    //         if-lt p0, v0, :cond_0
    //         const/16 v0, 0x258
    //         if-ge p0, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isStatusSuccess(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/16 v0, 0xc8
    //         if-lt p0, v0, :cond_0
    //         const/16 v0, 0x12c
    //         if-ge p0, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun startDownloadServiceIfRequired(p0: android.content.Context, p1: android.app.PendingIntent, p2: Class): Int { return TODO("body: (Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Landroid/app/PendingIntent;",
    //                 "Ljava/lang/Class",
    //                 "<*>;)I"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {p0, p1, v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun startDownloadServiceIfRequired(p0: android.content.Context, p1: android.app.PendingIntent, p2: String, p3: String): Int { return TODO("body: (Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 12
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         const/4 v3, 0x2
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v0, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         invoke-static {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDB(Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         move-result-object v4
    //         invoke-static {v4, v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isLVLCheckRequired(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;Landroid/content/pm/PackageInfo;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         move v0, v1
    //         :goto_0
    //         iget v5, v4, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mStatus:I
    //         if-nez v5, :cond_2
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloads()[Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         move-result-object v5
    //         if-eqz v5, :cond_0
    //         array-length v6, v5
    //         :goto_1
    //         if-ge v2, v6, :cond_0
    //         aget-object v7, v5, v2
    //         iget-object v8, v7, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         iget-wide v10, v7, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         invoke-static {p0, v8, v10, v11, v1}, Lcom/android/vending/expansion/downloader/Helpers;->doesFileExist(Landroid/content/Context;Ljava/lang/String;JZ)Z
    //         move-result v7
    //         if-nez v7, :cond_1
    //         const/4 v0, -0x1
    //         invoke-virtual {v4, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateStatus(I)Z
    //         move v0, v3
    //         :cond_0
    //         :goto_2
    //         packed-switch v0, :pswitch_data_0
    //         :goto_3
    //         return v0
    //         :cond_1
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v3
    //         goto :goto_2
    //         :pswitch_0
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "EPI"
    //         invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         invoke-virtual {p0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         goto :goto_3
    //         :cond_3
    //         move v0, v2
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun startDownloadServiceIfRequired(p0: android.content.Context, p1: android.content.Intent, p2: Class): Int { return TODO("body: (Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Landroid/content/Intent;",
    //                 "Ljava/lang/Class",
    //                 "<*>;)I"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         const-string v0, "EPI"
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         invoke-static {p0, v0, p2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I
    //         move-result v0
    //         return v0
    */

    }
}
