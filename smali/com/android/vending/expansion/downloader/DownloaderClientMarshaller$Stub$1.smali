.class Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;
.super Landroid/os/Handler;
.source "DownloaderClientMarshaller.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;


# direct methods
.method constructor <init>(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 124
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 142
    :cond_0
    :goto_0
    return-void

    .line 126
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-static {v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 128
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-static {v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$000(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 129
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "progress"

    .line 130
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/android/vending/expansion/downloader/DownloadProgressInfo;

    .line 131
    iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-static {v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$100(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderClient;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V

    goto :goto_0

    .line 135
    :pswitch_1
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$100(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderClient;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "newState"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onDownloadStateChanged(I)V

    goto :goto_0

    .line 138
    :pswitch_2
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$1;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$100(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderClient;

    move-result-object v1

    .line 139
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "EMH"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Messenger;

    .line 138
    invoke-interface {v1, v0}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onServiceConnected(Landroid/os/Messenger;)V

    goto :goto_0

    .line 124
    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
