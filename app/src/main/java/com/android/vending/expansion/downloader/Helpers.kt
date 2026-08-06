package com.android.vending.expansion.downloader

import android.content.Context
import android.net.wifi.WifiManager
import java.io.File

object Helpers {
    fun getSaveFilePath(context: Context): String {
        return context.filesDir.absolutePath
    }

    fun generateSaveFileName(context: Context, fileName: String): String {
        try {
            val dir = File(context.filesDir, "downloads")
            if (!dir.exists()) dir.mkdirs()
            val f = File(dir, fileName)
            return f.absolutePath
        } catch (e: Exception) {
            return context.filesDir.absolutePath + "/" + fileName
        }
    }

    fun doesFileExist(context: Context, fileName: String, progress: Long, ignoreProgress: Boolean): Boolean {
        val f = File(generateSaveFileName(context, fileName))
        return f.exists()
    }

    fun isWifiWifiManager(context: Context): Boolean {
        val wm = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        return wm != null && wm.isWifiEnabled
    }
}