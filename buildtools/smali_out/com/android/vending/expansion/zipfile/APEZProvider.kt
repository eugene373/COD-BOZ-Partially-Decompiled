package com.android.vending.expansion.zipfile

// Auto-emitted from smali source: APEZProvider.java.
// 21 fields, 13 methods.

open class APEZProvider: android.content.ContentProvider() {
    private var mAPKExtensionFile: com.android.vending.expansion.zipfile.ZipResourceFile
    private var mInit: Boolean

    public constructor()

    public fun applyBatch(p0: java.util.ArrayList): Array<android.content.ContentProviderResult> { return TODO("body: (Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Landroid/content/ContentProviderOperation;",
    //                 ">;)[",
    //                 "Landroid/content/ContentProviderResult;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/OperationApplicationException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/APEZProvider;->initIfNecessary()Z
    //         invoke-super {p0, p1}, Landroid/content/ContentProvider;->applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun delete(p0: android.net.Uri, p1: String, p2: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAuthority(): String

    public fun getType(p0: android.net.Uri): String { return TODO("body: (Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "vnd.android.cursor.item/asset"
    //         return-object v0
    */

    public fun initIfNecessary(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 9
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-boolean v0, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mInit:Z
    //         if-nez v0, :cond_4
    //         const-string v0, "APEZ"
    //         const-string v3, "InitLL"
    //         invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/APEZProvider;->getContext()Landroid/content/Context;
    //         move-result-object v5
    //         invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/APEZProvider;->getAuthority()Ljava/lang/String;
    //         move-result-object v3
    //         const/16 v4, 0x80
    //         invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //         move-result-object v6
    //         :try_start_0
    //         invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         iget v4, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    //         const/4 v0, 0x0
    //         iget-object v3, v6, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;
    //         if-eqz v3, :cond_2
    //         iget-object v3, v6, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;
    //         const-string v7, "mainVersion"
    //         invoke-virtual {v3, v7, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v3
    //         iget-object v7, v6, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;
    //         const-string v8, "patchVersion"
    //         invoke-virtual {v7, v8, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v4
    //         iget-object v7, v6, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;
    //         const-string v8, "mainFilename"
    //         invoke-virtual {v7, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v7
    //         sget-object v8, Lcom/android/vending/expansion/zipfile/APEZProvider;->NO_FILE:Ljava/lang/String;
    //         if-eq v8, v7, :cond_0
    //         iget-object v0, v6, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;
    //         const-string v6, "patchFilename"
    //         invoke-virtual {v0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         sget-object v0, Lcom/android/vending/expansion/zipfile/APEZProvider;->NO_FILE:Ljava/lang/String;
    //         if-eq v0, v6, :cond_1
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/String;
    //         aput-object v7, v0, v2
    //         aput-object v6, v0, v1
    //         :cond_0
    //         :goto_0
    //         if-nez v0, :cond_3
    //         :try_start_1
    //         invoke-static {v5, v3, v4}, Lcom/android/vending/expansion/zipfile/APKExpansionSupport;->getAPKExpansionZipFile(Landroid/content/Context;II)Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         :goto_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mInit:Z
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         move v0, v1
    //         :goto_2
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
    //         move v0, v2
    //         goto :goto_2
    //         :cond_1
    //         new-array v0, v1, [Ljava/lang/String;
    //         aput-object v7, v0, v2
    //         goto :goto_0
    //         :cond_2
    //         move v3, v4
    //         goto :goto_0
    //         :cond_3
    //         :try_start_2
    //         invoke-static {v0}, Lcom/android/vending/expansion/zipfile/APKExpansionSupport;->getResourceZipFile([Ljava/lang/String;)Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         :try_end_2
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    //         :cond_4
    //         move v0, v2
    //         goto :goto_2
    */

    public fun insert(p0: android.net.Uri, p1: android.content.ContentValues): android.net.Uri { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onCreate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun openAssetFile(p0: android.net.Uri, p1: String): android.content.res.AssetFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/APEZProvider;->initIfNecessary()Z
    //         invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         invoke-virtual {v1, v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->getAssetFileDescriptor(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v0
    //         return-object v0
    */

    public fun openFile(p0: android.net.Uri, p1: String): android.os.ParcelFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/APEZProvider;->initIfNecessary()Z
    //         invoke-virtual {p0, p1, p2}, Lcom/android/vending/expansion/zipfile/APEZProvider;->openAssetFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun query(p0: android.net.Uri, p1: Array<String>, p2: String, p3: Array<String>, p4: String): android.database.Cursor { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;") }
    /*
    //         .locals 12
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/zipfile/APEZProvider;->initIfNecessary()Z
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         move-object v3, v0
    //         :goto_0
    //         if-nez p2, :cond_2
    //         sget-object v0, Lcom/android/vending/expansion/zipfile/APEZProvider;->ALL_FIELDS_INT:[I
    //         sget-object p2, Lcom/android/vending/expansion/zipfile/APEZProvider;->ALL_FIELDS:[Ljava/lang/String;
    //         :cond_0
    //         new-instance v4, Landroid/database/MatrixCursor;
    //         array-length v1, v3
    //         invoke-direct {v4, p2, v1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V
    //         array-length v5, v0
    //         array-length v6, v3
    //         const/4 v1, 0x0
    //         move v2, v1
    //         :goto_1
    //         if-ge v2, v6, :cond_c
    //         aget-object v7, v3, v2
    //         invoke-virtual {v4}, Landroid/database/MatrixCursor;->newRow()Landroid/database/MatrixCursor$RowBuilder;
    //         move-result-object v8
    //         const/4 v1, 0x0
    //         :goto_2
    //         if-ge v1, v5, :cond_b
    //         aget v9, v0, v1
    //         packed-switch v9, :pswitch_data_0
    //         :goto_3
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_2
    //         :cond_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/zipfile/APEZProvider;->mAPKExtensionFile:Lcom/android/vending/expansion/zipfile/ZipResourceFile;
    //         invoke-virtual {v0}, Lcom/android/vending/expansion/zipfile/ZipResourceFile;->getAllEntries()[Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;
    //         move-result-object v0
    //         move-object v3, v0
    //         goto :goto_0
    //         :cond_2
    //         array-length v2, p2
    //         new-array v0, v2, [I
    //         const/4 v1, 0x0
    //         :goto_4
    //         if-ge v1, v2, :cond_0
    //         aget-object v4, p2, v1
    //         const-string v5, "_id"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         const/4 v4, 0x0
    //         aput v4, v0, v1
    //         :goto_5
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_4
    //         :cond_3
    //         aget-object v4, p2, v1
    //         const-string v5, "ZPFN"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_4
    //         const/4 v4, 0x1
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_4
    //         aget-object v4, p2, v1
    //         const-string v5, "ZFIL"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_5
    //         const/4 v4, 0x2
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_5
    //         aget-object v4, p2, v1
    //         const-string v5, "ZMOD"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_6
    //         const/4 v4, 0x3
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_6
    //         aget-object v4, p2, v1
    //         const-string v5, "ZCRC"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_7
    //         const/4 v4, 0x4
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_7
    //         aget-object v4, p2, v1
    //         const-string v5, "ZCOL"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_8
    //         const/4 v4, 0x5
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_8
    //         aget-object v4, p2, v1
    //         const-string v5, "ZUNL"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_9
    //         const/4 v4, 0x6
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_9
    //         aget-object v4, p2, v1
    //         const-string v5, "ZTYP"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_a
    //         const/4 v4, 0x7
    //         aput v4, v0, v1
    //         goto :goto_5
    //         :cond_a
    //         new-instance v0, Ljava/lang/RuntimeException;
    //         invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V
    //         throw v0
    //         :pswitch_0
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_1
    //         iget-object v9, v7, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mFileName:Ljava/lang/String;
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_2
    //         invoke-virtual {v7}, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->getZipFileName()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_3
    //         iget-wide v10, v7, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mWhenModified:J
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_4
    //         iget-wide v10, v7, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCRC32:J
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_5
    //         iget-wide v10, v7, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mCompressedLength:J
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_6
    //         iget-wide v10, v7, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mUncompressedLength:J
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :pswitch_7
    //         iget v9, v7, Lcom/android/vending/expansion/zipfile/ZipResourceFile$ZipEntryRO;->mMethod:I
    //         invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v9
    //         invoke-virtual {v8, v9}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
    //         goto/16 :goto_3
    //         :cond_b
    //         add-int/lit8 v1, v2, 0x1
    //         move v2, v1
    //         goto/16 :goto_1
    //         :cond_c
    //         return-object v4
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //         .end packed-switch
    */

    public fun update(p0: android.net.Uri, p1: android.content.ContentValues, p2: String, p3: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    companion object {
    @JvmField public val ALL_FIELDS: Array<String> = null!!
    @JvmField public val ALL_FIELDS_INT: IntArray = null!!
    @JvmField public val COMPLEN_IDX: Int = 0x5
    @JvmField public val COMPRESSEDLEN: String = "ZCOL"
    @JvmField public val COMPRESSIONTYPE: String = "ZTYP"
    @JvmField public val COMPTYPE_IDX: Int = 0x7
    @JvmField public val CRC32: String = "ZCRC"
    @JvmField public val CRC_IDX: Int = 0x4
    @JvmField public val FILEID: String = "_id"
    @JvmField public val FILEID_IDX: Int = 0x0
    @JvmField public val FILENAME: String = "ZPFN"
    @JvmField public val FILENAME_IDX: Int = 0x1
    @JvmField public val MODIFICATION: String = "ZMOD"
    @JvmField public val MOD_IDX: Int = 0x3
    private val NO_FILE: String = null!!
    @JvmField public val UNCOMPLEN_IDX: Int = 0x6
    @JvmField public val UNCOMPRESSEDLEN: String = "ZUNL"
    @JvmField public val ZIPFILE: String = "ZFIL"
    @JvmField public val ZIPFILE_IDX: Int = 0x2
    }
}
