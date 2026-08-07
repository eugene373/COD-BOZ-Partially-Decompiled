package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 2 fields, 6 methods.

open class FileLruCache_CloseCallbackOutputStream: java.io.OutputStream() {
    val callback: com.facebook.internal.FileLruCache.StreamCloseCallback
    val innerStream: java.io.OutputStream

    constructor(p0: java.io.OutputStream, p1: com.facebook.internal.FileLruCache.StreamCloseCallback)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->innerStream:Ljava/io/OutputStream;
    //         invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->callback:Lcom/facebook/internal/FileLruCache$StreamCloseCallback;
    //         invoke-interface {v0}, Lcom/facebook/internal/FileLruCache$StreamCloseCallback;->onClose()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->callback:Lcom/facebook/internal/FileLruCache$StreamCloseCallback;
    //         invoke-interface {v1}, Lcom/facebook/internal/FileLruCache$StreamCloseCallback;->onClose()V
    //         throw v0
    */

    public fun flush() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->innerStream:Ljava/io/OutputStream;
    //         invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    //         return-void
    */

    public fun write(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->innerStream:Ljava/io/OutputStream;
    //         invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    //         return-void
    */

    public fun write(p0: ByteArray) { /* TODO(body): ([B)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->innerStream:Ljava/io/OutputStream;
    //         invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    //         return-void
    */

    public fun write(p0: ByteArray, p1: Int, p2: Int) { /* TODO(body): ([BII)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;->innerStream:Ljava/io/OutputStream;
    //         invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    //         return-void
    */

}
