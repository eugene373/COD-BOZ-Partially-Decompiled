package com.ideaworks3d.studio

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.os.Environment
import android.os.StatFs
import android.graphics.Rect
import android.util.DisplayMetrics
import android.util.Log
import android.view.Display
import android.view.WindowManager
import android.view.WindowMetrics
import android.content.res.Resources
import java.io.File
import com.ideaworks3d.marmalade.LoaderActivity

class IsDevice : Cloneable {
    companion object {
        private const val TAG = "IsDevice"
        private const val EXP_PATH = "/Android/obb/"
        private var instance: IsDevice? = null

        @JvmStatic
        fun GetInstance(): IsDevice {
            synchronized(this) {
                if (instance == null) {
                    instance = IsDevice()
                }
                return instance!!
            }
        }
    }

    var isActivated = false
    var tabletThreshold = 461
    val deviceMetrics = DisplayMetrics()

    private val externalStorageDir = Environment.getExternalStorageDirectory()
    private val statFs = StatFs(externalStorageDir.absolutePath)

    fun IsActivated(): Boolean = isActivated

    fun GetExpansionPath(): String {
        val activity = LoaderActivity.m_Activity!!
        val path = Environment.getExternalStorageDirectory().absolutePath +
                EXP_PATH +
                activity.packageName +
                File.separator
        Log.i(TAG, "Expansion Path: $path")
        return path
    }

    fun Activate() {
        isActivated = true
    }

    fun IsDeviceSetTabletThreshold(threshold: Int): Int {
        tabletThreshold = threshold
        return tabletThreshold
    }

    fun IsDeviceGetDisplayType(): Int {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getDisplayMetricsApi30Plus()
        } else {
            getDisplayMetricsLegacy()
        }

        val widthInches = deviceMetrics.widthPixels.toFloat() / deviceMetrics.xdpi
        val heightInches = deviceMetrics.heightPixels.toFloat() / deviceMetrics.ydpi
        val screenSize = (widthInches * widthInches + heightInches * heightInches).toInt()

        return when {
            screenSize >= tabletThreshold -> 3  // Tablet
            screenSize > 0 -> 2                 // Phone
            else -> 1                           // Unknown or small display
        }
    }

    @TargetApi(Build.VERSION_CODES.R)
    private fun getDisplayMetricsApi30Plus() {
        val wm = LoaderActivity.m_Activity!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager?
        wm?.let {
            val metrics = it.currentWindowMetrics
            val bounds = metrics.bounds
            deviceMetrics.widthPixels = bounds.width()
            deviceMetrics.heightPixels = bounds.height()
            deviceMetrics.xdpi = Resources.getSystem().displayMetrics.xdpi
            deviceMetrics.ydpi = Resources.getSystem().displayMetrics.ydpi
        }
    }

    @Suppress("DEPRECATION")
    private fun getDisplayMetricsLegacy() {
        val display = LoaderActivity.m_Activity!!.windowManager.defaultDisplay
        display.getMetrics(deviceMetrics)
    }

    fun IsDeviceGetExternalResources(param1: Int, param2: Int): Array<String> {
        return arrayOf("stub", "stub")
    }

    fun IsDeviceGetAvailableBlocks(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val blocks = statFs.availableBlocksLong
        return if (blocks > Int.MAX_VALUE) Int.MAX_VALUE else blocks.toInt()
    }

    fun IsDeviceGetBlockCount(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val blocks = statFs.blockCountLong
        return if (blocks > Int.MAX_VALUE) Int.MAX_VALUE else blocks.toInt()
    }

    fun IsDeviceGetBlockSize(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val size = statFs.blockSizeLong
        return if (size > Int.MAX_VALUE) Int.MAX_VALUE else size.toInt()
    }

    fun IsDeviceGetFreeBlocks(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val blocks = statFs.freeBlocksLong
        return if (blocks > Int.MAX_VALUE) Int.MAX_VALUE else blocks.toInt()
    }

    fun IsDeviceGetAbsolutePath(): String {
        val absolutePath = Environment.getExternalStorageDirectory().absolutePath + "/Android/data/"
        Log.v(TAG, "AbsolutePath returning: $absolutePath")
        return absolutePath
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

    override fun clone(): Any {
        throw CloneNotSupportedException()
    }

    external fun IsDeviceKeyCallback(keyCode: Int)
}