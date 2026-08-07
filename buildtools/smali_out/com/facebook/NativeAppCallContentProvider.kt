package com.facebook

// Auto-emitted from smali source: NativeAppCallContentProvider.java.
// 3 fields, 12 methods.

open class NativeAppCallContentProvider: android.content.ContentProvider() {
    private val dataSource: com.facebook.NativeAppCallContentProvider.AttachmentDataSource

    public constructor()

    constructor(p0: com.facebook.NativeAppCallContentProvider.AttachmentDataSource)

    public fun delete(p0: android.net.Uri, p1: String, p2: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getType(p0: android.net.Uri): String { return TODO("body: (Landroid/net/Uri;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
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

    public fun openFile(p0: android.net.Uri, p1: String): android.os.ParcelFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/facebook/NativeAppCallContentProvider;->parseCallIdAndAttachmentName(Landroid/net/Uri;)Landroid/util/Pair;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         new-instance v0, Ljava/io/FileNotFoundException;
    //         invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         iget-object v2, p0, Lcom/facebook/NativeAppCallContentProvider;->dataSource:Lcom/facebook/NativeAppCallContentProvider$AttachmentDataSource;
    //         iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;
    //         check-cast v0, Ljava/util/UUID;
    //         iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v2, v0, v1}, Lcom/facebook/NativeAppCallContentProvider$AttachmentDataSource;->openAttachment(Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;
    //         move-result-object v0
    //         const/high16 v1, 0x10000000
    //         invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/facebook/NativeAppCallContentProvider;->TAG:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Got unexpected exception:"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         throw v0
    */

    fun parseCallIdAndAttachmentName(p0: android.net.Uri): android.util.Pair { return TODO("body: (Landroid/net/Uri;)Landroid/util/Pair;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/net/Uri;",
    //                 ")",
    //                 "Landroid/util/Pair",
    //                 "<",
    //                 "Ljava/util/UUID;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         aget-object v1, v0, v1
    //         const/4 v2, 0x1
    //         aget-object v2, v0, v2
    //         invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    //         move-result-object v1
    //         new-instance v0, Landroid/util/Pair;
    //         invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun query(p0: android.net.Uri, p1: Array<String>, p2: String, p3: Array<String>, p4: String): android.database.Cursor { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun update(p0: android.net.Uri, p1: android.content.ContentValues, p2: String, p3: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    companion object {
    private val ATTACHMENT_URL_BASE: String = "content://com.facebook.app.NativeAppCallContentProvider"
    private val TAG: String = null!!

    public @JvmStatic fun getAttachmentUrl(p0: String, p1: java.util.UUID, p2: String): String { return TODO("body: (Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "%s%s/%s/%s"
    //         const/4 v1, 0x4
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         const-string v3, "content://com.facebook.app.NativeAppCallContentProvider"
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         aput-object p0, v1, v2
    //         const/4 v2, 0x2
    //         invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         aput-object p2, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
