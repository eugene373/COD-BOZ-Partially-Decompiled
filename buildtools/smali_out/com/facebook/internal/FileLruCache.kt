package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 11 fields, 17 methods.

class FileLruCache {
    private val directory: java.io.File
    private var isTrimInProgress: Boolean
    private var isTrimPending: Boolean
    private var lastClearCacheTime: java.util.concurrent.atomic.AtomicLong
    private val limits: com.facebook.internal.FileLruCache.Limits
    private val lock: Object
    private val tag: String

    public constructor(p0: android.content.Context, p1: String, p2: com.facebook.internal.FileLruCache.Limits)

    private fun postTrim() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/facebook/internal/FileLruCache;->isTrimPending:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/internal/FileLruCache;->isTrimPending:Z
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v0
    //         new-instance v2, Lcom/facebook/internal/FileLruCache$3;
    //         invoke-direct {v2, p0}, Lcom/facebook/internal/FileLruCache$3;-><init>(Lcom/facebook/internal/FileLruCache;)V
    //         invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private fun renameToTargetAndTrim(p0: String, p1: java.io.File) { /* TODO(body): (Ljava/lang/String;Ljava/io/File;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/io/File;
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         invoke-virtual {p2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p2}, Ljava/io/File;->delete()Z
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/internal/FileLruCache;->postTrim()V
    //         return-void
    */

    private fun trim() { /* TODO(body): ()V */ }
    /*
    //         .locals 18
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         monitor-enter v3
    //         const/4 v2, 0x0
    //         :try_start_0
    //         move-object/from16 v0, p0
    //         iput-boolean v2, v0, Lcom/facebook/internal/FileLruCache;->isTrimPending:Z
    //         const/4 v2, 0x1
    //         move-object/from16 v0, p0
    //         iput-boolean v2, v0, Lcom/facebook/internal/FileLruCache;->isTrimInProgress:Z
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v3, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         const-string v4, "trim started"
    //         invoke-static {v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v10, Ljava/util/PriorityQueue;
    //         invoke-direct {v10}, Ljava/util/PriorityQueue;-><init>()V
    //         const-wide/16 v4, 0x0
    //         const-wide/16 v2, 0x0
    //         move-object/from16 v0, p0
    //         iget-object v6, v0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-static {}, Lcom/facebook/internal/FileLruCache$BufferFile;->excludeBufferFiles()Ljava/io/FilenameFilter;
    //         move-result-object v7
    //         invoke-virtual {v6, v7}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //         move-result-object v7
    //         if-eqz v7, :cond_2
    //         array-length v11, v7
    //         const/4 v6, 0x0
    //         :goto_0
    //         if-ge v6, v11, :cond_2
    //         aget-object v8, v7, v6
    //         new-instance v9, Lcom/facebook/internal/FileLruCache$ModifiedFile;
    //         invoke-direct {v9, v8}, Lcom/facebook/internal/FileLruCache$ModifiedFile;-><init>(Ljava/io/File;)V
    //         invoke-virtual {v10, v9}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z
    //         sget-object v12, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v13, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v14, Ljava/lang/StringBuilder;
    //         invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v15, "  trim considering time="
    //         invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         invoke-virtual {v9}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getModified()J
    //         move-result-wide v16
    //         invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v15
    //         invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         const-string v15, " name="
    //         invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v14
    //         invoke-virtual {v9}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getFile()Ljava/io/File;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-static {v12, v13, v9}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v8}, Ljava/io/File;->length()J
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_2
    //         move-result-wide v8
    //         add-long/2addr v8, v4
    //         const-wide/16 v4, 0x1
    //         add-long/2addr v4, v2
    //         add-int/lit8 v2, v6, 0x1
    //         move v6, v2
    //         move-wide v2, v4
    //         move-wide v4, v8
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v2
    //         :try_start_2
    //         monitor-exit v3
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v2
    //         :goto_1
    //         :try_start_3
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/facebook/internal/FileLruCache;->limits:Lcom/facebook/internal/FileLruCache$Limits;
    //         invoke-virtual {v2}, Lcom/facebook/internal/FileLruCache$Limits;->getByteCount()I
    //         move-result v2
    //         int-to-long v2, v2
    //         cmp-long v2, v6, v2
    //         if-gtz v2, :cond_0
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/facebook/internal/FileLruCache;->limits:Lcom/facebook/internal/FileLruCache$Limits;
    //         invoke-virtual {v2}, Lcom/facebook/internal/FileLruCache$Limits;->getFileCount()I
    //         move-result v2
    //         int-to-long v2, v2
    //         cmp-long v2, v4, v2
    //         if-lez v2, :cond_1
    //         :cond_0
    //         invoke-virtual {v10}, Ljava/util/PriorityQueue;->remove()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/facebook/internal/FileLruCache$ModifiedFile;
    //         invoke-virtual {v2}, Lcom/facebook/internal/FileLruCache$ModifiedFile;->getFile()Ljava/io/File;
    //         move-result-object v8
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v3, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v9, Ljava/lang/StringBuilder;
    //         invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v11, "  trim removing "
    //         invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v11
    //         invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-static {v2, v3, v9}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v8}, Ljava/io/File;->length()J
    //         move-result-wide v2
    //         sub-long/2addr v6, v2
    //         const-wide/16 v2, 0x1
    //         sub-long v2, v4, v2
    //         invoke-virtual {v8}, Ljava/io/File;->delete()Z
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_2
    //         move-wide v4, v2
    //         goto :goto_1
    //         :cond_1
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         monitor-enter v3
    //         const/4 v2, 0x0
    //         :try_start_4
    //         move-object/from16 v0, p0
    //         iput-boolean v2, v0, Lcom/facebook/internal/FileLruCache;->isTrimInProgress:Z
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    //         monitor-exit v3
    //         return-void
    //         :catchall_1
    //         move-exception v2
    //         monitor-exit v3
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_1
    //         throw v2
    //         :catchall_2
    //         move-exception v2
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         monitor-enter v3
    //         const/4 v4, 0x0
    //         :try_start_5
    //         move-object/from16 v0, p0
    //         iput-boolean v4, v0, Lcom/facebook/internal/FileLruCache;->isTrimInProgress:Z
    //         move-object/from16 v0, p0
    //         iget-object v4, v0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    //         monitor-exit v3
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_3
    //         throw v2
    //         :catchall_3
    //         move-exception v2
    //         :try_start_6
    //         monitor-exit v3
    //         :try_end_6
    //         .catchall {:try_start_6 .. :try_end_6} :catchall_3
    //         throw v2
    //         :cond_2
    //         move-wide v6, v4
    //         move-wide v4, v2
    //         goto :goto_1
    */

