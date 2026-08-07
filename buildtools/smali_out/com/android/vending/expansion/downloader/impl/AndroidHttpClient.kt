package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: AndroidHttpClient.java.
// 8 fields, 27 methods.

class AndroidHttpClient: org.apache.http.client.HttpClient {
    private var curlConfiguration: com.android.vending.expansion.downloader.impl.AndroidHttpClient.LoggingConfiguration
    private val delegate: org.apache.http.client.HttpClient
    private var mLeakedException: RuntimeException

    private constructor(p0: org.apache.http.conn.ClientConnectionManager, p1: org.apache.http.params.HttpParams)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->mLeakedException:Ljava/lang/RuntimeException;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    //         move-result-object v0
    //         invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->mLeakedException:Ljava/lang/RuntimeException;
    //         :cond_0
    //         return-void
    */

    public fun disableCurlLogging() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->curlConfiguration:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;
    //         return-void
    */

    public fun enableCurlLogging(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "name"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x2
    //         if-lt p2, v0, :cond_1
    //         const/4 v0, 0x7
    //         if-le p2, v0, :cond_2
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Level is out of range [2..7]"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         new-instance v0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p1, p2, v1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;-><init>(Ljava/lang/String;ILcom/android/vending/expansion/downloader/impl/AndroidHttpClient$1;)V
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->curlConfiguration:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;
    //         return-void
    */

    public fun execute(p0: org.apache.http.HttpHost, p1: org.apache.http.HttpRequest, p2: org.apache.http.client.ResponseHandler): Object { return TODO("body: (Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lorg/apache/http/HttpHost;",
    //                 "Lorg/apache/http/HttpRequest;",
    //                 "Lorg/apache/http/client/ResponseHandler",
    //                 "<+TT;>;)TT;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lorg/apache/http/client/ClientProtocolException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.HttpHost, p1: org.apache.http.HttpRequest, p2: org.apache.http.client.ResponseHandler, p3: org.apache.http.protocol.HttpContext): Object { return TODO("body: (Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lorg/apache/http/HttpHost;",
    //                 "Lorg/apache/http/HttpRequest;",
    //                 "Lorg/apache/http/client/ResponseHandler",
    //                 "<+TT;>;",
    //                 "Lorg/apache/http/protocol/HttpContext;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lorg/apache/http/client/ClientProtocolException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2, p3, p4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.client.methods.HttpUriRequest, p1: org.apache.http.client.ResponseHandler): Object { return TODO("body: (Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lorg/apache/http/client/methods/HttpUriRequest;",
    //                 "Lorg/apache/http/client/ResponseHandler",
    //                 "<+TT;>;)TT;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lorg/apache/http/client/ClientProtocolException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.client.methods.HttpUriRequest, p1: org.apache.http.client.ResponseHandler, p2: org.apache.http.protocol.HttpContext): Object { return TODO("body: (Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lorg/apache/http/client/methods/HttpUriRequest;",
    //                 "Lorg/apache/http/client/ResponseHandler",
    //                 "<+TT;>;",
    //                 "Lorg/apache/http/protocol/HttpContext;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lorg/apache/http/client/ClientProtocolException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.HttpHost, p1: org.apache.http.HttpRequest): org.apache.http.HttpResponse { return TODO("body: (Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.HttpHost, p1: org.apache.http.HttpRequest, p2: org.apache.http.protocol.HttpContext): org.apache.http.HttpResponse { return TODO("body: (Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.client.methods.HttpUriRequest): org.apache.http.HttpResponse { return TODO("body: (Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //         move-result-object v0
    //         return-object v0
    */

    public fun execute(p0: org.apache.http.client.methods.HttpUriRequest, p1: org.apache.http.protocol.HttpContext): org.apache.http.HttpResponse { return TODO("body: (Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun finalize() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Throwable;
    //             }
    //         .end annotation
    //         invoke-super {p0}, Ljava/lang/Object;->finalize()V
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->mLeakedException:Ljava/lang/RuntimeException;
    //         if-eqz v0, :cond_0
    //         const-string v0, "AndroidHttpClient"
    //         const-string v1, "Leak found"
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->mLeakedException:Ljava/lang/RuntimeException;
    //         invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->mLeakedException:Ljava/lang/RuntimeException;
    //         :cond_0
    //         return-void
    */

    public fun getConnectionManager(): org.apache.http.conn.ClientConnectionManager { return TODO("body: ()Lorg/apache/http/conn/ClientConnectionManager;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParams(): org.apache.http.params.HttpParams { return TODO("body: ()Lorg/apache/http/params/HttpParams;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->delegate:Lorg/apache/http/client/HttpClient;
    //         invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public var DEFAULT_SYNC_MIN_GZIP_BYTES: Long
    private val SOCKET_OPERATION_TIMEOUT: Int = 0xea60
    private val TAG: String = "AndroidHttpClient"
    var sSslSessionCacheClass: Class
    private val sThreadCheckInterceptor: org.apache.http.HttpRequestInterceptor = null!!

    public @JvmStatic fun getCompressedEntity(p0: ByteArray, p1: android.content.ContentResolver): org.apache.http.entity.AbstractHttpEntity { return TODO("body: ([BLandroid/content/ContentResolver;)Lorg/apache/http/entity/AbstractHttpEntity;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         array-length v0, p0
    //         int-to-long v0, v0
    //         invoke-static {p1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->getMinGzipSize(Landroid/content/ContentResolver;)J
    //         move-result-wide v2
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;
    //         invoke-direct {v0, p0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         new-instance v0, Ljava/util/zip/GZIPOutputStream;
    //         invoke-direct {v0, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    //         invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    //         new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;
    //         invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
    //         const-string v1, "gzip"
    //         invoke-virtual {v0, v1}, Lorg/apache/http/entity/AbstractHttpEntity;->setContentEncoding(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public @JvmStatic fun getMinGzipSize(p0: android.content.ContentResolver): Long { return TODO("body: (Landroid/content/ContentResolver;)J") }
    /*
    //         .locals 2
    //         sget-wide v0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->DEFAULT_SYNC_MIN_GZIP_BYTES:J
    //         return-wide v0
    */

    public @JvmStatic fun getUngzippedContent(p0: org.apache.http.HttpEntity): java.io.InputStream { return TODO("body: (Lorg/apache/http/HttpEntity;)Ljava/io/InputStream;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-interface {p0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         invoke-interface {p0}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v2, "gzip"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/util/zip/GZIPInputStream;
    //         invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    //         :goto_1
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_1
    */

    public @JvmStatic fun modifyRequestToAcceptGzipResponse(p0: org.apache.http.HttpRequest) { /* TODO(body): (Lorg/apache/http/HttpRequest;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Accept-Encoding"
    //         const-string v1, "gzip"
    //         invoke-interface {p0, v0, v1}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun newInstance(p0: String): com.android.vending.expansion.downloader.impl.AndroidHttpClient { return TODO("body: (Ljava/lang/String;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->newInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newInstance(p0: String, p1: android.content.Context): com.android.vending.expansion.downloader.impl.AndroidHttpClient { return TODO("body: (Ljava/lang/String;Landroid/content/Context;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;") }
    /*
    //         .locals 9
    //         const/4 v1, 0x0
    //         const v0, 0xea60
    //         const/4 v3, 0x0
    //         new-instance v2, Lorg/apache/http/params/BasicHttpParams;
    //         invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
    //         invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setStaleCheckingEnabled(Lorg/apache/http/params/HttpParams;Z)V
    //         invoke-static {v2, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
    //         invoke-static {v2, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
    //         const/16 v0, 0x2000
    //         invoke-static {v2, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V
    //         invoke-static {v2, v3}, Lorg/apache/http/client/params/HttpClientParams;->setRedirecting(Lorg/apache/http/params/HttpParams;Z)V
    //         if-eqz p1, :cond_1
    //         sget-object v0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->sSslSessionCacheClass:Ljava/lang/Class;
    //         if-eqz v0, :cond_1
    //         :try_start_0
    //         sget-object v0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->sSslSessionCacheClass:Ljava/lang/Class;
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Class;
    //         const/4 v4, 0x0
    //         const-class v5, Landroid/content/Context;
    //         aput-object v5, v3, v4
    //         invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //         move-result-object v0
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p1, v3, v4
    //         invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_4
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_5
    //         move-result-object v0
    //         :goto_0
    //         invoke-static {v2, p0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
    //         new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry;
    //         invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
    //         new-instance v4, Lorg/apache/http/conn/scheme/Scheme;
    //         const-string v5, "http"
    //         invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
    //         move-result-object v6
    //         const/16 v7, 0x50
    //         invoke-direct {v4, v5, v6, v7}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //         invoke-virtual {v3, v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //         if-eqz v0, :cond_2
    //         :try_start_1
    //         const-class v4, Landroid/net/SSLCertificateSocketFactory;
    //         const-string v5, "getHttpSocketFactory"
    //         const/4 v6, 0x2
    //         new-array v6, v6, [Ljava/lang/Class;
    //         const/4 v7, 0x0
    //         sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
    //         aput-object v8, v6, v7
    //         const/4 v7, 0x1
    //         sget-object v8, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->sSslSessionCacheClass:Ljava/lang/Class;
    //         aput-object v8, v6, v7
    //         invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v4
    //         const/4 v5, 0x0
    //         const/4 v6, 0x2
    //         new-array v6, v6, [Ljava/lang/Object;
    //         const/4 v7, 0x0
    //         const v8, 0xea60
    //         invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v8
    //         aput-object v8, v6, v7
    //         const/4 v7, 0x1
    //         aput-object v0, v6, v7
    //         invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lorg/apache/http/conn/scheme/SocketFactory;
    //         :try_end_1
    //         .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_6
    //         .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_7
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_8
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_9
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_a
    //         :goto_1
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;
    //         move-result-object v0
    //         :cond_0
    //         new-instance v1, Lorg/apache/http/conn/scheme/Scheme;
    //         const-string v4, "https"
    //         const/16 v5, 0x1bb
    //         invoke-direct {v1, v4, v0, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //         invoke-virtual {v3, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //         new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
    //         invoke-direct {v0, v2, v3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    //         new-instance v1, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
    //         invoke-direct {v1, v0, v2}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
    //         return-object v1
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_3
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_4
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_5
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V
    //         :cond_1
    //         move-object v0, v1
    //         goto/16 :goto_0
    //         :catch_6
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_1
    //         :catch_7
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_1
    //         :catch_8
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_1
    //         :catch_9
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
    //         move-object v0, v1
    //         goto :goto_1
    //         :catch_a
    //         move-exception v0
    //         invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_1
    */

    public @JvmStatic fun parseDate(p0: String): Long { return TODO("body: (Ljava/lang/String;)J") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/android/vending/expansion/downloader/impl/HttpDateTime;->parse(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    private @JvmStatic fun toCurl(p0: org.apache.http.client.methods.HttpUriRequest, p1: Boolean): String { return TODO("body: (Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v0, "curl "
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-interface {p0}, Lorg/apache/http/client/methods/HttpUriRequest;->getAllHeaders()[Lorg/apache/http/Header;
    //         move-result-object v1
    //         array-length v3, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v3, :cond_2
    //         aget-object v4, v1, v0
    //         if-nez p1, :cond_1
    //         invoke-interface {v4}, Lorg/apache/http/Header;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         const-string v6, "Authorization"
    //         invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-nez v5, :cond_0
    //         invoke-interface {v4}, Lorg/apache/http/Header;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         const-string v6, "Cookie"
    //         invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-eqz v5, :cond_1
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const-string v5, "--header \""
    //         invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v4, "\" "
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_2
    //         invoke-interface {p0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;
    //         move-result-object v1
    //         instance-of v0, p0, Lorg/apache/http/impl/client/RequestWrapper;
    //         if-eqz v0, :cond_5
    //         move-object v0, p0
    //         check-cast v0, Lorg/apache/http/impl/client/RequestWrapper;
    //         invoke-virtual {v0}, Lorg/apache/http/impl/client/RequestWrapper;->getOriginal()Lorg/apache/http/HttpRequest;
    //         move-result-object v0
    //         instance-of v3, v0, Lorg/apache/http/client/methods/HttpUriRequest;
    //         if-eqz v3, :cond_5
    //         check-cast v0, Lorg/apache/http/client/methods/HttpUriRequest;
    //         invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;
    //         move-result-object v0
    //         :goto_2
    //         const-string v1, "\""
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         const-string v0, "\""
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         instance-of v0, p0, Lorg/apache/http/HttpEntityEnclosingRequest;
    //         if-eqz v0, :cond_3
    //         check-cast p0, Lorg/apache/http/HttpEntityEnclosingRequest;
    //         invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isRepeatable()Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J
    //         move-result-wide v4
    //         const-wide/16 v6, 0x400
    //         cmp-long v1, v4, v6
    //         if-gez v1, :cond_4
    //         new-instance v1, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         invoke-interface {v0, v1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V
    //         invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, " --data-ascii \""
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "\""
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_3
    //         :goto_3
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_4
    //         const-string v0, " [TOO MUCH DATA TO INCLUDE]"
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_3
    //         :cond_5
    //         move-object v0, v1
    //         goto :goto_2
    */

    }
}
