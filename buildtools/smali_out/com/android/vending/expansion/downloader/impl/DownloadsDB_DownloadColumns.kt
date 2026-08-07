package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadsDB.java.
// 14 fields, 2 methods.

open class DownloadsDB_DownloadColumns: android.provider.BaseColumns {
    public constructor()

    companion object {
    @JvmField public val CONTROL: String = "CONTROL"
    @JvmField public val CURRENTBYTES: String = "CURRENTBYTES"
    @JvmField public val ETAG: String = "ETAG"
    @JvmField public val FILENAME: String = "FN"
    @JvmField public val INDEX: String = "FILEIDX"
    @JvmField public val LASTMOD: String = "LASTMOD"
    @JvmField public val NUM_FAILED: String = "FAILCOUNT"
    @JvmField public val REDIRECT_COUNT: String = "REDIRECTCOUNT"
    @JvmField public val RETRY_AFTER: String = "RETRYAFTER"
    @JvmField public val STATUS: String = "STATUS"
    @JvmField public val TABLE_NAME: String = "DownloadColumns"
    @JvmField public val TOTALBYTES: String = "TOTALBYTES"
    @JvmField public val URI: String = "URI"
    @JvmField public val _ID: String = "DownloadColumns._id"
    }
}
