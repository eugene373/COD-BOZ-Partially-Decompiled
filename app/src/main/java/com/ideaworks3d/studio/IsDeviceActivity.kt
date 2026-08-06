package com.ideaworks3d.studio

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import com.android.vending.expansion.zipfile.ZipResourceFile
import com.ideaworks3d.marmalade.LoaderActivity

open class IsDeviceActivity : LoaderActivity() {
    companion object {
        val SALT: ByteArray = byteArrayOf(
            -0x2e, 0x41, 0x1e, -0x80, -0x67, -0x39, 0x4a, -0x40,
            0x33, 0x58, -0x5f, -0x2d, 0x4d, -0x75, -0x24, -0x71,
            -0x0b, 0x20, -0x40, 0x59
        )

        const val STATUS_SUCCESS = 0xc8
    }

    private val TAG: String = "IsDeviceActivity"
    private var mAPKExtensionFile: ZipResourceFile? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        m_Activity = this
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == 0x1a || keyCode == 0x3) {
            Log.v(TAG, "onKeyDown Recieved: $keyCode")
            val isDevice = IsDevice.GetInstance()
            if (isDevice.IsActivated()) {
                isDevice.IsDeviceKeyCallback(keyCode)
            }
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onPause() {
        Log.v(TAG, "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.v(TAG, "onResume")
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "onStart")
    }

    override fun onUserLeaveHint() {
        Log.v(TAG, "onUserLeaveHint")
        super.onUserLeaveHint()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (!hasFocus) {
            val isDevice = IsDevice.GetInstance()
            if (isDevice.IsActivated()) {
                isDevice.IsDeviceKeyCallback(0x3)
            }
        }
    }

    fun handleFileUpdated(
        downloadDB: com.android.vending.expansion.downloader.impl.DownloadsDB,
        statusCode: Int,
        fileName: String,
        progress: Long
    ): Boolean {
        val downloadInfo = downloadDB.getDownloadInfoByFileName(fileName)
        if (downloadInfo != null) {
            val downloadFileName = downloadInfo.mFileName
            if (downloadFileName != null) {
                if (fileName == downloadFileName) {
                    return false
                }

                val saveFileName = com.android.vending.expansion.downloader.Helpers.generateSaveFileName(this, downloadFileName)
                val file = java.io.File(saveFileName)
                if (file.exists()) {
                    file.delete()
                }

                Log.i(TAG, "Deleting Partial Download file")
            }
        }

        return !com.android.vending.expansion.downloader.Helpers.doesFileExist(this, fileName, progress, true)
    }

    fun hasActiveInternetConnection(context: android.content.Context): Boolean {
        val wifiManager = context.getSystemService("wifi") as android.net.wifi.WifiManager
        if (wifiManager.isWifiEnabled) {
            return true
        }

        Log.d(TAG, "No network available!")
        return false
    }
}