    public fun clearCache() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-static {}, Lcom/facebook/internal/FileLruCache$BufferFile;->excludeBufferFiles()Ljava/io/FilenameFilter;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->lastClearCacheTime:Ljava/util/concurrent/atomic/AtomicLong;
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/internal/FileLruCache$2;
    //         invoke-direct {v2, p0, v0}, Lcom/facebook/internal/FileLruCache$2;-><init>(Lcom/facebook/internal/FileLruCache;[Ljava/io/File;)V
    //         invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         :cond_0
    //         return-void
    */

    public fun get(p0: String): java.io.InputStream { return TODO("body: (Ljava/lang/String;)Ljava/io/InputStream;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //         move-result-object v0
    //         return-object v0
    */

    public fun get(p0: String, p1: String): java.io.InputStream { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         new-instance v2, Ljava/io/File;
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         :try_start_0
    //         new-instance v3, Ljava/io/FileInputStream;
    //         invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         new-instance v1, Ljava/io/BufferedInputStream;
    //         const/16 v4, 0x2000
    //         invoke-direct {v1, v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    //         :try_start_1
    //         invoke-static {v1}, Lcom/facebook/internal/FileLruCache$StreamHeader;->readHeader(Ljava/io/InputStream;)Lorg/json/JSONObject;
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_2
    //         const-string v4, "key"
    //         invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         if-eqz v4, :cond_1
    //         invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         move-result v4
    //         if-nez v4, :cond_2
    //         :cond_1
    //         invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    //         goto :goto_0
    //         :cond_2
    //         :try_start_3
    //         const-string v4, "tag"
    //         const/4 v5, 0x0
    //         invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         if-nez p2, :cond_3
    //         if-nez v3, :cond_4
    //         :cond_3
    //         if-eqz p2, :cond_5
    //         invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         move-result v3
    //         if-nez v3, :cond_5
    //         :cond_4
    //         invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    //         goto :goto_0
    //         :cond_5
    //         :try_start_4
    //         new-instance v0, Ljava/util/Date;
    //         invoke-direct {v0}, Ljava/util/Date;-><init>()V
    //         invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    //         move-result-wide v4
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v3, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v6, Ljava/lang/StringBuilder;
    //         invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v7, "Setting lastModified to "
    //         invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v6
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v7
    //         invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v6
    //         const-string v7, " for "
    //         invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v6
    //         invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v6
    //         invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-static {v0, v3, v6}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v2, v4, v5}, Ljava/io/File;->setLastModified(J)Z
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         move-object v0, v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    //         throw v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun interceptAndPut(p0: String, p1: java.io.InputStream): java.io.InputStream { return TODO("body: (Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/facebook/internal/FileLruCache;->openPutStream(Ljava/lang/String;)Ljava/io/OutputStream;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/internal/FileLruCache$CopyingInputStream;
    //         invoke-direct {v1, p2, v0}, Lcom/facebook/internal/FileLruCache$CopyingInputStream;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //         return-object v1
    */

    fun openPutStream(p0: String): java.io.OutputStream { return TODO("body: (Ljava/lang/String;)Ljava/io/OutputStream;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/facebook/internal/FileLruCache;->openPutStream(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //         move-result-object v0
    //         return-object v0
    */

    public fun openPutStream(p0: String, p1: String): java.io.OutputStream { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v5, 0x5
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-static {v0}, Lcom/facebook/internal/FileLruCache$BufferFile;->newFile(Ljava/io/File;)Ljava/io/File;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/io/File;->delete()Z
    //         invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Could not create file at "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         new-instance v6, Ljava/io/FileOutputStream;
    //         invoke-direct {v6, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         new-instance v0, Lcom/facebook/internal/FileLruCache$1;
    //         move-object v1, p0
    //         move-object v5, p1
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/internal/FileLruCache$1;-><init>(Lcom/facebook/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V
    //         new-instance v1, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;
    //         invoke-direct {v1, v6, v0}, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;-><init>(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V
    //         new-instance v2, Ljava/io/BufferedOutputStream;
    //         const/16 v0, 0x2000
    //         invoke-direct {v2, v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    //         :try_start_1
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "key"
    //         invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const-string v1, "tag"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_1
    //         invoke-static {v2, v0}, Lcom/facebook/internal/FileLruCache$StreamHeader;->writeHeader(Ljava/io/OutputStream;Lorg/json/JSONObject;)V
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-object v2
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         sget-object v2, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error creating buffer output stream: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v1, v5, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         :try_start_2
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         const/4 v3, 0x5
    //         sget-object v4, Lcom/facebook/internal/FileLruCache;->TAG:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Error creating JSON header for cache file: "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v1, v3, v4, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         new-instance v1, Ljava/io/IOException;
    //         invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Ljava/io/BufferedOutputStream;->close()V
    //         throw v0
    */

    fun sizeInBytesForTest(): Long { return TODO("body: ()J") }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :goto_0
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/facebook/internal/FileLruCache;->isTrimPending:Z
    //         if-nez v0, :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/internal/FileLruCache;->isTrimInProgress:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache;->lock:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    //         :cond_1
    //         :try_start_2
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
    //         move-result-object v3
    //         const-wide/16 v0, 0x0
    //         if-eqz v3, :cond_2
    //         array-length v6, v3
    //         const/4 v2, 0x0
    //         :goto_1
    //         if-ge v2, v6, :cond_2
    //         aget-object v4, v3, v2
    //         invoke-virtual {v4}, Ljava/io/File;->length()J
    //         move-result-wide v4
    //         add-long/2addr v4, v0
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         move-wide v0, v4
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :cond_2
    //         return-wide v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{FileLruCache: tag:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->tag:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " file:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache;->directory:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val HEADER_CACHEKEY_KEY: String = "key"
    private val HEADER_CACHE_CONTENT_TAG_KEY: String = "tag"
    val TAG: String = null!!
    private val bufferIndex: java.util.concurrent.atomic.AtomicLong = null!!
    }
}
