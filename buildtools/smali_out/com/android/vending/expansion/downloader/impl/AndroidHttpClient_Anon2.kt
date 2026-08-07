package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: AndroidHttpClient.java.
// 1 fields, 3 methods.

open class AndroidHttpClient_Anon2: org.apache.http.impl.client.DefaultHttpClient() {
    val this$0: com.android.vending.expansion.downloader.impl.AndroidHttpClient

    constructor(p0: com.android.vending.expansion.downloader.impl.AndroidHttpClient, p1: org.apache.http.conn.ClientConnectionManager, p2: org.apache.http.params.HttpParams)

    protected fun createHttpContext(): org.apache.http.protocol.HttpContext { return TODO("body: ()Lorg/apache/http/protocol/HttpContext;") }
    /*
    //         .locals 3
    //         new-instance v0, Lorg/apache/http/protocol/BasicHttpContext;
    //         invoke-direct {v0}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V
    //         const-string v1, "http.authscheme-registry"
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->getAuthSchemes()Lorg/apache/http/auth/AuthSchemeRegistry;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v1, "http.cookiespec-registry"
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->getCookieSpecs()Lorg/apache/http/cookie/CookieSpecRegistry;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v1, "http.auth.credentials-provider"
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->getCredentialsProvider()Lorg/apache/http/client/CredentialsProvider;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V
    //         return-object v0
    */

    protected fun createHttpProcessor(): org.apache.http.protocol.BasicHttpProcessor { return TODO("body: ()Lorg/apache/http/protocol/BasicHttpProcessor;") }
    /*
    //         .locals 4
    //         invoke-super {p0}, Lorg/apache/http/impl/client/DefaultHttpClient;->createHttpProcessor()Lorg/apache/http/protocol/BasicHttpProcessor;
    //         move-result-object v0
    //         invoke-static {}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->access$000()Lorg/apache/http/HttpRequestInterceptor;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
    //         const/4 v3, 0x0
    //         invoke-direct {v1, v2, v3}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;-><init>(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$1;)V
    //         invoke-virtual {v0, v1}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
    //         return-object v0
    */

}
