.class Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;
.super Ljava/lang/Object;
.source "AndroidHttpClient.java"

# interfaces
.implements Lorg/apache/http/HttpRequestInterceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CurlLogger"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;


# direct methods
.method private constructor <init>(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;)V
    .locals 0

    .prologue
    .line 448
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;->this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$1;)V
    .locals 0

    .prologue
    .line 448
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;-><init>(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;)V

    return-void
.end method


# virtual methods
.method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/http/HttpException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 451
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$CurlLogger;->this$0:Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->access$300(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;)Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;

    move-result-object v0

    .line 452
    if-eqz v0, :cond_0

    .line 453
    invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->access$400(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;)Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of v1, p1, Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v1, :cond_0

    .line 457
    check-cast p1, Lorg/apache/http/client/methods/HttpUriRequest;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;->access$500(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->access$600(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;Ljava/lang/String;)V

    .line 459
    :cond_0
    return-void
.end method
