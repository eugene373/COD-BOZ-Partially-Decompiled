package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class av: com.google.android.gms.tagmanager.bm {
    private var apu: org.apache.http.client.HttpClient

    constructor()

    private fun a(p0: org.apache.http.client.HttpClient, p1: org.apache.http.HttpResponse): java.io.InputStream { return TODO("body: (Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpResponse;)Ljava/io/InputStream;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
    //         move-result-object v0
    //         invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
    //         move-result v0
    //         const/16 v1, 0xc8
    //         if-ne v0, v1, :cond_0
    //         const-string v0, "Success response"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    //         move-result-object v0
    //         invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
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

    private fun a(p0: org.apache.http.client.HttpClient) { /* TODO(body): (Lorg/apache/http/client/HttpClient;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    //         move-result-object v0
    //         invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    //         :cond_0
    //         return-void
    */

    public fun cD(p0: String): java.io.InputStream { return TODO("body: (Ljava/lang/String;)Ljava/io/InputStream;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/av;->ov()Lorg/apache/http/client/HttpClient;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/av;->apu:Lorg/apache/http/client/HttpClient;
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/av;->apu:Lorg/apache/http/client/HttpClient;
    //         new-instance v1, Lorg/apache/http/client/methods/HttpGet;
    //         invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
    //         invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/av;->apu:Lorg/apache/http/client/HttpClient;
    //         invoke-direct {p0, v1, v0}, Lcom/google/android/gms/tagmanager/av;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpResponse;)Ljava/io/InputStream;
    //         move-result-object v0
    //         return-object v0
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/av;->apu:Lorg/apache/http/client/HttpClient;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/av;->a(Lorg/apache/http/client/HttpClient;)V
    //         return-void
    */

    fun ov(): org.apache.http.client.HttpClient { return TODO("body: ()Lorg/apache/http/client/HttpClient;") }
    /*
    //         .locals 2
    //         const/16 v1, 0x4e20
    //         new-instance v0, Lorg/apache/http/params/BasicHttpParams;
    //         invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
    //         invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
    //         invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
    //         new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
    //         invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
    //         return-object v1
    */

}
