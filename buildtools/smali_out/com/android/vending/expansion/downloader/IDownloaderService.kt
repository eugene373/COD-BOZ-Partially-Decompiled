package com.android.vending.expansion.downloader

// Auto-emitted from smali source: IDownloaderService.java.
// 1 fields, 6 methods.

interface IDownloaderService {
    public fun onClientUpdated(p0: android.os.Messenger)

    public fun requestAbortDownload()

    public fun requestContinueDownload()

    public fun requestDownloadStatus()

    public fun requestPauseDownload()

    public fun setDownloadFlags(p0: Int)

    companion object {
    @JvmField public val FLAGS_DOWNLOAD_OVER_CELLULAR: Int = 0x1
    }
}
