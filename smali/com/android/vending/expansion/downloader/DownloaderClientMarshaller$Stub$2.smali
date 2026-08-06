.class Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;
.super Ljava/lang/Object;
.source "DownloaderClientMarshaller.java"

# interfaces
.implements Landroid/content/ServiceConnection;


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
    .line 153
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    new-instance v1, Landroid/os/Messenger;

    invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    invoke-static {v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$202(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;Landroid/os/Messenger;)Landroid/os/Messenger;

    .line 161
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$100(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderClient;

    move-result-object v0

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    .line 162
    invoke-static {v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$200(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Landroid/os/Messenger;

    move-result-object v1

    .line 161
    invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onServiceConnected(Landroid/os/Messenger;)V

    .line 163
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$202(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;Landroid/os/Messenger;)Landroid/os/Messenger;

    .line 169
    return-void
.end method
