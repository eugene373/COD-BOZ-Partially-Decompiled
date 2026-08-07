package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 41 fields, 91 methods.

open class LoaderThread: java.lang.Thread(), android.hardware.SensorEventListener {
        private var m_AppDoingInitTerm: Int
        private var m_DidSuspendForSurfaceChange: Boolean
        private var m_TelephonyManagerExistsKnown: Boolean
        private var m_TelephonyManagerExists: Boolean
        private var m_SkipNextChange: Boolean
        private var m_IgnoreResizeWhilePaused: Boolean
        private var m_MediaPlayerManager: com.ideaworks3d.marmalade.LoaderThread$MediaPlayerManager
        private var m_BatteryLevel: Int
        private var m_ChargerConnected: Boolean
        private var m_BatteryLevelReceiver: android.content.BroadcastReceiver
        private var m_NetworkCheckReceiver: android.content.BroadcastReceiver
        private var m_NetworkCheckEnabled: Boolean
        private var m_Handler: android.os.Handler
        private var m_FileRoot: java.io.File
        private var m_Loader: com.ideaworks3d.marmalade.LoaderActivity
        private var m_View: com.ideaworks3d.marmalade.LoaderView
        private var m_Location: com.ideaworks3d.marmalade.LoaderLocation
        private var m_Assets: android.content.res.AssetManager
        private var m_SoundPlayer: com.ideaworks3d.marmalade.SoundPlayer
        private var m_SoundRecord: com.ideaworks3d.marmalade.SoundRecord
        private var m_UseGL: Boolean
        private var m_SensorManager: android.hardware.SensorManager
        private var m_Accelerometer: android.hardware.Sensor
        private var m_Compass: android.hardware.Sensor
        private var m_Orientation: android.hardware.Sensor
        private var m_FixScreenOrientation: Int
        private var m_StartScreenOrientation: Int
        private var m_Stopped: Boolean
        private var m_ResumeInProgress: Boolean
        private var m_VideoIsPaused: Boolean
        private var m_Started: Boolean
        private var m_Terminating: Boolean
        private var m_LoaderSMSReceiver: com.ideaworks3d.marmalade.LoaderSMSReceiver
        private var m_OnTouchWait: Integer
        private var m_TouchMulti: Boolean
        private var m_MulticastLock: com.ideaworks3d.marmalade.LoaderThread$MulticastLockFacade
        private val m_RunOnOSThread: Runnable
        private val m_CreateView: Runnable
        private var m_BatteryLevelReceiverRegistered: Boolean
        private var m_splashFinished: Boolean

