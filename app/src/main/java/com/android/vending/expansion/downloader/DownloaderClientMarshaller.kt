package com.android.vending.expansion.downloader

import android.content.Context
import android.content.Intent
import android.os.IBinder

object DownloaderClientMarshaller {
    fun startDownloadServiceIfRequired(context: Context, intent: Intent, serviceClass: Class<*>): Int {
        return 0
    }

    var Stub: IBinder? = null
}