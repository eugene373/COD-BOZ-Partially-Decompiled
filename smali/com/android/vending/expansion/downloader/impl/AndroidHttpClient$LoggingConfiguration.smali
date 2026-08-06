.class Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;
.super Ljava/lang/Object;
.source "AndroidHttpClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoggingConfiguration"
.end annotation


# instance fields
.field private final level:I

.field private final tag:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 397
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->tag:Ljava/lang/String;

    .line 399
    iput p2, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->level:I

    .line 400
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/android/vending/expansion/downloader/impl/AndroidHttpClient$1;)V
    .locals 0

    .prologue
    .line 392
    invoke-direct {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic access$400(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;)Z
    .locals 1

    .prologue
    .line 392
    invoke-direct {p0}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->isLoggable()Z

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 392
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->println(Ljava/lang/String;)V

    return-void
.end method

.method private isLoggable()Z
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->tag:Ljava/lang/String;

    iget v1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->level:I

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method private println(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 413
    iget v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->level:I

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->tag:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 414
    return-void
.end method
