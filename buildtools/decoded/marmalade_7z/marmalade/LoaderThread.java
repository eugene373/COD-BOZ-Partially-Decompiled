package com.ideaworks3d.marmalade;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.provider.Settings.Secure;
import android.text.ClipboardManager;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoaderThread extends Thread implements SensorEventListener {
      private int m_AppDoingInitTerm;
      private boolean m_DidSuspendForSurfaceChange;
      private boolean m_TelephonyManagerExistsKnown;
      private boolean m_TelephonyManagerExists;
      private boolean m_SkipNextChange;
      private boolean m_IgnoreResizeWhilePaused;
      private LoaderThread.MediaPlayerManager m_MediaPlayerManager;
      private int m_BatteryLevel;
      private boolean m_ChargerConnected;
      private BroadcastReceiver m_BatteryLevelReceiver = new BroadcastReceiver() {
            public void onReceive(Context var1, Intent var2) {
                  LoaderThread.this.m_BatteryLevel = var2.getIntExtra("level", 0);
                  boolean var3 = LoaderThread.this.m_ChargerConnected;
                  LoaderThread.this.m_ChargerConnected = var2.getIntExtra("plugged", 0) != 0;
                  if (var3 != LoaderThread.this.m_ChargerConnected) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "m_ChargerConnected = " + LoaderThread.this.m_ChargerConnected);
                        LoaderThread.this.chargerStateChanged(LoaderThread.this.m_ChargerConnected);
                  }

            }
      };
      private BroadcastReceiver m_NetworkCheckReceiver = new BroadcastReceiver() {
            public void onReceive(Context var1, Intent var2) {
                  ConnectivityManager var3 = (ConnectivityManager)var1.getSystemService(Context.CONNECTIVITY_SERVICE);
                  NetworkInfo var4 = var3.getActiveNetworkInfo();
                  if (var4 != null && var4.isAvailable() && var4.isConnected()) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "network check -> on");
                        LoaderThread.this.networkCheckChanged(true);
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "network check -> off");
                        LoaderThread.this.networkCheckChanged(false);
                  }

            }
      };
      private boolean m_NetworkCheckEnabled = false;
      private Handler m_Handler = new Handler();
      private File m_FileRoot;
      private LoaderActivity m_Loader;
      private LoaderView m_View;
      private LoaderLocation m_Location;
      private AssetManager m_Assets;
      private SoundPlayer m_SoundPlayer;
      private SoundRecord m_SoundRecord = null;
      private boolean m_UseGL = false;
      private SensorManager m_SensorManager;
      private Sensor m_Accelerometer;
      private Sensor m_Compass;
      private Sensor m_Orientation;
      private int m_FixScreenOrientation;
      private int m_StartScreenOrientation;
      private Boolean m_Stopped = false;
      private Boolean m_ResumeInProgress = false;
      private Boolean m_VideoIsPaused = false;
      private Boolean m_Started = false;
      private Boolean m_Terminating = false;
      private LoaderSMSReceiver m_LoaderSMSReceiver;
      private Integer m_OnTouchWait = new Integer(0);
      private boolean m_TouchMulti = false;
      static LoaderThread g_Singleton;
      private LoaderThread.MulticastLockFacade m_MulticastLock = null;
      private final Runnable m_RunOnOSThread = new Runnable() {
            public void run() {
                  LoaderThread.this.runOnOSTickNative();
            }
      };
      private final Runnable m_CreateView = new Runnable() {
            public void run() {
                  LoaderThread.this.m_Loader.createView(LoaderThread.this.m_UseGL);
                  synchronized(LoaderThread.this.m_CreateView) {
                        LoaderThread.this.m_CreateView.notify();
                  }
            }
      };
      private Boolean m_BatteryLevelReceiverRegistered = false;
      private boolean m_splashFinished = false;

      private native void runNative(String var1, String var2, String var3);

      private native void setViewNative(LoaderView var1);

      private native void shutdownNative();

      private native void initNative();

      private native void onAccelNative(float var1, float var2, float var3);

      private native void onCompassNative(int var1, float var2, float var3, float var4);

      private native void runOnOSThreadNative(Runnable var1);

      private native void runOnOSTickNative();

      private native boolean signalSuspend(boolean var1);

      private native boolean signalResume(boolean var1);

      private native void lowMemoryWarning();

      public native void onMotionEvent(int var1, int var2, int var3, int var4);

      private native void audioStoppedNotify(int var1);

      private native void chargerStateChanged(boolean var1);

      private native void networkCheckChanged(boolean var1);

      private native void suspendAppThreads();

      private native void resumeAppThreads();

      public void suspendForSurfaceChange() {
            if (this.m_AppDoingInitTerm == 0 && !this.m_ResumeInProgress) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "suspending app threads for surface change");
                  this.suspendAppThreads();
                  this.m_DidSuspendForSurfaceChange = true;
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "skipping suspendAppThreads after surface change");
            }

      }

      public void resumeAfterSurfaceChange() {
            if (this.m_DidSuspendForSurfaceChange) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "resuming app threads after surface change");
                  this.m_DidSuspendForSurfaceChange = false;
                  this.resumeAppThreads();
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "skipping resumeAppThreads after surface change");
            }

      }

      public boolean skipSurfaceChange() {
            if (this.m_IgnoreResizeWhilePaused) {
                  if (this.m_Stopped && this.m_FixScreenOrientation != 4) {
                        this.m_SkipNextChange = true;
                        return true;
                  }

                  if (!this.m_Stopped && this.m_SkipNextChange) {
                        this.m_SkipNextChange = false;
                        return true;
                  }
            }

            return false;
      }

      public void audioStopAll() {
            this.m_MediaPlayerManager.audioStopAll();
      }

      public void soundSetVolume(int var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "soundSetVolume");
            this.m_SoundPlayer.setVolume(var1);
      }

      public boolean getStarted() {
            return this.m_Started;
      }

      private LoaderThread(LoaderActivity var1, AssetManager var2, File var3) {
            this.m_Assets = var2;
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "this " + this);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "m_Loader " + var1);
            this.m_Loader = var1;
            this.m_StartScreenOrientation = 1;
            this.m_FixScreenOrientation = var1.getRequestedOrientation();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "LoaderThread m_FixScreenOrientation : " + this.m_FixScreenOrientation + ", m_StartScreenOrientation=" + this.m_StartScreenOrientation);
            this.m_FileRoot = var3;
            this.m_SoundPlayer = new SoundPlayer();
            this.m_MediaPlayerManager = new LoaderThread.MediaPlayerManager();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "registerReceiver");
            this.m_Loader.registerReceiver(this.m_BatteryLevelReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.m_BatteryLevelReceiverRegistered = true;
            this.m_SensorManager = (SensorManager)this.m_Loader.getSystemService(Context.SENSOR_SERVICE);

            try {
                  File var4 = new File(this.m_FileRoot, "makeramdirectory.txt");
                  if (var4.mkdirs()) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Created directory: " + var4.getAbsoluteFile().getParent());
                  }

                  var4.delete();
            } catch (Exception var5) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Error creating directory: " + var5.getMessage());
            }

            this.initNative();
      }

      public void setView(LoaderView var1) {
            if (this.m_View != null) {
                  synchronized(this.m_View) {
                        if (this.m_View != null) {
                              this.m_View.notify();
                        }
                  }
            }

            this.m_View = var1;
            this.m_StartScreenOrientation = this.m_View.getCurrentOrientation();
            this.doFixOrientation();
            this.setViewNative(this.m_View);
      }

      public static LoaderThread getInstance(LoaderActivity var0, AssetManager var1, File var2, LoaderView var3) {
            if (g_Singleton == null) {
                  LoaderAPI.traceChan("LoaderThread-" + Thread.currentThread().getName(), "creating new marmalade thread");
                  g_Singleton = new LoaderThread(var0, var1, var2);
                  g_Singleton.setView(var3);
                  g_Singleton.start();
            } else {
                  LoaderAPI.traceChan("LoaderThread-" + Thread.currentThread().getName(), "re-using exsiting LoaderThread");
                  synchronized(g_Singleton.m_View) {
                        LoaderAPI.traceChan("LoaderThread-" + Thread.currentThread().getName(), "notifying existing view in case thread is waiting for surface");
                        g_Singleton.m_Loader = var0;
                        g_Singleton.setView(var3);
                  }
            }

            return g_Singleton;
      }

      private int translateS3eOrientation(int var1) {
            switch(var1) {
            case 0:
                  return -1;
            case 1:
                  return 7;
            case 2:
                  return 6;
            case 3:
                  return 1;
            case 4:
                  return 0;
            default:
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Can not translate s3e orientation : " + var1);
                  return -1;
            }
      }

      private void fixOrientation(int var1) {
            this.m_FixScreenOrientation = this.translateS3eOrientation(var1);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "fixOrientation s3e orientation is " + var1 + ", fixOrientation android orientation is " + this.m_FixScreenOrientation);
            if (LoaderAPI.s3eConfigGet("AndroidIgnoreResizeWhilePaused", 0) != 0) {
                  this.m_IgnoreResizeWhilePaused = true;
            }

            this.doFixOrientation();
      }

      public int getOrientation() {
            boolean var1 = false;
            WindowManager var2 = (WindowManager)this.m_Loader.getSystemService(Context.WINDOW_SERVICE);
            return var2.getDefaultDisplay().getRotation();
      }

      public void onSplashFinished() {
            this.m_splashFinished = true;
            this.doFixOrientation();
      }

      private int extendSplashOrientation(int var1) {
            switch(var1) {
            case 0:
            case 8:
                  return 6;
            case 1:
            case 9:
                  return 7;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                  return var1;
            }
      }

      private int translateSplashOrientation(int var1) {
            switch(var1) {
            case 4:
            case 10:
                  return this.m_splashFinished ? var1 : this.extendSplashOrientation(this.m_StartScreenOrientation);
            default:
                  return var1;
            }
      }

      public void doFixOrientation() {
            int var1 = this.translateSplashOrientation(this.m_FixScreenOrientation);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doFixOrientation m_FixScreenOrientation=" + this.m_FixScreenOrientation + ", orientationToSet=" + var1);
            this.m_Loader.setRequestedOrientation(var1);
      }

      private void touchSetWait(int var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "touchSetWait: " + var1);
            this.m_OnTouchWait = new Integer(var1);
      }

      public void onResume() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onResume");
            this.m_Stopped = false;
            this.m_ResumeInProgress = true;
            if (!this.signalResume(false)) {
                  this.m_ResumeInProgress = false;
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onResume: done");
      }

      public void runRunnable(Runnable var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "runRunnable: calling RunOnOS java func");
            var1.run();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "runRunnable: done calling RunOnOS java func");
      }

      public void runOnOSThread(Runnable var1) {
            this.runOnOSThreadNative(var1);
      }

      public void runOnOSSignal() {
            this.m_Handler.post(this.m_RunOnOSThread);
      }

      public void onStop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onStop");
            if (this.m_Terminating) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onStop: doing nothing during termination");
            } else if (!this.m_Started) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onStop: not waiting during startup");
            } else if (this.m_Stopped) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onStop: already paused or pausing");
            } else {
                  this.m_Stopped = true;
                  this.signalSuspend(true);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onStop: done");
            }
      }

      public void onAccuracyChanged(Sensor var1, int var2) {
      }

      public void onSensorChanged(SensorEvent var1) {
            int var2 = var1.sensor.getType();
            if (var2 == 1) {
                  this.onAccelNative(var1.values[0], var1.values[1], var1.values[2]);
            } else if (var2 == 2) {
                  this.onCompassNative(0, var1.values[0], var1.values[1], var1.values[2]);
            } else if (var2 == 3) {
                  this.onCompassNative(1, var1.values[0], var1.values[1], var1.values[2]);
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "unhandled sensor changed: " + var1.sensor + " " + var1.values.length);
            }

      }

      public void accelStart() {
            if (this.m_Accelerometer == null) {
                  this.m_Accelerometer = this.m_SensorManager.getDefaultSensor(1);
                  this.m_SensorManager.registerListener(this, this.m_Accelerometer, 1);
            }

      }

      public void accelStop() {
            if (this.m_Accelerometer != null) {
                  this.m_SensorManager.unregisterListener(this, this.m_Accelerometer);
                  this.m_Accelerometer = null;
            }

      }

      public boolean smsStart() {
            if (this.m_LoaderSMSReceiver == null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "registerSmsReceiver");
                  this.m_LoaderSMSReceiver = new LoaderSMSReceiver();
                  this.m_Loader.registerReceiver(this.m_LoaderSMSReceiver, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
                  return true;
            } else {
                  return false;
            }
      }

      public void smsStop() {
            if (this.m_LoaderSMSReceiver != null) {
                  this.m_Loader.unregisterReceiver(this.m_LoaderSMSReceiver);
                  this.m_LoaderSMSReceiver = null;
            }

      }

      public void compassStart() {
            if (this.m_Compass == null) {
                  this.m_Compass = this.m_SensorManager.getDefaultSensor(2);
                  this.m_Orientation = this.m_SensorManager.getDefaultSensor(3);
                  this.m_SensorManager.registerListener(this, this.m_Orientation, 1);
                  this.m_SensorManager.registerListener(this, this.m_Compass, 1);
            }

      }

      public void compassStop() {
            if (this.m_Compass != null) {
                  this.m_SensorManager.unregisterListener(this, this.m_Compass);
                  this.m_SensorManager.unregisterListener(this, this.m_Orientation);
                  this.m_Compass = null;
            }

      }

      public int soundInit(int var1, boolean var2, int var3) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "soundInit");
            return this.m_SoundPlayer.init(var1, var2, var3);
      }

      public void soundStart() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "soundStart");
            this.m_SoundPlayer.start();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "soundStart done");
      }

      public void soundStop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "soundStop");
            this.m_SoundPlayer.stop();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "soundStop done");
      }

      public int recordAvailable() {
            return SoundRecord.available();
      }

      public int recordStart(int var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "recordStart");
            if (this.m_SoundRecord == null) {
                  this.m_SoundRecord = new SoundRecord();
                  return this.m_SoundRecord.start(var1);
            } else {
                  return 0;
            }
      }

      public int recordStop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "recordStop");
            int stop = 1;
            if (this.m_SoundRecord != null) {
                  stop = this.m_SoundRecord.stop();
                  this.m_SoundRecord = null;
            }

            return stop;
      }

      public String clipboardGet() {
            ClipboardManager var1 = (ClipboardManager)this.m_Loader.getSystemService(Context.CLIPBOARD_SERVICE);
            return var1 != null && var1.hasText() ? var1.getText().toString() : null;
      }

      public void clipboardSet(String var1) {
            ClipboardManager var2 = (ClipboardManager)this.m_Loader.getSystemService(Context.CLIPBOARD_SERVICE);
            if (var2 != null) {
                  var2.setText(var1);
            }

      }

      public boolean networkCheckStart() {
            if (this.m_NetworkCheckEnabled) {
                  return true;
            } else {
                  this.m_NetworkCheckEnabled = true;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "registerNetworkCheckReceiver");
                  this.m_Loader.registerReceiver(this.m_NetworkCheckReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                  return true;
            }
      }

      public boolean networkCheckStop() {
            if (!this.m_NetworkCheckEnabled) {
                  return true;
            } else {
                  this.m_NetworkCheckEnabled = false;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "unregisterNetworkCheckReceiver");
                  if (this.m_NetworkCheckReceiver != null) {
                        this.m_Loader.unregisterReceiver(this.m_NetworkCheckReceiver);
                  }

                  return true;
            }
      }

      public int getBatteryLevel() {
            return this.m_BatteryLevel;
      }

      public int getDeviceDpi(boolean var1) {
            DisplayMetrics var2 = this.m_Loader.getApplicationContext().getResources().getDisplayMetrics();
            if (var1) {
                  return var2.densityDpi;
            } else {
                  float var3 = (float)var2.widthPixels / var2.xdpi;
                  float var4 = (float)var2.heightPixels / var2.ydpi;
                  float var5 = (float)Math.sqrt((double)(var3 * var3 + var4 * var4));
                  float var6 = (float)Math.sqrt((double)(var2.widthPixels * var2.widthPixels + var2.heightPixels * var2.heightPixels));
                  return (int)(var6 / var5);
            }
      }

      public boolean chargerIsConnected() {
            return this.m_ChargerConnected;
      }

      private void doSuspend() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doSuspend");
            LoaderAPI.notifySuspendResumeListeners(new SuspendResumeEvent(SuspendResumeEvent.EventType.SUSPEND));
            this.m_MediaPlayerManager.doPause();
            this.m_VideoIsPaused = this.m_View.videoGetStatus() == 2;
            if (!this.m_VideoIsPaused) {
                  this.m_View.videoPause();
            }

            this.m_SoundPlayer.pause();
            if (this.m_SoundRecord != null) {
                  this.m_SoundRecord.stop();
            }

            if (this.m_BatteryLevelReceiverRegistered) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "unregisterReceiver");
                  if (this.m_BatteryLevelReceiver != null) {
                        this.m_Loader.unregisterReceiver(this.m_BatteryLevelReceiver);
                  }

                  this.m_BatteryLevelReceiverRegistered = false;
            }

            if (this.m_NetworkCheckEnabled) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "unregisterNetworkCheckReceiver");
                  if (this.m_NetworkCheckReceiver != null) {
                        this.m_Loader.unregisterReceiver(this.m_NetworkCheckReceiver);
                  }
            }

            if (this.m_Location != null) {
                  this.m_Location.locationStop();
            }

            if (this.m_Accelerometer != null) {
                  this.m_SensorManager.unregisterListener(this, this.m_Accelerometer);
            }

            if (this.m_Compass != null) {
                  this.m_SensorManager.unregisterListener(this, this.m_Compass);
                  this.m_SensorManager.unregisterListener(this, this.m_Orientation);
            }

            ++this.m_AppDoingInitTerm;
            this.m_View.glPause();
            --this.m_AppDoingInitTerm;
      }

      private void doResume() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doResume");
            ++this.m_AppDoingInitTerm;
            this.waitForView();
            this.m_View.glResume();
            --this.m_AppDoingInitTerm;
            if (this.m_Accelerometer != null) {
                  this.m_SensorManager.registerListener(this, this.m_Accelerometer, 1);
            }

            if (this.m_Compass != null) {
                  this.m_SensorManager.registerListener(this, this.m_Orientation, 1);
                  this.m_SensorManager.registerListener(this, this.m_Compass, 1);
            }

            if (this.m_Location != null) {
                  this.m_Location.locationStart(this.m_Loader);
            }

            if (!this.m_BatteryLevelReceiverRegistered) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "registerReceiver");
                  this.m_Loader.registerReceiver(this.m_BatteryLevelReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                  this.m_BatteryLevelReceiverRegistered = true;
            }

            if (this.m_NetworkCheckEnabled) {
                  this.m_Loader.registerReceiver(this.m_NetworkCheckReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }

            this.m_SoundPlayer.resume();
            this.m_MediaPlayerManager.doResume();
            if (!this.m_VideoIsPaused) {
                  this.m_View.videoResume();
            }

            if (this.m_SoundRecord != null) {
                  this.m_SoundRecord.start(-1);
            }

            this.m_ResumeInProgress = false;
            LoaderAPI.notifySuspendResumeListeners(new SuspendResumeEvent(SuspendResumeEvent.EventType.RESUME));
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doResume: done");
      }

      private void waitForView() {
            while(true) {
                  synchronized(this.m_View) {
                        if (this.m_Terminating || this.m_View.waitForSurface()) {
                              this.setViewNative(this.m_View);
                              return;
                        }

                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waitForSurface failed.. looping");
                  }
            }
      }

      private void glInit(int var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glInit");
            if (this.m_UseGL) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glInit skipped");
            } else {
                  this.m_UseGL = true;
                  ++this.m_AppDoingInitTerm;
                  if (!this.m_Stopped && !this.m_Terminating) {
                        synchronized(this.m_CreateView) {
                              this.m_Handler.post(this.m_CreateView);

                              try {
                                    this.m_CreateView.wait();
                              } catch (InterruptedException var5) {
                              }
                        }

                        this.waitForView();
                  }

                  this.m_View.glInit(var1);
                  --this.m_AppDoingInitTerm;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glInit done");
            }
      }

      private void glTerm() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm");
            if (!this.m_UseGL) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm skipped");
            } else {
                  ++this.m_AppDoingInitTerm;
                  this.m_View.glTerm();
                  this.m_UseGL = false;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm2");
                  if (!this.m_Stopped && !this.m_Terminating) {
                        synchronized(this.m_CreateView) {
                              this.m_Handler.post(this.m_CreateView);

                              try {
                                    this.m_CreateView.wait();
                              } catch (InterruptedException var4) {
                              }
                        }
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm3");
                  if (!this.m_Stopped) {
                        this.waitForView();
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm not waiting while paused");
                  }

                  --this.m_AppDoingInitTerm;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm done");
            }
      }

      private void glReInit() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glReInit");
            if (!this.m_UseGL) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glReInit skipped");
            } else {
                  ++this.m_AppDoingInitTerm;
                  this.m_View.glReInit();
                  --this.m_AppDoingInitTerm;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glReInit done");
            }
      }

      public void run() {
            this.waitForView();
            this.m_Started = true;
            String var1 = this.m_Loader.getApplicationInfo().nativeLibraryDir;
            this.runNative(this.m_FileRoot.getAbsolutePath(), this.m_Loader.getPackageResourcePath(), var1);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Native code done.  Shutting down");
            this.shuttingDown(false);
      }

      private String getPrivateExternalDir() {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                  return null;
            } else {
                  File var1 = this.m_Loader.getExternalFilesDir((String)null);
                  return var1 != null ? var1.getAbsolutePath() : null;
            }
      }

      private String getRstDir() {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                  return null;
            } else {
                  File var1 = Environment.getExternalStorageDirectory();
                  return var1 != null ? var1.getAbsolutePath() : null;
            }
      }

      private String getCacheDir() {
            File var1 = this.m_Loader.getCacheDir();
            return var1 != null ? var1.getAbsolutePath() : null;
      }

      private String getTmpDir() {
            File var1 = this.m_Loader.getExternalCacheDir();
            return var1 != null ? var1.getAbsolutePath() : null;
      }

      public boolean hasMultitouch() {
            PackageManager var1 = this.m_Loader.getPackageManager();
            boolean var2 = var1.hasSystemFeature("android.hardware.touchscreen.multitouch");
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "hasSystemFeature -> " + var2);
            return var2;
      }

      private void shuttingDown(boolean var1) {
            if (this.m_Terminating) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "shuttingDown (ignoring)");
            } else {
                  this.m_Started = false;
                  this.m_Terminating = true;
                  g_Singleton = null;
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "shuttingDown");
                  if (var1) {
                        this.shutdownNative();
                  }

                  this.smsStop();
                  this.accelStop();
                  LoaderAPI.notifySuspendResumeListeners(new SuspendResumeEvent(SuspendResumeEvent.EventType.SHUTDOWN));
                  if (!this.m_Loader.isFinishing()) {
                        if (this.m_BatteryLevelReceiverRegistered) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "unregisterReceiver");
                              if (this.m_BatteryLevelReceiver != null) {
                                    this.m_Loader.unregisterReceiver(this.m_BatteryLevelReceiver);
                              }

                              this.m_BatteryLevelReceiverRegistered = false;
                        }

                        this.networkCheckStop();
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "calling finish on activity");
                        this.m_Loader.finish();
                  }

            }
      }

      public void onDestroy() {
            this.shuttingDown(true);
            this.interrupt();

            try {
                  this.join();
            } catch (InterruptedException var2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "interrupt while joining LoaderThread");
            }

      }

      public void onLowMemory() {
            this.lowMemoryWarning();
      }

      public boolean locationStart() {
            if (this.m_Location != null) {
                  return false;
            } else {
                  this.m_Location = new LoaderLocation();
                  return this.m_Location.locationStart(this.m_Loader);
            }
      }

      public boolean locationStop() {
            if (this.m_Location == null) {
                  return false;
            } else {
                  boolean var1 = this.m_Location.locationStop();
                  this.m_Location = null;
                  return var1;
            }
      }

      public boolean locationGpsData() {
            return this.m_Location != null ? this.m_Location.locationGpsData() : false;
      }

      public String getDeviceModel() {
            return Build.MODEL;
      }

      public boolean telephonyManagerExists() {
            if (this.m_TelephonyManagerExistsKnown) {
                  return this.m_TelephonyManagerExists;
            } else {
                  boolean var1 = true;

                  try {
                        Class.forName("com.ideaworks3d.marmalade.TelephonyManagerProxy");
                  } catch (ClassNotFoundException var3) {
                        var1 = false;
                  }

                  this.m_TelephonyManagerExistsKnown = true;
                  this.m_TelephonyManagerExists = var1;
                  return var1;
            }
      }

      @Deprecated
      public String getTelephonyId() {
            return null;
      }

      public String getDeviceId() {
            boolean var1 = LoaderAPI.s3eConfigGet("AndroidTryAndroidIdFirst", 1) != 0;
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "getDeviceId() tryAndroidIdFirst" + var1);
            String var2;
            if (!var1) {
                  var2 = this.getTelephonyId();
                  if (var2 != null && var2 != "") {
                        return var2;
                  }
            }

            var2 = Secure.getString(this.m_Loader.getContentResolver(), "android_id");
            if (var2 != null && var2 != "9774d56d682e549c") {
                  return var2;
            } else {
                  String var3;
                  try {
                        var3 = Build.SERIAL;
                        if (var3 != null) {
                              return var3;
                        }
                  } catch (Exception var4) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Failed to get android.os.Build.SERIAL");
                  }

                  if (var1) {
                        var3 = this.getTelephonyId();
                        if (var3 != null && var3 != "") {
                              return var3;
                        }
                  }

                  return null;
            }
      }

      @Deprecated
      public String getDeviceIMSI() {
            return null;
      }
      @Deprecated
      public String getDeviceNumber() {
            return null;
      }
      public boolean getSilentMode() {
            AudioManager var1 = (AudioManager)this.m_Loader.getSystemService(Context.AUDIO_SERVICE);
            return var1.getRingerMode() != 2;
      }

      @SuppressLint("WrongConstant")
      public boolean launchBrowser(String var1) {
            try {
                  Uri var2 = Uri.parse(var1);
                  Intent var3 = new Intent();
                  var3.setData(var2);
                  if (!var1.startsWith("vfstore")) {
                        var3.setAction("android.intent.action.VIEW");
                  }

                  var3.addFlags(337641472);
                  this.m_Loader.startActivity(var3);
                  return true;
            } catch (ActivityNotFoundException var4) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "ERROR OSExec(url):" + var4.toString());
                  return false;
            }
      }

      @SuppressLint("WrongConstant")
      public boolean sendEmail(String var1, String var2, String var3) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "sendEmail");

            try {
                  String[] var4 = var1.split(",\\s*?");
                  Intent var5 = new Intent();
                  var5.setAction("android.intent.action.SEND");
                  var5.setType("text/xml");
                  var5.putExtra("android.intent.extra.EMAIL", var4);
                  var5.putExtra("android.intent.extra.SUBJECT", var2);
                  var5.putExtra("android.intent.extra.TEXT", var3);
                  var5.addFlags(337641472);
                  this.m_Loader.startActivity(var5);
                  return true;
            } catch (ActivityNotFoundException var6) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "ERROR OSExec(mailto):" + var6.toString());
                  return false;
            }
      }

      public boolean onTouchEvent(MotionEvent var1) {
            MultiTouch.onTouchEvent(this, var1);
            if (this.m_OnTouchWait > 0) {
                  synchronized(this.m_OnTouchWait) {
                        try {
                              this.m_OnTouchWait.wait((long)this.m_OnTouchWait);
                        } catch (InterruptedException var5) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onTouchInterrupted");
                        }
                  }
            }

            return true;
      }

      public int getNetworkType() {
            ConnectivityManager var1 = (ConnectivityManager)this.m_Loader.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo var2 = var1.getActiveNetworkInfo();
            return var2 != null && var2.isConnected() ? var2.getType() : -1;
      }

      public int getNetworkSubType() {
            ConnectivityManager var1 = (ConnectivityManager)this.m_Loader.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo var2 = var1.getActiveNetworkInfo();
            return var2 != null && var2.isConnected() ? var2.getSubtype() : -1;
      }

      public boolean acquireMulticastLock() {
            if (this.m_MulticastLock == null) {
                  WifiManager var1 = (WifiManager)this.m_Loader.getSystemService(Context.WIFI_SERVICE);

                  try {
                        this.m_MulticastLock = new LoaderThread.MulticastLockFacade(var1);
                  } catch (Exception var3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Could not create multicastLock");
                        return false;
                  }
            }

            if (this.m_MulticastLock != null) {
                  this.m_MulticastLock.acquire();
                  return this.m_MulticastLock.isHeld();
            } else {
                  return false;
            }
      }

      public boolean releaseMulticastLock() {
            if (this.m_MulticastLock != null) {
                  this.m_MulticastLock.release();
                  this.m_MulticastLock = null;
                  return true;
            } else {
                  return false;
            }
      }

      class MulticastLockFacade {
            private MulticastLock m_multiCastLockReal = null;

            public MulticastLockFacade(WifiManager var2) throws Exception {
                  this.m_multiCastLockReal = var2.createMulticastLock("Marmalade");
            }

            public boolean isHeld() {
                  if (this.m_multiCastLockReal != null) {
                        return this.m_multiCastLockReal.isHeld();
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "MulticastLock not supported");
                        return false;
                  }
            }

            public void release() {
                  if (this.m_multiCastLockReal != null) {
                        this.m_multiCastLockReal.release();
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "MulticastLock not supported");
                  }

            }

            public void acquire() {
                  if (this.m_multiCastLockReal != null) {
                        this.m_multiCastLockReal.acquire();
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "MulticastLock not supported");
                  }

            }
      }

      private class MediaPlayerManager {
            private final int m_NumAudioChannels = 16;
            private MediaPlayer[] m_MediaPlayer = new MediaPlayer[16];
            private LoaderThread.MediaPlayerManager.MediaPlayerListener[] m_MediaPlayerListener = new LoaderThread.MediaPlayerManager.MediaPlayerListener[16];
            private LoaderThread.AudioState[] m_AudioState = new LoaderThread.AudioState[16];
            private Boolean[] m_AudioIsPaused = new Boolean[16];
            private int[] m_AudioPlayRepeats = new int[16];
            private int[] m_AudioVolume = new int[16];

            public MediaPlayerManager() {
                  for(int var2 = 0; var2 < 16; ++var2) {
                        this.m_MediaPlayer[var2] = null;
                        this.m_MediaPlayerListener[var2] = new LoaderThread.MediaPlayerManager.MediaPlayerListener(var2);
                        this.m_AudioState[var2] = LoaderThread.AudioState.None;
                        this.m_AudioIsPaused[var2] = false;
                        this.m_AudioPlayRepeats[var2] = 0;
                        this.m_AudioVolume[var2] = 100;
                  }

            }

            public int audioGetNumChannels() {
                  return 16;
            }

            private void audioStopped(int var1) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", audioStopped");
                  LoaderThread.this.audioStoppedNotify(var1);
            }

            public int audioPlay(String var1, int var2, long var3, long var5, int var7) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "audioPlay: " + this.m_AudioState[var7] + ": " + var1 + " (" + var2 + ")");
                  this.audioStop(var7);
                  if (this.m_MediaPlayer[var7] == null) {
                        this.m_MediaPlayer[var7] = new MediaPlayer();
                        this.m_MediaPlayer[var7].setOnErrorListener(this.m_MediaPlayerListener[var7]);
                        this.m_MediaPlayer[var7].setOnCompletionListener(this.m_MediaPlayerListener[var7]);
                  }

                  try {
                        this.m_MediaPlayer[var7].reset();
                        this.audioChangeState(LoaderThread.AudioState.Idle, var7);
                        if (var5 > 0L) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var7 + ", Playing from zipfile: " + var1 + ", offset: " + var3 + ", size: " + var5);
                              File var15 = new File(var1);
                              ParcelFileDescriptor var16 = ParcelFileDescriptor.open(var15, 268435456);
                              AssetFileDescriptor var10 = new AssetFileDescriptor(var16, var3, var5);
                              this.m_MediaPlayer[var7].setDataSource(var10.getFileDescriptor(), var10.getStartOffset(), var10.getLength());
                              var10.close();
                              var16.close();
                        } else if (var1.indexOf("http://") == -1 && var1.indexOf("https://") == -1) {
                              try {
                                    FileInputStream var8 = new FileInputStream(var1);
                                    this.m_MediaPlayer[var7].setDataSource(var8.getFD());
                                    var8.close();
                              } catch (FileNotFoundException var12) {
                                    AssetFileDescriptor var9 = LoaderThread.this.m_Assets.openFd(var1);
                                    this.m_MediaPlayer[var7].setDataSource(var9.getFileDescriptor(), var9.getStartOffset(), var9.getLength());
                                    var9.close();
                              }
                        } else {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var7 + ", Playing from URL: " + var1);
                              this.m_MediaPlayer[var7].setDataSource(var1);
                        }

                        this.audioChangeState(LoaderThread.AudioState.Initialized, var7);
                        this.m_MediaPlayer[var7].prepare();
                        this.audioChangeState(LoaderThread.AudioState.Prepared, var7);
                  } catch (FileNotFoundException var13) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "FileNotFoundException: error playing audio file: " + var13);
                        this.audioChangeState(LoaderThread.AudioState.Error, var7);
                        var13.printStackTrace();
                        return -1;
                  } catch (IOException var14) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "IOException: error playing audio file: " + var14);
                        this.audioChangeState(LoaderThread.AudioState.Error, var7);
                        var14.printStackTrace();
                        return -2;
                  }

                  this.audioSetVolumeInternal(var7);
                  this.m_AudioPlayRepeats[var7] = var2;
                  this.m_MediaPlayer[var7].setLooping(this.m_AudioPlayRepeats[var7] == 0);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var7 + ", audioPlay: starting");

                  try {
                        this.m_MediaPlayer[var7].start();
                  } catch (IllegalStateException var11) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var7 + ", IllegalStateException: start(): error playing audio file: " + var11);
                        var11.printStackTrace();
                        return -2;
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var7 + ", audioPlay: started");
                  this.audioChangeState(LoaderThread.AudioState.Started, var7);
                  return 0;
            }

            public void doPause() {
                  for(int var1 = 0; var1 < 16; ++var1) {
                        this.m_AudioIsPaused[var1] = this.m_AudioState[var1] == LoaderThread.AudioState.Paused;
                        if (!this.m_AudioIsPaused[var1]) {
                              this.audioPause(var1);
                        }
                  }

            }

            public void doResume() {
                  for(int var1 = 0; var1 < 16; ++var1) {
                        if (!this.m_AudioIsPaused[var1]) {
                              this.audioResume(var1);
                        }
                  }

            }

            public int audioPause(int var1) {
                  if (this.m_AudioState[var1] != LoaderThread.AudioState.Started) {
                        return -1;
                  } else if (this.m_MediaPlayer[var1] == null) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", MediaPlayer.pause(): no MediaPlayer");
                        return -1;
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", audioPause: " + this.m_AudioState);

                        try {
                              this.m_MediaPlayer[var1].pause();
                              this.audioChangeState(LoaderThread.AudioState.Paused, var1);
                              return 0;
                        } catch (IllegalStateException var3) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", MediaPlayer.pause(): illegal state");
                              return -1;
                        }
                  }
            }

            public int audioResume(int var1) {
                  if (this.m_AudioState[var1] != LoaderThread.AudioState.Paused) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + " has not been resumed because it is not paused before.");
                        return -1;
                  } else if (this.m_MediaPlayer[var1] == null) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", MediaPlayer.start(): no MediaPlayer");
                        return -1;
                  } else {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", audioResume: " + this.m_AudioState[var1]);

                        try {
                              this.m_MediaPlayer[var1].start();
                              this.audioChangeState(LoaderThread.AudioState.Started, var1);
                              return 0;
                        } catch (IllegalStateException var3) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", MediaPlayer.start(): illegal state");
                              return -1;
                        }
                  }
            }

            public void audioStopAll() {
                  for(int var1 = 0; var1 < 16; ++var1) {
                        this.audioStop(var1);
                  }

            }

            public void audioStop(int var1) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Getting audio state for channel: " + var1);
                  LoaderThread.AudioState var2 = this.m_AudioState[var1];
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", audioStop: " + var2);
                  if (this.m_MediaPlayer[var1] != null && (var2 == LoaderThread.AudioState.Started || var2 == LoaderThread.AudioState.Paused || var2 == LoaderThread.AudioState.PlaybackCompleted)) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var1 + ", audioStop: stopping");

                        try {
                              this.m_MediaPlayer[var1].stop();
                              this.audioChangeState(LoaderThread.AudioState.Stopped, var1);
                        } catch (IllegalStateException var4) {
                        }

                        this.m_MediaPlayer[var1].reset();
                        this.audioChangeState(LoaderThread.AudioState.Idle, var1);
                        this.audioStopped(var1);
                  }

            }

            public boolean audioIsPlaying(int var1) {
                  return this.m_MediaPlayer[var1] != null && this.m_AudioState[var1] == LoaderThread.AudioState.Started;
            }

            public int audioGetStatus(int var1) {
                  switch(this.m_AudioState[var1]) {
                  case Started:
                        return 1;
                  case Paused:
                        return 2;
                  case Error:
                        return 3;
                  default:
                        return 0;
                  }
            }

            public int audioGetPosition(int var1) {
                  return this.m_AudioState[var1] != LoaderThread.AudioState.Started && this.m_AudioState[var1] != LoaderThread.AudioState.Paused ? 0 : this.m_MediaPlayer[var1].getCurrentPosition();
            }

            public int audioGetDuration(int var1) {
                  return this.m_MediaPlayer[var1] != null && this.m_AudioState[var1] != LoaderThread.AudioState.Error && this.m_AudioState[var1] != LoaderThread.AudioState.Idle && this.m_AudioState[var1] != LoaderThread.AudioState.Initialized ? this.m_MediaPlayer[var1].getDuration() : 0;
            }

            public void audioSetPosition(int var1, int var2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + var2 + ", audioSetPosition to: " + var1);
                  this.m_MediaPlayer[var2].seekTo(var1);
            }

            public void audioSetVolume(int var1, int var2) {
                  this.m_AudioVolume[var2] = var1;
                  this.audioSetVolumeInternal(var2);
            }

            private void audioSetVolumeInternal(int var1) {
                  if (this.m_MediaPlayer[var1] != null && this.m_AudioState[var1] != LoaderThread.AudioState.Error) {
                        float var2 = (float)this.m_AudioVolume[var1] / 100.0F;
                        this.m_MediaPlayer[var1].setVolume(var2, var2);
                  }
            }

            private void audioChangeState(LoaderThread.AudioState var1, int var2) {
                  this.m_AudioState[var2] = var1;
            }

            private class MediaPlayerListener implements OnErrorListener, OnCompletionListener {
                  int m_channel;

                  MediaPlayerListener(int var2) {
                        this.m_channel = var2;
                  }

                  public boolean onError(MediaPlayer var1, int var2, int var3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onError (" + var2 + ", " + var3 + "): " + MediaPlayerManager.this.m_AudioState);
                        MediaPlayerManager.this.audioChangeState(LoaderThread.AudioState.Error, this.m_channel);
                        MediaPlayerManager.this.m_MediaPlayer[this.m_channel].reset();
                        MediaPlayerManager.this.audioChangeState(LoaderThread.AudioState.Idle, this.m_channel);
                        MediaPlayerManager.this.audioStopped(this.m_channel);
                        return true;
                  }

                  public void onCompletion(MediaPlayer var1) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + this.m_channel + ", onCompletion: " + MediaPlayerManager.this.m_AudioState[this.m_channel]);
                        int var10002 = MediaPlayerManager.this.m_AudioPlayRepeats[this.m_channel]--;
                        if (MediaPlayerManager.this.m_AudioPlayRepeats[this.m_channel] == 0) {
                              MediaPlayerManager.this.audioChangeState(LoaderThread.AudioState.PlaybackCompleted, this.m_channel);
                              MediaPlayerManager.this.audioStop(this.m_channel);
                        } else {
                              try {
                                    MediaPlayerManager.this.m_MediaPlayer[this.m_channel].start();
                              } catch (IllegalStateException var3) {
                                    LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + this.m_channel + ", IllegalStateException: start(): error playing audio file: " + var3);
                                    var3.printStackTrace();
                                    return;
                              }

                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Audio channel: " + this.m_channel + ", audioPlay: started repeat (" + (MediaPlayerManager.this.m_AudioPlayRepeats[this.m_channel] - 1) + " left)");
                              MediaPlayerManager.this.audioChangeState(LoaderThread.AudioState.Started, this.m_channel);
                        }

                  }
            }
      }

      private static enum AudioState {
            None,
            Idle,
            Initialized,
            Stopped,
            Prepared,
            Started,
            Paused,
            PlaybackCompleted,
            Error;
      }
}
