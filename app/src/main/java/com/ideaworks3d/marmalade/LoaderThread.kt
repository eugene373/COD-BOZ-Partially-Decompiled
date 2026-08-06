package com.ideaworks3d.marmalade

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.AudioManager
import android.net.Uri
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import java.io.File
import java.io.IOException

class LoaderThread(
    private var m_Loader: LoaderActivity,
    private val m_Assets: android.content.res.AssetManager,
    private var m_FileRoot: File
) : Thread(), SensorEventListener {

    companion object {
        @JvmStatic
        @Volatile
        var g_Singleton: LoaderThread? = null

        @JvmStatic
        fun getInstance(
            activity: LoaderActivity,
            assets: android.content.res.AssetManager,
            fileRoot: File,
            view: LoaderView
        ): LoaderThread {
            if (g_Singleton == null) {
                g_Singleton = LoaderThread(activity, assets, fileRoot)
                g_Singleton!!.setView(view)
                g_Singleton!!.start()
            } else {
                synchronized(g_Singleton!!) {
                    g_Singleton!!.m_Loader = activity
                    g_Singleton!!.setView(view)
                }
            }
            return g_Singleton!!
        }
    }

    private var m_Accelerometer: Sensor? = null
    private var m_AppDoingInitTerm = 0
    private var m_BatteryLevel = 0
    private val m_BatteryLevelReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            m_BatteryLevel = intent?.getIntExtra("level", 0) ?: 0
            val plugged = intent?.getIntExtra("plugged", 0) ?: 0
            val connected = plugged != 0
            m_ChargerConnected = connected
            chargerStateChanged(connected)
        }
    }

    private var m_BatteryLevelReceiverRegistered: Boolean? = false
    private var m_ChargerConnected = false
    private var m_Compass: Sensor? = null
    private val m_CreateView = Runnable { }
    private var m_DidSuspendForSurfaceChange = false
    private var m_FixScreenOrientation = 0
    private val m_Handler = Handler()
    private var m_IgnoreResizeWhilePaused = false
    private var m_LoaderSMSReceiver: LoaderSMSReceiver? = null
    private var m_Location: LoaderLocation? = null
    private var m_MediaPlayerManager: MediaPlayerManager? = null
    private var m_MulticastLock: MulticastLockFacade? = null
    private var m_NetworkCheckEnabled = false
    private val m_NetworkCheckReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val isConnected = intent?.getBooleanExtra(
                "connectivity_extra", true
            ) ?: true
            networkCheckChanged(isConnected)
        }
    }

    private var m_OnTouchWait = 2
    private var m_Orientation: Sensor? = null
    private var m_Paused = false
    private var m_ResumeInProgress: Boolean? = false
    private val m_RunOnOSThread = Runnable {
        runOnOSThreadNative(this@LoaderThread)
    }
    private var m_SensorManager: SensorManager? = null
    private var m_SkipNextChange = false
    private var m_SoundPlayer: SoundPlayer? = null
    private var m_SoundRecord: SoundRecord? = null
    private var m_StartScreenOrientation = 1
    private var m_Started = false
    private var m_TelephonyManagerExists = false
    private var m_TelephonyManagerExistsKnown = false
    private var m_Terminating = false
    private var m_TouchEvent: java.lang.reflect.Method? = null
    private var m_TouchMulti = false
    private var m_UseGL = false
    private var m_VideoIsPaused: Boolean? = false
    private var m_View: LoaderView? = null
    private var m_getRotation: java.lang.reflect.Method? = null
    private var m_splashFinished = false

    init {
        m_BatteryLevelReceiverRegistered = false
        m_SoundPlayer = SoundPlayer()
        m_MediaPlayerManager = MediaPlayerManager()
        m_Loader.registerReceiver(m_BatteryLevelReceiver, IntentFilter("android.intent.action.BATTERY_CHANGED"))
        m_BatteryLevelReceiverRegistered = true

        m_SensorManager = m_Loader.getSystemService(Context.SENSOR_SERVICE) as SensorManager

        try {
            val dir = File(m_FileRoot, "makeramdirectory.txt")
            dir.mkdirs()
            dir.delete()
        } catch (e: Exception) {
        }

        if (Build.VERSION.SDK_INT >= 5) {
            try {
                val cls = Class.forName("com.ideaworks3d.marmalade.MultiTouch")
                m_TouchEvent = cls.getMethod("onTouchEvent", LoaderThread::class.java, MotionEvent::class.java)
                m_TouchMulti = true
            } catch (e: Exception) {
                m_TouchEvent = null
            }
        }

        initNative()
    }

    private external fun initNative()
    private external fun runNative(fileRoot: String, apkPath: String, nativeLibDir: String)
    private external fun shutdownNative()
    private external fun onAccelNative(x: Float, y: Float, z: Float)
    private external fun onCompassNative(type: Int, x: Float, y: Float, z: Float)
    private external fun signalResume(isRunning: Boolean): Boolean
    private external fun signalSuspend(isRunning: Boolean): Boolean
    private external fun suspendAppThreads()
    private external fun resumeAppThreads()
    private external fun runOnOSThreadNative(runnable: Runnable)
    private external fun runOnOSTickNative()
    private external fun setViewNative(view: LoaderView)
    private external fun audioStoppedNotify(stream: Int)
    private external fun chargerStateChanged(connected: Boolean)
    private external fun networkCheckChanged(connected: Boolean)
    private external fun lowMemoryWarning()
    external fun onMotionEvent(action: Int, source: Int, x: Int, y: Int)

    private fun doResume() {
        m_AppDoingInitTerm++
        waitForView()
        m_View?.glResume()
        m_AppDoingInitTerm--

        m_Accelerometer?.let {
            m_SensorManager?.registerListener(this, it, SensorManager.SENSOR_DELAY_GAME)
        }
        m_Compass?.let {
            m_SensorManager?.registerListener(this, m_Orientation, SensorManager.SENSOR_DELAY_GAME)
            m_SensorManager?.registerListener(this, it, SensorManager.SENSOR_DELAY_GAME)
        }
        m_Location?.let {
            it.locationStart(m_Loader)
        }

        if (m_BatteryLevelReceiverRegistered != true) {
            m_Loader.registerReceiver(m_BatteryLevelReceiver, IntentFilter("android.intent.action.BATTERY_CHANGED"))
            m_BatteryLevelReceiverRegistered = true
        }

        if (m_NetworkCheckEnabled) {
            m_Loader.registerReceiver(m_NetworkCheckReceiver, IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"))
        }

        m_SoundPlayer?.resume()
        m_MediaPlayerManager?.doResume()

        if (m_VideoIsPaused != true) {
            m_View?.videoResume()
        }

        m_SoundRecord?.let {
            it.start(-1)
        }

        m_ResumeInProgress = false
        LoaderAPI.notifySuspendResumeListeners(SuspendResumeEvent(SuspendResumeEvent.EventType.RESUME))
    }

    private fun doSuspend() {
        LoaderAPI.notifySuspendResumeListeners(SuspendResumeEvent(SuspendResumeEvent.EventType.SUSPEND))

        m_MediaPlayerManager?.doPause()

        m_VideoIsPaused = m_View?.videoGetStatus() == 2
        if (m_VideoIsPaused != true) {
            m_View?.videoPause()
        }

        m_SoundPlayer?.pause()

        m_SoundRecord?.let {
            it.stop()
        }

        if (m_BatteryLevelReceiverRegistered == true) {
            m_Loader.unregisterReceiver(m_BatteryLevelReceiver)
            m_BatteryLevelReceiverRegistered = false
        }

        if (m_NetworkCheckEnabled) {
            m_Loader.unregisterReceiver(m_NetworkCheckReceiver)
        }

        m_Location?.locationStop()

        m_Accelerometer?.let {
            m_SensorManager?.unregisterListener(this, it)
        }
        m_Compass?.let {
            m_Orientation?.let {
                m_SensorManager?.unregisterListener(this, it)
            }
            m_SensorManager?.unregisterListener(this, it)
        }

        m_AppDoingInitTerm++
        m_View?.glPause()
        m_AppDoingInitTerm--
    }

    private fun shuttingDown(fromOnDestroy: Boolean) {
        if (!m_Terminating) {
            m_Terminating = true
            shutdownNative()
        }
        if (fromOnDestroy) {
            m_View?.let { view ->
                synchronized(view) {
                    (view as java.lang.Object).notify()
                }
            }
        }
    }

    private fun waitForView() {
        while (true) {
            val view = m_View
            if (view == null) return

            synchronized(view) {
                if (m_Terminating) {
                    return
                }
                if (view.waitForSurface()) {
                    return
                }
            }
        }
    }

    fun setView(view: LoaderView) {
        m_View?.let { oldView ->
            synchronized(oldView) {
                (oldView as java.lang.Object).notify()
            }
        }
        m_View = view
        m_StartScreenOrientation = view.getCurrentOrientation()
        doFixOrientation()
        view.surfaceCreated(view.holder)
        setViewNative(view)
    }

    private fun glInit(glVersion: Int) {
        if (m_UseGL) return

        m_UseGL = true
        m_AppDoingInitTerm++

        if (!m_Paused && !m_Terminating) {
            synchronized(m_CreateView) {
                m_Handler.post(m_CreateView)
                try {
                    (m_CreateView as java.lang.Object).wait()
                } catch (e: InterruptedException) {
                }
            }
        }

        if (!m_Paused && !m_Terminating) {
            waitForView()
        }

        m_View?.glInit(glVersion)
        m_AppDoingInitTerm--
    }

    private fun glReInit() {
        m_View?.glReInit()
    }

    private fun glTerm() {
        if (m_UseGL) {
            m_UseGL = false
            m_AppDoingInitTerm++

            m_View?.glTerm()

            if (!m_Paused && !m_Terminating) {
                synchronized(m_CreateView) {
                    m_Handler.post(m_CreateView)
                    try {
                        (m_CreateView as java.lang.Object).wait()
                    } catch (e: InterruptedException) {
                    }
                }
            }

            if (!m_Paused) {
                waitForView()
            }

            m_AppDoingInitTerm--
            m_UseGL = false
        }
    }

    fun accelStart() {
        if (m_SensorManager != null && m_Accelerometer == null) {
            m_Accelerometer = m_SensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        }
    }

    fun accelStop() {
        m_Accelerometer = null
    }

    fun acquireMulticastLock(): Boolean {
        if (m_MulticastLock == null) {
            try {
                val cls = Class.forName("android.net.wifi.WifiManager")
                val method = cls.getMethod("createMulticastLock", String::class.java)
                val manager = m_Loader.getSystemService(Context.WIFI_SERVICE)
                val lock = method.invoke(manager, "s3eMulticastLock")
                m_MulticastLock = MulticastLockFacade(lock)
            } catch (e: Exception) {
            }
        }

        if (m_MulticastLock != null) {
            m_MulticastLock!!.acquire()
            return true
        }
        return false
    }

    fun audioStopAll() {
        m_SoundPlayer?.stop()
        m_SoundRecord?.stop()
        m_MediaPlayerManager?.release()
    }

    fun chargerIsConnected(): Boolean = m_ChargerConnected

    fun clipboardGet(): String? {
        val cm = m_Loader.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
        return cm.primaryClip?.toString()
    }

    fun clipboardSet(text: String) {
        val cm = m_Loader.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
        val clip = android.content.ClipData.newPlainText("", text)
        cm.setPrimaryClip(clip)
    }

    fun compassStart() {
        if (m_SensorManager != null) {
            if (m_Orientation == null) {
                m_Orientation = m_SensorManager!!.getDefaultSensor(Sensor.TYPE_ORIENTATION)
            }
            if (m_Compass == null) {
                m_Compass = m_SensorManager!!.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)
            }
        }
    }

    fun compassStop() {
        m_Compass = null
        m_Orientation = null
    }

    fun doFixOrientation() {
        if (Build.VERSION.SDK_INT >= 9) {
            val display = (m_Loader.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay
            val rotation = display.rotation
            when (rotation) {
                0 -> m_Loader.requestedOrientation = 1
                1, 3 -> m_Loader.requestedOrientation = 9
                2 -> m_Loader.requestedOrientation = 8
            }
        } else {
            val orientation = m_Loader.resources.configuration.orientation
            when (orientation) {
                1 -> m_Loader.requestedOrientation = 1
                2 -> m_Loader.requestedOrientation = 0
            }
        }
    }

    fun getBatteryLevel(): Int = m_BatteryLevel

    fun getDeviceDpi(scale: Boolean): Int {
        val metrics = m_Loader.resources.displayMetrics
        return if (scale) metrics.densityDpi else metrics.densityDpi
    }

    fun getDeviceIMSI(): String? {
        try {
            val cls = Class.forName("android.telephony.TelephonyManager")
            val method = cls.getMethod("getSimSerialNumber")
            val tm = m_Loader.getSystemService(Context.TELEPHONY_SERVICE)
            return method.invoke(tm) as String
        } catch (e: Exception) {
            return null
        }
    }

    fun getDeviceId(): String? {
        try {
            val cls = Class.forName("android.telephony.TelephonyManager")
            val method = cls.getMethod("getDeviceId")
            val tm = m_Loader.getSystemService(Context.TELEPHONY_SERVICE)
            return method.invoke(tm) as String
        } catch (e: Exception) {
            return null
        }
    }

    fun getDeviceModel(): String = Build.MODEL

    fun getDeviceNumber(): String? {
        try {
            val cls = Class.forName("android.telephony.TelephonyManager")
            val method = cls.getMethod("getLine1Number")
            val tm = m_Loader.getSystemService(Context.TELEPHONY_SERVICE)
            return method.invoke(tm) as String
        } catch (e: Exception) {
            return null
        }
    }

    fun getNetworkSubType(): Int = 0

    fun getNetworkType(): Int = 0

    fun getOrientation(): Int {
        val display = (m_Loader.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay
        return display.rotation
    }

    fun getSilentMode(): Boolean {
        val audioManager = m_Loader.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        return audioManager.ringerMode == AudioManager.RINGER_MODE_SILENT
    }

    fun getStarted(): Boolean = m_Started

    fun hasMultitouch(): Boolean = m_TouchMulti

    fun launchBrowser(url: String): Boolean {
        return try {
            val uri = Uri.parse(url)
            val intent = Intent()
            intent.data = uri
            if (!url.startsWith("vfstore")) {
                intent.action = Intent.ACTION_VIEW
            }
            intent.addFlags(0x14200000)
            m_Loader.startActivity(intent)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun locationGpsData(): Boolean {
        return m_Location?.locationGpsData() ?: false
    }

    fun locationStart(): Boolean {
        if (m_Location == null) {
            m_Location = LoaderLocation()
        }
        return m_Location?.locationStart(m_Loader) ?: false
    }

    fun locationStop() {
        m_Location?.locationStop()
    }

    fun networkCheckStart(): Boolean {
        if (!m_NetworkCheckEnabled) {
            val filter = IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")
            m_Loader.registerReceiver(m_NetworkCheckReceiver, filter)
            m_NetworkCheckEnabled = true
            return true
        }
        return false
    }

    fun networkCheckStop() {
        if (m_NetworkCheckEnabled) {
            m_Loader.unregisterReceiver(m_NetworkCheckReceiver)
            m_NetworkCheckEnabled = false
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    fun onDestroy() {
        shuttingDown(true)
        interrupt()
        try {
            join()
        } catch (e: InterruptedException) {
        }
    }

    fun onLowMemory() {
        lowMemoryWarning()
    }

    fun onPause() {
        if (!m_Terminating) {
            if (m_Started) {
                if (!m_Paused) {
                    m_Paused = true
                    signalSuspend(true)
                }
            }
        }
    }

    fun onResume() {
        m_Paused = false
        m_ResumeInProgress = true
        val result = signalResume(false)
        if (!result) {
            m_ResumeInProgress = false
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        event ?: return
        val type = event.sensor.type
        if (type == Sensor.TYPE_ACCELEROMETER) {
            onAccelNative(event.values[0], event.values[1], event.values[2])
        } else if (type == Sensor.TYPE_MAGNETIC_FIELD) {
            onCompassNative(0, event.values[0], event.values[1], event.values[2])
        } else if (type == Sensor.TYPE_ORIENTATION) {
            onCompassNative(1, event.values[0], event.values[1], event.values[2])
        }
    }

    fun onSplashFinished() {
        m_splashFinished = true
        doFixOrientation()
    }

    fun onTouchEvent(event: MotionEvent?): Boolean {
        if (m_TouchEvent != null) {
            try {
                m_TouchEvent!!.invoke(null, this, event)
            } catch (e: Exception) {
            }
        }

        if (event == null) return true

        var action = event.action and 0xff
        var source = 0
        when (action) {
            MotionEvent.ACTION_DOWN -> source = 1
            MotionEvent.ACTION_UP -> source = 0
            MotionEvent.ACTION_MOVE -> source = 3
        }

        if (action == MotionEvent.ACTION_DOWN) {
            action = 2
        } else if (action == MotionEvent.ACTION_UP) {
            action = 3
        }

        val x = event.x.toInt()
        val y = event.y.toInt()

        onMotionEvent(action, source, x, y)

        if (m_OnTouchWait > 0) {
            synchronized(m_OnTouchWait) {
                try {
                    (this as java.lang.Object).wait(m_OnTouchWait.toLong())
                } catch (e: InterruptedException) {
                }
            }
        }

        return true
    }

    fun recordAvailable(): Int = 0

    fun recordStart(bufferSize: Int): Int = 0

    fun recordStop(): Int = 0

    fun releaseMulticastLock(): Boolean {
        if (m_MulticastLock != null) {
            m_MulticastLock!!.release()
            m_MulticastLock = null
            return true
        }
        return false
    }

    fun resumeAfterSurfaceChange() {
        if (m_DidSuspendForSurfaceChange) {
            resumeAppThreads()
            m_DidSuspendForSurfaceChange = false
        }
    }

    override fun run() {
        waitForView()
        m_Started = true

        val nativeLibDir = if (Build.VERSION.SDK_INT >= 9) {
            m_Loader.applicationInfo.nativeLibraryDir
        } else {
            "${m_FileRoot.absolutePath}/lib"
        }

        runNative(m_FileRoot.absolutePath, m_Loader.packageResourcePath, nativeLibDir)

        shuttingDown(false)
    }

    fun runOnOSThread(runnable: Runnable) {
        runOnOSThreadNative(runnable)
    }

    fun runOnOSSignal() {
        m_Handler.post(m_RunOnOSThread)
    }

    fun runRunnable(runnable: Runnable) {
        runnable.run()
    }

    fun sendEmail(subject: String, body: String, recipient: String): Boolean {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/email"
            putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, body)
        }
        return try {
            m_Loader.startActivity(intent)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun setScreenOrientation(orientation: Int) {
        m_FixScreenOrientation = orientation
    }

    fun setUseGL(useGL: Boolean) {
        m_UseGL = useGL
    }

    fun isUsingGL(): Boolean = m_UseGL

    fun skipSurfaceChange(): Boolean {
        if (m_IgnoreResizeWhilePaused) {
            if (m_Paused && m_FixScreenOrientation != 4) {
                m_SkipNextChange = true
                return true
            }
            if (!m_Paused && m_SkipNextChange) {
                m_SkipNextChange = false
                return true
            }
        }
        return false
    }

    fun suspendForSurfaceChange() {
        if (m_AppDoingInitTerm == 0 && m_ResumeInProgress != true) {
            suspendAppThreads()
            m_DidSuspendForSurfaceChange = true
        }
    }

    fun smsStart(): Boolean {
        if (m_LoaderSMSReceiver == null && Build.VERSION.SDK_INT > 3) {
            m_LoaderSMSReceiver = LoaderSMSReceiver()
            m_Loader.registerReceiver(m_LoaderSMSReceiver, IntentFilter("android.provider.Telephony.SMS_RECEIVED"))
            return true
        }
        return false
    }

    fun smsStop() {
        if (m_LoaderSMSReceiver != null) {
            m_Loader.unregisterReceiver(m_LoaderSMSReceiver)
            m_LoaderSMSReceiver = null
        }
    }

    fun soundInit(sampleRate: Int, stereo: Boolean, bufferSize: Int): Int {
        return m_SoundPlayer?.init(sampleRate, stereo, bufferSize) ?: -1
    }

    fun soundSetVolume(volume: Int) {
        m_SoundPlayer?.setVolume(volume)
    }

    fun soundStart() {
        m_SoundPlayer?.start()
    }

    fun soundStop() {
        m_SoundPlayer?.stop()
    }

    fun telephonyManagerExists(): Boolean {
        if (m_TelephonyManagerExistsKnown) {
            return m_TelephonyManagerExists
        }

        try {
            Class.forName("com.ideaworks3d.marmalade.TelephonyManagerProxy")
            m_TelephonyManagerExistsKnown = true
            m_TelephonyManagerExists = true
            return true
        } catch (e: ClassNotFoundException) {
            m_TelephonyManagerExistsKnown = true
            m_TelephonyManagerExists = false
            return false
        }
    }

    // Accessors for inner classes
    fun getAssetsManager(): android.content.res.AssetManager = m_Assets

    fun audioStoppedNotifyInternal(stream: Int) {
        audioStoppedNotify(stream)
    }

    // AudioState enum
    enum class AudioState {
        None, Idle, Initialized, Stopped, Prepared, Started, Paused, PlaybackCompleted, Error
    }

    // MulticastLockFacade - reflection-based wrapper around WifiManager.createMulticastLock
    inner class MulticastLockFacade(private val m_multiCastLockReal: Any?) {
        fun acquire() {
            if (m_multiCastLockReal != null) {
                try {
                    val cls = m_multiCastLockReal.javaClass
                    val method = cls.getMethod("acquire")
                    method.invoke(m_multiCastLockReal)
                } catch (e: Exception) {
                }
            }
        }

        fun isHeld(): Boolean {
            if (m_multiCastLockReal != null) {
                try {
                    val cls = m_multiCastLockReal.javaClass
                    val method = cls.getMethod("isHeld")
                    return method.invoke(m_multiCastLockReal) as Boolean
                } catch (e: Exception) {
                }
            }
            return false
        }

        fun release() {
            if (m_multiCastLockReal != null) {
                try {
                    val cls = m_multiCastLockReal.javaClass
                    val method = cls.getMethod("release")
                    method.invoke(m_multiCastLockReal)
                } catch (e: Exception) {
                }
            }
        }
    }

    // MediaPlayerListener - nested listener for MediaPlayer completion/error events
    inner class MediaPlayerListener(private val m_channel: Int) :
        android.media.MediaPlayer.OnErrorListener,
        android.media.MediaPlayer.OnCompletionListener {

        override fun onCompletion(mp: android.media.MediaPlayer?) {
            m_MediaPlayerManager?.let { mgr ->
                mgr.m_AudioPlayRepeats[m_channel]--
                if (mgr.m_AudioPlayRepeats[m_channel] == 0) {
                    mgr.audioChangeState(AudioState.PlaybackCompleted, m_channel)
                    mgr.audioStop(m_channel)
                } else {
                    try {
                        mgr.m_MediaPlayer[m_channel]?.start()
                        mgr.audioChangeState(AudioState.Started, m_channel)
                    } catch (e: IllegalStateException) {
                        e.printStackTrace()
                    }
                }
            }
        }

        override fun onError(mp: android.media.MediaPlayer?, what: Int, extra: Int): Boolean {
            m_MediaPlayerManager?.let { mgr ->
                mgr.audioChangeState(AudioState.Error, m_channel)
                mgr.m_MediaPlayer[m_channel]?.reset()
                mgr.audioChangeState(AudioState.Idle, m_channel)
                mgr.audioStopped(m_channel)
            }
            return true
        }
    }

    // MediaPlayerManager - 16-channel audio system
    inner class MediaPlayerManager {
        private val m_NumAudioChannels = 16

        val m_MediaPlayer: Array<android.media.MediaPlayer?> = arrayOfNulls(m_NumAudioChannels)
        val m_MediaPlayerListener: Array<MediaPlayerListener?> = arrayOfNulls(m_NumAudioChannels)
        val m_AudioState: Array<AudioState> = Array(m_NumAudioChannels) { AudioState.None }
        val m_AudioIsPaused: Array<Boolean?> = arrayOfNulls(m_NumAudioChannels)
        val m_AudioPlayRepeats: IntArray = IntArray(m_NumAudioChannels)
        val m_AudioVolume: IntArray = IntArray(m_NumAudioChannels)

        init {
            for (i in 0 until m_NumAudioChannels) {
                m_MediaPlayer[i] = null
                m_MediaPlayerListener[i] = MediaPlayerListener(i)
                m_AudioState[i] = AudioState.None
                m_AudioIsPaused[i] = false
                m_AudioPlayRepeats[i] = 0
                m_AudioVolume[i] = 100
            }
        }

        fun audioGetNumChannels(): Int = m_NumAudioChannels

        fun audioGetStatus(channel: Int): Int {
            return when (m_AudioState[channel]) {
                AudioState.Initialized, AudioState.Stopped, AudioState.PlaybackCompleted,
                AudioState.Idle, AudioState.None, AudioState.Error -> 0
                AudioState.Prepared -> 1
                AudioState.Paused -> 2
                AudioState.Started -> 3
                else -> 0
            }
        }

        fun audioIsPlaying(channel: Int): Boolean {
            return m_MediaPlayer[channel] != null && m_AudioState[channel] == AudioState.Started
        }

        fun audioGetDuration(channel: Int): Int {
            if (m_MediaPlayer[channel] == null ||
                m_AudioState[channel] == AudioState.Error ||
                m_AudioState[channel] == AudioState.Idle ||
                m_AudioState[channel] == AudioState.Initialized) {
                return 0
            }
            return m_MediaPlayer[channel]?.duration ?: 0
        }

        fun audioGetPosition(channel: Int): Int {
            if (m_AudioState[channel] != AudioState.Started &&
                m_AudioState[channel] != AudioState.Paused) {
                return 0
            }
            return m_MediaPlayer[channel]?.currentPosition ?: 0
        }

        @Synchronized
        fun audioSetVolume(volume: Int, channel: Int) {
            m_AudioVolume[channel] = volume
            audioSetVolumeInternal(channel)
        }

        private fun audioSetVolumeInternal(channel: Int) {
            if (m_MediaPlayer[channel] != null && m_AudioState[channel] != AudioState.Error) {
                val vol = m_AudioVolume[channel].toFloat() / 100.0f
                m_MediaPlayer[channel]?.setVolume(vol, vol)
            }
        }

        @Synchronized
        fun audioSetPosition(position: Int, channel: Int) {
            m_MediaPlayer[channel]?.seekTo(position)
        }

        fun audioChangeState(state: AudioState, channel: Int) {
            m_AudioState[channel] = state
        }

        fun audioStopped(channel: Int) {
            this@LoaderThread.audioStoppedNotify(channel)
        }

        fun audioPlay(path: String, repeats: Int, offset: Long, length: Long, channel: Int): Int {
            audioStop(channel)

            if (m_MediaPlayer[channel] == null) {
                m_MediaPlayer[channel] = android.media.MediaPlayer()
                m_MediaPlayer[channel]?.setOnErrorListener(m_MediaPlayerListener[channel])
                m_MediaPlayer[channel]?.setOnCompletionListener(m_MediaPlayerListener[channel])
            }

            try {
                m_MediaPlayer[channel]?.reset()
                m_AudioState[channel] = AudioState.Idle

                if (length > 0) {
                    val file = java.io.File(path)
                    val pfd = android.os.ParcelFileDescriptor.open(file, 0x10000000)
                    val afd = android.content.res.AssetFileDescriptor(pfd, offset, length)
                    m_MediaPlayer[channel]?.setDataSource(
                        afd.fileDescriptor,
                        afd.startOffset,
                        afd.length
                    )
                    afd.close()
                    pfd.close()
                } else {
                    if (path.contains("http://") || path.contains("https://")) {
                        m_MediaPlayer[channel]?.setDataSource(path)
                    } else {
                        try {
                            val fis = java.io.FileInputStream(path)
                            m_MediaPlayer[channel]?.setDataSource(fis.fd)
                            fis.close()
                        } catch (e: java.io.FileNotFoundException) {
                            try {
                                val afd = m_Assets.openFd(path)
                                m_MediaPlayer[channel]?.setDataSource(
                                    afd.fileDescriptor,
                                    afd.startOffset,
                                    afd.length
                                )
                                afd.close()
                            } catch (e2: Exception) {
                                m_AudioState[channel] = AudioState.Error
                                e2.printStackTrace()
                                return -1
                            }
                        }
                    }
                }

                m_AudioState[channel] = AudioState.Initialized
                m_MediaPlayer[channel]?.prepare()
                m_AudioState[channel] = AudioState.Prepared

                audioSetVolumeInternal(channel)
                m_AudioPlayRepeats[channel] = repeats
                m_MediaPlayer[channel]?.isLooping = repeats != 0

                try {
                    m_MediaPlayer[channel]?.start()
                    m_AudioState[channel] = AudioState.Started
                    return 0
                } catch (e: IllegalStateException) {
                    e.printStackTrace()
                    return -2
                }
            } catch (e: java.io.IOException) {
                m_AudioState[channel] = AudioState.Error
                e.printStackTrace()
                return -2
            }
        }

        fun audioPause(channel: Int): Int {
            if (m_AudioState[channel] != AudioState.Started) return -1
            if (m_MediaPlayer[channel] == null) return -1

            try {
                m_MediaPlayer[channel]?.pause()
                m_AudioState[channel] = AudioState.Paused
                return 0
            } catch (e: IllegalStateException) {
                return -1
            }
        }

        fun audioResume(channel: Int): Int {
            if (m_AudioState[channel] != AudioState.Paused) return -1
            if (m_MediaPlayer[channel] == null) return -1

            try {
                m_MediaPlayer[channel]?.start()
                m_AudioState[channel] = AudioState.Started
                return 0
            } catch (e: IllegalStateException) {
                return -1
            }
        }

        fun audioStop(channel: Int) {
            val state = m_AudioState[channel]
            if (m_MediaPlayer[channel] != null &&
                (state == AudioState.Started || state == AudioState.Paused ||
                 state == AudioState.PlaybackCompleted)) {
                try {
                    m_MediaPlayer[channel]?.stop()
                    m_AudioState[channel] = AudioState.Stopped
                } catch (e: IllegalStateException) {
                }
                m_MediaPlayer[channel]?.reset()
                m_AudioState[channel] = AudioState.Idle
                audioStopped(channel)
            }
        }

        fun audioStopAll() {
            for (i in 0 until m_NumAudioChannels) {
                audioStop(i)
            }
        }

        fun doPause() {
            for (i in 0 until m_NumAudioChannels) {
                m_AudioIsPaused[i] = m_AudioState[i] == AudioState.Paused
                if (!m_AudioIsPaused[i]!!) {
                    audioPause(i)
                }
            }
        }

        fun doResume() {
            for (i in 0 until m_NumAudioChannels) {
                if (!m_AudioIsPaused[i]!!) {
                    audioResume(i)
                }
            }
        }

        fun release() {
            audioStopAll()
        }
    }
}
