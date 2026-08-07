package android.support.v4.provider

// Auto-emitted from smali source: DocumentsContractApi19.java.
// 1 fields, 17 methods.

open class DocumentsContractApi19 {
    constructor()

    companion object {
    private val TAG: String = "DocumentFile"

    public @JvmStatic fun canRead(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v1}, Landroid/content/Context;->checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-static {p0, p1}, Landroid/support/v4/provider/DocumentsContractApi19;->getRawType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun canWrite(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 5
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         const/4 v4, 0x2
    //         invoke-virtual {p0, p1, v4}, Landroid/content/Context;->checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v2
    //         :cond_1
    //         invoke-static {p0, p1}, Landroid/support/v4/provider/DocumentsContractApi19;->getRawType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "type":Ljava/lang/String;
    //         const-string v4, "flags"
    //         invoke-static {p0, p1, v4, v2}, Landroid/support/v4/provider/DocumentsContractApi19;->queryForInt(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;I)I
    //         move-result v0
    //         .local v0, "flags":I
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         and-int/lit8 v4, v0, 0x4
    //         if-eqz v4, :cond_2
    //         move v2, v3
    //         goto :goto_0
    //         :cond_2
    //         const-string v4, "vnd.android.document/directory"
    //         invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         and-int/lit8 v4, v0, 0x8
    //         if-eqz v4, :cond_3
    //         move v2, v3
    //         goto :goto_0
    //         :cond_3
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         and-int/lit8 v4, v0, 0x2
    //         if-eqz v4, :cond_0
    //         move v2, v3
    //         goto :goto_0
    */

    private @JvmStatic fun closeQuietly(closeable: AutoCloseable) { /* TODO(body): (Ljava/lang/AutoCloseable;)V */ }
    /*
    //         .locals 2
    //         if-eqz p0, :cond_0
    //         :try_start_0
    //         invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    //         :try_end_0
    //         .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "rethrown":Ljava/lang/RuntimeException;
    //         throw v0
    //         .end local v0    # "rethrown":Ljava/lang/RuntimeException;
    //         :catch_1
    //         move-exception v1
    //         goto :goto_0
    */

    public @JvmStatic fun delete(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         invoke-static {v0, p1}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun exists(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 10
    //         const/4 v8, 0x1
    //         const/4 v9, 0x0
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         .local v0, "resolver":Landroid/content/ContentResolver;
    //         const/4 v6, 0x0
    //         .local v6, "c":Landroid/database/Cursor;
    //         const/4 v1, 0x1
    //         :try_start_0
    //         new-array v2, v1, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         const-string v3, "document_id"
    //         aput-object v3, v2, v1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         move-object v1, p1
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v6
    //         invoke-interface {v6}, Landroid/database/Cursor;->getCount()I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v1
    //         if-lez v1, :cond_0
    //         move v1, v8
    //         :goto_0
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         :goto_1
    //         return v1
    //         :cond_0
    //         move v1, v9
    //         goto :goto_0
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Ljava/lang/Exception;
    //         :try_start_1
    //         const-string v1, "DocumentFile"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Failed query: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         move v1, v9
    //         goto :goto_1
    //         .end local v7    # "e":Ljava/lang/Exception;
    //         :catchall_0
    //         move-exception v1
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         throw v1
    */

    public @JvmStatic fun getName(context: android.content.Context, self: android.net.Uri): String { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "_display_name"
    //         const/4 v1, 0x0
    //         invoke-static {p0, p1, v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->queryForString(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun getRawType(context: android.content.Context, self: android.net.Uri): String { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "mime_type"
    //         const/4 v1, 0x0
    //         invoke-static {p0, p1, v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->queryForString(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getType(context: android.content.Context, self: android.net.Uri): String { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Landroid/support/v4/provider/DocumentsContractApi19;->getRawType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "rawType":Ljava/lang/String;
    //         const-string v1, "vnd.android.document/directory"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x0
    //         .end local v0    # "rawType":Ljava/lang/String;
    //         :cond_0
    //         return-object v0
    */

    public @JvmStatic fun isDirectory(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 2
    //         const-string v0, "vnd.android.document/directory"
    //         invoke-static {p0, p1}, Landroid/support/v4/provider/DocumentsContractApi19;->getRawType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isDocumentUri(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isFile(context: android.content.Context, self: android.net.Uri): Boolean { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Landroid/support/v4/provider/DocumentsContractApi19;->getRawType(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "type":Ljava/lang/String;
    //         const-string v1, "vnd.android.document/directory"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         const/4 v1, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun lastModified(context: android.content.Context, self: android.net.Uri): Long { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)J") }
    /*
    //         .locals 4
    //         const-string v0, "last_modified"
    //         const-wide/16 v2, 0x0
    //         invoke-static {p0, p1, v0, v2, v3}, Landroid/support/v4/provider/DocumentsContractApi19;->queryForLong(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun length(context: android.content.Context, self: android.net.Uri): Long { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)J") }
    /*
    //         .locals 4
    //         const-string v0, "_size"
    //         const-wide/16 v2, 0x0
    //         invoke-static {p0, p1, v0, v2, v3}, Landroid/support/v4/provider/DocumentsContractApi19;->queryForLong(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J
    //         move-result-wide v0
    //         return-wide v0
    */

    private @JvmStatic fun queryForInt(context: android.content.Context, self: android.net.Uri, column: String, defaultValue: Int): Int { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;I)I") }
    /*
    //         .locals 2
    //         int-to-long v0, p3
    //         invoke-static {p0, p1, p2, v0, v1}, Landroid/support/v4/provider/DocumentsContractApi19;->queryForLong(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J
    //         move-result-wide v0
    //         long-to-int v0, v0
    //         return v0
    */

    private @JvmStatic fun queryForLong(context: android.content.Context, self: android.net.Uri, column: String, defaultValue: Long): Long { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J") }
    /*
    //         .locals 9
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         .local v0, "resolver":Landroid/content/ContentResolver;
    //         const/4 v6, 0x0
    //         .local v6, "c":Landroid/database/Cursor;
    //         const/4 v1, 0x1
    //         :try_start_0
    //         new-array v2, v1, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         aput-object p2, v2, v1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         move-object v1, p1
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v6
    //         invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x0
    //         invoke-interface {v6, v1}, Landroid/database/Cursor;->isNull(I)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x0
    //         invoke-interface {v6, v1}, Landroid/database/Cursor;->getLong(I)J
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-wide p3
    //         .end local p3    # "defaultValue":J
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         :goto_0
    //         return-wide p3
    //         .restart local p3    # "defaultValue":J
    //         :cond_0
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Ljava/lang/Exception;
    //         :try_start_1
    //         const-string v1, "DocumentFile"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Failed query: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         goto :goto_0
    //         .end local v7    # "e":Ljava/lang/Exception;
    //         :catchall_0
    //         move-exception v1
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         throw v1
    */

    private @JvmStatic fun queryForString(context: android.content.Context, self: android.net.Uri, column: String, defaultValue: String): String { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 8
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         .local v0, "resolver":Landroid/content/ContentResolver;
    //         const/4 v6, 0x0
    //         .local v6, "c":Landroid/database/Cursor;
    //         const/4 v1, 0x1
    //         :try_start_0
    //         new-array v2, v1, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         aput-object p2, v2, v1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         move-object v1, p1
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         move-result-object v6
    //         invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v1, 0x0
    //         invoke-interface {v6, v1}, Landroid/database/Cursor;->isNull(I)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x0
    //         invoke-interface {v6, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object p3
    //         .end local p3    # "defaultValue":Ljava/lang/String;
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         :goto_0
    //         return-object p3
    //         .restart local p3    # "defaultValue":Ljava/lang/String;
    //         :cond_0
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Ljava/lang/Exception;
    //         :try_start_1
    //         const-string v1, "DocumentFile"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Failed query: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         goto :goto_0
    //         .end local v7    # "e":Ljava/lang/Exception;
    //         :catchall_0
    //         move-exception v1
    //         invoke-static {v6}, Landroid/support/v4/provider/DocumentsContractApi19;->closeQuietly(Ljava/lang/AutoCloseable;)V
    //         throw v1
    */

    }
}
