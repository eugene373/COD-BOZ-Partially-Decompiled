.class Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "DownloaderService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloaderService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InnerBroadcastReceiver"
.end annotation


# instance fields
.field final mService:Landroid/app/Service;

.field final synthetic this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;


# direct methods
.method constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloaderService;Landroid/app/Service;)V
    .locals 0

    .prologue
    .line 985
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 986
    iput-object p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->mService:Landroid/app/Service;

    .line 987
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 991
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-virtual {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->pollNetworkState()V

    .line 992
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$300(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 993
    invoke-static {}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$400()Z

    move-result v0

    if-nez v0, :cond_0

    .line 994
    const-string v0, "LVLDL"

    const-string v1, "InnerBroadcastReceiver Called"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 995
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->mService:Landroid/app/Service;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 996
    const-string v1, "EPI"

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$InnerBroadcastReceiver;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-static {v2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$000(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 998
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1000
    :cond_0
    return-void
.end method
