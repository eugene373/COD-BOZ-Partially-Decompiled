package com.android.vending.expansion.downloader

// Auto-emitted from smali source: Constants.java.
// 76 fields, 2 methods.

open class Constants {
    public constructor()

    companion object {
    @JvmField public val ACTION_HIDE: String = "android.intent.action.DOWNLOAD_HIDE"
    @JvmField public val ACTION_LIST: String = "android.intent.action.DOWNLOAD_LIST"
    @JvmField public val ACTION_OPEN: String = "android.intent.action.DOWNLOAD_OPEN"
    @JvmField public val ACTION_RETRY: String = "android.intent.action.DOWNLOAD_WAKEUP"
    @JvmField public val ACTIVE_THREAD_WATCHDOG: Long = 0x1388L
    @JvmField public val BUFFER_SIZE: Int = 0x1000
    @JvmField public val DEFAULT_USER_AGENT: String = "Android.LVLDM"
    @JvmField public val ERROR_CHECK_IN_PROGRESS: Int = 0x4
    @JvmField public val ERROR_INVALID_PACKAGE_NAME: Int = 0x1
    @JvmField public val ERROR_INVALID_PUBLIC_KEY: Int = 0x5
    @JvmField public val ERROR_MISSING_PERMISSION: Int = 0x6
    @JvmField public val ERROR_NON_MATCHING_UID: Int = 0x2
    @JvmField public val ERROR_NOT_MARKET_MANAGED: Int = 0x3
    @JvmField public val EXP_PATH: String = null!!
    @JvmField public val FILENAME_SEQUENCE_SEPARATOR: String = "-"
    @JvmField public val LICENSED: Int = 0x100
    private val LOCAL_LOGVV: Boolean = false
    @JvmField public val LOGV: Boolean = false
    @JvmField public val LOGVV: Boolean = false
    @JvmField public val LOGX: Boolean = true
    @JvmField public val MAX_DOWNLOADS: Int = 0x3e8
    @JvmField public val MAX_REDIRECTS: Int = 0x5
    @JvmField public val MAX_RETRIES: Int = 0x5
    @JvmField public val MAX_RETRY_AFTER: Int = 0x15180
    @JvmField public val MIN_ARTIFICIAL_ERROR_STATUS: Int = 0x1e8
    @JvmField public val MIN_PROGRESS_STEP: Int = 0x1000
    @JvmField public val MIN_PROGRESS_TIME: Long = 0x3e8L
    @JvmField public val MIN_RETRY_AFTER: Int = 0x1e
    @JvmField public val NETWORK_TYPE_HSPAP: Int = 0xf
    @JvmField public val NOT_LICENSED: Int = 0x231
    @JvmField public val RETRY: Int = 0x123
    @JvmField public val RETRY_FIRST_DELAY: Int = 0x1e
    @JvmField public val STATUS_BAD_REQUEST: Int = 0x190
    @JvmField public val STATUS_CANCELED: Int = 0x1ea
    @JvmField public val STATUS_CANNOT_RESUME: Int = 0x1e9
    @JvmField public val STATUS_DEVICE_NOT_FOUND_ERROR: Int = 0x1f3
    @JvmField public val STATUS_FILE_ALREADY_EXISTS_ERROR: Int = 0x1e8
    @JvmField public val STATUS_FILE_ERROR: Int = 0x1ec
    @JvmField public val STATUS_HTTP_DATA_ERROR: Int = 0x1ef
    @JvmField public val STATUS_HTTP_EXCEPTION: Int = 0x1f0
    @JvmField public val STATUS_INSUFFICIENT_SPACE_ERROR: Int = 0x1f2
    @JvmField public val STATUS_LENGTH_REQUIRED: Int = 0x19b
    @JvmField public val STATUS_NOT_ACCEPTABLE: Int = 0x196
    @JvmField public val STATUS_PRECONDITION_FAILED: Int = 0x19c
    @JvmField public val STATUS_SUCCESS: Int = 0xc8
    @JvmField public val STATUS_TOO_MANY_REDIRECTS: Int = 0x1f1
    @JvmField public val STATUS_UNHANDLED_HTTP_CODE: Int = 0x1ee
    @JvmField public val STATUS_UNHANDLED_REDIRECT: Int = 0x1ed
    @JvmField public val STATUS_UNKNOWN_ERROR: Int = 0x1eb
    @JvmField public val TAG: String = "LVLDL"
    @JvmField public val TYPE_BLUETOOTH: Int = 0x7
    @JvmField public val TYPE_ETHERNET: Int = 0x9
    @JvmField public val WATCHDOG_WAKE_TIMER: Long = 0xea60L
    @JvmField public val kilobytes_per_second: String = "%1$s KB/s"
    @JvmField public val notification_download_complete: String = "Download complete"
    @JvmField public val notification_download_failed: String = "Download unsuccessful"
    @JvmField public val state_completed: String = "Download finished"
    @JvmField public val state_connecting: String = "Connecting to the download server"
    @JvmField public val state_downloading: String = "Downloading resources"
    @JvmField public val state_failed: String = "Download failed"
    @JvmField public val state_failed_cancelled: String = "Download cancelled"
    @JvmField public val state_failed_fetching_url: String = "Download failed because the resources could not be found"
    @JvmField public val state_failed_sdcard_full: String = "Download failed because the external storage is full"
    @JvmField public val state_failed_unlicensed: String = "Download failed because you may not have purchased this app"
    @JvmField public val state_fetching_url: String = "Looking for resources to download"
    @JvmField public val state_idle: String = "Waiting for download to start"
    @JvmField public val state_paused_by_request: String = "Download paused"
    @JvmField public val state_paused_network_setup_failure: String = "Download paused. Test a website in browser"
    @JvmField public val state_paused_network_unavailable: String = "Download paused because no network is available"
    @JvmField public val state_paused_roaming: String = "Download paused because you are roaming"
    @JvmField public val state_paused_sdcard_unavailable: String = "Download paused because the external storage is unavailable"
    @JvmField public val state_paused_wifi_disabled: String = "Download paused because wifi is disabled"
    @JvmField public val state_paused_wifi_unavailable: String = "Download paused because wifi is unavailable"
    @JvmField public val state_unknown: String = "Starting..."
    @JvmField public val time_remaining: String = "Time remaining: %1$s"
    @JvmField public val time_remaining_notification: String = "%1$s left"
    }
}
