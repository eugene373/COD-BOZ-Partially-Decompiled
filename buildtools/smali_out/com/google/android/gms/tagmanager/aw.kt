package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class aw: com.google.android.gms.tagmanager.bm {
    private var apv: java.net.HttpURLConnection

    constructor()

    private fun a(p0: java.net.HttpURLConnection): java.io.InputStream { return TODO("body: (Ljava/net/HttpURLConnection;)Ljava/io/InputStream;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v0
    //         const/16 v1, 0xc8
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Bad response: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         const/16 v2, 0x194
    //         if-ne v0, v2, :cond_1
    //         new-instance v0, Ljava/io/FileNotFoundException;
    //         invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Ljava/io/IOException;
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private fun b(p0: java.net.HttpURLConnection) { /* TODO(body): (Ljava/net/HttpURLConnection;)V */ }
    /*
    //         .locals 0
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :cond_0
    //         return-void
    */

    public fun cD(p0: String): java.io.InputStream { return TODO("body: (Ljava/lang/String;)Ljava/io/InputStream;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/aw;->cE(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/aw;->apv:Ljava/net/HttpURLConnection;
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/aw;->apv:Ljava/net/HttpURLConnection;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    //         move-result-object v0
    //         return-object v0
    */

    fun cE(p0: String): java.net.HttpURLConnection { return TODO("body: (Ljava/lang/String;)Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/16 v1, 0x4e20
    //         new-instance v0, Ljava/net/URL;
    //         invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v0
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
    //         invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
    //         return-object v0
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/aw;->apv:Ljava/net/HttpURLConnection;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/aw;->b(Ljava/net/HttpURLConnection;)V
    //         return-void
    */

}
