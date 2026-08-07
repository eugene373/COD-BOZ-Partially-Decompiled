package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadThread.java.
// 6 fields, 33 methods.

open class DownloadThread {
    private var mContext: android.content.Context
    private val mDB: com.android.vending.expansion.downloader.impl.DownloadsDB
    private var mInfo: com.android.vending.expansion.downloader.impl.DownloadInfo
    private val mNotification: com.android.vending.expansion.downloader.impl.DownloadNotification
    private var mService: com.android.vending.expansion.downloader.impl.DownloaderService
    private var mUserAgent: String

    public constructor(p0: com.android.vending.expansion.downloader.impl.DownloadInfo, p1: com.android.vending.expansion.downloader.impl.DownloaderService, p2: com.android.vending.expansion.downloader.impl.DownloadNotification)

    private fun addRequestHeaders(p0: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p1: org.apache.http.client.methods.HttpGet) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/client/methods/HttpGet;)V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const-string v0, "If-Match"
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;
    //         invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         const-string v0, "Range"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "bytes="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "-"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         return-void
    */

    private fun cannotResume(p0: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)Z") }
    /*
    //         .locals 1
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         if-lez v0, :cond_0
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun checkConnectivity(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         const/16 v2, 0xc3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getNetworkAvailabilityState(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         :pswitch_0
    //         return-void
    //         :pswitch_1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const-string v1, "waiting for network to return"
    //         invoke-direct {v0, p0, v2, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :pswitch_2
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0xc4
    //         const-string v2, "waiting for wifi or for download over cellular to be authorized"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :pswitch_3
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const-string v1, "roaming is not allowed"
    //         invoke-direct {v0, p0, v2, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :pswitch_4
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0xc5
    //         const-string v2, "waiting for wifi"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_2
    //         .end packed-switch
    */

    private fun checkPausedOrCanceled(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getControl()I
    //         move-result v0
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getStatus()I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         :cond_0
    //         return-void
    //         :pswitch_0
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getStatus()I
    //         move-result v1
    //         const-string v2, "download paused"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0xc1
    //             :pswitch_0
    //         .end packed-switch
    */

    private fun cleanupDestination(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: Int) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         invoke-static {p2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isStatusError(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/io/File;
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         const/4 v0, 0x0
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         :cond_0
    //         return-void
    */

    private fun closeDestination(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V */ }
    /*
    //         .locals 1
    //         :try_start_0
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    //         const/4 v0, 0x0
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    private fun executeDownload(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.AndroidHttpClient, p2: org.apache.http.client.methods.HttpGet) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread$1;)V
    //         const/16 v1, 0x1000
    //         new-array v1, v1, [B
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkPausedOrCanceled(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         invoke-direct {p0, p1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->setupDestinationFile(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    //         invoke-direct {p0, v0, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->addRequestHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/client/methods/HttpGet;)V
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkConnectivity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         const/4 v3, 0x3
    //         invoke-virtual {v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         invoke-direct {p0, p1, p2, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->sendRequest(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)Lorg/apache/http/HttpResponse;
    //         move-result-object v2
    //         invoke-direct {p0, p1, v0, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleExceptionalStatus(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V
    //         invoke-direct {p0, p1, v0, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->processResponseHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V
    //         invoke-direct {p0, p1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->openResponseEntity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)Ljava/io/InputStream;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mNotification:Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
    //         const/4 v4, 0x4
    //         invoke-virtual {v3, v4}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V
    //         invoke-direct {p0, p1, v0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->transferData(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)V
    //         return-void
    */

    private fun finalizeDestinationFile(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->syncDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         new-instance v2, Ljava/io/File;
    //         invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         new-instance v0, Ljava/io/File;
    //         invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v4, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         const-wide/16 v6, -0x1
    //         cmp-long v1, v4, v6
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v4, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v6, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         cmp-long v1, v4, v6
    //         if-nez v1, :cond_0
    //         invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1ec
    //         const-string v2, "unable to finalize destination file"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1e7
    //         const-string v2, "file delivered with incorrect size. probably due to network not browser configured"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    private fun getFinalStatusForHttpError(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State): Int { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getNetworkAvailabilityState(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I
    //         move-result v0
    //         if-eq v0, v2, :cond_0
    //         const/16 v0, 0xc3
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         const/4 v1, 0x5
    //         if-ge v0, v1, :cond_1
    //         iput-boolean v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z
    //         const/16 v0, 0xc2
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "reached max retries for "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/16 v0, 0x1ef
    //         goto :goto_0
    */

    private fun handleEndOfStream(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         int-to-long v2, v1
    //         iput-wide v2, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         iget-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;
    //         invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v1
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         if-eqz v0, :cond_2
    //         invoke-direct {p0, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cannotResume(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1e9
    //         const-string v2, "mismatched content length"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I
    //         move-result v1
    //         const-string v2, "closed socket before end of file"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         return-void
    */

    private fun handleExceptionalStatus(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p2: org.apache.http.HttpResponse) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
    //             }
    //         .end annotation
    //         invoke-interface {p3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
    //         move-result-object v0
    //         invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
    //         move-result v1
    //         const/16 v0, 0x1f7
    //         if-ne v1, v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         const/4 v2, 0x5
    //         if-ge v0, v2, :cond_0
    //         invoke-direct {p0, p1, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleServiceUnavailable(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)V
    //         :cond_0
    //         const/16 v0, 0x12d
    //         if-eq v1, v0, :cond_1
    //         const/16 v0, 0x12e
    //         if-eq v1, v0, :cond_1
    //         const/16 v0, 0x12f
    //         if-eq v1, v0, :cond_1
    //         const/16 v0, 0x133
    //         if-ne v1, v0, :cond_2
    //         :cond_1
    //         invoke-direct {p0, p1, p3, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleRedirect(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;I)V
    //         :cond_2
    //         iget-boolean v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z
    //         if-eqz v0, :cond_3
    //         const/16 v0, 0xce
    //         :goto_0
    //         if-eq v1, v0, :cond_4
    //         invoke-direct {p0, p1, p2, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleOtherStatus(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;I)V
    //         :goto_1
    //         return-void
    //         :cond_3
    //         const/16 v0, 0xc8
    //         goto :goto_0
    //         :cond_4
    //         const/4 v0, 0x0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         goto :goto_1
    */

    private fun handleOtherStatus(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p2: Int) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;I)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         invoke-static {p3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isStatusError(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         move v0, p3
    //         :goto_0
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "http error "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, p0, v0, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         const/16 v0, 0x12c
    //         if-lt p3, v0, :cond_1
    //         const/16 v0, 0x190
    //         if-ge p3, v0, :cond_1
    //         const/16 v0, 0x1ed
    //         goto :goto_0
    //         :cond_1
    //         iget-boolean v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z
    //         if-eqz v0, :cond_2
    //         const/16 v0, 0xc8
    //         if-ne p3, v0, :cond_2
    //         const/16 v0, 0x1e9
    //         goto :goto_0
    //         :cond_2
    //         const/16 v0, 0x1ee
    //         goto :goto_0
    */

    private fun handleRedirect(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: org.apache.http.HttpResponse, p2: Int) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;I)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;,
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
    //             }
    //         .end annotation
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         const/4 v1, 0x5
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1f1
    //         const-string v2, "too many redirects"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "Location"
    //         invoke-interface {p2, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         return-void
    //         :cond_1
    //         :try_start_0
    //         new-instance v1, Ljava/net/URI;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    //         new-instance v2, Ljava/net/URI;
    //         invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1, v2}, Ljava/net/URI;->resolve(Ljava/net/URI;)Ljava/net/URI;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         iget v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         add-int/lit8 v1, v1, 0x1
    //         iput v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRequestUri:Ljava/lang/String;
    //         const/16 v1, 0x12d
    //         if-eq p3, v1, :cond_2
    //         const/16 v1, 0x12f
    //         if-ne p3, v1, :cond_3
    //         :cond_2
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mNewUri:Ljava/lang/String;
    //         :cond_3
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;Lcom/android/vending/expansion/downloader/impl/DownloadThread$1;)V
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1ef
    //         const-string v2, "Couldn\'t resolve redirect URI"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    */

    private fun handleServiceUnavailable(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: org.apache.http.HttpResponse) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         const v2, 0x15180
    //         const/16 v1, 0x1e
    //         const/4 v0, 0x1
    //         iput-boolean v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z
    //         const-string v0, "Retry-After"
    //         invoke-interface {p2, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         if-gez v0, :cond_1
    //         const/4 v0, 0x0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0xc2
    //         const-string v2, "got 503 Service Unavailable, will retry later"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         if-ge v0, v1, :cond_3
    //         const/16 v0, 0x1e
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         :cond_2
    //         :goto_1
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         sget-object v1, Lcom/android/vending/expansion/downloader/Helpers;->sRandom:Ljava/util/Random;
    //         const/16 v2, 0x1f
    //         invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         mul-int/lit16 v0, v0, 0x3e8
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    //         :cond_3
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         if-le v0, v2, :cond_2
    //         const v0, 0x15180
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         :try_end_1
    //         .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_1
    */

    private fun logNetworkState() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-string v1, "LVLDL"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Net "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         invoke-virtual {v0, v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getNetworkAvailabilityState(Lcom/android/vending/expansion/downloader/impl/DownloadsDB;)I
    //         move-result v0
    //         const/4 v3, 0x1
    //         if-ne v0, v3, :cond_0
    //         const-string v0, "Up"
    //         :goto_0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    //         :cond_0
    //         const-string v0, "Down"
    //         goto :goto_0
    */

    private fun notifyDownloadCompleted(p0: Int, p1: Boolean, p2: Int, p3: Int, p4: Boolean, p5: String) { /* TODO(body): (IZIIZLjava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-direct/range {p0 .. p6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->updateDownloadDatabase(IZIIZLjava/lang/String;)V
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isStatusCompleted(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :cond_0
    //         return-void
    */

    private fun openResponseEntity(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: org.apache.http.HttpResponse): java.io.InputStream { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lorg/apache/http/HttpResponse;)Ljava/io/InputStream;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    //         move-result-object v0
    //         invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->logNetworkState()V
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I
    //         move-result v2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "while getting entity: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun processResponseHeaders(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p2: org.apache.http.HttpResponse) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         iget-boolean v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p1, p2, p3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->readResponseHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v1, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         invoke-virtual {v0, v1, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->generateSaveFile(Ljava/lang/String;J)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         :try_end_0
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError; {:try_start_0 .. :try_end_0} :catch_0
    //         :try_start_1
    //         new-instance v0, Ljava/io/FileOutputStream;
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    //         :cond_1
    //         :goto_1
    //         invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->updateDatabaseFromHeaders(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkConnectivity(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         iget v2, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;->mStatus:I
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$GenerateSaveFileError;->mMessage:Ljava/lang/String;
    //         invoke-direct {v1, p0, v2, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/io/File;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-static {v2}, Lcom/android/vending/expansion/downloader/Helpers;->getSaveFilePath(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         :try_start_2
    //         invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         new-instance v1, Ljava/io/FileOutputStream;
    //         iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    //         iput-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    //         goto :goto_1
    //         :catch_2
    //         move-exception v1
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v2, 0x1ec
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "while opening destination file: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun readFromResponse(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p2: ByteArray, p3: java.io.InputStream): Int { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p4, p3}, Ljava/io/InputStream;->read([B)I
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->logNetworkState()V
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         int-to-long v2, v2
    //         iput-wide v2, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         invoke-virtual {v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         invoke-direct {p0, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cannotResume(Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "while reading response: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", can\'t resume interrupted download with no ETag"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v3, 0x1e9
    //         invoke-direct {v2, p0, v3, v1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         :cond_0
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I
    //         move-result v2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "while reading response: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun readResponseHeaders(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p2: org.apache.http.HttpResponse) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;Lorg/apache/http/HttpResponse;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         const-string v0, "Content-Disposition"
    //         invoke-interface {p3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentDisposition:Ljava/lang/String;
    //         :cond_0
    //         const-string v0, "Content-Location"
    //         invoke-interface {p3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLocation:Ljava/lang/String;
    //         :cond_1
    //         const-string v0, "ETag"
    //         invoke-interface {p3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;
    //         :cond_2
    //         const/4 v0, 0x0
    //         const-string v1, "Transfer-Encoding"
    //         invoke-interface {p3, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v1
    //         if-eqz v1, :cond_3
    //         invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_3
    //         const-string v1, "Content-Type"
    //         invoke-interface {p3, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v1
    //         if-eqz v1, :cond_4
    //         invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "application/vnd.android.obb"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_4
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1e7
    //         const-string v2, "file delivered with incorrect Mime type"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         if-nez v0, :cond_5
    //         const-string v1, "Content-Length"
    //         invoke-interface {p3, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    //         move-result-object v1
    //         if-eqz v1, :cond_5
    //         invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;
    //         iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;
    //         invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         const-wide/16 v4, -0x1
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_5
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v4, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_5
    //         const-string v1, "LVLDL"
    //         const-string v2, "Incorrect file size delivered."
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_5
    //         iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;
    //         if-nez v1, :cond_7
    //         if-eqz v0, :cond_6
    //         const-string v1, "chunked"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         :cond_6
    //         const/4 v0, 0x1
    //         :goto_0
    //         if-eqz v0, :cond_8
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1ef
    //         const-string v2, "can\'t know size of download, giving up"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_7
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_8
    //         return-void
    */

    private fun reportProgress(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V */ }
    /*
    //         .locals 6
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         iget v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         iget v3, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesNotified:I
    //         sub-int/2addr v2, v3
    //         const/16 v3, 0x1000
    //         if-le v2, v3, :cond_0
    //         iget-wide v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mTimeLastNotification:J
    //         sub-long v2, v0, v2
    //         const-wide/16 v4, 0x3e8
    //         cmp-long v2, v2, v4
    //         if-lez v2, :cond_0
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v3, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         int-to-long v4, v3
    //         iput-wide v4, v2, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         invoke-virtual {v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownloadCurrentBytes(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)V
    //         iget v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         iput v2, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesNotified:I
    //         iput-wide v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mTimeLastNotification:J
    //         iget v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I
    //         int-to-long v0, v0
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         iget-wide v2, v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->mBytesSoFar:J
    //         add-long/2addr v0, v2
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v2, v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->notifyUpdateBytes(J)V
    //         :cond_0
    //         return-void
    */

    private fun sendRequest(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.AndroidHttpClient, p2: org.apache.http.client.methods.HttpGet): org.apache.http.HttpResponse { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)Lorg/apache/http/HttpResponse;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p2, p3}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v2, 0x1ef
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "while trying to execute request: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->logNetworkState()V
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getFinalStatusForHttpError(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)I
    //         move-result v2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "while trying to execute request: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun setupDestinationFile(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         const/16 v7, 0x1ec
    //         const/4 v6, 0x1
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/Helpers;->isFilenameValid(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const-string v1, "found invalid internal destination filename"
    //         invoke-direct {v0, p0, v7, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Ljava/io/File;
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/io/File;->exists()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-virtual {v0}, Ljava/io/File;->length()J
    //         move-result-wide v2
    //         const-wide/16 v4, 0x0
    //         cmp-long v1, v2, v4
    //         if-nez v1, :cond_3
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         const/4 v0, 0x0
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         :cond_1
    //         :goto_0
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         if-eqz v0, :cond_2
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         :cond_2
    //         return-void
    //         :cond_3
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v1, v1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         if-nez v1, :cond_4
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1e9
    //         const-string v2, "Trying to resume a download that can\'t be resumed"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         :try_start_0
    //         new-instance v0, Ljava/io/FileOutputStream;
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         const/4 v4, 0x1
    //         invoke-direct {v0, v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         long-to-int v0, v2
    //         iput v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         const-wide/16 v2, -0x1
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-wide v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderContentLength:Ljava/lang/String;
    //         :cond_5
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v0, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         iput-object v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;
    //         iput-boolean v6, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mContinuingDownload:Z
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "while opening destination for resuming: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v0}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, p0, v7, v2, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun syncDestination(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V */ }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         :try_start_0
    //         new-instance v1, Ljava/io/FileOutputStream;
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         const/4 v3, 0x1
    //         invoke-direct {v1, v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/io/SyncFailedException; {:try_start_0 .. :try_end_0} :catch_5
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    //         .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_b
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_13
    //         .catch Ljava/io/SyncFailedException; {:try_start_1 .. :try_end_1} :catch_12
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_11
    //         .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_10
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         if-eqz v1, :cond_0
    //         :try_start_2
    //         invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_2
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "IOException while closing synced file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "exception while closing file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         move-object v1, v2
    //         :goto_1
    //         :try_start_3
    //         const-string v2, "LVLDL"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "file "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, " not found: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         if-eqz v1, :cond_0
    //         :try_start_4
    //         invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_4
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    //         .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    //         goto :goto_0
    //         :catch_3
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "IOException while closing synced file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         :catch_4
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "exception while closing file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         :catch_5
    //         move-exception v0
    //         :goto_2
    //         :try_start_5
    //         const-string v1, "LVLDL"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "file "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, " sync failed: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         if-eqz v2, :cond_0
    //         :try_start_6
    //         invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_6
    //         .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    //         .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_7
    //         goto :goto_0
    //         :catch_6
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "IOException while closing synced file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catch_7
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "exception while closing file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catch_8
    //         move-exception v0
    //         :goto_3
    //         :try_start_7
    //         const-string v1, "LVLDL"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "IOException trying to sync "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ": "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_7
    //         .catchall {:try_start_7 .. :try_end_7} :catchall_0
    //         if-eqz v2, :cond_0
    //         :try_start_8
    //         invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_8
    //         .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_9
    //         .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_a
    //         goto/16 :goto_0
    //         :catch_9
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "IOException while closing synced file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catch_a
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "exception while closing file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catch_b
    //         move-exception v0
    //         :goto_4
    //         :try_start_9
    //         const-string v1, "LVLDL"
    //         const-string v3, "exception while syncing file: "
    //         invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :try_end_9
    //         .catchall {:try_start_9 .. :try_end_9} :catchall_0
    //         if-eqz v2, :cond_0
    //         :try_start_a
    //         invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_a
    //         .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_c
    //         .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_d
    //         goto/16 :goto_0
    //         :catch_c
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "IOException while closing synced file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catch_d
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         const-string v2, "exception while closing file: "
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :goto_5
    //         if-eqz v2, :cond_1
    //         :try_start_b
    //         invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    //         :try_end_b
    //         .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_e
    //         .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_f
    //         :cond_1
    //         :goto_6
    //         throw v0
    //         :catch_e
    //         move-exception v1
    //         const-string v2, "LVLDL"
    //         const-string v3, "IOException while closing synced file: "
    //         invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_6
    //         :catch_f
    //         move-exception v1
    //         const-string v2, "LVLDL"
    //         const-string v3, "exception while closing file: "
    //         invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_6
    //         :catchall_1
    //         move-exception v0
    //         move-object v2, v1
    //         goto :goto_5
    //         :catch_10
    //         move-exception v0
    //         move-object v2, v1
    //         goto :goto_4
    //         :catch_11
    //         move-exception v0
    //         move-object v2, v1
    //         goto/16 :goto_3
    //         :catch_12
    //         move-exception v0
    //         move-object v2, v1
    //         goto/16 :goto_2
    //         :catch_13
    //         move-exception v0
    //         goto/16 :goto_1
    */

    private fun transferData(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState, p2: ByteArray, p3: java.io.InputStream) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         :goto_0
    //         invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->readFromResponse(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;[BLjava/io/InputStream;)I
    //         move-result v0
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_0
    //         invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->handleEndOfStream(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    //         return-void
    //         :cond_0
    //         const/4 v1, 0x1
    //         iput-boolean v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z
    //         invoke-direct {p0, p1, p3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->writeDataToDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;[BI)V
    //         iget v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         add-int/2addr v1, v0
    //         iput v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesSoFar:I
    //         iget v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I
    //         add-int/2addr v0, v1
    //         iput v0, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mBytesThisSession:I
    //         invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->reportProgress(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->checkPausedOrCanceled(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         goto :goto_0
    */

    private fun updateDatabaseFromHeaders(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: com.android.vending.expansion.downloader.impl.DownloadThread.InnerState) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v1, p2, Lcom/android/vending/expansion/downloader/impl/DownloadThread$InnerState;->mHeaderETag:Ljava/lang/String;
    //         iput-object v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         return-void
    */

    private fun updateDownloadDatabase(p0: Int, p1: Boolean, p2: Int, p3: Int, p4: Boolean, p5: String) { /* TODO(body): (IZIIZLjava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iput p1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iput p3, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iput p4, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRedirectCount:I
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iput-wide v2, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         if-nez p2, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         const/4 v1, 0x0
    //         iput v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         :goto_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mDB:Lcom/android/vending/expansion/downloader/impl/DownloadsDB;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z
    //         return-void
    //         :cond_0
    //         if-eqz p5, :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         const/4 v1, 0x1
    //         iput v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         add-int/lit8 v1, v1, 0x1
    //         iput v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         goto :goto_0
    */

    private fun userAgent(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mUserAgent:Ljava/lang/String;
    //         return-object v0
    */

    private fun writeDataToDestination(p0: com.android.vending.expansion.downloader.impl.DownloadThread.State, p1: ByteArray, p2: Int) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;[BI)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/io/FileOutputStream;
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         const/4 v2, 0x1
    //         invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         :cond_0
    //         iget-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mStream:Ljava/io/FileOutputStream;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, p2, v1, p3}, Ljava/io/FileOutputStream;->write([BII)V
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->closeDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-static {}, Lcom/android/vending/expansion/downloader/Helpers;->isExternalMediaMounted()Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v1, 0x1f3
    //         const-string v2, "external media not mounted while writing destination file"
    //         invoke-direct {v0, p0, v1, v2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v1, p1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getFilesystemRoot(Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/Helpers;->getAvailableBytes(Ljava/io/File;)J
    //         move-result-wide v2
    //         int-to-long v4, p3
    //         cmp-long v1, v2, v4
    //         if-gez v1, :cond_2
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v2, 0x1f2
    //         const-string v3, "insufficient space while writing destination file"
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :cond_2
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
    //         const/16 v2, 0x1ec
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "while writing destination file: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, p0, v2, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun getPreferredHttpHost(p0: android.content.Context, p1: String): org.apache.http.HttpHost { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/HttpHost;") }
    /*
    //         .locals 4
    //         invoke-static {p2}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->isLocalHost(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->isWiFi()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p1}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lorg/apache/http/HttpHost;
    //         invoke-static {p1}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I
    //         move-result v2
    //         const-string v3, "http"
    //         invoke-direct {v0, v1, v2, v3}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 9
    //         const/4 v4, 0x0
    //         const/16 v1, 0x1eb
    //         const/4 v2, 0x1
    //         const/16 v0, 0xa
    //         invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V
    //         new-instance v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mService:Lcom/android/vending/expansion/downloader/impl/DownloaderService;
    //         invoke-direct {v6, v0, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Lcom/android/vending/expansion/downloader/impl/DownloaderService;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;
    //         const-string v3, "power"
    //         invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/PowerManager;
    //         const/4 v3, 0x1
    //         const-string v5, "LVLDL"
    //         invoke-virtual {v0, v3, v5}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //         :try_end_0
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_0 .. :try_end_0} :catch_4
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_1
    //         move-result-object v3
    //         :try_start_1
    //         invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->acquire()V
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->userAgent()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;
    //         invoke-static {v0, v5}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->newInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
    //         move-result-object v4
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-nez v0, :cond_4
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
    //         move-result-object v5
    //         iget-object v7, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mContext:Landroid/content/Context;
    //         iget-object v8, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRequestUri:Ljava/lang/String;
    //         invoke-virtual {p0, v7, v8}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->getPreferredHttpHost(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/HttpHost;
    //         move-result-object v7
    //         invoke-static {v5, v7}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V
    //         new-instance v5, Lorg/apache/http/client/methods/HttpGet;
    //         iget-object v7, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRequestUri:Ljava/lang/String;
    //         invoke-direct {v5, v7}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
    //         :try_end_1
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_2
    //         :try_start_2
    //         invoke-direct {p0, v6, v4, v5}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->executeDownload(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/client/methods/HttpGet;)V
    //         :try_end_2
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload; {:try_start_2 .. :try_end_2} :catch_0
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :try_start_3
    //         invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V
    //         move v0, v2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v7
    //         invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V
    //         :try_end_3
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_3 .. :try_end_3} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_2
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         move-object v2, v3
    //         :goto_1
    //         :try_start_4
    //         const-string v3, "LVLDL"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v7, "Aborting request for download "
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget-object v7, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v7, v7, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v7, ": "
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->getMessage()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v3, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->printStackTrace()V
    //         iget v1, v0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->mFinalStatus:I
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_3
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V
    //         :cond_0
    //         if-eqz v4, :cond_1
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V
    //         :cond_1
    //         invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V
    //         iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z
    //         iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z
    //         iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V
    //         :goto_2
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_5
    //         invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V
    //         throw v0
    //         :try_end_5
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_5 .. :try_end_5} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_2
    //         :catch_2
    //         move-exception v0
    //         :goto_3
    //         :try_start_6
    //         const-string v2, "LVLDL"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v7, "Exception for "
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         iget-object v7, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->mInfo:Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         iget-object v7, v7, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v7, ": "
    //         invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_6
    //         .catchall {:try_start_6 .. :try_end_6} :catchall_2
    //         if-eqz v3, :cond_2
    //         invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V
    //         :cond_2
    //         if-eqz v4, :cond_3
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V
    //         :cond_3
    //         invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V
    //         iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z
    //         iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z
    //         iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V
    //         goto :goto_2
    //         :cond_4
    //         :try_start_7
    //         invoke-direct {p0, v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->finalizeDestinationFile(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;)V
    //         :try_end_7
    //         .catch Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest; {:try_start_7 .. :try_end_7} :catch_1
    //         .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    //         .catchall {:try_start_7 .. :try_end_7} :catchall_2
    //         const/16 v1, 0xc8
    //         if-eqz v3, :cond_5
    //         invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V
    //         :cond_5
    //         if-eqz v4, :cond_6
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V
    //         :cond_6
    //         invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V
    //         iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z
    //         iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z
    //         iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V
    //         goto :goto_2
    //         :catchall_1
    //         move-exception v0
    //         move-object v7, v0
    //         move-object v3, v4
    //         :goto_4
    //         if-eqz v3, :cond_7
    //         invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V
    //         :cond_7
    //         if-eqz v4, :cond_8
    //         invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->close()V
    //         :cond_8
    //         invoke-direct {p0, v6, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->cleanupDestination(Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;I)V
    //         iget-boolean v2, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mCountRetry:Z
    //         iget v3, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRetryAfter:I
    //         iget v4, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mRedirectCount:I
    //         iget-boolean v5, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mGotData:Z
    //         iget-object v6, v6, Lcom/android/vending/expansion/downloader/impl/DownloadThread$State;->mFilename:Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/android/vending/expansion/downloader/impl/DownloadThread;->notifyDownloadCompleted(IZIIZLjava/lang/String;)V
    //         throw v7
    //         :catchall_2
    //         move-exception v0
    //         move-object v7, v0
    //         goto :goto_4
    //         :catchall_3
    //         move-exception v0
    //         move-object v7, v0
    //         move-object v3, v2
    //         goto :goto_4
    //         :catch_3
    //         move-exception v0
    //         move-object v3, v4
    //         goto/16 :goto_3
    //         :catch_4
    //         move-exception v0
    //         move-object v2, v4
    //         goto/16 :goto_1
    */

    companion object {
    private @JvmStatic fun isLocalHost(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         :try_start_0
    //         invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const-string v2, "localhost"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_2
    //         const-string v2, "127.0.0.1"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_2
    //         const-string v2, "[::1]"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    }
}
