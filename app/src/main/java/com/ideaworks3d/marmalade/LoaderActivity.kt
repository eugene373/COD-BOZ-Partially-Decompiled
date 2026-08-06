package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.OrientationEventListener
import android.view.View
import android.widget.FrameLayout
import android.widget.RelativeLayout
import com.ideaworks3d.marmalade.event.ActivityResultEvent
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent
import android.database.Cursor

open class LoaderActivity : Activity() {
    companion object {
        private const val INTENT_CODE = 0x1e240

        @JvmField
        var m_Activity: LoaderActivity? = null
    }

    private var m_Data: Intent? = null
    @JvmField var m_FrameLayout: FrameLayout? = null
    @JvmField var m_IgnoreFocusLoss = false
    private var m_IntentBlocking = false
    @JvmField var m_ListenerManager: com.ideaworks3d.marmalade.event.ListenerManager? = null
    private var m_LoaderThread: LoaderThread? = null
    private var m_ProgressDialogHandler: Handler? = null
    @JvmField var m_TopLevel: RelativeLayout? = null
    private var m_TouchpadEvent: java.lang.reflect.Method? = null
    @JvmField var m_View: LoaderView? = null
    private var m_orientationEventListener: OrientationEventListener? = null

    private external fun onOrientationChangedNative()
    private external fun setART(isART: Boolean)

    private inner class DelayedResumeTask : AsyncTask<Void, Void, Void>() {
        @Synchronized
        override fun doInBackground(vararg params: Void?): Void? {
            try {
                synchronized(this) {
                Thread.sleep(300)
                }
            } catch (e: InterruptedException) {
            }
            return null
        }

        override fun onPostExecute(result: Void?) {
            if (isScreenOn()) {
                if (!isScreenLocked()) {
                    onResume()
                }
            } else {
                startDelayedResume()
            }
        }
    }

    inner class CursorCompleteListener {
        fun cursorLoadComplete(cursor: Cursor?) {}
    }

    private inner class ProgressDialogHandler : Handler() {
        private var m_Dialog: android.app.ProgressDialog? = null

        override fun handleMessage(msg: Message) {
            when (msg.what) {
                0 -> {
                    if (m_Dialog == null) {
                        m_Dialog = android.app.ProgressDialog(this@LoaderActivity)
                        m_Dialog?.setMessage("Loading...")
                        m_Dialog?.setIndeterminate(true)
                        m_Dialog?.setCancelable(false)
                        m_Dialog?.show()
                    }
                }
                1 -> {
                    m_Dialog?.dismiss()
                    m_Dialog = null
                }
            }
        }
    }

    @Suppress("DEPRECATION")
    private fun isScreenLocked(): Boolean {
        val keyguard = getSystemService("keyguard") as android.app.KeyguardManager
        return keyguard.inKeyguardRestrictedInputMode()
    }

    @Suppress("DEPRECATION")
    private fun isScreenOn(): Boolean {
        val powerManager = getSystemService("power") as android.os.PowerManager
        return powerManager.isScreenOn
    }

    private fun IsRunningART(): Boolean {
        val vmVersion = System.getProperty("java.vm.version")
        return vmVersion != null && !vmVersion.startsWith("1.")
    }

    private fun onKeyEvent(keyCode: Int, event: KeyEvent): Boolean {
        var result = false
        m_View?.let {
            result = it.onKeyEvent(keyCode, event)
        }
        return result
    }

    private fun startDelayedResume() {
        val task = DelayedResumeTask()
        task.execute()
    }

    private fun startLoader() {
        val assets = assets
        val filesDir = filesDir
        val view = m_View
        if (view != null) {
            m_LoaderThread = LoaderThread.getInstance(this, assets, filesDir, view)
        }
    }

    fun ExecuteIntent(intent: Intent): Intent? {
        m_Data = null
        m_IntentBlocking = true

        val thread = m_LoaderThread
        if (thread != null) {
            thread.runOnOSThread(object : Runnable {
                override fun run() {
                    try {
                        startActivityForResult(intent, INTENT_CODE)
                    } catch (e: Exception) {
                        LoaderAPI.trace("Could not start activity: " + e.message)
                    }
                }
            })
        }

        while (m_IntentBlocking) {
            LoaderAPI.s3eDeviceYield(20)
        }

        return m_Data
    }

    fun HideProgressDialog() {
        m_ProgressDialogHandler?.let {
            val msg = Message()
            msg.what = 1
            it.sendMessage(msg)
        }
    }

    fun LoaderThread(): LoaderThread? {
        return m_LoaderThread
    }

    fun ShowProgressDialog() {
        m_ProgressDialogHandler?.let {
            val msg = Message()
            msg.what = 0
            it.sendMessage(msg)
        }
    }

