package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderThread.java.
// 43 fields, 103 methods.

open class LoaderThread: Thread(), android.hardware.SensorEventListener {
    private var m_Accelerometer: android.hardware.Sensor
    private var m_AppDoingInitTerm: Int
    private var m_Assets: android.content.res.AssetManager
    private var m_BatteryLevel: Int
    private var m_BatteryLevelReceiver: android.content.BroadcastReceiver
    private var m_BatteryLevelReceiverRegistered: Boolean
    private var m_ChargerConnected: Boolean
    private var m_Compass: android.hardware.Sensor
    private val m_CreateView: Runnable
    private var m_DidSuspendForSurfaceChange: Boolean
    private var m_FileRoot: java.io.File
    private var m_FixScreenOrientation: Int
    private var m_Handler: android.os.Handler
    private var m_IgnoreResizeWhilePaused: Boolean
    private var m_Loader: com.ideaworks3d.marmalade.LoaderActivity
    private var m_LoaderSMSReceiver: com.ideaworks3d.marmalade.LoaderSMSReceiver
    private var m_Location: com.ideaworks3d.marmalade.LoaderLocation
    private var m_MediaPlayerManager: com.ideaworks3d.marmalade.LoaderThread.MediaPlayerManager
    private var m_MulticastLock: com.ideaworks3d.marmalade.LoaderThread.MulticastLockFacade
    private var m_NetworkCheckEnabled: Boolean
    private var m_NetworkCheckReceiver: android.content.BroadcastReceiver
    private var m_OnTouchWait: Integer
    private var m_Orientation: android.hardware.Sensor
    private var m_Paused: Boolean
    private var m_ResumeInProgress: Boolean
    private val m_RunOnOSThread: Runnable
    private var m_SensorManager: android.hardware.SensorManager
    private var m_SkipNextChange: Boolean
    private var m_SoundPlayer: com.ideaworks3d.marmalade.SoundPlayer
    private var m_SoundRecord: com.ideaworks3d.marmalade.SoundRecord
    private var m_StartScreenOrientation: Int
    private var m_Started: Boolean
    private var m_TelephonyManagerExists: Boolean
    private var m_TelephonyManagerExistsKnown: Boolean
    private var m_Terminating: Boolean
    private var m_TouchEvent: java.lang.reflect.Method
    private var m_TouchMulti: Boolean
    private var m_UseGL: Boolean
    private var m_VideoIsPaused: Boolean
    private var m_View: com.ideaworks3d.marmalade.LoaderView
    private var m_getRotation: java.lang.reflect.Method
    private var m_splashFinished: Boolean

    private constructor(p0: com.ideaworks3d.marmalade.LoaderActivity, p1: android.content.res.AssetManager, p2: java.io.File)

    private external fun audioStoppedNotify(p0: Int)

    private external fun chargerStateChanged(p0: Boolean)

