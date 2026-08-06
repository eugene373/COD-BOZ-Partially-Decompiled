.class public interface abstract Lcom/android/vending/expansion/downloader/IDownloaderService;
.super Ljava/lang/Object;
.source "IDownloaderService.java"


# static fields
.field public static final FLAGS_DOWNLOAD_OVER_CELLULAR:I = 0x1


# virtual methods
.method public abstract onClientUpdated(Landroid/os/Messenger;)V
.end method

.method public abstract requestAbortDownload()V
.end method

.method public abstract requestContinueDownload()V
.end method

.method public abstract requestDownloadStatus()V
.end method

.method public abstract requestPauseDownload()V
.end method

.method public abstract setDownloadFlags(I)V
.end method
