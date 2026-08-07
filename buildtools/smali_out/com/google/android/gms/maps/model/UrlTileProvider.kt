package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class UrlTileProvider: com.google.android.gms.maps.model.TileProvider {
    private val lf: Int
    private val lg: Int

    public constructor(width: Int, height: Int)

    public fun getTile(x: Int, y: Int, zoom: Int): com.google.android.gms.maps.model.Tile { return TODO("body: (III)Lcom/google/android/gms/maps/model/Tile;") }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/maps/model/UrlTileProvider;->getTileUrl(III)Ljava/net/URL;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         sget-object v0, Lcom/google/android/gms/maps/model/UrlTileProvider;->NO_TILE:Lcom/google/android/gms/maps/model/Tile;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/Tile;
    //         iget v2, p0, Lcom/google/android/gms/maps/model/UrlTileProvider;->lf:I
    //         iget v3, p0, Lcom/google/android/gms/maps/model/UrlTileProvider;->lg:I
    //         invoke-virtual {v1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/maps/model/UrlTileProvider;->e(Ljava/io/InputStream;)[B
    //         move-result-object v1
    //         invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/maps/model/Tile;-><init>(II[B)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getTileUrl(p0: Int, p1: Int, p2: Int): java.net.URL

    companion object {
    private @JvmStatic fun a(p0: java.io.InputStream, p1: java.io.OutputStream): Long { return TODO("body: (Ljava/io/InputStream;Ljava/io/OutputStream;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/16 v0, 0x1000
    //         new-array v2, v0, [B
    //         const-wide/16 v0, 0x0
    //         :goto_0
    //         invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I
    //         move-result v3
    //         const/4 v4, -0x1
    //         if-ne v3, v4, :cond_0
    //         return-wide v0
    //         :cond_0
    //         const/4 v4, 0x0
    //         invoke-virtual {p1, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    //         int-to-long v4, v3
    //         add-long/2addr v0, v4
    //         goto :goto_0
    */

    private @JvmStatic fun e(p0: java.io.InputStream): ByteArray { return TODO("body: (Ljava/io/InputStream;)[B") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         invoke-static {p0, v0}, Lcom/google/android/gms/maps/model/UrlTileProvider;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //         invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    //         move-result-object v0
    //         return-object v0
    */

    }
}
