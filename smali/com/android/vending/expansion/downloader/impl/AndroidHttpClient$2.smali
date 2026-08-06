.class Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;
.super Lorg/apache/http/impl/client/DefaultHttpClient;
.source "AndroidHttpClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;


# direct methods
.method constructor <init>(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;

    invoke-direct {p0, p2, p3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    return-void
.end method


# virtual methods
.method protected createHttpContext()Lorg/apache/http/protocol/HttpContext;
    .locals 3

    .prologue
    .line 239
    new-instance v0, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v0}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 240
    const-string v1, "http.authscheme-registry"

    .line 242
    invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->getAuthSchemes()Lorg/apache/http/auth/AuthSchemeRegistry;

    move-result-object v2

    .line 240
    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    const-string v1, "http.cookiespec-registry"

    .line 245
    invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->getCookieSpecs()Lorg/apache/http/cookie/CookieSpecRegistry;

    move-result-object v2

    .line 243
    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 246
    const-string v1, "http.auth.credentials-provider"

    .line 248
    invoke-virtual {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->getCredentialsProvider()Lorg/apache/http/client/CredentialsProvider;

    move-result-object v2

    .line 246
    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 249
    return-object v0
.end method

.method protected createHttpProcessor()Lorg/apache/http/protocol/BasicHttpProcessor;
    .locals 4

    .prologue
    .line 228
    invoke-super {p0}, Lorg/apache/http/impl/client/DefaultHttpClient;->createHttpProcessor()Lorg/apache/http/protocol/BasicHttpProcessor;

    move-result-object v0

    .line 229
    invoke-static {}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->access$000()Lorg/apache/http/HttpRequestInterceptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 230
    new-instance v1, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$2;->this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;-><init>(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$1;)V

    invoke-virtual {v0, v1}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 232
    return-object v0
.end method
