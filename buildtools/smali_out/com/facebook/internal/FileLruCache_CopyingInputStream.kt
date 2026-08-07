package com.facebook.internal

// Auto-emitted from smali source: FileLruCache.java.
// 2 fields, 9 methods.

class FileLruCache_CopyingInputStream: java.io.InputStream() {
    val input: java.io.InputStream
    val output: java.io.OutputStream

    constructor(p0: java.io.InputStream, p1: java.io.OutputStream)

    public fun available(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;
    //         invoke-virtual {v0}, Ljava/io/InputStream;->available()I
    //         move-result v0
    //         return v0
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;
    //         invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;
    //         invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;
    //         invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    //         throw v0
    */

    public fun mark(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun markSupported(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun read(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;
    //         invoke-virtual {v0}, Ljava/io/InputStream;->read()I
    //         move-result v0
    //         if-ltz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;
    //         invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V
    //         :cond_0
    //         return v0
    */

    public fun read(p0: ByteArray): Int { return TODO("body: ([B)I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;
    //         invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, p1, v2, v0}, Ljava/io/OutputStream;->write([BII)V
    //         :cond_0
    //         return v0
    */

    public fun read(p0: ByteArray, p1: Int, p2: Int): Int { return TODO("body: ([BII)I") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;
    //         invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;
    //         invoke-virtual {v1, p1, p2, v0}, Ljava/io/OutputStream;->write([BII)V
    //         :cond_0
    //         return v0
    */

    public fun skip(p0: Long): Long { return TODO("body: (J)J") }
    /*
    //         .locals 9
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/16 v0, 0x400
    //         new-array v2, v0, [B
    //         const-wide/16 v0, 0x0
    //         :goto_0
    //         cmp-long v3, v0, p1
    //         if-gez v3, :cond_0
    //         const/4 v3, 0x0
    //         sub-long v4, p1, v0
    //         array-length v6, v2
    //         int-to-long v6, v6
    //         invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J
    //         move-result-wide v4
    //         long-to-int v4, v4
    //         invoke-virtual {p0, v2, v3, v4}, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->read([BII)I
    //         move-result v3
    //         if-gez v3, :cond_1
    //         :cond_0
    //         return-wide v0
    //         :cond_1
    //         int-to-long v4, v3
    //         add-long/2addr v0, v4
    //         goto :goto_0
    */

}
