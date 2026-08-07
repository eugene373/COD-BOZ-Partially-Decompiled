package com.ideaworks3d.marmalade

import android.app.Activity
import android.app.KeyguardManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.database.Cursor
import android.net.Uri
import android.os.AsyncTask
import android.os.Build.VERSION
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.os.PowerManager
import android.os.Process
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.OrientationEventListener
import android.widget.FrameLayout
import android.widget.RelativeLayout
import com.ideaworks3d.marmalade.event.ActivityResultEvent
import com.ideaworks3d.marmalade.event.ListenerManager
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent

open class LoaderActivity : Activity() {
    @JvmField var m_ListenerManager: ListenerManager? = null
    private var m_LoaderThread: LoaderThread? = null
    @JvmField var m_View: LoaderView? = null
    @JvmField var m_TopLevel: RelativeLayout? = null
    @JvmField var m_FrameLayout: FrameLayout? = null
    @JvmField var m_IgnoreFocusLoss = false
    @Volatile private var m_IntentBlocking = false
    private var m_ExecuteIntentActivityNotFoundException = false
    private var m_Data: Intent? = null
    private var m_ProgressDialogHandler: Handler? = null
    private var m_orientationEventListener: OrientationEventListener? = null
    private var m_LegacySuspendMode = false

    private external fun onOrientationChangedNative()
    private external fun setART(art: Boolean)

    fun LoaderThread(): LoaderThread = m_LoaderThread!!

    init {
        trace("XXX new LoaderActivity XXX: $this")
    }

    override fun attachBaseContext(base: Context) {
        trace("XXX attachBaseContext XXX")
        super.attachBaseContext(base)
        try {
            Class.forName("android.support.multidex.MultiDex")
        } catch (_: ClassNotFoundException) {
            trace("XXX Multidex support library is not detected XXX")
            return
        }
        trace("XXX Installing multidex XXX")
        // MultiDex.install(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        trace("XXX onCreate XXX")
        super.onCreate(savedInstanceState)
        if (m_Activity != null) {
            trace("XXX onCreate called while another activity is still active")
        }
        val lib = "s3e_android"
        trace("XXX Loading Library XXX: $lib")
        System.loadLibrary(lib)
        m_Activity = this
        trace("XXX Loaded Library XXX: $lib")
        m_ListenerManager = LoaderAPI.getListenerManager()
        setART(IsRunningART())
        trace("XXX onCreate: $requestedOrientation")
        m_ProgressDialogHandler = ProgressDialogHandler()
        m_TopLevel = RelativeLayout(this)
        m_FrameLayout = FrameLayout(this)
        m_TopLevel!!.addView(m_FrameLayout)
        createView(false)
        setContentView(m_TopLevel)
        m_orientationEventListener = object : OrientationEventListener(this, 3) {
            override fun onOrientationChanged(orientation: Int) {
                onOrientationChangedNative()
            }
        }
        m_orientationEventListener!!.enable()
        if (!m_orientationEventListener!!.canDetectOrientation()) {
            trace("failed to get orientation events")
        }
    }

    open fun createView(gl: Boolean) {
        trace("createView: gl=$gl")
        if (m_View != null) {
            trace("Freeing the existing View")
            m_FrameLayout!!.removeView(m_View)
            m_View = null
            System.gc()
        }
        m_View = LoaderView(this, gl)
        m_FrameLayout!!.addView(m_View, 0)
        m_LoaderThread?.setView(m_View!!)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        trace("XXX onWindowFocusChanged XXX $hasFocus")
        super.onWindowFocusChanged(hasFocus)
        trace("XXX onWindowFocusChanged done XXX")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        trace("XXX onConfigurationChanged XXX")
        super.onConfigurationChanged(newConfig)
        if (newConfig.hardKeyboardHidden == 1) {
            m_View!!.m_LoaderKeyboard!!.hardKeyboardConfigurationChanged(true)
        } else if (newConfig.hardKeyboardHidden == 2) {
            m_View!!.m_LoaderKeyboard!!.hardKeyboardConfigurationChanged(false)
        }
        trace("XXX onConfigurationChanged done XXX")
    }

    override fun onStart() {
        trace("XXX onStart XXX")
        super.onStart()
        startLoader()
        trace("XXX done onStart XXX")
    }

