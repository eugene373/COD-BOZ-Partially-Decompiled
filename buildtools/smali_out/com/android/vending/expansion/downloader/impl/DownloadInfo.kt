package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadInfo.java.
// 14 fields, 4 methods.

open class DownloadInfo {
    public var mControl: Int
    public var mCurrentBytes: Long
    public var mETag: String
    public val mFileName: String
    public var mFuzz: Int
    public val mIndex: Int
    var mInitialized: Boolean
    public var mLastMod: Long
    public var mNumFailed: Int
    public var mRedirectCount: Int
    public var mRetryAfter: Int
    public var mStatus: Int
    public var mTotalBytes: Long
    public var mUri: String

    public constructor(p0: Int, p1: String, p2: String)

    public fun logVerboseInfo() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-string v0, "LVLDL"
    //         const-string v1, "Service adding new entry"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "FILENAME: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "URI     : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "FILENAME: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "CONTROL : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mControl:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "STATUS  : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "FAILED_C: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "RETRY_AF: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "REDIRECT: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRedirectCount:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "LAST_MOD: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "TOTAL   : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "CURRENT : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "LVLDL"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "ETAG    : "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun resetDownload() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-wide/16 v2, 0x0
    //         const/4 v1, 0x0
    //         iput-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         const-string v0, ""
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         iput-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         iput v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         iput v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mControl:I
    //         iput v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         iput v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         iput v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRedirectCount:I
    //         return-void
    */

    public fun restartTime(p0: Long): Long { return TODO("body: (J)J") }
    /*
    //         .locals 5
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-wide p1
    //         :cond_0
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         if-lez v0, :cond_1
    //         iget-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         int-to-long v2, v2
    //         add-long p1, v0, v2
    //         goto :goto_0
    //         :cond_1
    //         iget-wide v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         iget v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFuzz:I
    //         add-int/lit16 v2, v2, 0x3e8
    //         mul-int/lit8 v2, v2, 0x1e
    //         const/4 v3, 0x1
    //         iget v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         add-int/lit8 v4, v4, -0x1
    //         shl-int/2addr v3, v4
    //         mul-int/2addr v2, v3
    //         int-to-long v2, v2
    //         add-long p1, v0, v2
    //         goto :goto_0
    */

}
