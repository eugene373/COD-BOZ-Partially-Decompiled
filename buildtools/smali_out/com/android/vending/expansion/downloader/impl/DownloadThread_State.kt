package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadThread.java.
// 8 fields, 1 methods.

open class DownloadThread_State {
    public var mCountRetry: Boolean
    public var mFilename: String
    public var mGotData: Boolean
    public var mNewUri: String
    public var mRedirectCount: Int
    public var mRequestUri: String
    public var mRetryAfter: Int
    public var mStream: java.io.FileOutputStream

    public constructor(p0: com.android.vending.expansion.downloader.impl.DownloadInfo, p1: com.android.vending.expansion.downloader.impl.DownloaderService)

}
