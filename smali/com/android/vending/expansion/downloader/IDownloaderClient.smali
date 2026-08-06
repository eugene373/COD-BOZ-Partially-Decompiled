.class public interface abstract Lcom/android/vending/expansion/downloader/IDownloaderClient;
.super Ljava/lang/Object;
.source "IDownloaderClient.java"


# static fields
.field public static final STATE_COMPLETED:I = 0x5

.field public static final STATE_CONNECTING:I = 0x3

.field public static final STATE_DOWNLOADING:I = 0x4

.field public static final STATE_FAILED:I = 0x13

.field public static final STATE_FAILED_CANCELED:I = 0x12

.field public static final STATE_FAILED_FETCHING_URL:I = 0x10

.field public static final STATE_FAILED_SDCARD_FULL:I = 0x11

.field public static final STATE_FAILED_UNLICENSED:I = 0xf

.field public static final STATE_FETCHING_URL:I = 0x2

.field public static final STATE_IDLE:I = 0x1

.field public static final STATE_PAUSED_BY_REQUEST:I = 0x7

.field public static final STATE_PAUSED_NEED_CELLULAR_PERMISSION:I = 0x9

.field public static final STATE_PAUSED_NEED_WIFI:I = 0xb

.field public static final STATE_PAUSED_NETWORK_SETUP_FAILURE:I = 0xd

.field public static final STATE_PAUSED_NETWORK_UNAVAILABLE:I = 0x6

.field public static final STATE_PAUSED_ROAMING:I = 0xc

.field public static final STATE_PAUSED_SDCARD_UNAVAILABLE:I = 0xe

.field public static final STATE_PAUSED_WIFI_DISABLED:I = 0xa

.field public static final STATE_PAUSED_WIFI_DISABLED_NEED_CELLULAR_PERMISSION:I = 0x8


# virtual methods
.method public abstract onDownloadProgress(Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V
.end method

.method public abstract onDownloadStateChanged(I)V
.end method

.method public abstract onServiceConnected(Landroid/os/Messenger;)V
.end method
