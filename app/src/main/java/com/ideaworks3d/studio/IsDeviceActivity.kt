package com.ideaworks3d.studio

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import com.ideaworks3d.marmalade.LoaderActivity
import com.savegame.SavesRestoring

open class IsDeviceActivity : LoaderActivity() {

    companion object {
        private const val TAG = "IsDeviceActivity"
        @JvmStatic
        private var m_Activity: IsDeviceActivity? = null

        // Called by Marmalade's s3eLibraryLoad / libIsDevice.so.
        // Native code resolves this exact static symbol by name — do not rename.
        @JvmStatic
        fun getInstance(): IsDeviceActivity? = m_Activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        SavesRestoring.doSmth(this)

        // Set cutout mode before super.onCreate or setContentView
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val lp = window.attributes
            lp.layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            window.attributes = lp
        }

        super.onCreate(savedInstanceState)
        m_Activity = this
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_POWER || keyCode == KeyEvent.KEYCODE_HOME) {
            Log.v(TAG, "onKeyDown Received: $keyCode")
            if (IsDevice.getInstance().IsActivated()) {
                IsDevice.getInstance().IsDeviceKeyCallback(keyCode)
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
                if (insetsController != null) {
                    insetsController.hide(
                        WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars()
                    )
                    insetsController.setSystemBarsBehavior(
                        WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                    )
                }
                window.setDecorFitsSystemWindows(false)
            } else {
                applyLegacyImmersiveMode()
            }
        }

        if (!hasFocus && IsDevice.getInstance().IsActivated()) {
            IsDevice.getInstance().IsDeviceKeyCallback(KeyEvent.KEYCODE_HOME)
        }
    }
}
