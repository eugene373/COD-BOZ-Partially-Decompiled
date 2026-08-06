.class Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;
.super Landroid/os/Handler;
.source "DownloaderServiceMarshaller.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;


# direct methods
.method constructor <init>(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 114
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 135
    :goto_0
    return-void

    .line 116
    :pswitch_0
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/vending/expansion/downloader/IDownloaderService;->requestAbortDownload()V

    goto :goto_0

    .line 119
    :pswitch_1
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/vending/expansion/downloader/IDownloaderService;->requestContinueDownload()V

    goto :goto_0

    .line 122
    :pswitch_2
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/vending/expansion/downloader/IDownloaderService;->requestPauseDownload()V

    goto :goto_0

    .line 125
    :pswitch_3
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "flags"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderService;->setDownloadFlags(I)V

    goto :goto_0

    .line 128
    :pswitch_4
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v0

    invoke-interface {v0}, Lcom/android/vending/expansion/downloader/IDownloaderService;->requestDownloadStatus()V

    goto :goto_0

    .line 131
    :pswitch_5
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderService;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "EMH"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Messenger;

    invoke-interface {v1, v0}, Lcom/android/vending/expansion/downloader/IDownloaderService;->onClientUpdated(Landroid/os/Messenger;)V

    goto :goto_0

    .line 114
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
