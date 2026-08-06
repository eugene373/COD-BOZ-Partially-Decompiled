.class public Lcom/android/vending/expansion/downloader/Constants;
.super Ljava/lang/Object;
.source "Constants.java"


# static fields
.field public static final ACTION_HIDE:Ljava/lang/String; = "android.intent.action.DOWNLOAD_HIDE"

.field public static final ACTION_LIST:Ljava/lang/String; = "android.intent.action.DOWNLOAD_LIST"

.field public static final ACTION_OPEN:Ljava/lang/String; = "android.intent.action.DOWNLOAD_OPEN"

.field public static final ACTION_RETRY:Ljava/lang/String; = "android.intent.action.DOWNLOAD_WAKEUP"

.field public static final ACTIVE_THREAD_WATCHDOG:J = 0x1388L

.field public static final BUFFER_SIZE:I = 0x1000

.field public static final DEFAULT_USER_AGENT:Ljava/lang/String; = "Android.LVLDM"

.field public static final ERROR_CHECK_IN_PROGRESS:I = 0x4

.field public static final ERROR_INVALID_PACKAGE_NAME:I = 0x1

.field public static final ERROR_INVALID_PUBLIC_KEY:I = 0x5

.field public static final ERROR_MISSING_PERMISSION:I = 0x6

.field public static final ERROR_NON_MATCHING_UID:I = 0x2

.field public static final ERROR_NOT_MARKET_MANAGED:I = 0x3

.field public static final EXP_PATH:Ljava/lang/String;

.field public static final FILENAME_SEQUENCE_SEPARATOR:Ljava/lang/String; = "-"

.field public static final LICENSED:I = 0x100

.field private static final LOCAL_LOGVV:Z = false

.field public static final LOGV:Z = false

.field public static final LOGVV:Z = false

.field public static final LOGX:Z = true

.field public static final MAX_DOWNLOADS:I = 0x3e8

.field public static final MAX_REDIRECTS:I = 0x5

.field public static final MAX_RETRIES:I = 0x5

.field public static final MAX_RETRY_AFTER:I = 0x15180

.field public static final MIN_ARTIFICIAL_ERROR_STATUS:I = 0x1e8

.field public static final MIN_PROGRESS_STEP:I = 0x1000

.field public static final MIN_PROGRESS_TIME:J = 0x3e8L

.field public static final MIN_RETRY_AFTER:I = 0x1e

.field public static final NETWORK_TYPE_HSPAP:I = 0xf

.field public static final NOT_LICENSED:I = 0x231

.field public static final RETRY:I = 0x123

.field public static final RETRY_FIRST_DELAY:I = 0x1e

.field public static final STATUS_BAD_REQUEST:I = 0x190

.field public static final STATUS_CANCELED:I = 0x1ea

.field public static final STATUS_CANNOT_RESUME:I = 0x1e9

.field public static final STATUS_DEVICE_NOT_FOUND_ERROR:I = 0x1f3

.field public static final STATUS_FILE_ALREADY_EXISTS_ERROR:I = 0x1e8

.field public static final STATUS_FILE_ERROR:I = 0x1ec

.field public static final STATUS_HTTP_DATA_ERROR:I = 0x1ef

.field public static final STATUS_HTTP_EXCEPTION:I = 0x1f0

.field public static final STATUS_INSUFFICIENT_SPACE_ERROR:I = 0x1f2

.field public static final STATUS_LENGTH_REQUIRED:I = 0x19b

.field public static final STATUS_NOT_ACCEPTABLE:I = 0x196

.field public static final STATUS_PRECONDITION_FAILED:I = 0x19c

.field public static final STATUS_SUCCESS:I = 0xc8

.field public static final STATUS_TOO_MANY_REDIRECTS:I = 0x1f1

.field public static final STATUS_UNHANDLED_HTTP_CODE:I = 0x1ee

.field public static final STATUS_UNHANDLED_REDIRECT:I = 0x1ed

.field public static final STATUS_UNKNOWN_ERROR:I = 0x1eb

.field public static final TAG:Ljava/lang/String; = "LVLDL"

.field public static final TYPE_BLUETOOTH:I = 0x7

.field public static final TYPE_ETHERNET:I = 0x9

.field public static final WATCHDOG_WAKE_TIMER:J = 0xea60L

.field public static final kilobytes_per_second:Ljava/lang/String; = "%1$s KB/s"

.field public static final notification_download_complete:Ljava/lang/String; = "Download complete"

.field public static final notification_download_failed:Ljava/lang/String; = "Download unsuccessful"

.field public static final state_completed:Ljava/lang/String; = "Download finished"

.field public static final state_connecting:Ljava/lang/String; = "Connecting to the download server"

.field public static final state_downloading:Ljava/lang/String; = "Downloading resources"

.field public static final state_failed:Ljava/lang/String; = "Download failed"

.field public static final state_failed_cancelled:Ljava/lang/String; = "Download cancelled"

.field public static final state_failed_fetching_url:Ljava/lang/String; = "Download failed because the resources could not be found"

.field public static final state_failed_sdcard_full:Ljava/lang/String; = "Download failed because the external storage is full"

.field public static final state_failed_unlicensed:Ljava/lang/String; = "Download failed because you may not have purchased this app"

.field public static final state_fetching_url:Ljava/lang/String; = "Looking for resources to download"

.field public static final state_idle:Ljava/lang/String; = "Waiting for download to start"

.field public static final state_paused_by_request:Ljava/lang/String; = "Download paused"

.field public static final state_paused_network_setup_failure:Ljava/lang/String; = "Download paused. Test a website in browser"

.field public static final state_paused_network_unavailable:Ljava/lang/String; = "Download paused because no network is available"

.field public static final state_paused_roaming:Ljava/lang/String; = "Download paused because you are roaming"

.field public static final state_paused_sdcard_unavailable:Ljava/lang/String; = "Download paused because the external storage is unavailable"

.field public static final state_paused_wifi_disabled:Ljava/lang/String; = "Download paused because wifi is disabled"

.field public static final state_paused_wifi_unavailable:Ljava/lang/String; = "Download paused because wifi is unavailable"

.field public static final state_unknown:Ljava/lang/String; = "Starting..."

.field public static final time_remaining:Ljava/lang/String; = "Time remaining: %1$s"

.field public static final time_remaining_notification:Ljava/lang/String; = "%1$s left"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Android"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "obb"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/android/vending/expansion/downloader/Constants;->EXP_PATH:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
