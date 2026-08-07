package android.support.v4.content

// Auto-emitted from smali source: FileProvider.java.
// 11 fields, 17 methods.

open class FileProvider: android.content.ContentProvider() {
    private var mStrategy: android.support.v4.content.FileProvider.PathStrategy

    public constructor()

    public fun attachInfo(context: android.content.Context, info: android.content.pm.ProviderInfo) { /* TODO(body): (Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    //         iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/SecurityException;
    //         const-string v1, "Provider must not be exported"
    //         invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/SecurityException;
    //         const-string v1, "Provider must grant uri permissions"
    //         invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;
    //         invoke-static {p1, v0}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
    //         return-void
    */

    public fun delete(uri: android.net.Uri, selection: String, selectionArgs: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
    //         invoke-interface {v1, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
    //         move-result-object v0
    //         .local v0, "file":Ljava/io/File;
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getType(uri: android.net.Uri): String { return TODO("body: (Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         iget-object v4, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
    //         invoke-interface {v4, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
    //         move-result-object v1
    //         .local v1, "file":Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         const/16 v5, 0x2e
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I
    //         move-result v2
    //         .local v2, "lastDot":I
    //         if-ltz v2, :cond_0
    //         invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         add-int/lit8 v5, v2, 0x1
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "extension":Ljava/lang/String;
    //         invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "mime":Ljava/lang/String;
    //         if-eqz v3, :cond_0
    //         .end local v0    # "extension":Ljava/lang/String;
    //         .end local v3    # "mime":Ljava/lang/String;
    //         :goto_0
    //         return-object v3
    //         :cond_0
    //         const-string v3, "application/octet-stream"
    //         goto :goto_0
    */

    public fun insert(uri: android.net.Uri, values: android.content.ContentValues): android.net.Uri { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "No external inserts"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun onCreate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun openFile(uri: android.net.Uri, mode: String): android.os.ParcelFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 3
    //         iget-object v2, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
    //         invoke-interface {v2, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
    //         move-result-object v0
    //         .local v0, "file":Ljava/io/File;
    //         invoke-static {p2}, Landroid/support/v4/content/FileProvider;->modeToMode(Ljava/lang/String;)I
    //         move-result v1
    //         .local v1, "fileMode":I
    //         invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v2
    //         return-object v2
    */

    public fun query(uri: android.net.Uri, projection: Array<String>, selection: String, selectionArgs: Array<String>, sortOrder: String): android.database.Cursor { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;") }
    /*
    //         .locals 12
    //         iget-object v10, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
    //         invoke-interface {v10, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
    //         move-result-object v4
    //         .local v4, "file":Ljava/io/File;
    //         if-nez p2, :cond_0
    //         sget-object p2, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;
    //         :cond_0
    //         array-length v10, p2
    //         new-array v2, v10, [Ljava/lang/String;
    //         .local v2, "cols":[Ljava/lang/String;
    //         array-length v10, p2
    //         new-array v9, v10, [Ljava/lang/Object;
    //         .local v9, "values":[Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         .local v5, "i":I
    //         move-object v0, p2
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v8, v0
    //         .local v8, "len$":I
    //         const/4 v7, 0x0
    //         .local v7, "i$":I
    //         move v6, v5
    //         .end local v5    # "i":I
    //         .local v6, "i":I
    //         :goto_0
    //         if-ge v7, v8, :cond_2
    //         aget-object v1, v0, v7
    //         .local v1, "col":Ljava/lang/String;
    //         const-string v10, "_display_name"
    //         invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v10
    //         if-eqz v10, :cond_1
    //         const-string v10, "_display_name"
    //         aput-object v10, v2, v6
    //         add-int/lit8 v5, v6, 0x1
    //         .end local v6    # "i":I
    //         .restart local v5    # "i":I
    //         invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v10
    //         aput-object v10, v9, v6
    //         :goto_1
    //         add-int/lit8 v7, v7, 0x1
    //         move v6, v5
    //         .end local v5    # "i":I
    //         .restart local v6    # "i":I
    //         goto :goto_0
    //         :cond_1
    //         const-string v10, "_size"
    //         invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v10
    //         if-eqz v10, :cond_3
    //         const-string v10, "_size"
    //         aput-object v10, v2, v6
    //         add-int/lit8 v5, v6, 0x1
    //         .end local v6    # "i":I
    //         .restart local v5    # "i":I
    //         invoke-virtual {v4}, Ljava/io/File;->length()J
    //         move-result-wide v10
    //         invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v10
    //         aput-object v10, v9, v6
    //         goto :goto_1
    //         .end local v1    # "col":Ljava/lang/String;
    //         .end local v5    # "i":I
    //         .restart local v6    # "i":I
    //         :cond_2
    //         invoke-static {v2, v6}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/String;I)[Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v9, v6}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
    //         move-result-object v9
    //         new-instance v3, Landroid/database/MatrixCursor;
    //         const/4 v10, 0x1
    //         invoke-direct {v3, v2, v10}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V
    //         .local v3, "cursor":Landroid/database/MatrixCursor;
    //         invoke-virtual {v3, v9}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
    //         return-object v3
    //         .end local v3    # "cursor":Landroid/database/MatrixCursor;
    //         .restart local v1    # "col":Ljava/lang/String;
    //         :cond_3
    //         move v5, v6
    //         .end local v6    # "i":I
    //         .restart local v5    # "i":I
    //         goto :goto_1
    */

    public fun update(uri: android.net.Uri, values: android.content.ContentValues, selection: String, selectionArgs: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "No external updates"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    companion object {
    private val ATTR_NAME: String = "name"
    private val ATTR_PATH: String = "path"
    private val COLUMNS: Array<String> = null!!
    private val DEVICE_ROOT: java.io.File = null!!
    private val META_DATA_FILE_PROVIDER_PATHS: String = "android.support.FILE_PROVIDER_PATHS"
    private val TAG_CACHE_PATH: String = "cache-path"
    private val TAG_EXTERNAL: String = "external-path"
    private val TAG_FILES_PATH: String = "files-path"
    private val TAG_ROOT_PATH: String = "root-path"
    private var sCache: java.util.HashMap

    private @JvmStatic fun buildPath(base: java.io.File, segments: Array<String>): java.io.File { return TODO("body: (Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;") }
    /*
    //         .locals 6
    //         move-object v1, p0
    //         .local v1, "cur":Ljava/io/File;
    //         move-object v0, p1
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v4, v0
    //         .local v4, "len$":I
    //         const/4 v3, 0x0
    //         .local v3, "i$":I
    //         move-object v2, v1
    //         .end local v1    # "cur":Ljava/io/File;
    //         .local v2, "cur":Ljava/io/File;
    //         :goto_0
    //         if-ge v3, v4, :cond_0
    //         aget-object v5, v0, v3
    //         .local v5, "segment":Ljava/lang/String;
    //         if-eqz v5, :cond_1
    //         new-instance v1, Ljava/io/File;
    //         invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         .end local v2    # "cur":Ljava/io/File;
    //         .restart local v1    # "cur":Ljava/io/File;
    //         :goto_1
    //         add-int/lit8 v3, v3, 0x1
    //         move-object v2, v1
    //         .end local v1    # "cur":Ljava/io/File;
    //         .restart local v2    # "cur":Ljava/io/File;
    //         goto :goto_0
    //         .end local v5    # "segment":Ljava/lang/String;
    //         :cond_0
    //         return-object v2
    //         .restart local v5    # "segment":Ljava/lang/String;
    //         :cond_1
    //         move-object v1, v2
    //         .end local v2    # "cur":Ljava/io/File;
    //         .restart local v1    # "cur":Ljava/io/File;
    //         goto :goto_1
    */

    private @JvmStatic fun copyOf(original: Array<Object>, newLength: Int): Array<Object> { return TODO("body: ([Ljava/lang/Object;I)[Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-array v0, p1, [Ljava/lang/Object;
    //         .local v0, "result":[Ljava/lang/Object;
    //         invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         return-object v0
    */

    private @JvmStatic fun copyOf(original: Array<String>, newLength: Int): Array<String> { return TODO("body: ([Ljava/lang/String;I)[Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-array v0, p1, [Ljava/lang/String;
    //         .local v0, "result":[Ljava/lang/String;
    //         invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    //         return-object v0
    */

    private @JvmStatic fun getPathStrategy(context: android.content.Context, authority: String): android.support.v4.content.FileProvider.PathStrategy { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;") }
    /*
    //         .locals 5
    //         sget-object v3, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
    //         monitor-enter v3
    //         :try_start_0
    //         sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
    //         invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Landroid/support/v4/content/FileProvider$PathStrategy;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .local v1, "strat":Landroid/support/v4/content/FileProvider$PathStrategy;
    //         if-nez v1, :cond_0
    //         :try_start_1
    //         invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result-object v1
    //         :try_start_2
    //         sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
    //         invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         monitor-exit v3
    //         return-object v1
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/io/IOException;
    //         new-instance v2, Ljava/lang/IllegalArgumentException;
    //         const-string v4, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
    //         invoke-direct {v2, v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         .end local v0    # "e":Ljava/io/IOException;
    //         .end local v1    # "strat":Landroid/support/v4/content/FileProvider$PathStrategy;
    //         :catchall_0
    //         move-exception v2
    //         monitor-exit v3
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v2
    //         .restart local v1    # "strat":Landroid/support/v4/content/FileProvider$PathStrategy;
    //         :catch_1
    //         move-exception v0
    //         .local v0, "e":Lorg/xmlpull/v1/XmlPullParserException;
    //         :try_start_3
    //         new-instance v2, Ljava/lang/IllegalArgumentException;
    //         const-string v4, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
    //         invoke-direct {v2, v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v2
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    */

    public @JvmStatic fun getUriForFile(context: android.content.Context, authority: String, file: java.io.File): android.net.Uri { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
    //         move-result-object v0
    //         .local v0, "strategy":Landroid/support/v4/content/FileProvider$PathStrategy;
    //         invoke-interface {v0, p2}, Landroid/support/v4/content/FileProvider$PathStrategy;->getUriForFile(Ljava/io/File;)Landroid/net/Uri;
    //         move-result-object v1
    //         return-object v1
    */

    private @JvmStatic fun modeToMode(mode: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 4
    //         const-string v1, "r"
    //         invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/high16 v0, 0x10000000
    //         .local v0, "modeBits":I
    //         :goto_0
    //         return v0
    //         .end local v0    # "modeBits":I
    //         :cond_0
    //         const-string v1, "w"
    //         invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const-string v1, "wt"
    //         invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         :cond_1
    //         const/high16 v0, 0x2c000000
    //         .restart local v0    # "modeBits":I
    //         goto :goto_0
    //         .end local v0    # "modeBits":I
    //         :cond_2
    //         const-string v1, "wa"
    //         invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         const/high16 v0, 0x2a000000
    //         .restart local v0    # "modeBits":I
    //         goto :goto_0
    //         .end local v0    # "modeBits":I
    //         :cond_3
    //         const-string v1, "rw"
    //         invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         const/high16 v0, 0x38000000
    //         .restart local v0    # "modeBits":I
    //         goto :goto_0
    //         .end local v0    # "modeBits":I
    //         :cond_4
    //         const-string v1, "rwt"
    //         invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         const/high16 v0, 0x3c000000    # 0.0078125f
    //         .restart local v0    # "modeBits":I
    //         goto :goto_0
    //         .end local v0    # "modeBits":I
    //         :cond_5
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Invalid mode: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    private @JvmStatic fun parsePathStrategy(context: android.content.Context, authority: String): android.support.v4.content.FileProvider.PathStrategy { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;") }
    /*
    //         .locals 13
    //         const/4 v12, 0x0
    //         const/4 v11, 0x0
    //         const/4 v10, 0x1
    //         new-instance v4, Landroid/support/v4/content/FileProvider$SimplePathStrategy;
    //         invoke-direct {v4, p1}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;-><init>(Ljava/lang/String;)V
    //         .local v4, "strat":Landroid/support/v4/content/FileProvider$SimplePathStrategy;
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v8
    //         const/16 v9, 0x80
    //         invoke-virtual {v8, p1, v9}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //         move-result-object v1
    //         .local v1, "info":Landroid/content/pm/ProviderInfo;
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v8
    //         const-string v9, "android.support.FILE_PROVIDER_PATHS"
    //         invoke-virtual {v1, v8, v9}, Landroid/content/pm/ProviderInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
    //         move-result-object v0
    //         .local v0, "in":Landroid/content/res/XmlResourceParser;
    //         if-nez v0, :cond_0
    //         new-instance v8, Ljava/lang/IllegalArgumentException;
    //         const-string v9, "Missing android.support.FILE_PROVIDER_PATHS meta-data"
    //         invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v8
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->next()I
    //         move-result v7
    //         .local v7, "type":I
    //         if-eq v7, v10, :cond_5
    //         const/4 v8, 0x2
    //         if-ne v7, v8, :cond_0
    //         invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         .local v5, "tag":Ljava/lang/String;
    //         const-string v8, "name"
    //         invoke-interface {v0, v12, v8}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         .local v2, "name":Ljava/lang/String;
    //         const-string v8, "path"
    //         invoke-interface {v0, v12, v8}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "path":Ljava/lang/String;
    //         const/4 v6, 0x0
    //         .local v6, "target":Ljava/io/File;
    //         const-string v8, "root-path"
    //         invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v8
    //         if-eqz v8, :cond_2
    //         sget-object v8, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;
    //         new-array v9, v10, [Ljava/lang/String;
    //         aput-object v3, v9, v11
    //         invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v6
    //         :cond_1
    //         :goto_1
    //         if-eqz v6, :cond_0
    //         invoke-virtual {v4, v2, v6}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->addRoot(Ljava/lang/String;Ljava/io/File;)V
    //         goto :goto_0
    //         :cond_2
    //         const-string v8, "files-path"
    //         invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v8
    //         if-eqz v8, :cond_3
    //         invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
    //         move-result-object v8
    //         new-array v9, v10, [Ljava/lang/String;
    //         aput-object v3, v9, v11
    //         invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v6
    //         goto :goto_1
    //         :cond_3
    //         const-string v8, "cache-path"
    //         invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v8
    //         if-eqz v8, :cond_4
    //         invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
    //         move-result-object v8
    //         new-array v9, v10, [Ljava/lang/String;
    //         aput-object v3, v9, v11
    //         invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v6
    //         goto :goto_1
    //         :cond_4
    //         const-string v8, "external-path"
    //         invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v8
    //         if-eqz v8, :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v8
    //         new-array v9, v10, [Ljava/lang/String;
    //         aput-object v3, v9, v11
    //         invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v6
    //         goto :goto_1
    //         .end local v2    # "name":Ljava/lang/String;
    //         .end local v3    # "path":Ljava/lang/String;
    //         .end local v5    # "tag":Ljava/lang/String;
    //         .end local v6    # "target":Ljava/io/File;
    //         :cond_5
    //         return-object v4
    */

    }
}
