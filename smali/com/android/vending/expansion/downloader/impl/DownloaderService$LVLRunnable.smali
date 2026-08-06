.class Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;
.super Ljava/lang/Object;
.source "DownloaderService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloaderService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LVLRunnable"
.end annotation


# instance fields
.field final mContext:Landroid/content/Context;

.field final synthetic this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;


# direct methods
.method constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloaderService;Landroid/content/Context;Landroid/app/PendingIntent;)V
    .locals 0

    .prologue
    .line 742
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 743
    iput-object p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;

    .line 744
    invoke-static {p1, p3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$002(Lcom/android/vending/expansion/downloader/impl/DownloaderService;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;

    .line 745
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 751
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$100(Z)V

    .line 752
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    invoke-static {v0}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->access$200(Lcom/android/vending/expansion/downloader/impl/DownloaderService;)Lcom/android/vending/expansion/downloader/impl/DownloadNotification;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloadNotification;->onDownloadStateChanged(I)V

    .line 753
    iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 756
    new-instance v1, Lcom/android/vending/licensing/APKExpansionPolicy;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;

    new-instance v3, Lcom/android/vending/licensing/AESObfuscator;

    iget-object v4, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    .line 757
    invoke-virtual {v4}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getSALT()[B

    move-result-object v4

    iget-object v5, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5, v0}, Lcom/android/vending/licensing/AESObfuscator;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Lcom/android/vending/licensing/APKExpansionPolicy;-><init>(Landroid/content/Context;Lcom/android/vending/licensing/Obfuscator;)V

    .line 761
    invoke-virtual {v1}, Lcom/android/vending/licensing/APKExpansionPolicy;->resetPolicy()V

    .line 765
    new-instance v0, Lcom/android/vending/licensing/LicenseChecker;

    iget-object v2, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloaderService;

    .line 766
    invoke-virtual {v3}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->getPublicKey()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lcom/android/vending/licensing/LicenseChecker;-><init>(Landroid/content/Context;Lcom/android/vending/licensing/Policy;Ljava/lang/String;)V

    .line 768
    new-instance v2, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;

    invoke-direct {v2, p0, v1}, Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable$1;-><init>(Lcom/android/vending/expansion/downloader/impl/DownloaderService$LVLRunnable;Lcom/android/vending/licensing/APKExpansionPolicy;)V

    invoke-virtual {v0, v2}, Lcom/android/vending/licensing/LicenseChecker;->checkAccess(Lcom/android/vending/licensing/LicenseCheckerCallback;)V

    .line 894
    return-void
.end method
