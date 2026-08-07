package com.facebook

// Auto-emitted from smali source: NativeAppCallAttachmentStore.java.
// 1 fields, 3 methods.

open class NativeAppCallAttachmentStore_Anon2: com.facebook.NativeAppCallAttachmentStore.ProcessAttachment {
    val this$0: com.facebook.NativeAppCallAttachmentStore

    constructor(p0: com.facebook.NativeAppCallAttachmentStore)

    public fun processAttachment(p0: java.io.File, p1: java.io.File) { /* TODO(body): (Ljava/io/File;Ljava/io/File;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v3, Ljava/io/FileOutputStream;
    //         invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    //         const/4 v2, 0x0
    //         :try_start_0
    //         new-instance v1, Ljava/io/FileInputStream;
    //         invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_1
    //         const/16 v0, 0x400
    //         :try_start_1
    //         new-array v0, v0, [B
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I
    //         move-result v2
    //         if-lez v2, :cond_0
    //         const/4 v4, 0x0
    //         invoke-virtual {v3, v0, v4, v2}, Ljava/io/FileOutputStream;->write([BII)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :goto_1
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :cond_0
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         return-void
    //         :catchall_1
    //         move-exception v0
    //         move-object v1, v2
    //         goto :goto_1
    */

    public fun processAttachment(p0: Object, p1: java.io.File) { /* TODO(body): (Ljava/lang/Object;Ljava/io/File;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         check-cast p1, Ljava/io/File;
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/NativeAppCallAttachmentStore$2;->processAttachment(Ljava/io/File;Ljava/io/File;)V
    //         return-void
    */

}
