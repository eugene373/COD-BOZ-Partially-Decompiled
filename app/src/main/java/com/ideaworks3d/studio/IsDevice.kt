package com.ideaworks3d.studio

import android.os.Environment
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import com.ideaworks3d.marmalade.LoaderActivity
import java.io.File
class IsDevice : Cloneable {
    companion object {
        const val TAG = "IsDevice"

        @JvmStatic
        private var s_Instance: IsDevice? = null

        @JvmStatic
        fun GetInstance(): IsDevice {
            synchronized(this) {
                if (s_Instance == null) {
                    s_Instance = IsDevice()
                }
                return s_Instance!!
            }
        }
    }

    private val eGeneric = 1
    private val eSmartphone = 2
    private val eTablet = 3

    private var m_CurrentDirectory: File? = null
    var m_DeviceMetrics: DisplayMetrics = DisplayMetrics()
    private var m_IsActivated = false
    var m_MainExpansion: com.android.vending.expansion.downloader.impl.DownloadInfo? = null
    private var m_StatFs: android.os.StatFs? = null

    var TabletThreshold: Int = 0x1cd

    private constructor() {
        m_CurrentDirectory = Environment.getExternalStorageDirectory()
        m_StatFs = android.os.StatFs(m_CurrentDirectory!!.absolutePath)
        s_Instance = this
    }

    fun Activate() {
        m_IsActivated = true
    }

    fun IsActivated(): Boolean {
        return m_IsActivated
    }

    external fun IsDeviceKeyCallback(keyCode: Int)

    fun GetExpansionPath(): String {
        val activity = LoaderActivity.m_Activity!!
        val saveFilePath = com.android.vending.expansion.downloader.Helpers.getSaveFilePath(activity)
        val result = StringBuilder(saveFilePath).append(File.separator).toString()
        Log.i("IsDevice", "Expansion Path: $result")
        return result
    }

    fun GetMainExpansionFilename(): String {
        val activity = LoaderActivity.m_Activity!!
        try {
            val packageManager = activity.packageManager
            val packageInfo = packageManager.getPackageInfo(activity.packageName, 0)
            val versionCode = packageInfo.versionCode

            val builder = StringBuilder()
            builder.append("main.")
            builder.append(versionCode)
            builder.append(".")
            builder.append(activity.packageName)
            builder.append(".obb")
            return builder.toString()
        } catch (e: android.content.pm.PackageManager.NameNotFoundException) {
            return ""
        }
    }

    fun GetMainExpansionUri(): String {
        m_MainExpansion?.let {
            return it.mUri ?: ""
        }
        return ""
    }

    fun GetMainExpansionFileSize(): Long {
        m_MainExpansion?.let {
            return it.mTotalBytes
        }
        return 0
    }

    fun IsDeviceGetMainExpansionFileSize(): Int {
        val expansionPath = GetExpansionPath()
        val fileName = GetMainExpansionFilename()
        val fullPath = expansionPath + fileName

        Log.i("IsDevice", "IsDeviceGetMainExpansionFileSize value $fullPath")
        val file = File(fullPath)

        if (!file.exists()) {
            return 0
        }

        Log.i("IsDevice", "IsDeviceGetMainExpansionFileSize size " + file.length() / 0x400)
        return (file.length() / 0x400).toInt()
    }

    fun IsDeviceGetDisplayType(): Int {
        val activity = LoaderActivity.m_Activity!!
        val windowManager = activity.windowManager
        val display = windowManager.defaultDisplay
        display.getMetrics(m_DeviceMetrics)

        val widthInches = m_DeviceMetrics.widthPixels / m_DeviceMetrics.xdpi.toDouble()
        val heightInches = m_DeviceMetrics.heightPixels / m_DeviceMetrics.ydpi.toDouble()
        val diagonal = Math.sqrt(widthInches * widthInches + heightInches * heightInches).toInt()

        if (diagonal >= TabletThreshold) {
            return eTablet
        } else if (diagonal > 0) {
            return eSmartphone
        }
        return eGeneric
    }

    @Suppress("DEPRECATION")
    fun IsDeviceGetAvailableBlocks(): Int {
        val directory = m_CurrentDirectory
        directory?.let {
            m_StatFs?.restat(it.absolutePath)
            return m_StatFs?.getAvailableBlocks() ?: 0
        }
        return 0
    }

    @Suppress("DEPRECATION")
    fun IsDeviceGetBlockCount(): Int {
        val directory = m_CurrentDirectory
        directory?.let {
            m_StatFs?.restat(it.absolutePath)
            return m_StatFs?.getBlockCount() ?: 0
        }
        return 0
    }

    @Suppress("DEPRECATION")
    fun IsDeviceGetBlockSize(): Int {
        val directory = m_CurrentDirectory
        directory?.let {
            m_StatFs?.restat(it.absolutePath)
            return m_StatFs?.getBlockSize() ?: 0
        }
        return 0
    }

    @Suppress("DEPRECATION")
    fun IsDeviceGetFreeBlocks(): Int {
        val directory = m_CurrentDirectory
        directory?.let {
            m_StatFs?.restat(it.absolutePath)
            return m_StatFs?.getFreeBlocks() ?: 0
        }
        return 0
    }

    fun IsDeviceGetFreeStorage(): Int {
        return -1
    }

    fun IsDeviceGetAbsolutePath(): String {
        val path = Environment.getExternalStorageDirectory().absolutePath + "/Android/data/"
        Log.v("IsDevice", "AbsolutePath returning: $path")
        return path
    }

    fun IsDeviceGetExternalResources(intentType: Int, requestCode: Int): Array<String> {
        return arrayOf("stub", "stub")
    }

    fun IsDeviceSetPublicKey(key: String) {
    }

    fun IsDeviceSetTabletThreshold(threshold: Int): Int {
        TabletThreshold = threshold
        return TabletThreshold
    }

    fun SetDownloadInfo(downloadInfo: com.android.vending.expansion.downloader.impl.DownloadInfo) {
        m_MainExpansion = downloadInfo
    }

    @Throws(CloneNotSupportedException::class)
    override fun clone(): Any {
        throw CloneNotSupportedException()
    }
}
