package com.facebook

// Auto-emitted from smali source: NativeAppCallAttachmentStore.java.
// 1 fields, 3 methods.

open class NativeAppCallAttachmentStore_Anon1: com.facebook.NativeAppCallAttachmentStore.ProcessAttachment {
    val this$0: com.facebook.NativeAppCallAttachmentStore

    constructor(p0: com.facebook.NativeAppCallAttachmentStore)

    public fun processAttachment(p0: android.graphics.Bitmap, p1: java.io.File) { /* TODO(body): (Landroid/graphics/Bitmap;Ljava/io/File;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/io/FileOutputStream;
    //         invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    //         :try_start_0
    //         sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
    //         const/16 v2, 0x64
    //         invoke-virtual {p1, v0, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    */

    public fun processAttachment(p0: Object, p1: java.io.File) { /* TODO(body): (Ljava/lang/Object;Ljava/io/File;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         check-cast p1, Landroid/graphics/Bitmap;
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/NativeAppCallAttachmentStore$1;->processAttachment(Landroid/graphics/Bitmap;Ljava/io/File;)V
    //         return-void
    */

}
