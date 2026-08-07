package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadsDB.java.
// 24 fields, 22 methods.

open class DownloadsDB {
    var mFlags: Int
    var mGetDownloadByIndex: android.database.sqlite.SQLiteStatement
    val mHelper: android.database.sqlite.SQLiteOpenHelper
    var mMetadataRowID: Long
    var mStatus: Int
    var mUpdateCurrentBytes: android.database.sqlite.SQLiteStatement
    var mVersionCode: Int

    private constructor(p0: android.content.Context)

    private fun getDownloadByIndexStatement(): android.database.sqlite.SQLiteStatement { return TODO("body: ()Landroid/database/sqlite/SQLiteStatement;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mGetDownloadByIndex:Landroid/database/sqlite/SQLiteStatement;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v0
    //         const-string v1, "SELECT _id FROM DownloadColumns WHERE FILEIDX = ?"
    //         invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mGetDownloadByIndex:Landroid/database/sqlite/SQLiteStatement;
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mGetDownloadByIndex:Landroid/database/sqlite/SQLiteStatement;
    //         return-object v0
    */

    private fun getUpdateCurrentBytesStatement(): android.database.sqlite.SQLiteStatement { return TODO("body: ()Landroid/database/sqlite/SQLiteStatement;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mUpdateCurrentBytes:Landroid/database/sqlite/SQLiteStatement;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v0
    //         const-string v1, "UPDATE DownloadColumns SET CURRENTBYTES = ? WHERE FILEIDX = ?"
    //         invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mUpdateCurrentBytes:Landroid/database/sqlite/SQLiteStatement;
    //         :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mUpdateCurrentBytes:Landroid/database/sqlite/SQLiteStatement;
    //         return-object v0
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
    //         return-void
    */

    public fun getDownloadInfoByFileName(p0: String): com.android.vending.expansion.downloader.impl.DownloadInfo { return TODO("body: (Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;") }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v0
    //         :try_start_0
    //         const-string v1, "DownloadColumns"
    //         sget-object v2, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->DC_PROJECTION:[Ljava/lang/String;
    //         const-string v3, "FN = ?"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/String;
    //         const/4 v5, 0x0
    //         aput-object p1, v4, v5
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadInfoFromCursor(Landroid/database/Cursor;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result-object v0
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_2
    //         move-object v0, v8
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :goto_1
    //         if-eqz v8, :cond_3
    //         invoke-interface {v8}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         move-object v8, v1
    //         goto :goto_1
    */

    public fun getDownloadInfoFromCursor(p0: android.database.Cursor): com.android.vending.expansion.downloader.impl.DownloadInfo { return TODO("body: (Landroid/database/Cursor;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         const/16 v1, 0xb
    //         invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v1
    //         const/4 v2, 0x0
    //         invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v0, v1, v2, v3}, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0, v0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->setDownloadInfoFromCursor(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Landroid/database/Cursor;)V
    //         return-object v0
    */

    public fun getDownloads(): Array<com.android.vending.expansion.downloader.impl.DownloadInfo> { return TODO("body: ()[Lcom/android/vending/expansion/downloader/impl/DownloadInfo;") }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v0
    //         :try_start_0
    //         const-string v1, "DownloadColumns"
    //         sget-object v2, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->DC_PROJECTION:[Ljava/lang/String;
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
    //         move-result v0
    //         new-array v0, v0, [Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         const/4 v2, 0x0
    //         :goto_0
    //         invoke-virtual {p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadInfoFromCursor(Landroid/database/Cursor;)Lcom/android/vending/expansion/downloader/impl/DownloadInfo;
    //         move-result-object v4
    //         add-int/lit8 v3, v2, 0x1
    //         aput-object v4, v0, v2
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result v2
    //         if-nez v2, :cond_4
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_2
    //         move-object v0, v8
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         :goto_2
    //         if-eqz v8, :cond_3
    //         invoke-interface {v8}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         move-object v8, v1
    //         goto :goto_2
    //         :cond_4
    //         move v2, v3
    //         goto :goto_0
    */

    public fun getFlags(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mFlags:I
    //         return v0
    */

    public fun getIDByIndex(p0: Int): Long { return TODO("body: (I)J") }
    /*
    //         .locals 4
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getDownloadByIndexStatement()Landroid/database/sqlite/SQLiteStatement;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V
    //         const/4 v1, 0x1
    //         int-to-long v2, p1
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V
    //         :try_start_0
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteDoneException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :catch_0
    //         move-exception v0
    //         const-wide/16 v0, -0x1
    //         goto :goto_0
    */

    public fun getIDForDownloadInfo(p0: com.android.vending.expansion.downloader.impl.DownloadInfo): Long { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)J") }
    /*
    //         .locals 2
    //         iget v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mIndex:I
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getIDByIndex(I)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getLastCheckedVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mVersionCode:I
    //         return v0
    */

    public fun isDownloadRequired(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v2
    //         const-string v3, "SELECT Count(*) FROM DownloadColumns WHERE STATUS <> 0"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         :try_start_0
    //         invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         const/4 v3, 0x0
    //         invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v3
    //         if-nez v3, :cond_1
    //         :goto_0
    //         if-eqz v2, :cond_0
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         :goto_1
    //         return v0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         if-eqz v2, :cond_3
    //         invoke-interface {v2}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         throw v0
    */

    public fun setDownloadInfoFromCursor(p0: com.android.vending.expansion.downloader.impl.DownloadInfo, p1: android.database.Cursor) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Landroid/database/Cursor;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         const/4 v0, 0x2
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         const/4 v0, 0x3
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v0
    //         iput-wide v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         const/4 v0, 0x4
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v0
    //         iput-wide v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         const/4 v0, 0x5
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J
    //         move-result-wide v0
    //         iput-wide v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         const/4 v0, 0x6
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         const/4 v0, 0x7
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mControl:I
    //         const/16 v0, 0x8
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         const/16 v0, 0x9
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         const/16 v0, 0xa
    //         invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v0
    //         iput v0, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRedirectCount:I
    //         return-void
    */

    public fun updateDownload(p0: com.android.vending.expansion.downloader.impl.DownloadInfo): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/content/ContentValues;
    //         invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
    //         const-string v1, "FILEIDX"
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mIndex:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         const-string v1, "FN"
    //         iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "URI"
    //         iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mUri:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "ETAG"
    //         iget-object v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mETag:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "TOTALBYTES"
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mTotalBytes:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    //         const-string v1, "CURRENTBYTES"
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    //         const-string v1, "LASTMOD"
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mLastMod:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
    //         const-string v1, "STATUS"
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mStatus:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         const-string v1, "CONTROL"
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mControl:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         const-string v1, "FAILCOUNT"
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mNumFailed:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         const-string v1, "RETRYAFTER"
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRetryAfter:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         const-string v1, "REDIRECTCOUNT"
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mRedirectCount:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         invoke-virtual {p0, p1, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateDownload(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Landroid/content/ContentValues;)Z
    //         move-result v0
    //         return v0
    */

    public fun updateDownload(p0: com.android.vending.expansion.downloader.impl.DownloadInfo, p1: android.content.ContentValues): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Landroid/content/ContentValues;)Z") }
    /*
    //         .locals 8
    //         const/4 v4, 0x1
    //         const-wide/16 v2, -0x1
    //         const/4 v5, 0x0
    //         if-nez p1, :cond_1
    //         move-wide v0, v2
    //         :goto_0
    //         :try_start_0
    //         iget-object v6, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v6}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v6
    //         cmp-long v7, v0, v2
    //         if-eqz v7, :cond_2
    //         const-string v2, "DownloadColumns"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v7, "DownloadColumns._id = "
    //         invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v6, v2, p2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         if-eq v4, v0, :cond_0
    //         :cond_0
    //         :goto_1
    //         return v5
    //         :cond_1
    //         invoke-virtual {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getIDForDownloadInfo(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)J
    //         move-result-wide v0
    //         goto :goto_0
    //         :cond_2
    //         :try_start_1
    //         const-string v0, "DownloadColumns"
    //         const-string v1, "URI"
    //         invoke-virtual {v6, v0, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //         :try_end_1
    //         .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    //         move-result-wide v0
    //         cmp-long v0, v2, v0
    //         if-eqz v0, :cond_3
    //         move v0, v4
    //         :goto_2
    //         move v5, v0
    //         goto :goto_1
    //         :cond_3
    //         move v0, v5
    //         goto :goto_2
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V
    //         goto :goto_1
    */

    public fun updateDownloadCurrentBytes(p0: com.android.vending.expansion.downloader.impl.DownloadInfo) { /* TODO(body): (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)V */ }
    /*
    //         .locals 4
    //         invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->getUpdateCurrentBytesStatement()Landroid/database/sqlite/SQLiteStatement;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->clearBindings()V
    //         const/4 v1, 0x1
    //         iget-wide v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mCurrentBytes:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V
    //         const/4 v1, 0x2
    //         iget v2, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mIndex:I
    //         int-to-long v2, v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteStatement;->bindLong(IJ)V
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V
    //         return-void
    */

    public fun updateFlags(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mFlags:I
    //         if-eq v1, p1, :cond_0
    //         new-instance v1, Landroid/content/ContentValues;
    //         invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
    //         const-string v2, "DOWNLOADFLAGS"
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         invoke-virtual {p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateMetadata(Landroid/content/ContentValues;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iput p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mFlags:I
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun updateFromDb(p0: com.android.vending.expansion.downloader.impl.DownloadInfo): Boolean { return TODO("body: (Lcom/android/vending/expansion/downloader/impl/DownloadInfo;)Z") }
    /*
    //         .locals 11
    //         const/4 v8, 0x1
    //         const/4 v9, 0x0
    //         const/4 v10, 0x0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v0
    //         :try_start_0
    //         const-string v1, "DownloadColumns"
    //         sget-object v2, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->DC_PROJECTION:[Ljava/lang/String;
    //         const-string v3, "FN= ?"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/String;
    //         const/4 v5, 0x0
    //         iget-object v6, p1, Lcom/android/vending/expansion/downloader/impl/DownloadInfo;->mFileName:Ljava/lang/String;
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0, p1, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->setDownloadInfoFromCursor(Lcom/android/vending/expansion/downloader/impl/DownloadInfo;Landroid/database/Cursor;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         move v0, v8
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_2
    //         move v0, v9
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v10
    //         :goto_1
    //         if-eqz v1, :cond_3
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_3
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_1
    */

    public fun updateMetadata(p0: Int, p1: Int): Boolean { return TODO("body: (II)Z") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/ContentValues;
    //         invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
    //         const-string v1, "APKVERSION"
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         const-string v1, "DOWNLOADSTATUS"
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         invoke-virtual {p0, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateMetadata(Landroid/content/ContentValues;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iput p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mVersionCode:I
    //         iput p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mStatus:I
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun updateMetadata(p0: android.content.ContentValues): Boolean { return TODO("body: (Landroid/content/ContentValues;)Z") }
    /*
    //         .locals 6
    //         const-wide/16 v4, -0x1
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    //         invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    //         move-result-object v1
    //         iget-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mMetadataRowID:J
    //         cmp-long v2, v4, v2
    //         if-nez v2, :cond_2
    //         const-string v2, "MetadataColumns"
    //         const-string v3, "APKVERSION"
    //         invoke-virtual {v1, v2, v3, p1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //         move-result-wide v2
    //         cmp-long v1, v4, v2
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iput-wide v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mMetadataRowID:J
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_2
    //         const-string v2, "MetadataColumns"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "_id = "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-wide v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mMetadataRowID:J
    //         invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         invoke-virtual {v1, v2, p1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //         move-result v1
    //         if-nez v1, :cond_1
    //         goto :goto_0
    */

    public fun updateStatus(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mStatus:I
    //         if-eq v1, p1, :cond_0
    //         new-instance v1, Landroid/content/ContentValues;
    //         invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
    //         const-string v2, "DOWNLOADSTATUS"
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    //         invoke-virtual {p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->updateMetadata(Landroid/content/ContentValues;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iput p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB;->mStatus:I
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    private val CONTROL_IDX: Int = 0x7
    private val CURRENTBYTES_IDX: Int = 0x4
    private val DATABASE_NAME: String = "DownloadsDB"
    private val DATABASE_VERSION: Int = 0x7
    private val DC_PROJECTION: Array<String> = null!!
    private val ETAG_IDX: Int = 0x2
    private val FILENAME_IDX: Int = 0x0
    private val INDEX_IDX: Int = 0xb
    private val LASTMOD_IDX: Int = 0x5
    @JvmField public val LOG_TAG: String = null!!
    private val NUM_FAILED_IDX: Int = 0x8
    private val REDIRECT_COUNT_IDX: Int = 0xa
    private val RETRY_AFTER_IDX: Int = 0x9
    private val STATUS_IDX: Int = 0x6
    private val TOTALBYTES_IDX: Int = 0x3
    private val URI_IDX: Int = 0x1
    private var mDownloadsDB: com.android.vending.expansion.downloader.impl.DownloadsDB
    }
}
