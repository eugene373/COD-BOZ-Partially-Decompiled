package com.ideaworks3d.marmalade

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.content.res.AssetFileDescriptor
import android.content.res.AssetManager
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.AudioManager
import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.media.MediaPlayer.OnErrorListener
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.Uri
import android.net.wifi.WifiManager
import android.net.wifi.WifiManager.MulticastLock
import android.os.Build
import android.os.Environment
import android.os.Handler
import android.os.ParcelFileDescriptor
import android.provider.Settings.Secure
import android.text.ClipboardManager
import android.util.DisplayMetrics
import android.view.MotionEvent
import android.view.WindowManager
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

open class LoaderThread : Thread, SensorEventListener {
    private var m_AppDoingInitTerm = 0
    private var m_DidSuspendForSurfaceChange = false
    private var m_TelephonyManagerExistsKnown = false
    private var m_TelephonyManagerExists = false
    private var m_SkipNextChange = false
    private var m_IgnoreResizeWhilePaused = false
    private var m_MediaPlayerManager: MediaPlayerManager = MediaPlayerManager()
    private var m_BatteryLevel = 0
    private var m_ChargerConnected = false

    private val m_BatteryLevelReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            m_BatteryLevel = intent.getIntExtra("level", 0)
            val was = m_ChargerConnected
            m_ChargerConnected = intent.getIntExtra("plugged", 0) != 0
            if (was != m_ChargerConnected) {
                trace("m_ChargerConnected = $m_ChargerConnected")
                chargerStateChanged(m_ChargerConnected)
            }
        }
    }

    private val m_NetworkCheckReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val ni: NetworkInfo? = cm.activeNetworkInfo
            if (ni != null && ni.isAvailable && ni.isConnected) {
                trace("network check -> on")
                networkCheckChanged(true)
            } else {
                trace("network check -> off")
                networkCheckChanged(false)
            }
        }
    }

    private var m_NetworkCheckEnabled = false
    private val m_Handler: Handler = Handler()
    private var m_FileRoot: File? = null
    private var m_Loader: LoaderActivity? = null
    private var m_View: LoaderView? = null
    private var m_Location: LoaderLocation? = null
    private var m_Assets: AssetManager? = null
    private var m_SoundPlayer: SoundPlayer = SoundPlayer()
    private var m_SoundRecord: SoundRecord? = null
    private var m_UseGL = false
    private var m_SensorManager: SensorManager? = null
    private var m_Accelerometer: Sensor? = null
    private var m_Compass: Sensor? = null
    private var m_Orientation: Sensor? = null
    private var m_FixScreenOrientation = 0
    private var m_StartScreenOrientation = 0
    private var m_Stopped: Boolean = false
    private var m_ResumeInProgress: Boolean = false
    private var m_VideoIsPaused: Boolean = false
    private var m_Started: Boolean = false
    private var m_Terminating: Boolean = false
    private var m_LoaderSMSReceiver: LoaderSMSReceiver? = null
    @JvmField var m_OnTouchWait: java.lang.Integer = java.lang.Integer.valueOf(0) as java.lang.Integer
    private var m_TouchMulti = false
    private var m_MulticastLock: MulticastLockFacade? = null

    private val m_RunOnOSThread: Runnable = Runnable { runOnOSTickNative() }

    private val m_CreateView: Runnable = Runnable {
        m_Loader!!.createView(m_UseGL)
        synchronized(m_CreateView) { (m_CreateView as Object).notify() }
    }

    private var m_BatteryLevelReceiverRegistered = false
    private var m_splashFinished = false

    private external fun runNative(p0: String, p1: String, p2: String)
    private external fun setViewNative(p0: LoaderView)
    private external fun shutdownNative()
    private external fun initNative()
    private external fun onAccelNative(p0: Float, p1: Float, p2: Float)
    private external fun onCompassNative(p0: Int, p1: Float, p2: Float, p3: Float)
    private external fun runOnOSThreadNative(p0: Runnable)
    private external fun runOnOSTickNative()
    private external fun signalSuspend(p0: Boolean): Boolean
    private external fun signalResume(p0: Boolean): Boolean
    private external fun lowMemoryWarning()
    external fun onMotionEvent(p0: Int, p1: Int, p2: Int, p3: Int)
    private external fun audioStoppedNotify(p0: Int)
    private external fun chargerStateChanged(p0: Boolean)
    private external fun networkCheckChanged(p0: Boolean)
    private external fun suspendAppThreads()
    private external fun resumeAppThreads()

    fun suspendForSurfaceChange() {
        if (m_AppDoingInitTerm == 0 && !m_ResumeInProgress) {
            trace("suspending app threads for surface change")
            suspendAppThreads()
            m_DidSuspendForSurfaceChange = true
        } else {
            trace("skipping suspendAppThreads after surface change")
        }
    }

    fun resumeAfterSurfaceChange() {
        if (m_DidSuspendForSurfaceChange) {
            trace("resuming app threads after surface change")
            m_DidSuspendForSurfaceChange = false
            resumeAppThreads()
        } else {
            trace("skipping resumeAppThreads after surface change")
        }
    }

    fun skipSurfaceChange(): Boolean {
        if (m_IgnoreResizeWhilePaused) {
            if (m_Stopped && m_FixScreenOrientation != 4) {
                m_SkipNextChange = true
                return true
            }
            if (!m_Stopped && m_SkipNextChange) {
                m_SkipNextChange = false
                return true
            }
        }
        return false
    }

    fun audioStopAll() {
        m_MediaPlayerManager.audioStopAll()
    }

    fun soundSetVolume(p0: Int) {
        trace("soundSetVolume")
        m_SoundPlayer.setVolume(p0)
    }

    fun getStarted(): Boolean = m_Started

    private constructor(loader: LoaderActivity, assets: AssetManager, fileRoot: File) {
        m_Assets = assets
        trace("this $this")
        trace("m_Loader $loader")
        m_Loader = loader
        m_StartScreenOrientation = 1
        m_FixScreenOrientation = loader.requestedOrientation
        trace("LoaderThread m_FixScreenOrientation : $m_FixScreenOrientation, m_StartScreenOrientation=$m_StartScreenOrientation")
        m_FileRoot = fileRoot
        m_SoundPlayer = SoundPlayer()
        m_MediaPlayerManager = MediaPlayerManager()
        trace("registerReceiver")
        loader.registerReceiver(m_BatteryLevelReceiver, IntentFilter("android.intent.action.BATTERY_CHANGED"))
        m_BatteryLevelReceiverRegistered = true
        m_SensorManager = loader.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        try {
            val f = File(m_FileRoot, "makeramdirectory.txt")
            if (f.mkdirs()) {
                trace("Created directory: " + f.absoluteFile.parent)
            }
            f.delete()
        } catch (e: Exception) {
            trace("Error creating directory: ${e.message}")
        }
        initNative()
    }

    fun setView(view: LoaderView) {
        if (m_View != null) {
            synchronized(m_View!!) {
                if (m_View != null) {
                    (m_View as Object).notify()
                }
            }
        }
        m_View = view
        m_StartScreenOrientation = view.getCurrentOrientation()
        doFixOrientation()
        setViewNative(view)
    }

    companion object {
        @JvmStatic
        var g_Singleton: LoaderThread? = null

        @JvmStatic
        fun getInstance(loader: LoaderActivity, assets: AssetManager, filesDir: File, view: LoaderView): LoaderThread {
            if (g_Singleton == null) {
                LoaderAPI.traceChan("LoaderThread-${Thread.currentThread().name}", "creating new marmalade thread")
                g_Singleton = LoaderThread(loader, assets, filesDir)
                g_Singleton!!.setView(view)
                g_Singleton!!.start()
            } else {
                LoaderAPI.traceChan("LoaderThread-${Thread.currentThread().name}", "re-using exsiting LoaderThread")
                synchronized(g_Singleton!!.m_View!!) {
                    LoaderAPI.traceChan("LoaderThread-${Thread.currentThread().name}", "notifying existing view in case thread is waiting for surface")
                    g_Singleton!!.m_Loader = loader
                    g_Singleton!!.setView(view)
                }
            }
            return g_Singleton!!
        }
    }

    private fun translateS3eOrientation(p0: Int): Int = when (p0) {
        0 -> -1
        1 -> 7
        2 -> 6
        3 -> 1
        4 -> 0
        else -> { trace("Can not translate s3e orientation : $p0"); -1 }
    }

    private fun fixOrientation(p0: Int) {
        m_FixScreenOrientation = translateS3eOrientation(p0)
        trace("fixOrientation s3e orientation is $p0, fixOrientation android orientation is $m_FixScreenOrientation")
        if (LoaderAPI.s3eConfigGet("AndroidIgnoreResizeWhilePaused", 0) != 0) {
            m_IgnoreResizeWhilePaused = true
        }
        doFixOrientation()
    }

    fun getOrientation(): Int {
        val wm = m_Loader!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        return wm.defaultDisplay.rotation
    }

    fun onSplashFinished() {
        m_splashFinished = true
        doFixOrientation()
    }

    private fun extendSplashOrientation(p0: Int): Int = when (p0) {
        0, 8 -> 6
        1, 9 -> 7
        else -> p0
    }

    private fun translateSplashOrientation(p0: Int): Int = when (p0) {
        4, 10 -> if (m_splashFinished) p0 else extendSplashOrientation(m_StartScreenOrientation)
        else -> p0
    }

    fun doFixOrientation() {
        val orientationToSet = translateSplashOrientation(m_FixScreenOrientation)
        trace("doFixOrientation m_FixScreenOrientation=$m_FixScreenOrientation, orientationToSet=$orientationToSet")
        m_Loader!!.requestedOrientation = orientationToSet
    }

    private fun touchSetWait(p0: Int) {
        trace("touchSetWait: $p0")
        m_OnTouchWait = p0 as java.lang.Integer
    }

    fun onResume() {
        trace("onResume")
        m_Stopped = false
        m_ResumeInProgress = true
        if (!signalResume(false)) {
            m_ResumeInProgress = false
        }
        trace("onResume: done")
    }

    fun runRunnable(p0: Runnable) {
        trace("runRunnable: calling RunOnOS java func")
        p0.run()
        trace("runRunnable: done calling RunOnOS java func")
    }

    fun runOnOSThread(p0: Runnable) {
        runOnOSThreadNative(p0)
    }

    fun runOnOSSignal() {
        m_Handler.post(m_RunOnOSThread)
    }

    fun onStop() {
        trace("onStop")
        if (m_Terminating) {
            trace("onStop: doing nothing during termination")
        } else if (!m_Started) {
            trace("onStop: not waiting during startup")
        } else if (m_Stopped) {
            trace("onStop: already paused or pausing")
        } else {
            m_Stopped = true
            signalSuspend(true)
            trace("onStop: done")
        }
    }

    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {}

    override fun onSensorChanged(event: SensorEvent) {
        val type = event.sensor.type
        if (type == 1) {
            onAccelNative(event.values[0], event.values[1], event.values[2])
        } else if (type == 2) {
            onCompassNative(0, event.values[0], event.values[1], event.values[2])
        } else if (type == 3) {
            onCompassNative(1, event.values[0], event.values[1], event.values[2])
        } else {
            trace("unhandled sensor changed: ${event.sensor} ${event.values.size}")
        }
    }

    fun accelStart() {
        if (m_Accelerometer == null) {
            m_Accelerometer = m_SensorManager!!.getDefaultSensor(1)
            m_SensorManager!!.registerListener(this, m_Accelerometer, 1)
        }
    }

    fun accelStop() {
        if (m_Accelerometer != null) {
            m_SensorManager!!.unregisterListener(this, m_Accelerometer)
            m_Accelerometer = null
        }
    }

    fun smsStart(): Boolean {
        if (m_LoaderSMSReceiver == null) {
            trace("registerSmsReceiver")
            m_LoaderSMSReceiver = LoaderSMSReceiver()
            m_Loader!!.registerReceiver(m_LoaderSMSReceiver, IntentFilter("android.provider.Telephony.SMS_RECEIVED"))
            return true
        }
        return false
    }

    fun smsStop() {
        if (m_LoaderSMSReceiver != null) {
            m_Loader!!.unregisterReceiver(m_LoaderSMSReceiver)
            m_LoaderSMSReceiver = null
        }
    }

    fun compassStart() {
        if (m_Compass == null) {
            m_Compass = m_SensorManager!!.getDefaultSensor(2)
            m_Orientation = m_SensorManager!!.getDefaultSensor(3)
            m_SensorManager!!.registerListener(this, m_Orientation, 1)
            m_SensorManager!!.registerListener(this, m_Compass, 1)
        }
    }

    fun compassStop() {
        if (m_Compass != null) {
            m_SensorManager!!.unregisterListener(this, m_Compass)
            m_SensorManager!!.unregisterListener(this, m_Orientation)
            m_Compass = null
        }
    }

    fun soundInit(p0: Int, p1: Boolean, p2: Int): Int {
        trace("soundInit")
        return m_SoundPlayer.init(p0, p1, p2)
    }

    fun soundStart() {
        trace("soundStart")
        m_SoundPlayer.start()
        trace("soundStart done")
    }

    fun soundStop() {
        trace("soundStop")
        m_SoundPlayer.stop()
        trace("soundStop done")
    }

    fun recordAvailable(): Int = SoundRecord.available()

    fun recordStart(p0: Int, p1: Int): Int {
        trace("recordStart")
        if (m_SoundRecord == null) {
            m_SoundRecord = SoundRecord()
            return m_SoundRecord!!.start(p0)
        }
        return 0
    }

    fun recordStop(): Int {
        trace("recordStop")
        var stop = 1
        if (m_SoundRecord != null) {
            stop = m_SoundRecord!!.stop()
            m_SoundRecord = null
        }
        return stop
    }

    fun clipboardGet(): String? {
        val cm = m_Loader!!.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
        val text = cm?.text
        return text?.toString()
    }

    fun clipboardSet(p0: String) {
        val cm = m_Loader!!.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
        cm?.text = p0
    }

    fun networkCheckStart(): Boolean {
        if (m_NetworkCheckEnabled) return true
        m_NetworkCheckEnabled = true
        trace("registerNetworkCheckReceiver")
        m_Loader!!.registerReceiver(m_NetworkCheckReceiver, IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"))
        return true
    }

    fun networkCheckStop(): Boolean {
        if (!m_NetworkCheckEnabled) return true
        m_NetworkCheckEnabled = false
        trace("unregisterNetworkCheckReceiver")
        if (m_NetworkCheckReceiver != null) {
            m_Loader!!.unregisterReceiver(m_NetworkCheckReceiver)
        }
        return true
    }

    fun getBatteryLevel(): Int = m_BatteryLevel

    fun getDeviceDpi(p0: Boolean): Int {
        val dm: DisplayMetrics = m_Loader!!.applicationContext.resources.displayMetrics
        if (p0) {
            return dm.densityDpi
        }
        val w = dm.widthPixels.toFloat() / dm.xdpi
        val h = dm.heightPixels.toFloat() / dm.ydpi
        val diag = Math.sqrt((w * w + h * h).toDouble()).toFloat()
        val pixDiag = Math.sqrt((dm.widthPixels * dm.widthPixels + dm.heightPixels * dm.heightPixels).toDouble()).toFloat()
        return (pixDiag / diag).toInt()
    }

    fun chargerIsConnected(): Boolean = m_ChargerConnected

    private fun doSuspend() {
        trace("doSuspend")
        LoaderAPI.notifySuspendResumeListeners(SuspendResumeEvent(SuspendResumeEvent.EventType.SUSPEND))
        m_MediaPlayerManager.doPause()
        m_VideoIsPaused = m_View!!.videoGetStatus() == 2
        if (!m_VideoIsPaused) {
            m_View!!.videoPause()
        }
        m_SoundPlayer.pause()
        if (m_SoundRecord != null) {
            m_SoundRecord!!.stop()
        }
        if (m_BatteryLevelReceiverRegistered) {
            trace("unregisterReceiver")
            if (m_BatteryLevelReceiver != null) {
                m_Loader!!.unregisterReceiver(m_BatteryLevelReceiver)
            }
            m_BatteryLevelReceiverRegistered = false
        }
        if (m_NetworkCheckEnabled) {
            trace("unregisterNetworkCheckReceiver")
            if (m_NetworkCheckReceiver != null) {
                m_Loader!!.unregisterReceiver(m_NetworkCheckReceiver)
            }
        }
        if (m_Location != null) {
            m_Location!!.locationStop()
        }
        if (m_Accelerometer != null) {
            m_SensorManager!!.unregisterListener(this, m_Accelerometer)
        }
        if (m_Compass != null) {
            m_SensorManager!!.unregisterListener(this, m_Compass)
            m_SensorManager!!.unregisterListener(this, m_Orientation)
        }
        m_AppDoingInitTerm++
        m_View!!.glPause()
        m_AppDoingInitTerm--
    }

    private fun doResume() {
        trace("doResume")
        m_AppDoingInitTerm++
        waitForView()
        m_View!!.glResume()
        m_AppDoingInitTerm--
        if (m_Accelerometer != null) {
            m_SensorManager!!.registerListener(this, m_Accelerometer, 1)
        }
        if (m_Compass != null) {
            m_SensorManager!!.registerListener(this, m_Orientation, 1)
            m_SensorManager!!.registerListener(this, m_Compass, 1)
        }
        if (m_Location != null) {
            m_Location!!.locationStart(m_Loader!!)
        }
        if (!m_BatteryLevelReceiverRegistered) {
            trace("registerReceiver")
            m_Loader!!.registerReceiver(m_BatteryLevelReceiver, IntentFilter("android.intent.action.BATTERY_CHANGED"))
            m_BatteryLevelReceiverRegistered = true
        }
        if (m_NetworkCheckEnabled) {
            m_Loader!!.registerReceiver(m_NetworkCheckReceiver, IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"))
        }
        m_SoundPlayer.resume()
        m_MediaPlayerManager.doResume()
        if (!m_VideoIsPaused) {
            m_View!!.videoResume()
        }
        if (m_SoundRecord != null) {
            m_SoundRecord!!.start(-1)
        }
        m_ResumeInProgress = false
        LoaderAPI.notifySuspendResumeListeners(SuspendResumeEvent(SuspendResumeEvent.EventType.RESUME))
        trace("doResume: done")
    }

    private fun waitForView() {
        while (true) {
            synchronized(m_View!!) {
                if (m_Terminating || m_View!!.waitForSurface()) {
                    setViewNative(m_View!!)
                    return
                }
                trace("waitForSurface failed.. looping")
            }
        }
    }

    private fun glInit(p0: Int) {
        trace("glInit")
        if (m_UseGL) {
            trace("glInit skipped")
        } else {
            m_UseGL = true
            m_AppDoingInitTerm++
            if (!m_Stopped && !m_Terminating) {
                synchronized(m_CreateView) {
                    m_Handler.post(m_CreateView)
                    try {
                        (m_CreateView as Object).wait()
                    } catch (_: InterruptedException) {
                    }
                }
                waitForView()
            }
            m_View!!.glInit(p0)
            m_AppDoingInitTerm--
            trace("glInit done")
        }
    }

    private fun glTerm() {
        trace("glTerm")
        if (!m_UseGL) {
            trace("glTerm skipped")
        } else {
            m_AppDoingInitTerm++
            m_View!!.glTerm()
            m_UseGL = false
            trace("glTerm2")
            if (!m_Stopped && !m_Terminating) {
                synchronized(m_CreateView) {
                    m_Handler.post(m_CreateView)
                    try {
                        (m_CreateView as Object).wait()
                    } catch (_: InterruptedException) {
                    }
                }
            }
            trace("glTerm3")
            if (!m_Stopped) {
                waitForView()
            } else {
                trace("glTerm not waiting while paused")
            }
            m_AppDoingInitTerm--
            trace("glTerm done")
        }
    }

    private fun glReInit() {
        trace("glReInit")
        if (!m_UseGL) {
            trace("glReInit skipped")
        } else {
            m_AppDoingInitTerm++
            m_View!!.glReInit()
            m_AppDoingInitTerm--
            trace("glReInit done")
        }
    }

    override fun run() {
        waitForView()
        m_Started = true
        val nativeLibDir = m_Loader!!.applicationInfo.nativeLibraryDir
        runNative(m_FileRoot!!.absolutePath, m_Loader!!.packageResourcePath, nativeLibDir)
        trace("Native code done.  Shutting down")
        shuttingDown(false)
    }

    private fun getPrivateExternalDir(): String? {
        if (Environment.getExternalStorageState() != "mounted") return null
        val f = m_Loader!!.getExternalFilesDir(null)
        return f?.absolutePath
    }

    private fun getRstDir(): String? {
        if (Environment.getExternalStorageState() != "mounted") return null
        val f = Environment.getExternalStorageDirectory()
        return f?.absolutePath
    }

    private fun getCacheDir(): String? =
        m_Loader!!.cacheDir?.absolutePath

    private fun getTmpDir(): String? =
        m_Loader!!.externalCacheDir?.absolutePath

    fun hasMultitouch(): Boolean {
        val pm = m_Loader!!.packageManager
        val mt = pm.hasSystemFeature("android.hardware.touchscreen.multitouch")
        trace("hasSystemFeature -> $mt")
        return mt
    }

    private fun shuttingDown(p0: Boolean) {
        if (m_Terminating) {
            trace("shuttingDown (ignoring)")
        } else {
            m_Started = false
            m_Terminating = true
            g_Singleton = null
            trace("shuttingDown")
            if (p0) {
                shutdownNative()
            }
            smsStop()
            accelStop()
            LoaderAPI.notifySuspendResumeListeners(SuspendResumeEvent(SuspendResumeEvent.EventType.SHUTDOWN))
            if (!m_Loader!!.isFinishing) {
                if (m_BatteryLevelReceiverRegistered) {
                    trace("unregisterReceiver")
                    if (m_BatteryLevelReceiver != null) {
                        m_Loader!!.unregisterReceiver(m_BatteryLevelReceiver)
                    }
                    m_BatteryLevelReceiverRegistered = false
                }
                networkCheckStop()
                trace("calling finish on activity")
                m_Loader!!.finish()
            }
        }
    }

    fun onDestroy() {
        shuttingDown(true)
        interrupt()
        try {
            join()
        } catch (_: InterruptedException) {
            trace("interrupt while joining LoaderThread")
        }
    }

    fun onLowMemory() {
        lowMemoryWarning()
    }

    fun locationStart(): Boolean {
        if (m_Location != null) return false
        m_Location = LoaderLocation()
        return m_Location!!.locationStart(m_Loader!!)
    }

    fun locationStop(): Boolean {
        if (m_Location == null) return false
        val result = m_Location!!.locationStop()
        m_Location = null
        return result
    }

    fun locationGpsData(): Boolean =
        if (m_Location != null) m_Location!!.locationGpsData() else false

    fun getDeviceModel(): String = Build.MODEL

    fun telephonyManagerExists(): Boolean {
        if (m_TelephonyManagerExistsKnown) {
            return m_TelephonyManagerExists
        }
        var exists = true
        try {
            Class.forName("com.ideaworks3d.marmalade.TelephonyManagerProxy")
        } catch (_: ClassNotFoundException) {
            exists = false
        }
        m_TelephonyManagerExistsKnown = true
        m_TelephonyManagerExists = exists
        return exists
    }

    @Deprecated("legacy")
    fun getTelephonyId(): String? = null

    fun getDeviceId(): String? {
        val tryAndroidIdFirst = LoaderAPI.s3eConfigGet("AndroidTryAndroidIdFirst", 1) != 0
        trace("getDeviceId() tryAndroidIdFirst$tryAndroidIdFirst")
        if (!tryAndroidIdFirst) {
            val tid = getTelephonyId()
            if (tid != null && tid != "") {
                return tid
            }
        }
        val androidId = Secure.getString(m_Loader!!.contentResolver, "android_id")
        if (androidId != null && androidId != "9774d56d682e549c") {
            return androidId
        }
        var serial: String? = null
        try {
            serial = Build.SERIAL
            if (serial != null) {
                return serial
            }
        } catch (_: Exception) {
            trace("Failed to get android.os.Build.SERIAL")
        }
        if (tryAndroidIdFirst) {
            serial = getTelephonyId()
            if (serial != null && serial != "") {
                return serial
            }
        }
        return null
    }

    @Deprecated("legacy")
    fun getDeviceIMSI(): String? = null

    @Deprecated("legacy")
    fun getDeviceNumber(): String? = null

    fun getSilentMode(): Boolean {
        val am = m_Loader!!.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        return am.ringerMode != 2
    }

    @SuppressLint("WrongConstant")
    fun launchBrowser(p0: String): Boolean {
        return try {
            val uri = Uri.parse(p0)
            val intent = Intent()
            intent.data = uri
            if (!p0.startsWith("vfstore")) {
                intent.action = "android.intent.action.VIEW"
            }
            intent.addFlags(337641472)
            m_Loader!!.startActivity(intent)
            true
        } catch (e: ActivityNotFoundException) {
            trace("ERROR OSExec(url):$e")
            false
        }
    }

    @SuppressLint("WrongConstant")
    fun sendEmail(p0: String, p1: String, p2: String): Boolean {
        trace("sendEmail")
        return try {
            val emails = p0.split(",\\s*?".toRegex())
            val intent = Intent()
            intent.action = "android.intent.action.SEND"
            intent.type = "text/xml"
            intent.putExtra("android.intent.extra.EMAIL", emails.toTypedArray())
            intent.putExtra("android.intent.extra.SUBJECT", p1)
            intent.putExtra("android.intent.extra.TEXT", p2)
            intent.addFlags(337641472)
            m_Loader!!.startActivity(intent)
            true
        } catch (e: ActivityNotFoundException) {
            trace("ERROR OSExec(mailto):$e")
            false
        }
    }

    fun onTouchEvent(p0: MotionEvent): Boolean {
        MultiTouch.onTouchEvent(this, p0)
        if (m_OnTouchWait > 0) {
            synchronized(m_OnTouchWait) {
                try {
                    (m_OnTouchWait as Object).wait(m_OnTouchWait.toLong())
                } catch (_: InterruptedException) {
                    trace("onTouchInterrupted")
                }
            }
        }
        return true
    }

    fun getNetworkType(): Int {
        val cm = m_Loader!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val ni = cm.activeNetworkInfo
        return if (ni != null && ni.isConnected) ni.type else -1
    }

    fun getNetworkSubType(): Int {
        val cm = m_Loader!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val ni = cm.activeNetworkInfo
        return if (ni != null && ni.isConnected) ni.subtype else -1
    }

    fun acquireMulticastLock(): Boolean {
        if (m_MulticastLock == null) {
            val wifi = m_Loader!!.getSystemService(Context.WIFI_SERVICE) as WifiManager
            try {
                m_MulticastLock = MulticastLockFacade(wifi)
            } catch (_: Exception) {
                trace("Could not create multicastLock")
                return false
            }
        }
        return if (m_MulticastLock != null) {
            m_MulticastLock!!.acquire()
            m_MulticastLock!!.isHeld()
        } else false
    }

    fun releaseMulticastLock(): Boolean {
        if (m_MulticastLock != null) {
            m_MulticastLock!!.release()
            m_MulticastLock = null
            return true
        }
        return false
    }

    inner class MulticastLockFacade(wifi: WifiManager) {
        private var m_multiCastLockReal: MulticastLock? = wifi.createMulticastLock("Marmalade")

        fun isHeld(): Boolean {
            return if (m_multiCastLockReal != null) {
                m_multiCastLockReal!!.isHeld
            } else {
                trace("MulticastLock not supported")
                false
            }
        }

        fun release() {
            if (m_multiCastLockReal != null) {
                m_multiCastLockReal!!.release()
            } else {
                trace("MulticastLock not supported")
            }
        }

        fun acquire() {
            if (m_multiCastLockReal != null) {
                m_multiCastLockReal!!.acquire()
            } else {
                trace("MulticastLock not supported")
            }
        }
    }

    private enum class AudioState {
        None, Idle, Initialized, Stopped, Prepared, Started, Paused, PlaybackCompleted, Error
    }

    private inner class MediaPlayerManager {
        private val m_NumAudioChannels = 16
        private val m_MediaPlayer: Array<MediaPlayer?> = arrayOfNulls(16)
        private val m_MediaPlayerListener: Array<MediaPlayerListener?> = arrayOfNulls(16)
        private val m_AudioState: Array<AudioState> = Array(16) { AudioState.None }
        private val m_AudioIsPaused: Array<Boolean> = Array(16) { false }
        private val m_AudioPlayRepeats: IntArray = IntArray(16)
        private val m_AudioVolume: IntArray = IntArray(16).also { it.fill(100) }

        init {
            for (i in 0 until 16) {
                m_MediaPlayer[i] = null
                m_MediaPlayerListener[i] = MediaPlayerListener(i)
                m_AudioState[i] = AudioState.None
                m_AudioIsPaused[i] = false
                m_AudioPlayRepeats[i] = 0
                m_AudioVolume[i] = 100
            }
        }

        fun audioGetNumChannels(): Int = 16

        private fun audioStopped(p0: Int) {
            trace("Audio channel: $p0, audioStopped")
            audioStoppedNotify(p0)
        }

        fun audioPlay(p0: String, p1: Int, p3: Long, p5: Long, p7: Int): Int {
            trace("audioPlay: ${m_AudioState[p7]}: $p0 ($p1)")
            audioStop(p7)
            if (m_MediaPlayer[p7] == null) {
                m_MediaPlayer[p7] = MediaPlayer()
                m_MediaPlayer[p7]!!.setOnErrorListener(m_MediaPlayerListener[p7])
                m_MediaPlayer[p7]!!.setOnCompletionListener(m_MediaPlayerListener[p7])
            }
            try {
                m_MediaPlayer[p7]!!.reset()
                audioChangeState(AudioState.Idle, p7)
                if (p5 > 0L) {
                    trace("Audio channel: $p7, Playing from zipfile: $p0, offset: $p3, size: $p5")
                    val f = File(p0)
                    val pfd = ParcelFileDescriptor.open(f, 268435456)
                    val afd = AssetFileDescriptor(pfd, p3, p5)
                    m_MediaPlayer[p7]!!.setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                    afd.close()
                    pfd.close()
                } else if (p0.indexOf("http://") == -1 && p0.indexOf("https://") == -1) {
                    try {
                        val fis = FileInputStream(p0)
                        m_MediaPlayer[p7]!!.setDataSource(fis.fd)
                        fis.close()
                    } catch (_: FileNotFoundException) {
                        val afd = this@LoaderThread.m_Assets!!.openFd(p0)
                        m_MediaPlayer[p7]!!.setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                        afd.close()
                    }
                } else {
                    trace("Audio channel: $p7, Playing from URL: $p0")
                    m_MediaPlayer[p7]!!.setDataSource(p0)
                }
                audioChangeState(AudioState.Initialized, p7)
                m_MediaPlayer[p7]!!.prepare()
                audioChangeState(AudioState.Prepared, p7)
            } catch (e: FileNotFoundException) {
                trace("FileNotFoundException: error playing audio file: $e")
                audioChangeState(AudioState.Error, p7)
                e.printStackTrace()
                return -1
            } catch (e: IOException) {
                trace("IOException: error playing audio file: $e")
                audioChangeState(AudioState.Error, p7)
                e.printStackTrace()
                return -2
            }
            audioSetVolumeInternal(p7)
            m_AudioPlayRepeats[p7] = p1
            m_MediaPlayer[p7]!!.isLooping = m_AudioPlayRepeats[p7] == 0
            trace("Audio channel: $p7, audioPlay: starting")
            try {
                m_MediaPlayer[p7]!!.start()
            } catch (e: IllegalStateException) {
                trace("Audio channel: $p7, IllegalStateException: start(): error playing audio file: $e")
                e.printStackTrace()
                return -2
            }
            trace("Audio channel: $p7, audioPlay: started")
            audioChangeState(AudioState.Started, p7)
            return 0
        }

        fun doPause() {
            for (i in 0 until 16) {
                m_AudioIsPaused[i] = m_AudioState[i] == AudioState.Paused
                if (!m_AudioIsPaused[i]) {
                    audioPause(i)
                }
            }
        }

        fun doResume() {
            for (i in 0 until 16) {
                if (!m_AudioIsPaused[i]) {
                    audioResume(i)
                }
            }
        }

        fun audioPause(p0: Int): Int {
            if (m_AudioState[p0] != AudioState.Started) {
                return -1
            } else if (m_MediaPlayer[p0] == null) {
                trace("Audio channel: $p0, MediaPlayer.pause(): no MediaPlayer")
                return -1
            }
            trace("Audio channel: $p0, audioPause: ${m_AudioState.contentToString()}")
            return try {
                m_MediaPlayer[p0]!!.pause()
                audioChangeState(AudioState.Paused, p0)
                0
            } catch (_: IllegalStateException) {
                trace("Audio channel: $p0, MediaPlayer.pause(): illegal state")
                -1
            }
        }

        fun audioResume(p0: Int): Int {
            if (m_AudioState[p0] != AudioState.Paused) {
                trace("Audio channel: $p0 has not been resumed because it is not paused before.")
                return -1
            } else if (m_MediaPlayer[p0] == null) {
                trace("Audio channel: $p0, MediaPlayer.start(): no MediaPlayer")
                return -1
            }
            trace("Audio channel: $p0, audioResume: ${m_AudioState[p0]}")
            return try {
                m_MediaPlayer[p0]!!.start()
                audioChangeState(AudioState.Started, p0)
                0
            } catch (_: IllegalStateException) {
                trace("Audio channel: $p0, MediaPlayer.start(): illegal state")
                -1
            }
        }

        fun audioStopAll() {
            for (i in 0 until 16) {
                audioStop(i)
            }
        }

        fun audioStop(p0: Int) {
            trace("Getting audio state for channel: $p0")
            val state = m_AudioState[p0]
            trace("Audio channel: $p0, audioStop: $state")
            if (m_MediaPlayer[p0] != null && (state == AudioState.Started || state == AudioState.Paused || state == AudioState.PlaybackCompleted)) {
                trace("Audio channel: $p0, audioStop: stopping")
                try {
                    m_MediaPlayer[p0]!!.stop()
                    audioChangeState(AudioState.Stopped, p0)
                } catch (_: IllegalStateException) {
                }
                m_MediaPlayer[p0]!!.reset()
                audioChangeState(AudioState.Idle, p0)
                audioStopped(p0)
            }
        }

        fun audioIsPlaying(p0: Int): Boolean =
            m_MediaPlayer[p0] != null && m_AudioState[p0] == AudioState.Started

        fun audioGetStatus(p0: Int): Int = when (m_AudioState[p0]) {
            AudioState.Started -> 1
            AudioState.Paused -> 2
            AudioState.Error -> 3
            else -> 0
        }

        fun audioGetPosition(p0: Int): Int =
            if (m_AudioState[p0] != AudioState.Started && m_AudioState[p0] != AudioState.Paused) 0
            else m_MediaPlayer[p0]!!.currentPosition

        fun audioGetDuration(p0: Int): Int =
            if (m_MediaPlayer[p0] != null && m_AudioState[p0] != AudioState.Error && m_AudioState[p0] != AudioState.Idle && m_AudioState[p0] != AudioState.Initialized)
                m_MediaPlayer[p0]!!.duration
            else 0

        fun audioSetPosition(p0: Int, p1: Int) {
            trace("Audio channel: $p1, audioSetPosition to: $p0")
            m_MediaPlayer[p1]!!.seekTo(p0)
        }

        fun audioSetVolume(p0: Int, p1: Int) {
            m_AudioVolume[p1] = p0
            audioSetVolumeInternal(p1)
        }

        private fun audioSetVolumeInternal(p0: Int) {
            if (m_MediaPlayer[p0] != null && m_AudioState[p0] != AudioState.Error) {
                val vol = m_AudioVolume[p0] / 100.0f
                m_MediaPlayer[p0]!!.setVolume(vol, vol)
            }
        }

        private fun audioChangeState(p0: AudioState, p1: Int) {
            m_AudioState[p1] = p0
        }

        private inner class MediaPlayerListener(val m_channel: Int) : OnErrorListener, OnCompletionListener {
            override fun onError(mp: MediaPlayer, what: Int, extra: Int): Boolean {
                trace("onError ($what, $extra): ${m_AudioState.contentToString()}")
                audioChangeState(AudioState.Error, m_channel)
                m_MediaPlayer[m_channel]!!.reset()
                audioChangeState(AudioState.Idle, m_channel)
                audioStopped(m_channel)
                return true
            }

            override fun onCompletion(mp: MediaPlayer) {
                trace("Audio channel: $m_channel, onCompletion: ${m_AudioState[m_channel]}")
                m_AudioPlayRepeats[m_channel]--
                if (m_AudioPlayRepeats[m_channel] == 0) {
                    audioChangeState(AudioState.PlaybackCompleted, m_channel)
                    audioStop(m_channel)
                } else {
                    try {
                        m_MediaPlayer[m_channel]!!.start()
                    } catch (e: IllegalStateException) {
                        trace("Audio channel: $m_channel, IllegalStateException: start(): error playing audio file: $e")
                        e.printStackTrace()
                        return
                    }
                    trace("Audio channel: $m_channel, audioPlay: started repeat (${m_AudioPlayRepeats[m_channel] - 1} left)")
                    audioChangeState(AudioState.Started, m_channel)
                }
            }
        }
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }
}
