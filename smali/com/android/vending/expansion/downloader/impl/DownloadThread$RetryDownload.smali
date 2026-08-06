.class Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;
.super Ljava/lang/Throwable;
.source "DownloadThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloadThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RetryDownload"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x55fcbdf27c25b185L


# instance fields
.field final synthetic this$0:Lcom/android/vending/expansion/downloader/impl/DownloadThread;


# direct methods
.method private constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloadThread;

    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;Lcom/android/vending/expansion/downloader/impl/DownloadThread$1;)V
    .locals 0

    .prologue
    .line 141
    invoke-direct {p0, p1}, Lcom/android/vending/expansion/downloader/impl/DownloadThread$RetryDownload;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;)V

    return-void
.end method
