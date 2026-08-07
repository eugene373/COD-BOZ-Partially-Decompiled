package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadsDB.java.
// 1 fields, 6 methods.

open class DownloadsDB_DownloadsContentDBHelper: android.database.sqlite.SQLiteOpenHelper() {
    constructor(p0: android.content.Context)

    private fun createTableQueryFromArray(p0: String, p1: Array<Array<String>>): String { return TODO("body: (Ljava/lang/String;[[Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 7
    //         const/16 v6, 0x20
    //         const/4 v1, 0x0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v0, "CREATE TABLE "
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, " ("
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         array-length v3, p2
    //         move v0, v1
    //         :goto_0
    //         if-lt v0, v3, :cond_0
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->setLength(I)V
    //         const-string v0, ");"
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         aget-object v4, p2, v0
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         aget-object v5, v4, v1
    //         invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         const/4 v5, 0x1
    //         aget-object v4, v4, v5
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const/16 v4, 0x2c
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    private fun dropTables(p0: android.database.sqlite.SQLiteDatabase) { /* TODO(body): (Landroid/database/sqlite/SQLiteDatabase;)V */ }
    /*
    //         .locals 6
    //         sget-object v2, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->sTables:[Ljava/lang/String;
    //         array-length v3, v2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         aget-object v0, v2, v1
    //         :try_start_0
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "DROP TABLE IF EXISTS "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_1
    //         :cond_0
    //         return-void
    */

    public fun onCreate(p0: android.database.sqlite.SQLiteDatabase) { /* TODO(body): (Landroid/database/sqlite/SQLiteDatabase;)V */ }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->sSchemas:[[[Ljava/lang/String;
    //         array-length v2, v0
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_0
    //         :try_start_0
    //         sget-object v0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->sSchemas:[[[Ljava/lang/String;
    //         aget-object v0, v0, v1
    //         check-cast v0, [[Ljava/lang/String;
    //         sget-object v3, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->sTables:[Ljava/lang/String;
    //         aget-object v3, v3, v1
    //         invoke-direct {p0, v3, v0}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->createTableQueryFromArray(Ljava/lang/String;[[Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :goto_1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_1
    //         :cond_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    public fun onUpgrade(p0: android.database.sqlite.SQLiteDatabase, p1: Int, p2: Int) { /* TODO(body): (Landroid/database/sqlite/SQLiteDatabase;II)V */ }
    /*
    //         .locals 3
    //         const-class v0, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Upgrading database from version "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " to "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", which will destroy all old data"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->dropTables(Landroid/database/sqlite/SQLiteDatabase;)V
    //         invoke-virtual {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadsDB$DownloadsContentDBHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    //         return-void
    */

    companion object {
    private val sTables: Array<String> = null!!
    }
}