    override fun onRestart() {
        trace("XXX onRestart XXX")
        super.onRestart()
        trace("XXX onRestart done XXX")
    }

    public override fun onResume() {
        trace("XXX onResume XXX")
        super.onResume()
        if (isScreenLocked) {
            trace("XXX onResume screen is locked, will not resume the app immediately XXX")
            if (isScreenOn) {
                trace("XXX onResume starting delayed resume XXX")
                startDelayedResume()
                return
            }
        } else {
            trace("XXX onResume screen is not locked, will resume the app XXX")
            m_orientationEventListener!!.enable()
            m_LoaderThread?.onResume()
        }
        trace("XXX onResume done XXX")
    }

    override fun onPause() {
        trace("XXX onPause XXX")
        if (isReadyForSuspend(true)) {
            trace("XXX onPause not multi-window XXX")
            m_LoaderThread?.onStop()
            m_orientationEventListener!!.disable()
        }
        super.onPause()
        trace("XXX onPause done XXX")
    }

    public override fun onStop() {
        trace("XXX onStop XXX")
        if (isReadyForSuspend(false)) {
            trace("XXX onStop multi-window XXX")
            m_LoaderThread?.onStop()
            m_orientationEventListener!!.disable()
        }
        super.onStop()
        trace("XXX onStop done XXX")
    }

    override fun onDestroy() {
        if (m_Activity !== this) {
            trace("XXX onDestroy XXX: skipped")
            super.onDestroy()
            return
        }
        trace("XXX onDestroy XXX: finishing=$isFinishing")
        var terminate = false
        if (isFinishing && m_LoaderThread != null) {
            m_LoaderThread!!.soundStop()
            m_LoaderThread!!.audioStopAll()
            m_LoaderThread!!.onDestroy()
            m_LoaderThread = null
            m_Activity = null
            terminate = m_View!!.m_TerminateApplication
        }
        m_orientationEventListener!!.disable()
        super.onDestroy()
        trace("XXX onDestroy done XXX")
        if (terminate) {
            Process.killProcess(Process.myPid())
        }
    }

    override fun onLowMemory() {
        trace("XXX onLowMemory XXX")
        m_LoaderThread?.onLowMemory()
    }

    private val isScreenLocked: Boolean
        get() {
            val km = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
            return km.inKeyguardRestrictedInputMode()
        }

    private val isScreenOn: Boolean
        get() {
            val pm = getSystemService(Context.POWER_SERVICE) as PowerManager
            return pm.isScreenOn
        }

    private fun startDelayedResume() {
        trace("XXX startDelayedResume XXX")
        DelayedResumeTask().execute()
    }

    private fun startLoader() {
        m_LoaderThread = LoaderThread.getInstance(this, assets, filesDir, m_View!!)
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean =
        if (s3eTouchpad.onTouchEvent(ev)) true else super.dispatchTouchEvent(ev)

    private fun onKeyEvent(keyCode: Int, action: Int, event: KeyEvent): Boolean {
        trace("onKeyEvent $keyCode")
        return if (m_View != null) m_View!!.onKeyEvent(keyCode, action, event) else false
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean =
        if (onKeyEvent(keyCode, 1, event)) true else super.onKeyDown(keyCode, event)

    override fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean =
        if (onKeyEvent(keyCode, 0, event)) true else super.onKeyUp(keyCode, event)

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        if (!event.characters.isNullOrEmpty() && event.keyCode == 0) {
            when (event.action) {
                0 -> onKeyEvent(0, 1, event)
                1 -> onKeyEvent(0, 0, event)
                2 -> onKeyEvent(0, 1, event)
            }
        }
        return super.dispatchKeyEvent(event)
    }

    fun getIgnoreFocusLoss(): Boolean = m_IgnoreFocusLoss

    fun setIgnoreFocusLoss(value: Boolean) {
        m_IgnoreFocusLoss = value
    }

    fun ExecuteIntent(intent: Intent): Intent? {
        m_Data = null
        m_IntentBlocking = true
        m_ExecuteIntentActivityNotFoundException = false
        if (m_LoaderThread == null) return null
        LoaderThread().runOnOSThread {
            try {
                this@LoaderActivity.startActivityForResult(intent, INTENT_CODE)
            } catch (e: ActivityNotFoundException) {
                this@LoaderActivity.m_ExecuteIntentActivityNotFoundException = true
                LoaderAPI.trace("Could not start activity: ${e.message}")
            } catch (e: Exception) {
                LoaderAPI.trace("Could not start activity: ${e.message}")
            }
        }
        while (m_IntentBlocking) {
            trace("waiting for intent to finish")
            LoaderAPI.s3eDeviceYield(20)
        }
        trace("intent done")
        return m_Data
    }

    fun executeIntentActivityNotFoundException(): Boolean = m_ExecuteIntentActivityNotFoundException

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var resultData = data
        if (requestCode == INTENT_CODE) {
            if (resultCode != -1) {
                LoaderAPI.trace("Intent cancelled")
                m_Data = null
            } else {
                if (resultData == null) resultData = Intent()
                m_Data = resultData
            }
            m_IntentBlocking = false
        }
        LoaderAPI.notifyActivityResultListeners(ActivityResultEvent(resultData, requestCode, resultCode))
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        LoaderAPI.notifyRequestPermissionsResultListeners(RequestPermissionsResultEvent(requestCode, permissions, grantResults))
    }

