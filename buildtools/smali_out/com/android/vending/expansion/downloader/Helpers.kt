package com.android.vending.expansion.downloader

// Auto-emitted from smali source: Helpers.java.
// 2 fields, 18 methods.

open class Helpers {
    private constructor()

    companion object {
    private val CONTENT_DISPOSITION_PATTERN: java.util.regex.Pattern = null!!
    @JvmField public var sRandom: java.util.Random

    @JvmStatic fun deleteFile(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v0, Ljava/io/File;
    //         invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "LVLDL"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "file: \'"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "\' couldn\'t be deleted"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public @JvmStatic fun doesFileExist(p0: android.content.Context, p1: String, p2: Long, p3: Boolean): Boolean { return TODO("body: (Landroid/content/Context;Ljava/lang/String;JZ)Z") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/io/File;
    //         invoke-static {p0, p1}, Lcom/android/vending/expansion/downloader/Helpers;->generateSaveFileName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/io/File;->exists()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-virtual {v0}, Ljava/io/File;->length()J
    //         move-result-wide v2
    //         cmp-long v1, v2, p2
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         if-eqz p4, :cond_1
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun generateSaveFileName(p0: android.content.Context, p1: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
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
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getAvailableBytes(p0: java.io.File): Long { return TODO("body: (Ljava/io/File;)J") }
    /*
    //         .locals 6
    //         new-instance v0, Landroid/os/StatFs;
    //         invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I
    //         move-result v1
    //         int-to-long v2, v1
    //         const-wide/16 v4, 0x4
    //         sub-long/2addr v2, v4
    //         invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
    //         move-result v0
    //         int-to-long v0, v0
    //         mul-long/2addr v0, v2
    //         return-wide v0
    */

    public @JvmStatic fun getDownloadProgressPercent(p0: Long, p1: Long): String { return TODO("body: (JJ)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p2, v0
    //         if-nez v0, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-wide/16 v2, 0x64
    //         mul-long/2addr v2, p0
    //         div-long/2addr v2, p2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "%"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getDownloadProgressString(p0: Long, p1: Long): String { return TODO("body: (JJ)Ljava/lang/String;") }
    /*
    //         .locals 8
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         const/high16 v4, 0x49800000    # 1048576.0f
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p2, v0
    //         if-nez v0, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "%.2f"
    //         new-array v2, v6, [Ljava/lang/Object;
    //         long-to-float v3, p0
    //         div-float/2addr v3, v4
    //         invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v3
    //         aput-object v3, v2, v5
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "MB /"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "%.2f"
    //         new-array v2, v6, [Ljava/lang/Object;
    //         long-to-float v3, p2
    //         div-float/2addr v3, v4
    //         invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v3
    //         aput-object v3, v2, v5
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "MB"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getDownloadProgressStringNotification(p0: Long, p1: Long): String { return TODO("body: (JJ)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p2, v0
    //         if-nez v0, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-static {p0, p1, p2, p3}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloadProgressString(JJ)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " ("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-static {p0, p1, p2, p3}, Lcom/android/vending/expansion/downloader/Helpers;->getDownloadProgressPercent(JJ)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getDownloaderStringResourceIDFromState(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         const-string v0, "Starting..."
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         const-string v0, "Waiting for download to start"
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v0, "Looking for resources to download"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "Connecting to the download server"
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "Downloading resources"
    //         goto :goto_0
    //         :pswitch_4
    //         const-string v0, "Download finished"
    //         goto :goto_0
    //         :pswitch_5
    //         const-string v0, "Download paused because no network is available"
    //         goto :goto_0
    //         :pswitch_6
    //         const-string v0, "Download paused"
    //         goto :goto_0
    //         :pswitch_7
    //         const-string v0, "Download paused because wifi is disabled"
    //         goto :goto_0
    //         :pswitch_8
    //         const-string v0, "Download paused because wifi is unavailable"
    //         goto :goto_0
    //         :pswitch_9
    //         const-string v0, "Download paused because wifi is disabled"
    //         goto :goto_0
    //         :pswitch_a
    //         const-string v0, "Download paused because wifi is unavailable"
    //         goto :goto_0
    //         :pswitch_b
    //         const-string v0, "Download paused because you are roaming"
    //         goto :goto_0
    //         :pswitch_c
    //         const-string v0, "Download paused. Test a website in browser"
    //         goto :goto_0
    //         :pswitch_d
    //         const-string v0, "Download paused because the external storage is unavailable"
    //         goto :goto_0
    //         :pswitch_e
    //         const-string v0, "Download failed because you may not have purchased this app"
    //         goto :goto_0
    //         :pswitch_f
    //         const-string v0, "Download failed because the resources could not be found"
    //         goto :goto_0
    //         :pswitch_10
    //         const-string v0, "Download failed because the external storage is full"
    //         goto :goto_0
    //         :pswitch_11
    //         const-string v0, "Download cancelled"
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //             :pswitch_8
    //             :pswitch_9
    //             :pswitch_a
    //             :pswitch_b
    //             :pswitch_c
    //             :pswitch_d
    //             :pswitch_e
    //             :pswitch_f
    //             :pswitch_10
    //             :pswitch_11
    //         .end packed-switch
    */

    public @JvmStatic fun getExpansionAPKFileName(p0: android.content.Context, p1: Boolean, p2: Int): String { return TODO("body: (Landroid/content/Context;ZI)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         if-eqz p1, :cond_0
    //         const-string v0, "main."
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ".obb"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "patch."
    //         goto :goto_0
    */

    public @JvmStatic fun getFilesystemRoot(p0: String): java.io.File { return TODO("body: (Ljava/lang/String;)Ljava/io/File;") }
    /*
    //         .locals 3
    //         invoke-static {}, Landroid/os/Environment;->getDownloadCacheDirectory()Ljava/io/File;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         return-object v0
    //         :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Cannot determine filesystem root for "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun getSaveFilePath(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/android/vending/expansion/downloader/Constants;->EXP_PATH:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getSpeedString(p0: Float): String { return TODO("body: (F)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const-string v0, "%.2f"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         const/high16 v3, 0x447a0000    # 1000.0f
    //         mul-float/2addr v3, p0
    //         const/high16 v4, 0x44800000    # 1024.0f
    //         div-float/2addr v3, v4
    //         invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getTimeRemaining(p0: Long): String { return TODO("body: (J)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-wide/32 v0, 0x36ee80
    //         cmp-long v0, p0, v0
    //         if-lez v0, :cond_0
    //         new-instance v0, Ljava/text/SimpleDateFormat;
    //         const-string v1, "HH:mm"
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    //         :goto_0
    //         new-instance v1, Ljava/util/Date;
    //         invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I
    //         move-result v2
    //         int-to-long v2, v2
    //         sub-long v2, p0, v2
    //         invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/text/SimpleDateFormat;
    //         const-string v1, "mm:ss"
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    //         goto :goto_0
    */

    public @JvmStatic fun isExternalMediaMounted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "mounted"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun isFilenameValid(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         const-string v0, "/+"
    //         const-string v1, "/"
    //         invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Environment;->getDownloadCacheDirectory()Ljava/io/File;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    @JvmStatic fun parseContentDisposition(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         sget-object v0, Lcom/android/vending/expansion/downloader/Helpers;->CONTENT_DISPOSITION_PATTERN:Ljava/util/regex/Pattern;
    //         invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
