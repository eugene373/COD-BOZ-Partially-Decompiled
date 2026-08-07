package com.facebook

// Auto-emitted from smali source: NativeAppCallAttachmentStore.java.
// 3 fields, 11 methods.

class NativeAppCallAttachmentStore: com.facebook.NativeAppCallContentProvider.AttachmentDataSource {
    public constructor()

    private fun addAttachments(p0: android.content.Context, p1: java.util.UUID, p2: java.util.Map, p3: com.facebook.NativeAppCallAttachmentStore.ProcessAttachment) { /* TODO(body): (Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;Lcom/facebook/NativeAppCallAttachmentStore$ProcessAttachment;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Landroid/content/Context;",
    //                 "Ljava/util/UUID;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "TT;>;",
    //                 "Lcom/facebook/NativeAppCallAttachmentStore$ProcessAttachment",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p3}, Ljava/util/Map;->size()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/facebook/NativeAppCallAttachmentStore;->attachmentsDirectory:Ljava/io/File;
    //         if-nez v0, :cond_2
    //         invoke-virtual {p0, p1}, Lcom/facebook/NativeAppCallAttachmentStore;->cleanupAllAttachments(Landroid/content/Context;)V
    //         :cond_2
    //         invoke-virtual {p0, p1}, Lcom/facebook/NativeAppCallAttachmentStore;->ensureAttachmentsDirectoryExists(Landroid/content/Context;)Ljava/io/File;
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         :try_start_0
    //         invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         const/4 v4, 0x1
    //         invoke-virtual {p0, p2, v1, v4}, Lcom/facebook/NativeAppCallAttachmentStore;->getAttachmentFile(Ljava/util/UUID;Ljava/lang/String;Z)Ljava/io/File;
    //         move-result-object v1
    //         invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         invoke-interface {p4, v0, v1}, Lcom/facebook/NativeAppCallAttachmentStore$ProcessAttachment;->processAttachment(Ljava/lang/Object;Ljava/io/File;)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v0
    //         sget-object v0, Lcom/facebook/NativeAppCallAttachmentStore;->TAG:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Got unexpected exception:"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/io/File;
    //         :try_start_1
    //         invoke-virtual {v0}, Ljava/io/File;->delete()Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         goto :goto_1
    //         :cond_3
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         throw v0
    */

    public fun addAttachmentFilesForCall(p0: android.content.Context, p1: java.util.UUID, p2: java.util.Map) { /* TODO(body): (Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Ljava/util/UUID;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/io/File;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "context"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "callId"
    //         invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         const-string v1, "mediaAttachmentFiles"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V
    //         invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         const-string v1, "mediaAttachmentFiles"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->containsNoNullOrEmpty(Ljava/util/Collection;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/NativeAppCallAttachmentStore$2;
    //         invoke-direct {v0, p0}, Lcom/facebook/NativeAppCallAttachmentStore$2;-><init>(Lcom/facebook/NativeAppCallAttachmentStore;)V
    //         invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/NativeAppCallAttachmentStore;->addAttachments(Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;Lcom/facebook/NativeAppCallAttachmentStore$ProcessAttachment;)V
    //         return-void
    */

    public fun addAttachmentsForCall(p0: android.content.Context, p1: java.util.UUID, p2: java.util.Map) { /* TODO(body): (Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Ljava/util/UUID;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Landroid/graphics/Bitmap;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "context"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "callId"
    //         invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         const-string v1, "imageAttachments"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V
    //         invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         const-string v1, "imageAttachments"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->containsNoNullOrEmpty(Ljava/util/Collection;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/NativeAppCallAttachmentStore$1;
    //         invoke-direct {v0, p0}, Lcom/facebook/NativeAppCallAttachmentStore$1;-><init>(Lcom/facebook/NativeAppCallAttachmentStore;)V
    //         invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/NativeAppCallAttachmentStore;->addAttachments(Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;Lcom/facebook/NativeAppCallAttachmentStore$ProcessAttachment;)V
    //         return-void
    */

    fun cleanupAllAttachments(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/facebook/NativeAppCallAttachmentStore;->getAttachmentsDirectory(Landroid/content/Context;)Ljava/io/File;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->deleteDirectory(Ljava/io/File;)V
    //         return-void
    */

    public fun cleanupAttachmentsForCall(p0: android.content.Context, p1: java.util.UUID) { /* TODO(body): (Landroid/content/Context;Ljava/util/UUID;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p2, v0}, Lcom/facebook/NativeAppCallAttachmentStore;->getAttachmentsDirectoryForCall(Ljava/util/UUID;Z)Ljava/io/File;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->deleteDirectory(Ljava/io/File;)V
    //         return-void
    */

    fun ensureAttachmentsDirectoryExists(p0: android.content.Context): java.io.File { return TODO("body: (Landroid/content/Context;)Ljava/io/File;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/facebook/NativeAppCallAttachmentStore;->getAttachmentsDirectory(Landroid/content/Context;)Ljava/io/File;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    //         return-object v0
    */

    fun getAttachmentFile(p0: java.util.UUID, p1: String, p2: Boolean): java.io.File { return TODO("body: (Ljava/util/UUID;Ljava/lang/String;Z)Ljava/io/File;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p3}, Lcom/facebook/NativeAppCallAttachmentStore;->getAttachmentsDirectoryForCall(Ljava/util/UUID;Z)Ljava/io/File;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         new-instance v1, Ljava/io/File;
    //         const-string v3, "UTF-8"
    //         invoke-static {p2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    fun getAttachmentsDirectoryForCall(p0: java.util.UUID, p1: Boolean): java.io.File { return TODO("body: (Ljava/util/UUID;Z)Ljava/io/File;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/facebook/NativeAppCallAttachmentStore;->attachmentsDirectory:Ljava/io/File;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         new-instance v0, Ljava/io/File;
    //         sget-object v1, Lcom/facebook/NativeAppCallAttachmentStore;->attachmentsDirectory:Ljava/io/File;
    //         invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    //         if-eqz p2, :cond_0
    //         invoke-virtual {v0}, Ljava/io/File;->exists()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    //         goto :goto_0
    */

    public fun openAttachment(p0: java.util.UUID, p1: String): java.io.File { return TODO("body: (Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/io/FileNotFoundException;
    //         invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/NativeAppCallAttachmentStore;->getAttachmentFile(Ljava/util/UUID;Ljava/lang/String;Z)Ljava/io/File;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/FileNotFoundException;
    //         invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V
    //         throw v0
    */

    companion object {
    val ATTACHMENTS_DIR_NAME: String = "com.facebook.NativeAppCallAttachmentStore.files"
    private val TAG: String = null!!
    private var attachmentsDirectory: java.io.File
    }
}
