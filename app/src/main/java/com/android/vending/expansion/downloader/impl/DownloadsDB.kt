package com.android.vending.expansion.downloader.impl

import android.content.Context
import android.content.ServiceConnection

abstract class DownloadsDB {
    companion object {
        fun getDB(context: Context): DownloadsDB? = null
    }

    fun getDownloadInfoByFileName(fileName: String): DownloadInfo? = null
    fun stopService(conn: ServiceConnection) {}
    fun incrementFileCompleted(): Int = 0
    fun incrementWakeup() {}
    fun decrementWakeup() {}
}