    fun getCursor(uri: Uri, projection: Array<String>, complete: CursorCompleteListener) {
        LoaderThread().runOnOSThread {
            trace("Creating cursor")
            if (VERSION.SDK_INT >= 11) {
                trace("Using async cursor")
                CursorLoaderHelper.getCursor(uri, projection, complete)
            } else {
                trace("Using legacy cursor")
                val cursor: Cursor = this@LoaderActivity.managedQuery(uri, projection, null, null, null)
                complete.cursorLoadComplete(cursor)
            }
        }
    }

    fun ShowProgressDialog() {
        m_ProgressDialogHandler?.sendMessage(obtainMessage(0))
    }

    fun HideProgressDialog() {
        m_ProgressDialogHandler?.sendMessage(obtainMessage(1))
    }

    private fun obtainMessage(what: Int): Message = Message().apply { this.what = what }

    override fun onNewIntent(intent: Intent) {
        trace("onNewIntent")
        super.onNewIntent(intent)
        LoaderAPI.notifyNewIntentListeners(NewIntentEvent(NewIntentEvent.EventType.NEWINTENT, intent))
        trace("onNewIntent done")
    }

    private fun IsRunningART(): Boolean {
        val version = System.getProperty("java.vm.version")
        val isDalvik = version != null && version.startsWith("1.")
        if (isDalvik) trace("Running under Dalvik: $version") else trace("Running under ART: $version")
        return !isDalvik
    }

    fun isReadyForSuspend(fromPause: Boolean): Boolean {
        var multiWindow = false
        if (VERSION.SDK_INT >= 24) {
            multiWindow = isInMultiWindowMode
        }
        var ready = false
        if (fromPause) {
            ready = !multiWindow
            m_LegacySuspendMode = ready
        } else {
            ready = !m_LegacySuspendMode
            m_LegacySuspendMode = false
        }
        trace("Ready for suspend ($fromPause, $multiWindow) $ready $m_LegacySuspendMode")
        return ready
    }

    interface CursorCompleteListener {
        fun cursorLoadComplete(cursor: Cursor?)
    }

    private class DelayedResumeTask : AsyncTask<Void, Void, Void>() {
        override fun doInBackground(vararg params: Void): Void? {
            trace("XXX DelayedResumeTask doInBackground XXX")
            try {
                synchronized(this) { (this as Object).wait(300) }
            } catch (_: InterruptedException) {
                trace("Delayed resume task was interrupted")
            }
            return null
        }

        override fun onPostExecute(result: Void?) {
            trace("XXX DelayedResumeTask onPostExecute XXX")
            val activity = m_Activity ?: return
            if (activity.isScreenOn) {
                if (!activity.isScreenLocked) {
                    trace("XXX Screen is on, device is unlocked, will resume the app XXX")
                    activity.onResume()
                } else {
                    trace("XXX Screen is on, device is still locked, starting delayed resume again XXX")
                    activity.startDelayedResume()
                }
            }
        }

        private fun trace(msg: String) {
            LoaderAPI.traceChan("LoaderActivity${'$'}DelayedResumeTask-" + Thread.currentThread().name, msg)
        }
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
        @JvmField
        var m_Activity: LoaderActivity? = null
        private const val INTENT_CODE = 123456
    }
}