    private fun doResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glResume()V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStart(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z
    //         :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;
    //         new-instance v2, Landroid/content/IntentFilter;
    //         const-string v3, "android.intent.action.BATTERY_CHANGED"
    //         invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;
    //         :cond_3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;
    //         new-instance v2, Landroid/content/IntentFilter;
    //         const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"
    //         invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         :cond_4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->resume()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->doResume()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoResume()I
    //         :cond_5
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         if-eqz v0, :cond_6
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         const/4 v1, -0x1
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/SoundRecord;->start(I)I
    //         :cond_6
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;
    //         new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;-><init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    //         return-void
    */

    private fun doSuspend() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;
    //         sget-object v2, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         invoke-direct {v0, v2}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;-><init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->doPause()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoGetStatus()I
    //         move-result v0
    //         const/4 v2, 0x2
    //         if-ne v0, v2, :cond_8
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoPause()I
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->pause()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundRecord;->stop()I
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         :cond_2
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;
    //         :cond_3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         :cond_4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStop()Z
    //         :cond_5
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         if-eqz v0, :cond_6
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    //         :cond_6
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         if-eqz v0, :cond_7
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    //         :cond_7
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glPause()V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         return-void
    //         :cond_8
    //         move v0, v1
    //         goto/16 :goto_0
    */

    private fun extendSplashOrientation(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x9
    //         if-ge v0, v1, :cond_0
    //         :goto_0
    //         return p1
    //         :cond_0
    //         sparse-switch p1, :sswitch_data_0
    //         goto :goto_0
    //         :sswitch_0
    //         const/4 p1, 0x6
    //         goto :goto_0
    //         :sswitch_1
    //         const/4 p1, 0x7
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x1 -> :sswitch_1
    //             0x8 -> :sswitch_0
    //             0x9 -> :sswitch_1
    //         .end sparse-switch
    */

    private fun fixOrientation(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->translateS3eOrientation(I)I
    //         move-result v0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I
    //         const-string v0, "AndroidIgnoreResizeWhilePaused"
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGet(Ljava/lang/String;I)I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_IgnoreResizeWhilePaused:Z
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->doFixOrientation()V
    //         return-void
    */

    private fun getCacheDir(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getCacheDir()Ljava/io/File;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun getPrivateExternalDir(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "mounted"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x8
    //         if-lt v0, v2, :cond_2
    //         :try_start_0
    //         const-class v0, Landroid/content/Context;
    //         const-string v2, "getExternalFilesDir"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Class;
    //         const/4 v4, 0x0
    //         const-class v5, Ljava/lang/String;
    //         aput-object v5, v3, v4
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const/4 v0, 0x1
    //         new-array v4, v0, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         const/4 v0, 0x0
    //         check-cast v0, Ljava/lang/String;
    //         aput-object v0, v4, v5
    //         invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/io/File;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_2
    //         move-object v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_2
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_1
    */

    private fun getRstDir(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "mounted"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun getTelephonyId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->telephonyManagerExists()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         const/4 v0, 0x0
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         :try_start_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;->getDeviceId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, ""
    //         :try_end_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    //         if-eq v0, v1, :cond_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    private fun getTmpDir(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x8
    //         if-lt v0, v2, :cond_1
    //         :try_start_0
    //         const-class v0, Landroid/content/Context;
    //         const-string v2, "getExternalCacheDir"
    //         const/4 v3, 0x0
    //         new-array v3, v3, [Ljava/lang/Class;
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const/4 v3, 0x0
    //         new-array v3, v3, [Ljava/lang/Object;
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/io/File;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    */

    private fun glInit(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_1
    //         :try_start_2
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderView;->glInit(I)Z
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    private fun glReInit() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glReInit()V
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         goto :goto_0
    */

    private fun glTerm() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glTerm()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;
    //         invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_1
    //         :try_start_2
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V
    //         :cond_2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         add-int/lit8 v0, v0, -0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    private external fun initNative()

    private external fun lowMemoryWarning()

    private external fun networkCheckChanged(p0: Boolean)

    private external fun onAccelNative(p0: Float, p1: Float, p2: Float)

    private external fun onCompassNative(p0: Int, p1: Float, p2: Float, p3: Float)

    private external fun resumeAppThreads()

    private external fun runNative(p0: String, p1: String, p2: String)

    private external fun runOnOSThreadNative(p0: Runnable)

    private external fun runOnOSTickNative()

    private external fun setViewNative(p0: com.ideaworks3d.marmalade.LoaderView)

    private external fun shutdownNative()

    private fun shuttingDown(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;
    //         const/4 v0, 0x0
    //         sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz p1, :cond_2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->shutdownNative()V
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->smsStop()V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->accelStop()V
    //         new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;-><init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isFinishing()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         :cond_3
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;
    //         :cond_4
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->networkCheckStop()Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->finish()V
    //         goto :goto_0
    */

    private external fun signalResume(p0: Boolean): Boolean

    private external fun signalSuspend(p0: Boolean): Boolean

    private external fun suspendAppThreads()

    private fun touchSetWait(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/Integer;
    //         invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;
    //         return-void
    */

    private fun translateS3eOrientation(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 5
    //         const/4 v2, -0x1
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v4, 0x9
    //         if-ge v3, v4, :cond_1
    //         move v3, v0
    //         :goto_0
    //         packed-switch p1, :pswitch_data_0
    //         move v0, v2
    //         :cond_0
    //         :goto_1
    //         :pswitch_0
    //         return v0
    //         :cond_1
    //         move v3, v1
    //         goto :goto_0
    //         :pswitch_1
    //         move v0, v2
    //         goto :goto_1
    //         :pswitch_2
    //         if-nez v3, :cond_0
    //         const/4 v0, 0x7
    //         goto :goto_1
    //         :pswitch_3
    //         if-eqz v3, :cond_2
    //         move v0, v1
    //         goto :goto_1
    //         :cond_2
    //         const/4 v0, 0x6
    //         goto :goto_1
    //         :pswitch_4
    //         move v0, v1
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_0
    //             :pswitch_4
    //         .end packed-switch
    */

    private fun translateSplashOrientation(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         sparse-switch p1, :sswitch_data_0
    //         :cond_0
    //         :goto_0
    //         return p1
    //         :sswitch_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_splashFinished:Z
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_StartScreenOrientation:I
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->extendSplashOrientation(I)I
    //         move-result p1
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x4 -> :sswitch_0
    //             0xa -> :sswitch_0
    //         .end sparse-switch
    */

    private fun waitForView() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :goto_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->waitForSurface()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->setViewNative(Lcom/ideaworks3d/marmalade/LoaderView;)V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    public fun accelStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //         :cond_0
    //         return-void
    */

    public fun accelStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;
    //         :cond_0
    //         return-void
    */

    public fun acquireMulticastLock(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         const/4 v2, 0x3
    //         if-gt v0, v2, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v2, "wifi"
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/wifi/WifiManager;
    //         :try_start_0
    //         new-instance v2, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         invoke-direct {v2, p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;Landroid/net/wifi/WifiManager;)V
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->acquire()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->isHeld()Z
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    public fun audioStopAll() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioStopAll()V
    //         return-void
    */

    public fun chargerIsConnected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ChargerConnected:Z
    //         return v0
    */

    public fun clipboardGet(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "clipboard"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/text/ClipboardManager;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/text/ClipboardManager;->hasText()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Landroid/text/ClipboardManager;->getText()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun clipboardSet(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "clipboard"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/text/ClipboardManager;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V
    //         :cond_0
    //         return-void
    */

    public fun compassStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         const/4 v1, 0x2
    //         invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         const/4 v1, 0x3
    //         invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //         :cond_0
    //         return-void
    */

    public fun compassStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;
    //         invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;
    //         :cond_0
    //         return-void
    */

    public fun doFixOrientation() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->translateSplashOrientation(I)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->setRequestedOrientation(I)V
    //         return-void
    */

    public fun getBatteryLevel(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevel:I
    //         return v0
    */

    public fun getDeviceDpi(p0: Boolean): Int { return TODO("body: (Z)I") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         if-eqz p1, :cond_0
    //         iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    //         int-to-float v1, v1
    //         iget v2, v0, Landroid/util/DisplayMetrics;->xdpi:F
    //         div-float/2addr v1, v2
    //         iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I
    //         int-to-float v2, v2
    //         iget v3, v0, Landroid/util/DisplayMetrics;->ydpi:F
    //         div-float/2addr v2, v3
    //         mul-float/2addr v1, v1
    //         mul-float/2addr v2, v2
    //         add-float/2addr v1, v2
    //         float-to-double v2, v1
    //         invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D
    //         move-result-wide v2
    //         double-to-float v1, v2
    //         iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    //         iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    //         mul-int/2addr v2, v3
    //         iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I
    //         iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I
    //         mul-int/2addr v0, v3
    //         add-int/2addr v0, v2
    //         int-to-double v2, v0
    //         invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D
    //         move-result-wide v2
    //         double-to-float v0, v2
    //         div-float/2addr v0, v1
    //         float-to-int v0, v0
    //         goto :goto_0
    */

    public fun getDeviceIMSI(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->telephonyManagerExists()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         const/4 v0, 0x0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;->getSubscriberId()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun getDeviceId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         const/4 v0, 0x1
    //         const-string v2, "AndroidTryAndroidIdFirst"
    //         invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGet(Ljava/lang/String;I)I
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         move v2, v0
    //         :goto_0
    //         if-nez v2, :cond_2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->getTelephonyId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         const-string v3, ""
    //         if-eq v0, v3, :cond_2
    //         :cond_0
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         move v2, v0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const-string v3, "android_id"
    //         invoke-static {v0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         const-string v3, "9774d56d682e549c"
    //         if-ne v0, v3, :cond_0
    //         :cond_3
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v3, 0x9
    //         if-lt v0, v3, :cond_4
    //         :try_start_0
    //         const-class v0, Landroid/os/Build;
    //         const-string v3, "SERIAL"
    //         invoke-virtual {v0, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v0
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         if-nez v0, :cond_0
    //         :cond_4
    //         :goto_2
    //         if-eqz v2, :cond_5
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->getTelephonyId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_5
    //         const-string v2, ""
    //         if-ne v0, v2, :cond_0
    //         :cond_5
    //         move-object v0, v1
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         goto :goto_2
    */

    public fun getDeviceModel(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDeviceNumber(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->telephonyManagerExists()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         const/4 v0, 0x0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;->getLine1Number()Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun getNetworkSubType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "connectivity"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun getNetworkType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "connectivity"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun getOrientation(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v2, "window"
    //         invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/WindowManager;
    //         invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;
    //         if-nez v2, :cond_0
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "getRotation"
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/Class;
    //         invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v3
    //         iput-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;
    //         :try_end_0
    //         .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         :try_start_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;
    //         const/4 v3, 0x0
    //         new-array v3, v3, [Ljava/lang/Object;
    //         invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    //         move-result v0
    //         :goto_1
    //         return v0
    //         :catch_0
    //         move-exception v3
    //         :try_start_2
    //         const-string v3, "getOrientation"
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/Class;
    //         invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;
    //         :try_end_2
    //         .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v2
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_1
    */

    public fun getSilentMode(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "audio"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/media/AudioManager;
    //         invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I
    //         move-result v0
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getStarted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         return v0
    */

    public fun hasMultitouch(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         :try_start_0
    //         const-class v2, Landroid/content/pm/PackageManager;
    //         const-string v3, "hasSystemFeature"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Class;
    //         const/4 v5, 0x0
    //         const-class v6, Ljava/lang/String;
    //         aput-object v6, v4, v5
    //         invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v2
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         const-string v5, "android.hardware.touchscreen.multitouch"
    //         aput-object v5, v3, v4
    //         invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun launchBrowser(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         const-string v0, "vfstore"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "android.intent.action.VIEW"
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         :cond_0
    //         const/high16 v0, 0x14200000
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivity(Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun locationGpsData(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationGpsData()Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun locationStart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-direct {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStart(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun locationStop(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStop()Z
    //         move-result v0
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;
    //         goto :goto_0
    */

    public fun networkCheckStart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return v4
    //         :cond_0
    //         iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;
    //         new-instance v2, Landroid/content/IntentFilter;
    //         const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"
    //         invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         goto :goto_0
    */

    public fun networkCheckStop(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v2
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         goto :goto_0
    */

    public fun onAccuracyChanged(p0: android.hardware.Sensor, p1: Int) { /* TODO(body): (Landroid/hardware/Sensor;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->shuttingDown(Z)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->interrupt()V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->join()V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->lowMemoryWarning()V
    //         return-void
    */

    public external fun onMotionEvent(p0: Int, p1: Int, p2: Int, p3: Int)

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-direct {p0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->signalSuspend(Z)Z
    //         goto :goto_0
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;
    //         invoke-direct {p0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->signalResume(Z)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;
    //         :cond_0
    //         return-void
    */

    public fun onSensorChanged(p0: android.hardware.SensorEvent) { /* TODO(body): (Landroid/hardware/SensorEvent;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x2
    //         const/4 v4, 0x0
    //         const/4 v3, 0x1
    //         iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;
    //         invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
    //         move-result v0
    //         if-ne v0, v3, :cond_1
    //         iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v0, v0, v4
    //         iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v1, v1, v3
    //         iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v2, v2, v5
    //         invoke-direct {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->onAccelNative(FFF)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         if-ne v0, v5, :cond_2
    //         iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v0, v0, v4
    //         iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v1, v1, v3
    //         iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v2, v2, v5
    //         invoke-direct {p0, v4, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->onCompassNative(IFFF)V
    //         goto :goto_0
    //         :cond_2
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v0, v0, v4
    //         iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v1, v1, v3
    //         iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F
    //         aget v2, v2, v5
    //         invoke-direct {p0, v3, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->onCompassNative(IFFF)V
    //         goto :goto_0
    */

    public fun onSplashFinished() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_splashFinished:Z
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->doFixOrientation()V
    //         return-void
    */

    public fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x2
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;
    //         if-eqz v3, :cond_1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;
    //         const/4 v2, 0x0
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p0, v3, v4
    //         const/4 v4, 0x1
    //         aput-object p1, v3, v4
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;
    //         monitor-enter v2
    //         :try_start_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;
    //         invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    //         move-result v3
    //         int-to-long v4, v3
    //         invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V
    //         :try_end_1
    //         .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_1
    //         :try_start_2
    //         monitor-exit v2
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :cond_0
    //         return v1
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v3
    //         float-to-int v3, v3
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v4
    //         float-to-int v4, v4
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v5
    //         and-int/lit16 v5, v5, 0xff
    //         packed-switch v5, :pswitch_data_0
    //         move v0, v2
    //         :goto_2
    //         :pswitch_0
    //         add-int/lit8 v0, v0, 0x3
    //         invoke-virtual {p0, v2, v0, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderThread;->onMotionEvent(IIII)V
    //         goto :goto_0
    //         :pswitch_1
    //         move v0, v1
    //         goto :goto_2
    //         :pswitch_2
    //         const/4 v0, 0x3
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v2
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    //         :catch_1
    //         move-exception v0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun recordAvailable(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/SoundRecord;->available()I
    //         move-result v0
    //         return v0
    */

    public fun recordStart(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/SoundRecord;
    //         invoke-direct {v0}, Lcom/ideaworks3d/marmalade/SoundRecord;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/SoundRecord;->start(I)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun recordStop(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundRecord;->stop()I
    //         move-result v0
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;
    //         :cond_0
    //         return v0
    */

    public fun releaseMulticastLock(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->release()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun resumeAfterSurfaceChange() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_DidSuspendForSurfaceChange:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_DidSuspendForSurfaceChange:Z
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->resumeAppThreads()V
    //         :cond_0
    //         return-void
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FileRoot:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "/lib"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x9
    //         if-lt v1, v2, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
    //         move-result-object v0
    //         iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;
    //         :cond_0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FileRoot:Ljava/io/File;
    //         invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageResourcePath()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {p0, v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->runNative(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->shuttingDown(Z)V
    //         return-void
    */

    public fun runOnOSSignal() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_RunOnOSThread:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun runOnOSThread(p0: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThreadNative(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun runRunnable(p0: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 0
    //         invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    //         return-void
    */

    public fun sendEmail(p0: String, p1: String, p2: String): Boolean { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         :try_start_0
    //         const-string v0, ",\\s*?"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         const-string v2, "android.intent.action.SEND"
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "text/xml"
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "android.intent.extra.EMAIL"
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v0, "android.intent.extra.SUBJECT"
    //         invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v0, "android.intent.extra.TEXT"
    //         invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const/high16 v0, 0x14200000
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivity(Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setView(p0: com.ideaworks3d.marmalade.LoaderView) { /* TODO(body): (Lcom/ideaworks3d/marmalade/LoaderView;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->getCurrentOrientation()I
    //         move-result v0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_StartScreenOrientation:I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->doFixOrientation()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->setViewNative(Lcom/ideaworks3d/marmalade/LoaderView;)V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun skipSurfaceChange(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         const/4 v0, 0x1
    //         iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_IgnoreResizeWhilePaused:Z
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I
    //         const/4 v3, 0x4
    //         if-eq v2, v3, :cond_0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SkipNextChange:Z
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;
    //         invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SkipNextChange:Z
    //         if-eqz v2, :cond_1
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SkipNextChange:Z
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_0
    */

    public fun smsStart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         if-nez v0, :cond_0
    //         sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         const/4 v1, 0x3
    //         if-le v0, v1, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         invoke-direct {v0}, Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         new-instance v2, Landroid/content/IntentFilter;
    //         const-string v3, "android.provider.Telephony.SMS_RECEIVED"
    //         invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun smsStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;
    //         :cond_0
    //         return-void
    */

    public fun soundInit(p0: Int, p1: Boolean, p2: Int): Int { return TODO("body: (IZI)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/SoundPlayer;->init(IZI)I
    //         move-result v0
    //         return v0
    */

    public fun soundSetVolume(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/SoundPlayer;->setVolume(I)V
    //         return-void
    */

    public fun soundStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->start()V
    //         return-void
    */

    public fun soundStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->stop()V
    //         return-void
    */

    public fun suspendForSurfaceChange() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->suspendAppThreads()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_DidSuspendForSurfaceChange:Z
    //         :cond_0
    //         return-void
    */

    public fun telephonyManagerExists(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExistsKnown:Z
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExists:Z
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "com.ideaworks3d.marmalade.TelephonyManagerProxy"
    //         invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move v0, v1
    //         :goto_1
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExistsKnown:Z
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExists:Z
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    companion object {
    var g_Singleton: com.ideaworks3d.marmalade.LoaderThread

    public @JvmStatic fun getInstance(p0: com.ideaworks3d.marmalade.LoaderActivity, p1: android.content.res.AssetManager, p2: java.io.File, p3: com.ideaworks3d.marmalade.LoaderView): com.ideaworks3d.marmalade.LoaderThread { return TODO("body: (Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/LoaderThread;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/ideaworks3d/marmalade/LoaderThread;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;)V
    //         sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0, p3}, Lcom/ideaworks3d/marmalade/LoaderThread;->setView(Lcom/ideaworks3d/marmalade/LoaderView;)V
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->start()V
    //         :goto_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         iget-object v1, v0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         iput-object p0, v0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0, p3}, Lcom/ideaworks3d/marmalade/LoaderThread;->setView(Lcom/ideaworks3d/marmalade/LoaderView;)V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
