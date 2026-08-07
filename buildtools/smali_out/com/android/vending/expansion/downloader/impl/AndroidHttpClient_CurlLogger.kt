package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: AndroidHttpClient.java.
// 1 fields, 3 methods.

open class AndroidHttpClient_CurlLogger: org.apache.http.HttpRequestInterceptor {
    val this$0: com.android.vending.expansion.downloader.impl.AndroidHttpClient

    private constructor(p0: com.android.vending.expansion.downloader.impl.AndroidHttpClient)

    constructor(p0: com.android.vending.expansion.downloader.impl.AndroidHttpClient, p1: com.android.vending.expansion.downloader.impl.AndroidHttpClient.1)

    public fun process(p0: org.apache.http.HttpRequest, p1: org.apache.http.protocol.HttpContext) { /* TODO(body): (Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/apache/http/HttpException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;->this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->access$300(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->access$400(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         instance-of v1, p1, Lorg/apache/http/client/methods/HttpUriRequest;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lorg/apache/http/client/methods/HttpUriRequest;
    //         const/4 v1, 0x0
    //         invoke-static {p1, v1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->access$500(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->access$600(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

}
