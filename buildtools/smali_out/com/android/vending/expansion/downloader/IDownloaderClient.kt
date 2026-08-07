package com.android.vending.expansion.downloader

// Auto-emitted from smali source: IDownloaderClient.java.
// 19 fields, 3 methods.

interface IDownloaderClient {
    public fun onDownloadProgress(p0: com.android.vending.expansion.downloader.DownloadProgressInfo)

    public fun onDownloadStateChanged(p0: Int)

    public fun onServiceConnected(p0: android.os.Messenger)

    companion object {
    @JvmField public val STATE_COMPLETED: Int = 0x5
    @JvmField public val STATE_CONNECTING: Int = 0x3
    @JvmField public val STATE_DOWNLOADING: Int = 0x4
    @JvmField public val STATE_FAILED: Int = 0x13
    @JvmField public val STATE_FAILED_CANCELED: Int = 0x12
    @JvmField public val STATE_FAILED_FETCHING_URL: Int = 0x10
    @JvmField public val STATE_FAILED_SDCARD_FULL: Int = 0x11
    @JvmField public val STATE_FAILED_UNLICENSED: Int = 0xf
    @JvmField public val STATE_FETCHING_URL: Int = 0x2
    @JvmField public val STATE_IDLE: Int = 0x1
    @JvmField public val STATE_PAUSED_BY_REQUEST: Int = 0x7
    @JvmField public val STATE_PAUSED_NEED_CELLULAR_PERMISSION: Int = 0x9
    @JvmField public val STATE_PAUSED_NEED_WIFI: Int = 0xb
    @JvmField public val STATE_PAUSED_NETWORK_SETUP_FAILURE: Int = 0xd
    @JvmField public val STATE_PAUSED_NETWORK_UNAVAILABLE: Int = 0x6
    @JvmField public val STATE_PAUSED_ROAMING: Int = 0xc
    @JvmField public val STATE_PAUSED_SDCARD_UNAVAILABLE: Int = 0xe
    @JvmField public val STATE_PAUSED_WIFI_DISABLED: Int = 0xa
    @JvmField public val STATE_PAUSED_WIFI_DISABLED_NEED_CELLULAR_PERMISSION: Int = 0x8
    }
}
