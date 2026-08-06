.class Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;
.super Ljava/lang/Object;
.source "DownloaderServiceMarshaller.java"

# interfaces
.implements Lcom/android/vending/expansion/downloader/IDownloaderService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Proxy"
.end annotation


# instance fields
.field private mMsg:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/os/Messenger;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->mMsg:Landroid/os/Messenger;

    .line 72
    return-void
.end method

.method private send(ILandroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-static {v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 62
    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 64
    :try_start_0
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->mMsg:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :goto_0
    return-void

    .line 65
    :catch_0
    move-exception v0

    .line 66
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public onClientUpdated(Landroid/os/Messenger;)V
    .locals 2

    .prologue
    .line 103
    new-instance v0, Landroid/os/Bundle;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 104
    const-string v1, "EMH"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 105
    const/4 v1, 0x6

    invoke-direct {p0, v1, v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 106
    return-void
.end method

.method public requestAbortDownload()V
    .locals 2

    .prologue
    .line 76
    const/4 v0, 0x1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 77
    return-void
.end method

.method public requestContinueDownload()V
    .locals 2

    .prologue
    .line 93
    const/4 v0, 0x4

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 94
    return-void
.end method

.method public requestDownloadStatus()V
    .locals 2

    .prologue
    .line 98
    const/4 v0, 0x5

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 99
    return-void
.end method

.method public requestPauseDownload()V
    .locals 2

    .prologue
    .line 81
    const/4 v0, 0x2

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 82
    return-void
.end method

.method public setDownloadFlags(I)V
    .locals 2

    .prologue
    .line 86
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 87
    const-string v1, "flags"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 88
    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 89
    return-void
.end method
