package com.ideaworks3d.studio

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Rect
import android.os.Build
import android.os.Environment
import android.os.StatFs
import android.util.DisplayMetrics
import android.util.Log
import android.view.Display
import android.view.WindowManager
import android.view.WindowMetrics
import android.content.res.Resources
import com.ideaworks3d.marmalade.LoaderActivity
import java.io.File

// NOTE: `IsDevice.GetInstance()`, `isActivated()`, and `IsDeviceKeyCallback(...)`
// are all resolved by-name from `libIsDevice.so` (JNI). Keep these spellings.
class IsDevice private constructor() : Cloneable {

    companion object {
        private const val TAG = "IsDevice"
        // File.separator is not a compile-time constant -> can't be `const val`.
        val EXP_PATH: String = File.separator + "Android" + File.separator + "obb" + File.separator

        @Volatile
        private var instance: IsDevice? = null

        @JvmStatic
        @Synchronized
        fun GetInstance(): IsDevice {
            if (instance == null) {
                instance = IsDevice()
            }
            return instance!!
        }

        // Alias so Java callers using the lowercase spelling resolve.
        @JvmStatic fun getInstance(): IsDevice = GetInstance()
    }

    private var m_IsActivated: Boolean = false
    var tabletThreshold: Int = 461

    val deviceMetrics: DisplayMetrics = DisplayMetrics()

    private val externalStorageDir: File = Environment.getExternalStorageDirectory()
    private val statFs: StatFs = StatFs(externalStorageDir.absolutePath)

    // JNI callback registered by libIsDevice.so — name preserved verbatim.
    external fun IsDeviceKeyCallback(keyCode: Int)

    fun IsActivated(): Boolean = m_IsActivated

    fun GetExpansionPath(): String {
        val path = Environment.getExternalStorageDirectory().toString() +
                EXP_PATH +
                LoaderActivity.m_Activity!!.packageName +
                File.separator
        Log.i(TAG, "Expansion Path: $path")
        return path
    }

    fun Activate() {
        m_IsActivated = true
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

        val widthInches = deviceMetrics.widthPixels / deviceMetrics.xdpi
        val heightInches = deviceMetrics.heightPixels / deviceMetrics.ydpi
        val screenSize = (widthInches * widthInches + heightInches * heightInches).toInt()

        return when {
            screenSize >= this.tabletThreshold -> 3 // Tablet
            screenSize > 0 -> 2 // Phone
            else -> 1 // Unknown or small display
        }
    }

    @TargetApi(Build.VERSION_CODES.R)
    private fun getDisplayMetricsApi30Plus() {
        val wm = LoaderActivity.m_Activity!!.getSystemService(Context.WINDOW_SERVICE) as? WindowManager
        if (wm != null) {
            val metrics: WindowMetrics = wm.currentWindowMetrics
            val bounds: Rect = metrics.bounds
            deviceMetrics.widthPixels = bounds.width()
            deviceMetrics.heightPixels = bounds.height()
            deviceMetrics.xdpi = Resources.getSystem().displayMetrics.xdpi
            deviceMetrics.ydpi = Resources.getSystem().displayMetrics.ydpi
        }
    }

    @Suppress("DEPRECATION")
    private fun getDisplayMetricsLegacy() {
        val display: Display = LoaderActivity.m_Activity!!
            .windowManager
            .defaultDisplay

        display.getMetrics(this.deviceMetrics)
    }

    fun IsDeviceGetExternalResources(param1: Int, param2: Int): Array<String> = arrayOf("stub", "stub")

    fun IsDeviceGetAvailableBlocks(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val blocks = statFs.availableBlocksLong
        return if (blocks > Int.MAX_VALUE.toLong()) Int.MAX_VALUE else blocks.toInt()
    }

    fun IsDeviceGetBlockCount(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val blocks = statFs.blockCountLong
        return if (blocks > Int.MAX_VALUE.toLong()) Int.MAX_VALUE else blocks.toInt()
    }

    fun IsDeviceGetBlockSize(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val size = statFs.blockSizeLong
        return if (size > Int.MAX_VALUE.toLong()) Int.MAX_VALUE else size.toInt()
    }

    fun IsDeviceGetFreeBlocks(): Int {
        statFs.restat(externalStorageDir.absolutePath)
        val blocks = statFs.freeBlocksLong
        return if (blocks > Int.MAX_VALUE.toLong()) Int.MAX_VALUE else blocks.toInt()
    }

    fun IsDeviceGetAbsolutePath(): String {
        val absolutePath = Environment.getExternalStorageDirectory().absolutePath + "/Android/data/"
        Log.v(TAG, "AbsolutePath returning: $absolutePath")
        return absolutePath
    }

    public override fun clone(): Any {
        throw CloneNotSupportedException()
    }
}
