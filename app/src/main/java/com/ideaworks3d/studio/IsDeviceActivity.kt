package com.ideaworks3d.studio

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import com.android.vending.expansion.zipfile.ZipResourceFile
import com.ideaworks3d.marmalade.LoaderActivity
import com.savegame.SavesRestoring

open class IsDeviceActivity : LoaderActivity() {
    companion object {
        val SALT: ByteArray = byteArrayOf(
            -0x2e, 0x41, 0x1e, -0x80, -0x67, -0x39, 0x4a, -0x40,
            0x33, 0x58, -0x5f, -0x2d, 0x4d, -0x75, -0x24, -0x71,
            -0x0b, 0x20, -0x40, 0x59
        )

        const val STATUS_SUCCESS = 0xc8

        private var m_Activity: IsDeviceActivity? = null

        @JvmStatic
        fun getInstance(): IsDeviceActivity? = m_Activity
    }

    private val TAG: String = "IsDeviceActivity"
    private var mAPKExtensionFile: ZipResourceFile? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        SavesRestoring.DoSmth(this)

        // Set cutout mode before super.onCreate
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            window.attributes.apply {
                layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            }
        }

        super.onCreate(savedInstanceState)
        m_Activity = this
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_POWER || keyCode == KeyEvent.KEYCODE_HOME) {
            Log.v(TAG, "onKeyDown Received: $keyCode")
            if (IsDevice.GetInstance().IsActivated()) {
                IsDevice.GetInstance().IsDeviceKeyCallback(keyCode)
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

    @Suppress("DEPRECATION")
    private fun applyLegacyImmersiveMode() {
        val flags = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_IMMERSIVE)

        window.decorView.systemUiVisibility = flags
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if (hasFocus) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                // Android 11+ (API 30+)
                val insetsController = window.insetsController
                insetsController?.let {
                    it.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
                    it.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                }
                window.setDecorFitsSystemWindows(false)
            } else {
                applyLegacyImmersiveMode()
            }
        }

        if (!hasFocus && IsDevice.GetInstance().IsActivated()) {
            IsDevice.GetInstance().IsDeviceKeyCallback(KeyEvent.KEYCODE_HOME)
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