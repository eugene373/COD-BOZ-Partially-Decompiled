package com.facebook.internal

// Auto-emitted from smali source: ImageResponseCache.java.
// 1 fields, 2 methods.

open class ImageResponseCache_BufferedHttpInputStream: java.io.BufferedInputStream() {
    var connection: java.net.HttpURLConnection

    constructor(p0: java.io.InputStream, p1: java.net.HttpURLConnection)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-super {p0}, Ljava/io/BufferedInputStream;->close()V
    //         iget-object v0, p0, Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;->connection:Ljava/net/HttpURLConnection;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V
    //         return-void
    */

}
