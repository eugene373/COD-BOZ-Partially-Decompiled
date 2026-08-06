package com.ideaworks3d.studio

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.android.vending.expansion.downloader.DownloaderClientMarshaller

class IsAlarmReciever : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        try {
            DownloaderClientMarshaller.startDownloadServiceIfRequired(
                context,
                intent,
                IsDownloaderService::class.java
            )
        } catch (e: android.content.pm.PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }
}
