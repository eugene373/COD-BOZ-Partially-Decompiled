package com.android.vending.expansion.downloader.impl

import android.content.Context
import java.io.File

class DownloadInfo {
    var mFileName: String? = null
    var mUri: String? = null
    var mTotalBytes: Long = 0
    var mCurrentBytes: Long = 0
    var mStatusCode: Int = 0
    var mLastUpdated: String? = null
    var mRetryCount: Long = 0
    var mBBQNum: Long = 0
    var mDescription: String? = null
    var mRetryAfter: Int = 0
    var mMimeType: String? = null
    var mETag: String? = null
    var mLastModified: String? = null
    var mMediaProviderDownload: Boolean = false
    var mDownloadRate: Int = 0

    companion object {
        fun getSaveFilePath(context: Context): String {
            return context.filesDir.absolutePath
        }

        fun generateSaveFile(context: Context, fileName: String): File {
            return File(getSaveFilePath(context), fileName)
        }
    }
}