package com.android.vending.expansion.downloader.impl

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import java.io.File

abstract class DownloaderService : Service() {
    companion object {
        var SOURCE_FOLDER: String? = null

        fun getSaveFilePath(context: Context): String {
            return context.filesDir.absolutePath
        }

        fun generateSaveFile(context: Context, fileName: String): File {
            return File(getSaveFilePath(context), fileName)
        }

        fun getExpansionFiles(versionCode: Int, packageName: String): Array<String> {
            return arrayOf("main.$versionCode.$packageName.obb")
        }
    }

    override fun onBind(intent: Intent?): IBinder? = null

    abstract fun getAlarmReceiverClassName(): String
    abstract fun getPublicKey(): String
    abstract fun getSALT(): ByteArray

    fun getRequestCode(): Long = 0
    fun getDownloaderClass(): String? = null
}