    fun createView(useGL: Boolean) {
        m_View?.let {
            m_FrameLayout?.removeView(it)
            m_View = null
            System.gc()
        }

        m_View = LoaderView(this, useGL)
        m_FrameLayout?.addView(m_View, 0)

        m_LoaderThread?.let {
            it.setView(m_View!!)
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        m_TouchpadEvent?.let { method ->
            try {
                val result = method.invoke(null, ev) as Boolean
                if (result) {
                    return true
                }
            } catch (e: Exception) {
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    fun getCursor(uri: Uri, projection: Array<String>, completeCallback: CursorCompleteListener) {
        val thread = m_LoaderThread
        if (thread != null) {
            thread.runOnOSThread(object : Runnable {
                override fun run() {
                    if (android.os.Build.VERSION.SDK_INT >= 11) {
                        CursorLoaderHelper.getCursor(uri, projection, completeCallback)
                    } else {
                        @Suppress("DEPRECATION")
                        val cursor = managedQuery(uri, projection, null, null, null)
                        completeCallback.cursorLoadComplete(cursor)
                    }
                }
            })
        }
    }

    fun getIgnoreFocusLoss(): Boolean = m_IgnoreFocusLoss

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == INTENT_CODE) {
            if (resultCode != -1) {
                LoaderAPI.trace("Intent cancelled")
                m_Data = null
            } else {
                var resultData = data
                if (resultData == null) {
                    resultData = Intent()
                }
                m_Data = resultData
            }
            m_IntentBlocking = false
        }

        val event = ActivityResultEvent(data, requestCode, resultCode)
        LoaderAPI.notifyActivityResultListeners(event)
    }

    override fun onConfigurationChanged(newConfig: android.content.res.Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.hardKeyboardHidden == 1) {
            m_View?.m_LoaderKeyboard?.hardKeyboardConfigurationChanged(true)
        } else if (newConfig.hardKeyboardHidden == 2) {
            m_View?.m_LoaderKeyboard?.hardKeyboardConfigurationChanged(false)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        System.loadLibrary("s3e_android")
        m_Activity = this

        m_ListenerManager = LoaderAPI.getListenerManager()

        setART(IsRunningART())

        @Suppress("DEPRECATION")
        val sdk = Integer.parseInt(android.os.Build.VERSION.SDK)
        if (sdk >= 9) {
            try {
                val cls = Class.forName("com.ideaworks3d.marmalade.s3eTouchpad")
                m_TouchpadEvent = cls.getMethod("onTouchEvent", MotionEvent::class.java)
            } catch (e: Exception) {
                m_TouchpadEvent = null
            }
        }

        m_ProgressDialogHandler = ProgressDialogHandler()
        m_TopLevel = RelativeLayout(this)
        m_FrameLayout = FrameLayout(this)
        m_TopLevel?.addView(m_FrameLayout)
        createView(false)
        setContentView(m_TopLevel)

        m_orientationEventListener = object : OrientationEventListener(this, 3) {
            override fun onOrientationChanged(orientation: Int) {
                onOrientationChangedNative()
            }
        }
        m_orientationEventListener?.enable()
        m_orientationEventListener?.canDetectOrientation()
    }

    override fun onDestroy() {
        if (m_Activity == this) {
            var terminateApp = false
            if (isFinishing && m_LoaderThread != null) {
                m_LoaderThread?.soundStop()
                m_LoaderThread?.audioStopAll()
                m_LoaderThread?.onDestroy()
                m_LoaderThread = null
                m_Activity = null
                terminateApp = m_View?.m_TerminateApplication ?: false
            }

            m_orientationEventListener?.disable()
            super.onDestroy()

            if (terminateApp) {
                android.os.Process.killProcess(android.os.Process.myPid())
            }
        } else {
            super.onDestroy()
        }
    }

    override fun onGenericMotionEvent(event: MotionEvent?): Boolean {
        return super.onGenericMotionEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyUp(keyCode, event)
    }

    override fun onLowMemory() {
        m_LoaderThread?.onLowMemory()
    }

    override fun onPause() {
        m_LoaderThread?.onPause()
        m_orientationEventListener?.disable()
        super.onPause()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        val event = RequestPermissionsResultEvent(requestCode, permissions, grantResults)
        LoaderAPI.notifyRequestPermissionsResultListeners(event)
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
        if (isScreenLocked()) {
            if (isScreenOn()) {
                startDelayedResume()
            }
        } else {
            m_orientationEventListener?.enable()
            m_LoaderThread?.onResume()
        }
    }

    override fun onStart() {
        super.onStart()
        startLoader()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
    }

    fun setIgnoreFocusLoss(ignore: Boolean) {
        m_IgnoreFocusLoss = ignore
    }

    @android.annotation.TargetApi(11)
    private object CursorLoaderHelper {
        fun getCursor(uri: Uri, projection: Array<String>, completeCallback: CursorCompleteListener) {
            val activity = m_Activity
            if (activity != null) {
                val loader = android.content.CursorLoader(activity, uri, projection, null, null, null)
                val cursor = loader.loadInBackground()
                completeCallback.cursorLoadComplete(cursor)
            }
        }
    }
}