    private external fun runNative(p0: String, p1: String, p2: String)
    private external fun setViewNative(p0: com.ideaworks3d.marmalade.LoaderView)
    private external fun shutdownNative()
    private external fun initNative()
    private external fun onAccelNative(p0: Float, p1: Float, p2: Float)
    private external fun onCompassNative(p0: Int, p1: Float, p2: Float, p3: Float)
    private external fun runOnOSThreadNative(p0: Runnable)
    private external fun runOnOSTickNative()
    private external fun signalSuspend(p0: Boolean): Boolean
    private external fun signalResume(p0: Boolean): Boolean
    private external fun lowMemoryWarning()
    public external fun onMotionEvent(p0: Int, p1: Int, p2: Int, p3: Int)
    private external fun audioStoppedNotify(p0: Int)
    private external fun chargerStateChanged(p0: Boolean)
    private external fun networkCheckChanged(p0: Boolean)
    private external fun suspendAppThreads()
    private external fun resumeAppThreads()
    public fun suspendForSurfaceChange() { /* TODO(body): ()V */ }
    public fun resumeAfterSurfaceChange() { /* TODO(body): ()V */ }
    public fun skipSurfaceChange(): Boolean { return TODO("body: ()Z") }
    public fun audioStopAll() { /* TODO(body): ()V */ }
    public fun soundSetVolume(p0: Int) { /* TODO(body): (I)V */ }
    public fun getStarted(): Boolean { return TODO("body: ()Z") }
    public fun setView(p0: com.ideaworks3d.marmalade.LoaderView) { /* TODO(body): (Lcom/ideaworks3d/marmalade/LoaderView;)V */ }
    private fun translateS3eOrientation(p0: Int): Int { return TODO("body: (I)I") }
    private fun fixOrientation(p0: Int) { /* TODO(body): (I)V */ }
    public fun getOrientation(): Int { return TODO("body: ()I") }
    public fun onSplashFinished() { /* TODO(body): ()V */ }
    private fun extendSplashOrientation(p0: Int): Int { return TODO("body: (I)I") }
    private fun translateSplashOrientation(p0: Int): Int { return TODO("body: (I)I") }
    public fun doFixOrientation() { /* TODO(body): ()V */ }
    private fun touchSetWait(p0: Int) { /* TODO(body): (I)V */ }
    public fun onResume() { /* TODO(body): ()V */ }
    public fun runRunnable(p0: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    public fun runOnOSThread(p0: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    public fun runOnOSSignal() { /* TODO(body): ()V */ }
    public fun onStop() { /* TODO(body): ()V */ }
    public fun onAccuracyChanged(p0: android.hardware.Sensor, p1: Int) { /* TODO(body): (Landroid/hardware/Sensor;I)V */ }
    public fun onSensorChanged(p0: android.hardware.SensorEvent) { /* TODO(body): (Landroid/hardware/SensorEvent;)V */ }
    public fun accelStart() { /* TODO(body): ()V */ }
    public fun accelStop() { /* TODO(body): ()V */ }
    public fun smsStart(): Boolean { return TODO("body: ()Z") }
    public fun smsStop() { /* TODO(body): ()V */ }
    public fun compassStart() { /* TODO(body): ()V */ }
    public fun compassStop() { /* TODO(body): ()V */ }
    public fun soundInit(p0: Int, p1: Boolean, p2: Int): Int { return TODO("body: (IZI)I") }
    public fun soundStart() { /* TODO(body): ()V */ }
    public fun soundStop() { /* TODO(body): ()V */ }
    public fun recordAvailable(): Int { return TODO("body: ()I") }
    public fun recordStart(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    public fun recordStop(): Int { return TODO("body: ()I") }
    public fun clipboardGet(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun clipboardSet(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    public fun networkCheckStart(): Boolean { return TODO("body: ()Z") }
    public fun networkCheckStop(): Boolean { return TODO("body: ()Z") }
    public fun getBatteryLevel(): Int { return TODO("body: ()I") }
    public fun getDeviceDpi(p0: Boolean): Int { return TODO("body: (Z)I") }
    public fun chargerIsConnected(): Boolean { return TODO("body: ()Z") }
    private fun doSuspend() { /* TODO(body): ()V */ }
    private fun doResume() { /* TODO(body): ()V */ }
    private fun waitForView() { /* TODO(body): ()V */ }
    private fun glInit(p0: Int) { /* TODO(body): (I)V */ }
    private fun glTerm() { /* TODO(body): ()V */ }
    private fun glReInit() { /* TODO(body): ()V */ }
    public fun run() { /* TODO(body): ()V */ }
    private fun getPrivateExternalDir(): String { return TODO("body: ()Ljava/lang/String;") }
    private fun getRstDir(): String { return TODO("body: ()Ljava/lang/String;") }
    private fun getCacheDir(): String { return TODO("body: ()Ljava/lang/String;") }
    private fun getTmpDir(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun hasMultitouch(): Boolean { return TODO("body: ()Z") }
    private fun shuttingDown(p0: Boolean) { /* TODO(body): (Z)V */ }
    public fun onDestroy() { /* TODO(body): ()V */ }
    public fun onLowMemory() { /* TODO(body): ()V */ }
    public fun locationStart(): Boolean { return TODO("body: ()Z") }
    public fun locationStop(): Boolean { return TODO("body: ()Z") }
    public fun locationGpsData(): Boolean { return TODO("body: ()Z") }
    public fun getDeviceModel(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun telephonyManagerExists(): Boolean { return TODO("body: ()Z") }
    private fun getTelephonyId(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun getDeviceId(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun getDeviceIMSI(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun getDeviceNumber(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun getSilentMode(): Boolean { return TODO("body: ()Z") }
    public fun launchBrowser(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    public fun sendEmail(p0: String, p1: String, p2: String): Boolean { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z") }
    public fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    public fun getNetworkType(): Int { return TODO("body: ()I") }
    public fun getNetworkSubType(): Int { return TODO("body: ()I") }
    public fun acquireMulticastLock(): Boolean { return TODO("body: ()Z") }
    public fun releaseMulticastLock(): Boolean { return TODO("body: ()Z") }

    companion object {
        var g_Singleton: com.ideaworks3d.marmalade.LoaderThread

        public @JvmStatic fun getInstance(p0: com.ideaworks3d.marmalade.LoaderActivity, p1: android.content.res.AssetManager, p2: java.io.File, p3: com.ideaworks3d.marmalade.LoaderView): com.ideaworks3d.marmalade.LoaderThread { return TODO("body: (Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/LoaderThread;") }
    }
}
