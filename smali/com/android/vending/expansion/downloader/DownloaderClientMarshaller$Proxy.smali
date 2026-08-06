.class Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;
.super Ljava/lang/Object;
.source "DownloaderClientMarshaller.java"

# interfaces
.implements Lcom/android/vending/expansion/downloader/IDownloaderClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Proxy"
.end annotation


# instance fields
.field private mServiceMessenger:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/os/Messenger;)V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->mServiceMessenger:Landroid/os/Messenger;

    .line 102
    return-void
.end method

.method private send(ILandroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 91
    const/4 v0, 0x0

    invoke-static {v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 92
    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 94
    :try_start_0
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->mServiceMessenger:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :goto_0
    return-void

    .line 95
    :catch_0
    move-exception v0

    .line 96
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
    .locals 2

    .prologue
    .line 85
    new-instance v0, Landroid/os/Bundle;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 86
    const-string v1, "progress"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 87
    const/16 v1, 0xb

    invoke-direct {p0, v1, v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 88
    return-void
.end method

.method public onDownloadStateChanged(I)V
    .locals 2

    .prologue
    .line 78
    new-instance v0, Landroid/os/Bundle;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 79
    const-string v1, "newState"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 80
    const/16 v1, 0xa

    invoke-direct {p0, v1, v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->send(ILandroid/os/Bundle;)V

    .line 81
    return-void
.end method

.method public onServiceConnected(Landroid/os/Messenger;)V
    .locals 0

    .prologue
    .line 109
    return-void
.end method
